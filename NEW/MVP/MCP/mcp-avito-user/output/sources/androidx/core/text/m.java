package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final l f44879a = new e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final l f44880b = new e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final l f44881c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f44882d;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public static class a implements c {
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f44883a = new b();
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public interface c {
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public static abstract class d implements l {

        /* renamed from: a, reason: collision with root package name */
        public final b f44884a;

        public d(b bVar) {
            this.f44884a = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
        @Override // androidx.core.text.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean a(int r7, java.lang.CharSequence r8) {
            /*
                r6 = this;
                r0 = 1
                if (r8 == 0) goto L42
                if (r7 < 0) goto L42
                int r1 = r8.length()
                int r1 = r1 - r7
                if (r1 < 0) goto L42
                androidx.core.text.m$b r1 = r6.f44884a
                if (r1 != 0) goto L15
                boolean r7 = r6.b()
                return r7
            L15:
                r1 = 0
                r2 = 2
                r3 = r1
                r4 = r2
            L19:
                if (r3 >= r7) goto L37
                if (r4 != r2) goto L37
                char r4 = r8.charAt(r3)
                byte r4 = java.lang.Character.getDirectionality(r4)
                androidx.core.text.l r5 = androidx.core.text.m.f44879a
                if (r4 == 0) goto L34
                if (r4 == r0) goto L32
                if (r4 == r2) goto L32
                switch(r4) {
                    case 14: goto L34;
                    case 15: goto L34;
                    case 16: goto L32;
                    case 17: goto L32;
                    default: goto L30;
                }
            L30:
                r4 = r2
                goto L35
            L32:
                r4 = r1
                goto L35
            L34:
                r4 = r0
            L35:
                int r3 = r3 + r0
                goto L19
            L37:
                if (r4 == 0) goto L41
                if (r4 == r0) goto L40
                boolean r0 = r6.b()
                goto L41
            L40:
                r0 = r1
            L41:
                return r0
            L42:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.m.d.a(int, java.lang.CharSequence):boolean");
        }

        public abstract boolean b();
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f44885b;

        public e(b bVar, boolean z12) {
            super(bVar);
            this.f44885b = z12;
        }

        @Override // androidx.core.text.m.d
        public final boolean b() {
            return this.f44885b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f44886b = 0;

        static {
            new f();
        }

        public f() {
            super(null);
        }

        @Override // androidx.core.text.m.d
        public final boolean b() {
            return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f44883a;
        f44881c = new e(bVar, false);
        f44882d = new e(bVar, true);
        int i12 = f.f44886b;
    }
}
