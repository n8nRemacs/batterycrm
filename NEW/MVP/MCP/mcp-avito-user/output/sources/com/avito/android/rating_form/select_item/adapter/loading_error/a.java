package com.avito.android.rating_form.select_item.adapter.loading_error;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LoadingErrorItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/select_item/adapter/loading_error/a;", "Lcom/avito/conveyor_item/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f248946b;

    public a() {
        this(null, 1, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f248946b, ((a) obj).f248946b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return getF248946b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF248579b() {
        return this.f248946b;
    }

    public final int hashCode() {
        return this.f248946b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("LoadingErrorItem(stringId="), this.f248946b, ')');
    }

    public a(String str, int i12, C42822w c42822w) {
        this.f248946b = (i12 & 1) != 0 ? "loading_error_item" : str;
    }
}
