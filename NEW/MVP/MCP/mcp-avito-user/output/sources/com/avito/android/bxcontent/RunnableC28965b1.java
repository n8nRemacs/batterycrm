package com.avito.android.bxcontent;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.map_core.utils.IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.bxcontent.b1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC28965b1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f109512b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C29240o1 f109513c;

    public /* synthetic */ RunnableC28965b1(C29240o1 c29240o1, int i12) {
        this.f109512b = i12;
        this.f109513c = c29240o1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f109512b) {
            case 0:
                IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView ignoreTopPaddingTouchScrollDirectionAwareRecyclerView = this.f109513c.f112681O;
                ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.J0();
                RecyclerView.m layoutManager = ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.l1(0);
                    break;
                }
                break;
            case 1:
                C29240o1 c29240o1 = this.f109513c;
                RecyclerView recyclerViewU = C29240o1.u(c29240o1.f112683P);
                if (recyclerViewU != null && !c29240o1.f112694U0) {
                    c29240o1.f112713d.d(recyclerViewU, c29240o1);
                    c29240o1.f112694U0 = true;
                    RecyclerView.m layoutManager2 = recyclerViewU.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                    if (linearLayoutManager != null) {
                        com.avito.android.floating_views.h hVar = c29240o1.f112735k0;
                        if (hVar != null) {
                            recyclerViewU.v0(hVar);
                        }
                        com.avito.android.floating_views.h hVar2 = new com.avito.android.floating_views.h(c29240o1.f112655B, linearLayoutManager);
                        recyclerViewU.o(hVar2);
                        c29240o1.f112735k0 = hVar2;
                        break;
                    }
                }
                break;
            default:
                IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2 = this.f109513c.f112681O;
                ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2.J0();
                RecyclerView.m layoutManager3 = ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2.getLayoutManager();
                if (layoutManager3 != null) {
                    layoutManager3.l1(0);
                    break;
                }
                break;
        }
    }
}
