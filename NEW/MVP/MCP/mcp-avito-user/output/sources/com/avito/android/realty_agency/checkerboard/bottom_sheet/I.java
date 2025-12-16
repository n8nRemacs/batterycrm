package com.avito.android.realty_agency.checkerboard.bottom_sheet;

import androidx.compose.ui.text.C22602e;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: LotItemPreviewBottomSheet.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/bottom_sheet/I;", "", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class I {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Long f250952a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Image f250953b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f250954c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f250955d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f250956e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f250957f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final C22602e f250958g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f250959h;

    public I(@Y61.l Long l12, @Y61.l Image image, boolean z12, @Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l C22602e c22602e, boolean z13) {
        this.f250952a = l12;
        this.f250953b = image;
        this.f250954c = z12;
        this.f250955d = str;
        this.f250956e = str2;
        this.f250957f = str3;
        this.f250958g = c22602e;
        this.f250959h = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i12 = (I) obj;
        return kotlin.jvm.internal.L.f(this.f250952a, i12.f250952a) && kotlin.jvm.internal.L.f(this.f250953b, i12.f250953b) && this.f250954c == i12.f250954c && kotlin.jvm.internal.L.f(this.f250955d, i12.f250955d) && kotlin.jvm.internal.L.f(this.f250956e, i12.f250956e) && kotlin.jvm.internal.L.f(this.f250957f, i12.f250957f) && kotlin.jvm.internal.L.f(this.f250958g, i12.f250958g) && this.f250959h == i12.f250959h;
    }

    public final int hashCode() {
        Long l12 = this.f250952a;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        Image image = this.f250953b;
        int iD2 = androidx.compose.foundation.H.d(androidx.appcompat.app.r.i((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f250954c), 31, this.f250955d);
        String str = this.f250956e;
        int iD3 = androidx.compose.foundation.H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f250957f);
        C22602e c22602e = this.f250958g;
        return Boolean.hashCode(this.f250959h) + ((iD3 + (c22602e != null ? c22602e.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LotItemPreviewData(lotId=");
        sb2.append(this.f250952a);
        sb2.append(", image=");
        sb2.append(this.f250953b);
        sb2.append(", isImageSemiTransparent=");
        sb2.append(this.f250954c);
        sb2.append(", fullPrice=");
        sb2.append(this.f250955d);
        sb2.append(", pricePerMeter=");
        sb2.append(this.f250956e);
        sb2.append(", additionalInfo=");
        sb2.append(this.f250957f);
        sb2.append(", agentCommission=");
        sb2.append((Object) this.f250958g);
        sb2.append(", showActionButtons=");
        return androidx.appcompat.app.r.x(sb2, this.f250959h, ')');
    }
}
