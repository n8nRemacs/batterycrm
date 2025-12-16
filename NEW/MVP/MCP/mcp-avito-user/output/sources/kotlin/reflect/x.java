package kotlin.reflect;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G;
import kotlin.InterfaceC43017s;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TypesJVM.kt */
@s0
@InterfaceC43017s
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/x;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "Lkotlin/reflect/v;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class x implements TypeVariable<GenericDeclaration>, v {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final s f410472b;

    public x(@Y61.k s sVar) {
        this.f410472b = sVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (!(obj instanceof TypeVariable) || !L.f(this.f410472b.getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    @Y61.k
    public final Type[] getBounds() {
        List<r> upperBounds = this.f410472b.getUpperBounds();
        ArrayList arrayList = new ArrayList(C42745f0.q(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(y.b((r) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    @Y61.k
    public final GenericDeclaration getGenericDeclaration() {
        throw new G(androidx.camera.camera2.internal.G.f("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f410472b));
    }

    @Override // java.lang.reflect.TypeVariable
    @Y61.k
    public final String getName() {
        return this.f410472b.getName();
    }

    @Override // java.lang.reflect.Type
    @Y61.k
    public final String getTypeName() {
        return this.f410472b.getName();
    }

    public final int hashCode() {
        this.f410472b.getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    @Y61.k
    public final String toString() {
        return this.f410472b.getName();
    }
}
