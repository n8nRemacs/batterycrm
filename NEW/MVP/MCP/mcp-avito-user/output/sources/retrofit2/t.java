package retrofit2;

import java.lang.reflect.Array;

/* compiled from: ParameterHandler.java */
/* loaded from: classes9.dex */
class t extends u<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f430020a;

    public t(u uVar) {
        this.f430020a = uVar;
    }

    @Override // retrofit2.u
    public final void a(w wVar, @I41.h Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i12 = 0; i12 < length; i12++) {
            this.f430020a.a(wVar, Array.get(obj, i12));
        }
    }
}
