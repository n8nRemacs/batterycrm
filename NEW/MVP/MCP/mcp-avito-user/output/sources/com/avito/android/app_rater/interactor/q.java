package com.avito.android.app_rater.interactor;

import androidx.fragment.app.ActivityC22955m;
import com.avito.android.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: InAppReviewInteractorGooglePlay.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app_rater/interactor/q;", "Lcom/avito/android/app_rater/interactor/d;", "_avito_app-rater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final b f91833a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f91834b;

    @Inject
    public q(@Y61.k P p12, @Y61.k b bVar) {
        this.f91833a = bVar;
        kotlin.reflect.n<Object> nVar = P.f67370w0[86];
        this.f91834b = ((Boolean) p12.f67435t0.a().invoke()).booleanValue();
    }

    @Override // com.avito.android.app_rater.interactor.d
    @Y61.k
    public final String a() {
        return "com.android.vending";
    }

    @Override // com.avito.android.app_rater.interactor.d
    public final boolean b() {
        return true;
    }

    @Override // com.avito.android.app_rater.interactor.d
    @Y61.k
    public final InterfaceC43160i c(@Y61.k ActivityC22955m activityC22955m) {
        return C43175k.d(new p(this, activityC22955m, null));
    }

    @Override // com.avito.android.app_rater.interactor.d
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getF91834b() {
        return this.f91834b;
    }
}
