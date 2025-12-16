package com.avito.android.blueprint.chips.multiple;

import JO.m;
import Y41.p;
import com.avito.android.category_parameters.ParameterElement;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishChipsMultiplePresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "chipable", "", "isSelected", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements p<com.avito.android.lib.design.chips.h, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.v f105414l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f105415m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ParameterElement.v vVar, f fVar) {
        super(2);
        this.f105414l = vVar;
        this.f105415m = fVar;
    }

    @Override // Y41.p
    public final G0 invoke(com.avito.android.lib.design.chips.h hVar, Boolean bool) {
        Object next;
        com.avito.android.lib.design.chips.h hVar2 = hVar;
        boolean zBooleanValue = bool.booleanValue();
        ParameterElement.v vVar = this.f105414l;
        Iterator<T> it = vVar.f117545f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((m) next).f8961b, ((com.avito.android.blueprints.chips.a) hVar2).f105838b)) {
                break;
            }
        }
        m mVar = (m) next;
        if (mVar != null) {
            mVar.f8964e = zBooleanValue;
            String str = vVar.f117181b;
            this.f105415m.f105418b.accept(new Ij.b(str, mVar, null, 4, null));
        }
        return G0.f406611a;
    }
}
