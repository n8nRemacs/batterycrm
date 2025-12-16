package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.a7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38672a7 implements InterfaceC39011nm<File, Z6>, InterfaceC38986mm<File> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC39011nm
    @j.P
    public Z6 a(@j.N File file) throws IOException {
        String strA = L0.a(file);
        if (!TextUtils.isEmpty(strA)) {
            try {
                return new Z6(strA);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
    public void b(@j.N File file) {
        try {
            file.delete();
        } catch (Throwable unused) {
        }
    }
}
