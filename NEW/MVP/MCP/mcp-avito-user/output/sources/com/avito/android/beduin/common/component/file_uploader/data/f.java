package com.avito.android.beduin.common.component.file_uploader.data;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class f implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f101244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.internal.observers.m f101245c;

    public /* synthetic */ f(io.reactivex.rxjava3.internal.observers.m mVar, int i12) {
        this.f101244b = i12;
        this.f101245c = mVar;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        io.reactivex.rxjava3.internal.observers.m mVar = this.f101245c;
        switch (this.f101244b) {
            case 0:
                int i12 = g.f101246d;
                DisposableHelper.a(mVar);
                break;
            default:
                int i13 = com.avito.android.publish.video_upload.e.f245544e;
                DisposableHelper.a(mVar);
                break;
        }
    }
}
