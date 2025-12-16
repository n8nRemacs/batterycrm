package Qc;

import Y61.k;
import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.analytics.r;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35881r2;
import com.avito.android.util.V2;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.reactivex.rxjava3.core.H;
import j.k0;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: FirebaseAnalyticsEventTracker.kt */
@k0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"LQc/a;", "Lcom/avito/android/analytics/r;", "LQc/f;", "Lcom/avito/android/util/r2;", "_common_analytics-firebase_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Qc.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14881a implements r<f>, InterfaceC35881r2 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f13931a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f13932b;

    @Inject
    public C14881a(@k InterfaceC35745a5 interfaceC35745a5, @k c cVar) {
        this.f13931a = interfaceC35745a5;
        this.f13932b = cVar;
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    public final void a() {
        this.f13932b.a();
    }

    @Override // com.avito.android.analytics.r
    public final void c(InterfaceC28464o interfaceC28464o) {
        Bundle bundle;
        f fVar = (f) interfaceC28464o;
        if (C43066x.K(fVar.getF13936b())) {
            return;
        }
        String f13936b = fVar.getF13936b();
        Map<String, String> params = fVar.getParams();
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this.f13932b.f13935c);
        if (params == null) {
            bundle = null;
        } else {
            bundle = new Bundle(params.size());
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if (L.f(entry.getKey(), "value")) {
                    String key = entry.getKey();
                    Double dW02 = C43066x.w0(entry.getValue());
                    bundle.putDouble(key, dW02 != null ? dW02.doubleValue() : 0.0d);
                } else {
                    bundle.putString(entry.getKey(), entry.getValue());
                }
            }
        }
        firebaseAnalytics.f360704a.zza(f13936b, bundle);
        V2.f318762a.i("FirebaseAnalyticsFacade", "Track event: " + fVar, null);
    }

    @Override // com.avito.android.analytics.r
    @k
    /* renamed from: h */
    public final H getF91100h() {
        return this.f13931a.a();
    }

    @Override // com.avito.android.analytics.r
    @k
    public final Class<f> i() {
        return f.class;
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    /* renamed from: isInitialized */
    public final boolean getF318637a() {
        return this.f13932b.f318637a;
    }
}
