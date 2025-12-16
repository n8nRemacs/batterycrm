package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public final class eyd {
    public static final Class[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final jyd e;

    public eyd(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new ji6(1, this);
        linkedHashMap.putAll(map);
    }

    public static Bundle a(eyd eydVar) {
        LinkedHashMap linkedHashMap = eydVar.a;
        for (Map.Entry entry : to8.s(eydVar.b).entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((jyd) entry.getValue()).a();
            if (bundleA != null) {
                for (int i = 0; i < 29; i++) {
                    if (!f[i].isInstance(bundleA)) {
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + bundleA.getClass() + " into saved state");
            }
            Object obj = eydVar.c.get(str);
            j8a j8aVar = obj instanceof j8a ? (j8a) obj : null;
            if (j8aVar != null) {
                j8aVar.k(bundleA);
            } else {
                linkedHashMap.put(str, bundleA);
            }
            f9a f9aVar = (f9a) eydVar.d.get(str);
            if (f9aVar != null) {
                f9aVar.setValue(bundleA);
            }
        }
        Set<String> setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str2 : setKeySet) {
            arrayList.add(str2);
            arrayList2.add(linkedHashMap.get(str2));
        }
        return gwi.b(new imb(ApiProtocol.PARAM_KEYS, arrayList), new imb("values", arrayList2));
    }

    public eyd() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new ji6(1, this);
    }
}
