package kotlinx.serialization.json.internal;

import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.o;
import kotlinx.serialization.descriptors.p;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.internal.C43471w;

/* compiled from: JsonNamesMap.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C43471w.a<Map<String, Integer>> f413014a = new C43471w.a<>();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C43471w.a<String[]> f413015b = new C43471w.a<>();

    public static final int a(@Y61.k SerialDescriptor serialDescriptor, @Y61.k AbstractC43443a abstractC43443a, @Y61.k String str) {
        if (abstractC43443a.f412955a.f412994n && kotlin.jvm.internal.L.f(serialDescriptor.getF412729b(), o.b.f412750a)) {
            return c(serialDescriptor, abstractC43443a, str.toLowerCase(Locale.ROOT));
        }
        if (d(serialDescriptor, abstractC43443a) != null) {
            return c(serialDescriptor, abstractC43443a, str);
        }
        int iG2 = serialDescriptor.g(str);
        return (iG2 == -3 && abstractC43443a.f412955a.f412992l) ? c(serialDescriptor, abstractC43443a, str) : iG2;
    }

    public static final int b(@Y61.k SerialDescriptor serialDescriptor, @Y61.k AbstractC43443a abstractC43443a, @Y61.k String str, @Y61.k String str2) {
        int iA2 = a(serialDescriptor, abstractC43443a, str);
        if (iA2 != -3) {
            return iA2;
        }
        throw new SerializationException(serialDescriptor.getF412799a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final int c(SerialDescriptor serialDescriptor, AbstractC43443a abstractC43443a, String str) {
        Integer num = (Integer) ((Map) abstractC43443a.f412957c.a(serialDescriptor, f413014a, new I(serialDescriptor, abstractC43443a))).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Y61.l
    public static final kotlinx.serialization.json.z d(@Y61.k SerialDescriptor serialDescriptor, @Y61.k AbstractC43443a abstractC43443a) {
        if (kotlin.jvm.internal.L.f(serialDescriptor.getF412729b(), p.a.f412751a)) {
            return abstractC43443a.f412955a.f412993m;
        }
        return null;
    }
}
