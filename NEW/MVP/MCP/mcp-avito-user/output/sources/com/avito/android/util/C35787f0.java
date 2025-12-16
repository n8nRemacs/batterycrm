package com.avito.android.util;

import android.graphics.Color;
import kotlin.Metadata;

/* compiled from: Colors.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_network-design_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35787f0 {
    @Y61.l
    public static final Integer a(@Y61.k String str) {
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Throwable unused) {
            return null;
        }
    }
}
