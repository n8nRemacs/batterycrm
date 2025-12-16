package com.avito.android.intermediary_verification.presentation.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.intermediary_verification.presentation.mvi.entity.IntermediaryVerificationAction;
import com.avito.android.intermediary_verification.presentation.mvi.entity.IntermediaryVerificationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: IntermediaryVerificationActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationAction;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction;", "LmO/b;", "<init>", "()V", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.arch.mvi.a<IntermediaryVerificationAction, IntermediaryVerificationInternalAction, mO.b> {

    /* compiled from: IntermediaryVerificationActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.intermediary_verification.presentation.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C5108a {
        static {
            int[] iArr = new int[IntermediaryVerificationAction.LeaveAction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IntermediaryVerificationAction.LeaveAction leaveAction = IntermediaryVerificationAction.LeaveAction.f173184b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<IntermediaryVerificationInternalAction> b(IntermediaryVerificationAction intermediaryVerificationAction, mO.b bVar) {
        Object obj;
        IntermediaryVerificationAction intermediaryVerificationAction2 = intermediaryVerificationAction;
        if (intermediaryVerificationAction2 instanceof IntermediaryVerificationAction.b) {
            return new C43210w(new IntermediaryVerificationInternalAction.FollowDeeplink(((IntermediaryVerificationAction.b) intermediaryVerificationAction2).f173189a));
        }
        if (!(intermediaryVerificationAction2 instanceof IntermediaryVerificationAction.a)) {
            throw new NoWhenBranchMatchedException();
        }
        int iOrdinal = ((IntermediaryVerificationAction.a) intermediaryVerificationAction2).f173188a.ordinal();
        if (iOrdinal == 0) {
            obj = IntermediaryVerificationInternalAction.Cancel.f173190b;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            obj = IntermediaryVerificationInternalAction.LeavePublish.f173192b;
        }
        return new C43210w(obj);
    }
}
