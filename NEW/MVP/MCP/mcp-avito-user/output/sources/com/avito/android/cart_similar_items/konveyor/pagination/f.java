package com.avito.android.cart_similar_items.konveyor.pagination;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PaginationItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/pagination/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    public final Context f115859b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Spinner f115860c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ViewGroup f115861d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f115862e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Button f115863f;

    public f(@k View view) {
        super(view);
        this.f115859b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.spinner);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f115860c = (Spinner) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.error_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        this.f115861d = viewGroup;
        View viewFindViewById3 = viewGroup.findViewById(R.id.error_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f115862e = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.retry_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f115863f = (Button) viewFindViewById4;
    }
}
