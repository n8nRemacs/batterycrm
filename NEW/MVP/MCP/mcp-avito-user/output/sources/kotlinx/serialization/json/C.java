package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.X;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.u0;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.p;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43398d0;
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.V0;

/* compiled from: JsonElementSerializers.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/json/C;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonObject;", "<init>", "()V", "a", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes8.dex */
public final class C implements KSerializer<JsonObject> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C f412932a = new C();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final SerialDescriptor f412933b = a.f412934b;

    /* compiled from: JsonElementSerializers.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/C$a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements SerialDescriptor {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f412934b = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final String f412935c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C43398d0 f412936a;

        public a() {
            u0 u0Var = u0.f406856a;
            this.f412936a = new C43400e0(V0.f412822a, q.f413138a).f412852c;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean b() {
            this.f412936a.getClass();
            return false;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: c */
        public final int getF412801c() {
            this.f412936a.getClass();
            return 2;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @InterfaceC43387f
        @Y61.k
        public final String d(int i12) {
            this.f412936a.getClass();
            return String.valueOf(i12);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @InterfaceC43387f
        @Y61.k
        public final List<Annotation> e(int i12) {
            return this.f412936a.e(i12);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @Y61.k
        /* renamed from: f */
        public final String getF412788a() {
            return f412935c;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @InterfaceC43387f
        public final int g(@Y61.k String str) {
            return this.f412936a.g(str);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @Y61.k
        public final List<Annotation> getAnnotations() {
            this.f412936a.getClass();
            return C42784z0.f406748b;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @Y61.k
        public final kotlinx.serialization.descriptors.o getKind() {
            this.f412936a.getClass();
            return p.c.f412753a;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @InterfaceC43387f
        @Y61.k
        public final SerialDescriptor h(int i12) {
            return this.f412936a.h(i12);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @InterfaceC43387f
        public final boolean i(int i12) {
            this.f412936a.i(i12);
            return false;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: isInline */
        public final boolean getF412817l() {
            this.f412936a.getClass();
            return false;
        }
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        s.a(decoder);
        u0 u0Var = u0.f406856a;
        return new JsonObject((Map) new C43400e0(V0.f412822a, q.f413138a).e(decoder));
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        return f412933b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        s.b(encoder);
        u0 u0Var = u0.f406856a;
        new C43400e0(V0.f412822a, q.f413138a).serialize(encoder, (JsonObject) obj);
    }
}
