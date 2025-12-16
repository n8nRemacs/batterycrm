package coil.memory;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import androidx.collection.C20212g0;
import coil.memory.MemoryCache;
import coil.util.C27260a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrongMemoryCache.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/memory/e;", "Lcoil/memory/g;", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f58528a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f58529b;

    /* compiled from: StrongMemoryCache.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/e$a;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Bitmap f58530a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, Object> f58531b;

        /* renamed from: c, reason: collision with root package name */
        public final int f58532c;

        public a(@k Bitmap bitmap, @k Map<String, ? extends Object> map, int i12) {
            this.f58530a = bitmap;
            this.f58531b = map;
            this.f58532c = i12;
        }
    }

    /* compiled from: StrongMemoryCache.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"coil/memory/e$b", "Landroidx/collection/g0;", "Lcoil/memory/MemoryCache$Key;", "Lcoil/memory/e$a;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends C20212g0<MemoryCache.Key, a> {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ e f58533j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, e eVar) {
            super(i12);
            this.f58533j = eVar;
        }

        @Override // androidx.collection.C20212g0
        public final void b(Object obj, Object obj2, Object obj3) {
            a aVar = (a) obj2;
            this.f58533j.f58528a.c((MemoryCache.Key) obj, aVar.f58530a, aVar.f58531b, aVar.f58532c);
        }

        @Override // androidx.collection.C20212g0
        public final int d(MemoryCache.Key key, a aVar) {
            return aVar.f58532c;
        }
    }

    public e(int i12, @k h hVar) {
        this.f58528a = hVar;
        this.f58529b = new b(i12, this);
    }

    @Override // coil.memory.g
    public final void a(int i12) {
        b bVar = this.f58529b;
        if (i12 >= 40) {
            bVar.evictAll();
        } else {
            if (10 > i12 || i12 >= 20) {
                return;
            }
            bVar.trimToSize(bVar.size() / 2);
        }
    }

    @Override // coil.memory.g
    @l
    public final MemoryCache.b b(@k MemoryCache.Key key) {
        a aVar = this.f58529b.get(key);
        if (aVar != null) {
            return new MemoryCache.b(aVar.f58530a, aVar.f58531b);
        }
        return null;
    }

    @Override // coil.memory.g
    public final void c(@k MemoryCache.Key key, @k Bitmap bitmap, @k Map<String, ? extends Object> map) {
        int iA2 = C27260a.a(bitmap);
        b bVar = this.f58529b;
        if (iA2 <= bVar.maxSize()) {
            bVar.put(key, new a(bitmap, map, iA2));
        } else {
            bVar.remove(key);
            this.f58528a.c(key, bitmap, map, iA2);
        }
    }
}
