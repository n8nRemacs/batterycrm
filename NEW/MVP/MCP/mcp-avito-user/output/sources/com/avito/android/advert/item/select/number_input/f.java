package com.avito.android.advert.item.select.number_input;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectNumberInput.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/select/number_input/f;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f79521a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f79522b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f79523c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AutoSelectNumberInputButtonParams f79524d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f79525e;

    public f(@k String str, boolean z12, @k String str2, @k AutoSelectNumberInputButtonParams autoSelectNumberInputButtonParams, @k AttributedText attributedText) {
        this.f79521a = str;
        this.f79522b = z12;
        this.f79523c = str2;
        this.f79524d = autoSelectNumberInputButtonParams;
        this.f79525e = attributedText;
    }

    public static f a(f fVar, String str, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            str = fVar.f79521a;
        }
        fVar.getClass();
        String str2 = fVar.f79523c;
        AutoSelectNumberInputButtonParams autoSelectNumberInputButtonParams = fVar.f79524d;
        AttributedText attributedText = fVar.f79525e;
        fVar.getClass();
        return new f(str, z12, str2, autoSelectNumberInputButtonParams, attributedText);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f79521a, fVar.f79521a) && this.f79522b == fVar.f79522b && L.f(this.f79523c, fVar.f79523c) && L.f(this.f79524d, fVar.f79524d) && L.f(this.f79525e, fVar.f79525e);
    }

    public final int hashCode() {
        return this.f79525e.hashCode() + ((this.f79524d.hashCode() + H.d(r.i(r.i(this.f79521a.hashCode() * 31, 31, false), 31, this.f79522b), 31, this.f79523c)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectNumberInputState(phone=");
        sb2.append(this.f79521a);
        sb2.append(", isLoading=false, isError=");
        sb2.append(this.f79522b);
        sb2.append(", inputTitle=");
        sb2.append(this.f79523c);
        sb2.append(", submitButton=");
        sb2.append(this.f79524d);
        sb2.append(", disclaimer=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f79525e, ')');
    }
}
