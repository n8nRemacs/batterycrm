package ru.rustore.sdk.core.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TaskThreadHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/core/tasks/t;", "", "<init>", "()V", "sdk-public-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final t f436805a = new t();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f436806b = C42727D.c(a.f436808l);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f436807c = C42727D.c(b.f436809l);

    /* compiled from: TaskThreadHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class a extends N implements Y41.a<ExecutorService> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f436808l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final ExecutorService invoke() {
            return Executors.newFixedThreadPool(1);
        }
    }

    /* compiled from: TaskThreadHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Handler> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f436809l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }
}
