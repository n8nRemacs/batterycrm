package com.avito.android.job.cv_info_actualization.mvi.action_handler;

import Y61.k;
import com.avito.android.job.cv_info_actualization.mvi.domain.g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: JsxCvInfoActualizationLoadInitialInfoActionHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/action_handler/c;", "", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f174096a;

    @Inject
    public c(@k g gVar) {
        this.f174096a = gVar;
    }

    @k
    public final C43152f0 a() {
        return new C43152f0(C43175k.G(new a(this, null)), new b(3, null));
    }
}
