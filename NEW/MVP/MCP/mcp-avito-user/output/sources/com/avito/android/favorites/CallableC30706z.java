package com.avito.android.favorites;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.favorites.z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class CallableC30706z implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f157630b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f157631c;

    public /* synthetic */ CallableC30706z(A a12, int i12) {
        this.f157630b = i12;
        this.f157631c = a12;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f157630b) {
            case 0:
                return this.f157631c.f156183b.i();
            case 1:
                this.f157631c.f156183b.wipe();
                return kotlin.G0.f406611a;
            default:
                return this.f157631c.f156183b.j();
        }
    }
}
