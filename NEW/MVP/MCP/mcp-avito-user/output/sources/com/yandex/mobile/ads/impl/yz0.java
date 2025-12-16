package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class yz0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final DecimalFormat f392112a;

    public yz0() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator(' ');
        this.f392112a = new DecimalFormat("#,###,###", decimalFormatSymbols);
    }

    @j.N
    public final String a(@j.N String str) throws NumberFormatException, yk0 {
        try {
            if (!TextUtils.isEmpty(str)) {
                str = str.replaceAll(" ", "");
            }
            return this.f392112a.format(Long.valueOf(str));
        } catch (NumberFormatException unused) {
            throw new yk0("Native Ad json has not required attributes");
        }
    }
}
