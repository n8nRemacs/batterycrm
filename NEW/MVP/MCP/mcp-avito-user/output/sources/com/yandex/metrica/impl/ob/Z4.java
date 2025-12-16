package com.yandex.metrica.impl.ob;

import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.AbstractC39097rb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import okhttp3.internal.http2.Http2;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Z4 extends X4 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38987mn f379980b;

    public Z4(L3 l32) {
        this(l32, new C38987mn());
    }

    @Override // com.yandex.metrica.impl.ob.S4
    public boolean a(@j.N C38715c0 c38715c0) {
        L3 l3A = a();
        if (l3A.x().k() && l3A.C()) {
            C38724c9 c38724c9F = l3A.f();
            String strG = a().f().g();
            HashSet hashSet = null;
            if (!TextUtils.isEmpty(strG)) {
                try {
                    HashSet hashSet2 = new HashSet();
                    JSONArray jSONArray = new JSONArray(strG);
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        hashSet2.add(new C39121sb(jSONArray.getJSONObject(i12)));
                    }
                    hashSet = hashSet2;
                } catch (Throwable unused) {
                }
            }
            try {
                ArrayList<C39121sb> arrayListB = b();
                if (C38689b.a(hashSet, arrayListB)) {
                    l3A.y();
                } else {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator<C39121sb> it = arrayListB.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next().a());
                    }
                    l3A.r().c(C38715c0.a(c38715c0, new JSONObject().put("features", jSONArray2).toString()));
                    c38724c9F.h(jSONArray2.toString());
                }
            } catch (Throwable unused2) {
            }
        }
        return false;
    }

    @j.k0
    @j.P
    public ArrayList<C39121sb> b() {
        FeatureInfo[] featureInfoArr;
        try {
            L3 l3A = a();
            PackageInfo packageInfoB = this.f379980b.b(l3A.g(), l3A.g().getPackageName(), Http2.INITIAL_MAX_FRAME_SIZE);
            ArrayList<C39121sb> arrayList = new ArrayList<>();
            AbstractC39097rb aVar = A2.a(24) ? new AbstractC39097rb.a() : new AbstractC39097rb.b();
            if (packageInfoB != null && (featureInfoArr = packageInfoB.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(aVar.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    @j.k0
    public Z4(L3 l32, @j.N C38987mn c38987mn) {
        super(l32);
        this.f379980b = c38987mn;
    }
}
