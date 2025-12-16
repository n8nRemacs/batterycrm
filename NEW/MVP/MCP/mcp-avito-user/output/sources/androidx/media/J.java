package androidx.media;

import android.media.VolumeProvider;
import android.os.Build;
import androidx.annotation.RestrictTo;
import j.InterfaceC42164u;
import j.P;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: VolumeProviderCompat.java */
/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public final int f47016a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47017b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47018c;

    /* renamed from: d, reason: collision with root package name */
    public int f47019d;

    /* renamed from: e, reason: collision with root package name */
    public b f47020e;

    /* renamed from: f, reason: collision with root package name */
    public VolumeProvider f47021f;

    /* compiled from: VolumeProviderCompat.java */
    @X
    public static class a {
        @InterfaceC42164u
        public static void a(VolumeProvider volumeProvider, int i12) {
            volumeProvider.setCurrentVolume(i12);
        }
    }

    /* compiled from: VolumeProviderCompat.java */
    public static abstract class b {
        public abstract void onVolumeChanged(J j12);
    }

    /* compiled from: VolumeProviderCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface c {
    }

    @RestrictTo
    public J(int i12, int i13, @P String str, int i14) {
        this.f47016a = i12;
        this.f47017b = i13;
        this.f47019d = i14;
        this.f47018c = str;
    }

    public final VolumeProvider a() {
        if (this.f47021f == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f47021f = new H(this, this.f47016a, this.f47017b, this.f47019d, this.f47018c);
            } else {
                this.f47021f = new I(this, this.f47016a, this.f47017b, this.f47019d);
            }
        }
        return this.f47021f;
    }

    public final void d(int i12) {
        this.f47019d = i12;
        a.a(a(), i12);
        b bVar = this.f47020e;
        if (bVar != null) {
            bVar.onVolumeChanged(this);
        }
    }

    public void b(int i12) {
    }

    public void c(int i12) {
    }
}
