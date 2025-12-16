package kotlin.jvm.internal;

import java.util.Objects;
import kotlin.InterfaceC42733c0;

/* compiled from: MutablePropertyReference1Impl.java */
/* loaded from: classes8.dex */
public class Y extends X {
    public Y(kotlin.reflect.d dVar, String str, String str2) {
        super(AbstractC42817q.NO_RECEIVER, ((InterfaceC42819t) dVar).f(), str, str2, !Objects.nonNull(dVar) ? 1 : 0);
    }

    public void e(Object obj, Object obj2) {
        c().call(obj, obj2);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    @InterfaceC42733c0
    public Y(Class cls, String str, String str2, int i12) {
        super(AbstractC42817q.NO_RECEIVER, cls, str, str2, i12);
    }
}
