package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.core.app.K;
import androidx.core.graphics.drawable.IconCompat;
import com.avito.android.R;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public class z {

    /* compiled from: NotificationCompat.java */
    public static final class A implements r {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList<b> f44556a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<Notification> f44557b = new ArrayList<>();

        /* compiled from: NotificationCompat.java */
        @X
        public static class a {
            private a() {
            }
        }

        /* compiled from: NotificationCompat.java */
        @X
        public static class b {
            private b() {
            }
        }

        /* compiled from: NotificationCompat.java */
        @X
        public static class c {
            private c() {
            }
        }

        /* compiled from: NotificationCompat.java */
        @X
        public static class d {
            private d() {
            }
        }

        @j.N
        public final Object clone() {
            A a12 = new A();
            a12.f44556a = new ArrayList<>(this.f44556a);
            a12.f44557b = new ArrayList<>(this.f44557b);
            return a12;
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f44558a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public IconCompat f44559b;

        /* renamed from: c, reason: collision with root package name */
        public final M[] f44560c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f44561d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f44562e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public final int f44563f;

        /* renamed from: g, reason: collision with root package name */
        public final CharSequence f44564g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        public final PendingIntent f44565h;

        /* compiled from: NotificationCompat.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final IconCompat f44566a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f44567b;

            /* renamed from: c, reason: collision with root package name */
            public final PendingIntent f44568c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f44569d;

            /* renamed from: e, reason: collision with root package name */
            public final Bundle f44570e;

            /* renamed from: f, reason: collision with root package name */
            public ArrayList<M> f44571f = null;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f44572g;

            /* compiled from: NotificationCompat.java */
            @X
            /* renamed from: androidx.core.app.z$b$a$a, reason: collision with other inner class name */
            public static class C1722a {
                private C1722a() {
                }
            }

            /* compiled from: NotificationCompat.java */
            @X
            /* renamed from: androidx.core.app.z$b$a$b, reason: collision with other inner class name */
            public static class C1723b {
                private C1723b() {
                }
            }

            /* compiled from: NotificationCompat.java */
            @X
            public static class c {
                private c() {
                }
            }

            /* compiled from: NotificationCompat.java */
            @X
            public static class d {
                private d() {
                }
            }

            /* compiled from: NotificationCompat.java */
            @X
            public static class e {
                private e() {
                }
            }

            /* compiled from: NotificationCompat.java */
            @X
            public static class f {
                private f() {
                }
            }

            public a(@j.P IconCompat iconCompat, @j.P CharSequence charSequence, @j.P PendingIntent pendingIntent, @j.N Bundle bundle) {
                this.f44569d = true;
                this.f44572g = true;
                this.f44566a = iconCompat;
                this.f44567b = n.c(charSequence);
                this.f44568c = pendingIntent;
                this.f44570e = bundle;
                this.f44569d = true;
                this.f44572g = true;
            }

            @j.N
            public final b a() {
                HashSet hashSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<M> arrayList3 = this.f44571f;
                if (arrayList3 != null) {
                    Iterator<M> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        M next = it.next();
                        if (next.f44506c || (hashSet = next.f44508e) == null || hashSet.isEmpty()) {
                            arrayList2.add(next);
                        } else {
                            arrayList.add(next);
                        }
                    }
                }
                return new b(this.f44566a, this.f44567b, this.f44568c, this.f44570e, arrayList2.isEmpty() ? null : (M[]) arrayList2.toArray(new M[arrayList2.size()]), arrayList.isEmpty() ? null : (M[]) arrayList.toArray(new M[arrayList.size()]), this.f44569d, this.f44572g);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.z$b$b, reason: collision with other inner class name */
        public interface InterfaceC1724b {
        }

        /* compiled from: NotificationCompat.java */
        @Retention(RetentionPolicy.SOURCE)
        public @interface c {
        }

        /* compiled from: NotificationCompat.java */
        public static final class d implements InterfaceC1724b {
            @j.N
            public final Object clone() {
                return new d();
            }
        }

        public b(@j.P IconCompat iconCompat, @j.P CharSequence charSequence, @j.P PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, true);
        }

        @j.P
        public final IconCompat a() {
            int i12;
            if (this.f44559b == null && (i12 = this.f44563f) != 0) {
                this.f44559b = IconCompat.f("", null, i12);
            }
            return this.f44559b;
        }

        public b(@j.P IconCompat iconCompat, @j.P CharSequence charSequence, @j.P PendingIntent pendingIntent, @j.P Bundle bundle, @j.P M[] mArr, @j.P M[] mArr2, boolean z12, boolean z13) {
            this.f44562e = true;
            this.f44559b = iconCompat;
            if (iconCompat != null && iconCompat.h() == 2) {
                this.f44563f = iconCompat.g();
            }
            this.f44564g = n.c(charSequence);
            this.f44565h = pendingIntent;
            this.f44558a = bundle == null ? new Bundle() : bundle;
            this.f44560c = mArr;
            this.f44561d = z12;
            this.f44562e = z13;
        }
    }

    /* compiled from: NotificationCompat.java */
    @X
    public static class c {
    }

    /* compiled from: NotificationCompat.java */
    @X
    public static class d {
    }

    /* compiled from: NotificationCompat.java */
    @X
    public static class e {
    }

    /* compiled from: NotificationCompat.java */
    @X
    public static class f {
    }

    /* compiled from: NotificationCompat.java */
    @X
    public static class g {
    }

    /* compiled from: NotificationCompat.java */
    @X
    public static class h {
    }

    /* compiled from: NotificationCompat.java */
    @X
    public static class i {
    }

    /* compiled from: NotificationCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface j {
    }

    /* compiled from: NotificationCompat.java */
    public static class k extends y {

        /* renamed from: d, reason: collision with root package name */
        public IconCompat f44573d;

        /* renamed from: e, reason: collision with root package name */
        public IconCompat f44574e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f44575f;

        /* compiled from: NotificationCompat.java */
        @X
        public static class a {
            private a() {
            }

            @X
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* compiled from: NotificationCompat.java */
        @X
        public static class b {
            private b() {
            }

            @X
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @X
            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @X
            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z12) {
                bigPictureStyle.showBigPictureWhenCollapsed(z12);
            }
        }

        @Override // androidx.core.app.z.y
        @RestrictTo
        public final void b(androidx.core.app.w wVar) {
            Bitmap bitmap;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(((androidx.core.app.A) wVar).f44471b).setBigContentTitle(null);
            IconCompat iconCompat = this.f44573d;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    b.a(bigContentTitle, iconCompat.k(((androidx.core.app.A) wVar).f44470a));
                } else if (iconCompat.h() == 1) {
                    IconCompat iconCompat2 = this.f44573d;
                    int i12 = iconCompat2.f44738a;
                    if (i12 == -1) {
                        Object obj = iconCompat2.f44739b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i12 == 1) {
                        bitmap = (Bitmap) iconCompat2.f44739b;
                    } else {
                        if (i12 != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.f44739b;
                        int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint(3);
                        float f12 = iMin;
                        float f13 = 0.5f * f12;
                        float f14 = 0.9166667f * f13;
                        float f15 = 0.010416667f * f12;
                        paint.setColor(0);
                        paint.setShadowLayer(f15, 0.0f, f12 * 0.020833334f, 1023410176);
                        canvas.drawCircle(f13, f13, f14, paint);
                        paint.setShadowLayer(f15, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(f13, f13, f14, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f13, f13, f14, paint);
                        canvas.setBitmap(null);
                        bitmap = bitmapCreateBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
            if (this.f44575f) {
                IconCompat iconCompat3 = this.f44574e;
                if (iconCompat3 == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, iconCompat3.k(((androidx.core.app.A) wVar).f44470a));
                }
            }
            if (this.f44625c) {
                bigContentTitle.setSummaryText(this.f44624b);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.c(bigContentTitle, false);
                b.b(bigContentTitle, null);
            }
        }

        @Override // androidx.core.app.z.y
        @j.N
        @RestrictTo
        public final String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class l extends y {

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f44576d;

        @Override // androidx.core.app.z.y
        @RestrictTo
        public final void b(androidx.core.app.w wVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(((androidx.core.app.A) wVar).f44471b).setBigContentTitle(null).bigText(this.f44576d);
            if (this.f44625c) {
                bigTextStyleBigText.setSummaryText(this.f44624b);
            }
        }

        @Override // androidx.core.app.z.y
        @j.N
        @RestrictTo
        public final String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }
    }

    /* compiled from: NotificationCompat.java */
    public static final class m {

        /* compiled from: NotificationCompat.java */
        @X
        public static class a {
            private a() {
            }
        }

        /* compiled from: NotificationCompat.java */
        @X
        public static class b {
            private b() {
            }
        }

        /* compiled from: NotificationCompat.java */
        public static final class c {
            @Deprecated
            public c() {
            }
        }

        public m(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i12, int i13, int i14, String str, C22760a c22760a) {
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class n {

        /* renamed from: A, reason: collision with root package name */
        public final boolean f44577A;

        /* renamed from: B, reason: collision with root package name */
        public final Notification f44578B;

        /* renamed from: C, reason: collision with root package name */
        public boolean f44579C;

        /* renamed from: D, reason: collision with root package name */
        @Deprecated
        public final ArrayList<String> f44580D;

        /* renamed from: a, reason: collision with root package name */
        @RestrictTo
        public final Context f44581a;

        /* renamed from: e, reason: collision with root package name */
        public CharSequence f44585e;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f44586f;

        /* renamed from: g, reason: collision with root package name */
        public PendingIntent f44587g;

        /* renamed from: h, reason: collision with root package name */
        public PendingIntent f44588h;

        /* renamed from: i, reason: collision with root package name */
        public IconCompat f44589i;

        /* renamed from: j, reason: collision with root package name */
        public int f44590j;

        /* renamed from: k, reason: collision with root package name */
        public int f44591k;

        /* renamed from: m, reason: collision with root package name */
        public boolean f44593m;

        /* renamed from: n, reason: collision with root package name */
        public y f44594n;

        /* renamed from: o, reason: collision with root package name */
        public String f44595o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f44596p;

        /* renamed from: q, reason: collision with root package name */
        public String f44597q;

        /* renamed from: s, reason: collision with root package name */
        public String f44599s;

        /* renamed from: t, reason: collision with root package name */
        public Bundle f44600t;

        /* renamed from: w, reason: collision with root package name */
        public String f44603w;

        /* renamed from: x, reason: collision with root package name */
        public String f44604x;

        /* renamed from: y, reason: collision with root package name */
        public androidx.core.content.h f44605y;

        /* renamed from: b, reason: collision with root package name */
        @RestrictTo
        public final ArrayList<b> f44582b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        @j.N
        @RestrictTo
        public final ArrayList<K> f44583c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList<b> f44584d = new ArrayList<>();

        /* renamed from: l, reason: collision with root package name */
        public boolean f44592l = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f44598r = false;

        /* renamed from: u, reason: collision with root package name */
        public int f44601u = 0;

        /* renamed from: v, reason: collision with root package name */
        public int f44602v = 0;

        /* renamed from: z, reason: collision with root package name */
        public int f44606z = 0;

        /* compiled from: NotificationCompat.java */
        @X
        public static class a {
            private a() {
            }

            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i12) {
                return builder.setContentType(i12);
            }

            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i12) {
                return builder.setUsage(i12);
            }
        }

        /* compiled from: NotificationCompat.java */
        @X
        public static class b {
            private b() {
            }
        }

        /* compiled from: NotificationCompat.java */
        @X
        public static class c {
            private c() {
            }
        }

        public n(@j.N Context context, @j.N String str) {
            Notification notification = new Notification();
            this.f44578B = notification;
            this.f44581a = context;
            this.f44603w = str;
            notification.when = System.currentTimeMillis();
            notification.audioStreamType = -1;
            this.f44591k = 0;
            this.f44580D = new ArrayList<>();
            this.f44577A = true;
        }

        @j.P
        public static CharSequence c(@j.P CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        @j.N
        public final void a(@j.P b bVar) {
            if (bVar != null) {
                this.f44582b.add(bVar);
            }
        }

        @j.N
        public final Notification b() {
            Bundle bundle;
            androidx.core.app.A a12 = new androidx.core.app.A(this);
            n nVar = a12.f44472c;
            y yVar = nVar.f44594n;
            if (yVar != null) {
                yVar.b(a12);
            }
            Notification notificationBuild = a12.f44471b.build();
            if (yVar != null) {
                nVar.f44594n.getClass();
            }
            if (yVar != null && (bundle = notificationBuild.extras) != null) {
                yVar.a(bundle);
            }
            return notificationBuild;
        }

        @j.N
        public final void d(@j.P CharSequence charSequence) {
            this.f44586f = c(charSequence);
        }

        @j.N
        public final void e(@j.P CharSequence charSequence) {
            this.f44585e = c(charSequence);
        }

        @j.N
        public final void f(int i12) {
            Notification notification = this.f44578B;
            notification.defaults = i12;
            if ((i12 & 4) != 0) {
                notification.flags |= 1;
            }
        }

        public final void g(int i12, boolean z12) {
            Notification notification = this.f44578B;
            if (z12) {
                notification.flags = i12 | notification.flags;
            } else {
                notification.flags = (~i12) & notification.flags;
            }
        }

        @j.N
        public final void h(@j.P Bitmap bitmap) {
            this.f44589i = bitmap == null ? null : IconCompat.c(bitmap);
        }

        @j.N
        public final void i(@j.P Uri uri) {
            Notification notification = this.f44578B;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = a.a(a.d(a.c(a.b(), 4), 5));
        }

        @j.N
        public final void j(@j.P y yVar) {
            if (this.f44594n != yVar) {
                this.f44594n = yVar;
                if (yVar == null || yVar.f44623a == this) {
                    return;
                }
                yVar.f44623a = this;
                j(yVar);
            }
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class o extends y {

        /* renamed from: d, reason: collision with root package name */
        public final int f44607d;

        /* renamed from: e, reason: collision with root package name */
        public final K f44608e;

        /* renamed from: f, reason: collision with root package name */
        public final PendingIntent f44609f;

        /* renamed from: g, reason: collision with root package name */
        public final PendingIntent f44610g;

        /* renamed from: h, reason: collision with root package name */
        public final PendingIntent f44611h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f44612i;

        /* compiled from: NotificationCompat.java */
        @X
        public static class a {
            private a() {
            }
        }

        /* compiled from: NotificationCompat.java */
        @X
        public static class b {
            private b() {
            }

            public static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            public static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* compiled from: NotificationCompat.java */
        @X
        public static class c {
            private c() {
            }

            public static void a(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        /* compiled from: NotificationCompat.java */
        @X
        public static class d {
            private d() {
            }
        }

        /* compiled from: NotificationCompat.java */
        @X
        public static class f {
            private f() {
            }

            public static Notification.CallStyle a(@j.N Person person, @j.N PendingIntent pendingIntent, @j.N PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle b(@j.N Person person, @j.N PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            public static Notification.CallStyle c(@j.N Person person, @j.N PendingIntent pendingIntent, @j.N PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle d(Notification.CallStyle callStyle, boolean z12) {
                return callStyle.setIsVideo(z12);
            }

            public static Notification.CallStyle e(Notification.CallStyle callStyle, @j.P CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        /* compiled from: NotificationCompat.java */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface g {
        }

        public o() {
        }

        @Override // androidx.core.app.z.y
        @RestrictTo
        public final void a(@j.N Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f44607d);
            bundle.putBoolean("android.callIsVideo", this.f44612i);
            K k12 = this.f44608e;
            if (k12 != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", e.b(K.b.a(k12)));
                } else {
                    bundle.putParcelable("android.callPersonCompat", k12.a());
                }
            }
            bundle.putCharSequence("android.verificationText", null);
            bundle.putParcelable("android.answerIntent", this.f44609f);
            bundle.putParcelable("android.declineIntent", this.f44610g);
            bundle.putParcelable("android.hangUpIntent", this.f44611h);
        }

        @Override // androidx.core.app.z.y
        @RestrictTo
        public final void b(androidx.core.app.w wVar) throws Resources.NotFoundException {
            String string;
            Notification.CallStyle callStyleA;
            int i12 = Build.VERSION.SDK_INT;
            int i13 = this.f44607d;
            K k12 = this.f44608e;
            if (i12 >= 31) {
                PendingIntent pendingIntent = this.f44609f;
                if (i13 != 1) {
                    PendingIntent pendingIntent2 = this.f44611h;
                    if (i13 == 2) {
                        k12.getClass();
                        callStyleA = f.b(K.b.a(k12), pendingIntent2);
                    } else if (i13 != 3) {
                        if (Log.isLoggable("NotifCompat", 3)) {
                            String.valueOf(i13);
                        }
                        callStyleA = null;
                    } else {
                        k12.getClass();
                        callStyleA = f.c(K.b.a(k12), pendingIntent2, pendingIntent);
                    }
                } else {
                    k12.getClass();
                    callStyleA = f.a(K.b.a(k12), this.f44610g, pendingIntent);
                }
                if (callStyleA != null) {
                    callStyleA.setBuilder(((androidx.core.app.A) wVar).f44471b);
                    f.e(callStyleA, null);
                    f.d(callStyleA, this.f44612i);
                    return;
                }
                return;
            }
            Notification.Builder builder = ((androidx.core.app.A) wVar).f44471b;
            builder.setContentTitle(k12 != null ? k12.f44497a : null);
            Bundle bundle = this.f44623a.f44600t;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.f44623a.f44600t.getCharSequence("android.text");
            if (charSequence == null) {
                if (i13 == 1) {
                    string = this.f44623a.f44581a.getResources().getString(R.string.call_notification_incoming_text);
                } else if (i13 == 2) {
                    string = this.f44623a.f44581a.getResources().getString(R.string.call_notification_ongoing_text);
                } else if (i13 != 3) {
                    charSequence = null;
                } else {
                    string = this.f44623a.f44581a.getResources().getString(R.string.call_notification_screening_text);
                }
                charSequence = string;
            }
            builder.setContentText(charSequence);
            if (k12 != null) {
                IconCompat iconCompat = k12.f44498b;
                if (iconCompat != null) {
                    c.a(builder, iconCompat.k(this.f44623a.f44581a));
                }
                if (i12 >= 28) {
                    e.a(builder, K.b.a(k12));
                } else {
                    b.a(builder, null);
                }
            }
            b.b(builder, "call");
        }

        @Override // androidx.core.app.z.y
        @j.N
        @RestrictTo
        public final String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        @j.N
        @X
        public final b d(int i12, int i13, int i14, PendingIntent pendingIntent) {
            Integer numValueOf = Integer.valueOf(androidx.core.content.d.getColor(this.f44623a.f44581a, i14));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f44623a.f44581a.getResources().getString(i13));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(numValueOf.intValue()), 0, spannableStringBuilder.length(), 18);
            b bVarA = new b.a(IconCompat.e(i12, this.f44623a.f44581a), spannableStringBuilder, pendingIntent, new Bundle()).a();
            bVarA.f44558a.putBoolean("key_action_priority", true);
            return bVarA;
        }

        public o(int i12, @j.N K k12, @j.P PendingIntent pendingIntent, @j.P PendingIntent pendingIntent2, @j.P PendingIntent pendingIntent3) {
            if (TextUtils.isEmpty(k12.f44497a)) {
                throw new IllegalArgumentException("person must have a non-empty a name");
            }
            this.f44607d = i12;
            this.f44608e = k12;
            this.f44609f = pendingIntent3;
            this.f44610g = pendingIntent2;
            this.f44611h = pendingIntent;
        }

        /* compiled from: NotificationCompat.java */
        @X
        public static class e {
            private e() {
            }

            public static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            public static Parcelable b(Person person) {
                return person;
            }
        }
    }

    /* compiled from: NotificationCompat.java */
    public static final class p implements r {

        /* compiled from: NotificationCompat.java */
        @X
        public static class a {
            private a() {
            }
        }

        /* compiled from: NotificationCompat.java */
        @X
        public static class b {
            private b() {
            }
        }

        /* compiled from: NotificationCompat.java */
        @Deprecated
        public static class c {

            /* compiled from: NotificationCompat.java */
            public static class a {
            }
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class q extends y {

        /* compiled from: NotificationCompat.java */
        @X
        public static class a {
            private a() {
            }

            public static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // androidx.core.app.z.y
        @RestrictTo
        public final void b(androidx.core.app.w wVar) {
            ((androidx.core.app.A) wVar).f44471b.setStyle(a.a());
        }

        @Override // androidx.core.app.z.y
        @j.N
        @RestrictTo
        public final String c() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }
    }

    /* compiled from: NotificationCompat.java */
    public interface r {
    }

    /* compiled from: NotificationCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface s {
    }

    /* compiled from: NotificationCompat.java */
    public static class t extends y {

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList<CharSequence> f44613d = new ArrayList<>();

        @Override // androidx.core.app.z.y
        @RestrictTo
        public final void b(androidx.core.app.w wVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((androidx.core.app.A) wVar).f44471b).setBigContentTitle(null);
            if (this.f44625c) {
                bigContentTitle.setSummaryText(this.f44624b);
            }
            Iterator<CharSequence> it = this.f44613d.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // androidx.core.app.z.y
        @j.N
        @RestrictTo
        public final String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    /* compiled from: NotificationCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface v {
    }

    /* compiled from: NotificationCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface w {
    }

    /* compiled from: NotificationCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface x {
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.z$z, reason: collision with other inner class name */
    public static final class C1725z implements r {
    }

    @Deprecated
    public z() {
    }

    /* compiled from: NotificationCompat.java */
    public static class u extends y {

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f44614d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f44615e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public final K f44616f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        public String f44617g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        public Boolean f44618h;

        /* compiled from: NotificationCompat.java */
        @X
        public static class a {
            private a() {
            }

            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            public static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* compiled from: NotificationCompat.java */
        @X
        public static class b {
            private b() {
            }

            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* compiled from: NotificationCompat.java */
        @X
        public static class c {
            private c() {
            }

            public static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z12) {
                return messagingStyle.setGroupConversation(z12);
            }
        }

        public u() {
        }

        @Override // androidx.core.app.z.y
        public final void a(@j.N Bundle bundle) {
            super.a(bundle);
            K k12 = this.f44616f;
            bundle.putCharSequence("android.selfDisplayName", k12.f44497a);
            bundle.putBundle("android.messagingStyleUser", k12.a());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f44617g);
            if (this.f44617g != null && this.f44618h.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f44617g);
            }
            ArrayList arrayList = this.f44614d;
            if (!arrayList.isEmpty()) {
                bundle.putParcelableArray("android.messages", d.a(arrayList));
            }
            ArrayList arrayList2 = this.f44615e;
            if (!arrayList2.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", d.a(arrayList2));
            }
            Boolean bool = this.f44618h;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.z.y
        @RestrictTo
        public final void b(androidx.core.app.w wVar) {
            Notification.MessagingStyle messagingStyleB;
            n nVar = this.f44623a;
            boolean zBooleanValue = false;
            if (nVar == null || nVar.f44581a.getApplicationInfo().targetSdkVersion >= 28 || this.f44618h != null) {
                Boolean bool = this.f44618h;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
            } else if (this.f44617g != null) {
                zBooleanValue = true;
            }
            this.f44618h = Boolean.valueOf(zBooleanValue);
            int i12 = Build.VERSION.SDK_INT;
            K k12 = this.f44616f;
            if (i12 >= 28) {
                k12.getClass();
                messagingStyleB = c.a(K.b.a(k12));
            } else {
                messagingStyleB = a.b(k12.f44497a);
            }
            Iterator it = this.f44614d.iterator();
            while (it.hasNext()) {
                a.a(messagingStyleB, ((d) it.next()).b());
            }
            Iterator it2 = this.f44615e.iterator();
            while (it2.hasNext()) {
                b.a(messagingStyleB, ((d) it2.next()).b());
            }
            if (this.f44618h.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                a.c(messagingStyleB, this.f44617g);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                c.b(messagingStyleB, this.f44618h.booleanValue());
            }
            messagingStyleB.setBuilder(((androidx.core.app.A) wVar).f44471b);
        }

        @Override // androidx.core.app.z.y
        @j.N
        @RestrictTo
        public final String c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        public u(@j.N K k12) {
            if (!TextUtils.isEmpty(k12.f44497a)) {
                this.f44616f = k12;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        /* compiled from: NotificationCompat.java */
        public static final class d {

            /* renamed from: a, reason: collision with root package name */
            public final String f44619a;

            /* renamed from: b, reason: collision with root package name */
            public final long f44620b;

            /* renamed from: c, reason: collision with root package name */
            @j.P
            public final K f44621c;

            /* renamed from: d, reason: collision with root package name */
            public final Bundle f44622d = new Bundle();

            /* compiled from: NotificationCompat.java */
            @X
            public static class a {
                private a() {
                }

                public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j12, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j12, charSequence2);
                }
            }

            public d(@j.P String str, long j12, @j.P K k12) {
                this.f44619a = str;
                this.f44620b = j12;
                this.f44621c = k12;
            }

            @j.N
            public static Bundle[] a(@j.N ArrayList arrayList) {
                Bundle[] bundleArr = new Bundle[arrayList.size()];
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    d dVar = (d) arrayList.get(i12);
                    dVar.getClass();
                    Bundle bundle = new Bundle();
                    String str = dVar.f44619a;
                    if (str != null) {
                        bundle.putCharSequence("text", str);
                    }
                    bundle.putLong(CrashHianalyticsData.TIME, dVar.f44620b);
                    K k12 = dVar.f44621c;
                    if (k12 != null) {
                        bundle.putCharSequence("sender", k12.f44497a);
                        if (Build.VERSION.SDK_INT >= 28) {
                            bundle.putParcelable("sender_person", b.a(K.b.a(k12)));
                        } else {
                            bundle.putBundle("person", k12.a());
                        }
                    }
                    Bundle bundle2 = dVar.f44622d;
                    if (bundle2 != null) {
                        bundle.putBundle("extras", bundle2);
                    }
                    bundleArr[i12] = bundle;
                }
                return bundleArr;
            }

            @j.N
            @RestrictTo
            @X
            public final Notification.MessagingStyle.Message b() {
                int i12 = Build.VERSION.SDK_INT;
                long j12 = this.f44620b;
                String str = this.f44619a;
                K k12 = this.f44621c;
                if (i12 >= 28) {
                    return b.b(str, j12, k12 != null ? K.b.a(k12) : null);
                }
                return a.a(str, j12, k12 != null ? k12.f44497a : null);
            }

            /* compiled from: NotificationCompat.java */
            @X
            public static class b {
                private b() {
                }

                public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j12, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j12, person);
                }

                public static Parcelable a(Person person) {
                    return person;
                }
            }
        }
    }

    /* compiled from: NotificationCompat.java */
    public static abstract class y {

        /* renamed from: a, reason: collision with root package name */
        @RestrictTo
        public n f44623a;

        /* renamed from: b, reason: collision with root package name */
        public CharSequence f44624b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f44625c = false;

        /* compiled from: NotificationCompat.java */
        @X
        public static class a {
            private a() {
            }
        }

        @RestrictTo
        public void a(@j.N Bundle bundle) {
            if (this.f44625c) {
                bundle.putCharSequence("android.summaryText", this.f44624b);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        @RestrictTo
        @j.P
        public String c() {
            return null;
        }

        @RestrictTo
        public void b(androidx.core.app.w wVar) {
        }
    }
}
