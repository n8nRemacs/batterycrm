package coil.memory;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import j.k0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: WeakMemoryCache.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcoil/memory/f;", "Lcoil/memory/h;", "<init>", "()V", "a", "b", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap<MemoryCache.Key, ArrayList<b>> f58534a = new LinkedHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public int f58535b;

    /* compiled from: WeakMemoryCache.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil/memory/f$a;", "", "<init>", "()V", "", "CLEAN_UP_INTERVAL", "I", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WeakMemoryCache.kt */
    @k0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/f$b;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f58536a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final WeakReference<Bitmap> f58537b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, Object> f58538c;

        /* renamed from: d, reason: collision with root package name */
        public final int f58539d;

        public b(int i12, @k WeakReference<Bitmap> weakReference, @k Map<String, ? extends Object> map, int i13) {
            this.f58536a = i12;
            this.f58537b = weakReference;
            this.f58538c = map;
            this.f58539d = i13;
        }
    }

    static {
        new a(null);
    }

    @Override // coil.memory.h
    public final synchronized void a(int i12) {
        if (i12 >= 10 && i12 != 20) {
            d();
        }
    }

    @Override // coil.memory.h
    @l
    public final synchronized MemoryCache.b b(@k MemoryCache.Key key) {
        try {
            ArrayList<b> arrayList = this.f58534a.get(key);
            MemoryCache.b bVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                b bVar2 = arrayList.get(i12);
                Bitmap bitmap = bVar2.f58537b.get();
                MemoryCache.b bVar3 = bitmap != null ? new MemoryCache.b(bitmap, bVar2.f58538c) : null;
                if (bVar3 != null) {
                    bVar = bVar3;
                    break;
                }
                i12++;
            }
            int i13 = this.f58535b;
            this.f58535b = i13 + 1;
            if (i13 >= 10) {
                d();
            }
            return bVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // coil.memory.h
    public final synchronized void c(@k MemoryCache.Key key, @k Bitmap bitmap, @k Map<String, ? extends Object> map, int i12) {
        try {
            LinkedHashMap<MemoryCache.Key, ArrayList<b>> linkedHashMap = this.f58534a;
            ArrayList<b> arrayList = linkedHashMap.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(key, arrayList);
            }
            ArrayList<b> arrayList2 = arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            b bVar = new b(iIdentityHashCode, new WeakReference(bitmap), map, i12);
            int size = arrayList2.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    arrayList2.add(bVar);
                    break;
                }
                b bVar2 = arrayList2.get(i13);
                if (i12 < bVar2.f58539d) {
                    i13++;
                } else if (bVar2.f58536a == iIdentityHashCode && bVar2.f58537b.get() == bitmap) {
                    arrayList2.set(i13, bVar);
                } else {
                    arrayList2.add(i13, bVar);
                }
            }
            int i14 = this.f58535b;
            this.f58535b = i14 + 1;
            if (i14 >= 10) {
                d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @k0
    public final void d() {
        WeakReference<Bitmap> weakReference;
        this.f58535b = 0;
        Iterator<ArrayList<b>> it = this.f58534a.values().iterator();
        while (it.hasNext()) {
            ArrayList<b> next = it.next();
            if (next.size() <= 1) {
                b bVar = (b) C42745f0.G(next);
                if (((bVar == null || (weakReference = bVar.f58537b) == null) ? null : weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i12 = 0;
                for (int i13 = 0; i13 < size; i13++) {
                    int i14 = i13 - i12;
                    if (next.get(i14).f58537b.get() == null) {
                        next.remove(i14);
                        i12++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
