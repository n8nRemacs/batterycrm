package com.avito.android.credits.credit_partner_screen.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.credits.di.m;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ys.InterfaceC50286a;
import ys.InterfaceC50287b;
import ys.InterfaceC50289d;

/* compiled from: CreditPartnerActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lys/a;", "Lys/b;", "Lys/d;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC50286a, InterfaceC50287b, InterfaceC50289d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f128821a;

    /* compiled from: CreditPartnerActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.credits.credit_partner_screen.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3819a {
        static {
            int[] iArr = new int[PowerWebViewStateChangeEvent.State.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PowerWebViewStateChangeEvent.State state = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PowerWebViewStateChangeEvent.State state2 = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PowerWebViewStateChangeEvent.State state3 = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public a(@m @Y61.k String str) {
        this.f128821a = str;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC50287b> b(InterfaceC50286a interfaceC50286a, InterfaceC50289d interfaceC50289d) {
        C43210w c43210w;
        InterfaceC50286a interfaceC50286a2 = interfaceC50286a;
        if (interfaceC50286a2 instanceof InterfaceC50286a.d) {
            return new C43210w(InterfaceC50287b.a.f443530a);
        }
        if (interfaceC50286a2 instanceof InterfaceC50286a.e) {
            c43210w = new C43210w(new InterfaceC50287b.g(((InterfaceC50286a.e) interfaceC50286a2).f443528a));
        } else if (interfaceC50286a2 instanceof InterfaceC50286a.C12922a) {
            c43210w = new C43210w(new InterfaceC50287b.g(((InterfaceC50286a.C12922a) interfaceC50286a2).f443524a));
        } else {
            if (interfaceC50286a2 instanceof InterfaceC50286a.b) {
                return new C43210w(InterfaceC50287b.f.f443535a);
            }
            if (interfaceC50286a2 instanceof InterfaceC50286a.c) {
                return new C43210w(new InterfaceC50287b.C12923b(this.f128821a));
            }
            if (!(interfaceC50286a2 instanceof InterfaceC50286a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            PowerWebViewStateChangeEvent powerWebViewStateChangeEvent = ((InterfaceC50286a.f) interfaceC50286a2).f443529a;
            int iOrdinal = powerWebViewStateChangeEvent.f392937a.ordinal();
            if (iOrdinal == 0) {
                return powerWebViewStateChangeEvent.f392938b < 100 ? new C43210w(InterfaceC50287b.e.f443534a) : new C43210w(InterfaceC50287b.c.f443532a);
            }
            if (iOrdinal == 1) {
                return new C43210w(InterfaceC50287b.c.f443532a);
            }
            if (iOrdinal == 2) {
                return new C43210w(InterfaceC50287b.e.f443534a);
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new InterfaceC50287b.d(powerWebViewStateChangeEvent.f392941e / 100 == 5));
        }
        return c43210w;
    }
}
