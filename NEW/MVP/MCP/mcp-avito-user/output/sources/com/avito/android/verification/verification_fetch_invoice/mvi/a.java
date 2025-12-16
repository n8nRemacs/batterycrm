package com.avito.android.verification.verification_fetch_invoice.mvi;

import OM0.b;
import OM0.d;
import com.avito.android.arch.mvi.a;
import com.avito.android.verification.inn.a;
import com.avito.android.verification.inn.list.button.ButtonItem;
import com.avito.android.verification.verification_fetch_invoice.VerificationFetchInvoiceArgs;
import com.avito.android.verification.verification_fetch_invoice.mvi.entity.FetchInvoiceInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FetchInvoiceActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LOM0/b;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction;", "LOM0/d;", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.arch.mvi.a<OM0.b, FetchInvoiceInternalAction, OM0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final VerificationFetchInvoiceArgs f325189a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f325190b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.verification_fetch_invoice.b f325191c;

    /* compiled from: FetchInvoiceActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/mvi/a$a;", "", "<init>", "()V", "", "STRING_ID_ARGS_KEY", "Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.verification.verification_fetch_invoice.mvi.a$a, reason: collision with other inner class name */
    public static final class C10059a {
        public /* synthetic */ C10059a(C42822w c42822w) {
            this();
        }

        public C10059a() {
        }
    }

    static {
        new C10059a(null);
    }

    @Inject
    public a(@Y61.k VerificationFetchInvoiceArgs verificationFetchInvoiceArgs, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.verification.verification_fetch_invoice.b bVar) {
        this.f325189a = verificationFetchInvoiceArgs;
        this.f325190b = aVar;
        this.f325191c = bVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<FetchInvoiceInternalAction> b(OM0.b bVar, OM0.d dVar) {
        C43210w c43210w;
        a.C10030a c10030a;
        OM0.b bVar2 = bVar;
        OM0.d dVar2 = dVar;
        if (bVar2.equals(b.f.f12211a)) {
            return this.f325191c.a(this.f325189a.f325131b);
        }
        if (bVar2.equals(b.C0787b.f12207a)) {
            c43210w = ((dVar2 instanceof d.b) && ((d.b) dVar2).f12217b) ? new C43210w(new FetchInvoiceInternalAction.FinishActivity()) : new C43210w(new FetchInvoiceInternalAction.NavigateBack());
        } else {
            Object obj = null;
            if (bVar2 instanceof b.d) {
                return C43175k.G(new b(bVar2, this, null));
            }
            if (bVar2 instanceof b.a) {
                return C43175k.G(new c(bVar2, this, null));
            }
            if (bVar2 instanceof b.c) {
                return C43175k.G(new d(bVar2, this, null));
            }
            if (bVar2 instanceof b.g) {
                d.b bVar3 = dVar2 instanceof d.b ? (d.b) dVar2 : null;
                ArrayList arrayList = (bVar3 == null || (c10030a = bVar3.f12218c) == null) ? null : c10030a.f323872a;
                if (arrayList != null) {
                    b.g gVar = (b.g) bVar2;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) next;
                        if ((aVar instanceof ButtonItem) && L.f(((ButtonItem) aVar).f323901b, gVar.f12212a)) {
                            obj = next;
                            break;
                        }
                    }
                    return new C43210w(new FetchInvoiceInternalAction.SetButtonItemLoading((ButtonItem) obj, gVar.f12213b));
                }
                c43210w = new C43210w(new FetchInvoiceInternalAction.DoNothing());
            } else {
                if (!bVar2.equals(b.e.f12210a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(new FetchInvoiceInternalAction.UpdateListState());
            }
        }
        return c43210w;
    }
}
