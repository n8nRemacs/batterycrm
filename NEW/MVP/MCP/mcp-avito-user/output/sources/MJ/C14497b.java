package Mj;

import Y61.k;
import com.avito.android.deep_linking.links.Position;
import com.avito.android.util.C;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: RelativePositionToPxConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMj/b;", "LMj/a;", "_avito_body-condition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mj.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14497b implements InterfaceC14496a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C f11001a;

    /* renamed from: b, reason: collision with root package name */
    public float f11002b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f11003c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f11004d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f11005e = -1.0f;

    public C14497b(@k C c12) {
        this.f11001a = c12;
    }

    @Override // Mj.InterfaceC14496a
    public final void a(float f12, float f13, float f14, float f15) {
        float f16 = f14 / f15 >= f12 / f13 ? f12 / f14 : f13 / f15;
        float f17 = f14 * f16;
        this.f11002b = f17;
        float f18 = f16 * f15;
        this.f11003c = f18;
        float f19 = f12 - f17;
        float f22 = 2;
        this.f11004d = f19 / f22;
        this.f11005e = (f13 - f18) / f22;
    }

    @Override // Mj.InterfaceC14496a
    @k
    public final Q<Integer, Integer> b(@k Position position) {
        this.f11001a.o().getClass();
        return new Q<>(Integer.valueOf((int) ((position.getX() * this.f11002b) + this.f11004d)), Integer.valueOf((int) ((position.getY() * this.f11003c) + this.f11005e)));
    }
}
