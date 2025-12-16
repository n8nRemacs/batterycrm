package CU0;

import Y61.k;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.m;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: StatusCodeAppender.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LCU0/g;", "", "a", "serializer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public interface g {

    /* compiled from: StatusCodeAppender.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCU0/g$a;", "", "<init>", "()V", "serializer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: StatusCodeAppender.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        @k
        public static A a(@k A a12, @k String str, @k C36272i c36272i) {
            return A.t(a12, new m((Map<String, ? extends com.avito.beduin.v2.engine.field.d>) P0.l(a12.f336778b.f336870a, new Q("resolvedStatus", c36272i.e(str)))), null, 2);
        }
    }
}
