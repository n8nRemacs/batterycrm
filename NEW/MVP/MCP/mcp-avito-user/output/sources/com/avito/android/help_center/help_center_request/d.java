package com.avito.android.help_center.help_center_request;

import android.os.Bundle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HelpCenterRequestFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f161764l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f161765m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f161766n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, String str3) {
        super(1);
        this.f161764l = str;
        this.f161765m = str2;
        this.f161766n = str3;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("key_theme", this.f161764l);
        bundle2.putString("key_advertisement_id", this.f161765m);
        bundle2.putString("key_context_id", this.f161766n);
        return G0.f406611a;
    }
}
