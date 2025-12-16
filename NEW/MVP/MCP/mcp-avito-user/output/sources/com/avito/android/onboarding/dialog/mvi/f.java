package com.avito.android.onboarding.dialog.mvi;

import C40.a;
import com.avito.android.onboarding.dialog.mvi.entity.OnboardingDialogInternalAction;
import com.avito.android.onboarding.dialog.mvi.entity.OnboardingDialogState;
import com.avito.android.onboarding.dialog.mvi.entity.item.OnboardingResultItem;
import com.avito.android.onboarding.dialog.view.quiz.AnswerChipable;
import com.avito.android.onboarding.dialog.view.quiz.OnboardingQuizItem;
import com.avito.android.remote.model.onboarding.ButtonAction;
import com.avito.android.remote.model.onboarding.QuizQuestion;
import com.avito.android.remote.model.onboarding.RequestType;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OnboardingDialogActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.onboarding.dialog.mvi.OnboardingDialogActor$process$6", f = "OnboardingDialogActor.kt", i = {1, 2}, l = {168, 182, 189, 192, 197}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes15.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super OnboardingDialogInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f208918q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f208919r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C40.a f208920s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f208921t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ OnboardingDialogState f208922u;

    /* compiled from: OnboardingDialogActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f208923a;

        static {
            int[] iArr = new int[ButtonAction.values().length];
            try {
                iArr[ButtonAction.NEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonAction.SEND_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f208923a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C40.a aVar, h hVar, OnboardingDialogState onboardingDialogState, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f208920s = aVar;
        this.f208921t = hVar;
        this.f208922u = onboardingDialogState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f208920s, this.f208921t, this.f208922u, continuation);
        fVar.f208919r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super OnboardingDialogInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        ArrayList arrayList;
        G0 g02;
        Iterable<OnboardingQuizItem> iterable;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f208918q;
        ArrayList arrayList2 = null;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2 || i12 == 3) {
                    interfaceC43172j = (InterfaceC43172j) this.f208919r;
                    C42729a0.b(obj);
                    g02 = G0.f406611a;
                } else if (i12 != 4 && i12 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }
        C42729a0.b(obj);
        interfaceC43172j = (InterfaceC43172j) this.f208919r;
        a.f fVar = (a.f) this.f208920s;
        ButtonAction buttonAction = fVar.f1915a.f209034e;
        int i13 = buttonAction == null ? -1 : a.f208923a[buttonAction.ordinal()];
        h hVar = this.f208921t;
        if (i13 == 1) {
            A40.a aVar = hVar.f208927a;
            OnboardingQuizItem onboardingQuizItem = fVar.f1915a;
            String str = onboardingQuizItem.f209033d;
            List<AnswerChipable> list = onboardingQuizItem.f209032c;
            if (list != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    if (((AnswerChipable) obj2).f209030e) {
                        arrayList3.add(obj2);
                    }
                }
                arrayList2 = new ArrayList(C42745f0.q(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((AnswerChipable) it.next()).f209029d);
                }
            }
            aVar.b(str, arrayList2, true);
            OnboardingDialogInternalAction.ShowNextQuizPage showNextQuizPage = OnboardingDialogInternalAction.ShowNextQuizPage.f208901b;
            this.f208918q = 1;
            if (interfaceC43172j.emit(showNextQuizPage, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i13 != 2) {
            OnboardingDialogInternalAction.DismissDialog dismissDialog = OnboardingDialogInternalAction.DismissDialog.f208892b;
            this.f208918q = 5;
            if (interfaceC43172j.emit(dismissDialog, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            A40.a aVar2 = hVar.f208927a;
            OnboardingQuizItem onboardingQuizItem2 = fVar.f1915a;
            String str2 = onboardingQuizItem2.f209033d;
            List<AnswerChipable> list2 = onboardingQuizItem2.f209032c;
            if (list2 != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list2) {
                    if (((AnswerChipable) obj3).f209030e) {
                        arrayList4.add(obj3);
                    }
                }
                arrayList = new ArrayList(C42745f0.q(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((AnswerChipable) it2.next()).f209029d);
                }
            } else {
                arrayList = null;
            }
            aVar2.b(str2, arrayList, false);
            RequestType requestType = fVar.f1915a.f209036g;
            if (requestType != null) {
                if (requestType == RequestType.GET_SEARCH_DEEPLINK) {
                    OnboardingResultItem onboardingResultItem = this.f208922u.f208912c;
                    OnboardingResultItem.OnboardingResultQuizItem onboardingResultQuizItem = onboardingResultItem instanceof OnboardingResultItem.OnboardingResultQuizItem ? (OnboardingResultItem.OnboardingResultQuizItem) onboardingResultItem : null;
                    if (onboardingResultQuizItem == null || (iterable = onboardingResultQuizItem.f208917b) == null) {
                        iterable = C42784z0.f406748b;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (OnboardingQuizItem onboardingQuizItem3 : iterable) {
                        List<AnswerChipable> list3 = onboardingQuizItem3.f209032c;
                        if (list3 != null) {
                            for (AnswerChipable answerChipable : list3) {
                                if (answerChipable.f209030e) {
                                    StringBuilder sb2 = new StringBuilder("questionId[");
                                    QuizQuestion quizQuestion = onboardingQuizItem3.f209037h;
                                    sb2.append(quizQuestion != null ? quizQuestion.getId() : null);
                                    sb2.append("]=");
                                    sb2.append(answerChipable.f209027b);
                                    arrayList5.add(sb2.toString());
                                }
                            }
                        }
                    }
                    InterfaceC43160i interfaceC43160iA = hVar.f208930d.a(fVar.f1915a.f209031b, arrayList5.isEmpty() ? null : C42745f0.O(arrayList5, ContainerUtils.FIELD_DELIMITER, null, null, null, 62));
                    this.f208919r = interfaceC43172j;
                    this.f208918q = 2;
                    if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    OnboardingDialogInternalAction.DismissDialog dismissDialog2 = OnboardingDialogInternalAction.DismissDialog.f208892b;
                    this.f208919r = interfaceC43172j;
                    this.f208918q = 3;
                    if (interfaceC43172j.emit(dismissDialog2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
        }
        return G0.f406611a;
        if (g02 == null) {
            OnboardingDialogInternalAction.DismissDialog dismissDialog3 = OnboardingDialogInternalAction.DismissDialog.f208892b;
            this.f208919r = null;
            this.f208918q = 4;
            if (interfaceC43172j.emit(dismissDialog3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
