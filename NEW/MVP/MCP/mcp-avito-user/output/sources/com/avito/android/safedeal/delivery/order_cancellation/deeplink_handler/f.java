package com.avito.android.safedeal.delivery.order_cancellation.deeplink_handler;

import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.Navigation;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryOrderCancelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", Navigation.CONFIG, "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f256125l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f256126m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, String str) {
        super(2);
        this.f256125l = str;
        this.f256126m = dVar;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        bVar2.setCancelable(true);
        bVar2.setSubtitle(this.f256125l);
        bVar2.L3(this.f256126m.f256111f.getString(R.string.ok), new e(dialogInterface));
        return G0.f406611a;
    }
}
