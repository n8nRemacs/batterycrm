package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.h2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38842h2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f380673a = Pattern.compile(".*at com\\.yandex\\.metrica\\.push\\.*");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f380674b = Pattern.compile(".*at com\\.yandex\\.metrica\\.(?!push)");

    @j.k0
    /* renamed from: com.yandex.metrica.impl.ob.h2$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        static final String f380675a;

        static {
            f380675a = C38842h2.a("com.unity3d.player.UnityPlayer") ? PluginErrorDetails.Platform.UNITY : C38842h2.a("mono.MonoPackageManager") ? PluginErrorDetails.Platform.XAMARIN : C38842h2.a("org.apache.cordova.CordovaPlugin") ? PluginErrorDetails.Platform.CORDOVA : C38842h2.a("com.facebook.react.ReactRootView") ? "react" : C38842h2.a("io.flutter.embedding.engine.FlutterEngine") ? PluginErrorDetails.Platform.FLUTTER : "native";
        }
    }

    public static void a(@j.N String str, Object... objArr) {
        String.format(str, objArr);
    }

    public static void b() {
        if (!TextUtils.isEmpty("release")) {
            char cCharAt = "release".charAt(0);
            if (!Character.isUpperCase(cCharAt)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toUpperCase(cCharAt));
                sb2.append("elease");
            }
        }
        YandexMetrica.getLibraryApiLevel();
    }

    public static void a(@j.N Throwable th2, @j.N String str, Object... objArr) {
        String.format(str, objArr);
    }

    @j.N
    public static String a() {
        return a.f380675a;
    }

    public static boolean a(@j.P Throwable th2) {
        String string;
        if (th2 != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th2.printStackTrace(printWriter);
            string = stringWriter.toString();
            printWriter.close();
        } else {
            string = "";
        }
        return !TextUtils.isEmpty(string) && f380674b.matcher(string).find();
    }

    public static void b(@j.N String str, Object... objArr) {
        String.format(str, objArr);
    }

    public static boolean b(@j.P Throwable th2) {
        String string;
        if (th2 != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th2.printStackTrace(printWriter);
            string = stringWriter.toString();
            printWriter.close();
        } else {
            string = "";
        }
        return !TextUtils.isEmpty(string) && f380673a.matcher(string).find();
    }

    public static boolean a(String str) {
        return b(str) != null;
    }

    @j.P
    public static Class b(@j.N String str) {
        try {
            return Class.forName(str, false, C38842h2.class.getClassLoader());
        } catch (Throwable unused) {
            return null;
        }
    }
}
