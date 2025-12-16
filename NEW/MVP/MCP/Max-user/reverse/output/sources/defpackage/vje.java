package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Bundle;
import java.util.Objects;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class vje implements sje {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final int a;
    public final int b;
    public final ComponentName c;
    public final String d;
    public final Bundle e;

    static {
        String str = zxg.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
        j = Integer.toString(4, 36);
        k = Integer.toString(5, 36);
    }

    public vje(int i2, ComponentName componentName) {
        String packageName = componentName.getPackageName();
        Bundle bundle = Bundle.EMPTY;
        this.a = i2;
        this.b = HttpStatus.SC_SWITCHING_PROTOCOLS;
        this.c = componentName;
        this.d = packageName;
        this.e = bundle;
    }

    @Override // defpackage.sje
    public final ComponentName a() {
        return this.c;
    }

    @Override // defpackage.sje
    public final Object b() {
        return null;
    }

    @Override // defpackage.sje
    public final String c() {
        ComponentName componentName = this.c;
        return componentName == null ? "" : componentName.getClassName();
    }

    @Override // defpackage.sje
    public final boolean d() {
        return true;
    }

    @Override // defpackage.sje
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vje)) {
            return false;
        }
        vje vjeVar = (vje) obj;
        int i2 = vjeVar.b;
        int i3 = this.b;
        if (i3 != i2) {
            return false;
        }
        if (i3 == 100) {
            return true;
        }
        if (i3 != 101) {
            return false;
        }
        return Objects.equals(this.c, vjeVar.c);
    }

    @Override // defpackage.sje
    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f, null);
        bundle.putInt(g, this.a);
        bundle.putInt(h, this.b);
        bundle.putParcelable(i, this.c);
        bundle.putString(j, this.d);
        bundle.putBundle(k, this.e);
        return bundle;
    }

    @Override // defpackage.sje
    public final MediaSession.Token g() {
        return null;
    }

    @Override // defpackage.sje
    public final Bundle getExtras() {
        return new Bundle(this.e);
    }

    @Override // defpackage.sje
    public final String getPackageName() {
        return this.d;
    }

    @Override // defpackage.sje
    public final int getType() {
        return this.b != 101 ? 0 : 2;
    }

    @Override // defpackage.sje
    public final int getUid() {
        return this.a;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), this.c, null);
    }

    public final String toString() {
        return ho7.j(new StringBuilder("SessionToken {legacy, uid="), this.a, "}");
    }
}
