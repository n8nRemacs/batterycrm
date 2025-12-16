package com.avito.android.util;

import android.os.Bundle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* compiled from: Bundles.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes5.dex */
public final class G {
    @Y61.l
    public static final Kundle a(@Y61.k Bundle bundle, @Y61.k String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        return new Kundle(bundle2);
    }

    public static final boolean b(@Y61.k Bundle bundle, @Y61.k Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size() || !bundle.keySet().containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (!kotlin.jvm.internal.L.f(obj != null ? obj.getClass() : null, obj2 != null ? obj2.getClass() : null)) {
                return false;
            }
            if (obj instanceof Bundle) {
                if (!b((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (!kotlin.jvm.internal.L.f(obj, obj2)) {
                return false;
            }
        }
        return true;
    }

    @Y61.k
    public static final void c(@Y61.k Bundle bundle, @Y61.k String str, @Y61.k Kundle kundle) {
        kundle.getClass();
        bundle.putBundle(str, new Bundle(kundle.f318647b));
    }

    @Y61.k
    public static final void d(@Y61.k Bundle bundle, @Y61.l String str, @Y61.l Map map) {
        if (map == null) {
            return;
        }
        Bundle bundle2 = new Bundle(map.size());
        for (Map.Entry entry : map.entrySet()) {
            bundle2.putString((String) entry.getKey(), (String) entry.getValue());
        }
        bundle.putBundle(str, bundle2);
    }

    public static final void e(@Y61.k String str, @Y61.k Bundle bundle, @Y61.l List list) {
        bundle.putParcelableArrayList(str, C35755b0.a(list));
    }

    public static final void f(@Y61.k Bundle bundle) {
        for (String str : C42745f0.M0(bundle.keySet())) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof Bundle) {
                    f((Bundle) obj);
                } else {
                    String name = obj.getClass().getName();
                    if (!(C43066x.h0(name, "java.", false) | C43066x.h0(name, "android.", false))) {
                        bundle.remove(str);
                    }
                }
            }
        }
    }

    @Y61.l
    public static final HashMap g(@Y61.l Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int size = bundle.size();
        HashMap map = new HashMap(size);
        if (size > 0) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                map.put(str, obj != null ? obj.toString() : null);
            }
        }
        return map;
    }
}
