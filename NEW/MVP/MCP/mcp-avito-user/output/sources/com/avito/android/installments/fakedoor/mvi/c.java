package com.avito.android.installments.fakedoor.mvi;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.credits.di.n;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FakedoorBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/installments/fakedoor/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "LTN/b;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.arch.mvi.b<TN.b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.installments.fakedoor.e f172566a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f172567b;

    @Inject
    public c(@k com.avito.android.installments.fakedoor.e eVar, @n boolean z12) {
        this.f172566a = eVar;
        this.f172567b = z12;
    }

    @Override // com.avito.android.arch.mvi.b
    @k
    public final InterfaceC43160i<TN.b> a() {
        return this.f172567b ? C43175k.w() : this.f172566a.a();
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
