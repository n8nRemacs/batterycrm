package com.avito.android.job.cv_info_actualization.ui.items.checkbox;

import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JsxCvInfoActualizationCheckboxView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/items/checkbox/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f174232e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f174233b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f174234c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f174235d;

    public g(@k View view) {
        super(view);
        this.f174233b = (TextView) view.findViewById(R.id.title);
        this.f174234c = (TextView) view.findViewById(R.id.subtitle);
        this.f174235d = (LinearLayout) view.findViewById(R.id.checkboxes_container);
    }
}
