package sberid.sdk.ui.screens.compose.elk.root;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.fragment.app.ActivityC22955m;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f437807l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ActivityC22955m f437808m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f437809n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i12, androidx.compose.ui.v vVar, ActivityC22955m activityC22955m) {
        super(2);
        this.f437807l = vVar;
        this.f437808m = activityC22955m;
        this.f437809n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f437809n | 1);
        ActivityC22955m activityC22955m = this.f437808m;
        i.a(this.f437807l, activityC22955m, a12, iA2);
        return G0.f406611a;
    }
}
