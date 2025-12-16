package com.avito.android.cv_actualization.view.code_input.mvi;

import Y61.l;
import com.avito.android.cv_actualization.view.code_input.mvi.entity.JsxCvActualizationCodeInputInternalAction;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: JsxCvActualizationCodeInputBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_actualization/view/code_input/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/cv_actualization/view/code_input/mvi/entity/JsxCvActualizationCodeInputInternalAction;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.arch.mvi.b<JsxCvActualizationCodeInputInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    public final long f131189a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cv_actualization.view.code_input.mvi.domain.c f131190b;

    @Inject
    public c(@Named("NEXT_TRY_TIME") long j12, @Y61.k com.avito.android.cv_actualization.view.code_input.mvi.domain.c cVar) {
        this.f131189a = j12;
        this.f131190b = cVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<JsxCvActualizationCodeInputInternalAction> a() {
        return C43175k.N(this.f131190b.a(this.f131189a), new C43210w(new JsxCvActualizationCodeInputInternalAction.ScreenOpened()));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
