package com.avito.android.realty_agency.checkerboard.mvi;

import Xh0.C17011a;
import Zh0.C19563e;
import Zh0.InterfaceC19559a;
import Zh0.InterfaceC19561c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.realty_agency.checkerboard.model.CheckerboardArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ri0.InterfaceC47661a;

/* compiled from: CheckerboardActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LZh0/a;", "LZh0/c;", "LZh0/e;", "a", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.realty_agency.checkerboard.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34225a implements com.avito.android.arch.mvi.a<InterfaceC19559a, InterfaceC19561c, C19563e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final y f251227a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47661a f251228b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.realty_agency.use_case.a f251229c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C17011a f251230d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CheckerboardArguments f251231e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.realty_agency.checkerboard.mvi.use_case.b f251232f;

    /* compiled from: CheckerboardActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/mvi/a$a;", "", "<init>", "()V", "", "CLIENT_ID_DEEPLINK_RESULT_KEY", "Ljava/lang/String;", "LOCATION_ID_DEEPLINK_RESULT_KEY", "LOT_ID_DEEPLINK_RESULT_KEY", "PARENT_SCREEN_DEEPLINK_RESULT_KEY", "SELECTION_NAME_DEEPLINK_RESULT_KEY", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.realty_agency.checkerboard.mvi.a$a, reason: collision with other inner class name */
    public static final class C7536a {
        public /* synthetic */ C7536a(C42822w c42822w) {
            this();
        }

        public C7536a() {
        }
    }

    static {
        new C7536a(null);
    }

    @Inject
    public C34225a(@Y61.k y yVar, @Y61.k InterfaceC47661a interfaceC47661a, @Y61.k com.avito.android.realty_agency.use_case.a aVar, @Y61.k C17011a c17011a, @Y61.k CheckerboardArguments checkerboardArguments, @Y61.k com.avito.android.realty_agency.checkerboard.mvi.use_case.b bVar) {
        this.f251227a = yVar;
        this.f251228b = interfaceC47661a;
        this.f251229c = aVar;
        this.f251230d = c17011a;
        this.f251231e = checkerboardArguments;
        this.f251232f = bVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC19561c> b(InterfaceC19559a interfaceC19559a, C19563e c19563e) {
        C43210w c43210w;
        InterfaceC19559a interfaceC19559a2 = interfaceC19559a;
        C19563e c19563e2 = c19563e;
        if (interfaceC19559a2 instanceof InterfaceC19559a.h) {
            return C43175k.G(new C34226b(interfaceC19559a2, c19563e2, null));
        }
        if (interfaceC19559a2 instanceof InterfaceC19559a.i) {
            return C43175k.G(new C34227c(interfaceC19559a2, c19563e2, this, null));
        }
        if (interfaceC19559a2 instanceof InterfaceC19559a.j) {
            return C43175k.G(new C34228d(c19563e2, this, null));
        }
        if (interfaceC19559a2 instanceof InterfaceC19559a.e) {
            return C43175k.G(new C34229e(interfaceC19559a2, c19563e2, this, null));
        }
        if (interfaceC19559a2 instanceof InterfaceC19559a.InterfaceC1446a) {
            InterfaceC19559a.InterfaceC1446a interfaceC1446a = (InterfaceC19559a.InterfaceC1446a) interfaceC19559a2;
            if (interfaceC1446a instanceof InterfaceC19559a.InterfaceC1446a.C1447a) {
                return C43175k.G(new k(this, interfaceC1446a, c19563e2, null));
            }
            if (interfaceC1446a instanceof InterfaceC19559a.InterfaceC1446a.d) {
                return C43175k.G(new l(c19563e2, this, null));
            }
            if (interfaceC1446a instanceof InterfaceC19559a.InterfaceC1446a.e) {
                return C43175k.G(new m(c19563e2, this, null));
            }
            if (interfaceC1446a instanceof InterfaceC19559a.InterfaceC1446a.c) {
                return C43175k.G(new n(c19563e2, this, null));
            }
            if (interfaceC1446a instanceof InterfaceC19559a.InterfaceC1446a.b) {
                return C43175k.G(new o(c19563e2, this, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (interfaceC19559a2 instanceof InterfaceC19559a.b) {
            InterfaceC19559a.b bVar = (InterfaceC19559a.b) interfaceC19559a2;
            if (bVar instanceof InterfaceC19559a.b.c) {
                return C43175k.G(new q(c19563e2, this, null));
            }
            if (bVar instanceof InterfaceC19559a.b.C1453b) {
                c43210w = new C43210w(new InterfaceC19561c.h(true));
            } else {
                if (!(bVar instanceof InterfaceC19559a.b.InterfaceC1448a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC19559a.b.InterfaceC1448a interfaceC1448a = (InterfaceC19559a.b.InterfaceC1448a) bVar;
                if (interfaceC1448a instanceof InterfaceC19559a.b.InterfaceC1448a.c) {
                    return new C43210w(new InterfaceC19561c.p(((InterfaceC19559a.b.InterfaceC1448a.c) interfaceC1448a).f20397a));
                }
                if (interfaceC1448a instanceof InterfaceC19559a.b.InterfaceC1448a.C1452b) {
                    return C43175k.G(new p(c19563e2, this, interfaceC1448a, null));
                }
                if (interfaceC1448a instanceof InterfaceC19559a.b.InterfaceC1448a.d) {
                    return new C43210w(new InterfaceC19561c.i(((InterfaceC19559a.b.InterfaceC1448a.d) interfaceC1448a).f20398a, ((InterfaceC19559a.b.InterfaceC1448a.d) interfaceC1448a).f20399b));
                }
                if (interfaceC1448a instanceof InterfaceC19559a.b.InterfaceC1448a.InterfaceC1449a.C1450a) {
                    return new C43210w(new InterfaceC19561c.j(((InterfaceC19559a.b.InterfaceC1448a.InterfaceC1449a.C1450a) interfaceC1448a).f20392a));
                }
                if (interfaceC1448a instanceof InterfaceC19559a.b.InterfaceC1448a.InterfaceC1449a.C1451b) {
                    return new C43210w(new InterfaceC19561c.l(((InterfaceC19559a.b.InterfaceC1448a.InterfaceC1449a.C1451b) interfaceC1448a).f20394a));
                }
                if (!(interfaceC1448a instanceof InterfaceC19559a.b.InterfaceC1448a.InterfaceC1449a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(InterfaceC19561c.b.f20425a);
            }
        } else {
            if (interfaceC19559a2 instanceof InterfaceC19559a.f) {
                return C43175k.G(new f(interfaceC19559a2, c19563e2, this, null));
            }
            if (interfaceC19559a2 instanceof InterfaceC19559a.c) {
                InterfaceC19559a.c cVar = (InterfaceC19559a.c) interfaceC19559a2;
                if (!(cVar instanceof InterfaceC19559a.c.b)) {
                    if (cVar instanceof InterfaceC19559a.c.C1455c) {
                        return new C43210w(new InterfaceC19561c.m(((InterfaceC19559a.c.C1455c) cVar).f20404a));
                    }
                    if (cVar instanceof InterfaceC19559a.c.C1454a) {
                        return new C43210w(new InterfaceC19561c.l(((InterfaceC19559a.c.C1454a) cVar).f20402a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(InterfaceC19561c.C1461c.f20426a);
            } else if (interfaceC19559a2 instanceof InterfaceC19559a.d) {
                InterfaceC19559a.d dVar = (InterfaceC19559a.d) interfaceC19559a2;
                if (!(dVar instanceof InterfaceC19559a.d.C1456a)) {
                    if (dVar instanceof InterfaceC19559a.d.b) {
                        return C43175k.G(new r(dVar, c19563e2, this, null));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(new InterfaceC19561c.h(false));
            } else {
                if (!(interfaceC19559a2 instanceof InterfaceC19559a.k.C1457a)) {
                    if (interfaceC19559a2 instanceof InterfaceC19559a.k.b) {
                        return C43175k.G(new g(interfaceC19559a2, c19563e2, this, null));
                    }
                    if (!(interfaceC19559a2 instanceof InterfaceC19559a.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str = ((InterfaceC19559a.g) interfaceC19559a2).f20409a;
                    if (str != null) {
                        int iHashCode = str.hashCode();
                        if (iHashCode != -709683153) {
                            if (iHashCode != -511138668) {
                                if (iHashCode == 436956881 && str.equals("realty_agency_checkerboard-client_binding-request_key")) {
                                    return C43175k.G(new i(interfaceC19559a2, null));
                                }
                            } else if (str.equals("realty_agency_checkerboard-add_lot_to_selection-request_key")) {
                                return C43175k.G(new h(interfaceC19559a2, this, null));
                            }
                        } else if (str.equals("realty_agency_checkerboard-lot_booking-request_key")) {
                            return C43175k.G(new j(interfaceC19559a2, null));
                        }
                    }
                    return C43175k.w();
                }
                c43210w = new C43210w(InterfaceC19561c.d.f20427a);
            }
        }
        return c43210w;
    }
}
