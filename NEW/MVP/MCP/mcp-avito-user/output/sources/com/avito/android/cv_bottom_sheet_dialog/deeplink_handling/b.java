package com.avito.android.cv_bottom_sheet_dialog.deeplink_handling;

import Y61.k;
import android.os.Bundle;
import com.avito.android.cv_bottom_sheet_dialog.deeplink.JobCvBottomSheetLink;
import com.avito.android.deep_linking.links.DeepLink;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.core.z;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CvBottomSheetDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cv_bottom_sheet_dialog/deeplink_handling/b;", "Lev/a;", "Lcom/avito/android/cv_bottom_sheet_dialog/deeplink/JobCvBottomSheetLink;", "<init>", "()V", "_avito_job_cv-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends AbstractC40161a<JobCvBottomSheetLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f131585f = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public b() {
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f131585f.b(z.F0(2000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new a(this, (JobCvBottomSheetLink) deepLink)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f131585f.e();
    }
}
