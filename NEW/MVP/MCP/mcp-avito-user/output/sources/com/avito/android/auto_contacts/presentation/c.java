package com.avito.android.auto_contacts.presentation;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.r;
import com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesUiState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ze.InterfaceC50551a;

/* compiled from: AutoContactsPackagesActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoContactsPackagesUiState f94921l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<InterfaceC50551a, G0> f94922m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, AutoContactsPackagesUiState autoContactsPackagesUiState) {
        super(2);
        this.f94921l = autoContactsPackagesUiState;
        this.f94922m = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, r.c(-633256199, new b(this.f94922m, this.f94921l), a13), a13, 48, 1);
        }
        return G0.f406611a;
    }
}
