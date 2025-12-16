package com.avito.android.select.variant;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalCheckedImage;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: VariantItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/variant/a;", "Lcom/avito/conveyor_item/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f266834b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f266835c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f266836d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f266837e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f266838f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f266839g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f266840h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final UniversalImage f266841i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f266842j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f266843k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f266844l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f266845m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f266846n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f266847o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f266848p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f266849q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final Size f266850r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f266851s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final UniversalCheckedImage f266852t;

    public a(@k String str, @k String str2, @l String str3, @l Image image, @l Integer num, @l String str4, @l String str5, @l UniversalImage universalImage, boolean z12, @l String str6, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, @l Size size, boolean z19, @l UniversalCheckedImage universalCheckedImage) {
        this.f266834b = str;
        this.f266835c = str2;
        this.f266836d = str3;
        this.f266837e = image;
        this.f266838f = num;
        this.f266839g = str4;
        this.f266840h = str5;
        this.f266841i = universalImage;
        this.f266842j = z12;
        this.f266843k = str6;
        this.f266844l = z13;
        this.f266845m = z14;
        this.f266846n = z15;
        this.f266847o = z16;
        this.f266848p = z17;
        this.f266849q = z18;
        this.f266850r = size;
        this.f266851s = z19;
        this.f266852t = universalCheckedImage;
    }

    public static a a(a aVar, String str, boolean z12, int i12) {
        String str2 = aVar.f266834b;
        String str3 = aVar.f266835c;
        String str4 = (i12 & 4) != 0 ? aVar.f266836d : str;
        Image image = aVar.f266837e;
        Integer num = aVar.f266838f;
        String str5 = aVar.f266839g;
        String str6 = aVar.f266840h;
        UniversalImage universalImage = aVar.f266841i;
        boolean z13 = (i12 & 256) != 0 ? aVar.f266842j : z12;
        String str7 = aVar.f266843k;
        boolean z14 = aVar.f266844l;
        boolean z15 = aVar.f266845m;
        boolean z16 = aVar.f266846n;
        boolean z17 = aVar.f266847o;
        boolean z18 = aVar.f266848p;
        boolean z19 = aVar.f266849q;
        Size size = aVar.f266850r;
        boolean z22 = aVar.f266851s;
        UniversalCheckedImage universalCheckedImage = aVar.f266852t;
        aVar.getClass();
        return new a(str2, str3, str4, image, num, str5, str6, universalImage, z13, str7, z14, z15, z16, z17, z18, z19, size, z22, universalCheckedImage);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f266834b, aVar.f266834b) && L.f(this.f266835c, aVar.f266835c) && L.f(this.f266836d, aVar.f266836d) && L.f(this.f266837e, aVar.f266837e) && L.f(this.f266838f, aVar.f266838f) && L.f(this.f266839g, aVar.f266839g) && L.f(this.f266840h, aVar.f266840h) && L.f(this.f266841i, aVar.f266841i) && this.f266842j == aVar.f266842j && L.f(this.f266843k, aVar.f266843k) && this.f266844l == aVar.f266844l && this.f266845m == aVar.f266845m && this.f266846n == aVar.f266846n && this.f266847o == aVar.f266847o && this.f266848p == aVar.f266848p && this.f266849q == aVar.f266849q && L.f(this.f266850r, aVar.f266850r) && this.f266851s == aVar.f266851s && L.f(this.f266852t, aVar.f266852t);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124042b() {
        return getF262960b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF262960b() {
        return this.f266834b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f266834b.hashCode() * 31, 31, this.f266835c);
        String str = this.f266836d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.f266837e;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Integer num = this.f266838f;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f266839g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f266840h;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UniversalImage universalImage = this.f266841i;
        int i12 = r.i((iHashCode5 + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31, this.f266842j);
        String str4 = this.f266843k;
        int i13 = r.i(r.i(r.i(r.i(r.i(r.i((i12 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f266844l), 31, this.f266845m), 31, this.f266846n), 31, this.f266847o), 31, this.f266848p), 31, this.f266849q);
        Size size = this.f266850r;
        int i14 = r.i((i13 + (size == null ? 0 : size.hashCode())) * 31, 31, this.f266851s);
        UniversalCheckedImage universalCheckedImage = this.f266852t;
        return i14 + (universalCheckedImage != null ? universalCheckedImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "VariantItem(stringId=" + this.f266834b + ", title=" + this.f266835c + ", subtitle=" + this.f266836d + ", image=" + this.f266837e + ", color=" + this.f266838f + ", icon=" + this.f266839g + ", leftIcon=" + this.f266840h + ", universalImage=" + this.f266841i + ", selected=" + this.f266842j + ", sectionTitle=" + this.f266843k + ", isMultiselect=" + this.f266844l + ", withImage=" + this.f266845m + ", isSubitem=" + this.f266846n + ", isEnable=" + this.f266847o + ", withImageRight=" + this.f266848p + ", withImageLeft=" + this.f266849q + ", imageSize=" + this.f266850r + ", withCandyImage=" + this.f266851s + ", universalCheckedImage=" + this.f266852t + ')';
    }

    public /* synthetic */ a(String str, String str2, String str3, Image image, Integer num, String str4, String str5, UniversalImage universalImage, boolean z12, String str6, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, Size size, boolean z19, UniversalCheckedImage universalCheckedImage, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : image, (i12 & 16) != 0 ? null : num, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : str5, (i12 & 128) != 0 ? null : universalImage, z12, (i12 & 512) != 0 ? null : str6, (i12 & 1024) != 0 ? false : z13, (i12 & 2048) != 0 ? false : z14, (i12 & 4096) != 0 ? false : z15, (i12 & 8192) != 0 ? true : z16, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z17, (32768 & i12) != 0 ? false : z18, (65536 & i12) != 0 ? null : size, (131072 & i12) != 0 ? false : z19, (i12 & 262144) != 0 ? null : universalCheckedImage);
    }
}
