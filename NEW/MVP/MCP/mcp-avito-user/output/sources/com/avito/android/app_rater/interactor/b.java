package com.avito.android.app_rater.interactor;

import android.app.Application;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.C36688g;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GooglePlayServicesInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app_rater/interactor/b;", "Lcom/avito/android/app_rater/interactor/a;", "_avito_app-rater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f91801a;

    @Inject
    public b(@Y61.k Application application) {
        this.f91801a = C36687f.f349287e.c(C36688g.f349288a, application) == 0;
    }
}
