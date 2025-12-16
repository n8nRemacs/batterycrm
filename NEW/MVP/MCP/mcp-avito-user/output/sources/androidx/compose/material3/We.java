package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class We extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21522df f35762l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f35763m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f35764n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Te f35765o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f35766p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f35767q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f35768r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public We(C21522df c21522df, androidx.compose.foundation.interaction.m mVar, v.a aVar, Te te2, boolean z12, long j12, int i12) {
        super(2);
        this.f35762l = c21522df;
        this.f35763m = mVar;
        this.f35764n = aVar;
        this.f35765o = te2;
        this.f35766p = z12;
        this.f35767q = j12;
        this.f35768r = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f35768r | 1);
        v.a aVar = this.f35764n;
        Te te2 = this.f35765o;
        this.f35762l.a(this.f35763m, aVar, te2, this.f35766p, this.f35767q, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
