package com.avito.android.search.filter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProgressOverlay.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/A1;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class A1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final InterfaceC28373a f261738a;

    /* renamed from: b, reason: collision with root package name */
    public final View f261739b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f261740c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f261741d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f261742e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f261743f;

    /* renamed from: g, reason: collision with root package name */
    public final Button f261744g;

    public A1(@Y61.k View view, @Y61.l InterfaceC28373a interfaceC28373a) {
        this.f261738a = interfaceC28373a;
        View viewFindViewById = view.findViewById(R.id.error_layout);
        this.f261739b = viewFindViewById;
        this.f261740c = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f261741d = (ImageView) view.findViewById(R.id.error_icon);
        TextView textView = (TextView) view.findViewById(R.id.error_title);
        textView.setGravity(1);
        this.f261742e = textView;
        this.f261743f = (TextView) view.findViewById(R.id.error_subtitle);
        this.f261744g = (Button) view.findViewById(R.id.retry_button);
        viewFindViewById.setBackgroundColor(C35835l0.d(R.attr.white, viewFindViewById.getContext()));
    }

    public final void a() {
        D6.w(this.f261739b);
        D6.H(this.f261740c);
    }

    public final void b(@Y61.k ApiError apiError) {
        boolean z12 = apiError instanceof ApiError.NetworkIOError;
        D6.H(this.f261739b);
        D6.w(this.f261740c);
        int i12 = z12 ? R.attr.img_noInternet : R.attr.img_unknownError;
        ImageView imageView = this.f261741d;
        imageView.setImageDrawable(C35835l0.h(i12, imageView.getContext()));
        this.f261742e.setText(z12 ? R.string.error_layout_no_internet : R.string.search_filter_filters_error_title);
        this.f261743f.setText(z12 ? R.string.error_layout_check_connection : R.string.search_filter_filters_error_subtitle);
        InterfaceC28373a interfaceC28373a = this.f261738a;
        if (interfaceC28373a != null) {
            interfaceC28373a.c(new com.avito.android.analytics.event.I());
        }
    }

    public /* synthetic */ A1(View view, InterfaceC28373a interfaceC28373a, int i12, C42822w c42822w) {
        this(view, (i12 & 2) != 0 ? null : interfaceC28373a);
    }
}
