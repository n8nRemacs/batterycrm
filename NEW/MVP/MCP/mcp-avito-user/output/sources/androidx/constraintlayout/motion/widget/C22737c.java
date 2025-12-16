package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* compiled from: Debug.java */
@SuppressLint({"LogConditional"})
/* renamed from: androidx.constraintlayout.motion.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22737c {
    public static void a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
        stackTraceElement.getMethodName();
    }

    public static void b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    public static String c(int i12, Context context) {
        if (i12 == -1) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        try {
            i12 = context.getResources().getResourceEntryName(i12);
            return i12;
        } catch (Exception unused) {
            return AK.c.g(i12, "?");
        }
    }

    public static String d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    public static String e(int i12, MotionLayout motionLayout) {
        return i12 == -1 ? "UNDEFINED" : motionLayout.getContext().getResources().getResourceEntryName(i12);
    }
}
