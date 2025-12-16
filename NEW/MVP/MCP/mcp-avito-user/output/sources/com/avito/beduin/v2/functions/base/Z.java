package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.logger.LogLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: MapFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/functions/base/Z;", "LcU0/a;", "<init>", "()V", "a", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Z extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Z f337029a = new Z();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337030b = "Map";

    /* compiled from: MapFunction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/functions/base/Z$a;", "", "a", "b", "c", "Lcom/avito/beduin/v2/functions/base/Z$a$b;", "Lcom/avito/beduin/v2/functions/base/Z$a$c;", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C10443a f337031a = C10443a.f337032a;

        /* compiled from: MapFunction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/Z$a$a;", "", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.functions.base.Z$a$a, reason: collision with other inner class name */
        public static final class C10443a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ C10443a f337032a = new C10443a();

            @Y61.k
            public static a a(@Y61.k String str) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                a aVar = b.f337033b;
                aVar.getClass();
                if (!lowerCase.equals(b.f337034c)) {
                    aVar = c.f337035b;
                    aVar.getClass();
                    if (!lowerCase.equals(c.f337036c)) {
                        throw new IllegalArgumentException(AK.c.k("IdentifyBy ", str, " not found"));
                    }
                }
                return aVar;
            }
        }

        /* compiled from: MapFunction.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/Z$a$b;", "Lcom/avito/beduin/v2/functions/base/Z$a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f337033b = new b();

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public static final String f337034c = "id";

            @Override // com.avito.beduin.v2.functions.base.Z.a
            @Y61.k
            public final ArrayList a(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k List list) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.avito.beduin.v2.engine.field.d dVarC = ((com.avito.beduin.v2.engine.field.d) it.next()).c(zVar);
                    if (!(dVarC instanceof com.avito.beduin.v2.engine.field.entity.A) || ((com.avito.beduin.v2.engine.field.entity.A) dVarC).f336779c == null) {
                        dVarC = null;
                    }
                    if (dVarC != null) {
                        arrayList.add(dVarC);
                    }
                }
                if (arrayList.size() == list.size()) {
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((com.avito.beduin.v2.engine.field.entity.A) it2.next()).f336779c);
                    }
                    return arrayList2;
                }
                RU0.b bVar = RU0.b.f14467a;
                LogLevel[] logLevelArr = LogLevel.f337864b;
                bVar.getClass();
                if (3 >= RU0.b.f14469c) {
                    RU0.b.f14468b.e(RU0.b.f14470d + ":MapFunction", "Prohibited to use any types of data besides Structure (with id) for 'identifyBy: id'. To fix it you can use 'NewInstance' function to init id or 'identifyBy: position'");
                }
                return c.f337035b.a(zVar, list);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1544165323;
            }

            @Y61.k
            public final String toString() {
                return "Id";
            }
        }

        /* compiled from: MapFunction.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/Z$a$c;", "Lcom/avito/beduin/v2/functions/base/Z$a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f337035b = new c();

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public static final String f337036c = "position";

            @Override // com.avito.beduin.v2.functions.base.Z.a
            @Y61.k
            public final ArrayList a(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k List list) {
                kotlin.ranges.l lVarI = C42745f0.I(list);
                ArrayList arrayList = new ArrayList(C42745f0.q(lVarI, 10));
                kotlin.ranges.k it = lVarI.iterator();
                while (it.f406910d) {
                    arrayList.add(String.valueOf(it.a()));
                }
                return arrayList;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 901111769;
            }

            @Y61.k
            public final String toString() {
                return "Position";
            }
        }

        @Y61.k
        ArrayList a(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k List list);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    @Override // cU0.AbstractC27103a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z r19, @Y61.k com.avito.beduin.v2.engine.field.j r20, @Y61.k com.avito.beduin.v2.engine.field.m r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.functions.base.Z.b(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.j, com.avito.beduin.v2.engine.field.m):com.avito.beduin.v2.engine.field.d");
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f337030b;
    }
}
