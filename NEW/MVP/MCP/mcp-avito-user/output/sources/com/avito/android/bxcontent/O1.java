package com.avito.android.bxcontent;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: PromoHeaderWidgetScrollTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/O1;", "Landroidx/recyclerview/widget/RecyclerView$r;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class O1 extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f109370b;

    /* renamed from: c, reason: collision with root package name */
    public int f109371c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f109372d = true;

    /* renamed from: e, reason: collision with root package name */
    public int f109373e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final e2 f109374f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final e2 f109375g;

    /* compiled from: PromoHeaderWidgetScrollTracker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/bxcontent/O1$a;", "", "<init>", "()V", "", "ANIMATION_DURATION", "I", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public O1(@Y61.k RecyclerView recyclerView, boolean z12) {
        View viewZ;
        this.f109370b = z12;
        this.f109371c = recyclerView.computeVerticalScrollOffset();
        e2 e2VarB = f2.b(1, 0, BufferOverflow.f410778c, 2);
        this.f109374f = e2VarB;
        this.f109375g = e2VarB;
        if (z12) {
            if (this.f109371c == 0) {
                e2VarB.K5(Float.valueOf(1.0f));
                return;
            }
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null || (viewZ = linearLayoutManager.Z(0)) == null) {
                return;
            }
            int height = viewZ.getHeight();
            this.f109373e = height;
            recyclerView.E0(0, height - this.f109371c, null, 1000, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        int i13;
        int i14;
        if (i12 == 0 && (i13 = this.f109371c) < (i14 = this.f109373e) && this.f109370b) {
            recyclerView.E0(0, i13 >= i14 / 2 ? i14 - i13 : -i13, null, 1000, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int iK1 = linearLayoutManager.K1();
            e2 e2Var = this.f109374f;
            if (iK1 != 0) {
                if (this.f109372d) {
                    this.f109371c = this.f109373e;
                    this.f109372d = false;
                    e2Var.K5(Float.valueOf(0.0f));
                    return;
                }
                return;
            }
            if (this.f109373e <= 0) {
                View viewZ = linearLayoutManager.Z(0);
                this.f109373e = viewZ != null ? viewZ.getHeight() : -1;
            }
            this.f109372d = true;
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            this.f109371c = iComputeVerticalScrollOffset;
            int i14 = this.f109373e;
            if (iComputeVerticalScrollOffset <= i14) {
                e2Var.K5(Float.valueOf(1 - kotlin.ranges.s.f(iComputeVerticalScrollOffset / i14, 0.0f, 1.0f)));
            }
        }
    }
}
