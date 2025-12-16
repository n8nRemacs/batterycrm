package com.avito.android.analytics_adjust;

import com.adjust.sdk.AdjustEvent;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.J5;
import io.reactivex.rxjava3.core.H;
import j.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AdjustEventTracker.kt */
@k0
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics_adjust/f;", "Lcom/avito/android/analytics/r;", "Lcom/avito/android/analytics_adjust/c;", "Lcom/avito/android/util/J5;", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends J5 implements com.avito.android.analytics.r<InterfaceC28535c> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f91209f = {m0.f406844a.i(new h0(f.class, "adjust", "getAdjust()Lcom/avito/android/analytics_adjust/Adjust;", 0))};

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f91210c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e f91211d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Map<String, EventParams> f91212e;

    /* compiled from: AdjustEventTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91213a;

        static {
            int[] iArr = new int[EventParams.values().length];
            try {
                EventParams[] eventParamsArr = EventParams.f91199b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f91213a = iArr;
        }
    }

    @Inject
    public f(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h31.e eVar) {
        this.f91210c = interfaceC35745a5;
        this.f91211d = eVar;
        EventParams[] eventParamsArrValues = EventParams.values();
        ArrayList arrayList = new ArrayList(eventParamsArrValues.length);
        for (EventParams eventParams : eventParamsArrValues) {
            eventParams.getClass();
            arrayList.add(new Q("revenue", eventParams));
        }
        this.f91212e = P0.p(arrayList);
    }

    @Override // com.avito.android.analytics.r
    public final void c(InterfaceC28464o interfaceC28464o) {
        InterfaceC28535c interfaceC28535c = (InterfaceC28535c) interfaceC28464o;
        if (!this.f318637a) {
            throw new IllegalStateException("Adjust must be initialized at this moment");
        }
        if (C43066x.K(interfaceC28535c.getF91207b())) {
            return;
        }
        kotlin.reflect.n<Object> nVar = f91209f[0];
        AdjustEvent adjustEventM = ((InterfaceC28533a) this.f91211d.get()).m(interfaceC28535c.getF91207b());
        String f91207b = interfaceC28535c.getF91207b();
        AdjustTokenWithFirebaseName adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91150d;
        if (L.f(f91207b, "6alefb")) {
            adjustEventM.addPartnerParameter("trg_feed", "3221614_1");
        }
        for (Map.Entry<String, String> entry : interfaceC28535c.getF91208c().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (this.f91212e.containsKey(key)) {
                EventParams eventParams = this.f91212e.get(key);
                if ((eventParams == null ? -1 : a.f91213a[eventParams.ordinal()]) == 1) {
                    List listF0 = C43066x.f0(value, new String[]{";"}, 0, 6);
                    Double dW02 = C43066x.w0((String) listF0.get(0));
                    adjustEventM.setRevenue(dW02 != null ? dW02.doubleValue() : 0.0d, (String) listF0.get(1));
                }
            } else {
                adjustEventM.addPartnerParameter(key, value);
            }
        }
        kotlin.reflect.n<Object> nVar2 = f91209f[0];
        ((InterfaceC28533a) this.f91211d.get()).trackEvent(adjustEventM);
    }

    @Override // com.avito.android.analytics.r
    @Y61.k
    /* renamed from: h */
    public final H getF91100h() {
        return this.f91210c.a();
    }

    @Override // com.avito.android.analytics.r
    @Y61.k
    public final Class<InterfaceC28535c> i() {
        return InterfaceC28535c.class;
    }

    @Override // com.avito.android.util.J5
    public final void o() {
        kotlin.reflect.n<Object> nVar = f91209f[0];
    }
}
