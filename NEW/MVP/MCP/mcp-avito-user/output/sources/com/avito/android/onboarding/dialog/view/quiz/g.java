package com.avito.android.onboarding.dialog.view.quiz;

import Y41.p;
import Y61.k;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.onboarding.dialog.view.quiz.b;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: OnboardingQuizView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/view/quiz/g;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p<com.avito.android.lib.design.chips.h, Boolean, G0> f209065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f209066b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(p<? super com.avito.android.lib.design.chips.h, ? super Boolean, G0> pVar, f fVar) {
        this.f209065a = pVar;
        this.f209066b = fVar;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@k com.avito.android.lib.design.chips.h hVar) {
        ((b.a) this.f209065a).invoke(hVar, Boolean.FALSE);
        this.f209066b.f209062i.setEnabled(!((ArrayList) r3.f209061h.s()).isEmpty());
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@k com.avito.android.lib.design.chips.h hVar) {
        ((b.a) this.f209065a).invoke(hVar, Boolean.TRUE);
        this.f209066b.f209062i.setEnabled(!((ArrayList) r3.f209061h.s()).isEmpty());
    }
}
