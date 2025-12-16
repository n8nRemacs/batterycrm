package com.avito.android.mortgage.document_upload;

import android.content.DialogInterface;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DocumentUploadFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage.document_upload.u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32630u extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DocumentUploadFragment f199450l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f199451m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32630u(DocumentUploadFragment documentUploadFragment, DialogInterface dialogInterface) {
        super(0);
        this.f199450l = documentUploadFragment;
        this.f199451m = dialogInterface;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f199450l.f199028A0.b("android.permission.CAMERA");
        this.f199451m.dismiss();
        return G0.f406611a;
    }
}
