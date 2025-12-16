package com.avito.android.publish.screen.objects;

import Ge0.InterfaceC13872a;
import com.avito.android.blueprints.publish.date_interval.c;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ObjectFillFormInternalRouter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newValue", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements Y41.l<Long, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.a f240167l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.C29377e f240168m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f240169n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c.a aVar, ParameterElement.C29377e c29377e, e eVar) {
        super(1);
        this.f240167l = aVar;
        this.f240168m = c29377e;
        this.f240169n = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(Long l12) {
        long jLongValue = l12.longValue();
        ParameterElement.C29376d c29376d = this.f240167l.f106126a;
        Long lValueOf = Long.valueOf(jLongValue);
        ParameterElement.C29377e c29377e = this.f240168m;
        InterfaceC13872a.o.C0360a c0360a = new InterfaceC13872a.o.C0360a(c29376d, c29377e, lValueOf, c29377e.f117413j, false);
        e eVar = this.f240169n;
        eVar.f240144c.invoke(c0360a);
        eVar.f240144c.invoke(new InterfaceC13872a.o.d(null, 1, null));
        return G0.f406611a;
    }
}
