package Mc1;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class o extends N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f10895l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f10896m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f10897n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10898o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, v vVar, long j12, int i12) {
        super(2);
        this.f10895l = str;
        this.f10896m = vVar;
        this.f10897n = j12;
        this.f10898o = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        s.m(this.f10895l, this.f10896m, this.f10897n, (A) obj, C22066f2.a(this.f10898o | 1));
        return G0.f406611a;
    }
}
