package com.avito.android.beduin.common.container.horizontal_slider;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.page_indicator.PageIndicator;
import com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23;
import com.avito.android.util.D6;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import j.f0;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rV.InterfaceC47597a;

/* compiled from: BeduinBaseHorizontalSliderLayout.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003:\u0002\u0012\u0013R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinBaseHorizontalSliderLayout;", "T", "Landroid/widget/FrameLayout;", "Lcom/avito/android/beduin/common/utils/result/e;", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "getRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinBaseHorizontalSliderLayout$a;", "h", "Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinBaseHorizontalSliderLayout$a;", "getListener", "()Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinBaseHorizontalSliderLayout$a;", "setListener", "(Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinBaseHorizontalSliderLayout$a;)V", "listener", "HorizontalLinearLayoutManager", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BeduinBaseHorizontalSliderLayout<T> extends FrameLayout implements com.avito.android.beduin.common.utils.result.e {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f103059q = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final RecyclerView recycler;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final HorizontalLinearLayoutManager f103061c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public SV.b f103062d;

    /* renamed from: e, reason: collision with root package name */
    public B<T, ?> f103063e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public m f103064f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public ValueAnimator f103065g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public a listener;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public PageIndicator f103067i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public PageIndicatorRe23 f103068j;

    /* renamed from: k, reason: collision with root package name */
    @f0
    @Y61.l
    public Integer f103069k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f103070l;

    /* renamed from: m, reason: collision with root package name */
    public long f103071m;

    /* renamed from: n, reason: collision with root package name */
    public int f103072n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final q f103073o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.container.horizontal_slider.d f103074p;

    /* compiled from: BeduinBaseHorizontalSliderLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinBaseHorizontalSliderLayout$HorizontalLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HorizontalLinearLayoutManager extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public final boolean J() {
            return false;
        }
    }

    /* compiled from: BeduinBaseHorizontalSliderLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinBaseHorizontalSliderLayout$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(int i12);

        void b(@Y61.l LinearLayoutManager.SavedState savedState, boolean z12);
    }

    /* compiled from: BeduinBaseHorizontalSliderLayout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "<anonymous parameter 0>", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BeduinBaseHorizontalSliderLayout<T> f103075b;

        public b(BeduinBaseHorizontalSliderLayout<T> beduinBaseHorizontalSliderLayout) {
            this.f103075b = beduinBaseHorizontalSliderLayout;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ((Number) obj).longValue();
            BeduinBaseHorizontalSliderLayout<T> beduinBaseHorizontalSliderLayout = this.f103075b;
            beduinBaseHorizontalSliderLayout.f103071m = 0L;
            HorizontalLinearLayoutManager horizontalLinearLayoutManager = beduinBaseHorizontalSliderLayout.f103061c;
            int iK1 = horizontalLinearLayoutManager.K1();
            if (iK1 < horizontalLinearLayoutManager.o0() - 1) {
                beduinBaseHorizontalSliderLayout.e(iK1 + 1, true, false);
            }
        }
    }

    /* compiled from: BeduinBaseHorizontalSliderLayout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BeduinBaseHorizontalSliderLayout<Object> f103076l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BeduinBaseHorizontalSliderLayout<Object> beduinBaseHorizontalSliderLayout) {
            super(1);
            this.f103076l = beduinBaseHorizontalSliderLayout;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            a listener = this.f103076l.getListener();
            if (listener != null) {
                listener.a(iIntValue);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinBaseHorizontalSliderLayout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BeduinBaseHorizontalSliderLayout<Object> f103077l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BeduinBaseHorizontalSliderLayout<Object> beduinBaseHorizontalSliderLayout) {
            super(1);
            this.f103077l = beduinBaseHorizontalSliderLayout;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            a listener = this.f103077l.getListener();
            if (listener != null) {
                listener.a(iIntValue);
            }
            return G0.f406611a;
        }
    }

    public BeduinBaseHorizontalSliderLayout(@Y61.k Context context) {
        super(context);
        this.f103073o = new q(context, new com.avito.android.beduin.common.container.horizontal_slider.c(this));
        this.f103074p = new com.avito.android.beduin.common.container.horizontal_slider.d(context);
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setId(R.id.beduin_horizontal_slider);
        this.recycler = recyclerView;
        HorizontalLinearLayoutManager horizontalLinearLayoutManager = new HorizontalLinearLayoutManager(0, false);
        this.f103061c = horizontalLinearLayoutManager;
        recyclerView.setLayoutManager(horizontalLinearLayoutManager);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.o(new com.avito.android.beduin.common.container.horizontal_slider.a(this));
    }

    @Override // com.avito.android.beduin.common.utils.result.e
    public final com.avito.android.beduin.common.component.adapter.g a(int i12, ArrayList arrayList) {
        com.avito.android.beduin.common.component.adapter.g gVar = new com.avito.android.beduin.common.component.adapter.g();
        gVar.f100618k = i12;
        gVar.m(arrayList);
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@Y61.k ArrayList arrayList, int i12, boolean z12, boolean z13, int i13, boolean z14, int i14, boolean z15, @Y61.l Integer num, @Y61.l Parcelable parcelable) {
        c(i14, arrayList, z15);
        m mVar = this.f103064f;
        int i15 = 0;
        int i16 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (mVar == null) {
            mVar = new m(0, false, 3, null);
            this.f103064f = mVar;
        }
        RecyclerView recyclerView = this.recycler;
        RecyclerView.l lVarA0 = recyclerView.getItemDecorationCount() > 0 ? recyclerView.a0(0) : null;
        if (!L.f(lVarA0, mVar)) {
            if (lVarA0 != null) {
                recyclerView.s0(0);
            }
            recyclerView.l(mVar, -1);
        }
        mVar.f103122b = i12;
        mVar.f103123c = z14;
        this.f103072n = i13;
        Integer numValueOf = Integer.valueOf(i13);
        if (!z12) {
            numValueOf = null;
        }
        SV.b bVar = this.f103062d;
        if (bVar == null) {
            bVar = new SV.b(i15, objArr2 == true ? 1 : 0, i16, objArr == true ? 1 : 0);
            this.f103062d = bVar;
        }
        if (numValueOf != null) {
            bVar.f15037d = numValueOf.intValue();
            SV.b bVar2 = this.f103062d;
            if (bVar2 != null) {
                bVar2.b(recyclerView);
            }
        } else {
            SV.b bVar3 = this.f103062d;
            if (bVar3 != null) {
                bVar3.b(null);
            }
        }
        q qVar = this.f103073o;
        recyclerView.u0(qVar);
        if (z13 && !z12) {
            recyclerView.n(qVar);
        }
        B<T, ?> b12 = this.f103063e;
        (b12 != null ? b12 : null).m(arrayList);
        if (parcelable != null) {
            this.f103061c.X0(parcelable);
        } else {
            if (num != null && num.intValue() == -1) {
                return;
            }
            e(num != null ? num.intValue() : 0, false, z12);
        }
    }

    public void c(int i12, @Y61.k ArrayList arrayList, boolean z12) {
        io.reactivex.rxjava3.internal.observers.m mVar = this.f103070l;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f103070l = null;
        this.f103071m = 0L;
        B<T, ?> b12 = this.f103063e;
        if (b12 == null) {
            b12 = null;
        }
        if (!b12.j().isEmpty()) {
            B<T, ?> b13 = this.f103063e;
            if (b13 == null) {
                b13 = null;
            }
            b13.m(null);
        }
        RecyclerView recyclerView = this.recycler;
        B<T, ?> b14 = this.f103063e;
        recyclerView.K0(b14 != null ? b14 : null, false);
    }

    public final void d(long j12) {
        io.reactivex.rxjava3.internal.observers.m mVar = this.f103070l;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f103070l = null;
        this.f103071m = j12;
        if (isAttachedToWindow()) {
            this.f103070l = (io.reactivex.rxjava3.internal.observers.m) I.C(j12, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).s(io.reactivex.rxjava3.android.schedulers.b.b()).x(new b(this), io.reactivex.rxjava3.internal.functions.a.f401996f);
        }
    }

    public final void e(int i12, boolean z12, boolean z13) {
        HorizontalLinearLayoutManager horizontalLinearLayoutManager = this.f103061c;
        if (!z12) {
            if (z13) {
                horizontalLinearLayoutManager.b2(i12, 0);
                return;
            } else {
                horizontalLinearLayoutManager.l1(i12);
                return;
            }
        }
        if (!z13) {
            this.recycler.F0(i12);
            return;
        }
        com.avito.android.beduin.common.container.horizontal_slider.d dVar = this.f103074p;
        dVar.f53878a = i12;
        horizontalLinearLayoutManager.x1(dVar);
    }

    public final void f(@f0 int i12, boolean z12) throws Resources.NotFoundException {
        Integer num;
        PageIndicator pageIndicator;
        RecyclerView recyclerView = this.recycler;
        if (i12 == R.style.HorizontalSliderPageIndicatorNormalWhiteRe23 || i12 == R.style.HorizontalSliderPageIndicatorNormalBlackRe23) {
            if (z12) {
                PageIndicatorRe23 pageIndicatorRe23 = this.f103068j;
                if (pageIndicatorRe23 != null) {
                    com.avito.android.lib.design.page_indicator_re23.b.c(pageIndicatorRe23);
                }
                PageIndicatorRe23 pageIndicatorRe232 = this.f103068j;
                if (pageIndicatorRe232 != null) {
                    removeView(pageIndicatorRe232);
                }
                PageIndicatorRe23 pageIndicatorRe233 = new PageIndicatorRe23(getContext(), null, 0, i12);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 81);
                layoutParams.bottomMargin = pageIndicatorRe233.getContext().getResources().getDimensionPixelOffset(R.dimen.horizontal_slider_page_indicator_bottom_margin);
                pageIndicatorRe233.setLayoutParams(layoutParams);
                this.f103068j = pageIndicatorRe233;
                this.f103069k = Integer.valueOf(i12);
                PageIndicatorRe23 pageIndicatorRe234 = this.f103068j;
                if (pageIndicatorRe234 != null) {
                    c cVar = new c(this);
                    InterfaceC47597a<?> attachDelegate$_design_modules_components = pageIndicatorRe234.getAttachDelegate$_design_modules_components();
                    if (attachDelegate$_design_modules_components != null) {
                        attachDelegate$_design_modules_components.a();
                    }
                    rV.h hVar = new rV.h(pageIndicatorRe234.getPageIndicatorCallback$_design_modules_components());
                    hVar.b(recyclerView);
                    pageIndicatorRe234.setAttachDelegate$_design_modules_components(hVar);
                    pageIndicatorRe234.setSelectedIndexListener$_design_modules_components(cVar);
                }
                addView(this.f103068j);
            }
            D6.G(this.f103068j, z12);
            return;
        }
        if (this.f103067i == null) {
            PageIndicator pageIndicator2 = new PageIndicator(getContext(), i12);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 81);
            layoutParams2.bottomMargin = pageIndicator2.getContext().getResources().getDimensionPixelOffset(R.dimen.horizontal_slider_page_indicator_bottom_margin);
            pageIndicator2.setLayoutParams(layoutParams2);
            this.f103067i = pageIndicator2;
            this.f103069k = Integer.valueOf(i12);
            PageIndicator pageIndicator3 = this.f103067i;
            if (pageIndicator3 != null) {
                d dVar = new d(this);
                InterfaceC47597a<?> interfaceC47597a = pageIndicator3.f179877m;
                if (interfaceC47597a != null) {
                    interfaceC47597a.a();
                }
                rV.h hVar2 = new rV.h(pageIndicator3.f179886v);
                hVar2.b(recyclerView);
                pageIndicator3.f179877m = hVar2;
                pageIndicator3.f179885u = dVar;
            }
            addView(this.f103067i);
        } else if (z12 && (((num = this.f103069k) == null || num.intValue() != i12) && (pageIndicator = this.f103067i) != null)) {
            pageIndicator.setAppearance(i12);
        }
        PageIndicator pageIndicator4 = this.f103067i;
        if (pageIndicator4 != null) {
            D6.G(pageIndicator4, z12);
        }
    }

    @Y61.l
    public final a getListener() {
        return this.listener;
    }

    @Override // com.avito.android.beduin.common.utils.result.e
    @Y61.k
    public final RecyclerView getRecycler() {
        return this.recycler;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j12 = this.f103071m;
        if (j12 > 0) {
            d(j12);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        io.reactivex.rxjava3.internal.observers.m mVar = this.f103070l;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f103070l = null;
        ValueAnimator valueAnimator = this.f103065g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void setListener(@Y61.l a aVar) {
        this.listener = aVar;
    }
}
