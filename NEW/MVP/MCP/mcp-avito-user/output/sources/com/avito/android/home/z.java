package com.avito.android.home;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: RecsReloadScrollTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/z;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class z extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f162533b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f162534c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e2 f162535d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final d2<Boolean> f162536e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Integer f162537f;

    public z(@Y61.k LinearLayoutManager linearLayoutManager, @Y61.k u3.l<SimpleTestGroupWithNone> lVar) {
        this.f162533b = linearLayoutManager;
        this.f162534c = lVar;
        e2 e2VarB = f2.b(0, 1, BufferOverflow.f410778c, 1);
        this.f162535d = e2VarB;
        this.f162536e = C43175k.a(e2VarB);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        if (i12 == 0 && i13 == 0) {
            return;
        }
        l();
    }

    public final void l() {
        int iM1 = this.f162533b.M1();
        Integer num = this.f162537f;
        int iIntValue = num != null ? num.intValue() : 44;
        e2 e2Var = this.f162535d;
        u3.l<SimpleTestGroupWithNone> lVar = this.f162534c;
        if (!lVar.f439745a.f439749b.b()) {
            e2Var = null;
        }
        if (iM1 < iIntValue) {
            if (e2Var != null) {
                e2Var.K5(Boolean.FALSE);
            }
        } else {
            lVar.b();
            if (e2Var != null) {
                e2Var.K5(Boolean.TRUE);
            }
        }
    }
}
