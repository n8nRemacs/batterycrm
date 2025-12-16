package com.avito.android.util;

import android.text.TextUtils;
import com.avito.android.remote.model.Size;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.C43044a;
import kotlin.text.C43066x;

/* compiled from: Images.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_network-design_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.l2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35837l2 {
    @Y61.l
    public static final Size a(@Y61.k String str) throws NumberFormatException {
        List listF0 = C43066x.f0(str, new String[]{"x"}, 0, 6);
        if (listF0.size() != 2) {
            return null;
        }
        String str2 = (String) listF0.get(0);
        String str3 = (String) listF0.get(1);
        if (C43066x.K(str2) || C43066x.K(str3) || !TextUtils.isDigitsOnly(str2) || !TextUtils.isDigitsOnly(str3)) {
            return null;
        }
        String string = str2.toString();
        C43044a.a(10);
        int i12 = Integer.parseInt(string, 10);
        String string2 = str3.toString();
        C43044a.a(10);
        return new Size(i12, Integer.parseInt(string2, 10));
    }

    @Y61.l
    public static final Size b(@Y61.k String str) throws NumberFormatException {
        try {
            int iH2 = C43066x.H('x', 0, 6, str);
            String string = str.substring(0, iH2).toString();
            C43044a.a(10);
            int i12 = Integer.parseInt(string, 10);
            String string2 = str.substring(iH2 + 1).toString();
            C43044a.a(10);
            return new Size(i12, Integer.parseInt(string2, 10));
        } catch (Exception unused) {
            V2.f318762a.c("Images", "Parse size error", null);
            return null;
        }
    }
}
