package com.avito.android.authorization.complete_registration;

import android.os.Bundle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CompleteRegistrationFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f93409l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f93410m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f93411n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2, boolean z12) {
        super(1);
        this.f93409l = str;
        this.f93410m = str2;
        this.f93411n = z12;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("complete_reg.login", this.f93409l);
        bundle2.putString("complete_reg.hash", this.f93410m);
        bundle2.putBoolean("opened_by_register_link", this.f93411n);
        return G0.f406611a;
    }
}
