package zH;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import wH.C49507c;

/* compiled from: MotivationsListState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LzH/d;", "", "a", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zH.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C50465d {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f443999d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C50465d f444000e = new C50465d(true, false, null, 6, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f444001a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f444002b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C49507c f444003c;

    /* compiled from: MotivationsListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LzH/d$a;", "", "<init>", "()V", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zH.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C50465d() {
        this(false, false, null, 7, null);
    }

    public static C50465d a(C50465d c50465d, boolean z12, boolean z13) {
        C49507c c49507c = c50465d.f444003c;
        c50465d.getClass();
        return new C50465d(z12, z13, c49507c);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50465d)) {
            return false;
        }
        C50465d c50465d = (C50465d) obj;
        return this.f444001a == c50465d.f444001a && this.f444002b == c50465d.f444002b && L.f(this.f444003c, c50465d.f444003c);
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f444001a) * 31, 31, this.f444002b);
        C49507c c49507c = this.f444003c;
        return i12 + (c49507c == null ? 0 : c49507c.hashCode());
    }

    @k
    public final String toString() {
        return "MotivationsListState(isLoading=" + this.f444001a + ", isError=" + this.f444002b + ", content=" + this.f444003c + ')';
    }

    public C50465d(boolean z12, boolean z13, @l C49507c c49507c) {
        this.f444001a = z12;
        this.f444002b = z13;
        this.f444003c = c49507c;
    }

    public /* synthetic */ C50465d(boolean z12, boolean z13, C49507c c49507c, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? null : c49507c);
    }
}
