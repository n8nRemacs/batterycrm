package org.mockito.internal.util.reflection;

import i81.InterfaceC41245e;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class i implements InterfaceC41245e.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f421766b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object[] f421767c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f421768d;

    public /* synthetic */ i(MethodHandle methodHandle, Object[] objArr, AtomicBoolean atomicBoolean) {
        this.f421767c = objArr;
        this.f421768d = atomicBoolean;
    }

    @Override // i81.InterfaceC41245e.a
    public final Object newInstance() {
        switch (this.f421766b) {
            case 0:
                try {
                    return j.f421771e.b();
                } catch (Throwable th2) {
                    ((AtomicBoolean) this.f421768d).set(true);
                    return th2;
                }
            default:
                return ((Constructor) this.f421768d).newInstance(this.f421767c);
        }
    }

    public /* synthetic */ i(Constructor constructor, Object[] objArr) {
        this.f421768d = constructor;
        this.f421767c = objArr;
    }
}
