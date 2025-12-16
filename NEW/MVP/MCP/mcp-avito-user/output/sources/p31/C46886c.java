package p31;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import androidx.fragment.app.ActivityC22955m;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* renamed from: p31.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46886c extends N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ActivityC22955m f428163l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f428164m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f428165n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46886c(int i12, v vVar, ActivityC22955m activityC22955m) {
        super(2);
        this.f428163l = activityC22955m;
        this.f428164m = vVar;
        this.f428165n = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f428165n | 1);
        AbstractC46887d.a(this.f428163l, (A) obj, iA2);
        return G0.f406611a;
    }
}
