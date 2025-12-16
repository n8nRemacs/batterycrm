package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class zr {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final String f392339a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final InstreamAdBreakPosition.Type f392340b;

        /* renamed from: c, reason: collision with root package name */
        private final long f392341c;

        public a(@Y61.k String str, @Y61.k InstreamAdBreakPosition.Type type, long j12) {
            this.f392339a = str;
            this.f392340b = type;
            this.f392341c = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f392339a, aVar.f392339a) && this.f392340b == aVar.f392340b && this.f392341c == aVar.f392341c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f392341c) + ((this.f392340b.hashCode() + (this.f392339a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sbA = Cif.a("AdBreakSignature(adBreakType=");
            sbA.append(this.f392339a);
            sbA.append(", adBreakPositionType=");
            sbA.append(this.f392340b);
            sbA.append(", adBreakPositionValue=");
            return androidx.appcompat.app.r.u(sbA, this.f392341c, ')');
        }
    }

    @Y61.k
    public static ArrayList a(@Y61.k ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            p60 p60Var = (p60) next;
            if (hashSet.add(new a(p60Var.getType(), p60Var.getAdBreakPosition().getPositionType(), p60Var.getAdBreakPosition().getValue()))) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
