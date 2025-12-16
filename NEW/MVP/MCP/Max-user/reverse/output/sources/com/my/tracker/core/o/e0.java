package com.my.tracker.core.o;

import android.content.ContextWrapper;
import android.content.SharedPreferences;
import com.my.tracker.core.utils.Consumer;

/* loaded from: classes.dex */
public final class e0 {
    private static final Object b = new Object();
    static volatile e0 c;
    private final SharedPreferences a;

    public e0(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static e0 a(ContextWrapper contextWrapper) {
        e0 e0Var;
        e0 e0Var2 = c;
        if (e0Var2 != null) {
            return e0Var2;
        }
        synchronized (b) {
            try {
                e0Var = c;
                if (e0Var == null) {
                    e0Var = new e0(contextWrapper.getSharedPreferences("mytracker_prefs", 0));
                    c = e0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e0Var;
    }

    public long b(String str) {
        long j;
        synchronized (b) {
            j = 0;
            try {
                j = this.a.getLong(str, 0L);
            } finally {
                return j;
            }
        }
        return j;
    }

    public String c(String str) {
        String string;
        synchronized (b) {
            try {
                try {
                    string = this.a.getString(str, "");
                } catch (Throwable unused) {
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public void d(String str) {
        synchronized (b) {
            try {
                if (!a("referrerSent")) {
                    a("referrer", str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(String str, long j) {
        synchronized (b) {
            try {
                this.a.edit().putLong(str, j).commit();
            } finally {
            }
        }
    }

    public long a(String str, long j) {
        long j2;
        synchronized (b) {
            j2 = 0;
            try {
                j2 = this.a.getLong(str, 0L);
                this.a.edit().putLong(str, j).commit();
            } finally {
                return j2;
            }
        }
        return j2;
    }

    public void a(String str, String str2) {
        synchronized (b) {
            try {
                this.a.edit().putString(str, str2).commit();
            } finally {
            }
        }
    }

    public boolean a(String str) {
        boolean z;
        synchronized (b) {
            try {
                try {
                    z = this.a.getBoolean(str, false);
                } catch (Throwable unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void a(String str, boolean z) {
        synchronized (b) {
            try {
                this.a.edit().putBoolean(str, z).commit();
            } finally {
            }
        }
    }

    public void a(Consumer consumer) {
        synchronized (b) {
            try {
                SharedPreferences.Editor editorEdit = this.a.edit();
                consumer.accept(editorEdit);
                editorEdit.commit();
            } finally {
            }
        }
    }
}
