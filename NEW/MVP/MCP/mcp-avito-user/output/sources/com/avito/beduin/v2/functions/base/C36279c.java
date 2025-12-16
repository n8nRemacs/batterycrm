package com.avito.beduin.v2.functions.base;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: ArgsTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/c;", "", "a", "b", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36279c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.entity.x f337047a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<String> f337048b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f337049c;

    /* compiled from: ArgsTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/functions/base/c$a;", "", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.functions.base.c$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.engine.field.entity.x f337050a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f337051b;

        public a(@Y61.k com.avito.beduin.v2.engine.field.entity.x xVar, @Y61.k LinkedHashMap linkedHashMap) {
            this.f337050a = xVar;
            this.f337051b = linkedHashMap;
        }

        @Y61.k
        public final com.avito.beduin.v2.engine.field.m a() {
            return new com.avito.beduin.v2.engine.field.m(this.f337051b);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f337050a, aVar.f337050a) && kotlin.jvm.internal.L.f(this.f337051b, aVar.f337051b);
        }

        public final int hashCode() {
            return this.f337051b.hashCode() + (this.f337050a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Snapshot(");
            sb2.append("template=" + this.f337050a + ", ");
            StringBuilder sb3 = new StringBuilder("tracked=");
            sb3.append(this.f337051b);
            sb2.append(sb3.toString());
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* compiled from: ArgsTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/functions/base/c$b;", "", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.functions.base.c$b */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f337052a = new LinkedHashMap();

        public b() {
        }

        @Y61.k
        public final a a() {
            C36279c c36279c = C36279c.this;
            return new a(c36279c.f337047a, this.f337052a);
        }
    }

    public C36279c() {
        throw null;
    }

    public C36279c(@Y61.k com.avito.beduin.v2.engine.field.entity.x xVar, @Y61.k String... strArr) {
        String str;
        Set<String> setL0 = C42756l.l0(strArr);
        this.f337047a = xVar;
        this.f337048b = setL0;
        this.f337049c = new LinkedHashSet();
        for (com.avito.beduin.v2.engine.field.q qVar : xVar.f336856c.e()) {
            LinkedHashSet linkedHashSet = this.f337049c;
            int size = linkedHashSet.size();
            Set<String> set = this.f337048b;
            if (size == set.size()) {
                return;
            }
            if (set.contains(qVar.f336877b)) {
                String str2 = qVar.f336877b;
                if (!linkedHashSet.contains(str2) && ((str = qVar.f336878c) == null || str.equals(xVar.f336857d))) {
                    linkedHashSet.add(str2);
                }
            }
        }
    }
}
