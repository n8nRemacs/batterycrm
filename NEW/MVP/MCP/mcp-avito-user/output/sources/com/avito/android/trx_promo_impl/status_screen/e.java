package com.avito.android.trx_promo_impl.status_screen;

import Y41.l;
import android.os.Bundle;
import com.avito.android.trx_promo_public.data.TrxPromoStatus;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TrxPromoStatusFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f304445l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f304446m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ TrxPromoStatus f304447n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, boolean z12, TrxPromoStatus trxPromoStatus) {
        super(1);
        this.f304445l = str;
        this.f304446m = z12;
        this.f304447n = trxPromoStatus;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("key_trx_promo_status_context", this.f304445l);
        bundle2.putBoolean("key_trx_promo_status_closable", this.f304446m);
        bundle2.putParcelable("key_trx_promo_status_status", this.f304447n);
        return G0.f406611a;
    }
}
