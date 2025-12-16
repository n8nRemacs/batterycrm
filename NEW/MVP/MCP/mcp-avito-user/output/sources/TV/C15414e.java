package Tv;

import Tv.AbstractC15411b;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TarifikatorMainState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LTv/e;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tv.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C15414e extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f16011d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C15414e f16012e = new C15414e(new com.avito.android.lib.design.nav_bar.a(null, null, false, null, null, null, null, 127, null), AbstractC15411b.c.f15983a);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.nav_bar.a f16013b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AbstractC15411b f16014c;

    /* compiled from: TarifikatorMainState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTv/e$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Tv.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C15414e(@k com.avito.android.lib.design.nav_bar.a aVar, @k AbstractC15411b abstractC15411b) {
        this.f16013b = aVar;
        this.f16014c = abstractC15411b;
    }

    public static C15414e a(C15414e c15414e, com.avito.android.lib.design.nav_bar.a aVar, AbstractC15411b abstractC15411b, int i12) {
        if ((i12 & 1) != 0) {
            aVar = c15414e.f16013b;
        }
        if ((i12 & 2) != 0) {
            abstractC15411b = c15414e.f16014c;
        }
        c15414e.getClass();
        return new C15414e(aVar, abstractC15411b);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15414e)) {
            return false;
        }
        C15414e c15414e = (C15414e) obj;
        return L.f(this.f16013b, c15414e.f16013b) && L.f(this.f16014c, c15414e.f16014c);
    }

    public final int hashCode() {
        return this.f16014c.hashCode() + (this.f16013b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "TarifikatorMainState(navBarState=" + this.f16013b + ", viewState=" + this.f16014c + ')';
    }
}
