package com.avito.android.app_rater.interactor;

import androidx.fragment.app.ActivityC22955m;
import com.avito.android.P;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ud.C49037b;

/* compiled from: InAppReviewInteractorGetApps.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/app_rater/interactor/k;", "Lcom/avito/android/app_rater/interactor/d;", "a", "_avito_app-rater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements d {

    /* renamed from: d, reason: collision with root package name */
    public static final Duration f91817d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f91818a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C49037b f91819b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f91820c;

    /* compiled from: InAppReviewInteractorGetApps.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/app_rater/interactor/k$a;", "", "<init>", "()V", "Ljava/time/Duration;", "kotlin.jvm.PlatformType", "MAX_DIFF_DAYS", "Ljava/time/Duration;", "", "SHUTTER_ID", "Ljava/lang/String;", "_avito_app-rater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f91817d = Duration.ofDays(90L);
    }

    @Inject
    public k(@Y61.k P p12, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k C49037b c49037b) {
        this.f91818a = aVar;
        this.f91819b = c49037b;
        this.f91820c = C42727D.c(new l(p12));
    }

    @Override // com.avito.android.app_rater.interactor.d
    @Y61.k
    public final String a() {
        return "com.xiaomi.mipicks";
    }

    @Override // com.avito.android.app_rater.interactor.d
    public final boolean b() {
        return Duration.between(this.f91819b.a(), LocalDateTime.now(ZoneOffset.UTC)).compareTo(f91817d) > 0;
    }

    @Override // com.avito.android.app_rater.interactor.d
    @Y61.k
    public final InterfaceC43160i c(@Y61.k ActivityC22955m activityC22955m) {
        return C43175k.d(new m(this, null));
    }

    @Override // com.avito.android.app_rater.interactor.d
    /* renamed from: isEnabled */
    public final boolean getF91816a() {
        return ((Boolean) this.f91820c.getValue()).booleanValue();
    }
}
