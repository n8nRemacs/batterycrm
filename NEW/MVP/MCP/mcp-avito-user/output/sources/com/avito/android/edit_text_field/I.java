package com.avito.android.edit_text_field;

import android.content.DialogInterface;
import com.avito.android.lib.design.modal.a;
import com.avito.android.profile_management_core.edit_text_field.NotSavedAlertSettings;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditTextFieldView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class I extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ NotSavedAlertSettings f146920l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f146921m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(NotSavedAlertSettings notSavedAlertSettings, y yVar) {
        super(2);
        this.f146920l = notSavedAlertSettings;
        this.f146921m = yVar;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        bVar2.setButtonsOrientation(1);
        NotSavedAlertSettings notSavedAlertSettings = this.f146920l;
        bVar2.setTitle(notSavedAlertSettings.f226612b);
        bVar2.setSubtitle(notSavedAlertSettings.f226613c);
        y yVar = this.f146921m;
        bVar2.L3(notSavedAlertSettings.f226614d, new E(yVar, dialogInterface2));
        bVar2.M3(notSavedAlertSettings.f226615e, new F(yVar, dialogInterface2));
        bVar2.setCancelable(false);
        bVar2.setCloseButtonVisible(true);
        bVar2.setOnCloseClicked(new G(yVar, dialogInterface2));
        bVar2.b(new H(yVar));
        return G0.f406611a;
    }
}
