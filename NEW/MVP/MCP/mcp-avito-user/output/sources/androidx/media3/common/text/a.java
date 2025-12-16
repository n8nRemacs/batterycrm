package androidx.media3.common.text;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.S;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.InterfaceC42156l;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* compiled from: Cue.java */
/* loaded from: classes.dex */
public final class a implements InterfaceC23096j {

    /* renamed from: A, reason: collision with root package name */
    public static final String f47803A;

    /* renamed from: B, reason: collision with root package name */
    public static final String f47804B;

    /* renamed from: C, reason: collision with root package name */
    public static final String f47805C;

    /* renamed from: D, reason: collision with root package name */
    public static final String f47806D;

    /* renamed from: E, reason: collision with root package name */
    public static final String f47807E;

    /* renamed from: F, reason: collision with root package name */
    public static final String f47808F;

    /* renamed from: G, reason: collision with root package name */
    public static final String f47809G;

    /* renamed from: H, reason: collision with root package name */
    public static final String f47810H;

    /* renamed from: I, reason: collision with root package name */
    public static final String f47811I;

    /* renamed from: J, reason: collision with root package name */
    public static final String f47812J;

    /* renamed from: K, reason: collision with root package name */
    @J
    public static final S f47813K;

    /* renamed from: s, reason: collision with root package name */
    public static final a f47814s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f47815t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f47816u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f47817v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f47818w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f47819x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f47820y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f47821z;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final CharSequence f47822b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final Layout.Alignment f47823c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final Layout.Alignment f47824d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final Bitmap f47825e;

    /* renamed from: f, reason: collision with root package name */
    public final float f47826f;

    /* renamed from: g, reason: collision with root package name */
    public final int f47827g;

    /* renamed from: h, reason: collision with root package name */
    public final int f47828h;

    /* renamed from: i, reason: collision with root package name */
    public final float f47829i;

    /* renamed from: j, reason: collision with root package name */
    public final int f47830j;

    /* renamed from: k, reason: collision with root package name */
    public final float f47831k;

    /* renamed from: l, reason: collision with root package name */
    public final float f47832l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f47833m;

    /* renamed from: n, reason: collision with root package name */
    public final int f47834n;

    /* renamed from: o, reason: collision with root package name */
    public final int f47835o;

    /* renamed from: p, reason: collision with root package name */
    public final float f47836p;

    /* renamed from: q, reason: collision with root package name */
    public final int f47837q;

    /* renamed from: r, reason: collision with root package name */
    public final float f47838r;

    /* compiled from: Cue.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* compiled from: Cue.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* compiled from: Cue.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* compiled from: Cue.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    static {
        c cVar = new c();
        cVar.f47839a = "";
        f47814s = cVar.a();
        int i12 = M.f47887a;
        f47815t = Integer.toString(0, 36);
        f47816u = Integer.toString(1, 36);
        f47817v = Integer.toString(2, 36);
        f47818w = Integer.toString(3, 36);
        f47819x = Integer.toString(4, 36);
        f47820y = Integer.toString(5, 36);
        f47821z = Integer.toString(6, 36);
        f47803A = Integer.toString(7, 36);
        f47804B = Integer.toString(8, 36);
        f47805C = Integer.toString(9, 36);
        f47806D = Integer.toString(10, 36);
        f47807E = Integer.toString(11, 36);
        f47808F = Integer.toString(12, 36);
        f47809G = Integer.toString(13, 36);
        f47810H = Integer.toString(14, 36);
        f47811I = Integer.toString(15, 36);
        f47812J = Integer.toString(16, 36);
        f47813K = new S(4);
    }

    public a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f12, int i12, int i13, float f13, int i14, int i15, float f14, float f15, float f16, boolean z12, int i16, int i17, float f17, C1818a c1818a) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            C23110a.b(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f47822b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f47822b = charSequence.toString();
        } else {
            this.f47822b = null;
        }
        this.f47823c = alignment;
        this.f47824d = alignment2;
        this.f47825e = bitmap;
        this.f47826f = f12;
        this.f47827g = i12;
        this.f47828h = i13;
        this.f47829i = f13;
        this.f47830j = i14;
        this.f47831k = f15;
        this.f47832l = f16;
        this.f47833m = z12;
        this.f47834n = i16;
        this.f47835o = i15;
        this.f47836p = f14;
        this.f47837q = i17;
        this.f47838r = f17;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (TextUtils.equals(this.f47822b, aVar.f47822b) && this.f47823c == aVar.f47823c && this.f47824d == aVar.f47824d) {
            Bitmap bitmap = aVar.f47825e;
            Bitmap bitmap2 = this.f47825e;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f47826f == aVar.f47826f && this.f47827g == aVar.f47827g && this.f47828h == aVar.f47828h && this.f47829i == aVar.f47829i && this.f47830j == aVar.f47830j && this.f47831k == aVar.f47831k && this.f47832l == aVar.f47832l && this.f47833m == aVar.f47833m && this.f47834n == aVar.f47834n && this.f47835o == aVar.f47835o && this.f47836p == aVar.f47836p && this.f47837q == aVar.f47837q && this.f47838r == aVar.f47838r) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47822b, this.f47823c, this.f47824d, this.f47825e, Float.valueOf(this.f47826f), Integer.valueOf(this.f47827g), Integer.valueOf(this.f47828h), Float.valueOf(this.f47829i), Integer.valueOf(this.f47830j), Float.valueOf(this.f47831k), Float.valueOf(this.f47832l), Boolean.valueOf(this.f47833m), Integer.valueOf(this.f47834n), Integer.valueOf(this.f47835o), Float.valueOf(this.f47836p), Integer.valueOf(this.f47837q), Float.valueOf(this.f47838r)});
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(f47815t, this.f47822b);
        bundle.putSerializable(f47816u, this.f47823c);
        bundle.putSerializable(f47817v, this.f47824d);
        bundle.putParcelable(f47818w, this.f47825e);
        bundle.putFloat(f47819x, this.f47826f);
        bundle.putInt(f47820y, this.f47827g);
        bundle.putInt(f47821z, this.f47828h);
        bundle.putFloat(f47803A, this.f47829i);
        bundle.putInt(f47804B, this.f47830j);
        bundle.putInt(f47805C, this.f47835o);
        bundle.putFloat(f47806D, this.f47836p);
        bundle.putFloat(f47807E, this.f47831k);
        bundle.putFloat(f47808F, this.f47832l);
        bundle.putBoolean(f47810H, this.f47833m);
        bundle.putInt(f47809G, this.f47834n);
        bundle.putInt(f47811I, this.f47837q);
        bundle.putFloat(f47812J, this.f47838r);
        return bundle;
    }

    /* compiled from: Cue.java */
    @J
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @P
        public CharSequence f47839a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public Bitmap f47840b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public Layout.Alignment f47841c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public Layout.Alignment f47842d;

