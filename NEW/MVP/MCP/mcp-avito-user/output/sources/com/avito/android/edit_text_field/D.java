package com.avito.android.edit_text_field;

import android.content.DialogInterface;
import com.avito.android.lib.design.modal.a;
import com.avito.android.profile_management_core.edit_text_field.FormattedAlertSettings;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditTextFieldView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class D extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FormattedAlertSettings f146882l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f146883m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(FormattedAlertSettings formattedAlertSettings, y yVar) {
        super(2);
        this.f146882l = formattedAlertSettings;
        this.f146883m = yVar;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        bVar2.setButtonsOrientation(1);
        FormattedAlertSettings formattedAlertSettings = this.f146882l;
        bVar2.setTitle(formattedAlertSettings.f226609b);
        y yVar = this.f146883m;
        bVar2.setSubtitle(yVar.f147040f.c(yVar.f147035a.getContext(), formattedAlertSettings.f226610c));
        bVar2.L3(formattedAlertSettings.f226611d, new B(formattedAlertSettings, dialogInterface, yVar));
        bVar2.setCancelable(false);
        bVar2.b(new C(yVar));
        return G0.f406611a;
    }
}
