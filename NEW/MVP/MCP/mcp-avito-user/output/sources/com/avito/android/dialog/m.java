package com.avito.android.dialog;

import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.UserDialog;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DialogPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class m extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserDialog f144784l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Action f144785m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n f144786n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Action f144787o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.s<DeepLink> f144788p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(UserDialog userDialog, Action action, n nVar, Action action2, io.reactivex.rxjava3.core.s sVar) {
        super(2);
        this.f144784l = userDialog;
        this.f144785m = action;
        this.f144786n = nVar;
        this.f144787o = action2;
        this.f144788p = sVar;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        bVar2.setCancelable(true);
        UserDialog userDialog = this.f144784l;
        bVar2.setTitle(userDialog.getTitle());
        bVar2.setSubtitle(userDialog.getMessage());
        bVar2.setButtonsOrientation(1);
        Action action = this.f144785m;
        String title = action.getTitle();
        if (title.length() <= 0) {
            title = null;
        }
        n nVar = this.f144786n;
        if (title == null) {
            title = nVar.f144789a.getString(R.string.ok);
        }
        io.reactivex.rxjava3.core.s<DeepLink> sVar = this.f144788p;
        bVar2.L3(title, new k(dialogInterface2, sVar, action));
        Action action2 = this.f144787o;
        String title2 = action2.getTitle();
        String string = title2.length() > 0 ? title2 : null;
        if (string == null) {
            string = nVar.f144789a.getString(R.string.cancel);
        }
        bVar2.M3(string, new l(dialogInterface2, sVar, action2));
        return G0.f406611a;
    }
}
