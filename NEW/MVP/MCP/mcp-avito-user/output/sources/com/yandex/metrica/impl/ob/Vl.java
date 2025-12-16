package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Locale;

/* loaded from: classes7.dex */
public abstract class Vl extends com.yandex.metrica.coreutils.logger.a {

    /* renamed from: b, reason: collision with root package name */
    private static String f379793b = "";

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f379794a;

    public Vl(@j.P String str) {
        super(false);
        this.f379794a = "[" + A2.a(str) + "] ";
    }

    public static void a(Context context) {
        f379793b = "[" + context.getPackageName() + "] : ";
    }

    @Override // com.yandex.metrica.coreutils.logger.a
    public String formatMessage(String str, Object[] objArr) {
        return String.format(Locale.US, str, objArr);
    }

    @Override // com.yandex.metrica.coreutils.logger.a
    @j.N
    public String getPrefix() {
        String str = f379793b;
        if (str == null) {
            str = "";
        }
        String str2 = this.f379794a;
        return str.concat(str2 != null ? str2 : "");
    }
}
