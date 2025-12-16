package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.annotation.RestrictTo;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ContentInfoCompat.java */
/* renamed from: androidx.core.view.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22814d {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final g f45033a;

    /* compiled from: ContentInfoCompat.java */
    @j.X
    /* renamed from: androidx.core.view.d$a */
    public static final class a {
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.d$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final InterfaceC1757d f45034a;

        public b(@j.N ClipData clipData, int i12) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f45034a = new c(clipData, i12);
                return;
            }
            e eVar = new e();
            eVar.f45036a = clipData;
            eVar.f45037b = i12;
            this.f45034a = eVar;
        }

        @j.N
        public final C22814d a() {
            return this.f45034a.build();
        }

        @j.N
        public final void b(@j.P Bundle bundle) {
            this.f45034a.setExtras(bundle);
        }

        @j.N
        public final void c(int i12) {
            this.f45034a.setFlags(i12);
        }

        @j.N
        public final void d(@j.P Uri uri) {
            this.f45034a.a(uri);
        }
    }

    /* compiled from: ContentInfoCompat.java */
    @j.X
    /* renamed from: androidx.core.view.d$c */
    public static final class c implements InterfaceC1757d {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final ContentInfo.Builder f45035a;

        public c(@j.N ClipData clipData, int i12) {
            this.f45035a = C22812c.c(clipData, i12);
        }

        @Override // androidx.core.view.C22814d.InterfaceC1757d
        public final void a(@j.P Uri uri) {
            this.f45035a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C22814d.InterfaceC1757d
        @j.N
        public final C22814d build() {
            return new C22814d(new f(this.f45035a.build()));
        }

        @Override // androidx.core.view.C22814d.InterfaceC1757d
        public final void setExtras(@j.P Bundle bundle) {
            this.f45035a.setExtras(bundle);
        }

        @Override // androidx.core.view.C22814d.InterfaceC1757d
        public final void setFlags(int i12) {
            this.f45035a.setFlags(i12);
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    public interface InterfaceC1757d {
        void a(@j.P Uri uri);

        @j.N
        C22814d build();

        void setExtras(@j.P Bundle bundle);

        void setFlags(int i12);
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.d$e */
    public static final class e implements InterfaceC1757d {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public ClipData f45036a;

        /* renamed from: b, reason: collision with root package name */
        public int f45037b;

        /* renamed from: c, reason: collision with root package name */
        public int f45038c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public Uri f45039d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public Bundle f45040e;

        @Override // androidx.core.view.C22814d.InterfaceC1757d
        public final void a(@j.P Uri uri) {
            this.f45039d = uri;
        }

        @Override // androidx.core.view.C22814d.InterfaceC1757d
        @j.N
        public final C22814d build() {
            return new C22814d(new h(this));
        }

        @Override // androidx.core.view.C22814d.InterfaceC1757d
        public final void setExtras(@j.P Bundle bundle) {
            this.f45040e = bundle;
        }

        @Override // androidx.core.view.C22814d.InterfaceC1757d
        public final void setFlags(int i12) {
            this.f45038c = i12;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    @j.X
    /* renamed from: androidx.core.view.d$f */
    public static final class f implements g {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final ContentInfo f45041a;

        public f(@j.N ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f45041a = C22812c.e(contentInfo);
        }

        @Override // androidx.core.view.C22814d.g
        @j.N
        public final ClipData a() {
            return this.f45041a.getClip();
        }

        @Override // androidx.core.view.C22814d.g
        public final int e() {
            return this.f45041a.getSource();
        }

        @Override // androidx.core.view.C22814d.g
        @j.N
        public final ContentInfo f() {
            return this.f45041a;
        }

        @Override // androidx.core.view.C22814d.g
        public final int getFlags() {
            return this.f45041a.getFlags();
        }

        @j.N
        public final String toString() {
            return "ContentInfoCompat{" + this.f45041a + "}";
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.d$g */
    public interface g {
        @j.N
        ClipData a();

        int e();

        @j.P
        ContentInfo f();

        int getFlags();
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.d$h */
    public static final class h implements g {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final ClipData f45042a;

        /* renamed from: b, reason: collision with root package name */
        public final int f45043b;

        /* renamed from: c, reason: collision with root package name */
        public final int f45044c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final Uri f45045d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public final Bundle f45046e;

        public h(e eVar) {
            ClipData clipData = eVar.f45036a;
            clipData.getClass();
            this.f45042a = clipData;
            int i12 = eVar.f45037b;
            androidx.core.util.z.c(i12, 0, SearchParamsConverterKt.SOURCE, 5);
            this.f45043b = i12;
            int i13 = eVar.f45038c;
            if ((i13 & 1) == i13) {
                this.f45044c = i13;
                this.f45045d = eVar.f45039d;
                this.f45046e = eVar.f45040e;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i13) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // androidx.core.view.C22814d.g
        @j.N
        public final ClipData a() {
            return this.f45042a;
        }

        @Override // androidx.core.view.C22814d.g
        public final int e() {
            return this.f45043b;
        }

        @Override // androidx.core.view.C22814d.g
        @j.P
        public final ContentInfo f() {
            return null;
        }

        @Override // androidx.core.view.C22814d.g
        public final int getFlags() {
            return this.f45044c;
        }

        @j.N
        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
            sb2.append(this.f45042a.getDescription());
            sb2.append(", source=");
            int i12 = this.f45043b;
            sb2.append(i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? i12 != 5 ? String.valueOf(i12) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            sb2.append(", flags=");
            int i13 = this.f45044c;
            sb2.append((i13 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i13));
            Uri uri = this.f45045d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb2.append(str);
            return AK.c.s(sb2, this.f45046e != null ? ", hasExtras" : "", "}");
        }
    }

    /* compiled from: ContentInfoCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* renamed from: androidx.core.view.d$i */
    public @interface i {
    }

    /* compiled from: ContentInfoCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* renamed from: androidx.core.view.d$j */
    public @interface j {
    }

    public C22814d(@j.N g gVar) {
        this.f45033a = gVar;
    }

    @j.N
    public final ClipData a() {
        return this.f45033a.a();
    }

    public final int b() {
        return this.f45033a.getFlags();
    }

    public final int c() {
        return this.f45033a.e();
    }

    @j.N
    public final String toString() {
        return this.f45033a.toString();
    }
}
