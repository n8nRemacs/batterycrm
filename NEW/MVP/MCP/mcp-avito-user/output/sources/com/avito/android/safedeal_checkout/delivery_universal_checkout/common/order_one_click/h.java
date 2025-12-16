package com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click;

import Y41.p;
import android.content.DialogInterface;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.UserDialog;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryOrderRealOneClickDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", Navigation.CONFIG, "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserDialog f256948l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f256949m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a f256950n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(UserDialog userDialog, String str, a aVar) {
        super(2);
        this.f256948l = userDialog;
        this.f256949m = str;
        this.f256950n = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        UserDialog userDialog = this.f256948l;
        bVar2.setCancelable(userDialog.getCancelable());
        bVar2.setSubtitle(userDialog.getMessage());
        bVar2.L3(this.f256949m, new f(dialogInterface));
        bVar2.b(new g(this.f256950n));
        return G0.f406611a;
    }
}
