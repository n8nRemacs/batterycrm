package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class o implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f360843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f360844c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f360845d;

    public /* synthetic */ o(Runnable runnable, Object obj, int i12) {
        this.f360843b = i12;
        this.f360844c = runnable;
        this.f360845d = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f360843b) {
            case 0:
                this.f360844c.run();
                break;
            default:
                this.f360844c.run();
                break;
        }
        return this.f360845d;
    }
}
