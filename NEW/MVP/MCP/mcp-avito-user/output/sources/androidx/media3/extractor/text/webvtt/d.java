package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.util.J;
import j.InterfaceC42156l;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.Set;

/* compiled from: WebvttCssStyle.java */
@J
/* loaded from: classes.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC42156l
    public int f51450f;

    /* renamed from: h, reason: collision with root package name */
    public int f51452h;

    /* renamed from: o, reason: collision with root package name */
    public float f51459o;

    /* renamed from: a, reason: collision with root package name */
    public String f51445a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f51446b = "";

    /* renamed from: c, reason: collision with root package name */
    public Set<String> f51447c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    public String f51448d = "";

    /* renamed from: e, reason: collision with root package name */
    @P
    public String f51449e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f51451g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f51453i = false;

    /* renamed from: j, reason: collision with root package name */
    public final int f51454j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f51455k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f51456l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f51457m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f51458n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f51460p = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f51461q = false;

    /* compiled from: WebvttCssStyle.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: WebvttCssStyle.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static int a(int i12, int i13, String str, @P String str2) {
        if (str.isEmpty() || i12 == -1) {
            return i12;
        }
        if (str.equals(str2)) {
            return i12 + i13;
        }
        return -1;
    }
}
