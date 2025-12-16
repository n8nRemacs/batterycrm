package x71;

import Y61.k;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import org.koin.core.instance.g;

/* compiled from: InstanceRegistry.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx71/c;", "", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x71.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C49789c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final o71.d f442250a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ConcurrentHashMap f442251b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final HashMap<Integer, g<?>> f442252c;

    public C49789c(@k o71.d dVar) {
        this.f442250a = dVar;
        org.koin.mp.d.f421487a.getClass();
        this.f442251b = new ConcurrentHashMap();
        this.f442252c = new HashMap<>();
    }
}
