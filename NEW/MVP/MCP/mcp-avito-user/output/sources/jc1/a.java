package Jc1;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class a extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v.a f9054l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f9055m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f9056n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9057o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i12, int i13, v.a aVar, String str) {
        super(2);
        this.f9054l = aVar;
        this.f9055m = str;
        this.f9056n = i12;
        this.f9057o = i13;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f9057o | 1);
        String str = this.f9055m;
        b.a(this.f9056n, iA2, (A) obj, this.f9054l, str);
        return G0.f406611a;
    }
}
