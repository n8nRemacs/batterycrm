package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Settings;

/* compiled from: JsonConfiguration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/f;", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.json.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43448f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f412981a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f412982b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f412983c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f412984d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f412985e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f412986f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f412987g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f412988h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f412989i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f412990j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f412991k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f412992l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final z f412993m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f412994n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f412995o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final ClassDiscriminatorMode f412996p;

    public C43448f() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    @Y61.k
    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f412981a + ", ignoreUnknownKeys=" + this.f412982b + ", isLenient=" + this.f412983c + ", allowStructuredMapKeys=" + this.f412984d + ", prettyPrint=" + this.f412985e + ", explicitNulls=" + this.f412986f + ", prettyPrintIndent='" + this.f412987g + "', coerceInputValues=" + this.f412988h + ", useArrayPolymorphism=" + this.f412989i + ", classDiscriminator='" + this.f412990j + "', allowSpecialFloatingPointValues=" + this.f412991k + ", useAlternativeNames=" + this.f412992l + ", namingStrategy=" + this.f412993m + ", decodeEnumsCaseInsensitive=" + this.f412994n + ", allowTrailingComma=" + this.f412995o + ", classDiscriminatorMode=" + this.f412996p + ')';
    }

    public C43448f(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, @Y61.k String str, boolean z18, boolean z19, @Y61.k String str2, boolean z22, boolean z23, @Y61.l z zVar, boolean z24, boolean z25, @Y61.k ClassDiscriminatorMode classDiscriminatorMode) {
        this.f412981a = z12;
        this.f412982b = z13;
        this.f412983c = z14;
        this.f412984d = z15;
        this.f412985e = z16;
        this.f412986f = z17;
        this.f412987g = str;
        this.f412988h = z18;
        this.f412989i = z19;
        this.f412990j = str2;
        this.f412991k = z22;
        this.f412992l = z23;
        this.f412993m = zVar;
        this.f412994n = z24;
        this.f412995o = z25;
        this.f412996p = classDiscriminatorMode;
    }

    public /* synthetic */ C43448f(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, String str, boolean z18, boolean z19, String str2, boolean z22, boolean z23, z zVar, boolean z24, boolean z25, ClassDiscriminatorMode classDiscriminatorMode, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? false : z14, (i12 & 8) != 0 ? false : z15, (i12 & 16) != 0 ? false : z16, (i12 & 32) != 0 ? true : z17, (i12 & 64) != 0 ? "    " : str, (i12 & 128) != 0 ? false : z18, (i12 & 256) != 0 ? false : z19, (i12 & 512) != 0 ? "type" : str2, (i12 & 1024) != 0 ? false : z22, (i12 & 2048) == 0 ? z23 : true, (i12 & 4096) != 0 ? null : zVar, (i12 & 8192) != 0 ? false : z24, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z25, (i12 & 32768) != 0 ? ClassDiscriminatorMode.f412938c : classDiscriminatorMode);
    }
}
