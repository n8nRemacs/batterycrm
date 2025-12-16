package org.mockito.internal.creation.bytebuddy;

import i81.InterfaceC41245e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class k implements InterfaceC41245e.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f421540b;

    @Override // i81.InterfaceC41245e.b
    public final Object d(InterfaceC41245e.a aVar) {
        Boolean bool = Boolean.TRUE;
        ThreadLocal<Boolean> threadLocal = this.f421540b.f421546d;
        threadLocal.set(bool);
        try {
            return aVar.newInstance();
        } finally {
            threadLocal.set(Boolean.FALSE);
        }
    }
}
