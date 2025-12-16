package com.avito.android.sbc.autodispatches;

import androidx.compose.runtime.internal.P;
import com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1.AutoDispatchOut;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SbcAutoDispatchesCache.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sbc/autodispatches/b;", "", "a", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.sbc.autodispatches.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C34466b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f258846c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C34466b f258847d = new C34466b(C42784z0.f406748b, false);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<AutoDispatchOut> f258848a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f258849b;

    /* compiled from: SbcAutoDispatchesCache.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/autodispatches/b$a;", "", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sbc.autodispatches.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C34466b(@Y61.k List<AutoDispatchOut> list, boolean z12) {
        this.f258848a = list;
        this.f258849b = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34466b)) {
            return false;
        }
        C34466b c34466b = (C34466b) obj;
        return L.f(this.f258848a, c34466b.f258848a) && this.f258849b == c34466b.f258849b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258849b) + (this.f258848a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbcAutoDispatchListEntry(autoDispatchList=");
        sb2.append(this.f258848a);
        sb2.append(", isFullyLoaded=");
        return androidx.appcompat.app.r.x(sb2, this.f258849b, ')');
    }
}
