package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update;

import com.avito.android.iac_problems.public_module.models.IacProblem;
import com.avito.android.util.V2;
import com.avito.android.util.rx3.g1;
import com.google.gson.Gson;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.completable.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import l41.o;

/* compiled from: IacDeviceAvailabilityUpdater.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f168365b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f168366c;

    public f(c cVar, boolean z12) {
        this.f168365b = cVar;
        this.f168366c = z12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String string;
        c cVar = this.f168365b;
        boolean zB2 = cVar.f168351c.b("android.permission.RECORD_AUDIO");
        boolean z12 = cVar.f168352d.g() > 0;
        String strInvoke = cVar.f168354f.f().invoke();
        List<IacProblem> listA = cVar.f168355g.a();
        Map<String, Integer> mapA = cVar.f168357i.a();
        Gson gson = cVar.f168358j.get();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            int iOrdinal = ((IacProblem) it.next()).ordinal();
            if (iOrdinal == 1) {
                str = "NOTIFICATION_ALL";
            } else if (iOrdinal == 2) {
                str = "NOTIFICATION_IAC";
            } else if (iOrdinal == 5) {
                str = "BACKGROUND_RESTRICTION";
            } else if (iOrdinal == 6) {
                str = "MIUI_LOCK_SCREEN_PERMISSION";
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry<String, Integer> entry : mapA.entrySet()) {
            String key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            if (iIntValue > 0) {
                StringBuilder sb2 = new StringBuilder();
                C43066x.j(sb2, "CRASH_", key, "_", Integer.valueOf(iIntValue));
                string = sb2.toString();
            } else {
                string = null;
            }
            if (string != null) {
                arrayList3.add(string);
            }
        }
        String strL = gson.l(C42745f0.h0(arrayList3, arrayList2));
        V2 v22 = V2.f318762a;
        StringBuilder sb3 = new StringBuilder("update availability: mic=");
        sb3.append(zB2);
        sb3.append('/');
        com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a aVar = cVar.f168356h;
        sb3.append(aVar.j());
        sb3.append(',');
        v22.c("IacDeviceAvailabilityUpdater", sb3.toString(), null);
        v22.c("IacDeviceAvailabilityUpdater", "update availability: token=" + z12 + '/' + aVar.d() + ',', null);
        v22.c("IacDeviceAvailabilityUpdater", "update availability: appVersion=" + strInvoke + '/' + aVar.g() + ',', null);
        v22.c("IacDeviceAvailabilityUpdater", "update availability: deviceParams=" + strL + '/' + aVar.i() + ',', null);
        if (this.f168366c || zB2 != aVar.j() || z12 != aVar.d() || !L.f(strInvoke, aVar.g()) || !strL.equals(aVar.i())) {
            return new v(g1.a(cVar.f168349a.g(Boolean.valueOf(zB2), Boolean.valueOf(z12), strL)).k(new d(this.f168365b, zB2, z12, strInvoke, strL)).i(e.f168364b));
        }
        v22.c("IacDeviceAvailabilityUpdater", "update availability: up to date", null);
        return C41823n.f402260b;
    }
}
