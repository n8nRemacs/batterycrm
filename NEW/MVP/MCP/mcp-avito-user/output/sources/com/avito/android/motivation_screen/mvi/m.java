package com.avito.android.motivation_screen.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.motivation_screen.models.MotivationInternalAction;
import com.avito.android.motivation_screen.models.UiProgressStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import v20.C49152c;

/* compiled from: MotivationReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/motivation_screen/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/motivation_screen/models/MotivationInternalAction;", "Lv20/c;", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements u<MotivationInternalAction, C49152c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f206365b;

    @Inject
    public m(@Y61.k a aVar) {
        this.f206365b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C49152c a(MotivationInternalAction motivationInternalAction, C49152c c49152c) {
        UiProgressStep.UiProgressStepState uiProgressStepState;
        MotivationInternalAction motivationInternalAction2 = motivationInternalAction;
        C49152c c49152c2 = c49152c;
        if (!(motivationInternalAction2 instanceof MotivationInternalAction.ContentLoaded)) {
            return motivationInternalAction2 instanceof MotivationInternalAction.c ? C49152c.a(c49152c2, true, false) : motivationInternalAction2 instanceof MotivationInternalAction.b ? C49152c.a(c49152c2, false, true) : c49152c2;
        }
        MotivationInternalAction.ContentLoaded contentLoaded = (MotivationInternalAction.ContentLoaded) motivationInternalAction2;
        List<MotivationInternalAction.ContentLoaded.InternalProgressStep> list = contentLoaded.f206318h;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            a aVar = this.f206365b;
            if (!zHasNext) {
                aVar.getClass();
                MotivationInternalAction.ContentLoaded.a aVar2 = contentLoaded.f206320j;
                v20.d dVar = aVar2 != null ? new v20.d(aVar2.f206331a, aVar2.f206332b) : null;
                MotivationInternalAction.ContentLoaded.a aVar3 = contentLoaded.f206321k;
                return new C49152c(contentLoaded.f206311a, contentLoaded.f206312b, contentLoaded.f206313c, contentLoaded.f206314d, contentLoaded.f206315e, contentLoaded.f206316f, contentLoaded.f206317g, arrayList, contentLoaded.f206319i, dVar, aVar3 != null ? new v20.d(aVar3.f206331a, aVar3.f206332b) : null, false, false, contentLoaded.f206322l);
            }
            MotivationInternalAction.ContentLoaded.InternalProgressStep internalProgressStep = (MotivationInternalAction.ContentLoaded.InternalProgressStep) it.next();
            aVar.getClass();
            int iOrdinal = internalProgressStep.f206324b.ordinal();
            if (iOrdinal == 0) {
                uiProgressStepState = UiProgressStep.UiProgressStepState.f206339b;
            } else if (iOrdinal == 1) {
                uiProgressStepState = UiProgressStep.UiProgressStepState.f206340c;
            } else if (iOrdinal == 2) {
                uiProgressStepState = UiProgressStep.UiProgressStepState.f206341d;
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                uiProgressStepState = UiProgressStep.UiProgressStepState.f206342e;
            }
            arrayList.add(new UiProgressStep(internalProgressStep.f206323a, uiProgressStepState));
        }
    }
}
