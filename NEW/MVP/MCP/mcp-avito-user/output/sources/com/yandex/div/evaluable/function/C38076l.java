package com.yandex.div.evaluable.function;

import kotlin.Metadata;

/* compiled from: ColorFunctions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div-evaluable"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.evaluable.function.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38076l {
    public static final int a(double d12) {
        if (d12 < 0.0d || d12 > 1.0d) {
            throw new IllegalArgumentException();
        }
        return (int) ((d12 * 255.0f) + 0.5f);
    }
}
