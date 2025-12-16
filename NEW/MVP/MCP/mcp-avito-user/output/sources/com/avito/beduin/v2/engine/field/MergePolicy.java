package com.avito.beduin.v2.engine.field;

import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.core.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MergePolicy.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy;", "Lcom/avito/beduin/v2/engine/field/k;", "a", "Builder", "b", "d", "e", "f", "g", "Lcom/avito/beduin/v2/engine/field/MergePolicy$a;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$d;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$f;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$g;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface MergePolicy extends k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f336739a = b.f336757a;

    /* compiled from: MergePolicy.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder;", "", "Operation", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Builder {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Operation f336740a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f336741b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f336742c;

        /* renamed from: d, reason: collision with root package name */
        public final int f336743d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MergePolicy.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation;", "", "f", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Operation {

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public static final f f336744c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public static final LinkedHashMap f336745d;

            /* renamed from: e, reason: collision with root package name */
            public static final Operation f336746e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ Operation[] f336747f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f336748g;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f336749b;

            /* compiled from: MergePolicy.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation$a;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class a extends Operation {

                /* renamed from: h, reason: collision with root package name */
                @Y61.k
                public final String f336750h;

                public a() {
                    super("ADD_AFTER", 4, null);
                    this.f336750h = "AddAfter";
                }

                @Override // com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation
                @Y61.k
                /* renamed from: a, reason: from getter */
                public final String getF336749b() {
                    return this.f336750h;
                }

                @Override // com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation
                @Y61.k
                public final MergePolicy b(@Y61.k Builder builder) {
                    return new a(builder.f336741b, new e.a(builder.f336742c));
                }
            }

            /* compiled from: MergePolicy.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation$b;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class b extends Operation {

                /* renamed from: h, reason: collision with root package name */
                @Y61.k
                public final String f336751h;

                public b() {
                    super("ADD_AT", 3, null);
                    this.f336751h = "AddAt";
                }

                @Override // com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation
                @Y61.k
                /* renamed from: a, reason: from getter */
                public final String getF336749b() {
                    return this.f336751h;
                }

                @Override // com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation
                @Y61.k
                public final MergePolicy b(@Y61.k Builder builder) {
                    return new a(builder.f336741b, new e.b(builder.f336743d));
                }
            }

            /* compiled from: MergePolicy.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation$c;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class c extends Operation {

                /* renamed from: h, reason: collision with root package name */
                @Y61.k
                public final String f336752h;

                public c() {
                    super("ADD_BEFORE", 5, null);
                    this.f336752h = "AddBefore";
                }

                @Override // com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation
                @Y61.k
                /* renamed from: a, reason: from getter */
                public final String getF336749b() {
                    return this.f336752h;
                }

                @Override // com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation
                @Y61.k
                public final MergePolicy b(@Y61.k Builder builder) {
                    return new a(builder.f336741b, new e.c(builder.f336742c));
                }
            }

            /* compiled from: MergePolicy.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation$d;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class d extends Operation {

                /* renamed from: h, reason: collision with root package name */
                @Y61.k
                public final String f336753h;

                public d() {
                    super("ADD_TO_BEGIN", 6, null);
                    this.f336753h = "AddToBegin";
                }

                @Override // com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation
                @Y61.k
                /* renamed from: a, reason: from getter */
                public final String getF336749b() {
                    return this.f336753h;
                }

                @Override // com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation
                @Y61.k
                public final MergePolicy b(@Y61.k Builder builder) {
                    return new a(builder.f336741b, e.d.f336763a);
                }
            }

            /* compiled from: MergePolicy.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation$e;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class e extends Operation {

                /* renamed from: h, reason: collision with root package name */
                @Y61.k
                public final String f336754h;

                public e() {
                    super("ADD_TO_END", 7, null);
                    this.f336754h = "AddToEnd";
                }

                @Override // com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation
                @Y61.k
                /* renamed from: a, reason: from getter */
                public final String getF336749b() {
                    return this.f336754h;
                }

                @Override // com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation
                @Y61.k
                public final MergePolicy b(@Y61.k Builder builder) {
                    return new a(builder.f336741b, e.C10439e.f336764a);
                }
            }

            /* compiled from: MergePolicy.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation$f;", "", "<init>", "()V", "", "", "Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation;", "values", "Ljava/util/Map;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class f {
                public /* synthetic */ f(C42822w c42822w) {
                    this();
                }

                public f() {
                }
            }

            /* compiled from: MergePolicy.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation$g;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class g extends Operation {
                public g() {
                    throw null;
                }

                @Override // com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation
                @Y61.k
                public final MergePolicy b(@Y61.k Builder builder) {
                    return new d(builder.f336741b);
                }
            }

            /* compiled from: MergePolicy.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation$h;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class h extends Operation {
                public h() {
                    throw null;
                }

                @Override // com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation
                @Y61.k
                public final MergePolicy b(@Y61.k Builder builder) {
                    return new f(builder.f336741b);
                }
            }

            /* compiled from: MergePolicy.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation$i;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$Builder$Operation;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class i extends Operation {
                public i() {
                    throw null;
                }

                @Override // com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation
                @Y61.k
                public final MergePolicy b(@Y61.k Builder builder) {
                    return new g(builder.f336741b);
                }
            }

            static {
                g gVar = new g("MERGE", 0, null);
                f336746e = gVar;
                Operation[] operationArr = {gVar, new h("REMOVE", 1, null), new i("REPLACE", 2, null), new b(), new a(), new c(), new d(), new e()};
                f336747f = operationArr;
                f336748g = kotlin.enums.c.a(operationArr);
                f336744c = new f(null);
                Operation[] operationArrValues = values();
                int iF2 = P0.f(operationArrValues.length);
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF2 < 16 ? 16 : iF2);
                for (Operation operation : operationArrValues) {
                    linkedHashMap.put(operation.getF336749b().toLowerCase(Locale.ROOT), operation);
                }
                f336745d = linkedHashMap;
            }

            public Operation() {
                throw null;
            }

            public Operation(String str, int i12, C42822w c42822w) {
                this.f336749b = name();
            }

            public static Operation valueOf(String str) {
                return (Operation) Enum.valueOf(Operation.class, str);
            }

            public static Operation[] values() {
                return (Operation[]) f336747f.clone();
            }

            @Y61.k
            /* renamed from: a, reason: from getter */
            public String getF336749b() {
                return this.f336749b;
            }

            @Y61.k
            public abstract MergePolicy b(@Y61.k Builder builder);

            @Override // java.lang.Enum
            @Y61.k
            public final String toString() {
                return getF336749b();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Builder(@Y61.k com.avito.beduin.v2.engine.core.z r6, @Y61.k com.avito.beduin.v2.engine.field.entity.A r7) {
            /*
                r5 = this;
                java.lang.String r0 = "operation"
                com.avito.beduin.v2.engine.field.m r7 = r7.f336778b
                com.avito.beduin.v2.engine.field.d r0 = r7.c(r0)
                r1 = 0
                if (r0 == 0) goto L35
                com.avito.beduin.v2.engine.field.entity.v r0 = r0.q(r6)
                if (r0 == 0) goto L16
                java.lang.String r0 = r0.getF336843b()
                goto L17
            L16:
                r0 = r1
            L17:
                if (r0 == 0) goto L35
                com.avito.beduin.v2.engine.field.MergePolicy$Builder$Operation$f r2 = com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation.f336744c
                r2.getClass()
                java.util.LinkedHashMap r2 = com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation.f336745d
                java.util.Locale r3 = java.util.Locale.ROOT
                java.lang.String r3 = r0.toLowerCase(r3)
                java.lang.Object r2 = r2.get(r3)
                com.avito.beduin.v2.engine.field.MergePolicy$Builder$Operation r2 = (com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation) r2
                if (r2 != 0) goto L32
                com.avito.beduin.v2.engine.field.MergePolicy$Builder$Operation r2 = com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation.valueOf(r0)
            L32:
                if (r2 == 0) goto L35
                goto L37
            L35:
                com.avito.beduin.v2.engine.field.MergePolicy$Builder$Operation r2 = com.avito.beduin.v2.engine.field.MergePolicy.Builder.Operation.f336746e
            L37:
                java.lang.String r0 = "targetId"
                com.avito.beduin.v2.engine.field.d r0 = r7.c(r0)
                if (r0 == 0) goto L4a
                com.avito.beduin.v2.engine.field.entity.v r0 = r0.q(r6)
                if (r0 == 0) goto L4a
                java.lang.String r0 = r0.getF336843b()
                goto L4b
            L4a:
                r0 = r1
            L4b:
                java.lang.String r3 = "relativeId"
                com.avito.beduin.v2.engine.field.d r3 = r7.c(r3)
                if (r3 == 0) goto L5e
                com.avito.beduin.v2.engine.field.entity.v r3 = r3.q(r6)
                if (r3 == 0) goto L5e
                java.lang.String r3 = r3.getF336843b()
                goto L5f
            L5e:
                r3 = r1
            L5f:
                java.lang.String r4 = "position"
                com.avito.beduin.v2.engine.field.d r7 = r7.c(r4)
                if (r7 == 0) goto L7c
                com.avito.beduin.v2.engine.field.entity.v r6 = r7.q(r6)
                if (r6 == 0) goto L75
                int r6 = r6.j()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            L75:
                if (r1 == 0) goto L7c
                int r6 = r1.intValue()
                goto L7d
            L7c:
                r6 = 0
            L7d:
                r5.<init>()
                r5.f336740a = r2
                r5.f336741b = r0
                r5.f336742c = r3
                r5.f336743d = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.engine.field.MergePolicy.Builder.<init>(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.entity.A):void");
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return this.f336740a == builder.f336740a && L.f(this.f336741b, builder.f336741b) && L.f(this.f336742c, builder.f336742c) && this.f336743d == builder.f336743d;
        }

        public final int hashCode() {
            int iHashCode = this.f336740a.hashCode() * 31;
            String str = this.f336741b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f336742c;
            return Integer.hashCode(this.f336743d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Builder(operation=");
            sb2.append(this.f336740a);
            sb2.append(", targetId=");
            sb2.append(this.f336741b);
            sb2.append(", relativeId=");
            sb2.append(this.f336742c);
            sb2.append(", position=");
            return androidx.appcompat.app.r.t(sb2, this.f336743d, ')');
        }
    }

    /* compiled from: MergePolicy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$b;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f336757a = new b();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final d f336758b = new d(null);
    }

    /* compiled from: MergePolicy.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c {
    }

    /* compiled from: MergePolicy.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$e;", "", "a", "b", "c", "d", "e", "Lcom/avito/beduin/v2/engine/field/MergePolicy$e$a;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$e$b;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$e$c;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$e$d;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$e$e;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e {

        /* compiled from: MergePolicy.kt */
        @s0
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$e$a;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$e;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f336760a;

            public a(@Y61.k String str) {
                this.f336760a = str;
            }

            @Override // com.avito.beduin.v2.engine.field.MergePolicy.e
            public final int a(@Y61.k ArrayList arrayList) {
                Iterator it = arrayList.iterator();
                int i12 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i12 = -1;
                        break;
                    }
                    if (L.f(((com.avito.beduin.v2.engine.field.f) it.next()).getF336831b().getF336873c(), this.f336760a)) {
                        break;
                    }
                    i12++;
                }
                return i12 + 1;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f336760a, ((a) obj).f336760a);
            }

            public final int hashCode() {
                return this.f336760a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("After(relativeId="), this.f336760a, ')');
            }
        }

        /* compiled from: MergePolicy.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$e$b;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$e;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements e {

            /* renamed from: a, reason: collision with root package name */
            public final int f336761a;

            public b(int i12) {
                this.f336761a = i12;
            }

            @Override // com.avito.beduin.v2.engine.field.MergePolicy.e
            public final int a(@Y61.k ArrayList arrayList) {
                return this.f336761a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f336761a == ((b) obj).f336761a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f336761a);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.t(new StringBuilder("At(position="), this.f336761a, ')');
            }
        }

        /* compiled from: MergePolicy.kt */
        @s0
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$e$c;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$e;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f336762a;

            public c(@Y61.k String str) {
                this.f336762a = str;
            }

            @Override // com.avito.beduin.v2.engine.field.MergePolicy.e
            public final int a(@Y61.k ArrayList arrayList) {
                Iterator it = arrayList.iterator();
                int i12 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i12 = -1;
                        break;
                    }
                    if (L.f(((com.avito.beduin.v2.engine.field.f) it.next()).getF336831b().getF336873c(), this.f336762a)) {
                        break;
                    }
                    i12++;
                }
                int i13 = i12 - 1;
                if (i13 < 0) {
                    return 0;
                }
                return i13;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f336762a, ((c) obj).f336762a);
            }

            public final int hashCode() {
                return this.f336762a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Before(relativeId="), this.f336762a, ')');
            }
        }

        /* compiled from: MergePolicy.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$e$d;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$e;", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d implements e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f336763a = new d();

            @Override // com.avito.beduin.v2.engine.field.MergePolicy.e
            public final int a(@Y61.k ArrayList arrayList) {
                return 0;
            }
        }

        /* compiled from: MergePolicy.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$e$e;", "Lcom/avito/beduin/v2/engine/field/MergePolicy$e;", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.engine.field.MergePolicy$e$e, reason: collision with other inner class name */
        public static final class C10439e implements e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C10439e f336764a = new C10439e();

            @Override // com.avito.beduin.v2.engine.field.MergePolicy.e
            public final int a(@Y61.k ArrayList arrayList) {
                return arrayList.size();
            }
        }

        int a(@Y61.k ArrayList arrayList);
    }

    @Y61.l
    /* renamed from: b */
    String getF336766b();

    /* compiled from: MergePolicy.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$a;", "Lcom/avito/beduin/v2/engine/field/MergePolicy;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements MergePolicy {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f336755b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final e f336756c;

        public a(@Y61.l String str, @Y61.k e eVar) {
            this.f336755b = str;
            this.f336756c = eVar;
        }

        @Override // com.avito.beduin.v2.engine.field.MergePolicy
        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getF336766b() {
            return this.f336755b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f336755b, aVar.f336755b) && L.f(this.f336756c, aVar.f336756c);
        }

        public final int hashCode() {
            String str = this.f336755b;
            return this.f336756c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            return "Add(targetId=" + this.f336755b + ", position=" + this.f336756c + ')';
        }

        @Override // com.avito.beduin.v2.engine.field.k
        @Y61.k
        public final MergePolicy get() {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.k
        @Y61.k
        public final MergePolicy a(@Y61.k z zVar, @Y61.k Map<q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> map) {
            return this;
        }
    }

    /* compiled from: MergePolicy.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$d;", "Lcom/avito/beduin/v2/engine/field/MergePolicy;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements MergePolicy {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f336759b;

        public d(@Y61.l String str) {
            this.f336759b = str;
        }

        @Override // com.avito.beduin.v2.engine.field.MergePolicy
        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getF336766b() {
            return this.f336759b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f336759b, ((d) obj).f336759b);
        }

        public final int hashCode() {
            String str = this.f336759b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Merge(targetId="), this.f336759b, ')');
        }

        @Override // com.avito.beduin.v2.engine.field.k
        @Y61.k
        public final MergePolicy get() {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.k
        @Y61.k
        public final MergePolicy a(@Y61.k z zVar, @Y61.k Map<q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> map) {
            return this;
        }
    }

    /* compiled from: MergePolicy.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$f;", "Lcom/avito/beduin/v2/engine/field/MergePolicy;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements MergePolicy {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f336765b;

        public f(@Y61.l String str) {
            this.f336765b = str;
        }

        @Override // com.avito.beduin.v2.engine.field.MergePolicy
        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getF336766b() {
            return this.f336765b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f336765b, ((f) obj).f336765b);
        }

        public final int hashCode() {
            String str = this.f336765b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Remove(targetId="), this.f336765b, ')');
        }

        @Override // com.avito.beduin.v2.engine.field.k
        @Y61.k
        public final MergePolicy get() {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.k
        @Y61.k
        public final MergePolicy a(@Y61.k z zVar, @Y61.k Map<q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> map) {
            return this;
        }
    }

    /* compiled from: MergePolicy.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/field/MergePolicy$g;", "Lcom/avito/beduin/v2/engine/field/MergePolicy;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements MergePolicy {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f336766b;

        public g(@Y61.l String str) {
            this.f336766b = str;
        }

        @Override // com.avito.beduin.v2.engine.field.MergePolicy
        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getF336766b() {
            return this.f336766b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f336766b, ((g) obj).f336766b);
        }

        public final int hashCode() {
            String str = this.f336766b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Replace(targetId="), this.f336766b, ')');
        }

        @Override // com.avito.beduin.v2.engine.field.k
        @Y61.k
        public final MergePolicy get() {
            return this;
        }

        @Override // com.avito.beduin.v2.engine.field.k
        @Y61.k
        public final MergePolicy a(@Y61.k z zVar, @Y61.k Map<q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> map) {
            return this;
        }
    }
}
