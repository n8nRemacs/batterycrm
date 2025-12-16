package Ec1;

import Y41.p;
import androidx.compose.animation.core.O;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.graphics.painter.e;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class a extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f4116l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f4117m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f4118n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e f4119o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f4120p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ O f4121q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ RepeatMode f4122r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4123s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v vVar, long j12, String str, e eVar, int i12, O o12, RepeatMode repeatMode, int i13) {
        super(2);
        this.f4116l = vVar;
        this.f4117m = j12;
        this.f4118n = str;
        this.f4119o = eVar;
        this.f4120p = i12;
        this.f4121q = o12;
        this.f4122r = repeatMode;
        this.f4123s = i13;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f4123s | 1);
        O o12 = this.f4121q;
        RepeatMode repeatMode = this.f4122r;
        b.a(this.f4116l, this.f4117m, this.f4118n, this.f4119o, this.f4120p, o12, repeatMode, (A) obj, iA2);
        return G0.f406611a;
    }
}
