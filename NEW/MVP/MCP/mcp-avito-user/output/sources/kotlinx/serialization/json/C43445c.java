package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.X;
import kotlin.collections.C42784z0;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.p;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43399e;
import kotlinx.serialization.internal.C43401f;

/* compiled from: JsonElementSerializers.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/json/c;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonArray;", "<init>", "()V", "a", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* renamed from: kotlinx.serialization.json.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43445c implements KSerializer<JsonArray> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C43445c f412959a = new C43445c();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final SerialDescriptor f412960b = a.f412961b;

    /* compiled from: JsonElementSerializers.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/c$a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.serialization.json.c$a */
    public static final class a implements SerialDescriptor {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f412961b = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final String f412962c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C43399e f412963a = new C43401f(q.f413138a).f412855b;

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean b() {
            this.f412963a.getClass();
            return false;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: c */
        public final int getF412801c() {
            this.f412963a.getClass();
            return 1;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @InterfaceC43387f
        @Y61.k
        public final String d(int i12) {
            this.f412963a.getClass();
            return String.valueOf(i12);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @InterfaceC43387f
        @Y61.k
        public final List<Annotation> e(int i12) {
            return this.f412963a.e(i12);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @Y61.k
        /* renamed from: f */
        public final String getF412799a() {
            return f412962c;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @InterfaceC43387f
        public final int g(@Y61.k String str) {
            return this.f412963a.g(str);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @Y61.k
        public final List<Annotation> getAnnotations() {
            this.f412963a.getClass();
            return C42784z0.f406748b;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @Y61.k
        public final kotlinx.serialization.descriptors.o getKind() {
            this.f412963a.getClass();
            return p.b.f412752a;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @InterfaceC43387f
        @Y61.k
        public final SerialDescriptor h(int i12) {
            return this.f412963a.h(i12);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @InterfaceC43387f
        public final boolean i(int i12) {
            this.f412963a.i(i12);
            return false;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: isInline */
        public final boolean getF412817l() {
            this.f412963a.getClass();
            return false;
        }
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        s.a(decoder);
        return new JsonArray((List) new C43401f(q.f413138a).e(decoder));
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        return f412960b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        s.b(encoder);
        new C43401f(q.f413138a).serialize(encoder, (JsonArray) obj);
    }
}
