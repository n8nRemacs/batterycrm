package com.avito.android.advert_collection.adapter.title;

import Y61.k;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert_collection.adapter.title.CollectionTitleItem;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.google.android.material.shape.q;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CollectionTitleView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection/adapter/title/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_collection/adapter/title/f;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f81319b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f81320c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f81321d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Banner f81322e;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.collectionTitle);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f81319b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f81320c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f81321d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.moderationStatusBanner);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        this.f81322e = (Banner) viewFindViewById4;
    }

    @Override // com.avito.android.advert_collection.adapter.title.f
    public final void x50(@k CollectionTitleItem collectionTitleItem) {
        I5.a(this.f81319b, collectionTitleItem.f81308b, false);
        I5.a(this.f81321d, collectionTitleItem.f81310d, false);
        TextView textView = this.f81320c;
        I5.a(textView, collectionTitleItem.f81309c, false);
        CollectionTitleItem.ModerationStatusInfo moderationStatusInfo = collectionTitleItem.f81311e;
        textView.setVisibility(moderationStatusInfo == null ? 0 : 8);
        int i12 = moderationStatusInfo == null ? 8 : 0;
        Banner banner = this.f81322e;
        banner.setVisibility(i12);
        String str = moderationStatusInfo != null ? moderationStatusInfo.f81312b : null;
        if (str == null) {
            str = "";
        }
        banner.setTitle(str);
        String str2 = moderationStatusInfo != null ? moderationStatusInfo.f81313c : null;
        Integer numA = com.avito.android.lib.util.e.a(str2 != null ? str2 : "");
        if (numA != null) {
            banner.f178440k = ColorStateList.valueOf(C35835l0.d(numA.intValue(), banner.getContext()));
            banner.f178441l = null;
            q qVar = banner.f178439j;
            banner.f178439j = qVar != null ? banner.g(qVar.f(), banner.f178440k, banner.f178441l, banner.f178442m, banner.f178445p, banner.f178446q) : null;
        }
    }
}
