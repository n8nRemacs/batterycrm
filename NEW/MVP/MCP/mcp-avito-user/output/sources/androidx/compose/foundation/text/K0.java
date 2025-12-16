package androidx.compose.foundation.text;

import androidx.compose.runtime.C22082i3;
import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class K0 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20985q1 f30391l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f30392m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(C20985q1 c20985q1, long j12) {
        super(1);
        this.f30391l = c20985q1;
        this.f30392m = j12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
        androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
        C20985q1 c20985q1 = this.f30391l;
        if (((Boolean) ((C22082i3) c20985q1.f31796s).getF42167b()).booleanValue() || ((Boolean) ((C22082i3) c20985q1.f31797t).getF42167b()).booleanValue()) {
            androidx.compose.ui.graphics.drawscope.g.c0(gVar2, this.f30392m, 0L, 0L, 0.0f, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        return kotlin.G0.f406611a;
    }
}
