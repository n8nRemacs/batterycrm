package com.avito.android.motivation_screen.domain;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.gig.motivation_screen.generated.api.get_gig_worker_motivation.ProgressDuty;
import com.avito.android.motivation_screen.models.MotivationInternalAction;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: TypedResultToInternalActionMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/motivation_screen/domain/c;", "Lkotlin/Function1;", "Lcom/avito/android/remote/model/TypedResult;", "LXF/c;", "Lcom/avito/android/motivation_screen/models/MotivationInternalAction;", "<init>", "()V", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements l<TypedResult<XF.c>, MotivationInternalAction> {

    /* compiled from: TypedResultToInternalActionMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f206309a;

        static {
            int[] iArr = new int[ProgressDuty.Type.values().length];
            try {
                iArr[ProgressDuty.Type.Locked.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProgressDuty.Type.InProgress.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProgressDuty.Type.Completed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProgressDuty.Type.Finished.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f206309a = iArr;
        }
    }

    @Inject
    public c() {
    }

    @k
    public static MotivationInternalAction a(@k TypedResult typedResult) {
        MotivationInternalAction.ContentLoaded.InternalProgressStep.InternalProgressStepState internalProgressStepState;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return MotivationInternalAction.b.f206334a;
            }
            throw new NoWhenBranchMatchedException();
        }
        TypedResult.Success success = (TypedResult.Success) typedResult;
        List<String> listB = ((XF.c) success.getResult()).b();
        String headerTitle = ((XF.c) success.getResult()).getHeaderTitle();
        AttributedText subtitle = ((XF.c) success.getResult()).getSubtitle();
        String description = ((XF.c) success.getResult()).getDescription();
        AttributedText duration = ((XF.c) success.getResult()).getDuration();
        String title = ((XF.c) success.getResult()).getProgress().getTitle();
        String dutyCount = ((XF.c) success.getResult()).getProgress().getDutyCount();
        List<ProgressDuty> listA = ((XF.c) success.getResult()).getProgress().a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (true) {
            internalProgressStep = null;
            MotivationInternalAction.ContentLoaded.InternalProgressStep internalProgressStep = null;
            if (!it.hasNext()) {
                String paymentTitle = ((XF.c) success.getResult()).getProgress().getPaymentTitle();
                XF.b footerInfo = ((XF.c) success.getResult()).getFooterInfo();
                MotivationInternalAction.ContentLoaded.a aVar = new MotivationInternalAction.ContentLoaded.a(footerInfo.getTitle(), footerInfo.getUri());
                XF.a actionButton = ((XF.c) success.getResult()).getActionButton();
                return new MotivationInternalAction.ContentLoaded(listB, headerTitle, subtitle, description, duration, title, dutyCount, arrayList, paymentTitle, aVar, actionButton != null ? new MotivationInternalAction.ContentLoaded.a(actionButton.getTitle(), actionButton.getUri()) : null, ((XF.c) success.getResult()).getShouldShowAnimation());
            }
            ProgressDuty progressDuty = (ProgressDuty) it.next();
            if (progressDuty.getTitle() != null && progressDuty.getType() != null) {
                String title2 = progressDuty.getTitle();
                int i12 = a.f206309a[progressDuty.getType().ordinal()];
                if (i12 == 1) {
                    internalProgressStepState = MotivationInternalAction.ContentLoaded.InternalProgressStep.InternalProgressStepState.f206326c;
                } else if (i12 == 2) {
                    internalProgressStepState = MotivationInternalAction.ContentLoaded.InternalProgressStep.InternalProgressStepState.f206327d;
                } else if (i12 == 3) {
                    internalProgressStepState = MotivationInternalAction.ContentLoaded.InternalProgressStep.InternalProgressStepState.f206325b;
                } else {
                    if (i12 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    internalProgressStepState = MotivationInternalAction.ContentLoaded.InternalProgressStep.InternalProgressStepState.f206328e;
                }
                internalProgressStep = new MotivationInternalAction.ContentLoaded.InternalProgressStep(title2, internalProgressStepState);
            }
            if (internalProgressStep != null) {
                arrayList.add(internalProgressStep);
            }
        }
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ MotivationInternalAction invoke(TypedResult<XF.c> typedResult) {
        return a(typedResult);
    }
}
