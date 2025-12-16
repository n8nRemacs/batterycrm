package ru.cyberity.ff.core;

import Y61.k;
import Y61.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import ru.cyberity.cbr.core.data.source.dynamic.c;

/* compiled from: FeatureFlagManager.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0015\u0010\u000b\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000b\u0010\u0013J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\u0016J+\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/cyberity/ff/core/b;", "", "<init>", "()V", "", "name", "defaultValue", "description", "", "localOnly", "Lru/cyberity/ff/core/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lru/cyberity/ff/core/a;", "", "b", "()Ljava/util/Collection;", "Lru/cyberity/cbr/core/data/source/dynamic/c$b;", "featureFlags", "Lkotlin/G0;", "(Lru/cyberity/cbr/core/data/source/dynamic/c$b;)V", "(Ljava/lang/String;)Lru/cyberity/ff/core/a;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/cyberity/ff/core/a;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "remoteFeatures", "localFeatures", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final ConcurrentHashMap<String, a> remoteFeatures = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final ConcurrentHashMap<String, a> localFeatures = new ConcurrentHashMap<>();

    @k
    public final Collection<a> a() {
        return this.localFeatures.values();
    }

    @k
    public final Collection<a> b() {
        return this.remoteFeatures.values();
    }

    public final void c() {
        Iterator<Map.Entry<String, a>> it = this.remoteFeatures.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().i();
        }
        Iterator<Map.Entry<String, a>> it2 = this.localFeatures.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().i();
        }
    }

    public static /* synthetic */ a b(b bVar, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            str3 = null;
        }
        return bVar.b(str, str2, str3);
    }

    public final void a(@k c.b featureFlags) {
        for (c.b.a aVar : featureFlags.a()) {
            a aVar2 = this.remoteFeatures.get(aVar.getName());
            if (aVar2 != null) {
                aVar2.c(aVar.getIsEnabled(), aVar.getValue());
            }
        }
    }

    @k
    public final a b(@k String name, @k String description, @l String defaultValue) {
        return a(name, defaultValue, description, true);
    }

    @l
    public final a a(@k String name) {
        a aVar = this.remoteFeatures.get(name);
        return aVar == null ? this.localFeatures.get(name) : aVar;
    }

    public static /* synthetic */ a a(b bVar, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            str3 = null;
        }
        return bVar.a(str, str2, str3);
    }

    @k
    public final a a(@k String name, @k String description, @l String defaultValue) {
        return a(name, defaultValue, description, false);
    }

    private final a a(String name, String defaultValue, String description, boolean localOnly) {
        if (!this.localFeatures.contains(name) && !this.remoteFeatures.contains(name)) {
            a aVar = new a(name, description, localOnly, defaultValue);
            if (localOnly) {
                this.localFeatures.put(name, aVar);
            } else {
                this.remoteFeatures.put(name, aVar);
            }
            return aVar;
        }
        throw new IllegalArgumentException(AK.c.k("Feature name ", name, " is already used"));
    }
}
