package com.avito.android.profile.pro.impl.screen.item.beduin;

import Dc0.h;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import iT.InterfaceC41342b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileTabBeduinItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/beduin/a;", "LTV0/b;", "Lcom/avito/android/profile/pro/impl/screen/item/beduin/c;", "LDc0/h;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<c, h> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.lib.beduin_v2.feature.item.b f223066a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f223067b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ZS.b f223068c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC41342b f223069d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.konveyor.util.b f223070e = com.avito.android.actions_sheet.a.r(com.avito.konveyor.util.c.f338562a);

    /* renamed from: f, reason: collision with root package name */
    @k
    public final g.a<d> f223071f = new g.a<>(R.layout.item_profile_tab_beduin, new C6749a());

    /* compiled from: ProfileTabBeduinItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile/pro/impl/screen/item/beduin/d;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile/pro/impl/screen/item/beduin/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile.pro.impl.screen.item.beduin.a$a, reason: collision with other inner class name */
    public static final class C6749a extends N implements p<ViewGroup, View, d> {
        public C6749a() {
            super(2);
        }

        @Override // Y41.p
        public final d invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            a aVar = a.this;
            return new d(view2, aVar.f223067b, aVar.f223066a, aVar.f223068c, aVar.f223069d);
        }
    }

    @Inject
    public a(@k com.avito.android.lib.beduin_v2.feature.item.b bVar, @k ScreenPerformanceTracker screenPerformanceTracker, @k ZS.b bVar2, @k InterfaceC41342b interfaceC41342b) {
        this.f223066a = bVar;
        this.f223067b = screenPerformanceTracker;
        this.f223068c = bVar2;
        this.f223069d = interfaceC41342b;
    }

    @Override // TV0.b
    @k
    public final TV0.d<c, h> a() {
        return this.f223070e;
    }

    @Override // TV0.b
    @k
    public final g.a<d> b() {
        return this.f223071f;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof h;
    }
}
