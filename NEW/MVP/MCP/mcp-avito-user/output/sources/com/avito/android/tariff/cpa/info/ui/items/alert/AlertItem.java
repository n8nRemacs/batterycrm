package com.avito.android.tariff.cpa.info.ui.items.alert;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AlertItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/alert/AlertItem;", "Lcom/avito/conveyor_item/a;", "CornersStyle", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AlertItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f294787b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f294788c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f294789d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f294790e;

    /* renamed from: f, reason: collision with root package name */
    public final int f294791f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final CornersStyle f294792g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ArrayList f294793h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AlertItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/alert/AlertItem$CornersStyle;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CornersStyle {

        /* renamed from: b, reason: collision with root package name */
        public static final CornersStyle f294794b;

        /* renamed from: c, reason: collision with root package name */
        public static final CornersStyle f294795c;

        /* renamed from: d, reason: collision with root package name */
        public static final CornersStyle f294796d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ CornersStyle[] f294797e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f294798f;

        static {
            CornersStyle cornersStyle = new CornersStyle("TOP_ROUNDED", 0);
            f294794b = cornersStyle;
            CornersStyle cornersStyle2 = new CornersStyle("BOTTOM_ROUNDED", 1);
            f294795c = cornersStyle2;
            CornersStyle cornersStyle3 = new CornersStyle("ROUNDED", 2);
            f294796d = cornersStyle3;
            CornersStyle[] cornersStyleArr = {cornersStyle, cornersStyle2, cornersStyle3};
            f294797e = cornersStyleArr;
            f294798f = kotlin.enums.c.a(cornersStyleArr);
        }

        public CornersStyle() {
            throw null;
        }

        public static CornersStyle valueOf(String str) {
            return (CornersStyle) Enum.valueOf(CornersStyle.class, str);
        }

        public static CornersStyle[] values() {
            return (CornersStyle[]) f294797e.clone();
        }
    }

    public AlertItem(@k String str, @l String str2, @l AttributedText attributedText, @InterfaceC42150f @l Integer num, @InterfaceC42150f int i12, @k CornersStyle cornersStyle, @l ArrayList arrayList) {
        this.f294787b = str;
        this.f294788c = str2;
        this.f294789d = attributedText;
        this.f294790e = num;
        this.f294791f = i12;
        this.f294792g = cornersStyle;
        this.f294793h = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertItem)) {
            return false;
        }
        AlertItem alertItem = (AlertItem) obj;
        return this.f294787b.equals(alertItem.f294787b) && L.f(this.f294788c, alertItem.f294788c) && L.f(this.f294789d, alertItem.f294789d) && L.f(this.f294790e, alertItem.f294790e) && this.f294791f == alertItem.f294791f && this.f294792g == alertItem.f294792g && L.f(this.f294793h, alertItem.f294793h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return getF289386b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF289386b() {
        return this.f294787b;
    }

    public final int hashCode() {
        int iHashCode = this.f294787b.hashCode() * 31;
        String str = this.f294788c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f294789d;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Integer num = this.f294790e;
        int iHashCode4 = (this.f294792g.hashCode() + r.e(this.f294791f, (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31)) * 31;
        ArrayList arrayList = this.f294793h;
        return iHashCode4 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AlertItem(stringId=");
        sb2.append(this.f294787b);
        sb2.append(", title=");
        sb2.append((Object) this.f294788c);
        sb2.append(", description=");
        sb2.append(this.f294789d);
        sb2.append(", icon=");
        sb2.append(this.f294790e);
        sb2.append(", styleAttr=");
        sb2.append(this.f294791f);
        sb2.append(", cornersStyle=");
        sb2.append(this.f294792g);
        sb2.append(", actions=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f294793h, ')');
    }
}
