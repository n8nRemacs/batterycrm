package com.avito.android.registration_self_employment_redirect_screen.steps_list;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: SelfEmploymentStepItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/registration_self_employment_redirect_screen/steps_list/c;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f252778b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f252779c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f252780d;

    public c(@k View view) {
        super(view);
        this.f252778b = (TextView) view.findViewById(R.id.step_number);
        this.f252779c = (TextView) view.findViewById(R.id.step_title);
        this.f252780d = (TextView) view.findViewById(R.id.step_description);
    }
}
