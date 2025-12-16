package com.avito.android.vas_union.remote.model;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;
import tM0.f;

/* compiled from: VasUnionV2Result.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001:\u00010Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b(\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b)\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/avito/android/vas_union/remote/model/VasPerformanceItem;", "", "", "slug", "Lcom/avito/android/vas_union/remote/model/VasPerformanceItem$Type;", "type", "", "selected", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "price", "oldPrice", "LtM0/f;", "discount", "Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "bblContacts", "<init>", "(Ljava/lang/String;Lcom/avito/android/vas_union/remote/model/VasPerformanceItem$Type;ZLcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;LtM0/f;Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;)V", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Lcom/avito/android/vas_union/remote/model/VasPerformanceItem$Type;", "i", "()Lcom/avito/android/vas_union/remote/model/VasPerformanceItem$Type;", "Z", "f", "()Z", "Lcom/avito/android/remote/model/text/AttributedText;", "h", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/UniversalImage;", "c", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/deep_linking/links/DeepLink;", "j", "()Lcom/avito/android/deep_linking/links/DeepLink;", "e", "d", "LtM0/f;", "b", "()LtM0/f;", "Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "a", "()Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "Type", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VasPerformanceItem {

    @c("bblContacts")
    @l
    private final MnzFloatingFooterContact bblContacts;

    @c("discount")
    @l
    private final f discount;

    @c("icon")
    @l
    private final UniversalImage icon;

    @c("oldPrice")
    @l
    private final AttributedText oldPrice;

    @c("price")
    @k
    private final AttributedText price;

    @c("selected")
    private final boolean selected;

    @c("slug")
    @k
    private final String slug;

    @c("title")
    @k
    private final AttributedText title;

    @c("type")
    @k
    private final Type type;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VasUnionV2Result.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_union/remote/model/VasPerformanceItem$Type;", "", "(Ljava/lang/String;I)V", "CLICK", "SELECT", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("click")
        public static final Type CLICK;

        @c("select")
        public static final Type SELECT;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f323240b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f323241c;

        static {
            Type type = new Type("CLICK", 0);
            CLICK = type;
            Type type2 = new Type("SELECT", 1);
            SELECT = type2;
            Type[] typeArr = {type, type2};
            f323240b = typeArr;
            f323241c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f323240b.clone();
        }
    }

    public VasPerformanceItem(@k String str, @k Type type, boolean z12, @k AttributedText attributedText, @l UniversalImage universalImage, @l DeepLink deepLink, @k AttributedText attributedText2, @l AttributedText attributedText3, @l f fVar, @l MnzFloatingFooterContact mnzFloatingFooterContact) {
        this.slug = str;
        this.type = type;
        this.selected = z12;
        this.title = attributedText;
        this.icon = universalImage;
        this.uri = deepLink;
        this.price = attributedText2;
        this.oldPrice = attributedText3;
        this.discount = fVar;
        this.bblContacts = mnzFloatingFooterContact;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final MnzFloatingFooterContact getBblContacts() {
        return this.bblContacts;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final f getDiscount() {
        return this.discount;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getOldPrice() {
        return this.oldPrice;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getPrice() {
        return this.price;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VasPerformanceItem)) {
            return false;
        }
        VasPerformanceItem vasPerformanceItem = (VasPerformanceItem) obj;
        return L.f(this.slug, vasPerformanceItem.slug) && this.type == vasPerformanceItem.type && this.selected == vasPerformanceItem.selected && L.f(this.title, vasPerformanceItem.title) && L.f(this.icon, vasPerformanceItem.icon) && L.f(this.uri, vasPerformanceItem.uri) && L.f(this.price, vasPerformanceItem.price) && L.f(this.oldPrice, vasPerformanceItem.oldPrice) && L.f(this.discount, vasPerformanceItem.discount) && L.f(this.bblContacts, vasPerformanceItem.bblContacts);
    }

    /* renamed from: f, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(r.i((this.type.hashCode() + (this.slug.hashCode() * 31)) * 31, 31, this.selected), 31, this.title);
        UniversalImage universalImage = this.icon;
        int iHashCode = (iB2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        DeepLink deepLink = this.uri;
        int iB3 = com.avito.android.actions_sheet.a.b((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.price);
        AttributedText attributedText = this.oldPrice;
        int iHashCode2 = (iB3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        f fVar = this.discount;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        MnzFloatingFooterContact mnzFloatingFooterContact = this.bblContacts;
        return iHashCode3 + (mnzFloatingFooterContact != null ? mnzFloatingFooterContact.hashCode() : 0);
    }

    @k
    /* renamed from: i, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    @k
    public final String toString() {
        return "VasPerformanceItem(slug=" + this.slug + ", type=" + this.type + ", selected=" + this.selected + ", title=" + this.title + ", icon=" + this.icon + ", uri=" + this.uri + ", price=" + this.price + ", oldPrice=" + this.oldPrice + ", discount=" + this.discount + ", bblContacts=" + this.bblContacts + ')';
    }
}
