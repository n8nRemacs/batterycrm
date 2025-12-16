package com.avito.android.push;

import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PushService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/PushService;", "", "a", "_common_push-models_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PushService {

    /* renamed from: b, reason: collision with root package name */
    public static final PushService f245927b;

    /* renamed from: c, reason: collision with root package name */
    public static final PushService f245928c;

    /* renamed from: d, reason: collision with root package name */
    public static final PushService f245929d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PushService[] f245930e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f245931f;

    /* compiled from: PushService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/push/PushService$a;", "", "<init>", "()V", "_common_push-models_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        PushService pushService = new PushService("FCM", 0);
        f245927b = pushService;
        PushService pushService2 = new PushService("HMS", 1);
        f245928c = pushService2;
        PushService pushService3 = new PushService("RUSTORE", 2);
        f245929d = pushService3;
        PushService[] pushServiceArr = {pushService, pushService2, pushService3};
        f245930e = pushServiceArr;
        f245931f = c.a(pushServiceArr);
        new a(null);
    }

    public PushService() {
        throw null;
    }

    public static PushService valueOf(String str) {
        return (PushService) Enum.valueOf(PushService.class, str);
    }

    public static PushService[] values() {
        return (PushService[]) f245930e.clone();
    }
}
