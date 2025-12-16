package com.avito.android.safedeal.delivery.order_cancellation.deeplink_handler;

import android.content.Context;
import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.Navigation;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryOrderCancelDialogNavigator.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", Navigation.CONFIG, "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class n extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f256146l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f256147m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f256148n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, Y41.a<G0> aVar, Y41.a<G0> aVar2) {
        super(2);
        this.f256146l = context;
        this.f256147m = aVar;
        this.f256148n = aVar2;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        Context context = this.f256146l;
        bVar2.setSubtitle(context.getString(R.string.dialog_cancel_delivery_order_message));
        bVar2.L3(context.getString(R.string.yes), new l(this.f256147m, dialogInterface2));
        bVar2.M3(context.getString(R.string.no), new m(this.f256148n, dialogInterface2));
        return G0.f406611a;
    }
}
