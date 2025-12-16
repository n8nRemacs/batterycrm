package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class n implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f360841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f360842c;

    public /* synthetic */ n(int i12, Runnable runnable) {
        this.f360841b = i12;
        this.f360842c = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f360841b) {
            case 0:
                this.f360842c.run();
                break;
            default:
                this.f360842c.run();
                break;
        }
        return null;
    }
}
