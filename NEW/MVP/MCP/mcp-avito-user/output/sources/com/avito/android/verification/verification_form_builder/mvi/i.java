package com.avito.android.verification.verification_form_builder.mvi;

import com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FormBuilderBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/mvi/i;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements com.avito.android.arch.mvi.b<FormBuilderInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.verification_form_builder.h f325461a;

    @Inject
    public i(@Y61.k com.avito.android.verification.verification_form_builder.h hVar) {
        this.f325461a = hVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<FormBuilderInternalAction> a() {
        return this.f325461a.a();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
