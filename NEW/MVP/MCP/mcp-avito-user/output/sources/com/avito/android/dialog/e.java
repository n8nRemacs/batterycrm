package com.avito.android.dialog;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class e implements l41.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.modal.a f144766b;

    public /* synthetic */ e(com.avito.android.lib.design.modal.a aVar, int i12) {
        this.f144765a = i12;
        this.f144766b = aVar;
    }

    @Override // l41.f
    public final void cancel() {
        switch (this.f144765a) {
            case 0:
                this.f144766b.dismiss();
                break;
            default:
                this.f144766b.dismiss();
                break;
        }
    }
}
