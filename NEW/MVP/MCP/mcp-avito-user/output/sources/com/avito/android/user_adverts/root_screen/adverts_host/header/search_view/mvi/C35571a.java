package com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi;

import BI0.a;
import BI0.b;
import BI0.d;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import qI0.C47302a;
import qI0.C47303b;
import sI0.InterfaceC48055a;

/* compiled from: SearchActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LBI0/a;", "LBI0/b;", "LBI0/d;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35571a implements com.avito.android.arch.mvi.a<BI0.a, BI0.b, BI0.d> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f312850e = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48055a f312851a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f312852b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CI0.a f312853c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f312854d;

    /* compiled from: SearchActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/mvi/a$a;", "", "<init>", "()V", "", "ACTION_CHANGES_DELAY_MS", "J", "SHORTCUT_CHANGES_DELAY_MS", "SUGGESTION_LOAD_DELAY_MS", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.a$a, reason: collision with other inner class name */
    public static final class C9574a {
        public /* synthetic */ C9574a(C42822w c42822w) {
            this();
        }

        public C9574a() {
        }
    }

    static {
        new C9574a(null);
    }

    @Inject
    public C35571a(@Y61.k InterfaceC48055a interfaceC48055a, @Y61.k R0 r02, @Y61.k CI0.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f312851a = interfaceC48055a;
        this.f312852b = r02;
        this.f312853c = aVar;
        this.f312854d = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.C(new C35572b(aVar, this, null), new C35573c(c43197r1)), C43175k.C(new C35572b(aVar, this, null), C43175k.n(new g(c43197r1), 300L)), C43175k.C(new C35572b(aVar, this, null), new h(c43197r1)), C43175k.C(new C35572b(aVar, this, null), new i(c43197r1)), C43175k.C(new C35572b(aVar, this, null), new j(c43197r1)), C43175k.C(new C35572b(aVar, this, null), C43175k.n(new k(c43197r1), 300L)), C43175k.C(new C35572b(aVar, this, null), new l(c43197r1)), C43175k.C(new C35572b(aVar, this, null), new m(c43197r1)), C43175k.C(new C35572b(aVar, this, null), C43175k.n(new n(c43197r1), 500L)), C43175k.C(new C35572b(aVar, this, null), new C35574d(c43197r1)), C43175k.Y(C43175k.n(new C35575e(c43197r1), 300L), new t(aVar, this, null)), C43175k.C(new C35572b(aVar, this, null), new C35576f(c43197r1)));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<BI0.b> b(@Y61.k BI0.a aVar, @Y61.k BI0.d dVar) {
        C43210w c43210w;
        if (aVar instanceof a.C0050a) {
            a.C0050a c0050a = (a.C0050a) aVar;
            return new C43210w(new b.g(c0050a.f1288a, c0050a.f1289b));
        }
        boolean z12 = aVar instanceof a.b;
        InterfaceC28373a interfaceC28373a = this.f312854d;
        if (z12) {
            interfaceC28373a.c(new C47302a());
            return new C43210w(new b.C0051b(((a.b) aVar).f1290a));
        }
        if (aVar instanceof a.c) {
            c43210w = new C43210w(new b.e(false));
        } else {
            if (aVar instanceof a.d) {
                if (dVar instanceof d.C0052d) {
                    interfaceC28373a.c(new C47303b(((d.C0052d) dVar).f1333j));
                }
                c43210w = new C43210w(new b.e(true));
            } else if (aVar instanceof a.e) {
                c43210w = new C43210w(new b.h(null));
            } else if (aVar instanceof a.f) {
                boolean z13 = dVar instanceof d.C0052d;
                if (z13) {
                    interfaceC28373a.c(new qI0.e(((d.C0052d) dVar).f1333j));
                }
                if (dVar instanceof d.b ? true : dVar instanceof d.c) {
                    c43210w = new C43210w(b.d.f1307a);
                } else {
                    if (!z13) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d.C0052d c0052d = (d.C0052d) dVar;
                    c43210w = new C43210w(new b.c(c0052d.f1330g, c0052d.f1333j));
                }
            } else if (aVar instanceof a.g) {
                c43210w = new C43210w(new b.a(false));
            } else if (aVar instanceof a.i) {
                c43210w = new C43210w(new b.a(true));
            } else if (aVar instanceof a.h) {
                a.h hVar = (a.h) aVar;
                if (!(dVar instanceof d.b ? true : dVar instanceof d.c)) {
                    if (dVar instanceof d.C0052d) {
                        return new C43210w(new b.f(hVar.f1296a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(b.d.f1307a);
            } else {
                if (aVar instanceof a.j) {
                    a.j jVar = (a.j) aVar;
                    int i12 = jVar.f1299b;
                    int i13 = i12 >= 0 ? i12 : 0;
                    String str = jVar.f1300c;
                    String str2 = jVar.f1298a;
                    interfaceC28373a.c(new qI0.g(i13 + 1, str2, str));
                    return new C43210w(new b.h(str2));
                }
                if (aVar instanceof a.k) {
                    return C43175k.G(new s((a.k) aVar, this, null));
                }
                if (!(aVar instanceof a.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean z14 = ((a.l) aVar).f1302a;
                CI0.a aVar2 = this.f312853c;
                if (z14) {
                    c43210w = new C43210w(new b.k(aVar2.a()));
                } else {
                    aVar2.b();
                    c43210w = new C43210w(new b.k(false));
                }
            }
        }
        return c43210w;
    }
}
