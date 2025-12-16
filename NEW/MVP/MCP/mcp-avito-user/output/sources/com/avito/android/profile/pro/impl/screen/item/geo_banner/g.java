package com.avito.android.profile.pro.impl.screen.item.geo_banner;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import i31.InterfaceC41220a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProGeoBannerItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/geo_banner/g;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f223280j = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f223281b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f223282c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f223283d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f223284e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f223285f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Button f223286g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final View f223287h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Context f223288i;

    /* compiled from: ProfileProGeoBannerItemView.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/geo_banner/g$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        g a(@k View view);
    }

    @i31.c
    public g(@InterfaceC41220a @k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f223281b = aVar;
        this.f223282c = (SimpleDraweeView) view.findViewById(R.id.geo_banner_image);
        this.f223283d = (TextView) view.findViewById(R.id.geo_banner_title);
        this.f223284e = (TextView) view.findViewById(R.id.geo_banner_subtitle);
        this.f223285f = (TextView) view.findViewById(R.id.geo_banner_address);
        this.f223286g = (Button) view.findViewById(R.id.geo_banner_button);
        this.f223287h = view.findViewById(R.id.geo_banner_close);
        this.f223288i = view.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f223286g.setOnClickListener(null);
        this.f223287h.setOnClickListener(null);
    }
}
