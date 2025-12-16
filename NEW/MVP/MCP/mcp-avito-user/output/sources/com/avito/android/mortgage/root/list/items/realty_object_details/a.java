package com.avito.android.mortgage.root.list.items.realty_object_details;

import KZ.S;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RealtyObjectDetailsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/realty_object_details/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AttributedText f202762a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f202763b;

    /* renamed from: c, reason: collision with root package name */
    public final int f202764c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final KZ.P f202765d;

    public a(@Y61.k AttributedText attributedText, @Y61.k ArrayList arrayList, int i12, @Y61.k KZ.P p12) {
        this.f202762a = attributedText;
        this.f202763b = arrayList;
        this.f202764c = i12;
        this.f202765d = p12;
    }

    @Y61.k
    public final S a() {
        return ((DetailsBlockOption) this.f202763b.get(this.f202764c)).f202755c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f202762a, aVar.f202762a) && this.f202763b.equals(aVar.f202763b) && this.f202764c == aVar.f202764c && L.f(this.f202765d, aVar.f202765d);
    }

    public final int hashCode() {
        return this.f202765d.hashCode() + androidx.appcompat.app.r.e(this.f202764c, androidx.compose.ui.graphics.colorspace.e.g(this.f202763b, this.f202762a.hashCode() * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        return "DetailsBlock(title=" + this.f202762a + ", options=" + this.f202763b + ", selectedOptionIdx=" + this.f202764c + ", costField=" + this.f202765d + ')';
    }
}
