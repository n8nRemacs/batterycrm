package com.avito.android.lib.compose.design.shared.blur_overlay_box;

import Y41.l;
import android.graphics.Picture;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BlurOverlayBox.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements l<androidx.compose.ui.graphics.drawscope.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Picture f177664l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f177665m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f177666n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f177667o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Picture picture, int i12, int i13, InterfaceC22204y1<Boolean> interfaceC22204y1) {
        super(1);
        this.f177664l = picture;
        this.f177665m = i12;
        this.f177666n = i13;
        this.f177667o = interfaceC22204y1;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
        androidx.compose.ui.graphics.drawscope.d dVar2 = dVar;
        int i12 = this.f177665m;
        int i13 = this.f177666n;
        Picture picture = this.f177664l;
        C22245c c22245cA = C22247d.a(picture.beginRecording(i12, i13));
        LayoutDirection layoutDirection = dVar2.getLayoutDirection();
        long jI2 = dVar2.i();
        androidx.compose.ui.unit.d dVarB = dVar2.getF39478c().b();
        LayoutDirection layoutDirectionD = dVar2.getF39478c().d();
        M mA2 = dVar2.getF39478c().a();
        long jE2 = dVar2.getF39478c().e();
        C22267c c22267c = dVar2.getF39478c().f39486b;
        a.b f39478c = dVar2.getF39478c();
        f39478c.g(dVar2);
        f39478c.i(layoutDirection);
        f39478c.f(c22245cA);
        f39478c.j(jI2);
        f39478c.f39486b = null;
        c22245cA.k();
        try {
            dVar2.y1();
            c22245cA.i();
            a.b f39478c2 = dVar2.getF39478c();
            f39478c2.g(dVarB);
            f39478c2.i(layoutDirectionD);
            f39478c2.f(mA2);
            f39478c2.j(jE2);
            f39478c2.f39486b = c22267c;
            picture.endRecording();
            ((C22245c) dVar2.getF39478c().a()).f39351a.drawPicture(picture);
            this.f177667o.setValue(Boolean.TRUE);
            return G0.f406611a;
        } catch (Throwable th2) {
            c22245cA.i();
            a.b f39478c3 = dVar2.getF39478c();
            f39478c3.g(dVarB);
            f39478c3.i(layoutDirectionD);
            f39478c3.f(mA2);
            f39478c3.j(jE2);
            f39478c3.f39486b = c22267c;
            throw th2;
        }
    }
}
