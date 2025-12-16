package com.avito.android.work_time_sheet.link;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WorkTimeSheetDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_time_sheet/link/b;", "Lev/b;", "Lcom/avito/android/work_time_sheet/link/WorkTimeSheetDeepLink;", "_avito_work-time-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends AbstractC40162b<WorkTimeSheetDeepLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.d f331325d;

    @Inject
    public b(@k a.d dVar) {
        this.f331325d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        WorkTimeSheetBody workTimeSheetBody = ((WorkTimeSheetDeepLink) deepLink).f331323b;
        if (workTimeSheetBody.d().isEmpty()) {
            return AbstractC14250d.b.f9170c;
        }
        this.f331325d.k0(new a(workTimeSheetBody));
        return AbstractC14250d.c.f9171c;
    }
}
