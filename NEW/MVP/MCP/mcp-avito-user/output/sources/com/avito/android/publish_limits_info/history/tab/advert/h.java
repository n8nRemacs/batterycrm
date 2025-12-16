package com.avito.android.publish_limits_info.history.tab.advert;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HistoryAdvertItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish_limits_info/history/tab/advert/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish_limits_info/history/tab/advert/g;", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f245898b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f245899c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f245900d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f245901e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f245902f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f245903g;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f245898b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.price);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f245899c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.hint);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f245900d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.autoPublish);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f245901e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.image);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f245902f = (SimpleDraweeView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.sellerName);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f245903g = (TextView) viewFindViewById6;
    }

    @Override // com.avito.android.publish_limits_info.history.tab.advert.g
    public final void G4(@k com.avito.android.image_loader.a aVar) {
        ImageRequest.a aVarA = C35949t5.a(this.f245902f);
        aVarA.d(aVar);
        aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
        aVarA.c();
    }

    @Override // com.avito.android.publish_limits_info.history.tab.advert.g
    public final void fw(boolean z12) {
        D6.G(this.f245901e, z12);
    }

    @Override // com.avito.android.publish_limits_info.history.tab.advert.g
    public final void m1(@l String str) {
        I5.a(this.f245903g, str, false);
    }

    @Override // com.avito.android.publish_limits_info.history.tab.advert.g
    public final void p(@k String str) {
        I5.a(this.f245899c, str, false);
    }

    @Override // com.avito.android.publish_limits_info.history.tab.advert.g
    public final void setHint(@k String str) {
        I5.a(this.f245900d, str, false);
    }

    @Override // com.avito.android.publish_limits_info.history.tab.advert.g
    public final void setTitle(@k String str) {
        I5.a(this.f245898b, str, false);
    }
}
