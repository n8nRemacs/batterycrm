package ws0;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp_list.Mode;
import com.avito.android.util.D6;
import com.jakewharton.rxrelay3.c;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ActionsHorizontalBlockScrollHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lws0/a;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ws0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49679a extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final FrameLayout f441833b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ViewGroup f441834c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final int[] f441835d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c<Mode> f441836e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C41981q0 f441837f;

    public C49679a(@k View view) {
        View viewFindViewById = view.findViewById(R.id.shortcuts_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.shortcut_block);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f441833b = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.bottom_block);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f441834c = (ViewGroup) viewFindViewById3;
        this.f441835d = new int[2];
        c<Mode> cVar = new c<>();
        this.f441836e = cVar;
        this.f441837f = new C41981q0(cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        int iK1;
        if (i13 == 0) {
            return;
        }
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null && L.f(childAt.getTag(), this.f441834c.getTag())) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null || (iK1 = linearLayoutManager.K1()) == -1 || iK1 > 0) {
                return;
            }
            FrameLayout frameLayout = this.f441833b;
            if (D6.y(frameLayout)) {
                boolean z12 = i13 > 0;
                int[] iArr = this.f441835d;
                frameLayout.getLocationOnScreen(iArr);
                int iR2 = D6.r(frameLayout) + iArr[1];
                childAt.getLocationOnScreen(iArr);
                int i14 = iArr[1];
                double d12 = iR2 / i14;
                c<Mode> cVar = this.f441836e;
                if (d12 < 0.7d || d12 > 1.3d) {
                    if (z12) {
                        cVar.accept(Mode.f273992b);
                        return;
                    } else {
                        cVar.accept(Mode.f273993c);
                        return;
                    }
                }
                if (i14 < iR2) {
                    cVar.accept(Mode.f273992b);
                    return;
                }
                if (i14 > iR2) {
                    cVar.accept(Mode.f273993c);
                } else if (z12) {
                    cVar.accept(Mode.f273992b);
                } else {
                    cVar.accept(Mode.f273993c);
                }
            }
        }
    }
}
