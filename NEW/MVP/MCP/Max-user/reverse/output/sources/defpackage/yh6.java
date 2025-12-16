package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class yh6 {
    public final /* synthetic */ int a;
    public final Object b;

    public yh6(bwa bwaVar) {
        this.a = 1;
        this.b = bwaVar;
    }

    private final void c(ghb ghbVar, String str, String str2) {
    }

    private final void e(vgb vgbVar, Uri uri, long j, boolean z) {
    }

    private final void g(vgb vgbVar, Uri uri, long j, boolean z) {
    }

    private final void i(vgb vgbVar, Uri uri, long j, boolean z) {
    }

    public final void a(vgb vgbVar, Uri uri, long j, boolean z, int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((yh6) it.next()).a(vgbVar, uri, j, z, i);
                }
                break;
            default:
                ((bwa) this.b).f.addAndGet(i);
                break;
        }
    }

    public final void b(ghb ghbVar, String str, String str2) {
        switch (this.a) {
            case 0:
                Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((yh6) it.next()).b(ghbVar, str, str2);
                }
                break;
        }
    }

    public final void d(vgb vgbVar, Uri uri, long j, boolean z) {
        switch (this.a) {
            case 0:
                Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((yh6) it.next()).d(vgbVar, uri, j, z);
                }
                break;
        }
    }

    public final void f(vgb vgbVar, Uri uri, long j, boolean z) {
        switch (this.a) {
            case 0:
                Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((yh6) it.next()).f(vgbVar, uri, j, z);
                }
                break;
        }
    }

    public final void h(vgb vgbVar, Uri uri, long j, boolean z) {
        switch (this.a) {
            case 0:
                Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((yh6) it.next()).h(vgbVar, uri, j, z);
                }
                break;
        }
    }

    public yh6() {
        this.a = 0;
        this.b = new CopyOnWriteArrayList();
    }
}
