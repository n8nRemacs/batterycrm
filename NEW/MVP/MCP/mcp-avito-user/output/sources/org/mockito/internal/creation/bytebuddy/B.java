package org.mockito.internal.creation.bytebuddy;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class B implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f421517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f421518c;

    public /* synthetic */ B(C c12, n nVar) {
        this.f421517b = c12;
        this.f421518c = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f421517b.f421520b.a(this.f421518c);
    }
}
