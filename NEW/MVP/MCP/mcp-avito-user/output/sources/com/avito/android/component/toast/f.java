package com.avito.android.component.toast;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ToastBarType.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/component/toast/f;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/component/toast/f$a;", "Lcom/avito/android/component/toast/f$b;", "Lcom/avito/android/component/toast/f$c;", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class f {

    /* compiled from: ToastBarType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/toast/f$a;", "Lcom/avito/android/component/toast/f;", "<init>", "()V", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f125253a = new a();

        public a() {
            super(null);
        }
    }

    /* compiled from: ToastBarType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/toast/f$b;", "Lcom/avito/android/component/toast/f;", "<init>", "()V", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f125254a = new b();

        public b() {
            super(null);
        }
    }

    /* compiled from: ToastBarType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/component/toast/f$c;", "Lcom/avito/android/component/toast/f;", "a", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends f {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f125255c = new a(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Throwable f125256a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f125257b;

        /* compiled from: ToastBarType.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/toast/f$c$a;", "", "<init>", "()V", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            @k
            public static c a(@l ApiError apiError, @l Throwable th2) {
                return new c(th2, apiError, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @k
            public static c b() {
                return new c(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public a() {
            }
        }

        public /* synthetic */ c(Throwable th2, ApiError apiError, C42822w c42822w) {
            this(apiError, th2);
        }

        public /* synthetic */ c(Throwable th2, ApiError apiError, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : apiError, (i12 & 1) != 0 ? null : th2);
        }

        public c(ApiError apiError, Throwable th2) {
            super(null);
            this.f125256a = th2;
            this.f125257b = apiError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(@k Throwable th2) {
            this(th2, null, 2, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(@k ApiError apiError) {
            this(null, apiError, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ f(C42822w c42822w) {
        this();
    }

    public f() {
    }
}
