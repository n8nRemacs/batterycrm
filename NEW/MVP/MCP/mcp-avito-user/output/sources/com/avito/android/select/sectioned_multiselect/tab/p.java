package com.avito.android.select.sectioned_multiselect.tab;

import Zp0.InterfaceC19587b;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: SectionedMultiselectTabPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LXp0/a;", "it", "Lkotlin/G0;", "accept", "(LXp0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f266800b;

    public p(n nVar) {
        this.f266800b = nVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        io.reactivex.rxjava3.disposables.i iVar;
        n nVar = this.f266800b;
        com.avito.android.select.g gVar = nVar.f266789j;
        if (gVar == null || (iVar = nVar.f266795p) == null) {
            return;
        }
        InterfaceC19587b f266527t = nVar.f266785f.getF266527T();
        z<Zp0.e> zVarA = f266527t != null ? gVar.a(f266527t) : z.c0(new Zp0.e(C42784z0.f406748b, null));
        InterfaceC35745a5 interfaceC35745a5 = nVar.f266784e;
        iVar.a(zVarA.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new d(nVar), new e(nVar), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}
