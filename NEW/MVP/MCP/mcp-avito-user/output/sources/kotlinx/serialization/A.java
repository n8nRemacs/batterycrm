package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.internal.B0;
import kotlinx.serialization.internal.C43419o;
import kotlinx.serialization.internal.Q0;

/* compiled from: SerializersCache.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Q0<? extends Object> f412689a = C43419o.a(c.f412695l);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Q0<Object> f412690b = C43419o.a(d.f412696l);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final B0<? extends Object> f412691c = C43419o.b(a.f412693l);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final B0<Object> f412692d = C43419o.b(b.f412694l);

    /* compiled from: SerializersCache.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/reflect/d;", "", "clazz", "", "Lkotlin/reflect/r;", "types", "Lkotlinx/serialization/KSerializer;", "invoke", "(Lkotlin/reflect/d;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<kotlin.reflect.d<Object>, List<? extends kotlin.reflect.r>, KSerializer<? extends Object>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f412693l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final KSerializer<? extends Object> invoke(kotlin.reflect.d<Object> dVar, List<? extends kotlin.reflect.r> list) {
            List<? extends kotlin.reflect.r> list2 = list;
            return C.b(dVar, C.h(kotlinx.serialization.modules.m.f413167a, list2, true), new z(list2));
        }
    }

    /* compiled from: SerializersCache.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/reflect/d;", "", "clazz", "", "Lkotlin/reflect/r;", "types", "Lkotlinx/serialization/KSerializer;", "invoke", "(Lkotlin/reflect/d;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<kotlin.reflect.d<Object>, List<? extends kotlin.reflect.r>, KSerializer<Object>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f412694l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final KSerializer<Object> invoke(kotlin.reflect.d<Object> dVar, List<? extends kotlin.reflect.r> list) {
            List<? extends kotlin.reflect.r> list2 = list;
            KSerializer kSerializerB = C.b(dVar, C.h(kotlinx.serialization.modules.m.f413167a, list2, true), new B(list2));
            if (kSerializerB != null) {
                return L51.a.a(kSerializerB);
            }
            return null;
        }
    }

    /* compiled from: SerializersCache.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/reflect/d;", "it", "Lkotlinx/serialization/KSerializer;", "", "invoke", "(Lkotlin/reflect/d;)Lkotlinx/serialization/KSerializer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<kotlin.reflect.d<?>, KSerializer<? extends Object>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f412695l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final KSerializer<? extends Object> invoke(kotlin.reflect.d<?> dVar) {
            return C.f(dVar);
        }
    }

    /* compiled from: SerializersCache.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/reflect/d;", "it", "Lkotlinx/serialization/KSerializer;", "", "invoke", "(Lkotlin/reflect/d;)Lkotlinx/serialization/KSerializer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<kotlin.reflect.d<?>, KSerializer<Object>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f412696l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final KSerializer<Object> invoke(kotlin.reflect.d<?> dVar) {
            KSerializer kSerializerF = C.f(dVar);
            if (kSerializerF != null) {
                return L51.a.a(kSerializerF);
            }
            return null;
        }
    }
}
