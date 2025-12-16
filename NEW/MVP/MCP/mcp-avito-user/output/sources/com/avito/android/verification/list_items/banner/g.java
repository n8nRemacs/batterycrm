package com.avito.android.verification.list_items.banner;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BannerItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/list_items/banner/g;", "LJM0/a;", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends JM0.a {

    /* renamed from: c, reason: collision with root package name */
    public final Context f324794c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Banner f324795d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f324796e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f324797f;

    public g(@k View view) {
        super(view);
        this.f324794c = this.itemView.getContext();
        View view2 = this.itemView;
        this.f324795d = (Banner) view2;
        this.f324796e = (TextView) view2.findViewById(R.id.verification_item_banner_content_title);
        this.f324797f = (TextView) this.itemView.findViewById(R.id.verification_item_banner_content_body);
    }
}
