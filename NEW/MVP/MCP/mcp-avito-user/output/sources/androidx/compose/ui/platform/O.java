package androidx.compose.ui.platform;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: AndroidCompositionLocals.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class O extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f41179l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f41180m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(AndroidComposeView androidComposeView, C22096n c22096n, int i12) {
        super(2);
        this.f41179l = androidComposeView;
        this.f41180m = c22096n;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        AndroidCompositionLocals_androidKt.a(this.f41179l, this.f41180m, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
