package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.AbstractC43001j;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C42892d;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.text.C43066x;
import m51.d;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/k;", "", "<init>", "()V", "a", "b", "c", "d", "Lkotlin/reflect/jvm/internal/k$a;", "Lkotlin/reflect/jvm/internal/k$b;", "Lkotlin/reflect/jvm/internal/k$c;", "Lkotlin/reflect/jvm/internal/k$d;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.reflect.jvm.internal.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43002k {

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/k$a;", "Lkotlin/reflect/jvm/internal/k;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.k$a */
    public static final class a extends AbstractC43002k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Field f410384a;

        public a(@Y61.k Field field) {
            super(null);
            this.f410384a = field;
        }

        @Override // kotlin.reflect.jvm.internal.AbstractC43002k
        @Y61.k
        /* renamed from: a */
        public final String getF410392f() {
            StringBuilder sb2 = new StringBuilder();
            Field field = this.f410384a;
            sb2.append(kotlin.reflect.jvm.internal.impl.load.java.D.a(field.getName()));
            sb2.append("()");
            sb2.append(C42892d.b(field.getType()));
            return sb2.toString();
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/k$b;", "Lkotlin/reflect/jvm/internal/k;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.k$b */
    public static final class b extends AbstractC43002k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Method f410385a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Method f410386b;

        public b(@Y61.k Method method, @Y61.l Method method2) {
            super(null);
            this.f410385a = method;
            this.f410386b = method2;
        }

        @Override // kotlin.reflect.jvm.internal.AbstractC43002k
        @Y61.k
        /* renamed from: a */
        public final String getF410392f() {
            return f0.a(this.f410385a);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @s0
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/k$c;", "Lkotlin/reflect/jvm/internal/k;", "Lkotlin/reflect/jvm/internal/impl/descriptors/U;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$h;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$d;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/c;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/g;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.k$c */
    public static final class c extends AbstractC43002k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.descriptors.U f410387a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ProtoBuf.h f410388b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final JvmProtoBuf.d f410389c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f410390d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g f410391e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f410392f;

        public c(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.U u12, @Y61.k ProtoBuf.h hVar, @Y61.k JvmProtoBuf.d dVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar) {
            String string;
            kotlin.reflect.jvm.internal.impl.load.kotlin.t tVar;
            String string2;
            super(null);
            this.f410387a = u12;
            this.f410388b = hVar;
            this.f410389c = dVar;
            this.f410390d = cVar;
            this.f410391e = gVar;
            if ((dVar.f409221c & 4) == 4) {
                string2 = cVar.getString(dVar.f409224f.f409211d).concat(cVar.getString(dVar.f409224f.f409212e));
            } else {
                m51.i.f414326a.getClass();
                d.a aVarB = m51.i.b(hVar, cVar, gVar, true);
                if (aVarB == null) {
                    throw new X("No field signature for property: " + u12);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(kotlin.reflect.jvm.internal.impl.load.java.D.a(aVarB.f414315a));
                InterfaceC42882k interfaceC42882kF = u12.f();
                if (kotlin.jvm.internal.L.f(u12.getVisibility(), kotlin.reflect.jvm.internal.impl.descriptors.r.f407788d) && (interfaceC42882kF instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e)) {
                    Integer num = (Integer) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e) interfaceC42882kF).f409801g, JvmProtoBuf.f409153i);
                    string = "$".concat(kotlin.reflect.jvm.internal.impl.name.g.f409254a.f(num != null ? cVar.getString(num.intValue()) : "main", "_"));
                } else if (!kotlin.jvm.internal.L.f(u12.getVisibility(), kotlin.reflect.jvm.internal.impl.descriptors.r.f407785a) || !(interfaceC42882kF instanceof kotlin.reflect.jvm.internal.impl.descriptors.K) || (tVar = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.x) u12).f409882F) == null || tVar.f408545c == null) {
                    string = "";
                } else {
                    StringBuilder sb3 = new StringBuilder("$");
                    String strE = tVar.f408544b.e();
                    sb3.append(kotlin.reflect.jvm.internal.impl.name.f.e(C43066x.n0('/', strE, strE)).b());
                    string = sb3.toString();
                }
                sb2.append(string);
                sb2.append("()");
                sb2.append(aVarB.f414316b);
                string2 = sb2.toString();
            }
            this.f410392f = string2;
        }

        @Override // kotlin.reflect.jvm.internal.AbstractC43002k
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF410392f() {
            return this.f410392f;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/k$d;", "Lkotlin/reflect/jvm/internal/k;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.k$d */
    public static final class d extends AbstractC43002k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AbstractC43001j.e f410393a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final AbstractC43001j.e f410394b;

        public d(@Y61.k AbstractC43001j.e eVar, @Y61.l AbstractC43001j.e eVar2) {
            super(null);
            this.f410393a = eVar;
            this.f410394b = eVar2;
        }

        @Override // kotlin.reflect.jvm.internal.AbstractC43002k
        @Y61.k
        /* renamed from: a */
        public final String getF410392f() {
            return this.f410393a.f410381b;
        }
    }

    public /* synthetic */ AbstractC43002k(C42822w c42822w) {
        this();
    }

    @Y61.k
    /* renamed from: a */
    public abstract String getF410392f();

    public AbstractC43002k() {
    }
}
