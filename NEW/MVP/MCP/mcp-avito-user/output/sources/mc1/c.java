package Mc1;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class c extends N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f10860l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f10861m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.style.i f10862n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10863o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, v vVar, androidx.compose.ui.text.style.i iVar, int i12) {
        super(2);
        this.f10860l = str;
        this.f10861m = vVar;
        this.f10862n = iVar;
        this.f10863o = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f10863o | 1);
        v vVar = this.f10861m;
        androidx.compose.ui.text.style.i iVar = this.f10862n;
        s.g(this.f10860l, vVar, iVar, (A) obj, iA2);
        return G0.f406611a;
    }
}
