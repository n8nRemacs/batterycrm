package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.InterfaceC43389h;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: CollectionSerializers.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lkotlinx/serialization/internal/a;", "Element", "Collection", "Builder", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "Lkotlinx/serialization/internal/y;", "Lkotlinx/serialization/internal/n0;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC43389h
/* renamed from: kotlinx.serialization.internal.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43391a<Element, Collection, Builder> implements KSerializer<Collection> {
    public /* synthetic */ AbstractC43391a(C42822w c42822w) {
        this();
    }

    public abstract Builder a();

    public abstract int b(Builder builder);

    @Y61.k
    public abstract Iterator<Element> c(Collection collection);

    public abstract int d(Collection collection);

    public Collection deserialize(@Y61.k Decoder decoder) {
        return (Collection) e(decoder);
    }

    @InterfaceC43389h
    public final Object e(@Y61.k Decoder decoder) {
        Builder builderA = a();
        int iB2 = b(builderA);
        kotlinx.serialization.encoding.c cVarC = decoder.c(getF332717a());
        while (true) {
            int iJ2 = cVarC.j(getF332717a());
            if (iJ2 == -1) {
                cVarC.d(getF332717a());
                return h(builderA);
            }
            f(cVarC, iJ2 + iB2, builderA);
        }
    }

    public abstract void f(@Y61.k kotlinx.serialization.encoding.c cVar, int i12, Object obj);

    public abstract Builder g(Collection collection);

    public abstract Collection h(Builder builder);

    public AbstractC43391a() {
    }
}
