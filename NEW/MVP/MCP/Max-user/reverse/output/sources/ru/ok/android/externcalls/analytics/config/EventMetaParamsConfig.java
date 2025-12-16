package ru.ok.android.externcalls.analytics.config;

import defpackage.cm6;
import defpackage.tk4;
import defpackage.u08;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/analytics/config/EventMetaParamsConfig;", "", "Lkotlin/Function0;", "", "appName", "<init>", "(Lcm6;)V", "Lcm6;", "getAppName", "()Lcm6;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EventMetaParamsConfig {
    private final cm6 appName;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.analytics.config.EventMetaParamsConfig$1, reason: invalid class name */
    public static final class AnonymousClass1 extends u08 implements cm6 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.cm6
        public final Void invoke() {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventMetaParamsConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final cm6 getAppName() {
        return this.appName;
    }

    public EventMetaParamsConfig(cm6 cm6Var) {
        this.appName = cm6Var;
    }

    public /* synthetic */ EventMetaParamsConfig(cm6 cm6Var, int i, tk4 tk4Var) {
        this((i & 1) != 0 ? AnonymousClass1.INSTANCE : cm6Var);
    }
}
