package com.avito.android.advertising.loaders.beduin;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.advertising.loaders.beduin.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C28349c implements HV0.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f88112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.internal.observers.y f88113c;

    public /* synthetic */ C28349c(io.reactivex.rxjava3.internal.observers.y yVar, int i12) {
        this.f88112b = i12;
        this.f88113c = yVar;
    }

    @Override // HV0.c
    public final void dispose() {
        switch (this.f88112b) {
            case 0:
                DisposableHelper.a(this.f88113c);
                break;
            default:
                DisposableHelper.a(this.f88113c);
                break;
        }
    }
}
