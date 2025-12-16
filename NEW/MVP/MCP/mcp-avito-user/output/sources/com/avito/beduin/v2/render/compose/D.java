package com.avito.beduin.v2.render.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RecompositionModifiers.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/draw/i;", "Landroidx/compose/ui/draw/p;", "invoke", "(Landroidx/compose/ui/draw/i;)Landroidx/compose/ui/draw/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class D extends N implements Y41.l<androidx.compose.ui.draw.i, androidx.compose.ui.draw.p> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long[] f338035l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Long> f338036m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Long[] lArr, InterfaceC22204y1 interfaceC22204y1) {
        super(1);
        this.f338035l = lArr;
        this.f338036m = interfaceC22204y1;
    }

    @Override // Y41.l
    public final androidx.compose.ui.draw.p invoke(androidx.compose.ui.draw.i iVar) {
        return iVar.m(new C(this.f338035l, this.f338036m));
    }
}
