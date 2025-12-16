package com.avito.android.advert_stats.item.details;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: StatDetailItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/item/details/g;", "Lcom/avito/android/advert_stats/item/details/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f86746b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f86747c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f86748d;

    public g(@k View view) {
        super(view);
        this.f86746b = (SimpleDraweeView) view.findViewById(R.id.icon);
        this.f86747c = (TextView) view.findViewById(R.id.title);
        this.f86748d = false;
    }

    @Override // com.avito.android.advert_stats.item.details.f
    public final void DY(boolean z12) {
        this.f86748d = z12;
    }

    @Override // com.avito.android.advert_stats.item.details.f
    public final void Ri(boolean z12, boolean z13) {
        TextView textView = this.f86747c;
        if (z12) {
            D6.g(textView);
        } else {
            D6.H(textView);
        }
        SimpleDraweeView simpleDraweeView = this.f86746b;
        if (!z13 || z12) {
            D6.w(simpleDraweeView);
        } else {
            D6.H(simpleDraweeView);
        }
    }

    @Override // com.avito.android.advert_stats.item.details.f
    public final void Uy() {
        D6.w(this.f86746b);
    }

    @Override // com.avito.android.advert_stats.item.details.f
    /* renamed from: jP, reason: from getter */
    public final boolean getF86748d() {
        return this.f86748d;
    }

    @Override // com.avito.android.advert_stats.item.details.f
    public final void setText(@k String str) {
        this.f86747c.setText(str);
    }

    @Override // com.avito.android.advert_stats.item.details.f
    public final void tm(int i12) {
        SimpleDraweeView simpleDraweeView = this.f86746b;
        simpleDraweeView.setImageResource(i12);
        D6.H(simpleDraweeView);
    }

    @Override // com.avito.android.advert_stats.item.details.f
    public final void x(@k com.avito.android.image_loader.k kVar) {
        SimpleDraweeView simpleDraweeView = this.f86746b;
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(kVar);
        aVarA.c();
        D6.H(simpleDraweeView);
    }
}
