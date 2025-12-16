package com.avito.android.search.filter.adapter.keywords;

import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.s;
import com.avito.android.remote.model.category_parameters.Badge;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: KeywordsItemView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/adapter/keywords/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/search/filter/adapter/keywords/g;", "a", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f262455i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.search.filter.adapter.keywords.chips.d f262456b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f262457c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f262458d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Input f262459e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f262460f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.i f262461g;

    /* renamed from: h, reason: collision with root package name */
    public int f262462h;

    /* compiled from: KeywordsItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/search/filter/adapter/keywords/h$a;", "", "<init>", "()V", "", "DEFAULT_CHAR_LIMIT", "I", "DEFAULT_OPTIONS_LIMIT", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: KeywordsItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f262463b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super Integer, G0> lVar) {
            this.f262463b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f262463b.invoke(Integer.valueOf(((Number) obj).intValue()));
        }
    }

    static {
        new a(null);
    }

    public h(@Y61.k View view, @Y61.l com.avito.android.search.filter.adapter.keywords.chips.d dVar) {
        super(view);
        this.f262456b = dVar;
        this.f262457c = (TextView) view.findViewById(R.id.keywords_title);
        this.f262458d = (ImageView) view.findViewById(R.id.keywords_title_tip_icon);
        Input input = (Input) view.findViewById(R.id.keywords_input);
        this.f262459e = input;
        this.f262461g = new io.reactivex.rxjava3.disposables.i(0);
        this.f262462h = 3;
        int i12 = D6.i(20, view.getContext());
        int i13 = D6.i(12, view.getContext());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.keywords_chips);
        recyclerView.setLayoutManager(new FlexboxLayoutManager(view.getContext()));
        recyclerView.setAdapter(dVar);
        recyclerView.setItemAnimator(null);
        recyclerView.l(new com.avito.android.search.filter.adapter.keywords.chips.e(), -1);
        input.m(i12, i12);
        View viewFindViewById = input.findViewById(R.id.design_input_right_container);
        if (viewFindViewById != null) {
            D6.c(viewFindViewById, null, Integer.valueOf(i13), Integer.valueOf(i13), null, 9);
        }
    }

    @Override // com.avito.android.search.filter.adapter.keywords.g
    public final void B(@Y61.k List<String> list) {
        com.avito.android.search.filter.adapter.keywords.chips.d dVar = this.f262456b;
        if (dVar == null) {
            dVar = null;
        }
        if (dVar != null) {
            dVar.B(list);
        }
    }

    @Override // com.avito.android.search.filter.adapter.keywords.g
    public final void EE(int i12) {
        this.f262462h = i12;
    }

    @Override // com.avito.android.search.filter.adapter.keywords.g
    public final void GX(@Y61.k String str, @Y61.l Badge badge) {
        TextView textView = this.f262457c;
        if (badge == null) {
            textView.setText(str);
            return;
        }
        String title = badge.getTitle();
        String titleColor = badge.getTitleColor();
        String backgroundColor = badge.getBackgroundColor();
        textView.setText(com.avito.android.lib.design.badge.e.b(C43066x.a0(C43066x.a0("$\\text $\\badgeText", "$\\text", str, false), "$\\badgeText", title.toString(), false), title, textView.getContext(), R.style.Re23_Badge_TextRedM, titleColor, backgroundColor));
    }

    @Override // com.avito.android.search.filter.adapter.keywords.g
    /* renamed from: Iu, reason: from getter */
    public final int getF262462h() {
        return this.f262462h;
    }

    @Override // com.avito.android.search.filter.adapter.keywords.g
    public final void SC(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f262459e.setOnFocusChangeListener(new com.avito.android.advert.item.icebreakers.n(5, lVar));
    }

    @Override // com.avito.android.search.filter.adapter.keywords.g
    public final void W() {
        K2.d(this.f262459e, false);
    }

    @Override // com.avito.android.search.filter.adapter.keywords.g
    public final void YY(boolean z12) {
        this.f262457c.setEnabled(z12);
        this.f262459e.setEnabled(z12);
    }

    @Override // com.avito.android.search.filter.adapter.keywords.g
    public final void cV(@Y61.l Y41.a<G0> aVar) {
        ImageView imageView = this.f262458d;
        D6.a(aVar, imageView);
        if (aVar != null) {
            D6.H(imageView);
        } else {
            D6.w(imageView);
        }
    }

    @Override // com.avito.android.search.filter.adapter.keywords.g
    public final void dF(@Y61.k Y41.l<? super String, G0> lVar) {
        com.avito.android.search.filter.adapter.keywords.a aVar = new com.avito.android.search.filter.adapter.keywords.a(lVar, this, 1);
        Input input = this.f262459e;
        input.setRightIconListener(aVar);
        input.setOnEditorActionListener(new com.avito.android.search.filter.adapter.keywords.b(lVar, this, 1));
    }

    @Override // com.avito.android.search.filter.adapter.keywords.g
    public final void eR(@Y61.k s sVar) {
        this.f262459e.b(sVar);
    }

    @Override // com.avito.android.search.filter.adapter.keywords.g
    public final void ib(@Y61.l Integer num) {
        Input input = this.f262459e;
        if (num != null) {
            input.setRightIcon(num.intValue());
        } else {
            input.setRightIcon((Drawable) null);
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f262461g.a(null);
        Y41.a<G0> aVar = this.f262460f;
        if (aVar != null) {
            ((m) aVar).invoke();
        }
        this.f262460f = null;
    }

    @Override // com.avito.android.search.filter.adapter.keywords.g
    public final void mh(@Y61.l Integer num) {
        this.f262459e.setFilters(new InputFilter[]{new InputFilter.LengthFilter(num != null ? num.intValue() : 30)});
    }

    @Override // com.avito.android.search.filter.adapter.keywords.g
    public final void rf(@Y61.k s sVar) {
        this.f262459e.h(sVar);
    }

    @Override // com.avito.android.search.filter.adapter.keywords.g
    public final void setHint(@Y61.l String str) {
        this.f262459e.setHint(str);
    }

    @Override // com.avito.android.search.filter.adapter.keywords.g
    public final void t(@Y61.k Y41.a<G0> aVar) {
        this.f262460f = aVar;
    }

    @Override // com.avito.android.search.filter.adapter.keywords.g
    public final void y0(@Y61.k String str) {
        Input.t(this.f262459e, str, false, 4);
    }

    @Override // com.avito.android.search.filter.adapter.keywords.g
    public final void yE(@Y61.k Y41.l<? super Integer, G0> lVar) {
        com.avito.android.search.filter.adapter.keywords.chips.d dVar = this.f262456b;
        if (dVar == null) {
            dVar = null;
        }
        this.f262461g.a(dVar != null ? dVar.h().t0(new b(lVar)) : null);
    }
}
