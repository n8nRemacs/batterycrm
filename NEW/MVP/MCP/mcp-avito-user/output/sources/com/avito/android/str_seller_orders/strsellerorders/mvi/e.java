package com.avito.android.str_seller_orders.strsellerorders.mvi;

import com.avito.android.remote.model.ImportantToNoteBlockInfo;
import com.avito.android.remote.model.StrSellerOrdersImportantToNote;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersState;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vz0.C49404a;
import yz0.C50327a;
import yz0.InterfaceC50328b;

/* compiled from: StrSellerOrdersActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.mvi.StrSellerOrdersActor$process$3", f = "StrSellerOrdersActor.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f289856q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f289857r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StrSellerOrdersState f289858s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f289859t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50328b f289860u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, StrSellerOrdersState strSellerOrdersState, Continuation continuation, InterfaceC50328b interfaceC50328b) {
        super(2, continuation);
        this.f289858s = strSellerOrdersState;
        this.f289859t = aVar;
        this.f289860u = interfaceC50328b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f289859t, this.f289858s, continuation, this.f289860u);
        eVar.f289857r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSellerOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ImportantToNoteBlockInfo importantToNoteBlockInfo;
        Object next;
        List list;
        SuggestAnalyticsEvent analytics;
        List<ImportantToNoteBlockInfo> importantToNoteBlockInfos;
        Object next2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f289856q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f289857r;
            StrSellerOrdersState strSellerOrdersState = this.f289858s;
            StrSellerOrdersImportantToNote strSellerOrdersImportantToNote = strSellerOrdersState.f289890j;
            InterfaceC50328b interfaceC50328b = this.f289860u;
            if (strSellerOrdersImportantToNote == null || (importantToNoteBlockInfos = strSellerOrdersImportantToNote.getImportantToNoteBlockInfos()) == null) {
                importantToNoteBlockInfo = null;
            } else {
                Iterator<T> it = importantToNoteBlockInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    if (L.f(((ImportantToNoteBlockInfo) next2).getId(), ((InterfaceC50328b.h) interfaceC50328b).f443638a)) {
                        break;
                    }
                }
                importantToNoteBlockInfo = (ImportantToNoteBlockInfo) next2;
            }
            if (importantToNoteBlockInfo != null && (analytics = importantToNoteBlockInfo.getAnalytics()) != null) {
                C49404a.f441068c.getClass();
                this.f289859t.f289829c.c(C49404a.C12801a.a(analytics));
            }
            Iterator<T> it2 = strSellerOrdersState.f289894n.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (L.f(((C50327a) next).f443624a, ((InterfaceC50328b.h) interfaceC50328b).f443638a)) {
                    break;
                }
            }
            C50327a c50327a = (C50327a) next;
            if (c50327a == null || (list = c50327a.f443629f) == null) {
                list = C42784z0.f406748b;
            }
            StrSellerOrdersInternalAction.OpenSellerOrdersDialog openSellerOrdersDialog = new StrSellerOrdersInternalAction.OpenSellerOrdersDialog(new StrSellerOrdersDialogData(importantToNoteBlockInfo != null ? importantToNoteBlockInfo.getBottomSheetTitle() : null, ((InterfaceC50328b.h) interfaceC50328b).f443638a, list, false));
            this.f289856q = 1;
            if (interfaceC43172j.emit(openSellerOrdersDialog, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
