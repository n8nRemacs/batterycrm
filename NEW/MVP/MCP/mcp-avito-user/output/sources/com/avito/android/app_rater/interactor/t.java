package com.avito.android.app_rater.interactor;

import androidx.fragment.app.ActivityC22955m;
import com.avito.android.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: InAppReviewInteractorRustore.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app_rater/interactor/t;", "Lcom/avito/android/app_rater/interactor/d;", "_avito_app-rater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class t implements d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f91839a;

    @Inject
    public t(@Y61.k P p12) {
        kotlin.reflect.n<Object> nVar = P.f67370w0[87];
        this.f91839a = ((Boolean) p12.f67437u0.a().invoke()).booleanValue();
    }

    @Override // com.avito.android.app_rater.interactor.d
    @Y61.k
    public final String a() {
        return "ru.vk.store";
    }

    @Override // com.avito.android.app_rater.interactor.d
    public final boolean b() {
        return true;
    }

    @Override // com.avito.android.app_rater.interactor.d
    @Y61.k
    public final InterfaceC43160i c(@Y61.k ActivityC22955m activityC22955m) {
        return C43175k.d(new s(activityC22955m, null));
    }

    @Override // com.avito.android.app_rater.interactor.d
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getF91839a() {
        return this.f91839a;
    }
}
