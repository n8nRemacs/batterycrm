package androidx.core.content.pm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import j.N;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ShortcutInfoCompat.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public Context f44632a;

    /* renamed from: b, reason: collision with root package name */
    public String f44633b;

    /* renamed from: c, reason: collision with root package name */
    public Intent[] f44634c;

    /* renamed from: d, reason: collision with root package name */
    public String f44635d;

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f44636e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f44637f;

    /* renamed from: g, reason: collision with root package name */
    public PersistableBundle f44638g;

    /* compiled from: ShortcutInfoCompat.java */
    @X
    public static class a {
        public static void a(@N ShortcutInfo.Builder builder) {
            builder.setExcludedFromSurfaces(0);
        }
    }

    /* compiled from: ShortcutInfoCompat.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final e f44639a;

        public b(@N Context context, @N String str) {
            e eVar = new e();
            this.f44639a = eVar;
            eVar.f44632a = context;
            eVar.f44633b = str;
        }
    }

    /* compiled from: ShortcutInfoCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface c {
    }

    @X
    public final ShortcutInfo a() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f44632a, this.f44633b).setShortLabel(this.f44635d).setIntents(this.f44634c);
        IconCompat iconCompat = this.f44636e;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.k(this.f44632a));
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setLongLabel(null);
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setDisabledMessage(null);
        }
        intents.setRank(0);
        PersistableBundle persistableBundle = this.f44638g;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            intents.setLongLived(this.f44637f);
        } else {
            if (this.f44638g == null) {
                this.f44638g = new PersistableBundle();
            }
            this.f44638g.putBoolean("extraLongLived", this.f44637f);
            intents.setExtras(this.f44638g);
        }
        if (i12 >= 33) {
            a.a(intents);
        }
        return intents.build();
    }
}
