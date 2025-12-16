package kotlin.text;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import kotlin.Metadata;

/* compiled from: Charsets.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/text/d;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.text.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43047d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C43047d f410588a = new C43047d();

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final Charset f410589b = Charset.forName(Constants.ENCODING);

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final Charset f410590c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final Charset f410591d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final Charset f410592e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public static volatile Charset f410593f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public static volatile Charset f410594g;

    static {
        Charset.forName("UTF-16");
        f410590c = Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        f410591d = Charset.forName("US-ASCII");
        f410592e = Charset.forName("ISO-8859-1");
    }
}
