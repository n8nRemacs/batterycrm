package com.avito.android.mortgage.sign;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SignScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/draw/i;", "Landroidx/compose/ui/draw/p;", "invoke", "(Landroidx/compose/ui/draw/i;)Landroidx/compose/ui/draw/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class s extends N implements Y41.l<androidx.compose.ui.draw.i, androidx.compose.ui.draw.p> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f203808l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f203809m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f203810n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f203811o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(long j12, float f12, float f13, float f14) {
        super(1);
        this.f203808l = f12;
        this.f203809m = f13;
        this.f203810n = f14;
        this.f203811o = j12;
    }

    @Override // Y41.l
    public final androidx.compose.ui.draw.p invoke(androidx.compose.ui.draw.i iVar) {
        return iVar.f(new r(this.f203811o, this.f203808l, this.f203809m, this.f203810n));
    }
}
