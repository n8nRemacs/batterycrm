package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.vo1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class rp1 implements vo1 {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f389603a = new int[2];

    @Override // com.yandex.mobile.ads.impl.vo1
    public final JSONObject a(View view) {
        if (view == null) {
            return gp1.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f389603a);
        int[] iArr = this.f389603a;
        return gp1.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.yandex.mobile.ads.impl.vo1
    public final void a(View view, JSONObject jSONObject, vo1.a aVar, boolean z12, boolean z13) throws JSONException {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i12 = 0;
            if (!z12) {
                while (i12 < viewGroup.getChildCount()) {
                    ((wa1) aVar).a(viewGroup.getChildAt(i12), this, jSONObject, z13);
                    i12++;
                }
                return;
            }
            HashMap map = new HashMap();
            while (i12 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i12);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i12++;
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) map.get((Float) it.next())).iterator();
                while (it2.hasNext()) {
                    ((wa1) aVar).a((View) it2.next(), this, jSONObject, z13);
                }
            }
        }
    }
}
