package coil.memory;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.decode.DataSource;
import coil.f;
import coil.memory.MemoryCache;
import coil.n;
import coil.request.p;
import coil.request.t;
import coil.request.u;
import coil.request.w;
import coil.request.x;
import coil.util.o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: MemoryCacheService.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/memory/c;", "", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final n f58524a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final o f58525b;

    /* compiled from: MemoryCacheService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil/memory/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public c(@k n nVar, @k w wVar, @l o oVar) {
        this.f58524a = nVar;
        this.f58525b = oVar;
    }

    @k
    public static x c(@k coil.intercept.k kVar, @k p pVar, @k MemoryCache.Key key, @k MemoryCache.b bVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(pVar.f58659a.getResources(), bVar.f58521a);
        DataSource dataSource = DataSource.f58268b;
        Map<String, Object> map = bVar.f58522b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = coil.util.l.f58781a;
        return new x(bitmapDrawable, pVar, dataSource, key, str, zBooleanValue, kVar != null && kVar.f58504g);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cb  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final coil.memory.MemoryCache.b a(@Y61.k coil.request.p r25, @Y61.k coil.memory.MemoryCache.Key r26, @Y61.k coil.view.C27253g r27, @Y61.k coil.view.Scale r28) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.memory.c.a(coil.request.p, coil.memory.MemoryCache$Key, coil.size.g, coil.size.Scale):coil.memory.MemoryCache$b");
    }

    @l
    public final MemoryCache.Key b(@k p pVar, @k Object obj, @k t tVar, @k coil.f fVar) {
        String strA;
        Map mapC;
        MemoryCache.Key key = pVar.f58663e;
        if (key != null) {
            return key;
        }
        f.a aVar = coil.f.f58371a;
        List<Q<H2.b<? extends Object>, Class<? extends Object>>> list = this.f58524a.f58550k.f58363c;
        int size = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                strA = null;
                break;
            }
            Q<H2.b<? extends Object>, Class<? extends Object>> q12 = list.get(i12);
            H2.b<? extends Object> bVar = q12.f406619b;
            if (q12.f406620c.isAssignableFrom(obj.getClass()) && (strA = bVar.a(obj, tVar)) != null) {
                break;
            }
            i12++;
        }
        f.a aVar2 = coil.f.f58371a;
        if (strA == null) {
            return null;
        }
        Map<String, u.c> map = pVar.f58649D.f58733b;
        if (map.isEmpty()) {
            mapC = P0.c();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<Map.Entry<String, u.c>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().getClass();
            }
            mapC = linkedHashMap;
        }
        List<L2.c> list2 = pVar.f58670l;
        if (list2.isEmpty() && mapC.isEmpty()) {
            return new MemoryCache.Key(strA, null, 2, null);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapC);
        if (!list2.isEmpty()) {
            int size2 = list2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                linkedHashMap2.put(AK.c.g(i13, "coil#transformation_"), list2.get(i13).getF9753a());
            }
            linkedHashMap2.put("coil#transformation_size", tVar.f58720d.toString());
        }
        return new MemoryCache.Key(strA, linkedHashMap2);
    }
}
