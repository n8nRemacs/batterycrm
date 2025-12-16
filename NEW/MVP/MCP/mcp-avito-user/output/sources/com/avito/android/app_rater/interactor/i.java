package com.avito.android.app_rater.interactor;

import androidx.fragment.app.ActivityC22955m;
import com.avito.android.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: InAppReviewInteractorGalaxyStore.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app_rater/interactor/i;", "Lcom/avito/android/app_rater/interactor/d;", "_avito_app-rater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f91816a;

    @Inject
    public i(@Y61.k P p12) {
        kotlin.reflect.n<Object> nVar = P.f67370w0[84];
        this.f91816a = ((Boolean) p12.f67431r0.a().invoke()).booleanValue();
    }

    public static void d(I0 i02, String str) {
        i02.h(new Exception(str));
    }

    @Override // com.avito.android.app_rater.interactor.d
    @Y61.k
    public final String a() {
        return "com.sec.android.app.samsungapps";
    }

    @Override // com.avito.android.app_rater.interactor.d
    public final boolean b() {
        return true;
    }

    @Override // com.avito.android.app_rater.interactor.d
    @Y61.k
    public final InterfaceC43160i c(@Y61.k ActivityC22955m activityC22955m) {
        return C43175k.d(new h(this, activityC22955m, null));
    }

    @Override // com.avito.android.app_rater.interactor.d
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getF91816a() {
        return this.f91816a;
    }
}
