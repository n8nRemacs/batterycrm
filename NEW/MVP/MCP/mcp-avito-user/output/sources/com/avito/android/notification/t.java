package com.avito.android.notification;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.notification.m;
import com.avito.android.util.V2;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationSettingsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification/t;", "Lcom/avito/android/notification/s;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f207477a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<m> f207478b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f207479c = new LinkedHashMap();

    @Inject
    public t(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k h31.e<m> eVar) {
        this.f207477a = interfaceC28373a;
        this.f207478b = eVar;
    }

    @Override // com.avito.android.notification.s
    public final void a() {
        this.f207477a.c(c());
        V2.f318762a.c("NotificationSettingsTracker", "Notification settings: " + c().f207475b, null);
    }

    @Override // com.avito.android.notification.s
    public final void b(@Y61.k String str, @Y61.k String str2) {
        this.f207479c.put(str2, str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.C] */
    @Y61.k
    public final r c() {
        h31.e<m> eVar = this.f207478b;
        eVar.get().a();
        LinkedHashMap linkedHashMap = this.f207479c;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), Boolean.valueOf(l.a(((m.a) eVar.get().f207456c.getValue()).f207458b, (String) entry.getValue())));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
        linkedHashMap3.put("avito_system_settings_notifications_all", Boolean.valueOf(((m.a) eVar.get().f207456c.getValue()).f207458b.f44481b.areNotificationsEnabled()));
        return new r(linkedHashMap3);
    }
}
