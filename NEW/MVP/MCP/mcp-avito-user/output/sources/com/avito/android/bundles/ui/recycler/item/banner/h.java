package com.avito.android.bundles.ui.recycler.item.banner;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VasBannerItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bundles/ui/recycler/item/banner/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/bundles/ui/recycler/item/banner/g;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f108366b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f108367c;

    @Inject
    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f108366b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f108367c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.bundles.ui.recycler.item.banner.g
    public final void f(@l String str) {
        I5.a(this.f108367c, str, false);
    }

    @Override // com.avito.android.bundles.ui.recycler.item.banner.g
    public final void setTitle(@l String str) {
        I5.a(this.f108366b, str, false);
    }
}
