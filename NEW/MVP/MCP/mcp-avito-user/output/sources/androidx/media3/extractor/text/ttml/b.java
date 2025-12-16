package androidx.media3.extractor.text.ttml;

import com.google.common.collect.H1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* compiled from: TextEmphasis.java */
/* loaded from: classes.dex */
final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f51361b = Pattern.compile("\\s+");

    /* renamed from: c, reason: collision with root package name */
    public static final H1<String> f51362c = H1.I("auto", "none");

    /* renamed from: d, reason: collision with root package name */
    public static final H1<String> f51363d = H1.K("dot", "sesame", "circle");

    /* renamed from: e, reason: collision with root package name */
    public static final H1<String> f51364e = H1.I("filled", "open");

    /* renamed from: f, reason: collision with root package name */
    public static final H1<String> f51365f = H1.K("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f51366a;

    /* compiled from: TextEmphasis.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public b(int i12, int i13, int i14) {
        this.f51366a = i12;
    }
}
