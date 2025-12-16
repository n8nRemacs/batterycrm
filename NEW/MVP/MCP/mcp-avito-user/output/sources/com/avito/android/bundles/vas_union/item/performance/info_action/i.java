package com.avito.android.bundles.vas_union.item.performance.info_action;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.blueprint.date.interval.j;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InfoActionItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/performance/info_action/i;", "Lcom/avito/android/bundles/vas_union/item/performance/info_action/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f108620d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f108621b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f108622c;

    public i(@k View view) {
        super(view);
        this.f108621b = view;
        View viewFindViewById = view.findViewById(R.id.info_action);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f108622c = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.bundles.vas_union.item.performance.info_action.h
    public final void c(@k Y41.a<G0> aVar) {
        this.f108621b.setOnClickListener(new j(26, aVar));
    }

    @Override // com.avito.android.bundles.vas_union.item.performance.info_action.h
    public final void setTitle(@k String str) {
        I5.a(this.f108622c, str, false);
    }
}
