package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: CoreTextField.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class T0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f30544l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C21011f1 f30545m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f30546n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(androidx.compose.ui.v vVar, C21011f1 c21011f1, C22096n c22096n, int i12) {
        super(2);
        this.f30544l = vVar;
        this.f30545m = c21011f1;
        this.f30546n = c22096n;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(385);
        C21011f1 c21011f1 = this.f30545m;
        C22096n c22096n = this.f30546n;
        V0.b(this.f30544l, c21011f1, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
