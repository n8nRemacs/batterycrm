package com.avito.android.beduin.common.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRecyclerHeightManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/utils/t;", "", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* data */ class t {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f103544c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final y f103545a;

    /* renamed from: b, reason: collision with root package name */
    public final int f103546b;

    /* compiled from: BeduinRecyclerHeightManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/utils/t$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public t(@Y61.k y yVar, int i12) {
        this.f103545a = yVar;
        this.f103546b = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return L.f(this.f103545a, tVar.f103545a) && this.f103546b == tVar.f103546b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f103546b) + (this.f103545a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeightCalculationKey(id=");
        sb2.append(this.f103545a);
        sb2.append(", width=");
        return androidx.appcompat.app.r.t(sb2, this.f103546b, ')');
    }
}
