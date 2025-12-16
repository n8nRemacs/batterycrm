package androidx.compose.material;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: Snackbar.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.y9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21421y9 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f34421l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f34422m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21421y9(C22096n c22096n, int i12) {
        super(2);
        this.f34421l = c22096n;
        this.f34422m = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f34422m | 1);
        C21434z9.e(this.f34421l, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
