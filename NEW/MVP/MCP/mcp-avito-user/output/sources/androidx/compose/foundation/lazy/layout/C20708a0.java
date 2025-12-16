package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: LazyLayoutPinnableItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.layout.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20708a0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f29388l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f29389m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C20712c0 f29390n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f29391o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f29392p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20708a0(Object obj, int i12, C20712c0 c20712c0, C22096n c22096n, int i13) {
        super(2);
        this.f29388l = obj;
        this.f29389m = i12;
        this.f29390n = c20712c0;
        this.f29391o = c22096n;
        this.f29392p = i13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f29392p | 1);
        C22096n c22096n = this.f29391o;
        C20710b0.a(this.f29388l, this.f29389m, this.f29390n, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
