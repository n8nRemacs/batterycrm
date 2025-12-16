package K;

import Y61.k;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LruHashMap.jvm.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"LK/d;", "", "K", "V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap<K, V> f9207a;

    public d() {
        this(0, 0.0f, 3, null);
    }

    public d(int i12, float f12) {
        this.f9207a = new LinkedHashMap<>(i12, f12, true);
    }

    public /* synthetic */ d(int i12, float f12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 16 : i12, (i13 & 2) != 0 ? 0.75f : f12);
    }
}
