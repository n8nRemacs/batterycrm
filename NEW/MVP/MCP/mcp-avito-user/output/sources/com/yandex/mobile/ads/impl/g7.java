package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebViewDatabase;
import com.huawei.hms.framework.common.ContainerUtils;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class g7 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f385601a = (long) (Math.floor(Math.random() * 4.294967295E9d) + 1.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f385602b = 0;

    public static boolean a(b00 b00Var) {
        return b00Var == null || b00Var.k();
    }

    public static ResultReceiver a(ResultReceiver resultReceiver) {
        if (resultReceiver == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        resultReceiver.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return resultReceiver2;
    }

    public static Bitmap a(String str) {
        try {
            String strSubstring = str.substring(str.indexOf(",") + 1);
            if (TextUtils.isEmpty(strSubstring)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strSubstring, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a(Context context) {
        try {
            return WebViewDatabase.getInstance(context) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    @j.N
    public static <T> String a(T t12) {
        return t12.toString();
    }

    public static ArrayList a(@j.N AdResponse adResponse, Map map) {
        List<String> listK = adResponse.k();
        List<Long> listF = adResponse.f();
        List<Integer> listP = adResponse.p();
        ArrayList arrayList = new ArrayList();
        if (listK != null) {
            int i12 = 0;
            while (i12 < listK.size()) {
                String string = listK.get(i12);
                if (map != null) {
                    Uri.Builder builderBuildUpon = Uri.parse(string).buildUpon();
                    for (Map.Entry entry : map.entrySet()) {
                        StringBuilder sbA = Cif.a("?");
                        sbA.append((String) entry.getKey());
                        sbA.append(ContainerUtils.KEY_VALUE_DELIMITER);
                        sbA.append((String) entry.getValue());
                        Uri uri = Uri.parse(sbA.toString());
                        for (String str : uri.getQueryParameterNames()) {
                            builderBuildUpon.appendQueryParameter(str, uri.getQueryParameter(str));
                        }
                    }
                    string = builderBuildUpon.build().toString();
                }
                long jLongValue = listF.size() > i12 ? listF.get(i12).longValue() : 0L;
                int iIntValue = listP.size() > i12 ? listP.get(i12).intValue() : 0;
                q31 q31Var = new q31();
                q31Var.a(string);
                q31Var.a(jLongValue);
                q31Var.a(iIntValue);
                arrayList.add(q31Var);
                i12++;
            }
        }
        return arrayList;
    }
}
