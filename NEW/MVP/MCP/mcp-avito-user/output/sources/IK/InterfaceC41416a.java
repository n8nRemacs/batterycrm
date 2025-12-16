package ik;

import Y61.k;
import Y61.l;
import com.avito.android.brandspace.remote.model.Brandspace;
import com.avito.android.brandspace.remote.model.BrandspaceAdjustParameters;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BrandspaceBeduinV2Action.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lik/a;", "", "a", "b", "Lik/a$a;", "Lik/a$b;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ik.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC41416a {

    /* compiled from: BrandspaceBeduinV2Action.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lik/a$a;", "Lik/a;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ik.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11390a implements InterfaceC41416a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BrandspaceAdjustParameters f398705a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Brandspace.BeduinV2 f398706b;

        public C11390a(@k BrandspaceAdjustParameters brandspaceAdjustParameters, @k Brandspace.BeduinV2 beduinV2) {
            this.f398705a = brandspaceAdjustParameters;
            this.f398706b = beduinV2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11390a)) {
                return false;
            }
            C11390a c11390a = (C11390a) obj;
            return L.f(this.f398705a, c11390a.f398705a) && L.f(this.f398706b, c11390a.f398706b);
        }

        public final int hashCode() {
            return this.f398706b.hashCode() + (this.f398705a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowScreenByJson(adjustParams=" + this.f398705a + ", beduinData=" + this.f398706b + ')';
        }
    }

    /* compiled from: BrandspaceBeduinV2Action.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lik/a$b;", "Lik/a;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ik.a$b */
    public static final /* data */ class b implements InterfaceC41416a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AbstractC40048c f398707a;

        public b(@k AbstractC40048c abstractC40048c) {
            this.f398707a = abstractC40048c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f398707a, ((b) obj).f398707a);
        }

        public final int hashCode() {
            return this.f398707a.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateBeduinState(beduinState=" + this.f398707a + ')';
        }
    }
}
