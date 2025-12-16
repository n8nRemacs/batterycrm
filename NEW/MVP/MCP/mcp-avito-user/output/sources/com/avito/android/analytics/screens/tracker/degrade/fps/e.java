package com.avito.android.analytics.screens.tracker.degrade.fps;

import Y41.l;
import Y61.k;
import android.content.SharedPreferences;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.degrade.fps.a;
import com.avito.android.analytics.screens.tracker.fps.ScreenFpsContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DegradeScreenScrollStrategyCalculation.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/degrade/fps/e;", "Lcom/avito/android/analytics/screens/tracker/degrade/fps/c;", "a", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Screen f90822a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SharedPreferences f90823b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<Long, G0> f90824c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f90825d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f90826e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f90827f = new ArrayList();

    /* compiled from: DegradeScreenScrollStrategyCalculation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/degrade/fps/e$a;", "", "<init>", "()V", "", "FRAMES_COUNT_USED_FOR_AVERAGE_ATTACHMENT_DURATION_CALCULATION", "I", "FRAMES_COUNT_USED_TO_DISCOVER_SINGLE_ATTACHMENT_DURATION", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k Screen screen, @k SharedPreferences sharedPreferences, @k l<? super Long, G0> lVar) {
        this.f90822a = screen;
        this.f90823b = sharedPreferences;
        this.f90824c = lVar;
    }

    @Override // com.avito.android.analytics.screens.tracker.degrade.fps.c
    public final void a() {
        this.f90825d = true;
    }

    @Override // com.avito.android.analytics.screens.tracker.degrade.fps.c
    public final void b(@k com.avito.android.fps.a aVar, @k ScreenFpsContext screenFpsContext) {
        if (this.f90825d) {
            ScreenFpsContext screenFpsContext2 = ScreenFpsContext.f90848d;
            ArrayList arrayList = this.f90826e;
            if (screenFpsContext != screenFpsContext2) {
                this.f90825d = false;
                arrayList.clear();
                return;
            }
            arrayList.add(aVar);
            if (10 <= arrayList.size()) {
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                long millis = ((com.avito.android.fps.a) it.next()).f158617a.toMillis();
                while (it.hasNext()) {
                    long millis2 = ((com.avito.android.fps.a) it.next()).f158617a.toMillis();
                    if (millis < millis2) {
                        millis = millis2;
                    }
                }
                ArrayList arrayList2 = this.f90827f;
                arrayList2.add(Long.valueOf(millis));
                this.f90825d = false;
                arrayList.clear();
                if (4 <= arrayList2.size()) {
                    long jC2 = kotlin.math.b.c(C42745f0.m(arrayList2));
                    this.f90823b.edit().putLong("average_attachment_length_" + this.f90822a.f90471b, jC2).apply();
                    arrayList2.clear();
                    ((a.C2683a) this.f90824c).invoke(Long.valueOf(jC2));
                }
            }
        }
    }
}
