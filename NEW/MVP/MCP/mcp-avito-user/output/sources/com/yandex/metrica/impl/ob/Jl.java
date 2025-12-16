package com.yandex.metrica.impl.ob;

import android.os.Build;
import java.util.Set;

/* loaded from: classes7.dex */
public class Jl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Set<String> f378651a;

    public Jl(@j.N Set<String> set) {
        this.f378651a = set;
    }

    @j.P
    public String a() {
        if (!A2.a(21)) {
            return a(new String[]{Build.CPU_ABI, Build.CPU_ABI2});
        }
        String strA = a(Build.SUPPORTED_64_BIT_ABIS);
        return strA != null ? strA : a(Build.SUPPORTED_32_BIT_ABIS);
    }

    @j.P
    private String a(String[] strArr) {
        for (String str : strArr) {
            if (this.f378651a.contains(str)) {
                return str;
            }
        }
        return null;
    }
}
