package com.avito.android.evidence_request.details.validation;

import Ba1.B;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.validation.Structure;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.List;
import kotlin.Metadata;
import l41.o;

/* compiled from: EvidenceValidationFormInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/validation/Structure;", "it", "Lio/reactivex/rxjava3/core/O;", "LVz/b;", "apply", "(Lcom/avito/android/remote/model/validation/Structure;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class h<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f148571b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<ParameterSlot> f148572c;

    /* JADX WARN: Multi-variable type inference failed */
    public h(i iVar, List<? extends ParameterSlot> list) {
        this.f148571b = iVar;
        this.f148572c = list;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Structure structure = (Structure) obj;
        i iVar = this.f148571b;
        iVar.getClass();
        C42006d c42006d = new C42006d(new B(28, iVar, structure));
        InterfaceC35745a5 interfaceC35745a5 = iVar.f148575c;
        return I.G(c42006d.z(interfaceC35745a5.c()), new C42006d(new FX0.b(iVar, this.f148572c, structure, 7)).z(interfaceC35745a5.c()), g.f148570b);
    }
}
