package com.avito.android.bxcontent.mvi.entity;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BxContentPrivateState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/i;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class i {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f112294c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SearchParams f112295a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f112296b;

    /* compiled from: BxContentPrivateState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/i$a;", "", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@Y61.k SearchParams searchParams, @Y61.l String str) {
        this.f112295a = searchParams;
        this.f112296b = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getF112296b() {
        return this.f112296b;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final SearchParams getF112295a() {
        return this.f112295a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f112295a, iVar.f112295a) && L.f(this.f112296b, iVar.f112296b);
    }

    public final int hashCode() {
        int iHashCode = this.f112295a.hashCode() * 31;
        String str = this.f112296b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BxContentPrivateState(searchParams=");
        sb2.append(this.f112295a);
        sb2.append(", searchContext=");
        return C22026a.c(sb2, this.f112296b, ')');
    }
}
