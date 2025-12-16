package com.avito.android.inline_filters.dialog.suggest;

import android.os.Handler;
import android.os.Looper;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.inline_filters.dialog.select.adapter.InlineItemType;
import com.avito.android.inline_filters.dialog.suggest.a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kA0.C42560e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: SuggestFilterViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/suggest/o;", "Landroidx/lifecycle/M0;", "a", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final Filter f172244E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final m f172245J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f172246K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final C23038g0<List<com.avito.android.inline_filters.dialog.select.adapter.i>> f172247L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final C23038g0<com.avito.android.inline_filters.dialog.suggest.a> f172248M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f172249N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f172250O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final Handler f172251P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f172252Q;

    /* compiled from: SuggestFilterViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/suggest/o$a;", "Landroidx/lifecycle/P0$c;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements P0.c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Filter f172253a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final m f172254b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final InterfaceC35745a5 f172255c;

        @Inject
        public a(@Y61.k Filter filter, @Y61.k m mVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
            this.f172253a = filter;
            this.f172254b = mVar;
            this.f172255c = interfaceC35745a5;
        }

        @Override // androidx.lifecycle.P0.c
        @Y61.k
        public final <T extends M0> T create(@Y61.k Class<T> cls) {
            if (!cls.isAssignableFrom(o.class)) {
                throw new IllegalArgumentException("Unknown ViewModel class");
            }
            return new o(this.f172253a, this.f172254b, this.f172255c);
        }
    }

    /* compiled from: SuggestFilterViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LkA0/e;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CharSequence f172257c;

        public b(CharSequence charSequence) {
            this.f172257c = charSequence;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            o oVar = o.this;
            oVar.getClass();
            if (typedResult instanceof TypedResult.Success) {
                oVar.le(((C42560e) ((TypedResult.Success) typedResult).getResult()).a());
            } else if (typedResult instanceof TypedResult.Error) {
                oVar.f172248M.setValue(new a.b(new p(oVar, this.f172257c)));
            }
        }
    }

    /* compiled from: SuggestFilterViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f172258b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("SuggestFilterViewModel", "load suggest error", (Throwable) obj);
        }
    }

    public o(@Y61.k Filter filter, @Y61.k m mVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f172244E = filter;
        this.f172245J = mVar;
        this.f172246K = interfaceC35745a5;
        C23038g0<List<com.avito.android.inline_filters.dialog.select.adapter.i>> c23038g0 = new C23038g0<>();
        this.f172247L = c23038g0;
        C23038g0<com.avito.android.inline_filters.dialog.suggest.a> c23038g02 = new C23038g0<>();
        this.f172248M = c23038g02;
        this.f172249N = c23038g0;
        this.f172250O = c23038g02;
        this.f172251P = new Handler(Looper.getMainLooper());
        this.f172252Q = new io.reactivex.rxjava3.disposables.c();
    }

    public final void ke(@Y61.k CharSequence charSequence) {
        String strValueOf;
        List<String> list;
        Filter.Config config;
        Filter.Config config2;
        Filter.Config config3;
        Filter filter = this.f172244E;
        Filter.Widget widget = filter.getWidget();
        List<String> defaultSuggests = null;
        if (((widget == null || (config3 = widget.getConfig()) == null) ? null : config3.getCategoryId()) != null) {
            Filter.Widget widget2 = filter.getWidget();
            strValueOf = String.valueOf((widget2 == null || (config2 = widget2.getConfig()) == null) ? null : config2.getCategoryId());
        } else {
            strValueOf = null;
        }
        Filter.Widget widget3 = filter.getWidget();
        if (widget3 != null && (config = widget3.getConfig()) != null) {
            defaultSuggests = config.getDefaultSuggests();
        }
        if (charSequence.length() == 0 && (list = defaultSuggests) != null && !list.isEmpty()) {
            this.f172251P.post(new RunnableC28882d(11, this, defaultSuggests));
        } else {
            m mVar = this.f172245J;
            this.f172252Q.b(mVar.f172242a.a(charSequence, strValueOf).x0(mVar.f172243b.a()).j0(this.f172246K.e()).v0(new b(charSequence), c.f172258b, io.reactivex.rxjava3.internal.functions.a.f401993c));
        }
    }

    public final void le(List<String> list) {
        AbstractC22991Y abstractC22991Y;
        InlineFilterValue value = this.f172244E.getValue();
        G0 g02 = null;
        InlineFilterValue.InlineFilterSelectValue inlineFilterSelectValue = value instanceof InlineFilterValue.InlineFilterSelectValue ? (InlineFilterValue.InlineFilterSelectValue) value : null;
        String selectedOption = inlineFilterSelectValue != null ? inlineFilterSelectValue.getSelectedOption() : null;
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i12 = 0;
        boolean z12 = false;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            String str = (String) obj;
            boolean z13 = selectedOption != null && L.f(str, selectedOption);
            if (!z12) {
                z12 = z13;
            }
            arrayList.add(new com.avito.android.inline_filters.dialog.select.adapter.i(String.valueOf(i12), "", str, z13, InlineItemType.f172059f, null, false, null, null, null, null, null, null, null, null, null, null, null, 262112, null));
            i12 = i13;
        }
        ArrayList arrayList2 = (selectedOption == null || !(C43066x.K(selectedOption) ^ true) || z12) ? null : arrayList;
        C23038g0<List<com.avito.android.inline_filters.dialog.select.adapter.i>> c23038g0 = this.f172247L;
        if (arrayList2 != null) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(0, new com.avito.android.inline_filters.dialog.select.adapter.i("-2147483648", "", selectedOption, true, InlineItemType.f172059f, null, false, null, null, null, null, null, null, null, null, null, null, null, 262112, null));
            abstractC22991Y = c23038g0;
            abstractC22991Y.setValue(arrayList3);
            g02 = G0.f406611a;
        } else {
            abstractC22991Y = c23038g0;
        }
        if (g02 == null) {
            abstractC22991Y.setValue(arrayList);
        }
        this.f172248M.setValue(a.C5082a.f172212a);
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f172252Q.e();
    }
}
