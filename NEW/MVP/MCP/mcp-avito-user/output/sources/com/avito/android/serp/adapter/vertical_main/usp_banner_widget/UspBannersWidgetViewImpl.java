package com.avito.android.serp.adapter.vertical_main.usp_banner_widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner.UspBannerItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UspBannersWidgetView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/UspBannersWidgetViewImpl;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/l;", "b", "c", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UspBannersWidgetViewImpl extends com.avito.android.serp.c implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g f273291b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f273292c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f273293d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final J f273294e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public N f273295f;

    /* renamed from: g, reason: collision with root package name */
    public int f273296g;

    /* renamed from: h, reason: collision with root package name */
    public int f273297h;

    /* renamed from: i, reason: collision with root package name */
    public final int f273298i;

    /* renamed from: j, reason: collision with root package name */
    public final int f273299j;

    /* renamed from: k, reason: collision with root package name */
    public final int f273300k;

    /* renamed from: l, reason: collision with root package name */
    public final int f273301l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final UspBannersWidgetViewImpl$layoutManager$1 f273302m;

    /* compiled from: UspBannersWidgetView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/serp/adapter/vertical_main/usp_banner_widget/UspBannersWidgetViewImpl$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            if (i12 == 0) {
                UspBannersWidgetViewImpl uspBannersWidgetViewImpl = UspBannersWidgetViewImpl.this;
                uspBannersWidgetViewImpl.f273291b.l1(uspBannersWidgetViewImpl.f273297h, uspBannersWidgetViewImpl.f273302m.H1());
            }
        }
    }

    /* compiled from: UspBannersWidgetView.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/UspBannersWidgetViewImpl$b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.l {
        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            View viewFindViewById = view.findViewById(R.id.container);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
            }
            ((FrameLayout) viewFindViewById).getLayoutParams().height = -1;
        }
    }

    /* compiled from: UspBannersWidgetView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/UspBannersWidgetViewImpl$c;", "", "<init>", "()V", "", "BANNER_MAX_WIDTH_PX", "I", "NEXT_BANNER_PEEK_WITH_PX", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: UspBannersWidgetView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/banner/UspBannerItem;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/banner/UspBannerItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<UspBannerItem, G0> {
        public d() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(UspBannerItem uspBannerItem) {
            UspBannersWidgetViewImpl.this.f273295f.invoke(uspBannerItem);
            return G0.f406611a;
        }
    }

    /* compiled from: UspBannersWidgetView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/banner/UspBannerItem;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/banner/UspBannerItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<UspBannerItem, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f273305l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(UspBannerItem uspBannerItem) {
            return G0.f406611a;
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements View.OnLayoutChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f273307c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ J f273308d;

        public f(int i12, J j12) {
            this.f273307c = i12;
            this.f273308d = j12;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            int[] iArrC;
            int i22;
            view.removeOnLayoutChangeListener(this);
            UspBannersWidgetViewImpl uspBannersWidgetViewImpl = UspBannersWidgetViewImpl.this;
            View viewZ = uspBannersWidgetViewImpl.f273302m.Z(this.f273307c);
            if (viewZ == null || (iArrC = this.f273308d.c(uspBannersWidgetViewImpl.f273302m, viewZ)) == null || (i22 = iArrC[0]) == 0) {
                return;
            }
            uspBannersWidgetViewImpl.f273292c.scrollBy(i22, 0);
        }
    }

    static {
        new c(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.recyclerview.widget.RecyclerView$m, com.avito.android.serp.adapter.vertical_main.usp_banner_widget.UspBannersWidgetViewImpl$layoutManager$1] */
    public UspBannersWidgetViewImpl(@Y61.k g gVar, @Y61.k View view) throws BlueprintCollisionException {
        super(view);
        this.f273291b = gVar;
        View viewFindViewById = view.findViewById(R.id.usp_banner_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f273292c = recyclerView;
        this.f273295f = e.f273305l;
        Context context = view.getContext();
        this.f273298i = C35835l0.g(context).x;
        this.f273299j = context.getResources().getDimensionPixelSize(R.dimen.usp_banner__item_side_padding);
        this.f273300k = context.getResources().getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f273301l = context.getResources().getDimensionPixelSize(R.dimen.usp_banner_item_side_half_padding) * 2;
        ?? r32 = new LinearLayoutManager() { // from class: com.avito.android.serp.adapter.vertical_main.usp_banner_widget.UspBannersWidgetViewImpl$layoutManager$1
            {
                super(0, false);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.m
            public final boolean K(@Y61.k RecyclerView.n nVar) {
                int iB2;
                UspBannersWidgetViewImpl uspBannersWidgetViewImpl = this.f273309G;
                if (uspBannersWidgetViewImpl.f273296g == 1) {
                    iB2 = -1;
                } else {
                    int iB3 = (((uspBannersWidgetViewImpl.f273298i - y6.b(32)) - uspBannersWidgetViewImpl.f273301l) - uspBannersWidgetViewImpl.f273299j) - uspBannersWidgetViewImpl.f273300k;
                    iB2 = y6.b(480);
                    if (iB3 <= iB2) {
                        iB2 = iB3;
                    }
                }
                ((ViewGroup.MarginLayoutParams) nVar).width = iB2;
                return true;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final void z1(@Y61.k RecyclerView.z zVar, @Y61.k int[] iArr) {
                iArr[0] = y6.b(10000);
                iArr[1] = y6.b(10000);
            }
        };
        this.f273302m = r32;
        com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner.a aVar = new com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner.a(new com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner.d(new d()));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f273293d = hVar;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVarA);
        jVar.setHasStableIds(true);
        recyclerView.setLayoutManager(r32);
        recyclerView.setAdapter(jVar);
        recyclerView.setScrollingTouchSlop(1);
        Resources resources = view.getResources();
        IO.d dVar = new IO.d(0, 0, 0, 0, 0, 0, 63, null);
        IO.d.c(dVar, aVar, resources.getDimensionPixelSize(R.dimen.usp_banner_item_side_half_padding), resources.getDimensionPixelSize(R.dimen.usp_banner_item_side_half_padding), resources.getDimensionPixelSize(R.dimen.usp_banner__item_side_padding), resources.getDimensionPixelSize(R.dimen.usp_banner__item_side_padding));
        recyclerView.l(dVar, -1);
        recyclerView.l(new b(), -1);
        J j12 = new J();
        J j13 = this.f273294e;
        if (j13 != null) {
            j13.b(null);
        }
        recyclerView.setOnFlingListener(null);
        recyclerView.s();
        j12.b(recyclerView);
        this.f273294e = j12;
        recyclerView.o(new a());
    }

    @Override // com.avito.android.serp.adapter.vertical_main.usp_banner_widget.l
    public final void NR(int i12) {
        int[] iArrC;
        int i13;
        J j12 = this.f273294e;
        if (j12 == null) {
            return;
        }
        RecyclerView recyclerView = this.f273292c;
        recyclerView.A0(i12);
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new f(i12, j12));
            return;
        }
        UspBannersWidgetViewImpl$layoutManager$1 uspBannersWidgetViewImpl$layoutManager$1 = this.f273302m;
        View viewZ = uspBannersWidgetViewImpl$layoutManager$1.Z(i12);
        if (viewZ == null || (iArrC = j12.c(uspBannersWidgetViewImpl$layoutManager$1, viewZ)) == null || (i13 = iArrC[0]) == 0) {
            return;
        }
        recyclerView.scrollBy(i13, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.vertical_main.usp_banner_widget.l
    @SuppressLint({"NotifyDataSetChanged"})
    public final void tH(@Y61.k List list, int i12, @Y61.k Y41.l lVar) {
        this.f273297h = i12;
        this.f273296g = list.size();
        this.f273293d.f338510e = new UV0.c(list);
        RecyclerView.Adapter adapter = this.f273292c.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        this.f273295f = (N) lVar;
    }
}
