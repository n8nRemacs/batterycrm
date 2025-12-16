package androidx.view;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.view.C23317W;
import j.D;
import j.InterfaceC42145a;
import j.InterfaceC42146b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NavOptions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/B0;", "", "a", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.B0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23280B0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f52742a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f52743b;

    /* renamed from: c, reason: collision with root package name */
    @D
    public final int f52744c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f52745d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f52746e;

    /* renamed from: f, reason: collision with root package name */
    public final int f52747f;

    /* renamed from: g, reason: collision with root package name */
    public final int f52748g;

    /* renamed from: h, reason: collision with root package name */
    public final int f52749h;

    /* renamed from: i, reason: collision with root package name */
    public final int f52750i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public String f52751j;

    /* compiled from: NavOptions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/B0$a;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.B0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f52752a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f52753b;

        /* renamed from: d, reason: collision with root package name */
        @l
        public String f52755d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f52756e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f52757f;

        /* renamed from: c, reason: collision with root package name */
        @D
        public int f52754c = -1;

        /* renamed from: g, reason: collision with root package name */
        @InterfaceC42145a
        @InterfaceC42146b
        public int f52758g = -1;

        /* renamed from: h, reason: collision with root package name */
        @InterfaceC42145a
        @InterfaceC42146b
        public int f52759h = -1;

        /* renamed from: i, reason: collision with root package name */
        @InterfaceC42145a
        @InterfaceC42146b
        public int f52760i = -1;

        /* renamed from: j, reason: collision with root package name */
        @InterfaceC42145a
        @InterfaceC42146b
        public int f52761j = -1;

        @k
        public final C23280B0 a() {
            String str = this.f52755d;
            if (str == null) {
                return new C23280B0(this.f52752a, this.f52753b, this.f52754c, this.f52756e, this.f52757f, this.f52758g, this.f52759h, this.f52760i, this.f52761j);
            }
            boolean z12 = this.f52752a;
            boolean z13 = this.f52753b;
            boolean z14 = this.f52756e;
            boolean z15 = this.f52757f;
            int i12 = this.f52758g;
            int i13 = this.f52759h;
            int i14 = this.f52760i;
            int i15 = this.f52761j;
            C23317W.f52878k.getClass();
            C23280B0 c23280b0 = new C23280B0(z12, z13, C23317W.b.a(str).hashCode(), z14, z15, i12, i13, i14, i15);
            c23280b0.f52751j = str;
            return c23280b0;
        }
    }

    public C23280B0(boolean z12, boolean z13, @D int i12, boolean z14, boolean z15, @InterfaceC42145a @InterfaceC42146b int i13, @InterfaceC42145a @InterfaceC42146b int i14, @InterfaceC42145a @InterfaceC42146b int i15, @InterfaceC42145a @InterfaceC42146b int i16) {
        this.f52742a = z12;
        this.f52743b = z13;
        this.f52744c = i12;
        this.f52745d = z14;
        this.f52746e = z15;
        this.f52747f = i13;
        this.f52748g = i14;
        this.f52749h = i15;
        this.f52750i = i16;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C23280B0)) {
            return false;
        }
        C23280B0 c23280b0 = (C23280B0) obj;
        return this.f52742a == c23280b0.f52742a && this.f52743b == c23280b0.f52743b && this.f52744c == c23280b0.f52744c && L.f(this.f52751j, c23280b0.f52751j) && this.f52745d == c23280b0.f52745d && this.f52746e == c23280b0.f52746e && this.f52747f == c23280b0.f52747f && this.f52748g == c23280b0.f52748g && this.f52749h == c23280b0.f52749h && this.f52750i == c23280b0.f52750i;
    }

    public final int hashCode() {
        int i12 = (((((this.f52742a ? 1 : 0) * 31) + (this.f52743b ? 1 : 0)) * 31) + this.f52744c) * 31;
        String str = this.f52751j;
        return ((((((((((((i12 + (str != null ? str.hashCode() : 0)) * 31) + (this.f52745d ? 1 : 0)) * 31) + (this.f52746e ? 1 : 0)) * 31) + this.f52747f) * 31) + this.f52748g) * 31) + this.f52749h) * 31) + this.f52750i;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        r.C(C23280B0.class, sb2, "(");
        if (this.f52742a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f52743b) {
            sb2.append("restoreState ");
        }
        int i12 = this.f52744c;
        String str = this.f52751j;
        if ((str != null || i12 != -1) && str != null) {
            sb2.append("popUpTo(");
            if (str != null) {
                sb2.append(str);
            } else {
                sb2.append("0x");
                sb2.append(Integer.toHexString(i12));
            }
            if (this.f52745d) {
                sb2.append(" inclusive");
            }
            if (this.f52746e) {
                sb2.append(" saveState");
            }
            sb2.append(")");
        }
        int i13 = this.f52750i;
        int i14 = this.f52749h;
        int i15 = this.f52748g;
        int i16 = this.f52747f;
        if (i16 != -1 || i15 != -1 || i14 != -1 || i13 != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i16));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i15));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(i14));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(i13));
            sb2.append(")");
        }
        return sb2.toString();
    }
}