        /* renamed from: e, reason: collision with root package name */
        public float f47843e;

        /* renamed from: f, reason: collision with root package name */
        public int f47844f;

        /* renamed from: g, reason: collision with root package name */
        public int f47845g;

        /* renamed from: h, reason: collision with root package name */
        public float f47846h;

        /* renamed from: i, reason: collision with root package name */
        public int f47847i;

        /* renamed from: j, reason: collision with root package name */
        public int f47848j;

        /* renamed from: k, reason: collision with root package name */
        public float f47849k;

        /* renamed from: l, reason: collision with root package name */
        public float f47850l;

        /* renamed from: m, reason: collision with root package name */
        public float f47851m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f47852n;

        /* renamed from: o, reason: collision with root package name */
        @InterfaceC42156l
        public int f47853o;

        /* renamed from: p, reason: collision with root package name */
        public int f47854p;

        /* renamed from: q, reason: collision with root package name */
        public float f47855q;

        public c() {
            this.f47839a = null;
            this.f47840b = null;
            this.f47841c = null;
            this.f47842d = null;
            this.f47843e = -3.4028235E38f;
            this.f47844f = BeduinInputModel.MIN_TEXT_VERSION;
            this.f47845g = BeduinInputModel.MIN_TEXT_VERSION;
            this.f47846h = -3.4028235E38f;
            this.f47847i = BeduinInputModel.MIN_TEXT_VERSION;
            this.f47848j = BeduinInputModel.MIN_TEXT_VERSION;
            this.f47849k = -3.4028235E38f;
            this.f47850l = -3.4028235E38f;
            this.f47851m = -3.4028235E38f;
            this.f47852n = false;
            this.f47853o = -16777216;
            this.f47854p = BeduinInputModel.MIN_TEXT_VERSION;
        }

        public final a a() {
            return new a(this.f47839a, this.f47841c, this.f47842d, this.f47840b, this.f47843e, this.f47844f, this.f47845g, this.f47846h, this.f47847i, this.f47848j, this.f47849k, this.f47850l, this.f47851m, this.f47852n, this.f47853o, this.f47854p, this.f47855q, null);
        }

        public c(a aVar, C1818a c1818a) {
            this.f47839a = aVar.f47822b;
            this.f47840b = aVar.f47825e;
            this.f47841c = aVar.f47823c;
            this.f47842d = aVar.f47824d;
            this.f47843e = aVar.f47826f;
            this.f47844f = aVar.f47827g;
            this.f47845g = aVar.f47828h;
            this.f47846h = aVar.f47829i;
            this.f47847i = aVar.f47830j;
            this.f47848j = aVar.f47835o;
            this.f47849k = aVar.f47836p;
            this.f47850l = aVar.f47831k;
            this.f47851m = aVar.f47832l;
            this.f47852n = aVar.f47833m;
            this.f47853o = aVar.f47834n;
            this.f47854p = aVar.f47837q;
            this.f47855q = aVar.f47838r;
        }
    }
}
