package com.facebook.cache.common;

import com.facebook.infer.annotation.Nullsafe;

@Nullsafe
/* loaded from: classes5.dex */
public interface CacheEventListener {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EvictionReason {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ EvictionReason[] f339734b = {new EvictionReason("CACHE_FULL", 0), new EvictionReason("CONTENT_STALE", 1), new EvictionReason("USER_FORCED", 2), new EvictionReason("CACHE_MANAGER_TRIMMED", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        EvictionReason EF5;

        public EvictionReason() {
            throw null;
        }

        public static EvictionReason valueOf(String str) {
            return (EvictionReason) Enum.valueOf(EvictionReason.class, str);
        }

        public static EvictionReason[] values() {
            return (EvictionReason[]) f339734b.clone();
        }
    }
}
