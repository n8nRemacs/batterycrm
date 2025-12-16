package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.compose.foundation.H;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PrettyPrintTreeMap.java */
/* loaded from: classes5.dex */
class n<K, V> extends TreeMap<K, V> {
    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sbR = H.r("( ");
        for (Map.Entry<K, V> entry : entrySet()) {
            sbR.append('{');
            sbR.append(entry.getKey());
            sbR.append(':');
            sbR.append(entry.getValue());
            sbR.append("}, ");
        }
        if (!isEmpty()) {
            sbR.replace(sbR.length() - 2, sbR.length(), "");
        }
        sbR.append(" )");
        return sbR.toString();
    }
}
