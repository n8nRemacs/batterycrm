package com.adjust.sdk.sig;

import android.content.Context;
import com.adjust.sdk.Constants;
import java.security.InvalidKeyException;
import java.security.UnrecoverableKeyException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f59008a = false;

    public static void a(Set set, Map map, Map map2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (map.containsKey(str)) {
                map2.put(str, (String) map.get(str));
            }
        }
    }

    public static void a(Context context, c cVar, a aVar, Map map, String str, String str2) throws Exception {
        byte[] bArrA;
        if (f59008a || map == null || map.size() == 0 || str == null || str2 == null) {
            return;
        }
        map.put("activity_kind", str);
        map.put("client_sdk", str2);
        int i12 = 2;
        while (true) {
            if (i12 <= 0) {
                bArrA = null;
                break;
            }
            try {
                cVar.b(context);
                bArrA = cVar.a(context, map.toString().getBytes(Constants.ENCODING));
                break;
            } catch (b e12) {
                f59008a = true;
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e12;
            } catch (InvalidKeyException e13) {
                e = e13;
            } catch (UnrecoverableKeyException e14) {
                e = e14;
            } catch (Exception e15) {
                e15.getMessage();
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e15;
            }
            e.getMessage();
            i12--;
            cVar.a(context);
        }
        if (i12 == 0) {
            f59008a = true;
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        byte[] bArrA2 = ((NativeLibHelper) aVar).a(context, map, bArrA, cVar.f59007a);
        if (bArrA2 == null) {
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        int length = bArrA2.length;
        char[] cArr = e.f59009a;
        char[] cArr2 = new char[length * 2];
        for (int i13 = 0; i13 < length; i13++) {
            byte b12 = bArrA2[i13];
            int i14 = i13 * 2;
            char[] cArr3 = e.f59009a;
            cArr2[i14] = cArr3[(b12 & 255) >>> 4];
            cArr2[i14 + 1] = cArr3[b12 & 15];
        }
        map.put("signature", new String(cArr2));
        map.remove("activity_kind");
        map.remove("client_sdk");
    }
}
