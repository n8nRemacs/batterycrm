package com.avito.android.bxcontent.mvi.entity;

import androidx.compose.foundation.H;
import com.avito.android.serp.adapter.l1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BxContentState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/t;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class t {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f112422f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final t f112423g = new t(0, null, false, 0, null, 31, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f112424a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LoadState f112425b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f112426c;

    /* renamed from: d, reason: collision with root package name */
    public final int f112427d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<l1> f112428e;

    /* compiled from: BxContentState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/t$a;", "", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public t() {
        this(0, null, false, 0, null, 31, null);
    }

    public static t a(t tVar, LoadState loadState, int i12, List list, int i13) {
        int i14 = tVar.f112424a;
        if ((i13 & 2) != 0) {
            loadState = tVar.f112425b;
        }
        LoadState loadState2 = loadState;
        boolean z12 = (i13 & 4) != 0 ? tVar.f112426c : false;
        if ((i13 & 8) != 0) {
            i12 = tVar.f112427d;
        }
        tVar.getClass();
        return new t(i14, loadState2, z12, i12, list);
    }

    /* renamed from: b, reason: from getter */
    public final boolean getF112426c() {
        return this.f112426c;
    }

    @Y61.k
    public final List<l1> c() {
        return this.f112428e;
    }

    /* renamed from: d, reason: from getter */
    public final int getF112424a() {
        return this.f112424a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f112424a == tVar.f112424a && this.f112425b == tVar.f112425b && this.f112426c == tVar.f112426c && this.f112427d == tVar.f112427d && L.f(this.f112428e, tVar.f112428e);
    }

    public final int hashCode() {
        return this.f112428e.hashCode() + androidx.appcompat.app.r.e(this.f112427d, androidx.appcompat.app.r.i((this.f112425b.hashCode() + (Integer.hashCode(this.f112424a) * 31)) * 31, 31, this.f112426c), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeedContentState(offset=");
        sb2.append(this.f112424a);
        sb2.append(", loadingState=");
        sb2.append(this.f112425b);
        sb2.append(", hasMorePages=");
        sb2.append(this.f112426c);
        sb2.append(", currentPage=");
        sb2.append(this.f112427d);
        sb2.append(", items=");
        return H.p(sb2, this.f112428e, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(int i12, @Y61.k LoadState loadState, boolean z12, int i13, @Y61.k List<? extends l1> list) {
        this.f112424a = i12;
        this.f112425b = loadState;
        this.f112426c = z12;
        this.f112427d = i13;
        this.f112428e = list;
    }

    public t(int i12, LoadState loadState, boolean z12, int i13, List list, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? 0 : i12, (i14 & 2) != 0 ? LoadState.f112043b : loadState, (i14 & 4) != 0 ? true : z12, (i14 & 8) == 0 ? i13 : 1, (i14 & 16) != 0 ? C42784z0.f406748b : list);
    }
}
