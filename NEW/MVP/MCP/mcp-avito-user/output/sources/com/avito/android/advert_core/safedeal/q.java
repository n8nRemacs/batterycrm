package com.avito.android.advert_core.safedeal;

import androidx.view.C23038g0;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.architecture_components.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MyAdvertSafeDealServicesViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/safedeal/q;", "", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface q {
    @Y61.k
    C23038g0 K();

    void Ra(@Y61.k String str, boolean z12);

    @Y61.k
    C23038g0 dd();

    @Y61.k
    C23038g0 v4();

    @Y61.k
    D x5();

    /* compiled from: MyAdvertSafeDealServicesViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/safedeal/q$a;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f84227a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Throwable f84228b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final ApiError f84229c;

        public a(@Y61.l ApiError apiError, @Y61.k String str, @Y61.l Throwable th2) {
            this.f84227a = str;
            this.f84228b = th2;
            this.f84229c = apiError;
        }

        public /* synthetic */ a(String str, Throwable th2, ApiError apiError, int i12, C42822w c42822w) {
            this((i12 & 4) != 0 ? null : apiError, str, (i12 & 2) != 0 ? null : th2);
        }
    }
}
