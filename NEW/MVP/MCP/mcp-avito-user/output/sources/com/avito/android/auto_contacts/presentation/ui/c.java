package com.avito.android.auto_contacts.presentation.ui;

import com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesUiState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ze.InterfaceC50551a;

/* compiled from: AutoContactsPackagesStateScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC50551a, G0> f94973l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AutoContactsPackagesUiState f94974m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Y41.l<? super InterfaceC50551a, G0> lVar, AutoContactsPackagesUiState autoContactsPackagesUiState) {
        super(0);
        this.f94973l = lVar;
        this.f94974m = autoContactsPackagesUiState;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f94973l.invoke(new InterfaceC50551a.b(((AutoContactsPackagesUiState.Success) this.f94974m).f94957b.f94883e.f94877d));
        return G0.f406611a;
    }
}
