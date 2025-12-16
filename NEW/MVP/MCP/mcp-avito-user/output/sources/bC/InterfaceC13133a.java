package Bc;

import Y61.k;
import android.app.Application;
import androidx.core.content.d;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RefreshRateProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LBc/a;", "", "a", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bc.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13133a {

    /* compiled from: RefreshRateProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBc/a$a;", "LBc/a;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bc.a$a, reason: collision with other inner class name */
    public static final class C0060a implements InterfaceC13133a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Application f1559a;

        @Inject
        public C0060a(@k Application application) {
            this.f1559a = application;
        }

        @Override // Bc.InterfaceC13133a
        public final double a() {
            return d.getDisplayOrDefault(this.f1559a).getRefreshRate();
        }
    }

    double a();
}
