package com.avito.android.scroll_tracker;

import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22977J;
import com.avito.android.bxcontent.C29248r1;
import com.avito.android.map_core.utils.IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView;
import com.avito.android.serp.adapter.skeleton.ScrollUnpredictiveGridLayoutManager;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;

/* compiled from: SnippetScrollDepthRecyclerViewScrollListener.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/scroll_tracker/b;", "Landroidx/recyclerview/widget/RecyclerView$r;", "Lcom/avito/android/scroll_tracker/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends RecyclerView.r implements com.avito.android.scroll_tracker.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C29248r1 f261706b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView f261707c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ScrollUnpredictiveGridLayoutManager f261708d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C22977J f261709e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f261710f = new LinkedHashSet();

    /* compiled from: SnippetScrollDepthRecyclerViewScrollListener.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/scroll_tracker/b$a;", "", "<init>", "()V", "", "MIN_ITEM_VISIBILITY_DURATION_MS", "J", "", "MIN_ITEM_VISIBILITY_PERCENT", "F", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public b(@Y61.k C29248r1 c29248r1, @Y61.k IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView ignoreTopPaddingTouchScrollDirectionAwareRecyclerView, @Y61.k ScrollUnpredictiveGridLayoutManager scrollUnpredictiveGridLayoutManager, @Y61.k C22977J c22977j) {
        this.f261706b = c29248r1;
        this.f261707c = ignoreTopPaddingTouchScrollDirectionAwareRecyclerView;
        this.f261708d = scrollUnpredictiveGridLayoutManager;
        this.f261709e = c22977j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        m();
    }

    public final Float l(int i12) {
        RecyclerView.C cP2 = this.f261707c.P(i12);
        if (cP2 == null) {
            return null;
        }
        View view = cP2.itemView;
        int height = view.getHeight();
        int top = view.getTop();
        int bottom = view.getBottom();
        return Float.valueOf((Math.min(r0.getHeight(), bottom) - ((int) Math.max(0.0d, top))) / height);
    }

    public final void m() {
        ScrollUnpredictiveGridLayoutManager scrollUnpredictiveGridLayoutManager = this.f261708d;
        this.f261706b.f112822b.f112716e.e(scrollUnpredictiveGridLayoutManager.M1());
        int iK1 = scrollUnpredictiveGridLayoutManager.K1();
        int iM1 = scrollUnpredictiveGridLayoutManager.M1();
        if (iK1 > iM1) {
            return;
        }
        while (true) {
            Float fL2 = l(iK1);
            if (fL2 != null && fL2.floatValue() >= 0.8f && !this.f261710f.contains(Integer.valueOf(iK1))) {
                C43259k.d(this.f261709e, null, null, new c(this, iK1, null), 3);
            }
            if (iK1 == iM1) {
                return;
            } else {
                iK1++;
            }
        }
    }
}
