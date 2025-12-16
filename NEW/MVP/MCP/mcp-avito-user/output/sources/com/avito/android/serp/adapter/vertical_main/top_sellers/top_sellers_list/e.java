package com.avito.android.serp.adapter.vertical_main.top_sellers.top_sellers_list;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: TopSellerView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/top_sellers/top_sellers_list/e;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f273278b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f273279c;

    /* renamed from: d, reason: collision with root package name */
    public final SimpleDraweeView f273280d;

    public e(@k View view) {
        super(view);
        this.f273278b = view;
        this.f273279c = (TextView) view.findViewById(R.id.title);
        this.f273280d = (SimpleDraweeView) view.findViewById(R.id.icon);
    }
}
