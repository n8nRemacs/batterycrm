package com.avito.android.util;

import android.util.Base64;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import k31.C42492a;
import k31.C42493b;
import k31.C42496e;
import kotlin.Metadata;
import kotlin.text.C43047d;
import kotlin.text.C43066x;

/* compiled from: SearchContextWrapper.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_analytics-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.g5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35800g5 {
    @Y61.l
    public static final String a(@Y61.k C35792f5 c35792f5) {
        C42493b c42493bD = d(c35792f5.f318872a);
        if (c42493bD == null || !c42493bD.containsKey("crossCategoryTag")) {
            return null;
        }
        return ((C42492a) c42493bD.get("crossCategoryTag")).toString();
    }

    @Y61.l
    public static final String b(@Y61.k C35792f5 c35792f5) {
        C42493b c42493bD = d(c35792f5.f318872a);
        if (c42493bD == null || !c42493bD.containsKey("x")) {
            return null;
        }
        return ((C42492a) c42493bD.get("x")).toString();
    }

    public static final boolean c(@Y61.k C35792f5 c35792f5) {
        return kotlin.jvm.internal.L.f(a(c35792f5), "cross_category_avito_for_business");
    }

    public static final C42493b d(String str) {
        if (str == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new ByteArrayInputStream(Base64.decode(C43066x.a0(C43066x.a0(str, "-", "+", false), "_", "/", false), 0))), C43047d.f410589b), 8192);
            try {
                String strC = kotlin.io.w.c(bufferedReader);
                kotlin.io.c.a(bufferedReader, null);
                C42492a c42492aB = new C42496e(strC).b();
                Object obj = c42492aB.f406030b;
                if (obj != null && c42492aB.f406031c == 9) {
                    return (C42493b) obj;
                }
                return null;
            } finally {
            }
        } catch (Exception e12) {
            V2.f318762a.f(e12);
            return null;
        }
    }
}
