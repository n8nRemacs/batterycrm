package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.Comparator;

/* loaded from: classes7.dex */
public class Cn implements Comparator<F2> {
    @Override // java.util.Comparator
    public int compare(F2 f22, F2 f23) {
        F2 f24 = f22;
        F2 f25 = f23;
        return (TextUtils.equals(f24.f378114a, f25.f378114a) && TextUtils.equals(f24.f378115b, f25.f378115b)) ? 0 : 10;
    }
}
