package com.avito.android.barcode_scanner_impl.presentation.barcodescanner;

import Y41.p;
import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BarcodeScannerFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h extends N implements p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BarcodeScannerFragment f98958l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BarcodeScannerFragment barcodeScannerFragment) {
        super(2);
        this.f98958l = barcodeScannerFragment;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        bVar2.setTitle(R.string.camera_permission_dialog_title);
        bVar2.setSubtitle(R.string.camera_permission_dialog_text);
        BarcodeScannerFragment barcodeScannerFragment = this.f98958l;
        bVar2.O3(R.string.camera_permission_positive_button, new f(barcodeScannerFragment, dialogInterface2));
        bVar2.T3(R.string.camera_permission_negative_button, new g(barcodeScannerFragment, dialogInterface2));
        return G0.f406611a;
    }
}
