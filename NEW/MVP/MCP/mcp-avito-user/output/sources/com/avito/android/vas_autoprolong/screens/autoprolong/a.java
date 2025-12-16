package com.avito.android.vas_autoprolong.screens.autoprolong;

import Y41.l;
import android.os.Bundle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoprolongFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class a extends N implements l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f319471l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f319472m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j12, String str) {
        super(1);
        this.f319471l = j12;
        this.f319472m = str;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putLong("item_id", this.f319471l);
        bundle2.putString("checkout_context", this.f319472m);
        return G0.f406611a;
    }
}
