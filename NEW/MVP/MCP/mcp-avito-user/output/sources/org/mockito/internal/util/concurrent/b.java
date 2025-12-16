package org.mockito.internal.util.concurrent;

import org.mockito.internal.util.concurrent.c;

/* compiled from: DetachedThreadLocal.java */
/* loaded from: classes7.dex */
class b extends c.f<Thread, Object> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DetachedThreadLocal f421743d;

    public b(DetachedThreadLocal detachedThreadLocal) {
        this.f421743d = detachedThreadLocal;
    }

    @Override // org.mockito.internal.util.concurrent.c
    public final void a(Object obj) {
        this.f421743d.getClass();
    }
}
