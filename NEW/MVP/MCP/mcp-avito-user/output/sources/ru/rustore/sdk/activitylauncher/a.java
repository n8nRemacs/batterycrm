package ru.rustore.sdk.activitylauncher;

import Na1.b;
import Oa1.C14666z;
import Y41.l;
import Y61.k;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.IntentSender;
import java.util.Collections;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import ru.rustore.sdk.reactive.core.j;
import ru.rustore.sdk.reactive.single.AbstractC47905a;
import ru.rustore.sdk.reactive.single.D;
import ru.rustore.sdk.reactive.single.E;
import ru.rustore.sdk.reactive.single.H;

/* compiled from: ActivityLauncherAnalytics.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/activitylauncher/a;", "", "a", "sdk-public-activitylauncher_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42726C f436751a;

    /* compiled from: ActivityLauncherAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lru/rustore/sdk/activitylauncher/a$a;", "", "<init>", "()V", "", "ACTIVITY_NOT_FOUND_EXCEPTION", "Ljava/lang/String;", "ERROR_DESCRIPTION", "ERROR_LAUNCH_ACTIVITY", "SEND_INTENT_EXCEPTION", "sdk-public-activitylauncher_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: ru.rustore.sdk.activitylauncher.a$a, reason: collision with other inner class name */
    public static final class C12580a {
        public /* synthetic */ C12580a(C42822w c42822w) {
            this();
        }

        public C12580a() {
        }
    }

    /* compiled from: ActivityLauncherAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LNa1/b;", "invoke", "()LNa1/b;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class b extends N implements Y41.a<Na1.b> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f436752l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.f436752l = context;
        }

        @Override // Y41.a
        public final Na1.b invoke() {
            b.a aVar = Na1.b.f11605b;
            Context context = this.f436752l;
            aVar.getClass();
            return C14666z.f12400c.a(context).f12403b;
        }
    }

    /* compiled from: ActivityLauncherAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class c extends N implements l<G0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f436753l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(G0 g02) {
            return G0.f406611a;
        }
    }

    static {
        new C12580a(null);
    }

    public a(@k Context context) {
        this.f436751a = C42727D.c(new b(context));
    }

    public final void a(@k Exception exc) {
        String str;
        if (exc instanceof ActivityNotFoundException) {
            str = "ActivityLauncher.ActivityNotFoundException";
        } else if (exc instanceof IntentSender.SendIntentException) {
            str = "ActivityLauncher.SendIntentException";
        } else {
            str = m0.f406844a.b(exc.getClass()).p0() + " || " + exc.getMessage() + " ||| " + exc.getCause();
        }
        AbstractC47905a<G0> abstractC47905aA = ((Na1.b) this.f436751a.getValue()).a(new Na1.c("launchActivity.error", Collections.singletonMap("errorDescription", str)));
        ru.rustore.sdk.reactive.core.d.f436864a.getClass();
        E.a(D.a(H.a(abstractC47905aA, ru.rustore.sdk.reactive.core.d.a()), ru.rustore.sdk.activitylauncher.b.f436754l), j.f436875a, c.f436753l);
    }
}
