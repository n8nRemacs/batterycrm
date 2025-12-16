package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.action_handler;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import xt.C49995a;

/* compiled from: JsxActualizationBottomSheetKeepPhoneActionHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/mvi/action_handler/c;", "", "_avito_job_cv-actualization-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C49995a f131490a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f131491b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f131492c;

    @Inject
    public c(@k C49995a c49995a, @l DeepLink deepLink, boolean z12) {
        this.f131490a = c49995a;
        this.f131491b = deepLink;
        this.f131492c = z12;
    }

    @k
    public final C43152f0 a() {
        return new C43152f0(C43175k.G(new a(this, null)), new b(this, null));
    }
}
