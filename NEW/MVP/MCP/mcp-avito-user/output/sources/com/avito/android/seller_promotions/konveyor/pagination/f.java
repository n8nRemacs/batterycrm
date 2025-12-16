package com.avito.android.seller_promotions.konveyor.pagination;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/konveyor/pagination/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    public final Context f267820b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Spinner f267821c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ViewGroup f267822d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f267823e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Button f267824f;

    public f(@k View view) {
        super(view);
        this.f267820b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.spinner);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f267821c = (Spinner) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.error_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        this.f267822d = viewGroup;
        View viewFindViewById3 = viewGroup.findViewById(R.id.error_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f267823e = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.retry_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f267824f = (Button) viewFindViewById4;
    }
}
