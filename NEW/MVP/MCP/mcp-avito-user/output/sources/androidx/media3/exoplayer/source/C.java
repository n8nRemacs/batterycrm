package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.D;
import com.google.android.exoplayer2.source.A;
import com.google.android.exoplayer2.source.C36554q;
import com.google.android.exoplayer2.source.C36557u;
import com.yandex.mobile.ads.impl.kd0;
import com.yandex.mobile.ads.impl.q90;
import com.yandex.mobile.ads.impl.zc0;
import java.io.IOException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class C implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49462c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IOException f49463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f49464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f49465f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f49466g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f49467h;

    public /* synthetic */ C(Object obj, Object obj2, Object obj3, Object obj4, IOException iOException, boolean z12, int i12) {
        this.f49461b = i12;
        this.f49465f = obj;
        this.f49462c = obj2;
        this.f49466g = obj3;
        this.f49467h = obj4;
        this.f49463d = iOException;
        this.f49464e = z12;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.source.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.exoplayer2.source.A, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49461b) {
            case 0:
                D.a aVar = (D.a) this.f49465f;
                int i12 = aVar.f49483a;
                this.f49462c.r(i12, aVar.f49484b, (C23167s) this.f49466g, (C23171w) this.f49467h, this.f49463d, this.f49464e);
                break;
            case 1:
                A.a aVar2 = (A.a) this.f49465f;
                int i13 = aVar2.f345902a;
                this.f49462c.f(i13, aVar2.f345903b, (C36554q) this.f49466g, (C36557u) this.f49467h, this.f49463d, this.f49464e);
                break;
            default:
                ((kd0.a) this.f49465f).a((kd0) this.f49462c, (q90) this.f49466g, (zc0) this.f49467h, this.f49463d, this.f49464e);
                break;
        }
    }
}
