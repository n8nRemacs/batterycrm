package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C39078qf;

/* renamed from: com.yandex.metrica.impl.ob.cm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38737cm extends Vl {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f380350c = {3, 6, 4};

    /* renamed from: d, reason: collision with root package name */
    private static final C38737cm f380351d = new C38737cm("");

    public C38737cm(@j.P String str) {
        super(str);
    }

    public static C38737cm a() {
        return f380351d;
    }

    @Override // com.yandex.metrica.coreutils.logger.a
    public String getTag() {
        return "AppMetrica";
    }

    public C38737cm() {
        this("");
    }

    public void a(@j.N C39078qf.d dVar, String str) {
        String string;
        for (C39078qf.d.a aVar : dVar.f381531c) {
            if (aVar != null) {
                int[] iArr = f380350c;
                int length = iArr.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length) {
                        if (aVar.f381535c == iArr[i12]) {
                            StringBuilder sbZ = androidx.appcompat.app.r.z(str, ": ");
                            if (aVar.f381535c == 3 && TextUtils.isEmpty(aVar.f381536d)) {
                                string = "Native crash of app";
                            } else if (aVar.f381535c == 4) {
                                StringBuilder sb2 = new StringBuilder(aVar.f381536d);
                                byte[] bArr = aVar.f381537e;
                                if (bArr != null) {
                                    String str2 = new String(bArr);
                                    if (!TextUtils.isEmpty(str2)) {
                                        sb2.append(" with value ");
                                        sb2.append(str2);
                                    }
                                }
                                string = sb2.toString();
                            } else {
                                string = aVar.f381536d;
                            }
                            sbZ.append(string);
                            i(sbZ.toString());
                        } else {
                            i12++;
                        }
                    }
                }
            }
        }
    }
}
