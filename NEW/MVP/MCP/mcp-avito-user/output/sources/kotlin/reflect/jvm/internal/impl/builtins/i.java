package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.EnumMap;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.builtins.k;
import kotlin.reflect.jvm.internal.impl.types.Y;

/* compiled from: KotlinBuiltIns.java */
/* loaded from: classes8.dex */
class i implements Y41.a<k.b> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f407226b;

    public i(k kVar) {
        this.f407226b = kVar;
    }

    @Override // Y41.a
    public final k.b invoke() {
        EnumMap enumMap = new EnumMap(PrimitiveType.class);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (PrimitiveType primitiveType : PrimitiveType.values()) {
            String strB = primitiveType.f407170b.b();
            kotlin.reflect.jvm.internal.impl.name.f fVar = k.f407311f;
            k kVar = this.f407226b;
            if (strB == null) {
                kVar.getClass();
                k.a(47);
                throw null;
            }
            Y yQ2 = kVar.j(strB).q();
            if (yQ2 == null) {
                k.a(48);
                throw null;
            }
            String strB2 = primitiveType.f407171c.b();
            if (strB2 == null) {
                k.a(47);
                throw null;
            }
            Y yQ3 = kVar.j(strB2).q();
            if (yQ3 == null) {
                k.a(48);
                throw null;
            }
            enumMap.put((EnumMap) primitiveType, (PrimitiveType) yQ3);
            map.put(yQ2, yQ3);
            map2.put(yQ3, yQ2);
        }
        return new k.b(enumMap, map, map2, null);
    }
}
