package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: CollectionSerializers.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/y;", "Element", "Collection", "Builder", "Lkotlinx/serialization/internal/a;", "Lkotlinx/serialization/internal/z;", "Lkotlinx/serialization/internal/J0;", "Lkotlinx/serialization/internal/N0;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.serialization.internal.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43438y<Element, Collection, Builder> extends AbstractC43391a<Element, Collection, Builder> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final KSerializer<Element> f412922a;

    public AbstractC43438y() {
        throw null;
    }

    public AbstractC43438y(KSerializer kSerializer, C42822w c42822w) {
        super(null);
        this.f412922a = kSerializer;
    }

    @Override // kotlinx.serialization.internal.AbstractC43391a
    public void f(@Y61.k kotlinx.serialization.encoding.c cVar, int i12, Object obj) {
        i(i12, obj, cVar.v(getF332717a(), i12, this.f412922a, null));
    }

    public abstract void i(int i12, Object obj, Object obj2);

    @Override // kotlinx.serialization.x
    public void serialize(@Y61.k Encoder encoder, Collection collection) {
        int iD2 = d(collection);
        SerialDescriptor f332717a = getF332717a();
        kotlinx.serialization.encoding.d dVarA = encoder.A(f332717a);
        Iterator<Element> itC = c(collection);
        for (int i12 = 0; i12 < iD2; i12++) {
            dVarA.F(getF332717a(), i12, this.f412922a, itC.next());
        }
        dVarA.d(f332717a);
    }
}
