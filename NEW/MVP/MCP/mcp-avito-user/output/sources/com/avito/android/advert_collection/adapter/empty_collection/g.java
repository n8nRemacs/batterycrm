package com.avito.android.advert_collection.adapter.empty_collection;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EmptyCollectionInfoView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection/adapter/empty_collection/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_collection/adapter/empty_collection/f;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f81292b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f81293c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f81294d;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f81292b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f81293c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.action_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f81294d = (Button) viewFindViewById3;
    }

    @Override // com.avito.android.advert_collection.adapter.empty_collection.f
    public final void ju(@k EmptyCollectionInfoItem emptyCollectionInfoItem) {
        this.f81292b.setText(emptyCollectionInfoItem.f81284b);
        this.f81293c.setText(emptyCollectionInfoItem.f81285c);
        this.f81294d.setVisibility(emptyCollectionInfoItem.f81286d ? 0 : 8);
    }
}
