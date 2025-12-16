package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.profile_settings_extended.InterfaceC33475i;
import com.avito.android.profile_settings_extended.adapter.alert.PromoBlockItem;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import com.avito.android.promoblock.TnsPromoBlockItem;
import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSettingsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$PromoBlockWidgetInternalAction$OnPromoBlockClosed;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$closePromoBlock$2", f = "ExtendedProfileSettingsActor.kt", i = {0}, l = {394, 398}, m = "invokeSuspend", n = {"alertItem"}, s = {"L$0"})
/* renamed from: com.avito.android.profile_settings_extended.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33482c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction.PromoBlockWidgetInternalAction.OnPromoBlockClosed>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f230528q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f230529r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TnsPromoBlockItem f230530s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C33480a f230531t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33482c(TnsPromoBlockItem tnsPromoBlockItem, C33480a c33480a, Continuation<? super C33482c> continuation) {
        super(2, continuation);
        this.f230530s = tnsPromoBlockItem;
        this.f230531t = c33480a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33482c c33482c = new C33482c(this.f230530s, this.f230531t, continuation);
        c33482c.f230529r = obj;
        return c33482c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction.PromoBlockWidgetInternalAction.OnPromoBlockClosed> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33482c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        PromoBlockItem promoBlockItem;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f230528q;
        try {
        } catch (Throwable th2) {
            V2.f318762a.f(th2);
        }
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f230529r;
            TnsPromoBlockItem tnsPromoBlockItem = this.f230530s;
            PromoBlockItem promoBlockItem2 = tnsPromoBlockItem instanceof PromoBlockItem ? (PromoBlockItem) tnsPromoBlockItem : null;
            if (promoBlockItem2 == null) {
                return G0.f406611a;
            }
            ExtendedProfileSettingsInternalAction.PromoBlockWidgetInternalAction.OnPromoBlockClosed onPromoBlockClosed = new ExtendedProfileSettingsInternalAction.PromoBlockWidgetInternalAction.OnPromoBlockClosed((PromoBlockItem) tnsPromoBlockItem);
            this.f230529r = promoBlockItem2;
            this.f230528q = 1;
            if (interfaceC43172j.emit(onPromoBlockClosed, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            promoBlockItem = promoBlockItem2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            promoBlockItem = (PromoBlockItem) this.f230529r;
            C42729a0.b(obj);
        }
        PromoBlockItem.CloseParams closeParams = promoBlockItem.f229141n;
        if (closeParams == null) {
            return G0.f406611a;
        }
        InterfaceC33475i interfaceC33475i = this.f230531t.f230503d;
        String str = closeParams.f229148b;
        String str2 = closeParams.f229150d;
        String str3 = closeParams.f229149c;
        this.f230529r = null;
        this.f230528q = 2;
        if (interfaceC33475i.c(str, str2, str3, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
