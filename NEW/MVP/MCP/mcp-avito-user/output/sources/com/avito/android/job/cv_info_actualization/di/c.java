package com.avito.android.job.cv_info_actualization.di;

import Y41.l;
import Y61.k;
import com.avito.android.analytics.screens.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.job.cv_info_actualization.ui.JsxCvInfoActualizationActivity;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: JsxCvInfoActualizationComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/di/c;", "", "a", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes14.dex */
public interface c {

    /* compiled from: JsxCvInfoActualizationComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/di/c$a;", "", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        c a(@k d dVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k @com.avito.android.job.cv_info_actualization.di.a String str, @h31.b @k r rVar, @h31.b @k l lVar, @h31.b @Y61.l DeepLink deepLink);
    }

    void a(@k JsxCvInfoActualizationActivity jsxCvInfoActualizationActivity);
}
