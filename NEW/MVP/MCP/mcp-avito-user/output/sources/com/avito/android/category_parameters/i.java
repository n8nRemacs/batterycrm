package com.avito.android.category_parameters;

import androidx.compose.runtime.internal.P;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultipleSelectListener.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/i;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Collection<Ij.b> f117645a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f117646b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Collection<com.avito.android.items.a> f117647c;

    public i(@Y61.k Collection collection, @Y61.k LinkedHashMap linkedHashMap, @Y61.k Collection collection2) {
        this.f117645a = collection;
        this.f117646b = linkedHashMap;
        this.f117647c = collection2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f117645a, iVar.f117645a) && this.f117646b.equals(iVar.f117646b) && L.f(this.f117647c, iVar.f117647c);
    }

    public final int hashCode() {
        return this.f117647c.hashCode() + ((this.f117646b.hashCode() + (this.f117645a.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "MultipleSelection(selectsInfos=" + this.f117645a + ", multiSelectsIdsToInfos=" + this.f117646b + ", inputsInfos=" + this.f117647c + ')';
    }
}
