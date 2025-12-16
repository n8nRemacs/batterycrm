package com.avito.android.inline_filters.dialog.category_nodes;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProgressOverlay.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_nodes/C;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f171383a;

    /* renamed from: b, reason: collision with root package name */
    public final View f171384b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f171385c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f171386d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f171387e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f171388f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f171389g;

    /* renamed from: h, reason: collision with root package name */
    public final Button f171390h;

    public C(@Y61.k View view) throws Resources.NotFoundException {
        this.f171383a = view;
        View viewFindViewById = view.findViewById(R.id.error_layout);
        this.f171384b = viewFindViewById;
        this.f171385c = (RecyclerView) view.findViewById(R.id.filter_options_recycler_view);
        View viewFindViewById2 = view.findViewById(R.id.progress);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f171386d = viewFindViewById2;
        this.f171387e = (ImageView) view.findViewById(R.id.error_icon);
        TextView textView = (TextView) view.findViewById(R.id.error_title);
        textView.setGravity(1);
        this.f171388f = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.error_subtitle);
        this.f171389g = textView2;
        Button button = (Button) view.findViewById(R.id.retry_button);
        this.f171390h = button;
        viewFindViewById.setBackgroundColor(C35835l0.d(R.attr.white, viewFindViewById.getContext()));
        D6.c(viewFindViewById, 0, 60, 0, null, 8);
        D6.c(textView2, Integer.valueOf(y6.b(24)), null, Integer.valueOf(y6.b(24)), null, 10);
        button.setAppearance(R.style.Re23_Button_PrimaryLarge);
    }
}
