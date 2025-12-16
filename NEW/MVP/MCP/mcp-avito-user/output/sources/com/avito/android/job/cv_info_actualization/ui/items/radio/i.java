package com.avito.android.job.cv_info_actualization.ui.items.radio;

import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JsxCvInfoActualizationRadioView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/items/radio/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends com.avito.konveyor.adapter.b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f174311f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f174312b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f174313c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f174314d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f174315e;

    public i(@k View view) {
        super(view);
        this.f174312b = (TextView) view.findViewById(R.id.title);
        this.f174313c = (TextView) view.findViewById(R.id.subtitle);
        this.f174314d = (Button) view.findViewById(R.id.radio_action_button);
        this.f174315e = (LinearLayout) view.findViewById(R.id.radio_buttons_container);
    }
}
