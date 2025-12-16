package com.avito.android.job.cv_info_actualization.ui.items.error;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;

/* compiled from: JsxCvInfoActualizationErrorView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/items/error/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f174267f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f174268b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f174269c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f174270d;

    /* renamed from: e, reason: collision with root package name */
    public final Button f174271e;

    public g(@k View view) {
        super(view);
        this.f174268b = (ImageView) view.findViewById(R.id.error_icon);
        this.f174269c = (TextView) view.findViewById(R.id.error_title);
        this.f174270d = (TextView) view.findViewById(R.id.error_subtitle);
        this.f174271e = (Button) view.findViewById(R.id.error_action_button);
    }
}
