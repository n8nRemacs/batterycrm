package com.avito.android.serp.adapter.vertical_main.cv.cv_display;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.cv_snippet.CvSnippet;
import com.avito.android.di.module.C30070i4;
import com.avito.android.remote.model.cv.CvDisplayWidget;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CvDisplayItemConverter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/cv/cv_display/c;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.date_time_formatter.b f272782a;

    @Inject
    public c(@C30070i4.f @k com.avito.android.date_time_formatter.b bVar) {
        this.f272782a = bVar;
    }

    @k
    public final CvDisplayItem a(@k CvDisplayWidget cvDisplayWidget) {
        return new CvDisplayItem(String.valueOf(cvDisplayWidget.getItem().getId()), cvDisplayWidget.getTitle(), new CvSnippet(String.valueOf(cvDisplayWidget.getItem().getId()), cvDisplayWidget.getItem().getImage(), cvDisplayWidget.getItem().getTitle(), cvDisplayWidget.getItem().getSalary(), cvDisplayWidget.getItem().getBadgeBar(), this.f272782a.a(cvDisplayWidget.getItem().getUpdatedTime(), TimeUnit.SECONDS), cvDisplayWidget.getItem().getStats(), cvDisplayWidget.getItem().getStatus(), cvDisplayWidget.getItem().getSubStatus(), cvDisplayWidget.getItem().getSnippetDeeplink(), cvDisplayWidget.getItem().getEditDeeplink()), cvDisplayWidget.getAction(), cvDisplayWidget.getAnalytics(), cvDisplayWidget.getSettings());
    }
}
