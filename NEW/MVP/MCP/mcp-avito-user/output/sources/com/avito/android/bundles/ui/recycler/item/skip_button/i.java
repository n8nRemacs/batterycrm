package com.avito.android.bundles.ui.recycler.item.skip_button;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BundleSkipButtonItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bundles/ui/recycler/item/skip_button/i;", "Lcom/avito/android/bundles/ui/recycler/item/skip_button/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f108440c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f108441b;

    @Inject
    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.skip_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f108441b = (Button) viewFindViewById;
    }

    @Override // com.avito.android.bundles.ui.recycler.item.skip_button.h
    public final void a0(@k Y41.a<G0> aVar) {
        this.f108441b.setOnClickListener(new com.avito.android.blueprint.date.interval.j(25, aVar));
    }

    @Override // com.avito.android.bundles.ui.recycler.item.skip_button.h
    public final void setTitle(@k String str) {
        this.f108441b.setText(str);
    }
}
