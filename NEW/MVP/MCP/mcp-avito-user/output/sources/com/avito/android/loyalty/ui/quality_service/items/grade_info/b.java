package com.avito.android.loyalty.ui.quality_service.items.grade_info;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.loyalty.ui.quality_service.items.Content;
import com.avito.android.loyalty.ui.quality_service.items.grade_info.advice.AdviceItem;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GradeInfoItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/grade_info/b;", "Lcom/avito/conveyor_item/a;", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183885b;

    /* renamed from: c, reason: collision with root package name */
    public final int f183886c;

    /* renamed from: d, reason: collision with root package name */
    public final int f183887d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f183888e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f183889f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f183890g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<AdviceItem> f183891h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final a f183892i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f183893j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final a f183894k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final AttributedText f183895l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f183896m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final Content f183897n;

    /* compiled from: GradeInfoItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/grade_info/b$a;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f183898a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f183899b;

        public a(@k String str, @l DeepLink deepLink) {
            this.f183898a = str;
            this.f183899b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f183898a, aVar.f183898a) && L.f(this.f183899b, aVar.f183899b);
        }

        public final int hashCode() {
            int iHashCode = this.f183898a.hashCode() * 31;
            DeepLink deepLink = this.f183899b;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.f183898a);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f183899b, ')');
        }
    }

    public b() {
        throw null;
    }

    public b(String str, int i12, int i13, AttributedText attributedText, String str2, AttributedText attributedText2, List list, a aVar, String str3, a aVar2, AttributedText attributedText3, boolean z12, Content content, int i14, C42822w c42822w) {
        this.f183885b = (i14 & 1) != 0 ? UUID.randomUUID().toString() : str;
        this.f183886c = i12;
        this.f183887d = i13;
        this.f183888e = attributedText;
        this.f183889f = str2;
        this.f183890g = attributedText2;
        this.f183891h = list;
        this.f183892i = aVar;
        this.f183893j = str3;
        this.f183894k = aVar2;
        this.f183895l = attributedText3;
        this.f183896m = z12;
        this.f183897n = content;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f183885b, bVar.f183885b) && this.f183886c == bVar.f183886c && this.f183887d == bVar.f183887d && L.f(this.f183888e, bVar.f183888e) && L.f(this.f183889f, bVar.f183889f) && L.f(this.f183890g, bVar.f183890g) && L.f(this.f183891h, bVar.f183891h) && L.f(this.f183892i, bVar.f183892i) && L.f(this.f183893j, bVar.f183893j) && L.f(this.f183894k, bVar.f183894k) && L.f(this.f183895l, bVar.f183895l) && this.f183896m == bVar.f183896m && L.f(this.f183897n, bVar.f183897n);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF139156b() {
        return getF184093b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF184093b() {
        return this.f183885b;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f183887d, r.e(this.f183886c, this.f183885b.hashCode() * 31, 31), 31);
        AttributedText attributedText = this.f183888e;
        int iHashCode = (iE2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str = this.f183889f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText2 = this.f183890g;
        int iE3 = H.e((iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31, 31, this.f183891h);
        a aVar = this.f183892i;
        int iHashCode3 = (iE3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f183893j;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar2 = this.f183894k;
        int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        AttributedText attributedText3 = this.f183895l;
        int i12 = r.i((iHashCode5 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31, 31, this.f183896m);
        Content content = this.f183897n;
        return i12 + (content != null ? content.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "GradeInfoItem(stringId=" + this.f183885b + ", progress=" + this.f183886c + ", greenThreshold=" + this.f183887d + ", progressHint=" + this.f183888e + ", descriptionTitle=" + this.f183889f + ", description=" + this.f183890g + ", advices=" + this.f183891h + ", action=" + this.f183892i + ", advicesTitle=" + this.f183893j + ", advicesCounter=" + this.f183894k + ", advicesSubTitle=" + this.f183895l + ", isRed=" + this.f183896m + ", popup=" + this.f183897n + ')';
    }
}
