package com.avito.android.profile.pro.impl.screen.item.recommendations;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import kotlin.Metadata;

/* compiled from: ProfileProRecommendationsSnippetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/recommendations/f;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f223421a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f223422b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f223423c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f223424d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f223425e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final StrikethroughTextView f223426f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f223427g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final View f223428h;

    public f(@k View view, @k com.avito.android.util.text.a aVar) {
        this.f223421a = view;
        this.f223422b = aVar;
        this.f223423c = (ImageView) view.findViewById(R.id.snippet_image);
        this.f223424d = (TextView) view.findViewById(R.id.title);
        this.f223425e = (TextView) view.findViewById(R.id.price);
        this.f223426f = (StrikethroughTextView) view.findViewById(R.id.old_price);
        this.f223427g = (TextView) view.findViewById(R.id.additional_info);
        this.f223428h = view.findViewById(R.id.divider);
    }
}
