package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.C32293v0;
import com.avito.android.util.V2;
import java.util.Set;
import kotlin.text.C43066x;
import ru.avito.messenger.internal.connection.C47754g;
import ru.avito.messenger.internal.connection.InterfaceC47751d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class D0 implements l41.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f194585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f194586c;

    public /* synthetic */ D0(Object obj, int i12) {
        this.f194585b = i12;
        this.f194586c = obj;
    }

    @Override // l41.c
    public final Object apply(Object obj, Object obj2) {
        Long lZ02;
        Long lZ03;
        Object obj3 = this.f194586c;
        switch (this.f194585b) {
            case 0:
                C32293v0.e eVar = (C32293v0.e) obj;
                C32293v0.e eVar2 = (C32293v0.e) obj2;
                long j12 = eVar2.f194866a;
                long j13 = eVar.f194866a;
                long j14 = j12 - j13;
                C32293v0 c32293v0 = (C32293v0) obj3;
                Set<String> set = eVar2.f194868c;
                if (j14 >= 5000) {
                    V2 v22 = V2.f318762a;
                    int i12 = C32293v0.f194852a0;
                    v22.c(c32293v0.f207131E, j14 + "ms since prev request. All ids will be requested. NewIds = " + set, null);
                    return new C32293v0.e(j12, set, set);
                }
                Set<String> set2 = eVar.f194867b;
                Set setF = kotlin.collections.b1.f(set, set2);
                V2 v23 = V2.f318762a;
                int i13 = C32293v0.f194852a0;
                v23.c(c32293v0.f207131E, j14 + "ms since prev request. Only new ids for 5000ms interval will be requested. NewIds = " + setF, null);
                return new C32293v0.e(j13, kotlin.collections.b1.h(set2, set), setF);
            default:
                InterfaceC47751d.a aVar = (InterfaceC47751d.a) obj;
                InterfaceC47751d.a aVar2 = (InterfaceC47751d.a) obj2;
                String str = aVar.f431288b;
                String str2 = aVar2.f431287a;
                String str3 = aVar.f431287a;
                if (str2 == null || str2.equals(str3)) {
                    String str4 = aVar2.f431288b;
                    if (str4 == null) {
                        str4 = str;
                    }
                    aVar2 = new InterfaceC47751d.a(str3, str4);
                }
                if (kotlin.jvm.internal.L.f(aVar2.f431287a, str3) && str != null && (lZ02 = C43066x.z0(str)) != null) {
                    long jLongValue = lZ02.longValue();
                    String str5 = aVar2.f431288b;
                    if (str5 != null && (lZ03 = C43066x.z0(str5)) != null) {
                        long jLongValue2 = lZ03.longValue();
                        if (jLongValue2 - jLongValue > 1 || jLongValue2 < jLongValue) {
                            ((C47754g) obj3).f431317l.c(new com.avito.android.analytics.event.Y(aVar2.f431287a, jLongValue2, jLongValue));
                        }
                    }
                }
                return aVar2;
        }
    }
}
