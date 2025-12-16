package kotlin.jvm.internal;

import kotlin.InterfaceC42733c0;

/* compiled from: PropertyReference1Impl.java */
/* loaded from: classes8.dex */
public class h0 extends g0 {
    public h0(kotlin.reflect.h hVar, String str, String str2) {
        super(AbstractC42817q.NO_RECEIVER, ((InterfaceC42819t) hVar).f(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    @InterfaceC42733c0
    public h0(Class cls, String str, String str2, int i12) {
        super(AbstractC42817q.NO_RECEIVER, cls, str, str2, i12);
    }

    @InterfaceC42733c0
    public h0(Object obj, Class cls, String str, String str2, int i12) {
        super(obj, cls, str, str2, i12);
    }
}
