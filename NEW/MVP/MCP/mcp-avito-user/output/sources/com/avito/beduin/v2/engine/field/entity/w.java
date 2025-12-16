package com.avito.beduin.v2.engine.field.entity;

import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.f;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PrimitiveField.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/w;", "Lcom/avito/beduin/v2/engine/field/f;", "Lcom/avito/beduin/v2/engine/field/entity/v;", "a", "b", "c", "d", "e", "Lcom/avito/beduin/v2/engine/field/entity/w$a;", "Lcom/avito/beduin/v2/engine/field/entity/w$b;", "Lcom/avito/beduin/v2/engine/field/entity/w$c;", "Lcom/avito/beduin/v2/engine/field/entity/w$d;", "Lcom/avito/beduin/v2/engine/field/entity/w$e;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class w implements com.avito.beduin.v2.engine.field.f<v> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j f336844b;

    /* compiled from: PrimitiveField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/w$a;", "Lcom/avito/beduin/v2/engine/field/entity/w;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends w {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.engine.field.j f336845c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f336846d;

        public a(@Y61.k com.avito.beduin.v2.engine.field.j jVar, boolean z12) {
            super(jVar, null);
            this.f336845c = jVar;
            this.f336846d = z12;
        }

        @Override // com.avito.beduin.v2.engine.field.f
        public final com.avito.beduin.v2.engine.field.d a(com.avito.beduin.v2.engine.core.z zVar, Map map) {
            return C36273j.f(zVar, this.f336846d);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f336845c, aVar.f336845c) && this.f336846d == aVar.f336846d;
        }

        @Override // com.avito.beduin.v2.engine.field.f
        @Y61.k
        public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> g(@Y61.k com.avito.beduin.v2.engine.field.f<? extends com.avito.beduin.v2.engine.field.d> fVar) {
            boolean z12 = fVar instanceof a;
            com.avito.beduin.v2.engine.field.j jVar = this.f336845c;
            return z12 ? new a(jVar, ((a) fVar).f336846d) : fVar.l(jVar).h();
        }

        @Override // com.avito.beduin.v2.engine.field.entity.w, com.avito.beduin.v2.engine.field.f
        @Y61.k
        /* renamed from: getId, reason: from getter */
        public final com.avito.beduin.v2.engine.field.j getF336844b() {
            return this.f336845c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f336846d) + (this.f336845c.hashCode() * 31);
        }

        @Override // com.avito.beduin.v2.engine.field.f
        public final com.avito.beduin.v2.engine.field.f l(com.avito.beduin.v2.engine.field.j jVar) {
            return new a(jVar, this.f336846d);
        }

        @Y61.k
        public final String toString() {
            return c(Boolean.valueOf(this.f336846d));
        }
    }

    /* compiled from: PrimitiveField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/w$b;", "Lcom/avito/beduin/v2/engine/field/entity/w;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends w {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.engine.field.j f336847c;

        /* renamed from: d, reason: collision with root package name */
        public final double f336848d;

        public b(@Y61.k com.avito.beduin.v2.engine.field.j jVar, double d12) {
            super(jVar, null);
            this.f336847c = jVar;
            this.f336848d = d12;
        }

        @Override // com.avito.beduin.v2.engine.field.f
        public final com.avito.beduin.v2.engine.field.d a(com.avito.beduin.v2.engine.core.z zVar, Map map) {
            return C36273j.b(zVar, this.f336848d);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f336847c, bVar.f336847c) && Double.compare(this.f336848d, bVar.f336848d) == 0;
        }

        @Override // com.avito.beduin.v2.engine.field.f
        @Y61.k
        public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> g(@Y61.k com.avito.beduin.v2.engine.field.f<? extends com.avito.beduin.v2.engine.field.d> fVar) {
            boolean z12 = fVar instanceof b;
            com.avito.beduin.v2.engine.field.j jVar = this.f336847c;
            return z12 ? new b(jVar, ((b) fVar).f336848d) : fVar.l(jVar).h();
        }

        @Override // com.avito.beduin.v2.engine.field.entity.w, com.avito.beduin.v2.engine.field.f
        @Y61.k
        /* renamed from: getId, reason: from getter */
        public final com.avito.beduin.v2.engine.field.j getF336844b() {
            return this.f336847c;
        }

        public final int hashCode() {
            return Double.hashCode(this.f336848d) + (this.f336847c.hashCode() * 31);
        }

        @Override // com.avito.beduin.v2.engine.field.f
        public final com.avito.beduin.v2.engine.field.f l(com.avito.beduin.v2.engine.field.j jVar) {
            return new b(jVar, this.f336848d);
        }

        @Y61.k
        public final String toString() {
            return c(Double.valueOf(this.f336848d));
        }
    }

    /* compiled from: PrimitiveField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/w$c;", "Lcom/avito/beduin/v2/engine/field/entity/w;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends w {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.engine.field.j f336849c;

        /* renamed from: d, reason: collision with root package name */
        public final float f336850d;

        public c(@Y61.k com.avito.beduin.v2.engine.field.j jVar, float f12) {
            super(jVar, null);
            this.f336849c = jVar;
            this.f336850d = f12;
        }

        @Override // com.avito.beduin.v2.engine.field.f
        public final com.avito.beduin.v2.engine.field.d a(com.avito.beduin.v2.engine.core.z zVar, Map map) {
            return C36273j.a(zVar).b(this.f336850d);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f336849c, cVar.f336849c) && Float.compare(this.f336850d, cVar.f336850d) == 0;
        }

        @Override // com.avito.beduin.v2.engine.field.f
        @Y61.k
        public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> g(@Y61.k com.avito.beduin.v2.engine.field.f<? extends com.avito.beduin.v2.engine.field.d> fVar) {
            boolean z12 = fVar instanceof c;
            com.avito.beduin.v2.engine.field.j jVar = this.f336849c;
            return z12 ? new c(jVar, ((c) fVar).f336850d) : fVar.l(jVar).h();
        }

        @Override // com.avito.beduin.v2.engine.field.entity.w, com.avito.beduin.v2.engine.field.f
        @Y61.k
        /* renamed from: getId, reason: from getter */
        public final com.avito.beduin.v2.engine.field.j getF336844b() {
            return this.f336849c;
        }

        public final int hashCode() {
            return Float.hashCode(this.f336850d) + (this.f336849c.hashCode() * 31);
        }

        @Override // com.avito.beduin.v2.engine.field.f
        public final com.avito.beduin.v2.engine.field.f l(com.avito.beduin.v2.engine.field.j jVar) {
            return new c(jVar, this.f336850d);
        }

        @Y61.k
        public final String toString() {
            return c(Float.valueOf(this.f336850d));
        }
    }

    /* compiled from: PrimitiveField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/w$d;", "Lcom/avito/beduin/v2/engine/field/entity/w;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends w {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.engine.field.j f336851c;

        /* renamed from: d, reason: collision with root package name */
        public final long f336852d;

        public d(@Y61.k com.avito.beduin.v2.engine.field.j jVar, long j12) {
            super(jVar, null);
            this.f336851c = jVar;
            this.f336852d = j12;
        }

        @Override // com.avito.beduin.v2.engine.field.f
        public final com.avito.beduin.v2.engine.field.d a(com.avito.beduin.v2.engine.core.z zVar, Map map) {
            return C36273j.d(zVar, this.f336852d);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f336851c, dVar.f336851c) && this.f336852d == dVar.f336852d;
        }

        @Override // com.avito.beduin.v2.engine.field.f
        @Y61.k
        public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> g(@Y61.k com.avito.beduin.v2.engine.field.f<? extends com.avito.beduin.v2.engine.field.d> fVar) {
            boolean z12 = fVar instanceof d;
            com.avito.beduin.v2.engine.field.j jVar = this.f336851c;
            return z12 ? new d(jVar, ((d) fVar).f336852d) : fVar.l(jVar).h();
        }

        @Override // com.avito.beduin.v2.engine.field.entity.w, com.avito.beduin.v2.engine.field.f
        @Y61.k
        /* renamed from: getId, reason: from getter */
        public final com.avito.beduin.v2.engine.field.j getF336844b() {
            return this.f336851c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f336852d) + (this.f336851c.hashCode() * 31);
        }

        @Override // com.avito.beduin.v2.engine.field.f
        public final com.avito.beduin.v2.engine.field.f l(com.avito.beduin.v2.engine.field.j jVar) {
            return new d(jVar, this.f336852d);
        }

        @Y61.k
        public final String toString() {
            return c(Long.valueOf(this.f336852d));
        }
    }

    /* compiled from: PrimitiveField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/w$e;", "Lcom/avito/beduin/v2/engine/field/entity/w;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends w {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.engine.field.j f336853c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f336854d;

        public e(@Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k String str) {
            super(jVar, null);
            this.f336853c = jVar;
            this.f336854d = str;
        }

        @Override // com.avito.beduin.v2.engine.field.f
        public final com.avito.beduin.v2.engine.field.d a(com.avito.beduin.v2.engine.core.z zVar, Map map) {
            return C36273j.e(zVar, this.f336854d);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f336853c, eVar.f336853c) && L.f(this.f336854d, eVar.f336854d);
        }

        @Override // com.avito.beduin.v2.engine.field.f
        @Y61.k
        public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> g(@Y61.k com.avito.beduin.v2.engine.field.f<? extends com.avito.beduin.v2.engine.field.d> fVar) {
            boolean z12 = fVar instanceof e;
            com.avito.beduin.v2.engine.field.j jVar = this.f336853c;
            return z12 ? new e(jVar, ((e) fVar).f336854d) : fVar.l(jVar).h();
        }

        @Override // com.avito.beduin.v2.engine.field.entity.w, com.avito.beduin.v2.engine.field.f
        @Y61.k
        /* renamed from: getId, reason: from getter */
        public final com.avito.beduin.v2.engine.field.j getF336844b() {
            return this.f336853c;
        }

        public final int hashCode() {
            return this.f336854d.hashCode() + (this.f336853c.hashCode() * 31);
        }

        @Override // com.avito.beduin.v2.engine.field.f
        public final com.avito.beduin.v2.engine.field.f l(com.avito.beduin.v2.engine.field.j jVar) {
            return new e(jVar, this.f336854d);
        }

        @Y61.k
        public final String toString() {
            return c(this.f336854d);
        }
    }

    public w(com.avito.beduin.v2.engine.field.j jVar, C42822w c42822w) {
        this.f336844b = jVar;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> b(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        return f.a.a(this, str, fVar);
    }

    @Y61.k
    public final <T> String c(@Y61.k T t12) {
        StringBuilder sb2 = new StringBuilder("PrimitiveStringField(");
        if (getF336844b().getF336874d()) {
            sb2.append("id=" + getF336844b().getF336873c() + ", ");
        }
        sb2.append("value=" + t12);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> d(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        return f.a.c(this, str, fVar);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final Set<com.avito.beduin.v2.engine.field.q> e() {
        return B0.f406639b;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public com.avito.beduin.v2.engine.field.j getF336844b() {
        return this.f336844b;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> h() {
        return this;
    }
}
