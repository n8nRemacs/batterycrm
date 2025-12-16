package com.avito.android.seller_coach.hints_dialog.view;

import Y41.p;
import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HintItemsDialog.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f267585l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f267586m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f267587n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, String str2, c cVar) {
        super(2);
        this.f267585l = str;
        this.f267586m = str2;
        this.f267587n = cVar;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        bVar2.setTitle(this.f267585l);
        bVar2.setButtonsOrientation(1);
        c cVar = this.f267587n;
        bVar2.M3(this.f267586m, new d(cVar, dialogInterface2));
        bVar2.setCancelable(true);
        bVar2.L3(cVar.getContext().getResources().getString(R.string.seller_coach_hints_dialog_cancel), new e(dialogInterface2));
        return G0.f406611a;
    }
}
