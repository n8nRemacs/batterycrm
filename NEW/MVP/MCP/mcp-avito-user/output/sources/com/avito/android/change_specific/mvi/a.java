package com.avito.android.change_specific.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.change_specific.ExtendedProfileChangeSpecificArguments;
import com.avito.android.change_specific.mvi.entity.ExtendedProfileChangeSpecificInternalAction;
import com.avito.android.remote.model.Specific;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import lo.C43810c;
import lo.InterfaceC43808a;

/* compiled from: ExtendedProfileChangeSpecificActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/change_specific/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Llo/a;", "Lcom/avito/android/change_specific/mvi/entity/ExtendedProfileChangeSpecificInternalAction;", "Llo/c;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC43808a, ExtendedProfileChangeSpecificInternalAction, C43810c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileChangeSpecificArguments f118012a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.change_specific.j f118013b;

    @Inject
    public a(@Y61.k ExtendedProfileChangeSpecificArguments extendedProfileChangeSpecificArguments, @Y61.k com.avito.android.change_specific.j jVar) {
        this.f118012a = extendedProfileChangeSpecificArguments;
        this.f118013b = jVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ExtendedProfileChangeSpecificInternalAction> b(InterfaceC43808a interfaceC43808a, C43810c c43810c) {
        Object next;
        C43210w c43210w;
        InterfaceC43808a interfaceC43808a2 = interfaceC43808a;
        C43810c c43810c2 = c43810c;
        boolean z12 = interfaceC43808a2 instanceof InterfaceC43808a.c;
        com.avito.android.change_specific.j jVar = this.f118013b;
        if (z12) {
            return jVar.b();
        }
        if (interfaceC43808a2 instanceof InterfaceC43808a.C11802a) {
            c43210w = new C43210w(ExtendedProfileChangeSpecificInternalAction.CloseScreen.f118023b);
        } else {
            if (interfaceC43808a2 instanceof InterfaceC43808a.d) {
                return new C43210w(new ExtendedProfileChangeSpecificInternalAction.SelectSpecific(((InterfaceC43808a.d) interfaceC43808a2).f414201a));
            }
            if (!(interfaceC43808a2 instanceof InterfaceC43808a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Integer num = c43810c2.f414209d;
            Integer num2 = c43810c2.f414210e;
            if (!L.f(num, num2)) {
                if (num2 == null || !this.f118012a.f117866b) {
                    return num2 != null ? jVar.a(num2.intValue()) : C43175k.w();
                }
                int iIntValue = num2.intValue();
                Iterator<T> it = c43810c2.f414207b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((Specific) next).getId() == num2.intValue()) {
                        break;
                    }
                }
                Specific specific = (Specific) next;
                String title = specific != null ? specific.getTitle() : null;
                if (title == null) {
                    title = "";
                }
                return new C43210w(new ExtendedProfileChangeSpecificInternalAction.SelectSuccess(iIntValue, title));
            }
            c43210w = new C43210w(ExtendedProfileChangeSpecificInternalAction.CloseScreen.f118023b);
        }
        return c43210w;
    }
}
