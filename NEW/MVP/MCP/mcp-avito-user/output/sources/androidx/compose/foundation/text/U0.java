package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;

/* compiled from: CoreTextField.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class U0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21011f1 f30558l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f30559m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30560n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(C21011f1 c21011f1, boolean z12, int i12) {
        super(2);
        this.f30558l = c21011f1;
        this.f30559m = z12;
        this.f30560n = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f30560n | 1);
        V0.d(this.f30558l, this.f30559m, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
