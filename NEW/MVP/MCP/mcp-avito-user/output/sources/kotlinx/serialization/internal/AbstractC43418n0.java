package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.InterfaceC43389h;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: CollectionSerializers.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lkotlinx/serialization/internal/n0;", "Key", "Value", "Collection", "", "Builder", "Lkotlinx/serialization/internal/a;", "", "Lkotlinx/serialization/internal/P;", "Lkotlinx/serialization/internal/e0;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC43389h
/* renamed from: kotlinx.serialization.internal.n0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43418n0<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractC43391a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final KSerializer<Key> f412895a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final KSerializer<Value> f412896b;

    public AbstractC43418n0() {
        throw null;
    }

    public AbstractC43418n0(KSerializer kSerializer, KSerializer kSerializer2, C42822w c42822w) {
        super(null);
        this.f412895a = kSerializer;
        this.f412896b = kSerializer2;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public final void f(kotlinx.serialization.encoding.c cVar, int i12, Object obj) {
        Map map = (Map) obj;
        Object objV = cVar.v(getF412706c(), i12, this.f412895a, null);
        int iJ2 = cVar.j(getF412706c());
        if (iJ2 != i12 + 1) {
            throw new IllegalArgumentException(androidx.compose.foundation.H.j(i12, iJ2, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        boolean zContainsKey = map.containsKey(objV);
        KSerializer<Value> kSerializer = this.f412896b;
        map.put(objV, (!zContainsKey || (kSerializer.getF412706c().getF412729b() instanceof kotlinx.serialization.descriptors.e)) ? cVar.v(getF412706c(), iJ2, kSerializer, null) : cVar.v(getF412706c(), iJ2, kSerializer, kotlin.collections.P0.d(map, objV)));
    }

    @Override // kotlinx.serialization.x
    public final void serialize(@Y61.k Encoder encoder, Collection collection) {
        d(collection);
        SerialDescriptor f332717a = getF412706c();
        kotlinx.serialization.encoding.d dVarA = encoder.A(f332717a);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itC = c(collection);
        int i12 = 0;
        while (itC.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itC.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i13 = i12 + 1;
            dVarA.F(getF412706c(), i12, this.f412895a, key);
            i12 += 2;
            dVarA.F(getF412706c(), i13, this.f412896b, value);
        }
        dVarA.d(f332717a);
    }
}
