package com.avito.android.mortgage.document_upload;

import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DocumentUploadFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage.document_upload.w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32632w extends kotlin.jvm.internal.N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f199453l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DocumentUploadFragment f199454m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32632w(boolean z12, DocumentUploadFragment documentUploadFragment) {
        super(2);
        this.f199453l = z12;
        this.f199454m = documentUploadFragment;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        bVar2.setTitle(R.string.mortgage_camera_permission_dialog_title);
        bVar2.setSubtitle(R.string.mortgage_camera_permission_dialog_subtitle);
        bVar2.setButtonsOrientation(1);
        boolean z12 = this.f199453l;
        DocumentUploadFragment documentUploadFragment = this.f199454m;
        if (z12) {
            bVar2.O3(R.string.mortgage_camera_permission_dialog_settings_button, new C32629t(documentUploadFragment, dialogInterface2));
        } else {
            bVar2.O3(R.string.mortgage_camera_permission_dialog_grant_button, new C32630u(documentUploadFragment, dialogInterface2));
        }
        bVar2.T3(R.string.mortgage_camera_permission_dialog_deny_button, new C32631v(dialogInterface2));
        return G0.f406611a;
    }
}
