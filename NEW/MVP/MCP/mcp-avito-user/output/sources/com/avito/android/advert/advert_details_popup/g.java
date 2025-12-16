package com.avito.android.advert.advert_details_popup;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PopupUIItemInfo.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/advert_details_popup/g;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f68626a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PrintableText f68627b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f68628c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f68629d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f68630e;

    /* compiled from: PopupUIItemInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/advert_details_popup/g$a;", "", "<init>", "()V", "", "POPUP_COMPARISON_ICON_ADD", "Ljava/lang/String;", "POPUP_COMPARISON_ICON_ADDED", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public g(String str, PrintableText printableText, f fVar, String str2, DeepLink deepLink, int i12, C42822w c42822w) {
        str2 = (i12 & 8) != 0 ? null : str2;
        deepLink = (i12 & 16) != 0 ? null : deepLink;
        this.f68626a = str;
        this.f68627b = printableText;
        this.f68628c = fVar;
        this.f68629d = str2;
        this.f68630e = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f68626a, gVar.f68626a) && L.f(this.f68627b, gVar.f68627b) && L.f(this.f68628c, gVar.f68628c) && L.f(this.f68629d, gVar.f68629d) && L.f(this.f68630e, gVar.f68630e);
    }

    public final int hashCode() {
        String str = this.f68626a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PrintableText printableText = this.f68627b;
        int iHashCode2 = (this.f68628c.hashCode() + ((iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31)) * 31;
        String str2 = this.f68629d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.f68630e;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PopupUIItemInfo(textIconName=");
        sb2.append(this.f68626a);
        sb2.append(", text=");
        sb2.append(this.f68627b);
        sb2.append(", type=");
        sb2.append(this.f68628c);
        sb2.append(", toastWarning=");
        sb2.append(this.f68629d);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f68630e, ')');
    }
}
