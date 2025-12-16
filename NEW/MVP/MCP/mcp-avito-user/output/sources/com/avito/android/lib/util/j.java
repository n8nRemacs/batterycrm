package com.avito.android.lib.util;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import com.avito.android.verification.verification_passport.VerificationPassportActivity;
import kotlin.Metadata;
import ru.cyberity.cbr.presentation.screen.CBRAppActivity;

/* compiled from: EdgeToEdgeHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/util/j;", "Lid/i;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j extends id.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VerificationPassportActivity f181402b;

    public j(VerificationPassportActivity verificationPassportActivity) {
        this.f181402b = verificationPassportActivity;
    }

    @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@Y61.k Activity activity, @Y61.l Bundle bundle) {
        if (CBRAppActivity.class.isInstance(activity)) {
            i iVar = i.f181373a;
            iVar.getClass();
            i.j(iVar, activity.findViewById(R.id.content));
            this.f181402b.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@Y61.k Activity activity) {
        VerificationPassportActivity verificationPassportActivity = this.f181402b;
        if (activity.equals(verificationPassportActivity)) {
            verificationPassportActivity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }
}
