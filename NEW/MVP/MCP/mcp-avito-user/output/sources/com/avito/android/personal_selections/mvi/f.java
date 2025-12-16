package com.avito.android.personal_selections.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.personal_selections.mvi.entity.PersonalSelectionsItemState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import l70.InterfaceC43570a;

/* compiled from: PersonalSelectionsItemActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/personal_selections/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "Ll70/a;", "Ll70/b;", "Lcom/avito/android/personal_selections/mvi/entity/PersonalSelectionsItemState;", "_avito_personal-selections_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements com.avito.android.arch.mvi.a<InterfaceC43570a, l70.b, PersonalSelectionsItemState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.personal_selections.domain.b f215819a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.personal_selections.domain.a f215820b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f215821c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f215822d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a f215823e;

    @Inject
    public f(@Y61.k com.avito.android.personal_selections.domain.b bVar, @Y61.k com.avito.android.personal_selections.domain.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k a aVar3) {
        this.f215819a = bVar;
        this.f215820b = aVar;
        this.f215821c = aVar2;
        this.f215822d = interfaceC28373a;
        this.f215823e = aVar3;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new d(this, aVar, null), C43175k.N(new c(new b(this.f215820b.getData())), c43197r1));
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<l70.b> b(InterfaceC43570a interfaceC43570a, PersonalSelectionsItemState personalSelectionsItemState) {
        return C43175k.G(new e(interfaceC43570a, personalSelectionsItemState, this, null));
    }
}
