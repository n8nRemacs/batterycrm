package com.avito.android.search_suggest;

import Pp0.InterfaceC14824b;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.graphics.C22767g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.Input;
import com.avito.android.search_suggest.SearchSuggestFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.y6;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;
import wK0.AbstractC49526a;

/* compiled from: SearchSuggestView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/v;", "Lcom/avito/android/search_suggest/n;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f264369a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f264370b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f264371c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC14824b, G0> f264372d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f264373e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f264374f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f264375g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public Input f264376h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public View f264377i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Chips f264378j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Chips f264379k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f264380l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final a f264381m;

    /* renamed from: n, reason: collision with root package name */
    public int f264382n;

    /* renamed from: o, reason: collision with root package name */
    public int f264383o;

    /* compiled from: SearchSuggestView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/search_suggest/v$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            if (i12 == 1) {
                v vVar = v.this;
                if (vVar.f264376h.f179340l.isFocused()) {
                    K2.f(vVar.f264376h, 3);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(@Y61.k ViewGroup viewGroup, @Y61.k String str, boolean z12, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k Y41.l<? super InterfaceC14824b, G0> lVar) {
        this.f264369a = viewGroup;
        this.f264370b = str;
        this.f264371c = dVar;
        this.f264372d = lVar;
        View viewFindViewById = viewGroup.findViewById(R.id.dismiss_text_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        this.f264373e = textView;
        View viewFindViewById2 = viewGroup.findViewById(R.id.input_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById2;
        this.f264374f = viewGroup2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.search_suggest_root);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f264375g = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.search_input);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f264376h = (Input) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.design_input_left_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f264377i = viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.bubbles_recycler_view);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f264378j = (Chips) viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(R.id.history_chips);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f264379k = (Chips) viewFindViewById7;
        View viewFindViewById8 = viewGroup.findViewById(R.id.suggests_recycler_view);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById8;
        this.f264380l = recyclerView;
        viewGroup.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        a aVar = new a();
        this.f264381m = aVar;
        this.f264382n = C35835l0.d(R.attr.gray36, this.f264376h.getContext());
        this.f264383o = C35835l0.d(R.attr.black, this.f264376h.getContext());
        viewGroup2.setPadding(y6.b(z12 ? 12 : 16), viewGroup2.getPaddingTop(), viewGroup2.getPaddingRight(), viewGroup2.getPaddingBottom());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(dVar);
        RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f53829c = 0L;
        }
        RecyclerView.j itemAnimator2 = recyclerView.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.f53830d = 0L;
        }
        RecyclerView.j itemAnimator3 = recyclerView.getItemAnimator();
        if (itemAnimator3 != null) {
            itemAnimator3.f53831e = 0L;
        }
        RecyclerView.j itemAnimator4 = recyclerView.getItemAnimator();
        if (itemAnimator4 != null) {
            itemAnimator4.f53832f = 0L;
        }
        recyclerView.l(new com.avito.android.search_view.f(viewGroup.getContext()), -1);
        recyclerView.l(new com.avito.android.list.list_snippet.d(viewGroup.getResources()), -1);
        recyclerView.l(new com.avito.android.search_view.d(viewGroup.getResources()), -1);
        recyclerView.o(aVar);
        textView.setBackground(new RippleDrawable(ColorStateList.valueOf(C22767g.i(C35835l0.d(R.attr.warmGray100, textView.getContext()), 21)), null, C43852a.a(viewGroup.getContext(), R.drawable.rect_mask_radius_3)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.search_suggest.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f264361b.f264372d.invoke(InterfaceC14824b.a.f13306a);
            }
        });
        a();
    }

    public final void a() {
        this.f264376h.setHint(this.f264370b);
        View viewFindViewById = this.f264369a.findViewById(R.id.design_input_left_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f264377i = viewFindViewById;
        Drawable drawableH = C35835l0.h(R.attr.ic_search20, viewFindViewById.getContext());
        int iB2 = y6.b(22) + (drawableH != null ? drawableH.getIntrinsicWidth() : y6.b(24));
        this.f264376h.k(iB2, iB2);
        D6.f(this.f264377i, y6.b(16), 0, y6.b(6), 0, 10);
        Input input = this.f264376h;
        input.setLeftIcon(C35835l0.h(R.attr.ic_search20, input.getContext()));
        D6.f(this.f264376h.findViewById(R.id.design_input_left_icon), 0, y6.b(8), 0, 0, 13);
        this.f264376h.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.avito.android.search_suggest.p
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
                if (i12 != 3) {
                    return false;
                }
                v vVar = this.f264362b;
                ((SearchSuggestFragment.c) vVar.f264372d).invoke(new InterfaceC14824b.c(vVar.f264376h.getDeformattedText()));
                return true;
            }
        });
        this.f264376h.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.avito.android.search_suggest.q
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z12) {
                v vVar = this.f264363b;
                if (z12) {
                    vVar.f264376h.v();
                } else {
                    K2.d(vVar.f264376h, true);
                }
            }
        });
    }

    public final void b(@InterfaceC42156l int i12, @InterfaceC42156l int i13, @InterfaceC42156l int i14, @InterfaceC42156l int i15, @InterfaceC42156l int i16, @Y61.l ColorStateList colorStateList, @Y61.l ColorStateList colorStateList2, @Y61.l ColorStateList colorStateList3) {
        this.f264374f.setBackgroundColor(i12);
        this.f264375g.setBackgroundColor(i12);
        TextView textView = this.f264373e;
        textView.setTextColor(i13);
        textView.setBackground(colorStateList != null ? new RippleDrawable(colorStateList, null, C43852a.a(textView.getContext(), R.drawable.rect_mask_radius_3)) : null);
        Input input = this.f264376h;
        input.setEditTextBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, colorStateList3, null, input.getContext().getResources().getDimensionPixelSize(R.dimen.input_corner_radius), null, 0, 120));
        input.setTextColor(i14);
        input.setHintTextColor(colorStateList2);
        input.setClearButtonTint(ColorStateList.valueOf(i14));
        this.f264382n = i15;
        this.f264383o = i16;
        Editable editableM53getText = this.f264376h.m53getText();
        if (editableM53getText == null || editableM53getText.length() == 0) {
            this.f264376h.setLeftIconColor(this.f264382n);
        } else {
            this.f264376h.setLeftIconColor(this.f264383o);
        }
    }
}
