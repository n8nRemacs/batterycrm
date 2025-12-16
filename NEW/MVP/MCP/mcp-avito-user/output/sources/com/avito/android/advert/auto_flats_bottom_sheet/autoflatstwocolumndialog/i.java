package com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog;

import Zf.InterfaceC19551a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi.entity.AutoFlatsTwoColumnDialogInternalAction;
import com.avito.android.remote.model.model_card.ModelCardInfo;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutoFlatsTwoColumnDialogInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/i;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19551a f68696a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ModelCardInfo f68697b;

    /* compiled from: AutoFlatsTwoColumnDialogInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert/auto_flats_bottom_sheet/autoflatstwocolumndialog/mvi/entity/AutoFlatsTwoColumnDialogInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.AutoFlatsTwoColumnDialogInteractor$getDetailedSpecsGroups$1", f = "AutoFlatsTwoColumnDialogInteractor.kt", i = {0}, l = {22, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 45}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AutoFlatsTwoColumnDialogInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f68698q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f68699r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = i.this.new a(continuation);
            aVar.f68699r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AutoFlatsTwoColumnDialogInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 283
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public i(@Y61.k InterfaceC19551a interfaceC19551a, @Y61.l ModelCardInfo modelCardInfo) {
        this.f68696a = interfaceC19551a;
        this.f68697b = modelCardInfo;
    }

    @Y61.k
    public final InterfaceC43160i<AutoFlatsTwoColumnDialogInternalAction> a() {
        return C43175k.G(new a(null));
    }
}
