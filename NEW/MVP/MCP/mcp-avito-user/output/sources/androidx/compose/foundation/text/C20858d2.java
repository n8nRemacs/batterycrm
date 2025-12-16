package androidx.compose.foundation.text;

import kotlin.Metadata;

/* compiled from: TextFieldDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/A0;", "matrix", "Lkotlin/G0;", "invoke-58bKbWc", "([F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20858d2 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.A0, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.A f30691l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20858d2(androidx.compose.ui.layout.A a12) {
        super(1);
        this.f30691l = a12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.A0 a02) {
        float[] fArr = a02.f39216a;
        androidx.compose.ui.layout.A a12 = this.f30691l;
        if (a12.m()) {
            androidx.compose.ui.layout.B.c(a12).B(a12, fArr);
        }
        return kotlin.G0.f406611a;
    }
}
