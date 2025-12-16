package ru.cyberity.cbr.core.analytics;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: AnalyticsDelegate.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0016J;\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u001aJ;\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u001aJ3\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0010J3\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0010J3\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0010J+\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u001bJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\"\u0010&\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u0012\u0010$\"\u0004\b\u0012\u0010%¨\u0006'"}, d2 = {"Lru/cyberity/cbr/core/analytics/c;", "", "Lru/cyberity/cbr/core/analytics/Screen;", "screen", "", "idDocSetType", "", "openPayload", "appearPayload", "closePayload", "cancelPayload", "<init>", "(Lru/cyberity/cbr/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "payload", "Lkotlin/G0;", "b", "(Lru/cyberity/cbr/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;)V", "Lru/cyberity/cbr/core/analytics/GlobalStatePayload;", "a", "(Ljava/util/Map;)Ljava/util/Map;", "(Lru/cyberity/cbr/core/analytics/Screen;Ljava/lang/String;)Ljava/util/Map;", "d", "()V", "c", "Lru/cyberity/cbr/core/analytics/Control;", "control", "(Lru/cyberity/cbr/core/analytics/Screen;Ljava/lang/String;Lru/cyberity/cbr/core/analytics/Control;Ljava/util/Map;)V", "(Lru/cyberity/cbr/core/analytics/Screen;Ljava/util/Map;)V", "Lru/cyberity/cbr/core/analytics/Screen;", "Ljava/lang/String;", "Ljava/util/Map;", "e", "f", "", "g", "Z", "()Z", "(Z)V", "onBackPressed", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Screen screen;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String idDocSetType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Map<String, Object> openPayload;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Map<String, Object> appearPayload;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Map<String, Object> closePayload;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Map<String, Object> cancelPayload;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean onBackPressed;

    public c(@Y61.k Screen screen, @Y61.k String str, @Y61.k Map<String, ? extends Object> map, @Y61.k Map<String, ? extends Object> map2, @Y61.k Map<String, ? extends Object> map3, @Y61.k Map<String, ? extends Object> map4) {
        this.screen = screen;
        this.idDocSetType = str;
        this.openPayload = map;
        this.appearPayload = map2;
        this.closePayload = map3;
        this.cancelPayload = map4;
    }

    public final void a(boolean z12) {
        this.onBackPressed = z12;
    }

    public final void b() {
        a(this.screen, this.idDocSetType, this.appearPayload);
    }

    public final void c() {
        if (this.onBackPressed) {
            b(this.screen, this.idDocSetType, this.cancelPayload);
        } else {
            c(this.screen, this.idDocSetType, this.closePayload);
        }
    }

    public final void d() {
        d(this.screen, this.idDocSetType, this.openPayload);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(c cVar, Screen screen, String str, Control control, Map map, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            map = P0.c();
        }
        cVar.b(screen, str, control, map);
    }

    public final void a(@Y61.k Screen screen, @Y61.k String idDocSetType, @Y61.k Control control, @Y61.k Map<String, ? extends Object> payload) {
        if (screen == Screen.Other) {
            return;
        }
        l.a(f.a(0L, 1, null).a(screen).a(control).h().a(P0.k(a(screen, idDocSetType), payload)), false, 1, null);
    }

    public final void d(@Y61.k Screen screen, @Y61.k String idDocSetType, @Y61.k Map<String, ? extends Object> payload) {
        if (screen == Screen.Other) {
            return;
        }
        l.a(f.a(0L, 1, null).a(screen).a().b().a(P0.k(a(screen, idDocSetType), payload)), false, 1, null);
    }

    public final void b(@Y61.k Screen screen, @Y61.k String idDocSetType, @Y61.k Control control, @Y61.k Map<String, ? extends Object> payload) {
        if (screen == Screen.Other) {
            return;
        }
        l.a(f.a(0L, 1, null).a(screen).a(control).g().a(P0.k(a(screen, idDocSetType), payload)), false, 1, null);
    }

    public final void c(@Y61.k Screen screen, @Y61.k String idDocSetType, @Y61.k Map<String, ? extends Object> payload) {
        if (screen == Screen.Other) {
            return;
        }
        l.a(f.a(0L, 1, null).a(screen).a().o().a(P0.k(a(screen, idDocSetType), payload)), false, 1, null);
    }

    public final void a(@Y61.k Screen screen, @Y61.k String idDocSetType, @Y61.k Map<String, ? extends Object> payload) {
        if (screen == Screen.Other) {
            return;
        }
        l.a(f.a(0L, 1, null).a(screen).a().j().a(P0.k(a(screen, idDocSetType), payload)), false, 1, null);
    }

    private final void b(Screen screen, String idDocSetType, Map<String, ? extends Object> payload) {
        if (screen == Screen.Other) {
            return;
        }
        l.a(f.a(0L, 1, null).a(screen).a().m().a(P0.k(a(screen, idDocSetType), payload)), false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(c cVar, Screen screen, Map map, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            map = P0.c();
        }
        cVar.a(screen, (Map<String, ? extends Object>) map);
    }

    public final void a(@Y61.k Screen screen, @Y61.k Map<String, ? extends Object> payload) {
        if (screen == Screen.Other) {
            return;
        }
        l.a(f.a(0L, 1, null).a(screen).a(Control.BottomSheet).k().a(P0.k(a(screen, this.idDocSetType), payload)), false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(c cVar, Screen screen, Map map, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            map = P0.c();
        }
        cVar.b(screen, map);
    }

    public final void b(@Y61.k Screen screen, @Y61.k Map<String, ? extends Object> payload) {
        if (screen == Screen.Other) {
            return;
        }
        l.a(f.a(0L, 1, null).a(screen).a(Control.BottomSheet).i().a(P0.k(a(screen, this.idDocSetType), payload)), false, 1, null);
    }

    private final Map<String, Object> a(Map<GlobalStatePayload, ? extends Object> map) {
        Set<Map.Entry<GlobalStatePayload, ? extends Object>> setEntrySet = map.entrySet();
        int iF2 = P0.f(C42745f0.q(setEntrySet, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((GlobalStatePayload) entry.getKey()).getText(), entry.getValue());
        }
        return linkedHashMap;
    }

    private final Map<String, Object> a(Screen screen, String idDocSetType) {
        Map mapC;
        LinkedHashMap linkedHashMapK = P0.k(b.f432519a.f(), Collections.singletonMap(GlobalStatePayload.Screen, screen.getText()));
        if (!L.f(idDocSetType, "TYPE_UNKNOWN")) {
            mapC = Collections.singletonMap(GlobalStatePayload.IdDocSetType, idDocSetType);
        } else {
            mapC = P0.c();
        }
        return a(P0.k(linkedHashMapK, mapC));
    }
}
