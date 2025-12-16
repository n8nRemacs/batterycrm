package com.avito.android.bundles;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Action;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasBundlesConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/f;", "", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f108324a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Action f108325b;

    public f(@k ArrayList arrayList, @l Action action) {
        this.f108324a = arrayList;
        this.f108325b = action;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f108324a.equals(fVar.f108324a) && L.f(this.f108325b, fVar.f108325b);
    }

    public final int hashCode() {
        int iHashCode = this.f108324a.hashCode() * 31;
        Action action = this.f108325b;
        return iHashCode + (action == null ? 0 : action.hashCode());
    }

    @k
    public final String toString() {
        return "VasBundlesScreenContent(bundles=" + this.f108324a + ", floatingEmptyAction=" + this.f108325b + ')';
    }
}
