package com.avito.android.mortgage.root.mvi;

import KZ.C14279i;
import com.avito.android.mortgage.api.model.ApplicationHeaderType;
import com.avito.android.mortgage.api.model.MortgageTerms;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealComment;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealCreditInfo;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import com.avito.android.mortgage.selected_appeal.model.SelectedAppealArguments;
import com.avito.android.mortgage.terms.model.MortgageTermsArguments;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MortgageRootActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.root.mvi.MortgageRootActor$conditionsClick$1", f = "MortgageRootActor.kt", i = {}, l = {373, 387}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage.root.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32683a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MortgageRootInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f202942q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f202943r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ApplicationHeaderType f202944s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ JZ.d f202945t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f202946u;

    /* compiled from: MortgageRootActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.root.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C6042a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f202947a;

        static {
            int[] iArr = new int[ApplicationHeaderType.values().length];
            try {
                iArr[ApplicationHeaderType.MORTGAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApplicationHeaderType.SELECTED_APPEAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f202947a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32683a(ApplicationHeaderType applicationHeaderType, JZ.d dVar, String str, Continuation<? super C32683a> continuation) {
        super(2, continuation);
        this.f202944s = applicationHeaderType;
        this.f202945t = dVar;
        this.f202946u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32683a c32683a = new C32683a(this.f202944s, this.f202945t, this.f202946u, continuation);
        c32683a.f202943r = obj;
        return c32683a;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C32683a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        MortgageTerms mortgageTerms;
        JZ.n selectedAppeal;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f202942q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f202943r;
            ApplicationHeaderType applicationHeaderType = this.f202944s;
            if (applicationHeaderType == null) {
                return G0.f406611a;
            }
            int i13 = C6042a.f202947a[applicationHeaderType.ordinal()];
            JZ.d dVar = this.f202945t;
            if (i13 != 1) {
                if (i13 == 2) {
                    if (dVar == null || (selectedAppeal = dVar.getSelectedAppeal()) == null) {
                        return G0.f406611a;
                    }
                    String id2 = selectedAppeal.getId();
                    String iconUrl = selectedAppeal.getIconUrl();
                    String title = selectedAppeal.getTitle();
                    AttributedText status = selectedAppeal.getStatus();
                    ApplicationAppealCreditInfo creditInfo = selectedAppeal.getCreditInfo();
                    ApplicationAppealComment comment = selectedAppeal.getComment();
                    C14279i selectBankButton = selectedAppeal.getSelectBankButton();
                    MortgageRootInternalAction.OpenSelectedAppeal openSelectedAppeal = new MortgageRootInternalAction.OpenSelectedAppeal(new SelectedAppealArguments(this.f202946u, id2, iconUrl, title, status, creditInfo, comment, selectBankButton != null ? selectBankButton.getTitle() : null, dVar.getAnalytics().getCurrentApplicantType(), dVar.getAnalytics().getCurrentMortgageStage()));
                    this.f202942q = 2;
                    if (interfaceC43172j.emit(openSelectedAppeal, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (dVar == null || (mortgageTerms = dVar.getMortgageTerms()) == null) {
                    return G0.f406611a;
                }
                MortgageRootInternalAction.OpenMortgageTerms openMortgageTerms = new MortgageRootInternalAction.OpenMortgageTerms(new MortgageTermsArguments(this.f202946u, dVar.getAnalytics().getCurrentMortgageStage(), mortgageTerms));
                this.f202942q = 1;
                if (interfaceC43172j.emit(openMortgageTerms, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
