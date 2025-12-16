package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: TimePicker.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.tk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21893tk extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f37353l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C21935vi f37354m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21893tk(androidx.compose.foundation.interaction.m mVar, C21935vi c21935vi) {
        super(2);
        this.f37353l = mVar;
        this.f37354m = c21935vi;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            C21542ec c21542ec = C21542ec.f36256a;
            d0.i0.f393440a.getClass();
            androidx.compose.ui.graphics.h1 h1VarA = He.a(d0.i0.f393441b, a13);
            c21542ec.a(true, false, this.f37353l, this.f37354m, h1VarA, 0.0f, 0.0f, a13, 12583350, 96);
        }
        return kotlin.G0.f406611a;
    }
}
