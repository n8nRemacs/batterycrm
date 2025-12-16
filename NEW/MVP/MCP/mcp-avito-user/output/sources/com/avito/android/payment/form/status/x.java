package com.avito.android.payment.form.status;

import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.SimpleUserDialog;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaymentStatusFormView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class x extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SimpleUserDialog f214453l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f214454m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(SimpleUserDialog simpleUserDialog, y yVar) {
        super(2);
        this.f214453l = simpleUserDialog;
        this.f214454m = yVar;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        bVar2.setCancelable(true);
        SimpleUserDialog simpleUserDialog = this.f214453l;
        bVar2.setTitle(simpleUserDialog.getTitle());
        bVar2.setSubtitle(simpleUserDialog.getMessage());
        y yVar = this.f214454m;
        bVar2.b(new u(yVar));
        bVar2.a(new v(yVar));
        bVar2.L3(yVar.f214455a.getContext().getString(R.string.ok), new w(yVar));
        return G0.f406611a;
    }
}
