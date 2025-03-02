package corr.ai.module.member.dal.mysql.config;

import corr.ai.framework.mybatis.core.mapper.BaseMapperX;
import corr.ai.module.member.dal.dataobject.config.MemberConfigDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分设置 Mapper
 *
 * @author QingX
 */
@Mapper
public interface MemberConfigMapper extends BaseMapperX<MemberConfigDO> {
}
