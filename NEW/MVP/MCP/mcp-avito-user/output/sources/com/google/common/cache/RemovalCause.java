package com.google.common.cache;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@XY0.b
@h
/* loaded from: classes6.dex */
public abstract class RemovalCause {

    /* renamed from: b, reason: collision with root package name */
    public static final RemovalCause f359070b;

    /* renamed from: c, reason: collision with root package name */
    public static final RemovalCause f359071c;

    /* renamed from: d, reason: collision with root package name */
    public static final RemovalCause f359072d;

    /* renamed from: e, reason: collision with root package name */
    public static final RemovalCause f359073e;

    /* renamed from: f, reason: collision with root package name */
    public static final RemovalCause f359074f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ RemovalCause[] f359075g;

    public enum a extends RemovalCause {
        @Override // com.google.common.cache.RemovalCause
        public final boolean a() {
            return false;
        }
    }

    public enum b extends RemovalCause {
        @Override // com.google.common.cache.RemovalCause
        public final boolean a() {
            return false;
        }
    }

    public enum c extends RemovalCause {
        @Override // com.google.common.cache.RemovalCause
        public final boolean a() {
            return true;
        }
    }

    public enum d extends RemovalCause {
        @Override // com.google.common.cache.RemovalCause
        public final boolean a() {
            return true;
        }
    }

    public enum e extends RemovalCause {
        @Override // com.google.common.cache.RemovalCause
        public final boolean a() {
            return true;
        }
    }

    static {
        a aVar = new a("EXPLICIT", 0, null);
        f359070b = aVar;
        b bVar = new b("REPLACED", 1, null);
        f359071c = bVar;
        c cVar = new c("COLLECTED", 2, null);
        f359072d = cVar;
        d dVar = new d("EXPIRED", 3, null);
        f359073e = dVar;
        e eVar = new e("SIZE", 4, null);
        f359074f = eVar;
        f359075g = new RemovalCause[]{aVar, bVar, cVar, dVar, eVar};
    }

    public RemovalCause() {
        throw null;
    }

    public RemovalCause(String str, int i12, a aVar) {
    }

    public static RemovalCause valueOf(String str) {
        return (RemovalCause) Enum.valueOf(RemovalCause.class, str);
    }

    public static RemovalCause[] values() {
        return (RemovalCause[]) f359075g.clone();
    }

    public abstract boolean a();
}
