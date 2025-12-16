package com.avito.android.advert.item.autoteka.teaser.uniqueData;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaUniqueDataItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/uniqueData/c;", "Lcom/avito/conveyor_item/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f73058b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f73059c;

    /* renamed from: d, reason: collision with root package name */
    public final int f73060d;

    /* renamed from: e, reason: collision with root package name */
    public final int f73061e;

    /* renamed from: f, reason: collision with root package name */
    public final int f73062f;

    /* renamed from: g, reason: collision with root package name */
    public final int f73063g;

    public c(long j12, String str, int i12, int i13, int i14, int i15, int i16, C42822w c42822w) {
        if ((i16 & 1) != 0) {
            AutotekaUniqueDataType[] autotekaUniqueDataTypeArr = AutotekaUniqueDataType.f73052b;
            j12 = 0;
        }
        str = (i16 & 2) != 0 ? String.valueOf(j12) : str;
        this.f73058b = j12;
        this.f73059c = str;
        this.f73060d = i12;
        this.f73061e = i13;
        this.f73062f = i14;
        this.f73063g = i15;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f73058b == cVar.f73058b && L.f(this.f73059c, cVar.f73059c) && this.f73060d == cVar.f73060d && this.f73061e == cVar.f73061e && this.f73062f == cVar.f73062f && this.f73063g == cVar.f73063g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF189215e() {
        return this.f73058b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270463j() {
        return this.f73059c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f73063g) + r.e(this.f73062f, r.e(this.f73061e, r.e(this.f73060d, H.d(Long.hashCode(this.f73058b) * 31, 31, this.f73059c), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutotekaUniqueDataItem(id=");
        sb2.append(this.f73058b);
        sb2.append(", stringId=");
        sb2.append(this.f73059c);
        sb2.append(", titleRes=");
        sb2.append(this.f73060d);
        sb2.append(", descriptionRes=");
        sb2.append(this.f73061e);
        sb2.append(", gradientRes=");
        sb2.append(this.f73062f);
        sb2.append(", imageRes=");
        return r.t(sb2, this.f73063g, ')');
    }
}
