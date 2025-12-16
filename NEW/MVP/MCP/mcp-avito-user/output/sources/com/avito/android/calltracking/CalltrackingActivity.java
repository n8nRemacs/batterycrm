package com.avito.android.calltracking;

import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import cm.C27215a;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.lib.design.tab_layout.c;
import com.avito.android.util.P5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CalltrackingActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/calltracking/CalltrackingActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/K;", "Lcom/avito/android/calltracking/di/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CalltrackingActivity extends com.avito.android.ui.activity.a implements com.avito.android.K<com.avito.android.calltracking.di.a>, InterfaceC28477j.a {

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final a f113549q = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public C27215a f113550m;

    /* renamed from: n, reason: collision with root package name */
    public AvitoTabLayout f113551n;

    /* renamed from: o, reason: collision with root package name */
    public ViewPager f113552o;

    /* renamed from: p, reason: collision with root package name */
    public com.avito.android.calltracking.di.a f113553p;

    /* compiled from: CalltrackingActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calltracking/CalltrackingActivity$a;", "", "<init>", "()V", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_calltracking;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.calltracking.di.a aVarA = com.avito.android.calltracking.di.p.a().a(this, getResources());
        this.f113553p = aVarA;
        aVarA.Km(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        View viewFindViewById = findViewById(R.id.calltracking_root);
        M81.c cVar = new M81.c(viewFindViewById, null, false, 4, null);
        cVar.f10415d.setTitle(R.string.calltracking_screen_title);
        cVar.g5(R.drawable.ic_back_24, null);
        P5.g(cVar.f10415d).t0(new C29274b(this));
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.tab_layout);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.tab_layout.AvitoTabLayout");
        }
        this.f113551n = (AvitoTabLayout) viewFindViewById2;
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.view_pager);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
        }
        ViewPager viewPager = (ViewPager) viewFindViewById3;
        this.f113552o = viewPager;
        AvitoTabLayout avitoTabLayout = this.f113551n;
        if (avitoTabLayout == null) {
            avitoTabLayout = null;
        }
        viewPager.c(new c.l(avitoTabLayout));
        AvitoTabLayout avitoTabLayout2 = this.f113551n;
        if (avitoTabLayout2 == null) {
            avitoTabLayout2 = null;
        }
        ViewPager viewPager2 = this.f113552o;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        avitoTabLayout2.a(new c.n(viewPager2));
        AvitoTabLayout avitoTabLayout3 = this.f113551n;
        if (avitoTabLayout3 == null) {
            avitoTabLayout3 = null;
        }
        C27215a c27215a = this.f113550m;
        if (c27215a == null) {
            c27215a = null;
        }
        com.avito.android.lib.deprecated_design.tab.l.d(avitoTabLayout3, c27215a);
        ViewPager viewPager3 = this.f113552o;
        (viewPager3 != null ? viewPager3 : null).setAdapter(new C29273a(getSupportFragmentManager(), 1));
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        com.avito.android.calltracking.di.a aVar = this.f113553p;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }
}
