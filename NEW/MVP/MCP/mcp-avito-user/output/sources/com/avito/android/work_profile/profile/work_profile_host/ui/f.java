package com.avito.android.work_profile.profile.work_profile_host.ui;

import Y41.l;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rQ0.AbstractC47586a;

/* compiled from: WorkProfileHostRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/work_profile_host/ui/f;", "", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<AbstractC47586a, G0> f331315a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.work_profile.profile.work_profile_host.ui.a f331316b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.tab_layout.c f331317c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ViewPager2 f331318d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public e f331319e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C42670a f331320f;

    /* compiled from: WorkProfileHostRenderer.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f331321l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewGroup viewGroup) {
            super(0);
            this.f331321l = viewGroup;
        }

        @Override // Y41.a
        public final View invoke() {
            View viewFindViewById = this.f331321l.findViewById(R.id.content_container);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@k ViewGroup viewGroup, @k l<? super AbstractC47586a, G0> lVar, @k com.avito.android.work_profile.profile.work_profile_host.ui.a aVar, @k Y41.a<G0> aVar2) {
        this.f331315a = lVar;
        this.f331316b = aVar;
        View viewFindViewById = viewGroup.findViewById(R.id.tabs_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.tab_layout.TabLayout");
        }
        com.avito.android.lib.design.tab_layout.c cVar = (com.avito.android.lib.design.tab_layout.c) viewFindViewById;
        this.f331317c = cVar;
        View viewFindViewById2 = viewGroup.findViewById(R.id.view_pager);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        }
        ViewPager2 viewPager2 = (ViewPager2) viewFindViewById2;
        this.f331318d = viewPager2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.progress_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f331320f = new C42670a((ViewGroup) viewFindViewById3, new a(viewGroup), 0, 4, null);
        View viewFindViewById4 = viewGroup.findViewById(R.id.toolbar);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        ((Toolbar) viewFindViewById4).setNavigationOnClickListener(new i(13, aVar2));
        viewPager2.setAdapter(aVar);
        com.avito.android.lib.design.tab_layout.util.b.b(viewPager2, cVar);
        viewPager2.setUserInputEnabled(false);
        viewPager2.setOffscreenPageLimit(2);
    }
}
