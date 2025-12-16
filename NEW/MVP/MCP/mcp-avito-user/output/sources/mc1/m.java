package Mc1;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class m extends N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f10887l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f10888m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f10889n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10890o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, v vVar, long j12, int i12) {
        super(2);
        this.f10887l = str;
        this.f10888m = vVar;
        this.f10889n = j12;
        this.f10890o = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f10890o | 1);
        v vVar = this.f10888m;
        long j12 = this.f10889n;
        s.i(this.f10887l, vVar, j12, (A) obj, iA2);
        return G0.f406611a;
    }
}
