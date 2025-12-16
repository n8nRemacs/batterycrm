package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.exoplayer.source.C23161l;
import androidx.media3.exoplayer.upstream.j;
import androidx.media3.extractor.C23192k;
import com.google.common.collect.AbstractC37401r1;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.exoplayer.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23145n implements com.google.common.base.e0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f49413c;

    public /* synthetic */ C23145n(Context context, int i12) {
        this.f49412b = i12;
        this.f49413c = context;
    }

    @Override // com.google.common.base.e0
    public final Object get() {
        androidx.media3.exoplayer.upstream.j jVar;
        switch (this.f49412b) {
            case 0:
                return new C23143l(this.f49413c);
            case 1:
                return new C23143l(this.f49413c);
            case 2:
                return new C23161l(this.f49413c, new C23192k());
            case 3:
                return new androidx.media3.exoplayer.trackselection.g(this.f49413c);
            default:
                Context context = this.f49413c;
                AbstractC37401r1<Long> abstractC37401r1 = androidx.media3.exoplayer.upstream.j.f50128n;
                synchronized (androidx.media3.exoplayer.upstream.j.class) {
                    try {
                        if (androidx.media3.exoplayer.upstream.j.f50134t == null) {
                            j.b bVar = new j.b(context);
                            androidx.media3.exoplayer.upstream.j.f50134t = new androidx.media3.exoplayer.upstream.j(bVar.f50148a, bVar.f50149b, bVar.f50150c, bVar.f50151d, bVar.f50152e, null);
                        }
                        jVar = androidx.media3.exoplayer.upstream.j.f50134t;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return jVar;
        }
    }
}
