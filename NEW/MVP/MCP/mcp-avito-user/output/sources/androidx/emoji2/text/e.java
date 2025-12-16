package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.RestrictTo;
import androidx.collection.C20203c;
import androidx.core.util.z;
import androidx.emoji2.text.l;
import j.B;
import j.F;
import j.InterfaceC42148d;
import j.InterfaceC42154j;
import j.N;
import j.P;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: EmojiCompat.java */
@InterfaceC42148d
/* loaded from: classes.dex */
public class e {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f46065j = new Object();

    /* renamed from: k, reason: collision with root package name */
    @B
    @P
    public static volatile e f46066k;

    /* renamed from: a, reason: collision with root package name */
    @N
    public final ReentrantReadWriteLock f46067a;

    /* renamed from: b, reason: collision with root package name */
    @B
    @N
    public final C20203c f46068b;

    /* renamed from: c, reason: collision with root package name */
    @B
    public volatile int f46069c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public final Handler f46070d;

    /* renamed from: e, reason: collision with root package name */
    @N
    public final b f46071e;

    /* renamed from: f, reason: collision with root package name */
    @N
    public final j f46072f;

    /* renamed from: g, reason: collision with root package name */
    @N
    public final C1785e f46073g;

    /* renamed from: h, reason: collision with root package name */
    public final int f46074h;

    /* renamed from: i, reason: collision with root package name */
    public final f f46075i;

    /* compiled from: EmojiCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface a {
    }

    /* compiled from: EmojiCompat.java */
    @X
    public static final class b extends c {

        /* renamed from: b, reason: collision with root package name */
        public volatile androidx.emoji2.text.l f46076b;

        /* renamed from: c, reason: collision with root package name */
        public volatile r f46077c;
    }

    /* compiled from: EmojiCompat.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final e f46078a;

        public c(e eVar) {
            this.f46078a = eVar;
        }
    }

    /* compiled from: EmojiCompat.java */
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final j f46079a;

        /* renamed from: b, reason: collision with root package name */
        public int f46080b = 0;

        /* renamed from: c, reason: collision with root package name */
        @N
        public final f f46081c = new androidx.emoji2.text.d();

