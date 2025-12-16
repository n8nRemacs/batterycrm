package com.avito.android.location_picker.view.radius;

import Y41.p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RadiusListItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "chipable", "", "isSelected", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements p<com.avito.android.lib.design.chips.h, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f182789l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f182790m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ArrayList arrayList, f fVar) {
        super(2);
        this.f182789l = arrayList;
        this.f182790m = fVar;
    }

    @Override // Y41.p
    public final G0 invoke(com.avito.android.lib.design.chips.h hVar, Boolean bool) {
        Object next;
        com.avito.android.lib.design.chips.h hVar2 = hVar;
        Boolean bool2 = bool;
        bool2.getClass();
        Iterator it = this.f182789l.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((a) next).f182785b, ((a) hVar2).f182785b)) {
                break;
            }
        }
        a aVar = (a) next;
        if (aVar != null) {
            aVar.f182787d = bool2;
            this.f182790m.f182791a.accept(aVar);
        }
        return G0.f406611a;
    }
}
