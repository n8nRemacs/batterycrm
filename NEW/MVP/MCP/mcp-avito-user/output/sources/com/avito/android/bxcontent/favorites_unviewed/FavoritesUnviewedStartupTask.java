package com.avito.android.bxcontent.favorites_unviewed;

import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.app.Application;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import com.avito.android.bxcontent.N1;
import com.avito.android.favorite.AbstractC30569c;
import com.avito.android.favorite.InterfaceC30570d;
import com.avito.android.timestamp_storage.domain.d;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.InterfaceC48487s;
import u3.g;
import zE0.C50447b;

/* compiled from: FavoritesUnviewedStartupTask.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/bxcontent/favorites_unviewed/FavoritesUnviewedStartupTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/favorite/d;", "favoriteAdvertsEventInteractor", "Lcom/avito/android/bxcontent/N1;", "onboardingSnoozeTimestampStorage", "Lcom/avito/android/timestamp_storage/domain/d;", "timestampStorage", "Lcom/avito/android/analytics/a;", "analytics", "Lu3/g;", "Lcom/avito/android/ab_tests/groups/SimpleTestGroupWithNone;", "favoritesUnviewedTestGroup", "LBE0/a;", "timestampFeatures", "<init>", "(Lcom/avito/android/favorite/d;Lcom/avito/android/bxcontent/N1;Lcom/avito/android/timestamp_storage/domain/d;Lcom/avito/android/analytics/a;Lu3/g;LBE0/a;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/favorite/d;", "Lcom/avito/android/bxcontent/N1;", "Lcom/avito/android/timestamp_storage/domain/d;", "Lcom/avito/android/analytics/a;", "Lu3/g;", "LBE0/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoritesUnviewedStartupTask implements ApplicationBackgroundStartupTask {

    @k
    private final InterfaceC28373a analytics;

    @k
    private final InterfaceC30570d favoriteAdvertsEventInteractor;

    @k
    private final g<SimpleTestGroupWithNone> favoritesUnviewedTestGroup;

    @k
    private final N1 onboardingSnoozeTimestampStorage;

    @k
    private final BE0.a timestampFeatures;

    @k
    private final d timestampStorage;

    /* compiled from: FavoritesUnviewedStartupTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Throwable, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            FavoritesUnviewedStartupTask.this.analytics.c(new y.a("onboarding.favorites.unviewed.startup.error", 0L, 2, null));
            return G0.f406611a;
        }
    }

    /* compiled from: FavoritesUnviewedStartupTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/favorite/c;", "event", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/favorite/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<AbstractC30569c, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AbstractC30569c abstractC30569c) {
            if (abstractC30569c instanceof AbstractC30569c.a) {
                FavoritesUnviewedStartupTask favoritesUnviewedStartupTask = FavoritesUnviewedStartupTask.this;
                if (favoritesUnviewedStartupTask.timestampFeatures.v().invoke().booleanValue()) {
                    d dVar = favoritesUnviewedStartupTask.timestampStorage;
                    C50447b.f443974a.getClass();
                    dVar.a(C50447b.f443976c);
                } else {
                    favoritesUnviewedStartupTask.onboardingSnoozeTimestampStorage.d("FAVORITES_ADD_TIMESTAMP_POSTFIX");
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public FavoritesUnviewedStartupTask(@k InterfaceC30570d interfaceC30570d, @k N1 n12, @k d dVar, @k InterfaceC28373a interfaceC28373a, @InterfaceC48487s @k g<SimpleTestGroupWithNone> gVar, @k BE0.a aVar) {
        this.favoriteAdvertsEventInteractor = interfaceC30570d;
        this.onboardingSnoozeTimestampStorage = n12;
        this.timestampStorage = dVar;
        this.analytics = interfaceC28373a;
        this.favoritesUnviewedTestGroup = gVar;
        this.timestampFeatures = aVar;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    @SuppressLint({"CheckResult"})
    public void execute(@k Application application) {
        if (this.favoritesUnviewedTestGroup.f439742a.f439749b.a()) {
            A1.j(this.favoriteAdvertsEventInteractor.c(), new a(), new b(), 2);
        }
    }
}
