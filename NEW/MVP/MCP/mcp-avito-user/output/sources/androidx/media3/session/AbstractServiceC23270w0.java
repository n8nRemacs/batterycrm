package androidx.media3.session;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.util.C23110a;
import androidx.media3.session.AbstractServiceC23212c1;
import androidx.media3.session.O0;

/* compiled from: MediaLibraryService.java */
/* renamed from: androidx.media3.session.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC23270w0 extends AbstractServiceC23212c1 {

    /* compiled from: MediaLibraryService.java */
    /* renamed from: androidx.media3.session.w0$b */
    public static final class b implements InterfaceC23096j {

        /* renamed from: f, reason: collision with root package name */
        public static final String f52651f;

        /* renamed from: g, reason: collision with root package name */
        public static final String f52652g;

        /* renamed from: h, reason: collision with root package name */
        public static final String f52653h;

        /* renamed from: i, reason: collision with root package name */
        public static final String f52654i;

        /* renamed from: j, reason: collision with root package name */
        @androidx.media3.common.util.J
        public static final M1 f52655j;

        /* renamed from: b, reason: collision with root package name */
        @androidx.media3.common.util.J
        public final Bundle f52656b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f52657c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f52658d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f52659e;

        /* compiled from: MediaLibraryService.java */
        /* renamed from: androidx.media3.session.w0$b$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f52660a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f52661b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f52662c;

            /* renamed from: d, reason: collision with root package name */
            public Bundle f52663d = Bundle.EMPTY;
        }

        static {
            int i12 = androidx.media3.common.util.M.f47887a;
            f52651f = Integer.toString(0, 36);
            f52652g = Integer.toString(1, 36);
            f52653h = Integer.toString(2, 36);
            f52654i = Integer.toString(3, 36);
            f52655j = new M1(11);
        }

        @Override // androidx.media3.common.InterfaceC23096j
        @androidx.media3.common.util.J
        public final Bundle k() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f52651f, this.f52656b);
            bundle.putBoolean(f52652g, this.f52657c);
            bundle.putBoolean(f52653h, this.f52658d);
            bundle.putBoolean(f52654i, this.f52659e);
            return bundle;
        }

        public b(Bundle bundle, boolean z12, boolean z13, boolean z14) {
            this.f52656b = new Bundle(bundle);
            this.f52657c = z12;
            this.f52658d = z13;
            this.f52659e = z14;
        }
    }

    /* compiled from: MediaLibraryService.java */
    /* renamed from: androidx.media3.session.w0$c */
    public static final class c extends O0 {

        /* compiled from: MediaLibraryService.java */
        /* renamed from: androidx.media3.session.w0$c$a */
        public static final class a extends O0.c<c, a, b> {
        }

        /* compiled from: MediaLibraryService.java */
        /* renamed from: androidx.media3.session.w0$c$b */
        public interface b extends O0.d {
        }

        @Override // androidx.media3.session.O0
        public final T0 a() {
            return (G0) this.f52204a;
        }
    }

    @Override // androidx.media3.session.AbstractServiceC23212c1
    @j.P
    public final /* bridge */ /* synthetic */ O0 d(O0.g gVar) {
        return h();
    }

    @j.P
    public abstract c h();

    @Override // androidx.media3.session.AbstractServiceC23212c1, android.app.Service
    @j.P
    public final IBinder onBind(@j.P Intent intent) {
        AbstractServiceC23212c1.e eVar;
        if (intent == null) {
            return null;
        }
        if (!"androidx.media3.session.MediaLibraryService".equals(intent.getAction())) {
            return super.onBind(intent);
        }
        synchronized (this.f52403b) {
            eVar = this.f52406e;
            C23110a.h(eVar);
        }
        return eVar;
    }
}
