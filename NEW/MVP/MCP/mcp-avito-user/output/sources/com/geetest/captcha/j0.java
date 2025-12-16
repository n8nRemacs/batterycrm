package com.geetest.captcha;

import android.content.Context;
import android.content.SharedPreferences;
import com.zx.sdk.api.ZXID;
import com.zx.sdk.api.ZXIDListener;

/* loaded from: classes4.dex */
public final class j0 implements ZXIDListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f342744a;

    public j0(Context context) {
        this.f342744a = context;
    }

    public void onFailed(int i12, @Y61.k String str) {
        h0.f342732d.a("ZxIdUtils", "ZxID onFailed code: " + i12 + ", msg: " + str);
    }

    public void onSuccess(@Y61.k ZXID zxid) {
        h0.f342732d.a("ZxIdUtils", "ZxID success: " + zxid.getValue());
        try {
            SharedPreferences.Editor editorEdit = this.f342744a.getSharedPreferences("gt_zid_sp", 0).edit();
            editorEdit.putLong("gt_zid_et", zxid.getExpiredTime());
            editorEdit.putString("gt_zid", zxid.getValue());
            editorEdit.apply();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }
}
