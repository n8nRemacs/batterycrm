package com.avito.beduin.v2.component.aspect_ratio.compose;

import Y41.l;
import androidx.compose.ui.layout.K0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AspectRatioComponent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements l<K0.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f335511l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ArrayList arrayList) {
        super(1);
        this.f335511l = arrayList;
    }

    @Override // Y41.l
    public final G0 invoke(K0.a aVar) {
        K0.a aVar2 = aVar;
        Iterator it = this.f335511l.iterator();
        while (it.hasNext()) {
            aVar2.h((K0) it.next(), 0, 0, 0.0f);
        }
        return G0.f406611a;
    }
}
