package Qc;

import Y61.k;
import android.content.Context;
import com.avito.android.util.J5;
import com.avito.android.util.V2;
import com.google.firebase.analytics.FirebaseAnalytics;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FirebaseAnalyticsFacade.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQc/c;", "Lcom/avito/android/util/J5;", "_common_analytics-firebase_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c extends J5 {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Context f13935c;

    @Inject
    public c(@k Context context) {
        this.f13935c = context;
    }

    @Override // com.avito.android.util.J5
    public final void o() {
        FirebaseAnalytics.getInstance(this.f13935c);
        V2.f318762a.i("FirebaseAnalyticsFacade", "Firebase analytics initialized", null);
    }
}
