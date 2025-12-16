package androidx.constraintlayout.core.motion.utils;

import android.view.View;
import java.util.HashMap;

/* compiled from: KeyCache.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<Object, HashMap<String, float[]>> f43290a = new HashMap<>();

    public final float a(View view, String str) {
        HashMap<String, float[]> map;
        float[] fArr;
        HashMap<Object, HashMap<String, float[]>> map2 = this.f43290a;
        if (map2.containsKey(view) && (map = map2.get(view)) != null && map.containsKey(str) && (fArr = map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}
