package com.avito.android.bundles.vas_union.item.performance.vas;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.blueprint.date.interval.j;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PerformanceVasItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/performance/vas/i;", "Lcom/avito/android/bundles/vas_union/item/performance/vas/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f108656i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f108657b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f108658c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f108659d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f108660e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f108661f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleDraweeView f108662g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SimpleDraweeView f108663h;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f108657b = view;
        this.f108658c = aVar;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f108659d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.price);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f108660e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.price_old);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f108661f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f108662g = (SimpleDraweeView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.lightning_icon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f108663h = (SimpleDraweeView) viewFindViewById5;
    }

    @Override // com.avito.android.bundles.vas_union.item.performance.vas.h
    public final void L(@l AttributedText attributedText) {
        I5.a(this.f108660e, this.f108658c.c(this.f108657b.getContext(), attributedText), false);
    }

    @Override // com.avito.android.bundles.vas_union.item.performance.vas.h
    public final void Z0(@l AttributedText attributedText) {
        I5.a(this.f108661f, this.f108658c.c(this.f108657b.getContext(), attributedText), false);
    }

    @Override // com.avito.android.bundles.vas_union.item.performance.vas.h
    public final void c(@k Y41.a<G0> aVar) {
        this.f108657b.setOnClickListener(new j(27, aVar));
    }

    @Override // com.avito.android.bundles.vas_union.item.performance.vas.h
    public final void setTitle(@k String str) {
        this.f108659d.setText(str);
    }

    @Override // com.avito.android.bundles.vas_union.item.performance.vas.h
    public final void x(@k com.avito.android.image_loader.k kVar) {
        ImageRequest.a aVarA = C35949t5.a(this.f108662g);
        aVarA.d(kVar);
        aVarA.c();
    }

    @Override // com.avito.android.bundles.vas_union.item.performance.vas.h
    public final void x1(@l com.avito.android.image_loader.a aVar) {
        SimpleDraweeView simpleDraweeView = this.f108663h;
        if (aVar == null) {
            simpleDraweeView.setVisibility(4);
            return;
        }
        simpleDraweeView.setVisibility(0);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(aVar);
        aVarA.c();
    }
}
