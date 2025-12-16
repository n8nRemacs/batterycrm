package com.avito.android.select.sectioned_multiselect.core;

import Xp0.AbstractC17036a;
import Zp0.InterfaceC19587b;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import l41.InterfaceC43543a;

/* compiled from: SectionedMultiselectDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LXp0/a;", "it", "Lkotlin/G0;", "accept", "(LXp0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class A<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f266466b;

    public A(K k12) {
        this.f266466b = k12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        io.reactivex.rxjava3.core.z<Zp0.e> zVarA;
        AbstractC17036a abstractC17036a = (AbstractC17036a) obj;
        K k12 = this.f266466b;
        io.reactivex.rxjava3.disposables.i iVar = k12.f266499x;
        if (iVar != null) {
            boolean zF2 = kotlin.jvm.internal.L.f(abstractC17036a, AbstractC17036a.c.f19077a);
            com.avito.android.select.g gVar = k12.f266476a;
            if (zF2) {
                zVarA = gVar.b(k12.f266491p);
            } else {
                if (!(abstractC17036a instanceof AbstractC17036a.C1350a ? true : kotlin.jvm.internal.L.f(abstractC17036a, AbstractC17036a.b.f19076a))) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC19587b interfaceC19587b = k12.f266497v;
                zVarA = interfaceC19587b != null ? gVar.a(interfaceC19587b) : io.reactivex.rxjava3.core.z.c0(new Zp0.e(C42784z0.f406748b, null));
            }
            InterfaceC35745a5 interfaceC35745a5 = k12.f266477b;
            I0 i0J0 = zVarA.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e());
            C34660j c34660j = new C34660j(abstractC17036a, k12);
            InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
            iVar.a(i0J0.J(interfaceC43543a, c34660j).v0(new C34661k(k12), new C34662l(abstractC17036a, k12), interfaceC43543a));
        }
    }
}
