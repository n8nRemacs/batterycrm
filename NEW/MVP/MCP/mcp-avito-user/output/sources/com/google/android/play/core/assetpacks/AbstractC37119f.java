package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37119f {
    public static AbstractC37119f a(Bundle bundle, C37196z0 c37196z0, C37165o1 c37165o1, N n12) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap map = new HashMap();
        int size = stringArrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            String str = stringArrayList.get(i12);
            map.put(str, AssetPackState.b(bundle, str, c37196z0, c37165o1, n12));
        }
        return new Y(bundle.getLong("total_bytes_to_download"), map);
    }

    public abstract Map<String, AssetPackState> b();

    public abstract long c();
}
