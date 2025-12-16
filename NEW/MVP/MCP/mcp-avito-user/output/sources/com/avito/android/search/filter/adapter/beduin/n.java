package com.avito.android.search.filter.adapter.beduin;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/beduin/n;", "Lcom/avito/android/search/filter/adapter/beduin/l;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f261992d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Input f261993b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f261994c;

    public n(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.select_filter_input);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f261993b = (Input) viewFindViewById;
        this.f261994c = (ComponentContainer) view;
    }

    @Override // com.avito.android.search.filter.adapter.beduin.l
    public final void J4(int i12) {
        this.f261993b.setRightIcon(C35835l0.h(R.attr.ic_arrowDown20, this.f261994c.getContext()));
    }

    @Override // com.avito.android.search.filter.adapter.beduin.l
    public final void Sa(@Y61.k final Y41.a aVar) {
        Drawable drawableH = C35835l0.h(R.attr.ic_close16, this.f261994c.getContext());
        Input input = this.f261993b;
        input.setRightIcon(drawableH);
        input.setRightIconListener(new View.OnClickListener() { // from class: com.avito.android.search.filter.adapter.beduin.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Input.t(this.f261990b.f261993b, "", false, 6);
                ((f) aVar).invoke();
            }
        });
    }

    @Override // com.avito.android.search.filter.adapter.beduin.l
    public final void a(@Y61.k Y41.a<G0> aVar) {
        com.avito.android.saved_searches.presentation.items.switcher.l lVar = new com.avito.android.saved_searches.presentation.items.switcher.l(7, aVar);
        Input input = this.f261993b;
        input.setOnClickListener(lVar);
        input.setRightIconListener(new com.avito.android.saved_searches.presentation.items.switcher.l(8, aVar));
    }

    @Override // com.avito.android.search.filter.adapter.beduin.l
    public final void m(@Y61.l String str) {
        if (str == null) {
            str = "";
        }
        Input.t(this.f261993b, str, false, 6);
    }

    @Override // com.avito.android.search.filter.adapter.beduin.l
    public final void o(@Y61.l String str) {
        this.f261993b.setHint(str);
    }

    @Override // com.avito.android.search.filter.adapter.beduin.l
    public final void setTitle(@Y61.k String str) {
        this.f261994c.setTitle(str);
    }
}
