package io.sentry.event;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import y41.InterfaceC50060f;

/* loaded from: classes8.dex */
public class Event implements Serializable {

    /* renamed from: r, reason: collision with root package name */
    public static final org.slf4j.a f405165r = org.slf4j.b.d(Event.class);

    /* renamed from: b, reason: collision with root package name */
    public final UUID f405166b;

    /* renamed from: c, reason: collision with root package name */
    public String f405167c;

    /* renamed from: d, reason: collision with root package name */
    public Date f405168d;

    /* renamed from: e, reason: collision with root package name */
    public Level f405169e;

    /* renamed from: f, reason: collision with root package name */
    public String f405170f;

    /* renamed from: g, reason: collision with root package name */
    public String f405171g;

    /* renamed from: h, reason: collision with root package name */
    public d f405172h;

    /* renamed from: l, reason: collision with root package name */
    public String f405176l;

    /* renamed from: m, reason: collision with root package name */
    public String f405177m;

    /* renamed from: n, reason: collision with root package name */
    public String f405178n;

    /* renamed from: o, reason: collision with root package name */
    public String f405179o;

    /* renamed from: i, reason: collision with root package name */
    public Map<String, String> f405173i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public List<Breadcrumb> f405174j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public Map<String, Map<String, Object>> f405175k = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public transient Map<String, Object> f405180p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public Map<String, InterfaceC50060f> f405181q = new HashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Level {

        /* renamed from: b, reason: collision with root package name */
        public static final Level f405182b;

        /* renamed from: c, reason: collision with root package name */
        public static final Level f405183c;

        /* renamed from: d, reason: collision with root package name */
        public static final Level f405184d;

        /* renamed from: e, reason: collision with root package name */
        public static final Level f405185e;

        /* renamed from: f, reason: collision with root package name */
        public static final Level f405186f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ Level[] f405187g;

        static {
            Level level = new Level("FATAL", 0);
            f405182b = level;
            Level level2 = new Level("ERROR", 1);
            f405183c = level2;
            Level level3 = new Level("WARNING", 2);
            f405184d = level3;
            Level level4 = new Level("INFO", 3);
            f405185e = level4;
            Level level5 = new Level("DEBUG", 4);
            f405186f = level5;
            f405187g = new Level[]{level, level2, level3, level4, level5};
        }

        public Level() {
            throw null;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) f405187g.clone();
        }
    }

    public Event(UUID uuid) {
        if (uuid == null) {
            throw new IllegalArgumentException("The id can't be null");
        }
        this.f405166b = uuid;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f405180p = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Map<String, Object> map = this.f405180p;
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                map2.put(entry.getKey(), null);
            } else if (entry.getValue() instanceof Serializable) {
                map2.put(entry.getKey(), (Serializable) entry.getValue());
            } else {
                map2.put(entry.getKey(), entry.getValue().toString());
            }
        }
        objectOutputStream.writeObject(map2);
    }

    public final Map<String, Object> a() {
        if (this.f405180p == null) {
            this.f405180p = new HashMap();
            f405165r.f("`extra` field was null, deserialization must not have been called, please check your ProGuard (or other obfuscation) configuration.");
        }
        return this.f405180p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f405166b.equals(((Event) obj).f405166b);
    }

    public final int hashCode() {
        return this.f405166b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Event{level=");
        sb2.append(this.f405169e);
        sb2.append(", message='");
        sb2.append(this.f405167c);
        sb2.append("', logger='");
        return AK.c.s(sb2, this.f405170f, "'}");
    }
}
