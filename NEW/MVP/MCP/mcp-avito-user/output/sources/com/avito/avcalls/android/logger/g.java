package com.avito.avcalls.android.logger;

import Y61.k;
import Y61.l;
import com.avito.avcalls.android.logger.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/avito/avcalls/android/logger/g;", "", "<init>", "()V", "Companion", "a", "b", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public static h f331753a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public static com.avito.avcalls.android.logger.b f331754b;

    /* compiled from: Logger.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/avcalls/android/logger/g$a;", "", "<init>", "()V", "Lcom/avito/avcalls/android/logger/b;", "logger", "Lcom/avito/avcalls/android/logger/b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.logger.g$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public static void a(@k String str, @k String str2, @l Exception exc) {
            com.avito.avcalls.android.logger.b bVar = g.f331754b;
            if (bVar != null) {
                bVar.a(str, new a.AbstractC10309a.b.AbstractC10311a.C10313b(exc), str2);
            }
        }

        public static /* synthetic */ void b(Companion companion, String str, String str2) {
            companion.getClass();
            a(str, str2, null);
        }

        public static void c(@k String str, @k String str2) {
            com.avito.avcalls.android.logger.b bVar = g.f331754b;
            if (bVar != null) {
                bVar.a(str, a.AbstractC10309a.b.AbstractC10311a.c.f331739a, str2);
            }
        }

        public Companion() {
        }
    }

    /* compiled from: Logger.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/logger/g$b;", "", "<init>", "()V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: Logger.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/logger/g$b$a;", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.avcalls.android.logger.g$b$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            public Companion() {
            }
        }
    }
}
