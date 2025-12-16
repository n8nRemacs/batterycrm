package com.avito.android.large_transaction;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.N;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f175037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f175038c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(int i12, Y41.a aVar) {
        this.f175037b = i12;
        this.f175038c = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r0v4, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f175037b) {
            case 0:
                return (String) this.f175038c.invoke();
            default:
                return this.f175038c.invoke();
        }
    }
}
