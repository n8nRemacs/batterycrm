package com.avito.android.cpx_promo.impl;

import Y41.l;
import android.os.Bundle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpxPromoFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c extends N implements l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f126939l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f126940m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f126941n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2, String str3) {
        super(1);
        this.f126939l = str;
        this.f126940m = str2;
        this.f126941n = str3;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("arg.context", this.f126939l);
        bundle2.putString("arg.item_id", this.f126940m);
        bundle2.putString("arg.current_flow", this.f126941n);
        return G0.f406611a;
    }
}
