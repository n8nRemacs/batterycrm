package com.avito.android.publish.uploading_dialog;

import Y41.p;
import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UploadingErrorFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UploadingErrorFragment f245509l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(UploadingErrorFragment uploadingErrorFragment) {
        super(2);
        this.f245509l = uploadingErrorFragment;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        bVar2.setTitle(R.string.uploading_error_title);
        bVar2.setButtonsOrientation(1);
        UploadingErrorFragment uploadingErrorFragment = this.f245509l;
        bVar2.O3(R.string.uploading_error_retry_button_text, new b(uploadingErrorFragment));
        bVar2.T3(R.string.uploading_error_skip_button_text, new c(uploadingErrorFragment));
        bVar2.setCancelable(false);
        return G0.f406611a;
    }
}