        public d(@N j jVar) {
            this.f46079a = jVar;
        }
    }

    /* compiled from: EmojiCompat.java */
    @RestrictTo
    /* renamed from: androidx.emoji2.text.e$e, reason: collision with other inner class name */
    public static class C1785e implements m {
    }

    /* compiled from: EmojiCompat.java */
    public interface f {
    }

    /* compiled from: EmojiCompat.java */
    public static class h implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f46082b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46083c;

        public h() {
            throw null;
        }

        public h(@N List list, int i12, @P Throwable th2) {
            z.f(list, "initCallbacks cannot be null");
            this.f46082b = new ArrayList(list);
            this.f46083c = i12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f46082b;
            int size = arrayList.size();
            int i12 = 0;
            if (this.f46083c != 1) {
                while (i12 < size) {
                    ((g) arrayList.get(i12)).a();
                    i12++;
                }
            } else {
                while (i12 < size) {
                    ((g) arrayList.get(i12)).b();
                    i12++;
                }
            }
        }
    }

    /* compiled from: EmojiCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface i {
    }

    /* compiled from: EmojiCompat.java */
    public interface j {
        void a(@N k kVar);
    }

    /* compiled from: EmojiCompat.java */
    public static abstract class k {
        public abstract void a(@P Throwable th2);

        public abstract void b(@N r rVar);
    }

    /* compiled from: EmojiCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface l {
    }

    /* compiled from: EmojiCompat.java */
    public interface m {
    }

    public e(@N d dVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f46067a = reentrantReadWriteLock;
        this.f46069c = 3;
        j jVar = dVar.f46079a;
        this.f46072f = jVar;
        int i12 = dVar.f46080b;
        this.f46074h = i12;
        this.f46075i = dVar.f46081c;
        this.f46070d = new Handler(Looper.getMainLooper());
        this.f46068b = new C20203c();
        this.f46073g = new C1785e();
        b bVar = new b(this);
        this.f46071e = bVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i12 == 0) {
            try {
                this.f46069c = 0;
            } catch (Throwable th2) {
                this.f46067a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (d() == 0) {
            try {
                jVar.a(new androidx.emoji2.text.f(bVar));
            } catch (Throwable th3) {
                i(th3);
            }
        }
    }

    @N
    public static e a() {
        e eVar;
        synchronized (f46065j) {
            eVar = f46066k;
            z.g("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", eVar != null);
        }
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:91:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(@j.N android.view.inputmethod.InputConnection r7, @j.N android.text.Editable r8, @j.F int r9, @j.F int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.e.e(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static boolean f(@N Editable editable, int i12, @N KeyEvent keyEvent) {
        if (!(i12 != 67 ? i12 != 112 ? false : androidx.emoji2.text.l.a(editable, keyEvent, true) : androidx.emoji2.text.l.a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public static boolean g() {
        return f46066k != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(@F int i12, @N String str) {
        z.g("Not initialized yet", d() == 1);
        z.f(str, "charSequence cannot be null");
        androidx.emoji2.text.l lVar = this.f46071e.f46076b;
        lVar.getClass();
        if (i12 < 0 || i12 >= str.length()) {
            return -1;
        }
        if (str instanceof Spanned) {
            Spanned spanned = (Spanned) str;
            androidx.emoji2.text.m[] mVarArr = (androidx.emoji2.text.m[]) spanned.getSpans(i12, i12 + 1, androidx.emoji2.text.m.class);
            if (mVarArr.length > 0) {
                return spanned.getSpanEnd(mVarArr[0]);
            }
        }
        return ((l.d) lVar.c(str, Math.max(0, i12 - 16), Math.min(str.length(), i12 + 16), Integer.MAX_VALUE, true, new l.d(i12))).f46123c;
    }

    public final int c(@F int i12, @N CharSequence charSequence) {
        z.g("Not initialized yet", d() == 1);
        z.f(charSequence, "charSequence cannot be null");
        androidx.emoji2.text.l lVar = this.f46071e.f46076b;
        lVar.getClass();
        if (i12 < 0 || i12 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            androidx.emoji2.text.m[] mVarArr = (androidx.emoji2.text.m[]) spanned.getSpans(i12, i12 + 1, androidx.emoji2.text.m.class);
            if (mVarArr.length > 0) {
                return spanned.getSpanStart(mVarArr[0]);
            }
        }
        return ((l.d) lVar.c(charSequence, Math.max(0, i12 - 16), Math.min(charSequence.length(), i12 + 16), Integer.MAX_VALUE, true, new l.d(i12))).f46122b;
    }

    public final int d() {
        this.f46067a.readLock().lock();
        try {
            return this.f46069c;
        } finally {
            this.f46067a.readLock().unlock();
        }
    }

    public final void h() {
        z.g("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.f46074h == 1);
        if (d() == 1) {
            return;
        }
        this.f46067a.writeLock().lock();
        try {
            if (this.f46069c == 0) {
                return;
            }
            this.f46069c = 0;
            this.f46067a.writeLock().unlock();
            b bVar = this.f46071e;
            e eVar = bVar.f46078a;
            try {
                eVar.f46072f.a(new androidx.emoji2.text.f(bVar));
            } catch (Throwable th2) {
                eVar.i(th2);
            }
        } finally {
            this.f46067a.writeLock().unlock();
        }
    }

    public final void i(@P Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f46067a.writeLock().lock();
        try {
            this.f46069c = 2;
            arrayList.addAll(this.f46068b);
            this.f46068b.clear();
            this.f46067a.writeLock().unlock();
            this.f46070d.post(new h(arrayList, this.f46069c, th2));
        } catch (Throwable th3) {
            this.f46067a.writeLock().unlock();
            throw th3;
        }
    }

    @InterfaceC42154j
    @P
    public final CharSequence j(@F int i12, @F int i13, int i14, @P CharSequence charSequence) {
        androidx.emoji2.text.m[] mVarArr;
        z.g("Not initialized yet", d() == 1);
        z.e(i12, "start cannot be negative");
        z.e(i13, "end cannot be negative");
        z.e(Integer.MAX_VALUE, "maxEmojiCount cannot be negative");
        z.a("start should be <= than end", i12 <= i13);
        v vVar = null;
        if (charSequence == null) {
            return null;
        }
        z.a("start should be < than charSequence length", i12 <= charSequence.length());
        z.a("end should be < than charSequence length", i13 <= charSequence.length());
        if (charSequence.length() == 0 || i12 == i13) {
            return charSequence;
        }
        boolean z12 = i14 == 1;
        androidx.emoji2.text.l lVar = this.f46071e.f46076b;
        lVar.getClass();
        boolean z13 = charSequence instanceof s;
        if (z13) {
            ((s) charSequence).a();
        }
        if (z13) {
            vVar = new v((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    vVar = new v((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i12 - 1, i13 + 1, androidx.emoji2.text.m.class) <= i13) {
                    vVar = new v();
                    vVar.f46162b = false;
                    vVar.f46163c = new SpannableString(charSequence);
                }
            } finally {
                if (z13) {
                    ((s) charSequence).b();
                }
            }
        }
        if (vVar != null && (mVarArr = (androidx.emoji2.text.m[]) vVar.f46163c.getSpans(i12, i13, androidx.emoji2.text.m.class)) != null && mVarArr.length > 0) {
            for (androidx.emoji2.text.m mVar : mVarArr) {
                int spanStart = vVar.f46163c.getSpanStart(mVar);
                int spanEnd = vVar.f46163c.getSpanEnd(mVar);
                if (spanStart != i13) {
                    vVar.removeSpan(mVar);
                }
                i12 = Math.min(spanStart, i12);
                i13 = Math.max(spanEnd, i13);
            }
        }
        int i15 = i12;
        int i16 = i13;
        if (i15 != i16 && i15 < charSequence.length()) {
            v vVar2 = (v) lVar.c(charSequence, i15, i16, Integer.MAX_VALUE, z12, new l.b(vVar, lVar.f46116a));
            if (vVar2 != null) {
                Spannable spannable = vVar2.f46163c;
                if (z13) {
                    ((s) charSequence).b();
                }
                return spannable;
            }
            if (!z13) {
                return charSequence;
            }
        } else if (!z13) {
            return charSequence;
        }
        return charSequence;
    }

    public final void k(@N g gVar) {
        z.f(gVar, "initCallback cannot be null");
        this.f46067a.writeLock().lock();
        try {
            if (this.f46069c == 1 || this.f46069c == 2) {
                this.f46070d.post(new h(Arrays.asList(gVar), this.f46069c, null));
            } else {
                this.f46068b.add(gVar);
            }
            this.f46067a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f46067a.writeLock().unlock();
            throw th2;
        }
    }

    public final void l(@N EditorInfo editorInfo) {
        if (d() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        b bVar = this.f46071e;
        bVar.getClass();
        Bundle bundle = editorInfo.extras;
        androidx.emoji2.text.flatbuffer.o oVar = bVar.f46077c.f46147a;
        int iA2 = oVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA2 != 0 ? oVar.f46105b.getInt(iA2 + oVar.f46104a) : 0);
        Bundle bundle2 = editorInfo.extras;
        bVar.f46078a.getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }

    /* compiled from: EmojiCompat.java */
    public static abstract class g {
        public void a() {
        }

        public void b() {
        }
    }
}
