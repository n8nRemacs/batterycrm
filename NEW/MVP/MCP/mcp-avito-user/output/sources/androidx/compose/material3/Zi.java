package androidx.compose.material3;

import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/F8;", "it", "Landroidx/compose/ui/graphics/T;", "invoke-XeAY9LY", "(Landroidx/compose/material3/F8;Landroidx/compose/runtime/A;I)J", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Zi extends kotlin.jvm.internal.N implements Y41.q<F8, androidx.compose.runtime.A, Integer, androidx.compose.ui.graphics.T> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21935vi f36005l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f36006m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f36007n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.k f36008o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zi(C21935vi c21935vi, boolean z12, boolean z13, androidx.compose.foundation.interaction.k kVar) {
        super(3);
        this.f36005l = c21935vi;
        this.f36006m = z12;
        this.f36007n = z13;
        this.f36008o = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.q
    public final androidx.compose.ui.graphics.T invoke(F8 f82, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        num.intValue();
        a13.I(-502832279);
        C21935vi c21935vi = this.f36005l;
        c21935vi.getClass();
        a13.I(1167161306);
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(androidx.compose.ui.graphics.T.a(!this.f36006m ? c21935vi.f37626z : this.f36007n ? c21935vi.f37584A : ((Boolean) androidx.compose.foundation.interaction.f.a(this.f36008o, a13, 0).getF42167b()).booleanValue() ? c21935vi.f37624x : c21935vi.f37625y), a13);
        a13.O();
        long j12 = ((androidx.compose.ui.graphics.T) interfaceC22204y1M.getF42167b()).f39331a;
        a13.O();
        return androidx.compose.ui.graphics.T.a(j12);
    }
}
