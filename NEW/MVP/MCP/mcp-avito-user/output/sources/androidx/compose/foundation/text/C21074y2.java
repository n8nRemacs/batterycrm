package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.o;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;

/* compiled from: Effects.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/m0", "Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.y2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21074y2 implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f32280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f32281b;

    public C21074y2(InterfaceC22204y1 interfaceC22204y1, androidx.compose.foundation.interaction.m mVar) {
        this.f32280a = interfaceC22204y1;
        this.f32281b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        InterfaceC22204y1 interfaceC22204y1 = this.f32280a;
        o.b bVar = (o.b) interfaceC22204y1.getF42167b();
        if (bVar != null) {
            o.a aVar = new o.a(bVar);
            androidx.compose.foundation.interaction.m mVar = this.f32281b;
            if (mVar != null) {
                mVar.a(aVar);
            }
            interfaceC22204y1.setValue(null);
        }
    }
}
