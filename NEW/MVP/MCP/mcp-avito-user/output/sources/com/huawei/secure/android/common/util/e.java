package com.huawei.secure.android.common.util;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f363740a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    public static class a extends Throwable {
        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return null;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return null;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "";
        }
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TextUtils.isEmpty(str);
    }
}
