package com.avito.android.extended_profile_adverts;

import android.os.Bundle;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileAdvertsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class a extends N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f150562l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f150563m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f150564n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f150565o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Screen f150566p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f150567q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f150568r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f150569s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f150570t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ SearchParams f150571u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, boolean z12, String str3, Screen screen, boolean z13, String str4, String str5, String str6, SearchParams searchParams) {
        super(1);
        this.f150562l = str;
        this.f150563m = str2;
        this.f150564n = z12;
        this.f150565o = str3;
        this.f150566p = screen;
        this.f150567q = z13;
        this.f150568r = str4;
        this.f150569s = str5;
        this.f150570t = str6;
        this.f150571u = searchParams;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("user_key", this.f150562l);
        bundle2.putString("shortcut", this.f150563m);
        bundle2.putBoolean("useSearchRequest", this.f150564n);
        bundle2.putString(ChannelContext.Item.PLACEHOLDER, this.f150565o);
        bundle2.putParcelable("screen", this.f150566p);
        bundle2.putBoolean("sub_component", this.f150567q);
        bundle2.putString("context_id", this.f150568r);
        bundle2.putString("external_disclaimer", this.f150569s);
        bundle2.putString("profile_session", this.f150570t);
        bundle2.putParcelable("search_params", this.f150571u);
        return G0.f406611a;
    }
}
