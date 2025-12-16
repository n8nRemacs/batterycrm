package com.avito.android.verification.verification_form_builder.mvi;

import TM0.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.select.Arguments;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.verification.inn.list.button.ButtonItem;
import com.avito.android.verification.inn.list.select.SelectItem;
import com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FormBuilderActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "LTM0/a;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "LTM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements com.avito.android.arch.mvi.a<TM0.a, FormBuilderInternalAction, TM0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.verification_form_builder.h f325453a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f325454b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f325455c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.inn.n f325456d;

    @Inject
    public g(@Y61.k com.avito.android.verification.verification_form_builder.h hVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k com.avito.android.verification.inn.n nVar) {
        this.f325453a = hVar;
        this.f325454b = aVar;
        this.f325455c = interfaceC35741a1;
        this.f325456d = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.verification.verification_form_builder.mvi.g r5, kotlinx.coroutines.flow.InterfaceC43172j r6, TM0.c r7, Y41.l r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.verification_form_builder.mvi.g.c(com.avito.android.verification.verification_form_builder.mvi.g, kotlinx.coroutines.flow.j, TM0.c, Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<FormBuilderInternalAction> b(TM0.a aVar, TM0.c cVar) {
        C43210w c43210w;
        TM0.a aVar2 = aVar;
        TM0.c cVar2 = cVar;
        if (aVar2.equals(a.g.f15618a)) {
            return this.f325453a.a();
        }
        if (aVar2.equals(a.d.f15614a)) {
            return C43175k.G(new c(cVar2, null));
        }
        if (aVar2 instanceof a.C1065a) {
            return C43175k.G(new a(((a.C1065a) aVar2).f15610a, this, cVar2, null));
        }
        if (aVar2 instanceof a.c) {
            return C43175k.G(new d(cVar2, (a.c) aVar2, null));
        }
        if (aVar2 instanceof a.b) {
            return C43175k.G(new e(this, aVar2, null));
        }
        if (!(aVar2 instanceof a.e)) {
            if (!(aVar2 instanceof a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            a.f fVar = (a.f) aVar2;
            return new C43210w(new FormBuilderInternalAction.SetSelectValue(fVar.f15616a, fVar.f15617b));
        }
        com.avito.conveyor_item.a aVar3 = ((a.e) aVar2).f15615a;
        if (aVar3 instanceof ButtonItem) {
            return C43175k.G(new b((ButtonItem) aVar3, this, cVar2, null));
        }
        if (aVar3 instanceof com.avito.android.verification.inn.list.disclosure.a) {
            c43210w = new C43210w(FormBuilderInternalAction.UpdateHidden.f325445b);
        } else {
            if (aVar3 instanceof SelectItem) {
                SelectItem selectItem = (SelectItem) aVar3;
                return new C43210w(new FormBuilderInternalAction.ShowSelect(new Arguments(false, selectItem.f324058b, null, selectItem.f324065i, C42745f0.V(selectItem.f324066j), selectItem.f324063g, null, false, false, false, false, false, true, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, false, false, 0, null, null, -7355, 255, null)));
            }
            if (aVar3 instanceof com.avito.android.verification.inn.list.inn_info.a) {
                c43210w = new C43210w(FormBuilderInternalAction.BackAction.f325433b);
            } else {
                if (!(aVar3 instanceof com.avito.android.verification.inn.list.checkbox.a)) {
                    return C43175k.w();
                }
                c43210w = new C43210w(FormBuilderInternalAction.UpdateHidden.f325445b);
            }
        }
        return c43210w;
    }
}
