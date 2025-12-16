package com.avito.android.str_seller_orders_important_to_note.mvi;

import Xz0.C17069a;
import aA0.InterfaceC19747a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.x;
import com.avito.android.str_seller_orders_important_to_note.ImportantToNoteOpenParams;
import com.avito.android.str_seller_orders_important_to_note.mvi.entity.StrSellerImportantToNoteInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrSellerImportantToNoteActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LaA0/a;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "LaA0/c;", "a", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC19747a, StrSellerImportantToNoteInternalAction, aA0.c> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f291372e = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ImportantToNoteOpenParams f291373a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders_important_to_note.domain.k f291374b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f291375c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final x f291376d;

    /* compiled from: StrSellerImportantToNoteActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/mvi/a$a;", "", "<init>", "()V", "", "API_PREFIX", "Ljava/lang/String;", "DEEPLINK_PREFIX", "TEL_PREFIX", "WEB_PREFIX", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_seller_orders_important_to_note.mvi.a$a, reason: collision with other inner class name */
    public static final class C8819a {
        public /* synthetic */ C8819a(C42822w c42822w) {
            this();
        }

        public C8819a() {
        }
    }

    static {
        new C8819a(null);
    }

    @Inject
    public a(@Y61.k ImportantToNoteOpenParams importantToNoteOpenParams, @Y61.k com.avito.android.str_seller_orders_important_to_note.domain.k kVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k x xVar) {
        this.f291373a = importantToNoteOpenParams;
        this.f291374b = kVar;
        this.f291375c = interfaceC28373a;
        this.f291376d = xVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<StrSellerImportantToNoteInternalAction> b(InterfaceC19747a interfaceC19747a, aA0.c cVar) {
        com.avito.android.str_seller_orders_important_to_note.domain.e eVar;
        InterfaceC19747a interfaceC19747a2 = interfaceC19747a;
        if (interfaceC19747a2.equals(InterfaceC19747a.e.f20787a)) {
            return new C43210w(StrSellerImportantToNoteInternalAction.SendFinishResult.f291396b);
        }
        if (interfaceC19747a2.equals(InterfaceC19747a.f.f20788a)) {
            return this.f291374b.a(this.f291373a);
        }
        com.avito.android.str_seller_orders_important_to_note.domain.h hVar = null;
        if (interfaceC19747a2 instanceof InterfaceC19747a.c) {
            return C43175k.G(new c(interfaceC19747a2, this, null));
        }
        if (interfaceC19747a2 instanceof InterfaceC19747a.C1485a) {
            return C43175k.G(new d(interfaceC19747a2, this, null));
        }
        if (!(interfaceC19747a2 instanceof InterfaceC19747a.b)) {
            if (interfaceC19747a2 instanceof InterfaceC19747a.d) {
                return new C43210w(new StrSellerImportantToNoteInternalAction.LaunchDeeplink(((InterfaceC19747a.d) interfaceC19747a2).f20786a));
            }
            throw new NoWhenBranchMatchedException();
        }
        com.avito.android.str_seller_orders_important_to_note.domain.d dVar = ((InterfaceC19747a.b) interfaceC19747a2).f20783a.f291308b;
        if (dVar != null && (eVar = dVar.f291313a) != null) {
            hVar = eVar.f291318a;
        }
        if (hVar != null) {
            c(hVar);
        }
        return C43175k.w();
    }

    public final void c(com.avito.android.str_seller_orders_important_to_note.domain.h hVar) {
        Long l12 = hVar.f291324a;
        if (l12 != null) {
            this.f291375c.c(new C17069a((int) l12.longValue(), (int) hVar.f291326c, hVar.f291325b));
        }
    }
}
