package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import u51.i;

/* compiled from: MultiFieldValueClassRepresentation.kt */
@s0
/* loaded from: classes8.dex */
public final class F<Type extends u51.i> extends i0<Type> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f407422a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<kotlin.reflect.jvm.internal.impl.name.f, Type> f407423b;

    public F(@Y61.k ArrayList arrayList) {
        super(null);
        this.f407422a = arrayList;
        Map<kotlin.reflect.jvm.internal.impl.name.f, Type> mapP = P0.p(arrayList);
        if (mapP.size() != arrayList.size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.f407423b = mapP;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i0
    public final boolean a(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return this.f407423b.containsKey(fVar);
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes="), this.f407422a, ')');
    }
}
