package com.avito.android.bxcontent.utils;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.bxcontent.di.module.U;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.util.D6;
import com.avito.android.util.Kundle;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BxContentPaddingStatePresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/utils/e;", "Lcom/avito/android/bxcontent/utils/d;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements d {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f113026g = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PresentationType f113027a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.floating_views.f f113028b;

    /* renamed from: c, reason: collision with root package name */
    public final int f113029c;

    /* renamed from: d, reason: collision with root package name */
    public int f113030d;

    /* renamed from: e, reason: collision with root package name */
    public int f113031e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public RecyclerView f113032f;

    /* compiled from: BxContentPaddingStatePresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/bxcontent/utils/e$a;", "", "<init>", "()V", "", "BX_BOTTOM_PADDING_KEY", "Ljava/lang/String;", "BX_TOP_PADDING_KEY", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e(@U @l Kundle kundle, @k Resources resources, @k PresentationType presentationType, @k com.avito.android.floating_views.f fVar) throws Resources.NotFoundException {
        Integer numB;
        Integer numB2;
        this.f113027a = presentationType;
        this.f113028b = fVar;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.redesign_toolbar_search_view_height);
        this.f113029c = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.serp_top_padding);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.redesign_toolbar_search_view_height);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.redesign_shortcuts_top_margin);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.serp_default_bottom_padding);
        if (kundle != null && (numB2 = kundle.b("bx_top_padding_key")) != null) {
            dimensionPixelSize = numB2.intValue();
        } else if (!presentationType.isMain()) {
            dimensionPixelSize = presentationType.isSerp() ? dimensionPixelSize2 : presentationType.isPush() ? dimensionPixelSize3 : presentationType.isFullMap() ? dimensionPixelSize4 : 0;
        }
        this.f113030d = dimensionPixelSize;
        if (kundle != null && (numB = kundle.b("bx_bottom_padding_key")) != null) {
            dimensionPixelSize5 = numB.intValue();
        } else if (presentationType.isMain()) {
            dimensionPixelSize5 = 0;
        } else if (!presentationType.isSerp()) {
            if (!presentationType.isPush()) {
                presentationType.isFullMap();
            }
            dimensionPixelSize5 = 0;
        }
        this.f113031e = dimensionPixelSize5;
    }

    @Override // com.avito.android.bxcontent.utils.c
    @k
    public final Kundle H() {
        Kundle kundle = new Kundle();
        kundle.i(Integer.valueOf(this.f113030d), "bx_top_padding_key");
        kundle.i(Integer.valueOf(this.f113031e), "bx_bottom_padding_key");
        return kundle;
    }

    @Override // com.avito.android.bxcontent.utils.c
    public final void a() {
        this.f113032f = null;
    }

    @Override // com.avito.android.bxcontent.utils.b
    public final void b(int i12) {
        e(i12, this.f113031e, this.f113027a.isSerp());
    }

    @Override // com.avito.android.bxcontent.utils.b
    public final void c(int i12) {
        e(this.f113030d, i12, false);
    }

    @Override // com.avito.android.bxcontent.utils.c
    public final void d(@k View view) {
        this.f113032f = (RecyclerView) view.findViewById(R.id.recycler_view);
        e(this.f113030d, this.f113031e, false);
    }

    public final void e(int i12, int i13, boolean z12) {
        RecyclerView recyclerView;
        int i14;
        PresentationType presentationType = this.f113027a;
        if (presentationType.isMapWithoutSerp() || (recyclerView = this.f113032f) == null) {
            return;
        }
        if (presentationType.isMain() && i12 > (i14 = this.f113029c)) {
            i12 = i14;
        }
        int i15 = i12;
        if (presentationType.isMain() && i13 < 0) {
            i13 = 0;
        }
        int i16 = i13;
        this.f113030d = i15;
        this.f113031e = i16;
        boolean z13 = i15 != recyclerView.getPaddingTop();
        if (z13 || i16 != recyclerView.getPaddingBottom()) {
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            D6.f(recyclerView, 0, i15, 0, i16, 5);
            if (z13 && z12) {
                androidx.media3.exoplayer.drm.d dVar = new androidx.media3.exoplayer.drm.d(iComputeVerticalScrollOffset, recyclerView, this);
                if (recyclerView.post(dVar)) {
                    return;
                }
                dVar.run();
            }
        }
    }
}
