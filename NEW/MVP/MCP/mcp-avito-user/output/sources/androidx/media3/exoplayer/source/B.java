package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.D;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class B implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49456b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D.a f49457c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f49458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C23167s f49459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C23171w f49460f;

    public /* synthetic */ B(D.a aVar, D d12, C23167s c23167s, C23171w c23171w, int i12) {
        this.f49456b = i12;
        this.f49457c = aVar;
        this.f49458d = d12;
        this.f49459e = c23167s;
        this.f49460f = c23171w;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.media3.exoplayer.source.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.media3.exoplayer.source.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.media3.exoplayer.source.D, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49456b) {
            case 0:
                D.a aVar = this.f49457c;
                int i12 = aVar.f49483a;
                this.f49458d.x(i12, aVar.f49484b, this.f49459e, this.f49460f);
                break;
            case 1:
                D.a aVar2 = this.f49457c;
                int i13 = aVar2.f49483a;
                this.f49458d.n(i13, aVar2.f49484b, this.f49459e, this.f49460f);
                break;
            default:
                D.a aVar3 = this.f49457c;
                int i14 = aVar3.f49483a;
                this.f49458d.h(i14, aVar3.f49484b, this.f49459e, this.f49460f);
                break;
        }
    }
}
