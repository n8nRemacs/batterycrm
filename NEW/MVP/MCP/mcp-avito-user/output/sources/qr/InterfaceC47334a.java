package qR;

import C11.b;
import C11.c;
import Y61.k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.legal_request.LegalRequestFragment;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import kotlin.Metadata;

/* compiled from: LegalRequestComponent.kt */
@B
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LqR/a;", "", "a", "b", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qR.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC47334a {

    /* compiled from: LegalRequestComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqR/a$a;", "", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qR.a$a, reason: collision with other inner class name */
    public interface InterfaceC12328a {
        @k
        InterfaceC47334a a(@k C31138n0 c31138n0, @h31.b @k String str, @h31.b @k ScreenPerformanceTracker screenPerformanceTracker);
    }

    /* compiled from: LegalRequestComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqR/a$b;", "Lcom/avito/android/di/h;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @c
    /* renamed from: qR.a$b */
    public interface b extends InterfaceC29971h {
        @k
        InterfaceC12328a z8();
    }

    void a(@k LegalRequestFragment legalRequestFragment);
}
