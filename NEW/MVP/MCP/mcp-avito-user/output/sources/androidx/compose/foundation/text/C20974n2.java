package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C21008e1;
import androidx.compose.ui.text.input.C22643i;
import androidx.compose.ui.text.input.InterfaceC22645k;
import androidx.compose.ui.text.v0;
import kotlin.Metadata;

/* compiled from: TextFieldKeyInput.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/e1;", "Landroidx/compose/ui/text/input/k;", "invoke", "(Landroidx/compose/foundation/text/selection/e1;)Landroidx/compose/ui/text/input/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20974n2 extends kotlin.jvm.internal.N implements Y41.l<C21008e1, InterfaceC22645k> {

    /* renamed from: l, reason: collision with root package name */
    public static final C20974n2 f31750l = new C20974n2();

    public C20974n2() {
        super(1);
    }

    @Override // Y41.l
    public final InterfaceC22645k invoke(C21008e1 c21008e1) {
        C21008e1 c21008e12 = c21008e1;
        String str = c21008e12.f32039g.f42127c;
        long j12 = c21008e12.f32038f;
        v0.a aVar = androidx.compose.ui.text.v0.f42734b;
        int iA2 = O1.a((int) (j12 & 4294967295L), str);
        if (iA2 != -1) {
            return new C22643i(0, iA2 - ((int) (c21008e12.f32038f & 4294967295L)));
        }
        return null;
    }
}
