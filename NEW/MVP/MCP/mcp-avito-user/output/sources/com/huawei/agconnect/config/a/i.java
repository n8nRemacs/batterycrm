package com.huawei.agconnect.config.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes7.dex */
class i implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f363153a;

    /* renamed from: b, reason: collision with root package name */
    public final String f363154b;

    public i(Context context, String str) {
        this.f363153a = context;
        this.f363154b = str;
    }

    @Override // com.huawei.agconnect.config.a.e
    public String a(String str) throws UnsupportedEncodingException {
        String str2 = "";
        try {
            str2 = "agc_" + f.a(MessageDigest.getInstance("SHA-256").digest(str.getBytes(Constants.ENCODING)));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        Context context = this.f363153a;
        int identifier = context.getResources().getIdentifier(str2, "string", this.f363154b);
        if (identifier == 0) {
            return null;
        }
        try {
            return context.getResources().getString(identifier);
        } catch (Resources.NotFoundException unused2) {
            return null;
        }
    }
}
