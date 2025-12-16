package com.avito.beduin.v2.interaction.navigation.flow;

import com.avito.beduin.v2.engine.D;
import com.avito.beduin.v2.engine.E;
import com.avito.beduin.v2.engine.core.C36259i;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.interaction.navigation.flow.t;
import com.avito.beduin.v2.interaction.navigation.flow.u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: NavigateInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/l;", "LdU0/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class l implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final t f337532a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f337533b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f337534c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final LinkedHashMap f337535d;

    /* compiled from: NavigateInteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/l$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f337536b = new a();

        public a() {
            super("Navigate");
        }

        @Override // dU0.c
        public final dU0.b b(com.avito.beduin.v2.engine.core.z zVar, com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
            t bVar;
            if (!zVar.a().f336482i) {
                throw new UnsupportedOperationException("Navigate interaction disabled in this scenario. Please, use enableInternalNavigation feature");
            }
            com.avito.beduin.v2.engine.field.entity.A aX2 = mVar.x(zVar, "args");
            LinkedHashMap linkedHashMap = null;
            if (aX2 == null) {
                aX2 = new com.avito.beduin.v2.engine.field.entity.A(null, null, 3, null);
            }
            String strL = mVar.l(zVar, "screenKey");
            com.avito.beduin.v2.engine.field.entity.x xVarK = mVar.k(zVar, "screen");
            Boolean boolO = mVar.o(zVar, "shouldAddToBackStack");
            boolean zBooleanValue = boolO != null ? boolO.booleanValue() : true;
            Boolean boolO2 = mVar.o(zVar, "shouldClearBackStack");
            boolean zBooleanValue2 = boolO2 != null ? boolO2.booleanValue() : false;
            t.a aVar = t.f337543c;
            E e12 = E.f336419a;
            zVar.getF336594a();
            C36259i c36259i = new C36259i("@navigation_child", zVar.getF336594a(), new k(xVarK, aX2));
            e12.getClass();
            D dB2 = E.b(c36259i);
            aVar.getClass();
            u.f337549b.getClass();
            u uVarA = u.a.a(strL);
            if (uVarA.equals(u.b.f337551c)) {
                bVar = new t.c(dB2);
            } else {
                if (!(uVarA instanceof u.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new t.b((u.c) uVarA, dB2);
            }
            com.avito.beduin.v2.engine.field.entity.A aX3 = mVar.x(zVar, "metaInfo");
            if (aX3 != null) {
                Set<Map.Entry<String, com.avito.beduin.v2.engine.field.d>> setEntrySet = aX3.f336778b.f336870a.entrySet();
                int iF2 = P0.f(C42745f0.q(setEntrySet, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF2);
                Iterator<T> it = setEntrySet.iterator();
                while (it.hasNext()) {
                    String str = (String) ((Map.Entry) it.next()).getKey();
                    linkedHashMap2.put(str, com.avito.beduin.v2.engine.utils.g.c(aX3, zVar, str));
                }
                linkedHashMap = linkedHashMap2;
            }
            if (bVar instanceof t.c) {
                throw new IllegalArgumentException("Value `Root` cannot be used as screenKey. Use Back to return to root.");
            }
            return new l(bVar, zBooleanValue, zBooleanValue2, linkedHashMap);
        }
    }

    public l(@Y61.k t tVar, boolean z12, boolean z13, @Y61.l LinkedHashMap linkedHashMap) {
        this.f337532a = tVar;
        this.f337533b = z12;
        this.f337534c = z13;
        this.f337535d = linkedHashMap;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f337532a.equals(lVar.f337532a) && this.f337533b == lVar.f337533b && this.f337534c == lVar.f337534c && L.f(this.f337535d, lVar.f337535d);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(this.f337532a.hashCode() * 31, 31, this.f337533b), 31, this.f337534c);
        LinkedHashMap linkedHashMap = this.f337535d;
        return i12 + (linkedHashMap == null ? 0 : linkedHashMap.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavigateInteraction(screen=");
        sb2.append(this.f337532a);
        sb2.append(", shouldAddToBackStack=");
        sb2.append(this.f337533b);
        sb2.append(", shouldClearBackStack=");
        sb2.append(this.f337534c);
        sb2.append(", metaInfo=");
        return org.webrtc.h.e(sb2, this.f337535d, ')');
    }
}
