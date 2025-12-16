package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.RestrictTo;
import com.adjust.sdk.Constants;
import java.util.Locale;

/* compiled from: ManufacturerUtils.java */
@RestrictTo
/* renamed from: com.google.android.material.internal.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37075p {
    public static boolean a() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ENGLISH;
        return str.toLowerCase(locale).equals("lge") || str.toLowerCase(locale).equals(Constants.REFERRER_API_SAMSUNG);
    }
}
