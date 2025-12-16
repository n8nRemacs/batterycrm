package com.google.android.datatransport.cct;

import com.adjust.sdk.Constants;
import com.google.android.datatransport.runtime.h;
import j.N;
import j.P;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: CCTDestination.java */
/* loaded from: classes10.dex */
public final class a implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final String f342923c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set<com.google.android.datatransport.c> f342924d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f342925e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f342926f;

    /* renamed from: a, reason: collision with root package name */
    @N
    public final String f342927a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f342928b;

    static {
        String strA = d.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f342923c = strA;
        String strA2 = d.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strA3 = d.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f342924d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new com.google.android.datatransport.c("proto"), new com.google.android.datatransport.c("json"))));
        f342925e = new a(strA, null);
        f342926f = new a(strA2, strA3);
    }

    public a(@N String str, @P String str2) {
        this.f342927a = str;
        this.f342928b = str2;
    }

    @N
    public static a b(@N byte[] bArr) {
        String str = new String(bArr, Charset.forName(Constants.ENCODING));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // com.google.android.datatransport.runtime.h
    public final Set<com.google.android.datatransport.c> a() {
        return f342924d;
    }
}
