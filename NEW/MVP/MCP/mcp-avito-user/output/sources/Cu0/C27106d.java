package cU0;

import Y61.k;
import Y61.l;
import java.util.HashMap;
import kotlin.Metadata;

/* compiled from: InMemoryFunctionsStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LcU0/d;", "LcU0/f;", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cU0.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27106d implements InterfaceC27108f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final HashMap<String, C27107e> f57905a = new HashMap<>();

    @Override // cU0.InterfaceC27108f
    public final void a(@k String str, @k C27107e c27107e) {
        this.f57905a.put(str, c27107e);
    }

    @Override // cU0.InterfaceC27108f
    @l
    public final C27107e get(@k String str) {
        return this.f57905a.get(str);
    }
}
