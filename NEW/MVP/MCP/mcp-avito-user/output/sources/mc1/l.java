package Mc1;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class l extends N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f10883l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f10884m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l f10885n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10886o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i12, Y41.l lVar, v vVar, String str) {
        super(2);
        this.f10883l = str;
        this.f10884m = vVar;
        this.f10885n = lVar;
        this.f10886o = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f10886o | 1);
        v vVar = this.f10884m;
        s.h(iA2, this.f10885n, (A) obj, vVar, this.f10883l);
        return G0.f406611a;
    }
}
