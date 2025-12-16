package com.bumptech.glide.load;

import android.text.TextUtils;
import j.N;
import j.P;
import java.security.MessageDigest;

/* compiled from: Option.java */
/* loaded from: classes5.dex */
public final class j<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final b<Object> f339195e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final T f339196a;

    /* renamed from: b, reason: collision with root package name */
    public final b<T> f339197b;

    /* renamed from: c, reason: collision with root package name */
    public final String f339198c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f339199d;

    /* compiled from: Option.java */
    public interface b<T> {
        void a(@N byte[] bArr, @N T t12, @N MessageDigest messageDigest);
    }

    public j(@N String str, @P T t12, @N b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f339198c = str;
        this.f339196a = t12;
        com.bumptech.glide.util.k.c(bVar, "Argument must not be null");
        this.f339197b = bVar;
    }

    @N
    public static j a(@N Object obj, @N String str) {
        return new j(str, obj, f339195e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f339198c.equals(((j) obj).f339198c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f339198c.hashCode();
    }

    public final String toString() {
        return AK.c.s(new StringBuilder("Option{key='"), this.f339198c, "'}");
    }

    /* compiled from: Option.java */
    public class a implements b<Object> {
        @Override // com.bumptech.glide.load.j.b
        public final void a(@N byte[] bArr, @N Object obj, @N MessageDigest messageDigest) {
        }
    }
}
