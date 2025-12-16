package J80;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import mc.C44051d;

/* compiled from: PlayerPerfInteractor.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ80/c;", "LJ80/b;", "_avito_player-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f8793a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public f f8794b;

    @Inject
    public c(@k InterfaceC28373a interfaceC28373a) {
        this.f8793a = interfaceC28373a;
    }

    @Override // J80.b
    public final void a(@k String str) {
        this.f8794b = new f(str, Long.valueOf(System.currentTimeMillis()), null, null, null, 0, 0, 124, null);
    }

    @Override // J80.b
    public final void b() {
        f fVar = this.f8794b;
        if (fVar != null) {
            fVar.f8801e = Long.valueOf(System.currentTimeMillis());
        }
    }

    @Override // J80.b
    public final void c(@l Integer num, @l String str, @l String str2, boolean z12) {
        Long lValueOf;
        Long lValueOf2;
        Long l12;
        Long l13;
        if (!z12) {
            f fVar = this.f8794b;
            if (fVar == null) {
                return;
            }
            fVar.f8803g++;
            return;
        }
        f fVar2 = this.f8794b;
        Long l14 = fVar2 != null ? fVar2.f8799c : null;
        Long l15 = fVar2 != null ? fVar2.f8801e : null;
        if (l14 != null) {
            long jLongValue = l14.longValue();
            f fVar3 = this.f8794b;
            lValueOf = Long.valueOf(jLongValue - ((fVar3 == null || (l13 = fVar3.f8798b) == null) ? l14.longValue() : l13.longValue()));
        } else {
            lValueOf = null;
        }
        if (l15 != null) {
            long jLongValue2 = l15.longValue();
            f fVar4 = this.f8794b;
            lValueOf2 = Long.valueOf(jLongValue2 - ((fVar4 == null || (l12 = fVar4.f8800d) == null) ? l15.longValue() : l12.longValue()));
        } else {
            lValueOf2 = null;
        }
        if (lValueOf == null || lValueOf2 == null) {
            return;
        }
        f fVar5 = this.f8794b;
        this.f8793a.c(new mc.f(fVar5 != null ? fVar5.f8797a : null, str, num, str2, Integer.valueOf((int) lValueOf.longValue()), Integer.valueOf((int) lValueOf2.longValue())));
    }

    @Override // J80.b
    public final void d() {
        f fVar = this.f8794b;
        if (fVar == null || fVar.f8799c != null) {
            return;
        }
        fVar.f8799c = Long.valueOf(System.currentTimeMillis());
    }

    @Override // J80.b
    public final void e(int i12) {
        f fVar = this.f8794b;
        if (fVar == null) {
            return;
        }
        fVar.f8802f = fVar != null ? fVar.f8802f + i12 : 0;
    }

    @Override // J80.b
    public final void f(@l Integer num, @l String str, @l String str2) {
        f fVar = this.f8794b;
        String str3 = fVar != null ? fVar.f8797a : null;
        Integer numValueOf = fVar != null ? Integer.valueOf(fVar.f8802f) : null;
        f fVar2 = this.f8794b;
        this.f8793a.c(new C44051d(str3, str, num, str2, numValueOf, fVar2 != null ? Integer.valueOf(fVar2.f8803g) : null));
        this.f8794b = null;
    }

    @Override // J80.b
    public final void g() {
        f fVar = this.f8794b;
        if (fVar != null) {
            fVar.f8800d = Long.valueOf(System.currentTimeMillis());
        }
    }
}
