package com.avito.beduin.v2.engine.field.entity;

import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.engine.field.d;
import com.avito.beduin.v2.engine.field.entity.w;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PrimitiveField.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/v;", "Lcom/avito/beduin/v2/engine/field/d;", "a", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "Lcom/avito/beduin/v2/engine/field/entity/v$a;", "Lcom/avito/beduin/v2/engine/field/entity/v$e;", "Lcom/avito/beduin/v2/engine/field/entity/v$i;", "Lcom/avito/beduin/v2/engine/field/entity/v$k;", "Lcom/avito/beduin/v2/engine/field/entity/v$l;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface v extends com.avito.beduin.v2.engine.field.d {

    /* compiled from: PrimitiveField.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: PrimitiveField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/v$k;", "Lcom/avito/beduin/v2/engine/field/entity/v;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface k extends v {

        /* compiled from: PrimitiveField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public static void a() {
                throw new IllegalArgumentException("Number primitive can't be cast to boolean");
            }
        }
    }

    /* renamed from: d */
    long getF336840b();

    /* renamed from: f */
    float getF336839b();

    @Y61.k
    /* renamed from: i */
    String getF336843b();

    int j();

    /* renamed from: n */
    boolean getF336837b();

    /* renamed from: p */
    double getF336838b();

    /* compiled from: PrimitiveField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/v$a;", "Lcom/avito/beduin/v2/engine/field/entity/v;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements v {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f336834b;

        public a(boolean z12) {
            this.f336834b = z12;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.g(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
            return d.b.h(this, zVar, dVar);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: d */
        public final long getF336840b() {
            throw new IllegalArgumentException("Boolean primitive can't be cast to long");
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.l e(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.c(zVar, this);
            throw null;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f336834b == ((a) obj).f336834b;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: f */
        public final float getF336839b() {
            throw new IllegalArgumentException("Boolean primitive can't be cast to float");
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.f(zVar, this);
            throw null;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f336834b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        @Y61.k
        /* renamed from: i */
        public final String getF336843b() {
            return String.valueOf(this.f336834b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        public final int j() {
            throw new IllegalArgumentException("Boolean primitive can't be cast to int");
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final p k(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.d(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final C36268a l(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.a(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> m(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return com.avito.beduin.v2.engine.p.a(zVar).d(zVar.A(), this.f336834b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: n, reason: from getter */
        public final boolean getF336837b() {
            return this.f336834b;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: p */
        public final double getF336838b() {
            throw new IllegalArgumentException("Boolean primitive can't be cast to double");
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.c r(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.b(zVar, this);
            throw null;
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("BooleanPrimitiveData(value="), this.f336834b, ')');
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final com.avito.beduin.v2.engine.field.d h(com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final v q(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }
    }

    /* compiled from: PrimitiveField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/v$c;", "Lcom/avito/beduin/v2/engine/field/entity/v$k;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements k {

        /* renamed from: b, reason: collision with root package name */
        public final double f336835b;

        public c(double d12) {
            this.f336835b = d12;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.g(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
            return d.b.h(this, zVar, dVar);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: d */
        public final long getF336840b() {
            return s().longValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.l e(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.c(zVar, this);
            throw null;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Double.compare(this.f336835b, ((c) obj).f336835b) == 0;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: f */
        public final float getF336839b() {
            return s().floatValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.f(zVar, this);
            throw null;
        }

        public final int hashCode() {
            return Double.hashCode(this.f336835b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        @Y61.k
        /* renamed from: i */
        public final String getF336843b() {
            return s().toString();
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        public final int j() {
            return s().intValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final p k(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.d(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final C36268a l(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.a(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> m(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return com.avito.beduin.v2.engine.p.a(zVar).b(zVar.A(), getF336838b());
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: n */
        public final boolean getF336837b() {
            k.a.a();
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: p */
        public final double getF336838b() {
            return s().doubleValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.c r(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.b(zVar, this);
            throw null;
        }

        public final Number s() {
            return Double.valueOf(this.f336835b);
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.o(new StringBuilder("DoublePrimitiveData(value="), this.f336835b, ')');
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final com.avito.beduin.v2.engine.field.d h(com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final v q(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }
    }

    /* compiled from: PrimitiveField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/v$d;", "Lcom/avito/beduin/v2/engine/field/entity/v$k;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements k {

        /* renamed from: b, reason: collision with root package name */
        public final float f336836b;

        public d(float f12) {
            this.f336836b = f12;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.g(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
            return d.b.h(this, zVar, dVar);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: d */
        public final long getF336840b() {
            return s().longValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.l e(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.c(zVar, this);
            throw null;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f336836b, ((d) obj).f336836b) == 0;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: f */
        public final float getF336839b() {
            return s().floatValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.f(zVar, this);
            throw null;
        }

        public final int hashCode() {
            return Float.hashCode(this.f336836b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        @Y61.k
        /* renamed from: i */
        public final String getF336843b() {
            return s().toString();
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        public final int j() {
            return s().intValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final p k(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.d(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final C36268a l(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.a(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> m(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            com.avito.beduin.v2.engine.o oVarA = com.avito.beduin.v2.engine.p.a(zVar);
            com.avito.beduin.v2.engine.field.j jVarA = zVar.A();
            boolean z12 = oVarA.f336896a;
            float f12 = this.f336836b;
            return z12 ? new w.c(jVarA, f12) : new w.e(jVarA, String.valueOf(f12));
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: n */
        public final boolean getF336837b() {
            k.a.a();
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: p */
        public final double getF336838b() {
            return s().doubleValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.c r(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.b(zVar, this);
            throw null;
        }

        public final Number s() {
            return Float.valueOf(this.f336836b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f336836b, new StringBuilder("FloatPrimitiveData(value="));
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final com.avito.beduin.v2.engine.field.d h(com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final v q(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }
    }

    /* compiled from: PrimitiveField.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/v$e;", "Lcom/avito/beduin/v2/engine/field/entity/v;", "value", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements v {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f336837b;

        private /* synthetic */ e(boolean z12) {
            this.f336837b = z12;
        }

        public static final /* synthetic */ e s(boolean z12) {
            return new e(z12);
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.g(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
            return d.b.h(this, zVar, dVar);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: d */
        public final long getF336840b() {
            throw new IllegalArgumentException("Boolean primitive can't be cast to long");
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.l e(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.c(zVar, this);
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof e) {
                return this.f336837b == ((e) obj).f336837b;
            }
            return false;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: f */
        public final float getF336839b() {
            throw new IllegalArgumentException("Boolean primitive can't be cast to float");
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.f(zVar, this);
            throw null;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f336837b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        @Y61.k
        /* renamed from: i */
        public final String getF336843b() {
            return String.valueOf(this.f336837b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        public final int j() {
            throw new IllegalArgumentException("Boolean primitive can't be cast to int");
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final p k(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.d(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final C36268a l(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.a(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> m(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return com.avito.beduin.v2.engine.p.a(zVar).d(zVar.A(), this.f336837b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: n, reason: from getter */
        public final boolean getF336837b() {
            return this.f336837b;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: p */
        public final double getF336838b() {
            throw new IllegalArgumentException("Boolean primitive can't be cast to double");
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.c r(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.b(zVar, this);
            throw null;
        }

        public final String toString() {
            return "InlineBooleanPrimitiveData(value=" + this.f336837b + ')';
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final com.avito.beduin.v2.engine.field.d h(com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final v q(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }
    }

    /* compiled from: PrimitiveField.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/v$f;", "Lcom/avito/beduin/v2/engine/field/entity/v$k;", "value", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements k {

        /* renamed from: b, reason: collision with root package name */
        public final double f336838b;

        private /* synthetic */ f(double d12) {
            this.f336838b = d12;
        }

        public static final /* synthetic */ f s(double d12) {
            return new f(d12);
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.g(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
            return d.b.h(this, zVar, dVar);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: d */
        public final long getF336840b() {
            return Double.valueOf(this.f336838b).longValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.l e(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.c(zVar, this);
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof f) {
                return Double.compare(this.f336838b, ((f) obj).f336838b) == 0;
            }
            return false;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: f */
        public final float getF336839b() {
            return Double.valueOf(this.f336838b).floatValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.f(zVar, this);
            throw null;
        }

        public final int hashCode() {
            return Double.hashCode(this.f336838b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        @Y61.k
        /* renamed from: i */
        public final String getF336843b() {
            return Double.valueOf(this.f336838b).toString();
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        public final int j() {
            return Double.valueOf(this.f336838b).intValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final p k(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.d(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final C36268a l(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.a(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> m(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return com.avito.beduin.v2.engine.p.a(zVar).b(zVar.A(), new f(this.f336838b).f336838b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: n */
        public final boolean getF336837b() {
            k.a.a();
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: p, reason: from getter */
        public final double getF336838b() {
            return this.f336838b;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.c r(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.b(zVar, this);
            throw null;
        }

        public final String toString() {
            return "InlineDoublePrimitiveData(value=" + this.f336838b + ')';
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final com.avito.beduin.v2.engine.field.d h(com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final v q(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }
    }

    /* compiled from: PrimitiveField.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/v$g;", "Lcom/avito/beduin/v2/engine/field/entity/v$k;", "value", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements k {

        /* renamed from: b, reason: collision with root package name */
        public final float f336839b;

        private /* synthetic */ g(float f12) {
            this.f336839b = f12;
        }

        public static final /* synthetic */ g s(float f12) {
            return new g(f12);
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.g(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
            return d.b.h(this, zVar, dVar);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: d */
        public final long getF336840b() {
            return Float.valueOf(this.f336839b).longValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.l e(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.c(zVar, this);
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof g) {
                return Float.compare(this.f336839b, ((g) obj).f336839b) == 0;
            }
            return false;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: f, reason: from getter */
        public final float getF336839b() {
            return this.f336839b;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.f(zVar, this);
            throw null;
        }

        public final int hashCode() {
            return Float.hashCode(this.f336839b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        @Y61.k
        /* renamed from: i */
        public final String getF336843b() {
            return Float.valueOf(this.f336839b).toString();
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        public final int j() {
            return Float.valueOf(this.f336839b).intValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final p k(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.d(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final C36268a l(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.a(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> m(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            com.avito.beduin.v2.engine.o oVarA = com.avito.beduin.v2.engine.p.a(zVar);
            com.avito.beduin.v2.engine.field.j jVarA = zVar.A();
            boolean z12 = oVarA.f336896a;
            float f12 = this.f336839b;
            return z12 ? new w.c(jVarA, f12) : new w.e(jVarA, String.valueOf(f12));
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: n */
        public final boolean getF336837b() {
            k.a.a();
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: p */
        public final double getF336838b() {
            return Float.valueOf(this.f336839b).doubleValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.c r(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.b(zVar, this);
            throw null;
        }

        public final String toString() {
            return "InlineFloatPrimitiveData(value=" + this.f336839b + ')';
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final com.avito.beduin.v2.engine.field.d h(com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final v q(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }
    }

    /* compiled from: PrimitiveField.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/v$h;", "Lcom/avito/beduin/v2/engine/field/entity/v$k;", "value", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements k {

        /* renamed from: b, reason: collision with root package name */
        public final long f336840b;

        private /* synthetic */ h(long j12) {
            this.f336840b = j12;
        }

        public static final /* synthetic */ h s(long j12) {
            return new h(j12);
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.g(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
            return d.b.h(this, zVar, dVar);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: d, reason: from getter */
        public final long getF336840b() {
            return this.f336840b;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.l e(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.c(zVar, this);
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof h) {
                return this.f336840b == ((h) obj).f336840b;
            }
            return false;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: f */
        public final float getF336839b() {
            return Long.valueOf(this.f336840b).floatValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.f(zVar, this);
            throw null;
        }

        public final int hashCode() {
            return Long.hashCode(this.f336840b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        @Y61.k
        /* renamed from: i */
        public final String getF336843b() {
            return Long.valueOf(this.f336840b).toString();
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        public final int j() {
            return Long.valueOf(this.f336840b).intValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final p k(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.d(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final C36268a l(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.a(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> m(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return com.avito.beduin.v2.engine.p.a(zVar).c(zVar.A(), new h(this.f336840b).f336840b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: n */
        public final boolean getF336837b() {
            k.a.a();
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: p */
        public final double getF336838b() {
            return Long.valueOf(this.f336840b).doubleValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.c r(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.b(zVar, this);
            throw null;
        }

        public final String toString() {
            return androidx.appcompat.app.r.u(new StringBuilder("InlineLongPrimitiveData(value="), this.f336840b, ')');
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final com.avito.beduin.v2.engine.field.d h(com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final v q(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }
    }

    /* compiled from: PrimitiveField.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/v$i;", "Lcom/avito/beduin/v2/engine/field/entity/v;", "value", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements v {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f336841b;

        private /* synthetic */ i(String str) {
            this.f336841b = str;
        }

        public static final /* synthetic */ i s(String str) {
            return new i(str);
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.g(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
            return d.b.h(this, zVar, dVar);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: d */
        public final long getF336840b() {
            return Long.parseLong(this.f336841b);
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.l e(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.c(zVar, this);
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof i) {
                return L.f(this.f336841b, ((i) obj).f336841b);
            }
            return false;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: f */
        public final float getF336839b() {
            return Float.parseFloat(this.f336841b);
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.f(zVar, this);
            throw null;
        }

        public final int hashCode() {
            return this.f336841b.hashCode();
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        @Y61.k
        /* renamed from: i, reason: from getter */
        public final String getF336843b() {
            return this.f336841b;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        public final int j() {
            return Integer.parseInt(this.f336841b);
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final p k(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.d(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final C36268a l(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.a(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> m(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            com.avito.beduin.v2.engine.o oVarA = com.avito.beduin.v2.engine.p.a(zVar);
            com.avito.beduin.v2.engine.field.j jVarA = zVar.A();
            oVarA.getClass();
            return new w.e(jVarA, this.f336841b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: n */
        public final boolean getF336837b() {
            return Boolean.parseBoolean(this.f336841b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: p */
        public final double getF336838b() {
            return Double.parseDouble(this.f336841b);
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.c r(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.b(zVar, this);
            throw null;
        }

        public final String toString() {
            return C22026a.c(new StringBuilder("InlineStringPrimitiveData(value="), this.f336841b, ')');
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final com.avito.beduin.v2.engine.field.d h(com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final v q(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }
    }

    /* compiled from: PrimitiveField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/v$j;", "Lcom/avito/beduin/v2/engine/field/entity/v$k;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements k {

        /* renamed from: b, reason: collision with root package name */
        public final long f336842b;

        public j(long j12) {
            this.f336842b = j12;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.g(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
            return d.b.h(this, zVar, dVar);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: d */
        public final long getF336840b() {
            return s().longValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.l e(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.c(zVar, this);
            throw null;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f336842b == ((j) obj).f336842b;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: f */
        public final float getF336839b() {
            return s().floatValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.f(zVar, this);
            throw null;
        }

        public final int hashCode() {
            return Long.hashCode(this.f336842b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        @Y61.k
        /* renamed from: i */
        public final String getF336843b() {
            return s().toString();
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        public final int j() {
            return s().intValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final p k(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.d(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final C36268a l(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.a(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> m(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return com.avito.beduin.v2.engine.p.a(zVar).c(zVar.A(), getF336840b());
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: n */
        public final boolean getF336837b() {
            k.a.a();
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: p */
        public final double getF336838b() {
            return s().doubleValue();
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.c r(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.b(zVar, this);
            throw null;
        }

        public final Number s() {
            return Long.valueOf(this.f336842b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.u(new StringBuilder("LongPrimitiveData(value="), this.f336842b, ')');
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final com.avito.beduin.v2.engine.field.d h(com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final v q(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }
    }

    /* compiled from: PrimitiveField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/v$l;", "Lcom/avito/beduin/v2/engine/field/entity/v;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements v {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f336843b;

        public l(@Y61.k String str) {
            this.f336843b = str;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final A a(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.g(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
            return d.b.h(this, zVar, dVar);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: d */
        public final long getF336840b() {
            return Long.parseLong(this.f336843b);
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.l e(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.c(zVar, this);
            throw null;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f336843b, ((l) obj).f336843b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: f */
        public final float getF336839b() {
            return Float.parseFloat(this.f336843b);
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.f(zVar, this);
            throw null;
        }

        public final int hashCode() {
            return this.f336843b.hashCode();
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        @Y61.k
        /* renamed from: i, reason: from getter */
        public final String getF336843b() {
            return this.f336843b;
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        public final int j() {
            return Integer.parseInt(this.f336843b);
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final p k(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.d(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final C36268a l(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.a(zVar, this);
            throw null;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> m(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            com.avito.beduin.v2.engine.o oVarA = com.avito.beduin.v2.engine.p.a(zVar);
            com.avito.beduin.v2.engine.field.j jVarA = zVar.A();
            oVarA.getClass();
            return new w.e(jVarA, this.f336843b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: n */
        public final boolean getF336837b() {
            return Boolean.parseBoolean(this.f336843b);
        }

        @Override // com.avito.beduin.v2.engine.field.entity.v
        /* renamed from: p */
        public final double getF336838b() {
            return Double.parseDouble(this.f336843b);
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.l
        public final com.avito.beduin.v2.engine.field.entity.c r(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            d.b.b(zVar, this);
            throw null;
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("StringPrimitiveData(value="), this.f336843b, ')');
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        public final com.avito.beduin.v2.engine.field.d h(com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.d
        @Y61.k
        public final v q(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
            return this;
        }
    }
}
