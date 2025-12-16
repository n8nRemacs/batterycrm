package Cp0;

import Y61.k;
import Y61.l;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectableItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCp0/e;", "Lcom/avito/conveyor_item/a;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class e implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f2697b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f2698c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f2699d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2700e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f2701f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f2702g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f2703h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f2704i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2705j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Image f2706k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final UniversalImage f2707l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Size f2708m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final Integer f2709n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final Integer f2710o;

    public e(@k String str, @k String str2, @l AttributedText attributedText, boolean z12, @l Integer num, @l DeepLink deepLink, @l String str3, @l String str4, boolean z13, @l Image image, @l UniversalImage universalImage, @l Size size, @l Integer num2, @l Integer num3) {
        this.f2697b = str;
        this.f2698c = str2;
        this.f2699d = attributedText;
        this.f2700e = z12;
        this.f2701f = num;
        this.f2702g = deepLink;
        this.f2703h = str3;
        this.f2704i = str4;
        this.f2705j = z13;
        this.f2706k = image;
        this.f2707l = universalImage;
        this.f2708m = size;
        this.f2709n = num2;
        this.f2710o = num3;
    }

    public static e a(e eVar, String str, boolean z12, int i12) {
        String str2 = (i12 & 1) != 0 ? eVar.f2697b : str;
        String str3 = eVar.f2698c;
        AttributedText attributedText = eVar.f2699d;
        boolean z13 = (i12 & 8) != 0 ? eVar.f2700e : z12;
        Integer num = eVar.f2701f;
        DeepLink deepLink = eVar.f2702g;
        String str4 = eVar.f2703h;
        String str5 = eVar.f2704i;
        boolean z14 = eVar.f2705j;
        Image image = eVar.f2706k;
        UniversalImage universalImage = eVar.f2707l;
        Size size = eVar.f2708m;
        Integer num2 = eVar.f2709n;
        Integer num3 = eVar.f2710o;
        eVar.getClass();
        return new e(str2, str3, attributedText, z13, num, deepLink, str4, str5, z14, image, universalImage, size, num2, num3);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f2697b, eVar.f2697b) && this.f2700e == eVar.f2700e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272437b() {
        return getF154234b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154234b() {
        return this.f2697b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2700e) + (this.f2697b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectableItem(stringId=");
        sb2.append(this.f2697b);
        sb2.append(", title=");
        sb2.append(this.f2698c);
        sb2.append(", subtitle=");
        sb2.append(this.f2699d);
        sb2.append(", isSelected=");
        sb2.append(this.f2700e);
        sb2.append(", color=");
        sb2.append(this.f2701f);
        sb2.append(", hintAction=");
        sb2.append(this.f2702g);
        sb2.append(", icon=");
        sb2.append(this.f2703h);
        sb2.append(", leftIcon=");
        sb2.append(this.f2704i);
        sb2.append(", isDisable=");
        sb2.append(this.f2705j);
        sb2.append(", image=");
        sb2.append(this.f2706k);
        sb2.append(", multiThemeImage=");
        sb2.append(this.f2707l);
        sb2.append(", imageSize=");
        sb2.append(this.f2708m);
        sb2.append(", fromInt=");
        sb2.append(this.f2709n);
        sb2.append(", toInt=");
        return s.j(sb2, this.f2710o, ')');
    }

    public /* synthetic */ e(String str, String str2, AttributedText attributedText, boolean z12, Integer num, DeepLink deepLink, String str3, String str4, boolean z13, Image image, UniversalImage universalImage, Size size, Integer num2, Integer num3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : attributedText, z12, (i12 & 16) != 0 ? null : num, (i12 & 32) != 0 ? null : deepLink, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? false : z13, (i12 & 512) != 0 ? null : image, (i12 & 1024) != 0 ? null : universalImage, (i12 & 2048) != 0 ? null : size, (i12 & 4096) != 0 ? null : num2, (i12 & 8192) != 0 ? null : num3);
    }
}
