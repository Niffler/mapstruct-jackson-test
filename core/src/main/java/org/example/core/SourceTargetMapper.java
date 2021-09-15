package org.example.core;

import org.example.client.Target;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SourceTargetMapper {

    SourceTargetMapper MAPPER = Mappers.getMapper(SourceTargetMapper.class);

    Target toTarget(Source s);

    Source toSource(Target t);
}
