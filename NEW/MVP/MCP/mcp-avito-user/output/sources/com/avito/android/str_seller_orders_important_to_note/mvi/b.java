package com.avito.android.str_seller_orders_important_to_note.mvi;

import Vx0.AbstractC15725a;
import Y41.p;
import com.avito.android.str_seller_orders_important_to_note.mvi.entity.StrSellerImportantToNoteInternalAction;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrSellerImportantToNoteActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders_important_to_note.mvi.StrSellerImportantToNoteActor$handleButtonActionWithoutPrompt$1", f = "StrSellerImportantToNoteActor.kt", i = {}, l = {98, 106, 110, 118}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super StrSellerImportantToNoteInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f291377q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f291378r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.str_seller_orders_important_to_note.domain.b f291379s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f291380t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.android.str_seller_orders_important_to_note.domain.b bVar, a aVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f291379s = bVar;
        this.f291380t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f291379s, this.f291380t, continuation);
        bVar.f291378r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSellerImportantToNoteInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object next;
        AbstractC15725a c1218a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f291377q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f291378r;
            com.avito.android.str_seller_orders_important_to_note.domain.b bVar = this.f291379s;
            String str = bVar.f291310d;
            a aVar = this.f291380t;
            if (str == null || str.length() == 0) {
                Iterator it = Collections.singletonList(bVar.f291309c).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    String str2 = (String) next;
                    if (str2 != null && str2.length() != 0) {
                        break;
                    }
                }
                String str3 = (String) next;
                if (str3 != null) {
                    int i13 = a.f291372e;
                    aVar.getClass();
                    c1218a = (C43066x.h0(str3, "api/", false) || C43066x.h0(str3, "web/", false)) ? new AbstractC15725a.C1218a(str3, null) : C43066x.h0(str3, "ru.avito", false) ? new AbstractC15725a.b(str3, null) : C43066x.h0(str3, "tel", false) ? new AbstractC15725a.c(str3, null) : new AbstractC15725a.d(str3, null);
                } else {
                    c1218a = null;
                }
            } else {
                int i14 = a.f291372e;
                aVar.getClass();
                String strM0 = C43066x.m0(str, "api/", str);
                c1218a = new AbstractC15725a.C1218a(C43066x.m0(strM0, "web/", strM0), null);
            }
            if (c1218a instanceof AbstractC15725a.C1218a) {
                com.avito.android.str_seller_orders_important_to_note.domain.c cVar = bVar.f291307a;
                Map<String, String> mapG = cVar != null ? P0.g(new Q("action", cVar.f291311a), new Q("orderID", cVar.f291312b)) : null;
                if (mapG != null) {
                    InterfaceC43160i<StrSellerImportantToNoteInternalAction> interfaceC43160iB = aVar.f291374b.b(((AbstractC15725a.C1218a) c1218a).f17529a, mapG, aVar.f291373a);
                    this.f291377q = 1;
                    if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    InterfaceC43160i<StrSellerImportantToNoteInternalAction> interfaceC43160iC = aVar.f291374b.c(((AbstractC15725a.C1218a) c1218a).f17529a, aVar.f291373a);
                    this.f291377q = 2;
                    if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (c1218a instanceof AbstractC15725a.b) {
                StrSellerImportantToNoteInternalAction.LaunchDeeplink launchDeeplink = new StrSellerImportantToNoteInternalAction.LaunchDeeplink(aVar.f291376d.b(((AbstractC15725a.b) c1218a).f17529a));
                this.f291377q = 3;
                if (interfaceC43172j.emit(launchDeeplink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (c1218a instanceof AbstractC15725a.d) {
                StrSellerImportantToNoteInternalAction.OpenWebView openWebView = new StrSellerImportantToNoteInternalAction.OpenWebView(((AbstractC15725a.d) c1218a).f17529a);
                this.f291377q = 4;
                if (interfaceC43172j.emit(openWebView, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
