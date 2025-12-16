package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.impl.ac.CrashpadServiceHelper;

/* loaded from: classes7.dex */
public class T4 extends X4 {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC38986mm<String> f379506b;

    public class a implements InterfaceC38986mm<String> {
        @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
        public void b(@j.N String str) {
            String str2 = str;
            if (A2.a(21)) {
                CrashpadServiceHelper.a(str2);
            }
        }
    }

    public T4(@j.N L3 l32) {
        this(l32, new a());
    }

    @Override // com.yandex.metrica.impl.ob.S4
    public boolean a(@j.N C38715c0 c38715c0) {
        Bundle bundleL = c38715c0.l();
        if (bundleL == null) {
            return true;
        }
        String string = bundleL.getString("payload_crash_id");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        this.f379506b.b(string);
        return true;
    }

    public T4(@j.N L3 l32, @j.N InterfaceC38986mm<String> interfaceC38986mm) {
        super(l32);
        this.f379506b = interfaceC38986mm;
    }
}
