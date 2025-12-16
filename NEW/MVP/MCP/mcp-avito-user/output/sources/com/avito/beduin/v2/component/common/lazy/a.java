package com.avito.beduin.v2.component.common.lazy;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EndReachedScrollListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/component/common/lazy/a;", "Landroidx/recyclerview/widget/RecyclerView$r;", "a", "lazy-container_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayoutManager f335679b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f335680c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f335681d;

    /* renamed from: e, reason: collision with root package name */
    public int f335682e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f335683f;

    /* compiled from: EndReachedScrollListener.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/component/common/lazy/a$a;", "", "<init>", "()V", "", "PAGINATION_THRESHOLD", "I", "lazy-container_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.component.common.lazy.a$a, reason: collision with other inner class name */
    public static final class C10392a {
        public /* synthetic */ C10392a(C42822w c42822w) {
            this();
        }

        public C10392a() {
        }
    }

    static {
        new C10392a(null);
    }

    public a(@k LinearLayoutManager linearLayoutManager) {
        this.f335679b = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        if (this.f335680c == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = this.f335679b;
        if (linearLayoutManager.f53690r == 1) {
            i12 = i13;
        }
        int iO02 = linearLayoutManager.o0();
        if (iO02 != this.f335682e) {
            this.f335681d = false;
        }
        this.f335682e = iO02;
        if (this.f335681d || i12 <= 0) {
            if (i12 < 0) {
                this.f335681d = false;
            }
        } else if (linearLayoutManager.M1() > iO02 - 4) {
            this.f335681d = true;
            Y41.a<G0> aVar = this.f335680c;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public final void l(@k RecyclerView recyclerView) {
        if (this.f335680c == null || this.f335683f) {
            return;
        }
        if (this.f335679b.f53690r == 1) {
            if (recyclerView.computeVerticalScrollRange() > recyclerView.getHeight()) {
                return;
            }
        } else if (recyclerView.computeHorizontalScrollRange() > recyclerView.getWidth()) {
            return;
        }
        this.f335683f = true;
        recyclerView.post(new c(this, 1));
    }
}
