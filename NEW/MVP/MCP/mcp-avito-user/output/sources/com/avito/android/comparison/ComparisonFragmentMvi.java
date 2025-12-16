package com.avito.android.comparison;

import Cd.C13243a;
import Rq.InterfaceC15071a;
import Rq.c;
import Rq.d;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.C22026a;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.y;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import f90.InterfaceC40258g;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: ComparisonFragmentMvi.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/comparison/ComparisonFragmentMvi;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "b", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComparisonFragmentMvi extends BaseFragment implements InterfaceC28477j.a {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final b f123775y0 = new b(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.comparison.n f123776n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f123777o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f123778p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f123779q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.h f123780r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.h f123781s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.comparison.q f123782t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.comparison.menu_bottom_sheet.b f123783u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public io.reactivex.rxjava3.subjects.b<Integer> f123784v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public InterfaceC40258g f123785w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.comparison.l f123786x0;

    /* compiled from: ComparisonFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/ComparisonFragmentMvi$a;", "", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f123787a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f123788b;

        public a(@Y61.k String str, @Y61.l String str2) {
            this.f123787a = str;
            this.f123788b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f123787a, aVar.f123787a) && L.f(this.f123788b, aVar.f123788b);
        }

        public final int hashCode() {
            int iHashCode = this.f123787a.hashCode() * 31;
            String str = this.f123788b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CategoryIdAndFromPage(categoryId=");
            sb2.append(this.f123787a);
            sb2.append(", fromPage=");
            return C22026a.c(sb2, this.f123788b, ')');
        }
    }

    /* compiled from: ComparisonFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/comparison/ComparisonFragmentMvi$b;", "", "<init>", "()V", "", "COMPARISON_CATEGORY", "Ljava/lang/String;", "FROM_PAGE", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: ComparisonFragmentMvi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<Rq.c, G0> {
        @Override // Y41.l
        public final G0 invoke(Rq.c cVar) {
            Rq.c cVar2 = cVar;
            ComparisonFragmentMvi comparisonFragmentMvi = (ComparisonFragmentMvi) this.receiver;
            com.avito.android.comparison.l lVar = comparisonFragmentMvi.f123786x0;
            if (lVar != null) {
                if (cVar2 instanceof c.C0986c) {
                    GestureProxyView gestureProxyView = lVar.f124084g;
                    View viewInflate = LayoutInflater.from(gestureProxyView.getContext()).inflate(R.layout.comparison_bottom_sheet_content, (ViewGroup) null);
                    com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(gestureProxyView.getContext(), 0, 2, null);
                    com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
                    dVar.setContentView(viewInflate);
                    dVar.setCancelable(true);
                    dVar.setCanceledOnTouchOutside(true);
                    lVar.f124089l = dVar;
                    lVar.f124081d.a(new com.avito.android.comparison.menu_bottom_sheet.h(viewInflate), ((c.C0986c) cVar2).f14687a);
                    com.avito.android.lib.design.bottom_sheet.d dVar2 = lVar.f124089l;
                    if (dVar2 != null) {
                        com.avito.android.lib.util.g.a(dVar2);
                    }
                } else if (cVar2 instanceof c.b) {
                    com.avito.android.lib.design.bottom_sheet.d dVar3 = lVar.f124089l;
                    if (dVar3 != null) {
                        dVar3.dismiss();
                    }
                } else if (cVar2 instanceof c.d) {
                    c.d dVar4 = (c.d) cVar2;
                    com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, lVar.f124078a, com.avito.android.printable_text.b.f(dVar4.f14688a), null, null, null, dVar4.f14689b, 0, null, null, false, false, null, null, 4078);
                } else {
                    boolean z12 = cVar2 instanceof c.a;
                }
            }
            if (cVar2 instanceof c.a) {
                ArrayList arrayList = ((c.a) cVar2).f14685a;
                if (arrayList != null) {
                    Intent intent = new Intent();
                    intent.putExtra("comparison_list", (String[]) arrayList.toArray(new String[0]));
                    ActivityC22955m activityC22955mL1 = comparisonFragmentMvi.l1();
                    if (activityC22955mL1 != null) {
                        activityC22955mL1.setResult(-1, intent);
                    }
                }
                ActivityC22955m activityC22955mL12 = comparisonFragmentMvi.l1();
                if (activityC22955mL12 != null) {
                    activityC22955mL12.finish();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ComparisonFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRq/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LRq/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Rq.d, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Rq.d dVar) {
            Rq.d dVar2 = dVar;
            com.avito.android.comparison.l lVar = ComparisonFragmentMvi.this.f123786x0;
            if (lVar != null) {
                com.avito.android.progress_overlay.l lVar2 = lVar.f124088k;
                if (dVar2.f14692b) {
                    lVar2.k(null);
                } else {
                    d.b bVar = dVar2.f14693c;
                    if (bVar != null) {
                        lVar2.j();
                        lVar2.a(bVar.f14695a);
                    } else {
                        Sq.j jVar = dVar2.f14694d;
                        if (jVar != null) {
                            lVar2.j();
                            GestureProxyView gestureProxyView = lVar.f124084g;
                            gestureProxyView.getToolbarTitle().setText(jVar.f15163a);
                            lVar.f124080c.f338510e = new UV0.c(jVar.f15164b);
                            lVar.f124079b.f338510e = new UV0.c(jVar.f15165c);
                            lVar.f124086i.notifyDataSetChanged();
                            lVar.f124085h.notifyDataSetChanged();
                            if (lVar.f124087j == null) {
                                lVar.f124087j = new com.avito.android.comparison.s(gestureProxyView.getOverlayHeaderRecycler(), gestureProxyView.getHeaderRecycler(), lVar.f124082e);
                            }
                            gestureProxyView.getHeaderRecycler().post(new com.avito.android.app.coldstart.d(lVar, 13));
                        }
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ComparisonFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = ComparisonFragmentMvi.f123775y0;
            ComparisonFragmentMvi.this.q5().accept(InterfaceC15071a.i.f14671a);
            return G0.f406611a;
        }
    }

    /* compiled from: ComparisonFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRq/a$k;", "it", "Lkotlin/G0;", "invoke", "(LRq/a$k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC15071a.k, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC15071a.k kVar) {
            b bVar = ComparisonFragmentMvi.f123775y0;
            ComparisonFragmentMvi.this.q5().accept(kVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ComparisonFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRq/a$e;", "it", "Lkotlin/G0;", "invoke", "(LRq/a$e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<InterfaceC15071a.e, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC15071a.e eVar) {
            b bVar = ComparisonFragmentMvi.f123775y0;
            ComparisonFragmentMvi.this.q5().accept(eVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ComparisonFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRq/a$j;", "it", "Lkotlin/G0;", "invoke", "(LRq/a$j;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<InterfaceC15071a.j, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC15071a.j jVar) {
            b bVar = ComparisonFragmentMvi.f123775y0;
            ComparisonFragmentMvi.this.q5().accept(jVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ComparisonFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRq/a$b;", "it", "Lkotlin/G0;", "invoke", "(LRq/a$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<InterfaceC15071a.b, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC15071a.b bVar) {
            b bVar2 = ComparisonFragmentMvi.f123775y0;
            ComparisonFragmentMvi.this.q5().accept(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ComparisonFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRq/a$h;", "it", "Lkotlin/G0;", "invoke", "(LRq/a$h;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<InterfaceC15071a.h, G0> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC15071a.h hVar) {
            b bVar = ComparisonFragmentMvi.f123775y0;
            ComparisonFragmentMvi.this.q5().accept(hVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ComparisonFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRq/a$f;", "it", "Lkotlin/G0;", "invoke", "(LRq/a$f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<InterfaceC15071a.f, G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC15071a.f fVar) {
            b bVar = ComparisonFragmentMvi.f123775y0;
            ComparisonFragmentMvi.this.q5().accept(fVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ComparisonFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRq/a$a;", "it", "Lkotlin/G0;", "invoke", "(LRq/a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.l<InterfaceC15071a.C0984a, G0> {
        public l() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC15071a.C0984a c0984a) {
            b bVar = ComparisonFragmentMvi.f123775y0;
            ComparisonFragmentMvi.this.q5().accept(c0984a);
            return G0.f406611a;
        }
    }

    /* compiled from: ComparisonFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRq/a$g;", "it", "Lkotlin/G0;", "invoke", "(LRq/a$g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.l<InterfaceC15071a.g, G0> {
        public m() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC15071a.g gVar) {
            b bVar = ComparisonFragmentMvi.f123775y0;
            ComparisonFragmentMvi.this.q5().accept(gVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ComparisonFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRq/a$d;", "it", "Lkotlin/G0;", "invoke", "(LRq/a$d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.l<InterfaceC15071a.d, G0> {
        public n() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC15071a.d dVar) {
            b bVar = ComparisonFragmentMvi.f123775y0;
            ComparisonFragmentMvi.this.q5().accept(dVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f123800l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Y41.a aVar) {
            super(0);
            this.f123800l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f123800l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<Fragment> {
        public p() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ComparisonFragmentMvi.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p f123802l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(p pVar) {
            super(0);
            this.f123802l = pVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f123802l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f123803l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f123803l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f123803l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f123804l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f123804l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f123804l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ComparisonFragmentMvi.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/comparison/m;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/comparison/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends N implements Y41.a<com.avito.android.comparison.m> {
        public t() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.comparison.m invoke() {
            com.avito.android.comparison.n nVar = ComparisonFragmentMvi.this.f123776n0;
            if (nVar == null) {
                nVar = null;
            }
            return (com.avito.android.comparison.m) nVar.get();
        }
    }

    public ComparisonFragmentMvi() {
        super(0, 1, null);
        o oVar = new o(new t());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new q(new p()));
        this.f123777o0 = new O0(m0.f406844a.b(com.avito.android.comparison.m.class), new r(interfaceC42726CB), oVar, new s(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        com.avito.android.arch.mvi.android.f.a(q5(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new c(1, this, ComparisonFragmentMvi.class, "handleEvent", "handleEvent(Lcom/avito/android/comparison/mvi/entity/ComparisonOneTimeEvent;)V", 0), new d());
        return layoutInflater.inflate(R.layout.comparison_view, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        y f21241d;
        super.onViewCreated(view, bundle);
        com.avito.konveyor.a aVar = this.f123779q0;
        com.avito.konveyor.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.a aVar3 = this.f123778p0;
        com.avito.konveyor.a aVar4 = aVar3 != null ? aVar3 : null;
        com.avito.android.comparison.q qVar = this.f123782t0;
        com.avito.android.comparison.q qVar2 = qVar != null ? qVar : null;
        com.avito.konveyor.adapter.h hVar = this.f123781s0;
        com.avito.konveyor.adapter.h hVar2 = hVar != null ? hVar : null;
        com.avito.konveyor.adapter.h hVar3 = this.f123780r0;
        com.avito.konveyor.adapter.h hVar4 = hVar3 != null ? hVar3 : null;
        com.avito.android.comparison.menu_bottom_sheet.b bVar = this.f123783u0;
        com.avito.android.comparison.menu_bottom_sheet.b bVar2 = bVar != null ? bVar : null;
        io.reactivex.rxjava3.subjects.b<Integer> bVar3 = this.f123784v0;
        com.avito.android.comparison.l lVar = new com.avito.android.comparison.l(view, aVar2, aVar4, qVar2, hVar2, hVar4, bVar2, bVar3 != null ? bVar3 : null, new e());
        this.f123786x0 = lVar;
        io.reactivex.rxjava3.subjects.e<MotionEvent> eVar = qVar2.f124190c;
        eVar.getClass();
        new C41981q0(eVar).t0(new com.avito.android.comparison.j(lVar));
        io.reactivex.rxjava3.subjects.e<G0> eVar2 = qVar2.f124191d;
        eVar2.getClass();
        new C41981q0(eVar2).t0(new com.avito.android.comparison.k(lVar));
        o5((Toolbar) view.findViewById(R.id.toolbar));
        C35966w1.c(this).t();
        C35966w1.c(this).s(true);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && (f21241d = activityC22955mL1.getF21241d()) != null) {
            f21241d.a(getViewLifecycleOwner(), new com.avito.android.comparison.c(this));
        }
        InterfaceC40258g interfaceC40258g = this.f123785w0;
        (interfaceC40258g != null ? interfaceC40258g : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.comparison.di.r.a().a((com.avito.android.comparison.di.f) C29972i.a(C29972i.b(this), com.avito.android.comparison.di.f.class), cv.c.b(this), new a(requireArguments().getString("comparison_category"), requireArguments().getString("from_page")), getResources(), new f(), new g(), new h(), new i(), new j(), new k(), new l(), new m(), new n()).a(this);
    }

    public final com.avito.android.comparison.m q5() {
        return (com.avito.android.comparison.m) this.f123777o0.getValue();
    }
}
