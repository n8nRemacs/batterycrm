package com.avito.android.profile.pro.impl.screen.item.dashboard;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ProfileProDashboardView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/dashboard/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/dashboard/f;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f223087h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final View f223088b;

    /* renamed from: c, reason: collision with root package name */
    public final View f223089c;

    /* renamed from: d, reason: collision with root package name */
    public final View f223090d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f223091e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f223092f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C90.a f223093g;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.v_content);
        this.f223088b = viewFindViewById;
        this.f223089c = view.findViewById(R.id.v_loading);
        this.f223090d = view.findViewById(R.id.v_empty);
        this.f223091e = (TextView) view.findViewById(R.id.tv_dashboard_empty);
        this.f223092f = (String) C42745f0.E(C43066x.e0(view.getContext().getResources().getString(R.string.profile_pro_dashboard_empty_description), new char[]{' '}));
        this.f223093g = new C90.a(viewFindViewById);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // com.avito.android.profile.pro.impl.screen.item.dashboard.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dq(@Y61.k com.avito.android.profile.pro.impl.screen.item.dashboard.ProfileProDashboardItem r13, @Y61.k Y41.l<? super D90.a, kotlin.G0> r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.pro.impl.screen.item.dashboard.g.dq(com.avito.android.profile.pro.impl.screen.item.dashboard.ProfileProDashboardItem, Y41.l):void");
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
    }
}
