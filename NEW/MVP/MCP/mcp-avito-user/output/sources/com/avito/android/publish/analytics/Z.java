package com.avito.android.publish.analytics;

import Cd0.C13277n0;
import Cd0.C13281p0;
import Cd0.C13283q0;
import Cd0.C13284r0;
import com.avito.android.analytics.InterfaceC28373a;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import yc.C50213a;

/* compiled from: PublishPhotosEventTracker.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/Z;", "Lcom/avito/android/publish/analytics/Y;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Z implements Y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f232189a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f232190b;

    @Inject
    public Z(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a) {
        this.f232189a = interfaceC28373a;
        this.f232190b = c50213a;
    }

    @Override // com.avito.android.publish.analytics.Y
    public final void I() {
        this.f232189a.c(new C13281p0(this.f232190b));
    }

    @Override // com.avito.android.publish.analytics.Y
    public final void L(@Y61.k ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Long lZ02 = C43066x.z0((String) it.next());
            if (lZ02 != null) {
                arrayList2.add(lZ02);
            }
        }
        this.f232189a.c(new C13283q0(this.f232190b, arrayList.size(), arrayList2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // com.avito.android.publish.analytics.Y
    public final void l(@Y61.l ArrayList arrayList) {
        ?? arrayList2;
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Long lZ02 = C43066x.z0((String) it.next());
                if (lZ02 != null) {
                    arrayList2.add(lZ02);
                }
            }
        } else {
            arrayList2 = 0;
        }
        int size = arrayList != null ? arrayList.size() : 0;
        if (arrayList2 == 0) {
            arrayList2 = C42784z0.f406748b;
        }
        this.f232189a.c(new C13284r0(this.f232190b, size, arrayList2));
    }

    @Override // com.avito.android.publish.analytics.Y
    public final void s0(@Y61.l String str) {
        this.f232189a.c(new C13277n0(this.f232190b, str));
    }
}
