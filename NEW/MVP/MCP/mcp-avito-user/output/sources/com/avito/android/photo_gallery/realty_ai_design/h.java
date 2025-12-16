package com.avito.android.photo_gallery.realty_ai_design;

import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.ui.unit.q;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageComparisonSlider.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/q;", "invoke-Bjo55l4", "(Landroidx/compose/ui/unit/d;)J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements Y41.l<androidx.compose.ui.unit.d, q> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f217616l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f217617m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i12, InterfaceC22196w1 interfaceC22196w1) {
        super(1);
        this.f217616l = i12;
        this.f217617m = interfaceC22196w1;
    }

    @Override // Y41.l
    public final q invoke(androidx.compose.ui.unit.d dVar) {
        return q.a(((this.f217617m.e() - this.f217616l) << 32) | (0 & 4294967295L));
    }
}
