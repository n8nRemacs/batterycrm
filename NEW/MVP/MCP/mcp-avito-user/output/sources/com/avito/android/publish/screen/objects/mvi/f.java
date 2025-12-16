package com.avito.android.publish.screen.objects.mvi;

import Ge0.InterfaceC13872a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ObjectFillFormActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/screen/objects/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "LGe0/a;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "LGe0/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements com.avito.android.arch.mvi.a<InterfaceC13872a, ObjectFillFormInternalAction, Ge0.f> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.objects.domain.a f240221a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.objects.domain.d f240222b;

    @Inject
    public f(@Y61.k com.avito.android.publish.screen.objects.domain.a aVar, @Y61.k com.avito.android.publish.screen.objects.domain.d dVar) {
        this.f240221a = aVar;
        this.f240222b = dVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ObjectFillFormInternalAction> b(InterfaceC13872a interfaceC13872a, Ge0.f fVar) {
        C43210w c43210w;
        InterfaceC13872a interfaceC13872a2 = interfaceC13872a;
        boolean z12 = interfaceC13872a2 instanceof InterfaceC13872a.k;
        com.avito.android.publish.screen.objects.domain.a aVar = this.f240221a;
        if (z12) {
            return aVar.k1();
        }
        if (interfaceC13872a2 instanceof InterfaceC13872a.f) {
            c43210w = new C43210w(ObjectFillFormInternalAction.ShowDeleteObjectDialog.f240212b);
        } else {
            if (!(interfaceC13872a2 instanceof InterfaceC13872a.c)) {
                if (interfaceC13872a2 instanceof InterfaceC13872a.b) {
                    return C43175k.G(new b(((InterfaceC13872a.b) interfaceC13872a2).f6631a, this, null));
                }
                if (interfaceC13872a2 instanceof InterfaceC13872a.l) {
                    return C43175k.G(new c((InterfaceC13872a.l) interfaceC13872a2, this, null));
                }
                if (interfaceC13872a2 instanceof InterfaceC13872a.C0359a) {
                    return C43175k.G(new a(((InterfaceC13872a.C0359a) interfaceC13872a2).f6630a, this, null));
                }
                if (interfaceC13872a2 instanceof InterfaceC13872a.e) {
                    return new C43210w(new ObjectFillFormInternalAction.OpenDeepLink(((InterfaceC13872a.e) interfaceC13872a2).f6634a));
                }
                if (interfaceC13872a2 instanceof InterfaceC13872a.g) {
                    return aVar.C1();
                }
                if (interfaceC13872a2 instanceof InterfaceC13872a.o) {
                    return C43175k.G(new d(this, interfaceC13872a2, null));
                }
                if (interfaceC13872a2 instanceof InterfaceC13872a.i) {
                    return C43175k.G(new e(this, interfaceC13872a2, null));
                }
                if (interfaceC13872a2 instanceof InterfaceC13872a.m) {
                    return new C43210w(new ObjectFillFormInternalAction.PriceListInputFocusChanged(((InterfaceC13872a.m) interfaceC13872a2).f6642a));
                }
                if (interfaceC13872a2 instanceof InterfaceC13872a.n ? true : interfaceC13872a2 instanceof InterfaceC13872a.d ? true : interfaceC13872a2 instanceof InterfaceC13872a.h ? true : interfaceC13872a2 instanceof InterfaceC13872a.j ? true : interfaceC13872a2 instanceof InterfaceC13872a.p) {
                    return C43175k.w();
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(ObjectFillFormInternalAction.LeaveScreen.f240198b);
        }
        return c43210w;
    }
}
