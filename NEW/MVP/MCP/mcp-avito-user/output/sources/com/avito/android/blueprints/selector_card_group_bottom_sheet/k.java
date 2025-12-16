package com.avito.android.blueprints.selector_card_group_bottom_sheet;

import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectorCardGroupBottomSheetParams.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/selector_card_group_bottom_sheet/k;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f106704a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f106705b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f106706c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f106707d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ArrayList f106708e;

    public k(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l ArrayList arrayList) {
        this.f106704a = str;
        this.f106705b = str2;
        this.f106706c = str3;
        this.f106707d = str4;
        this.f106708e = arrayList;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f106704a, kVar.f106704a) && L.f(this.f106705b, kVar.f106705b) && L.f(this.f106706c, kVar.f106706c) && L.f(this.f106707d, kVar.f106707d) && this.f106708e.equals(kVar.f106708e);
    }

    public final int hashCode() {
        int iHashCode = this.f106704a.hashCode() * 31;
        String str = this.f106705b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f106706c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f106707d;
        return this.f106708e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectorCardGroupBottomSheetParams(requestId=");
        sb2.append(this.f106704a);
        sb2.append(", headerTitle=");
        sb2.append(this.f106705b);
        sb2.append(", clearButtonTitle=");
        sb2.append(this.f106706c);
        sb2.append(", selectButtonTitle=");
        sb2.append(this.f106707d);
        sb2.append(", items=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f106708e, ')');
    }
}
