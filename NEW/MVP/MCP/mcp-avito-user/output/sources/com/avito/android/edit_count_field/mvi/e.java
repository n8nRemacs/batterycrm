package com.avito.android.edit_count_field.mvi;

import Y41.l;
import com.avito.android.arch.mvi.q;
import com.avito.android.edit_count_field.mvi.entity.EditCountFieldInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import uy.C49127c;
import uy.InterfaceC49125a;
import uy.InterfaceC49126b;

/* compiled from: EditCountFieldFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Luy/a;", "Lcom/avito/android/edit_count_field/mvi/entity/EditCountFieldInternalAction;", "Luy/c;", "Luy/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements l<q<InterfaceC49125a, EditCountFieldInternalAction, C49127c, InterfaceC49126b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f146639l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f146640m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f146641n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, j jVar, h hVar) {
        super(1);
        this.f146639l = cVar;
        this.f146640m = jVar;
        this.f146641n = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC49125a, EditCountFieldInternalAction, C49127c, InterfaceC49126b> qVar) {
        q<InterfaceC49125a, EditCountFieldInternalAction, C49127c, InterfaceC49126b> qVar2 = qVar;
        qVar2.f92009e = this.f146639l;
        qVar2.f92011g = this.f146640m;
        qVar2.f92010f = this.f146641n;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
