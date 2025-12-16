package com.avito.android.search.filter.adapter.chips;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.search.filter.RunnableC34589p;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/chips/c;", "Lcom/avito/android/search/filter/adapter/chips/b;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends com.avito.konveyor.adapter.b implements b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f262145b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Chips f262146c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f262147d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f262148e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f262149f;

    /* compiled from: ChipsItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/search/filter/adapter/chips/c$a", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ N f262150a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f262151b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super List<? extends com.avito.android.lib.design.chips.h>, G0> lVar, c cVar) {
            this.f262150a = (N) lVar;
            this.f262151b = cVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            this.f262150a.invoke(this.f262151b.f262146c.s());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            this.f262150a.invoke(this.f262151b.f262146c.s());
        }
    }

    public c(@Y61.k View view) {
        super(view);
        this.f262145b = view;
        View viewFindViewById = view.findViewById(R.id.chips);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        Chips chips = (Chips) viewFindViewById;
        this.f262146c = chips;
        View viewFindViewById2 = chips.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f262147d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.show_more);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById3;
        this.f262148e = textView;
        textView.setOnClickListener(new com.avito.android.review_gallery.g(this, 11));
    }

    public final CharSequence B80(CharSequence charSequence, String str) {
        Integer numM;
        if (str == null || (numM = com.avito.android.lib.util.f.m(str)) == null) {
            return charSequence;
        }
        int iIntValue = numM.intValue();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f262146c.getContext(), R.style.Theme_DesignSystem_Re23);
        FV.a aVar = FV.a.f4720a;
        int iB2 = y6.b(5);
        aVar.getClass();
        return FV.a.i(charSequence, contextThemeWrapper, iIntValue, iB2);
    }

    @Override // com.avito.android.search.filter.adapter.chips.b
    public final void G() {
        this.f262146c.setErrorOnTop(null);
    }

    @Override // com.avito.android.search.filter.adapter.chips.b
    public final void O60(@Y61.l String str) {
        this.f262146c.setAppearanceFromAttr(str != null ? com.avito.android.lib.util.f.e(str) : R.attr.chipsMedium);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.avito.android.search.filter.adapter.chips.a] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.avito.android.lib.design.chips.h] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.avito.android.search.filter.adapter.chips.a] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.avito.android.lib.design.chips.h] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    @Override // com.avito.android.search.filter.adapter.chips.b
    public final void Or(@Y61.k List<? extends com.avito.android.lib.design.chips.h> list, @Y61.l List<? extends com.avito.android.lib.design.chips.h> list2) {
        ArrayList arrayList;
        List<? extends com.avito.android.lib.design.chips.h> list3 = list;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
        Iterator it = list3.iterator();
        while (true) {
            arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            ?? A12 = (com.avito.android.lib.design.chips.h) it.next();
            com.avito.android.search.filter.adapter.chips.a aVar = A12 instanceof com.avito.android.search.filter.adapter.chips.a ? (com.avito.android.search.filter.adapter.chips.a) A12 : null;
            if (aVar != null) {
                A12 = com.avito.android.search.filter.adapter.chips.a.a(aVar, B80(A12.getF262141c(), ((com.avito.android.search.filter.adapter.chips.a) A12).f262144f));
            }
            arrayList2.add(A12);
        }
        if (list2 != null) {
            List<? extends com.avito.android.lib.design.chips.h> list4 = list2;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                ?? A13 = (com.avito.android.lib.design.chips.h) it2.next();
                com.avito.android.search.filter.adapter.chips.a aVar2 = A13 instanceof com.avito.android.search.filter.adapter.chips.a ? (com.avito.android.search.filter.adapter.chips.a) A13 : null;
                if (aVar2 != null) {
                    A13 = com.avito.android.search.filter.adapter.chips.a.a(aVar2, B80(A13.getF262141c(), ((com.avito.android.search.filter.adapter.chips.a) A13).f262144f));
                }
                arrayList3.add(A13);
            }
            arrayList = arrayList3;
        }
        Chips chips = this.f262146c;
        chips.setData(arrayList2);
        chips.j();
        if (arrayList != null) {
            chips.r(arrayList);
            com.avito.android.lib.design.chips.h hVar = (com.avito.android.lib.design.chips.h) C42745f0.G(arrayList);
            if (hVar != null) {
                chips.post(new RunnableC34589p(3, this, hVar));
            }
        }
    }

    @Override // com.avito.android.search.filter.adapter.chips.b
    public final void c3(boolean z12) {
        this.f262146c.setTitleEnabled(z12);
    }

    @Override // com.avito.android.search.filter.adapter.chips.b
    public final void i2(boolean z12) {
        this.f262146c.setKeepSelected(z12);
    }

    @Override // com.avito.android.search.filter.adapter.chips.b
    public final void lp(@Y61.l String str) {
        I5.a(this.f262148e, str, false);
    }

    @Override // com.avito.android.search.filter.adapter.chips.b
    public final void m2(@Y61.k Chips.DisplayType displayType) {
        Chips chips = this.f262146c;
        if (chips.getDisplayType() != displayType) {
            chips.setDisplayType(displayType);
        }
    }

    @Override // com.avito.android.search.filter.adapter.chips.b
    public final void m4(int i12) {
        int iB2 = y6.b(i12);
        View view = this.f262145b;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iB2);
    }

    @Override // com.avito.android.search.filter.adapter.chips.b
    public final void oO(@Y61.k Y41.l<? super List<? extends com.avito.android.lib.design.chips.h>, G0> lVar) {
        this.f262146c.setChipsSelectedListener(new a(lVar, this));
    }

    @Override // com.avito.android.search.filter.adapter.chips.b
    public final void r3(@Y61.k SelectStrategy selectStrategy) {
        this.f262146c.setSelectStrategy(selectStrategy);
    }

    @Override // com.avito.android.search.filter.adapter.chips.b
    public final void ra() {
        View view = this.f262145b;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), D6.t(view, R.dimen.filter_item_compensation_vertical));
    }

    @Override // com.avito.android.search.filter.adapter.chips.b
    public final void setError(@Y61.k String str) {
        this.f262146c.setErrorOnTop(str);
    }

    @Override // com.avito.android.search.filter.adapter.chips.b
    public final void setTitle(@Y61.k String str) {
        this.f262146c.setTitle(str);
    }

    @Override // com.avito.android.search.filter.adapter.chips.b
    public final void setTopPadding(int i12) {
        int iB2 = y6.b(i12);
        View view = this.f262145b;
        view.setPadding(view.getPaddingLeft(), iB2, view.getPaddingRight(), view.getPaddingBottom());
    }

    @Override // com.avito.android.search.filter.adapter.chips.b
    public final void t8() {
        View view = this.f262145b;
        view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
    }

    @Override // com.avito.android.search.filter.adapter.chips.b
    public final void vH(@Y61.l Y41.a<G0> aVar) {
        this.f262149f = aVar;
    }

    @Override // com.avito.android.search.filter.adapter.chips.b
    public final void wi(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f262147d;
        textView.setMovementMethod(linkMovementMethod);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f262146c.getContext(), R.style.Theme_DesignSystem_Re23);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        FV.a aVar2 = FV.a.f4720a;
        int iB2 = y6.b(5);
        aVar2.getClass();
        String strN = com.avito.android.lib.util.f.n(R.attr.textIconQuestionFilled, contextThemeWrapper);
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append(strN == null ? str : FV.a.d(str, strN, iB2, aVar));
        com.avito.android.lib.design.text_view.d dVar = com.avito.android.lib.design.text_view.d.f180938a;
        int iJ2 = C35835l0.j(R.attr.textH50, contextThemeWrapper);
        dVar.getClass();
        spannableStringBuilderAppend.setSpan(new PK0.p(PK0.n.a(com.avito.android.lib.design.text_view.d.a(iJ2, contextThemeWrapper), null, null, null, null, null, new C35763c0(C35835l0.d(R.attr.gray28, contextThemeWrapper), null, null, null, 14, null), null, null, null, 8063)), 0, spannableStringBuilderAppend.length(), 33);
        I5.a(textView, spannableStringBuilderAppend, false);
    }
}
