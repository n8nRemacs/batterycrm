package io.noties.markwon;

import j.N;
import j.P;
import java.util.HashMap;

/* compiled from: RenderPropsImpl.java */
/* loaded from: classes8.dex */
class z implements y {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f401940a = new HashMap(3);

    @Override // io.noties.markwon.y
    public final <T> void a(@N v<T> vVar, @P T t12) {
        HashMap map = this.f401940a;
        if (t12 == null) {
            map.remove(vVar);
        } else {
            map.put(vVar, t12);
        }
    }

    @Override // io.noties.markwon.y
    @P
    public final <T> T b(@N v<T> vVar) {
        return (T) this.f401940a.get(vVar);
    }

    @Override // io.noties.markwon.y
    @N
    public final Object get() {
        v<Boolean> vVar = io.noties.markwon.image.h.f401912b;
        Boolean bool = Boolean.FALSE;
        Object obj = this.f401940a.get(vVar);
        return obj != null ? obj : bool;
    }
}
