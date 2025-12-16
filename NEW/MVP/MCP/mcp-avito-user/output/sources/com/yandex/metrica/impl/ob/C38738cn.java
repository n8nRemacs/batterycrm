package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.cn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38738cn extends Sm<String> {
    public C38738cn(int i12, @j.N String str) {
        this(i12, str, Ul.a());
    }

    public C38738cn(int i12, @j.N String str, @j.N C38737cm c38737cm) {
        super(i12, str, c38737cm);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38813fn
    @j.P
    public String a(@j.P String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes(Constants.ENCODING);
            if (bytes.length <= super.b()) {
                return str;
            }
            String str2 = new String(bytes, 0, super.b(), Constants.ENCODING);
            try {
                if (this.f379473c.isEnabled()) {
                    this.f379473c.fw("\"%s\" %s exceeded limit of %d bytes", super.a(), str, Integer.valueOf(super.b()));
                }
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
