package com.avito.android.vas_performance.ui.applied_services;

import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AppliedServicesDialogFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AppliedServicesDialogFragment f321422l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AppliedServicesDialogFragment appliedServicesDialogFragment) {
        super(1);
        this.f321422l = appliedServicesDialogFragment;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) this.f321422l.getDialog();
        PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
        ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
        f.c.f125255c.getClass();
        com.avito.android.component.toast.c.d(cVar, dVar, printableTextF, null, f.c.a.b(), 0, toastBarPosition, 942);
        return G0.f406611a;
    }
}
