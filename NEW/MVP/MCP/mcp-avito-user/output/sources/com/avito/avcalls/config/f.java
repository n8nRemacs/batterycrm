package com.avito.avcalls.config;

import com.russhwolf.settings.C37852a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ConfigStorageImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/config/f;", "Lcom/avito/avcalls/config/e;", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements e {

    @Y61.k
    private static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C37852a f332869a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public Config f332870b;

    /* compiled from: ConfigStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/avcalls/config/f$a;", "", "<init>", "()V", "", "CONFIG_STORAGE_KEY", "Ljava/lang/String;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@Y61.k C37852a c37852a) {
        Config config;
        this.f332869a = c37852a;
        String strA = c37852a.a();
        this.f332870b = (strA == null || (config = (Config) com.avito.avcalls.utils.i.a().d(strA, Config.INSTANCE.serializer())) == null) ? new Config(0L, 0, 0L, 0L, 0L, 0L, 0L, 0L, false, 0L, 0L, 0L, 0.0d, 8191, (C42822w) null) : config;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final Config getF332870b() {
        return this.f332870b;
    }
}
