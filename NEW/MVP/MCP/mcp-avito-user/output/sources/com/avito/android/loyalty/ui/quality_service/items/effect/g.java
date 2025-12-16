package com.avito.android.loyalty.ui.quality_service.items.effect;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: EffectItemView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/effect/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f183822g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f183823b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f183824c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f183825d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f183826e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f183827f;

    public g(@k View view) {
        super(view);
        this.f183823b = view.getContext();
        this.f183824c = (TextView) view.findViewById(R.id.item_effect_hint);
        this.f183825d = (TextView) view.findViewById(R.id.item_effect_title);
        this.f183826e = (TextView) view.findViewById(R.id.item_effect_description);
        this.f183827f = (SimpleDraweeView) this.itemView.findViewById(R.id.item_effect_image);
        view.setClipToOutline(true);
    }
}
