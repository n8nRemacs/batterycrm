package com.avito.android.services_onboarding.step;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServicesOnboardingStepItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_onboarding/step/c;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f279972b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f279973c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f279974d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f279975e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f279976f;

    public c(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f279972b = view;
        this.f279973c = aVar;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f279974d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f279975e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f279976f = (SimpleDraweeView) viewFindViewById3;
    }
}
