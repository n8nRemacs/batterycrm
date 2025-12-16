package com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SettingView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/setting/c;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f135406a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f135407b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f135408c;

    public c() {
        this(null, null, false, 7, null);
    }

    public static c a(c cVar) {
        String str = cVar.f135406a;
        String str2 = cVar.f135407b;
        cVar.getClass();
        return new c(str, str2, false);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f135406a, cVar.f135406a) && L.f(this.f135407b, cVar.f135407b) && this.f135408c == cVar.f135408c;
    }

    public final int hashCode() {
        int iHashCode = this.f135406a.hashCode() * 31;
        String str = this.f135407b;
        return Boolean.hashCode(this.f135408c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SettingInputState(inputValue=");
        sb2.append(this.f135406a);
        sb2.append(", errorMessage=");
        sb2.append(this.f135407b);
        sb2.append(", isEditable=");
        return r.x(sb2, this.f135408c, ')');
    }

    public c(@Y61.k String str, @Y61.l String str2, boolean z12) {
        this.f135406a = str;
        this.f135407b = str2;
        this.f135408c = z12;
    }

    public /* synthetic */ c(String str, String str2, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? false : z12);
    }
}
