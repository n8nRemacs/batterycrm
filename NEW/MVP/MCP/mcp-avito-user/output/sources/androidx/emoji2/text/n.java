package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Trace;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.G;
import androidx.core.graphics.I;
import androidx.core.os.K;
import androidx.core.provider.n;
import androidx.core.util.z;
import androidx.emoji2.text.e;
import androidx.emoji2.text.n;
import j.B;
import j.N;
import j.P;
import j.X;
import j.l0;
import java.nio.MappedByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: FontRequestEmojiCompatConfig.java */
/* loaded from: classes.dex */
public class n extends e.d {

    /* renamed from: d, reason: collision with root package name */
    public static final b f46135d = new b();

    /* compiled from: FontRequestEmojiCompatConfig.java */
    public static class a extends d {
    }

    /* compiled from: FontRequestEmojiCompatConfig.java */
    @RestrictTo
    public static class b {
    }

    /* compiled from: FontRequestEmojiCompatConfig.java */
    public static class c implements e.j {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final Context f46136a;

        /* renamed from: b, reason: collision with root package name */
        @N
        public final androidx.core.provider.h f46137b;

        /* renamed from: c, reason: collision with root package name */
        @N
        public final b f46138c;

        /* renamed from: d, reason: collision with root package name */
        @N
        public final Object f46139d = new Object();

        /* renamed from: e, reason: collision with root package name */
        @B
        @P
        public Handler f46140e;

        /* renamed from: f, reason: collision with root package name */
        @B
        @P
        public ThreadPoolExecutor f46141f;

        /* renamed from: g, reason: collision with root package name */
        @B
        @P
        public ThreadPoolExecutor f46142g;

        /* renamed from: h, reason: collision with root package name */
        @B
        @P
        public e.k f46143h;

        /* renamed from: i, reason: collision with root package name */
        @B
        @P
        public ContentObserver f46144i;

        public c(@N Context context, @N androidx.core.provider.h hVar, @N b bVar) {
            z.f(context, "Context cannot be null");
            this.f46136a = context.getApplicationContext();
            this.f46137b = hVar;
            this.f46138c = bVar;
        }

        @Override // androidx.emoji2.text.e.j
        @X
        public final void a(@N e.k kVar) {
            synchronized (this.f46139d) {
                this.f46143h = kVar;
            }
            synchronized (this.f46139d) {
                try {
                    if (this.f46143h == null) {
                        return;
                    }
                    if (this.f46141f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f46142g = threadPoolExecutor;
                        this.f46141f = threadPoolExecutor;
                    }
                    this.f46141f.execute(new Runnable() { // from class: androidx.emoji2.text.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            n.c cVar = this.f46145b;
                            synchronized (cVar.f46139d) {
                                try {
                                    if (cVar.f46143h == null) {
                                        return;
                                    }
                                    try {
                                        n.c cVarC = cVar.c();
                                        int i12 = cVarC.f44847e;
                                        if (i12 == 2) {
                                            synchronized (cVar.f46139d) {
                                            }
                                        }
                                        if (i12 != 0) {
                                            throw new RuntimeException("fetchFonts result is not OK. (" + i12 + ")");
                                        }
                                        try {
                                            int i13 = K.f44794a;
                                            Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                            n.b bVar = cVar.f46138c;
                                            Context context = cVar.f46136a;
                                            bVar.getClass();
                                            Typeface typefaceB = androidx.core.graphics.z.b(context, new n.c[]{cVarC}, 0);
                                            MappedByteBuffer mappedByteBufferE = I.e(cVar.f46136a, cVarC.f44843a);
                                            if (mappedByteBufferE == null || typefaceB == null) {
                                                throw new RuntimeException("Unable to open file.");
                                            }
                                            try {
                                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                r rVar = new r(typefaceB, q.a(mappedByteBufferE));
                                                Trace.endSection();
                                                Trace.endSection();
                                                synchronized (cVar.f46139d) {
                                                    try {
                                                        e.k kVar2 = cVar.f46143h;
                                                        if (kVar2 != null) {
                                                            kVar2.b(rVar);
                                                        }
                                                    } finally {
                                                    }
                                                }
                                                cVar.b();
                                            } finally {
                                                int i14 = K.f44794a;
                                                Trace.endSection();
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    } catch (Throwable th3) {
                                        synchronized (cVar.f46139d) {
                                            try {
                                                e.k kVar3 = cVar.f46143h;
                                                if (kVar3 != null) {
                                                    kVar3.a(th3);
                                                }
                                                cVar.b();
                                            } finally {
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                    });
                } finally {
                }
            }
        }

        public final void b() {
            synchronized (this.f46139d) {
                try {
                    this.f46143h = null;
                    ContentObserver contentObserver = this.f46144i;
                    if (contentObserver != null) {
                        b bVar = this.f46138c;
                        Context context = this.f46136a;
                        bVar.getClass();
                        context.getContentResolver().unregisterContentObserver(contentObserver);
                        this.f46144i = null;
                    }
                    Handler handler = this.f46140e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.f46140e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f46142g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f46141f = null;
                    this.f46142g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @l0
        public final n.c c() {
            try {
                b bVar = this.f46138c;
                Context context = this.f46136a;
                androidx.core.provider.h hVar = this.f46137b;
                bVar.getClass();
                n.b bVarA = androidx.core.provider.n.a(context, hVar);
                int i12 = bVarA.f44841a;
                if (i12 != 0) {
                    throw new RuntimeException(G.e(i12, "fetchFonts failed (", ")"));
                }
                n.c[] cVarArr = bVarA.f44842b.get(0);
                if (cVarArr == null || cVarArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return cVarArr[0];
            } catch (PackageManager.NameNotFoundException e12) {
                throw new RuntimeException("provider not found", e12);
            }
        }
    }

    /* compiled from: FontRequestEmojiCompatConfig.java */
    public static abstract class d {
    }
}
