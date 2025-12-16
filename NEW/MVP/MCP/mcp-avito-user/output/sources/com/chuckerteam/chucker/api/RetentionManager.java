package com.chuckerteam.chucker.api;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RetentionManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/chuckerteam/chucker/api/RetentionManager;", "", "Period", "com.github.ChuckerTeam.Chucker.library-no-op"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class RetentionManager {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RetentionManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/chuckerteam/chucker/api/RetentionManager$Period;", "", "com.github.ChuckerTeam.Chucker.library-no-op"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Period {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Period[] f339657b = {new Period("ONE_HOUR", 0), new Period("ONE_DAY", 1), new Period("ONE_WEEK", 2), new Period("FOREVER", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        Period EF5;

        public Period() {
            throw null;
        }

        public static Period valueOf(String str) {
            return (Period) Enum.valueOf(Period.class, str);
        }

        public static Period[] values() {
            return (Period[]) f339657b.clone();
        }
    }

    public RetentionManager(Context context, Object obj, int i12, C42822w c42822w) {
    }
}
