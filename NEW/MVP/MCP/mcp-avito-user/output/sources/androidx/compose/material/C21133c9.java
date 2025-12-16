package androidx.compose.material;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: SnackbarHost.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.c9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21133c9 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U8 f33511l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f33512m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f33513n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f33514o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21133c9(U8 u82, androidx.compose.ui.v vVar, C22096n c22096n, int i12) {
        super(2);
        this.f33511l = u82;
        this.f33512m = vVar;
        this.f33513n = c22096n;
        this.f33514o = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f33514o | 1);
        C21172f9.a(this.f33511l, this.f33512m, this.f33513n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
