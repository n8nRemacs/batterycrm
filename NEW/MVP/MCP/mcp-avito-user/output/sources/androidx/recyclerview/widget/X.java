package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ViewBoundsCheck.java */
/* loaded from: classes10.dex */
class X {

    /* renamed from: a, reason: collision with root package name */
    public final b f53958a;

    /* renamed from: b, reason: collision with root package name */
    public final a f53959b = new a();

    /* compiled from: ViewBoundsCheck.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f53960a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f53961b;

        /* renamed from: c, reason: collision with root package name */
        public int f53962c;

        /* renamed from: d, reason: collision with root package name */
        public int f53963d;

        /* renamed from: e, reason: collision with root package name */
        public int f53964e;

        public final boolean a() {
            int i12 = this.f53960a;
            int i13 = 2;
            if ((i12 & 7) != 0) {
                int i14 = this.f53963d;
                int i15 = this.f53961b;
                if (((i14 > i15 ? 1 : i14 == i15 ? 2 : 4) & i12) == 0) {
                    return false;
                }
            }
            if ((i12 & 112) != 0) {
                int i16 = this.f53963d;
                int i17 = this.f53962c;
                if ((((i16 > i17 ? 1 : i16 == i17 ? 2 : 4) << 4) & i12) == 0) {
                    return false;
                }
            }
            if ((i12 & 1792) != 0) {
                int i18 = this.f53964e;
                int i19 = this.f53961b;
                if ((((i18 > i19 ? 1 : i18 == i19 ? 2 : 4) << 8) & i12) == 0) {
                    return false;
                }
            }
            if ((i12 & 28672) != 0) {
                int i22 = this.f53964e;
                int i23 = this.f53962c;
                if (i22 > i23) {
                    i13 = 1;
                } else if (i22 != i23) {
                    i13 = 4;
                }
                if ((i12 & (i13 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    public interface b {
        View a(int i12);

        int b();

        int c(View view);

        int d();

        int e(View view);
    }

    /* compiled from: ViewBoundsCheck.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public X(b bVar) {
        this.f53958a = bVar;
    }

    public final View a(int i12, int i13, int i14, int i15) {
        b bVar = this.f53958a;
        int iD2 = bVar.d();
        int iB2 = bVar.b();
        int i16 = i13 > i12 ? 1 : -1;
        View view = null;
        while (i12 != i13) {
            View viewA = bVar.a(i12);
            int iC2 = bVar.c(viewA);
            int iE2 = bVar.e(viewA);
            a aVar = this.f53959b;
            aVar.f53961b = iD2;
            aVar.f53962c = iB2;
            aVar.f53963d = iC2;
            aVar.f53964e = iE2;
            if (i14 != 0) {
                aVar.f53960a = i14;
                if (aVar.a()) {
                    return viewA;
                }
            }
            if (i15 != 0) {
                aVar.f53960a = i15;
                if (aVar.a()) {
                    view = viewA;
                }
            }
            i12 += i16;
        }
        return view;
    }

    public final boolean b(View view) {
        b bVar = this.f53958a;
        int iD2 = bVar.d();
        int iB2 = bVar.b();
        int iC2 = bVar.c(view);
        int iE2 = bVar.e(view);
        a aVar = this.f53959b;
        aVar.f53961b = iD2;
        aVar.f53962c = iB2;
        aVar.f53963d = iC2;
        aVar.f53964e = iE2;
        aVar.f53960a = 24579;
        return aVar.a();
    }
}
