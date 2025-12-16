package io.sentry.context;

import io.sentry.event.Breadcrumb;
import io.sentry.event.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Context.java */
/* loaded from: classes8.dex */
public class a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public volatile io.sentry.util.a<Breadcrumb> f405150b;

    /* renamed from: c, reason: collision with root package name */
    public volatile e f405151c;

    /* renamed from: d, reason: collision with root package name */
    public volatile HashMap f405152d;

    public final synchronized void a(String str, String str2) {
        try {
            if (this.f405152d == null) {
                this.f405152d = new HashMap();
            }
            this.f405152d.put(str, str2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized List<Breadcrumb> b() {
        if (this.f405150b != null && !this.f405150b.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f405150b.size());
            arrayList.addAll(this.f405150b);
            return arrayList;
        }
        return Collections.emptyList();
    }

    public final synchronized Map<String, Object> c() {
        if (this.f405152d != null && !this.f405152d.isEmpty()) {
            return Collections.unmodifiableMap(this.f405152d);
        }
        return Collections.emptyMap();
    }
}
