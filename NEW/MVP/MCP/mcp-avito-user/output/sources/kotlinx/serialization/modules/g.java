package kotlinx.serialization.modules;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.X;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;

/* compiled from: SerializersModuleBuilders.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/modules/g;", "Lkotlinx/serialization/modules/j;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final HashMap f413161a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final HashMap f413162b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final HashMap f413163c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final HashMap f413164d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final HashMap f413165e = new HashMap();

    @X
    public g() {
    }

    public final <T> void a(@Y61.k kotlin.reflect.d<T> dVar, @Y61.k KSerializer<T> kSerializer) {
        a.C11759a c11759a = new a.C11759a(kSerializer);
        HashMap map = this.f413161a;
        a aVar = (a) map.get(dVar);
        if (aVar == null || aVar.equals(c11759a)) {
            map.put(dVar, c11759a);
            return;
        }
        throw new e("Contextual serializer or serializer provider for " + dVar + " already registered in this module");
    }
}
