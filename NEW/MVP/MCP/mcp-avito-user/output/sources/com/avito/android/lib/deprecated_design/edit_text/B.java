package com.avito.android.lib.deprecated_design.edit_text;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: MoneyMaskFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/edit_text/B;", "", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f177954a;

    /* renamed from: b, reason: collision with root package name */
    public final char f177955b;

    public B(String str, char c12, int i12, C42822w c42822w) {
        c12 = (i12 & 2) != 0 ? '#' : c12;
        this.f177954a = str;
        this.f177955b = c12;
    }

    public final String a(int i12) {
        StringBuilder sb2 = new StringBuilder();
        int i13 = i12 - 1;
        if (i13 >= 0) {
            int i14 = 0;
            while (true) {
                if (i14 > 0 && i14 % 3 == 0) {
                    sb2.append((char) 8201);
                }
                sb2.append(this.f177955b);
                if (i14 == i13) {
                    break;
                }
                i14++;
            }
        }
        return C43066x.G0(sb2.reverse()).toString();
    }
}
