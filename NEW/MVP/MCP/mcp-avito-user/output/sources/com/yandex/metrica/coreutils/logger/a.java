package com.yandex.metrica.coreutils.logger;

import android.util.Log;
import j.P;
import j.k0;

/* compiled from: BaseLogger.java */
/* loaded from: classes7.dex */
public abstract class a {
    private volatile boolean mIsEnabled;

    public a(boolean z12) {
        this.mIsEnabled = false;
        this.mIsEnabled = z12;
    }

    private String getFormattedMessage(String str, Object[] objArr) {
        try {
            return getPrefix() + formatMessage(wrapMsg(str), objArr);
        } catch (Throwable unused) {
            return onFormatException();
        }
    }

    private String getMessage(String str) {
        return getPrefix() + wrapMsg(str);
    }

    private static String wrapMsg(String str) {
        return str == null ? "" : str;
    }

    public void d(String str) {
        log(3, wrapMsg(str));
    }

    public void e(String str) {
        log(6, str);
    }

    public void fd(String str, Object... objArr) {
        log(3, wrapMsg(str), objArr);
    }

    public void fe(String str, Object... objArr) {
        log(6, str, objArr);
    }

    public void fi(String str, Object... objArr) {
        log(4, str, objArr);
    }

    public void forceE(Throwable th2, String str, Object... objArr) {
        Log.println(6, getTag(), getFormattedMessage(str, objArr) + "\n" + Log.getStackTraceString(th2));
    }

    public void forceI(String str, Object... objArr) {
        Log.println(4, getTag(), getFormattedMessage(str, objArr));
    }

    public void forceW(String str, Object... objArr) {
        Log.println(5, getTag(), getFormattedMessage(str, objArr));
    }

    public abstract String formatMessage(String str, Object[] objArr);

    public void fw(String str, Object... objArr) {
        log(5, str, objArr);
    }

    public abstract String getPrefix();

    public abstract String getTag();

    public void i(String str) {
        log(4, str);
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public void log(int i12, String str) {
        if (shouldLog()) {
            Log.println(i12, getTag(), getMessage(str));
        }
    }

    @k0
    public String onFormatException() {
        return getPrefix();
    }

    public void setDisabled() {
        this.mIsEnabled = false;
    }

    public void setEnabled() {
        this.mIsEnabled = true;
    }

    public boolean shouldLog() {
        return this.mIsEnabled;
    }

    public void w(String str) {
        log(5, str);
    }

    public void e(Throwable th2, String str) {
        log(6, th2, str);
    }

    public void fe(Throwable th2, String str, Object... objArr) {
        log(6, th2, str, objArr);
    }

    public void log(int i12, String str, Object... objArr) {
        if (shouldLog()) {
            Log.println(i12, getTag(), getFormattedMessage(str, objArr));
        }
    }

    public void log(int i12, @P Throwable th2, String str) {
        if (shouldLog()) {
            Log.println(i12, getTag(), getMessage(str) + "\n" + Log.getStackTraceString(th2));
        }
    }

    public void log(int i12, @P Throwable th2, String str, Object... objArr) {
        if (shouldLog()) {
            Log.println(i12, getTag(), getFormattedMessage(str, objArr) + "\n" + Log.getStackTraceString(th2));
        }
    }
}
