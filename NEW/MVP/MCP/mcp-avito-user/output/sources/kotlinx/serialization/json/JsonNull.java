package kotlinx.serialization.json;

import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.serialization.KSerializer;

/* compiled from: JsonElement.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/JsonPrimitive;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlinx.serialization.w(with = A.class)
/* loaded from: classes8.dex */
public final class JsonNull extends JsonPrimitive {

    @Y61.k
    public static final JsonNull INSTANCE = new JsonNull();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f412949b = "null";

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Object f412950c = C42727D.b(LazyThreadSafetyMode.f406615c, a.f412951l);

    /* compiled from: JsonElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<KSerializer<Object>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f412951l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final KSerializer<Object> invoke() {
            return A.f412929a;
        }
    }

    public JsonNull() {
        super(null);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @Y61.k
    /* renamed from: b */
    public final String getF413144d() {
        return f412949b;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* renamed from: d */
    public final boolean getF413142b() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Y61.k
    public final KSerializer<JsonNull> serializer() {
        return (KSerializer) f412950c.getValue();
    }
}
