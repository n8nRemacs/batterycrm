package com.avito.android.ai_assistant.adapter.simple_snippet;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SimpleSnippetItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/simple_snippet/c;", "Lcom/avito/android/ai_assistant/adapter/a;", "a", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class c implements com.avito.android.ai_assistant.adapter.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f88878b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalImage f88879c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<a> f88880d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f88881e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f88882f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f88883g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f88884h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final AttributedText f88885i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f88886j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final DeepLink f88887k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f88888l;

    public c(@k String str, @l UniversalImage universalImage, @k List<a> list, @l AttributedText attributedText, @k String str2, @k String str3, @k String str4, @k AttributedText attributedText2, boolean z12, @k DeepLink deepLink, @k String str5) {
        this.f88878b = str;
        this.f88879c = universalImage;
        this.f88880d = list;
        this.f88881e = attributedText;
        this.f88882f = str2;
        this.f88883g = str3;
        this.f88884h = str4;
        this.f88885i = attributedText2;
        this.f88886j = z12;
        this.f88887k = deepLink;
        this.f88888l = str5;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f88878b, cVar.f88878b) && L.f(this.f88879c, cVar.f88879c) && L.f(this.f88880d, cVar.f88880d) && L.f(this.f88881e, cVar.f88881e) && L.f(this.f88882f, cVar.f88882f) && L.f(this.f88883g, cVar.f88883g) && L.f(this.f88884h, cVar.f88884h) && L.f(this.f88885i, cVar.f88885i) && this.f88886j == cVar.f88886j && L.f(this.f88887k, cVar.f88887k) && L.f(this.f88888l, cVar.f88888l);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF88878b() {
        return this.f88878b;
    }

    public final int hashCode() {
        int iHashCode = this.f88878b.hashCode() * 31;
        UniversalImage universalImage = this.f88879c;
        int iE2 = H.e((iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31, this.f88880d);
        AttributedText attributedText = this.f88881e;
        return this.f88888l.hashCode() + com.avito.android.actions_sheet.a.e(this.f88887k, r.i(com.avito.android.actions_sheet.a.b(H.d(H.d(H.d((iE2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31, 31, this.f88882f), 31, this.f88883g), 31, this.f88884h), 31, this.f88885i), 31, this.f88886j), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleSnippetItem(stringId=");
        sb2.append(this.f88878b);
        sb2.append(", image=");
        sb2.append(this.f88879c);
        sb2.append(", badges=");
        sb2.append(this.f88880d);
        sb2.append(", price=");
        sb2.append(this.f88881e);
        sb2.append(", oldPrice=");
        sb2.append(this.f88882f);
        sb2.append(", discountRate=");
        sb2.append(this.f88883g);
        sb2.append(", title=");
        sb2.append(this.f88884h);
        sb2.append(", additionalInfo=");
        sb2.append(this.f88885i);
        sb2.append(", isFavorite=");
        sb2.append(this.f88886j);
        sb2.append(", deeplink=");
        sb2.append(this.f88887k);
        sb2.append(", itemId=");
        return C22026a.c(sb2, this.f88888l, ')');
    }

    /* compiled from: SimpleSnippetItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/simple_snippet/c$a;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f88889a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f88890b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f88891c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DockingBadgeEdgeType f88892d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final DockingBadgeEdgeType f88893e;

        public a(@k String str, @l Integer num, @l Integer num2, @l DockingBadgeEdgeType dockingBadgeEdgeType, @k DockingBadgeEdgeType dockingBadgeEdgeType2) {
            this.f88889a = str;
            this.f88890b = num;
            this.f88891c = num2;
            this.f88892d = dockingBadgeEdgeType;
            this.f88893e = dockingBadgeEdgeType2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f88889a, aVar.f88889a) && L.f(this.f88890b, aVar.f88890b) && L.f(this.f88891c, aVar.f88891c) && this.f88892d == aVar.f88892d && this.f88893e == aVar.f88893e;
        }

        public final int hashCode() {
            int iHashCode = this.f88889a.hashCode() * 31;
            Integer num = this.f88890b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f88891c;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            DockingBadgeEdgeType dockingBadgeEdgeType = this.f88892d;
            return this.f88893e.hashCode() + ((iHashCode3 + (dockingBadgeEdgeType != null ? dockingBadgeEdgeType.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            return "BadgeItem(title=" + this.f88889a + ", backgroundColorAttr=" + this.f88890b + ", textColorAttr=" + this.f88891c + ", startEdge=" + this.f88892d + ", endEdge=" + this.f88893e + ')';
        }

        public /* synthetic */ a(String str, Integer num, Integer num2, DockingBadgeEdgeType dockingBadgeEdgeType, DockingBadgeEdgeType dockingBadgeEdgeType2, int i12, C42822w c42822w) {
            this(str, num, num2, (i12 & 8) != 0 ? null : dockingBadgeEdgeType, dockingBadgeEdgeType2);
        }
    }

    public /* synthetic */ c(String str, UniversalImage universalImage, List list, AttributedText attributedText, String str2, String str3, String str4, AttributedText attributedText2, boolean z12, DeepLink deepLink, String str5, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? UUID.randomUUID().toString() : str, universalImage, list, attributedText, str2, str3, str4, attributedText2, z12, deepLink, str5);
    }
}
