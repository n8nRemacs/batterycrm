package com.avito.android.component.snackbar;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OldAvitoSnackbarType.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/component/snackbar/e;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/component/snackbar/e$a;", "Lcom/avito/android/component/snackbar/e$b;", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class e {

    /* compiled from: OldAvitoSnackbarType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/snackbar/e$a;", "Lcom/avito/android/component/snackbar/e;", "<init>", "()V", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f125238a = new a();

        public a() {
            super(null);
        }
    }

    /* compiled from: OldAvitoSnackbarType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/component/snackbar/e$b;", "Lcom/avito/android/component/snackbar/e;", "a", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends e {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f125239c = new a(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Throwable f125240a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f125241b;

        /* compiled from: OldAvitoSnackbarType.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/snackbar/e$b$a;", "", "<init>", "()V", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public /* synthetic */ b(Throwable th2, ApiError apiError, C42822w c42822w) {
            this(apiError, th2);
        }

        public /* synthetic */ b(Throwable th2, ApiError apiError, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : apiError, (i12 & 1) != 0 ? null : th2);
        }

        public b(ApiError apiError, Throwable th2) {
            super(null);
            this.f125240a = th2;
            this.f125241b = apiError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k Throwable th2) {
            this(th2, null, 2, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k ApiError apiError) {
            this(null, apiError, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ e(C42822w c42822w) {
        this();
    }

    public e() {
    }
}
