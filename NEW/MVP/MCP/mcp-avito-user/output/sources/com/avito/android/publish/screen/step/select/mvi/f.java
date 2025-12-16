package com.avito.android.publish.screen.step.select.mvi;

import Ne0.InterfaceC14566a;
import Ne0.InterfaceC14567b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC33878l;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SelectActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/screen/step/select/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "LNe0/a;", "LNe0/b;", "LNe0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements com.avito.android.arch.mvi.a<InterfaceC14566a, InterfaceC14567b, Ne0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f242197a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C0 f242198b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.step.select.loader.a f242199c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33878l f242200d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f242201e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f242202f;

    @Inject
    public f(@Y61.k com.avito.android.details.a aVar, @Y61.k C0 c02, @Y61.k com.avito.android.publish.screen.step.select.loader.a aVar2, @Y61.k InterfaceC33878l interfaceC33878l, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar3) {
        this.f242197a = aVar;
        this.f242198b = c02;
        this.f242199c = aVar2;
        this.f242200d = interfaceC33878l;
        this.f242201e = interfaceC33535v;
        this.f242202f = aVar3;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC14567b> b(InterfaceC14566a interfaceC14566a, Ne0.d dVar) {
        InterfaceC14566a interfaceC14566a2 = interfaceC14566a;
        if (interfaceC14566a2 instanceof InterfaceC14566a.c) {
            return new C43210w(new InterfaceC14567b.a(((InterfaceC14566a.c) interfaceC14566a2).f11660a));
        }
        if (interfaceC14566a2.equals(InterfaceC14566a.C0750a.f11658a)) {
            return new C43210w(InterfaceC14567b.c.f11673a);
        }
        if (interfaceC14566a2.equals(InterfaceC14566a.b.f11659a) ? true : interfaceC14566a2.equals(InterfaceC14566a.g.f11665a)) {
            return C43175k.G(new a(this, null));
        }
        if (interfaceC14566a2.equals(InterfaceC14566a.j.f11668a)) {
            return C43175k.G(new b(this, null));
        }
        if (interfaceC14566a2 instanceof InterfaceC14566a.h) {
            return new C43210w(new InterfaceC14567b.e(((InterfaceC14566a.h) interfaceC14566a2).f11666a));
        }
        if (interfaceC14566a2 instanceof InterfaceC14566a.e) {
            return C43175k.G(new c(this, interfaceC14566a2, null));
        }
        if (interfaceC14566a2 instanceof InterfaceC14566a.f) {
            return C43175k.G(new d(this, interfaceC14566a2, null));
        }
        if (interfaceC14566a2 instanceof InterfaceC14566a.d) {
            return new C43210w(new InterfaceC14567b.d(((InterfaceC14566a.d) interfaceC14566a2).f11661a));
        }
        if (interfaceC14566a2 instanceof InterfaceC14566a.k) {
            return this.f242199c.load();
        }
        if (interfaceC14566a2 instanceof InterfaceC14566a.i) {
            return C43175k.G(new e(this, ((InterfaceC14566a.i) interfaceC14566a2).f11667a, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final SelectParameter c() {
        ParametersTree parametersTreeWa = this.f242197a.wa();
        if (parametersTreeWa != null) {
            return (SelectParameter) parametersTreeWa.getFirstParameterOfType(SelectParameter.class);
        }
        return null;
    }
}
