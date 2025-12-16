package com.yandex.mobile.ads.banner;

import android.content.Context;
import com.yandex.mobile.ads.base.SizeInfo;
import j.N;
import java.io.Serializable;

/* loaded from: classes8.dex */
public abstract class g implements Serializable {
    private static final long serialVersionUID = -7571518881522543353L;

    /* renamed from: a, reason: collision with root package name */
    @N
    private final SizeInfo f382526a;

    public g(int i12, int i13, @N int i14) {
        this.f382526a = new SizeInfo(i12, i13, i14);
    }

    @N
    public final SizeInfo a() {
        return this.f382526a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f382526a.equals(((g) obj).f382526a);
    }

    public int getHeight() {
        return this.f382526a.c();
    }

    public int getHeightInPixels(@N Context context) {
        return this.f382526a.b(context);
    }

    public int getWidth() {
        return this.f382526a.e();
    }

    public int getWidthInPixels(@N Context context) {
        return this.f382526a.d(context);
    }

    public int hashCode() {
        return this.f382526a.hashCode();
    }

    @N
    public String toString() {
        return this.f382526a.toString();
    }

    public int getHeight(@N Context context) {
        return this.f382526a.a(context);
    }

    public int getWidth(@N Context context) {
        return this.f382526a.c(context);
    }
}
