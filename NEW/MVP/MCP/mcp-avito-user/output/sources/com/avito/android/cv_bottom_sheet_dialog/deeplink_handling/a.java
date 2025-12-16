package com.avito.android.cv_bottom_sheet_dialog.deeplink_handling;

import com.avito.android.cv_bottom_sheet_dialog.deeplink.JobCvBottomSheetLink;
import kotlin.Metadata;

/* compiled from: CvBottomSheetDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class a<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f131583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JobCvBottomSheetLink f131584c;

    public a(b bVar, JobCvBottomSheetLink jobCvBottomSheetLink) {
        this.f131583b = bVar;
        this.f131584c = jobCvBottomSheetLink;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ((Number) obj).longValue();
        this.f131583b.j(new JobCvBottomSheetLink.b.a(this.f131584c.f131581b));
    }
}
