package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C21008e1;
import androidx.compose.ui.text.v0;
import kotlin.Metadata;

/* compiled from: TextFieldKeyInput.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/e1;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/text/selection/e1;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.l2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20966l2 extends kotlin.jvm.internal.N implements Y41.l<C21008e1, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final C20966l2 f31568l = new C20966l2();

    public C20966l2() {
        super(1);
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(C21008e1 c21008e1) {
        C21008e1 c21008e12 = c21008e1;
        androidx.compose.foundation.text.selection.C1 c12 = c21008e12.f32037e;
        c12.f31828a = null;
        if (c21008e12.f32039g.f42127c.length() > 0) {
            if (c21008e12.e()) {
                c12.f31828a = null;
                if (c21008e12.f32039g.f42127c.length() > 0) {
                    String str = c21008e12.f32039g.f42127c;
                    long j12 = c21008e12.f32038f;
                    v0.a aVar = androidx.compose.ui.text.v0.f42734b;
                    int iA2 = O1.a((int) (j12 & 4294967295L), str);
                    if (iA2 != -1) {
                        c21008e12.l(iA2, iA2);
                    }
                }
            } else {
                c12.f31828a = null;
                if (c21008e12.f32039g.f42127c.length() > 0) {
                    String str2 = c21008e12.f32039g.f42127c;
                    long j13 = c21008e12.f32038f;
                    v0.a aVar2 = androidx.compose.ui.text.v0.f42734b;
                    int iB2 = O1.b((int) (j13 & 4294967295L), str2);
                    if (iB2 != -1) {
                        c21008e12.l(iB2, iB2);
                    }
                }
            }
        }
        return kotlin.G0.f406611a;
    }
}
