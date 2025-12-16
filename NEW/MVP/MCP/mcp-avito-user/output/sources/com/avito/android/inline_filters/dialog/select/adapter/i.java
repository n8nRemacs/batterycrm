package com.avito.android.inline_filters.dialog.select.adapter;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalCheckedImage;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.search.Filter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: InlineFiltersDialogItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/i;", "Lcom/avito/conveyor_item/a;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class i implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f172091b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f172092c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f172093d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f172094e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InlineItemType f172095f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f172096g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f172097h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f172098i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Image f172099j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Drawable f172100k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Boolean f172101l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final DeepLink f172102m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final DeepLink f172103n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final UniversalCheckedImage f172104o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final String f172105p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f172106q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final List<UniversalColor> f172107r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final Filter.InnerOptions.Display.Link f172108s;

    public i(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12, @Y61.k InlineItemType inlineItemType, @Y61.l String str4, boolean z13, @Y61.l UniversalImage universalImage, @Y61.l Image image, @Y61.l Drawable drawable, @Y61.l Boolean bool, @Y61.l DeepLink deepLink, @Y61.l DeepLink deepLink2, @Y61.l UniversalCheckedImage universalCheckedImage, @Y61.l String str5, @Y61.l String str6, @Y61.l List<UniversalColor> list, @Y61.l Filter.InnerOptions.Display.Link link) {
        this.f172091b = str;
        this.f172092c = str2;
        this.f172093d = str3;
        this.f172094e = z12;
        this.f172095f = inlineItemType;
        this.f172096g = str4;
        this.f172097h = z13;
        this.f172098i = universalImage;
        this.f172099j = image;
        this.f172100k = drawable;
        this.f172101l = bool;
        this.f172102m = deepLink;
        this.f172103n = deepLink2;
        this.f172104o = universalCheckedImage;
        this.f172105p = str5;
        this.f172106q = str6;
        this.f172107r = list;
        this.f172108s = link;
    }

    public static i a(i iVar) {
        String str = iVar.f172091b;
        String str2 = iVar.f172092c;
        String str3 = iVar.f172093d;
        boolean z12 = iVar.f172094e;
        InlineItemType inlineItemType = iVar.f172095f;
        String str4 = iVar.f172096g;
        boolean z13 = iVar.f172097h;
        UniversalImage universalImage = iVar.f172098i;
        Image image = iVar.f172099j;
        Drawable drawable = iVar.f172100k;
        Boolean bool = iVar.f172101l;
        DeepLink deepLink = iVar.f172102m;
        DeepLink deepLink2 = iVar.f172103n;
        UniversalCheckedImage universalCheckedImage = iVar.f172104o;
        String str5 = iVar.f172105p;
        String str6 = iVar.f172106q;
        List<UniversalColor> list = iVar.f172107r;
        Filter.InnerOptions.Display.Link link = iVar.f172108s;
        iVar.getClass();
        return new i(str, str2, str3, z12, inlineItemType, str4, z13, universalImage, image, drawable, bool, deepLink, deepLink2, universalCheckedImage, str5, str6, list, link);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f172091b, iVar.f172091b) && L.f(this.f172092c, iVar.f172092c) && L.f(this.f172093d, iVar.f172093d) && this.f172094e == iVar.f172094e && this.f172095f == iVar.f172095f && L.f(this.f172096g, iVar.f172096g) && this.f172097h == iVar.f172097h && L.f(this.f172098i, iVar.f172098i) && L.f(this.f172099j, iVar.f172099j) && L.f(this.f172100k, iVar.f172100k) && L.f(this.f172101l, iVar.f172101l) && L.f(this.f172102m, iVar.f172102m) && L.f(this.f172103n, iVar.f172103n) && L.f(this.f172104o, iVar.f172104o) && L.f(this.f172105p, iVar.f172105p) && L.f(this.f172106q, iVar.f172106q) && L.f(this.f172107r, iVar.f172107r) && L.f(this.f172108s, iVar.f172108s);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return getF170863b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF170863b() {
        return this.f172091b;
    }

    public final int hashCode() {
        int iHashCode = (this.f172095f.hashCode() + androidx.appcompat.app.r.i(H.d(H.d(this.f172091b.hashCode() * 31, 31, this.f172092c), 31, this.f172093d), 31, this.f172094e)) * 31;
        String str = this.f172096g;
        int i12 = androidx.appcompat.app.r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f172097h);
        UniversalImage universalImage = this.f172098i;
        int iHashCode2 = (i12 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        Image image = this.f172099j;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Drawable drawable = this.f172100k;
        int iHashCode4 = (iHashCode3 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Boolean bool = this.f172101l;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        DeepLink deepLink = this.f172102m;
        int iHashCode6 = (iHashCode5 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.f172103n;
        int iHashCode7 = (iHashCode6 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        UniversalCheckedImage universalCheckedImage = this.f172104o;
        int iHashCode8 = (iHashCode7 + (universalCheckedImage == null ? 0 : universalCheckedImage.hashCode())) * 31;
        String str2 = this.f172105p;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f172106q;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<UniversalColor> list = this.f172107r;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Filter.InnerOptions.Display.Link link = this.f172108s;
        return iHashCode11 + (link != null ? link.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "InlineFiltersDialogItem(stringId=" + this.f172091b + ", filterId=" + this.f172092c + ", text=" + this.f172093d + ", checked=" + this.f172094e + ", itemType=" + this.f172095f + ", secondaryText=" + this.f172096g + ", isIntValue=" + this.f172097h + ", universalImage=" + this.f172098i + ", image=" + this.f172099j + ", icon=" + this.f172100k + ", withImageLeft=" + this.f172101l + ", deepLink=" + this.f172102m + ", iconDeepLink=" + this.f172103n + ", checkableImage=" + this.f172104o + ", candyIcon=" + this.f172105p + ", brandspaceIcon=" + this.f172106q + ", gradientColors=" + this.f172107r + ", link=" + this.f172108s + ')';
    }

    public /* synthetic */ i(String str, String str2, String str3, boolean z12, InlineItemType inlineItemType, String str4, boolean z13, UniversalImage universalImage, Image image, Drawable drawable, Boolean bool, DeepLink deepLink, DeepLink deepLink2, UniversalCheckedImage universalCheckedImage, String str5, String str6, List list, Filter.InnerOptions.Display.Link link, int i12, C42822w c42822w) {
        this(str, str2, str3, z12, inlineItemType, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? null : universalImage, (i12 & 256) != 0 ? null : image, (i12 & 512) != 0 ? null : drawable, (i12 & 1024) != 0 ? null : bool, (i12 & 2048) != 0 ? null : deepLink, (i12 & 4096) != 0 ? null : deepLink2, (i12 & 8192) != 0 ? null : universalCheckedImage, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str5, (32768 & i12) != 0 ? null : str6, (65536 & i12) != 0 ? null : list, (i12 & 131072) != 0 ? null : link);
    }
}
