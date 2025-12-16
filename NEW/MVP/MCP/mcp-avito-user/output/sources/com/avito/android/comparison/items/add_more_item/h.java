package com.avito.android.comparison.items.add_more_item;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.calltracking.item.m;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AddMoreView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comparison/items/add_more_item/h;", "Lcom/avito/android/comparison/items/add_more_item/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f123925e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f123926b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f123927c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f123928d;

    public h(@k View view) {
        super(view);
        this.f123926b = view;
        View viewFindViewById = view.findViewById(R.id.add_more_expanded_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f123927c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.add_more_text_collapsed);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f123928d = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.comparison.items.add_more_item.g
    public final void Cj(@k String str, @k Y41.a<G0> aVar) {
        I5.a(this.f123927c, str, false);
        I5.a(this.f123928d, str, false);
        this.f123926b.setOnClickListener(new m(21, aVar));
    }
}
