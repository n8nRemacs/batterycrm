package com.avito.android.work_profile.profile.cvs.ui;

import Y41.l;
import Y61.k;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.str_seller_orders.orders_seller.d;
import com.avito.konveyor.adapter.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mQ0.AbstractC44002a;

/* compiled from: CvsRenderer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/cvs/ui/c;", "", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f331088a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j f331089b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<AbstractC44002a, G0> f331090c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.progress_overlay.l f331091d;

    /* renamed from: e, reason: collision with root package name */
    public final SwipeRefreshLayout f331092e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f331093f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f331094g;

    /* renamed from: h, reason: collision with root package name */
    public final Button f331095h;

    /* renamed from: i, reason: collision with root package name */
    public final Button f331096i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayout f331097j;

    /* compiled from: CvsRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            c.this.f331090c.invoke(AbstractC44002a.d.f414500a);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k ViewGroup viewGroup, @k com.avito.konveyor.adapter.a aVar, @k j jVar, @k l<? super AbstractC44002a, G0> lVar) {
        this.f331088a = aVar;
        this.f331089b = jVar;
        this.f331090c = lVar;
        com.avito.android.progress_overlay.l lVar2 = new com.avito.android.progress_overlay.l((ViewGroup) viewGroup.findViewById(R.id.progress_root), 0, null, 0, 0, 30, null);
        lVar2.f231600j = new a();
        this.f331091d = lVar2;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewGroup.findViewById(R.id.swipe_refresh_layout);
        swipeRefreshLayout.setOnRefreshListener(new d(this, 15));
        this.f331092e = swipeRefreshLayout;
        this.f331093f = (RecyclerView) viewGroup.findViewById(R.id.recycler);
        this.f331094g = (FrameLayout) viewGroup.findViewById(R.id.create_another_cv_container);
        this.f331095h = (Button) viewGroup.findViewById(R.id.create_another_cv);
        this.f331096i = (Button) viewGroup.findViewById(R.id.create_cv);
        this.f331097j = (LinearLayout) viewGroup.findViewById(R.id.no_cvs_container);
    }
}
