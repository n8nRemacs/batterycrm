package com.avito.android.analytics.screens.tracker;

import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import arrow.core.AbstractC23662a;
import com.avito.android.analytics.screens.J;
import com.avito.android.memory.consumption.f;
import com.avito.android.remote.analytics.C34244a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.SerpResultCategoryDetails;
import kotlin.Metadata;

/* compiled from: ScreenPerformanceTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/ScreenPerformanceTracker;", "", "LoadingType", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ScreenPerformanceTracker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScreenPerformanceTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/ScreenPerformanceTracker$LoadingType;", "", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingType {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadingType f90785b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadingType f90786c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ LoadingType[] f90787d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f90788e;

        static {
            LoadingType loadingType = new LoadingType("REMOTE", 0);
            f90785b = loadingType;
            LoadingType loadingType2 = new LoadingType("LOCAL", 1);
            f90786c = loadingType2;
            LoadingType[] loadingTypeArr = {loadingType, loadingType2};
            f90787d = loadingTypeArr;
            f90788e = kotlin.enums.c.a(loadingTypeArr);
        }

        public LoadingType() {
            throw null;
        }

        public static LoadingType valueOf(String str) {
            return (LoadingType) Enum.valueOf(LoadingType.class, str);
        }

        public static LoadingType[] values() {
            return (LoadingType[]) f90787d.clone();
        }
    }

    /* compiled from: ScreenPerformanceTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void b(ScreenPerformanceTracker screenPerformanceTracker, String str, int i12) {
            if ((i12 & 1) != 0) {
                str = screenPerformanceTracker.getF90716d();
            }
            screenPerformanceTracker.s(str, LoadingType.f90785b);
        }

        public static /* synthetic */ void c(ScreenPerformanceTracker screenPerformanceTracker, String str, com.avito.android.analytics.screens.J j12, Integer num, int i12) {
            if ((i12 & 1) != 0) {
                str = screenPerformanceTracker.getF90716d();
            }
            if ((i12 & 2) != 0) {
                j12 = J.b.f90385a;
            }
            if ((i12 & 4) != 0) {
                num = null;
            }
            screenPerformanceTracker.P(str, j12, num);
        }

        public static /* synthetic */ void d(ScreenPerformanceTracker screenPerformanceTracker, String str, LoadingType loadingType, com.avito.android.analytics.screens.J j12, Integer num, int i12) {
            if ((i12 & 1) != 0) {
                str = screenPerformanceTracker.getF90716d();
            }
            if ((i12 & 2) != 0) {
                loadingType = LoadingType.f90785b;
            }
            if ((i12 & 4) != 0) {
                j12 = J.b.f90385a;
            }
            if ((i12 & 8) != 0) {
                num = null;
            }
            screenPerformanceTracker.r(str, loadingType, j12, num);
        }

        public static /* synthetic */ void e(ScreenPerformanceTracker screenPerformanceTracker, String str, LoadingType loadingType, com.avito.android.analytics.screens.J j12, long j13, int i12) {
            if ((i12 & 1) != 0) {
                str = screenPerformanceTracker.getF90716d();
            }
            String str2 = str;
            if ((i12 & 2) != 0) {
                loadingType = LoadingType.f90785b;
            }
            LoadingType loadingType2 = loadingType;
            if ((i12 & 4) != 0) {
                j12 = J.b.f90385a;
            }
            screenPerformanceTracker.E(str2, loadingType2, j12, j13);
        }
    }

    void A(@Y61.k String str, boolean z12);

    void B(@Y61.k com.avito.android.analytics.screens.image.c cVar, @Y61.k InterfaceC22983P interfaceC22983P);

    void D(@Y61.k String str, boolean z12);

    void E(@Y61.k String str, @Y61.k LoadingType loadingType, @Y61.k com.avito.android.analytics.screens.J j12, long j13);

    @Y61.l
    C34244a F(@Y61.k String str, @Y61.l AbstractC23662a<? extends Throwable, ? extends ApiError> abstractC23662a, boolean z12);

    void G(@Y61.l SerpResultCategoryDetails serpResultCategoryDetails);

    @Y61.l
    Long H(@Y61.k String str);

    @Y61.k
    /* renamed from: O */
    String getF90716d();

    void P(@Y61.k String str, @Y61.k com.avito.android.analytics.screens.J j12, @Y61.l Integer num);

    void a(long j12);

    void b(@Y61.k RecyclerView recyclerView);

    void c(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k f.a aVar);

    void d();

    void e();

    void f();

    void l();

    void m(@Y61.k String str);

    @Y61.k
    C28493o o(@Y61.l AbstractC23662a.b bVar);

    void p(@Y61.k com.avito.android.analytics.screens.tracker.fps.h hVar);

    void r(@Y61.k String str, @Y61.k LoadingType loadingType, @Y61.k com.avito.android.analytics.screens.J j12, @Y61.l Integer num);

    void s(@Y61.k String str, @Y61.k LoadingType loadingType);

    void t(long j12);
}
