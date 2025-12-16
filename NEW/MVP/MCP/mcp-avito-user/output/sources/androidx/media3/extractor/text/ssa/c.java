package androidx.media3.extractor.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.M;
import androidx.media3.common.util.s;
import com.google.common.primitives.l;
import j.InterfaceC42156l;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: SsaStyle.java */
/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f51328a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51329b;

    /* renamed from: c, reason: collision with root package name */
    @P
    @InterfaceC42156l
    public final Integer f51330c;

    /* renamed from: d, reason: collision with root package name */
    @P
    @InterfaceC42156l
    public final Integer f51331d;

    /* renamed from: e, reason: collision with root package name */
    public final float f51332e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f51333f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f51334g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f51335h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f51336i;

    /* renamed from: j, reason: collision with root package name */
    public final int f51337j;

    /* compiled from: SsaStyle.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f51338a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51339b;

        /* renamed from: c, reason: collision with root package name */
        public final int f51340c;

        /* renamed from: d, reason: collision with root package name */
        public final int f51341d;

        /* renamed from: e, reason: collision with root package name */
        public final int f51342e;

        /* renamed from: f, reason: collision with root package name */
        public final int f51343f;

        /* renamed from: g, reason: collision with root package name */
        public final int f51344g;

        /* renamed from: h, reason: collision with root package name */
        public final int f51345h;

        /* renamed from: i, reason: collision with root package name */
        public final int f51346i;

        /* renamed from: j, reason: collision with root package name */
        public final int f51347j;

        /* renamed from: k, reason: collision with root package name */
        public final int f51348k;

        public a(int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i22, int i23, int i24) {
            this.f51338a = i12;
            this.f51339b = i13;
            this.f51340c = i14;
            this.f51341d = i15;
            this.f51342e = i16;
            this.f51343f = i17;
            this.f51344g = i18;
            this.f51345h = i19;
            this.f51346i = i22;
            this.f51347j = i23;
            this.f51348k = i24;
        }
    }

    /* compiled from: SsaStyle.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final Pattern f51349a = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: b, reason: collision with root package name */
        public static final Pattern f51350b;

        /* renamed from: c, reason: collision with root package name */
        public static final Pattern f51351c;

        /* renamed from: d, reason: collision with root package name */
        public static final Pattern f51352d;

        static {
            int i12 = M.f47887a;
            Locale locale = Locale.US;
            f51350b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f51351c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f51352d = Pattern.compile("\\\\an(\\d+)");
        }

        @P
        public static PointF a(String str) throws NumberFormatException {
            String strGroup;
            String strGroup2;
            Matcher matcher = f51350b.matcher(str);
            Matcher matcher2 = f51351c.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    s.f();
                }
                strGroup2 = matcher.group(1);
                strGroup = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                String strGroup3 = matcher2.group(1);
                strGroup = matcher2.group(2);
                strGroup2 = strGroup3;
            }
            strGroup2.getClass();
            float f12 = Float.parseFloat(strGroup2.trim());
            strGroup.getClass();
            return new PointF(f12, Float.parseFloat(strGroup.trim()));
        }
    }

    /* compiled from: SsaStyle.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.extractor.text.ssa.c$c, reason: collision with other inner class name */
    public @interface InterfaceC1862c {
    }

    /* compiled from: SsaStyle.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public c(String str, int i12, @P @InterfaceC42156l Integer num, @P @InterfaceC42156l Integer num2, float f12, boolean z12, boolean z13, boolean z14, boolean z15, int i13) {
        this.f51328a = str;
        this.f51329b = i12;
        this.f51330c = num;
        this.f51331d = num2;
        this.f51332e = f12;
        this.f51333f = z12;
        this.f51334g = z13;
        this.f51335h = z14;
        this.f51336i = z15;
        this.f51337j = i13;
    }

    public static int a(String str) throws NumberFormatException {
        int i12;
        try {
            i12 = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (i12) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return i12;
            default:
                s.g();
                return -1;
        }
    }

    public static boolean b(String str) throws NumberFormatException {
        try {
            int i12 = Integer.parseInt(str);
            return i12 == 1 || i12 == -1;
        } catch (NumberFormatException e12) {
            s.h("Failed to parse boolean value: '" + str + "'", e12);
            return false;
        }
    }

    @P
    @InterfaceC42156l
    public static Integer c(String str) {
        try {
            long j12 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            C23110a.b(j12 <= 4294967295L);
            return Integer.valueOf(Color.argb(l.b(((j12 >> 24) & 255) ^ 255), l.b(j12 & 255), l.b((j12 >> 8) & 255), l.b((j12 >> 16) & 255)));
        } catch (IllegalArgumentException e12) {
            s.h("Failed to parse color expression: '" + str + "'", e12);
            return null;
        }
    }
}
