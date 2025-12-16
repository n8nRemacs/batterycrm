package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.compose.ui.platform.C22491k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SignatureBuildingComponents.kt */
@s0
/* loaded from: classes8.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final H f408434a = new H();

    @Y61.k
    public static String[] a(@Y61.k String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Y61.k
    public static LinkedHashSet b(@Y61.k String str, @Y61.k String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    @Y61.k
    public static LinkedHashSet c(@Y61.k String str, @Y61.k String... strArr) {
        return b("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Y61.k
    public static LinkedHashSet d(@Y61.k String str, @Y61.k String... strArr) {
        return b("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Y61.k
    public static String e(@Y61.k String str, @Y61.k String str2, @Y61.k ArrayList arrayList) {
        StringBuilder sbB = C22491k0.b(str, '(');
        sbB.append(C42745f0.O(arrayList, "", null, null, G.f408433l, 30));
        sbB.append(')');
        if (str2.length() > 1) {
            str2 = C22491k0.a(';', "L", str2);
        }
        sbB.append(str2);
        return sbB.toString();
    }

    @Y61.k
    public static String f(@Y61.k String str, @Y61.k String str2) {
        return androidx.compose.foundation.H.i('.', str, str2);
    }
}
