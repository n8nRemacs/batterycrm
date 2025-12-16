package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import vM.C49231a;
import vM.C49233c;
import yc.C50213a;

/* compiled from: PublishImageEnhanceEventTracker.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/z;", "Lcom/avito/android/publish/analytics/y;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.analytics.z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33539z implements InterfaceC33538y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f232308a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f232309b;

    @Inject
    public C33539z(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a) {
        this.f232308a = interfaceC28373a;
        this.f232309b = c50213a;
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33538y
    public final void q0(@Y61.k List<String> list, @Y61.k List<String> list2) {
        String strB = this.f232309b.b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Long lZ02 = C43066x.z0((String) it.next());
            if (lZ02 != null) {
                arrayList.add(lZ02);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            Long lZ03 = C43066x.z0((String) it2.next());
            if (lZ03 != null) {
                arrayList2.add(lZ03);
            }
        }
        this.f232308a.c(new C49233c(strB, arrayList, arrayList2));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33538y
    public final void x0(boolean z12) {
        this.f232308a.c(new C49231a(this.f232309b.b(), z12));
    }
}
