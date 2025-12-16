package com.avito.android.freemium.screens.rules;

import android.os.Bundle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FreemiumRulesFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class a extends N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f159069l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f159070m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f159071n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j12, String str, String str2) {
        super(1);
        this.f159069l = j12;
        this.f159070m = str;
        this.f159071n = str2;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putLong("itemId", this.f159069l);
        bundle2.putString("checkoutContext", this.f159070m);
        bundle2.putString("currentFlow", this.f159071n);
        return G0.f406611a;
    }
}
