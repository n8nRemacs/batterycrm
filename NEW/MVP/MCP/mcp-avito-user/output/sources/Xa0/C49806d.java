package xA0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SupportUiState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxA0/d;", "", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xA0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C49806d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final UU.a f442289a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UU.a f442290b;

    /* JADX WARN: Multi-variable type inference failed */
    public C49806d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49806d)) {
            return false;
        }
        C49806d c49806d = (C49806d) obj;
        return L.f(this.f442289a, c49806d.f442289a) && L.f(this.f442290b, c49806d.f442290b);
    }

    public final int hashCode() {
        return this.f442290b.hashCode() + (this.f442289a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "SupportUiState(chatButtonState=" + this.f442289a + ", callButtonState=" + this.f442290b + ')';
    }

    public C49806d(@k UU.a aVar, @k UU.a aVar2) {
        this.f442289a = aVar;
        this.f442290b = aVar2;
    }

    public /* synthetic */ C49806d(UU.a aVar, UU.a aVar2, int i12, C42822w c42822w) {
        UU.a aVar3;
        UU.a aVar4;
        if ((i12 & 1) != 0) {
            aVar3 = new UU.a(null, null, false, false, false, null, null, null, null, false, 1023, null);
        } else {
            aVar3 = aVar;
        }
        if ((i12 & 2) != 0) {
            aVar4 = new UU.a(null, null, false, false, false, null, null, null, null, false, 1023, null);
        } else {
            aVar4 = aVar2;
        }
        this(aVar3, aVar4);
    }
}
