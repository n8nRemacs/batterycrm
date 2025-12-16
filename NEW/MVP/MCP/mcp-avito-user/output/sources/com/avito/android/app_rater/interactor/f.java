package com.avito.android.app_rater.interactor;

import androidx.fragment.app.ActivityC22955m;
import com.avito.android.P;
import com.huawei.hms.common.PackageConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: InAppReviewInteractorAppGallery.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app_rater/interactor/f;", "Lcom/avito/android/app_rater/interactor/d;", "_avito_app-rater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f91806a;

    @Inject
    public f(@Y61.k P p12) {
        kotlin.reflect.n<Object> nVar = P.f67370w0[83];
        this.f91806a = ((Boolean) p12.f67429q0.a().invoke()).booleanValue();
    }

    @Override // com.avito.android.app_rater.interactor.d
    @Y61.k
    public final String a() {
        return PackageConstants.SERVICES_PACKAGE_APPMARKET;
    }

    @Override // com.avito.android.app_rater.interactor.d
    public final boolean b() {
        return true;
    }

    @Override // com.avito.android.app_rater.interactor.d
    @Y61.k
    public final InterfaceC43160i c(@Y61.k ActivityC22955m activityC22955m) {
        return C43175k.d(new e(activityC22955m, null));
    }

    @Override // com.avito.android.app_rater.interactor.d
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getF91806a() {
        return this.f91806a;
    }
}
