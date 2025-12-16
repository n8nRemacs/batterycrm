package coil.memory;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import coil.util.C27260a;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: StrongMemoryCache.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/a;", "Lcoil/memory/g;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f58523a;

    public a(@k h hVar) {
        this.f58523a = hVar;
    }

    @Override // coil.memory.g
    @l
    public final MemoryCache.b b(@k MemoryCache.Key key) {
        return null;
    }

    @Override // coil.memory.g
    public final void c(@k MemoryCache.Key key, @k Bitmap bitmap, @k Map<String, ? extends Object> map) {
        this.f58523a.c(key, bitmap, map, C27260a.a(bitmap));
    }

    @Override // coil.memory.g
    public final void a(int i12) {
    }
}
