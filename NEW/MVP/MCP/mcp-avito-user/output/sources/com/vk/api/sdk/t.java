package com.vk.api.sdk;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: VKApiValidationHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/t;", "", "a", "b", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface t {

    /* compiled from: VKApiValidationHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/t$a;", "T", "", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CountDownLatch f366685a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public volatile T f366686b;

        public a(@Y61.k CountDownLatch countDownLatch) {
            this.f366685a = countDownLatch;
        }
    }

    /* compiled from: VKApiValidationHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/t$b;", "", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final a f366687d = new a(null);

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final b f366688e = new b("", "");

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f366689a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f366690b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f366691c;

        /* compiled from: VKApiValidationHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/t$b$a;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public b(@Y61.l String str, @Y61.l String str2) {
            this.f366689a = str;
            this.f366690b = str2;
            this.f366691c = true ^ (str2 == null || C43066x.K(str2));
        }
    }

    /* compiled from: VKApiValidationHandler.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class c {
    }

    void a(@Y61.k VKApiExecutionException vKApiExecutionException);

    void b(@Y61.k String str, @Y61.k a<b> aVar);

    void c(@Y61.k String str, @Y61.k a<Boolean> aVar);

    void d(@Y61.k String str, @Y61.k a<String> aVar);
}
