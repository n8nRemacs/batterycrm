package com.avito.android.vas_planning;

import android.os.Bundle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VasPlanningFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f322243l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f322244m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f322245n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f322246o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2, String str3, boolean z12) {
        super(1);
        this.f322243l = str;
        this.f322244m = str2;
        this.f322245n = str3;
        this.f322246o = z12;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        bundle.putParcelable("argument_id_key", new VasPlanningFragmentArgument(this.f322243l, this.f322244m, this.f322245n, this.f322246o));
        return G0.f406611a;
    }
}
