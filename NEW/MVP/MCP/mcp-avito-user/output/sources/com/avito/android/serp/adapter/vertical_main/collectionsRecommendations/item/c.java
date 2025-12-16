package com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.item;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: CollectionRecommendationItemView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/collectionsRecommendations/item/c;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f272728b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f272729c;

    /* renamed from: d, reason: collision with root package name */
    public final SimpleDraweeView f272730d;

    public c(@k View view) {
        super(view);
        this.f272728b = view;
        this.f272729c = (TextView) view.findViewById(R.id.title);
        this.f272730d = (SimpleDraweeView) view.findViewById(R.id.image);
    }
}
