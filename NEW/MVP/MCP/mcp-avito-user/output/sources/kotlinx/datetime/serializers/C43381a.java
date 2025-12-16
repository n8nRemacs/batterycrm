package kotlinx.datetime.serializers;

import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlinx.datetime.i;
import kotlinx.serialization.InterfaceC43386e;
import kotlinx.serialization.InterfaceC43389h;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractC43393b;

/* compiled from: DateTimeUnitSerializers.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/serializers/a;", "Lkotlinx/serialization/internal/b;", "Lkotlinx/datetime/i$b;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.serializers.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43381a extends AbstractC43393b<i.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C43381a f412627a = new C43381a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Object f412628b = C42727D.b(LazyThreadSafetyMode.f406615c, C11755a.f412629l);

    /* compiled from: DateTimeUnitSerializers.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/r;", "Lkotlinx/datetime/i$b;", "invoke", "()Lkotlinx/serialization/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlinx.datetime.serializers.a$a, reason: collision with other inner class name */
    public static final class C11755a extends N implements Y41.a<kotlinx.serialization.r<i.b>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C11755a f412629l = new C11755a();

        public C11755a() {
            super(0);
        }

        @Override // Y41.a
        public final kotlinx.serialization.r<i.b> invoke() {
            n0 n0Var = m0.f406844a;
            return new kotlinx.serialization.r<>("kotlinx.datetime.DateTimeUnit.DateBased", n0Var.b(i.b.class), new kotlin.reflect.d[]{n0Var.b(i.c.class), n0Var.b(i.d.class)}, new KSerializer[]{i.f412644a, u.f412671a});
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlinx.serialization.internal.AbstractC43393b
    @Y61.l
    @InterfaceC43389h
    public final InterfaceC43386e<i.b> a(@Y61.k kotlinx.serialization.encoding.c cVar, @Y61.l String str) {
        return ((kotlinx.serialization.r) f412628b.getValue()).a(cVar, str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlinx.serialization.internal.AbstractC43393b
    public final kotlinx.serialization.x<i.b> b(Encoder encoder, i.b bVar) {
        return ((kotlinx.serialization.r) f412628b.getValue()).b(encoder, bVar);
    }

    @Override // kotlinx.serialization.internal.AbstractC43393b
    @Y61.k
    public final kotlin.reflect.d<i.b> c() {
        return m0.f406844a.b(i.b.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        return ((kotlinx.serialization.r) f412628b.getValue()).getF332717a();
    }
}
