package androidx.compose.material;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: ListItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.n5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21272n5 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f33821l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f33822m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f33823n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f33824o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f33825p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21272n5(float f12, androidx.compose.ui.v vVar, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f33821l = f12;
        this.f33822m = vVar;
        this.f33823n = c22096n;
        this.f33824o = i12;
        this.f33825p = i13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f33824o | 1);
        float f12 = this.f33821l;
        C21311q5.b(f12, this.f33822m, this.f33823n, a12, iA2, this.f33825p);
        return kotlin.G0.f406611a;
    }
}
