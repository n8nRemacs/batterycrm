package kotlinx.serialization.json.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.o;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.internal.C43471w;

/* compiled from: JsonNamesMap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class I extends kotlin.jvm.internal.N implements Y41.a<Map<String, ? extends Integer>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SerialDescriptor f413010l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC43443a f413011m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(SerialDescriptor serialDescriptor, AbstractC43443a abstractC43443a) {
        super(0);
        this.f413010l = serialDescriptor;
        this.f413011m = abstractC43443a;
    }

    @Override // Y41.a
    public final Map<String, ? extends Integer> invoke() {
        C43471w.a<Map<String, Integer>> aVar = L.f413014a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC43443a abstractC43443a = this.f413011m;
        boolean z12 = abstractC43443a.f412955a.f412994n;
        SerialDescriptor serialDescriptor = this.f413010l;
        boolean z13 = z12 && kotlin.jvm.internal.L.f(serialDescriptor.getF412729b(), o.b.f412750a);
        kotlinx.serialization.json.z zVarD = L.d(serialDescriptor, abstractC43443a);
        int f412801c = serialDescriptor.getF412801c();
        for (int i12 = 0; i12 < f412801c; i12++) {
            List<Annotation> listE = serialDescriptor.e(i12);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listE) {
                if (obj instanceof kotlinx.serialization.json.y) {
                    arrayList.add(obj);
                }
            }
            String lowerCase = z13 ? serialDescriptor.d(i12).toLowerCase(Locale.ROOT) : zVarD != null ? zVarD.a(serialDescriptor.d(i12)) : null;
            if (lowerCase != null) {
                String str = kotlin.jvm.internal.L.f(serialDescriptor.getF412729b(), o.b.f412750a) ? "enum value" : "property";
                if (linkedHashMap.containsKey(lowerCase)) {
                    throw new JsonException("The suggested name '" + lowerCase + "' for " + str + ' ' + serialDescriptor.d(i12) + " is already one of the names for " + str + ' ' + serialDescriptor.d(((Number) P0.d(linkedHashMap, lowerCase)).intValue()) + " in " + serialDescriptor);
                }
                linkedHashMap.put(lowerCase, Integer.valueOf(i12));
            }
        }
        return linkedHashMap.isEmpty() ? P0.c() : linkedHashMap;
    }
}
