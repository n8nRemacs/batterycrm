package m51;

import Y61.k;
import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.internal.n;

/* compiled from: ClassMapperLite.kt */
/* renamed from: m51.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43888b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final String f414311a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final LinkedHashMap f414312b;

    static {
        new C43888b();
        f414311a = C42745f0.O(C42745f0.U('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listU = C42745f0.U("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iA2 = n.a(0, listU.size() - 1, 2);
        if (iA2 >= 0) {
            int i12 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f414311a;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listU.get(i12));
                int i13 = i12 + 1;
                linkedHashMap.put(sb2.toString(), listU.get(i13));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append('/');
                linkedHashMap.put(AK.c.s(sb3, (String) listU.get(i12), "Array"), "[" + ((String) listU.get(i13)));
                if (i12 == iA2) {
                    break;
                } else {
                    i12 += 2;
                }
            }
        }
        linkedHashMap.put(f414311a + "/Unit", "V");
        a("Any", "java/lang/Object", linkedHashMap);
        a("Nothing", "java/lang/Void", linkedHashMap);
        a("Annotation", "java/lang/annotation/Annotation", linkedHashMap);
        for (String str2 : C42745f0.U("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(str2, "java/lang/" + str2, linkedHashMap);
        }
        for (String str3 : C42745f0.U("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(G.f("collections/", str3), "java/util/" + str3, linkedHashMap);
            a("collections/Mutable" + str3, "java/util/" + str3, linkedHashMap);
        }
        a("collections/Iterable", "java/lang/Iterable", linkedHashMap);
        a("collections/MutableIterable", "java/lang/Iterable", linkedHashMap);
        a("collections/Map.Entry", "java/util/Map$Entry", linkedHashMap);
        a("collections/MutableMap.MutableEntry", "java/util/Map$Entry", linkedHashMap);
        for (int i14 = 0; i14 < 23; i14++) {
            String strG = AK.c.g(i14, "Function");
            StringBuilder sb4 = new StringBuilder();
            String str4 = f414311a;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i14);
            a(strG, sb4.toString(), linkedHashMap);
            a("reflect/KFunction" + i14, str4 + "/reflect/KFunction", linkedHashMap);
        }
        for (String str5 : C42745f0.U("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(r.q(str5, ".Companion"), G.h(new StringBuilder(), f414311a, "/jvm/internal/", str5, "CompanionObject"), linkedHashMap);
        }
        f414312b = linkedHashMap;
    }

    public static final void a(String str, String str2, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(H.o(new StringBuilder(), f414311a, '/', str), "L" + str2 + ';');
    }

    @X41.n
    @k
    public static final String b(@k String str) {
        String str2 = (String) f414312b.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + str.replace('.', '$') + ';';
    }
}
