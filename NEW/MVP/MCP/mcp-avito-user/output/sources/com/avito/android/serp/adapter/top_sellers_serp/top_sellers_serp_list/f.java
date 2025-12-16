package com.avito.android.serp.adapter.top_sellers_serp.top_sellers_serp_list;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: TopSellerSerpView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/top_sellers_serp/top_sellers_serp_list/f;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f272503e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f272504b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f272505c;

    /* renamed from: d, reason: collision with root package name */
    public final SimpleDraweeView f272506d;

    public f(@k View view) {
        super(view);
        this.f272504b = view;
        this.f272505c = (TextView) view.findViewById(R.id.title);
        this.f272506d = (SimpleDraweeView) view.findViewById(R.id.icon);
    }
}
