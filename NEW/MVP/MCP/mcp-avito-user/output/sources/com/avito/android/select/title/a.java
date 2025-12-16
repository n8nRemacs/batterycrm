package com.avito.android.select.title;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TitleItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/title/a;", "Lcom/avito/conveyor_item/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f266814b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f266815c;

    public a(@k String str) {
        this.f266814b = str;
        this.f266815c = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f266814b, ((a) obj).f266814b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return getF266318b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266318b() {
        return this.f266815c;
    }

    public final int hashCode() {
        return this.f266814b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("TitleItem(title="), this.f266814b, ')');
    }
}
