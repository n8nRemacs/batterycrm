package com.avito.android.saved_searches.analytics;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.L;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SavedSearchEntryPointsVisibilityTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/analytics/d;", "", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f258261a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f258262b = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<com.avito.android.saved_searches.analytics.a> f258263c = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: d, reason: collision with root package name */
    public boolean f258264d;

    /* compiled from: SavedSearchEntryPointsVisibilityTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SavedSearchEntryPointType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SavedSearchEntryPointType savedSearchEntryPointType = SavedSearchEntryPointType.f258243c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SavedSearchEntryPointType savedSearchEntryPointType2 = SavedSearchEntryPointType.f258243c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SavedSearchEntryPointType savedSearchEntryPointType3 = SavedSearchEntryPointType.f258243c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public d(@k InterfaceC28373a interfaceC28373a) {
        this.f258261a = interfaceC28373a;
    }

    public final void a(@l String str, @k SavedSearchFromPageType savedSearchFromPageType, @k SavedSearchEntryPointType savedSearchEntryPointType, boolean z12) {
        if (z12) {
            io.reactivex.rxjava3.disposables.c cVar = this.f258262b;
            int iG2 = cVar.g();
            com.jakewharton.rxrelay3.c<com.avito.android.saved_searches.analytics.a> cVar2 = this.f258263c;
            if (iG2 == 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                cVar2.getClass();
                L lD2 = cVar2.y(400L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).D(io.reactivex.rxjava3.internal.functions.a.f401991a);
                l41.g gVar = new l41.g() { // from class: com.avito.android.saved_searches.analytics.e
                    @Override // l41.g
                    public final void accept(Object obj) {
                        a aVar = (a) obj;
                        d dVar = this.f258265b;
                        dVar.getClass();
                        SavedSearchEntryPointType savedSearchEntryPointType2 = aVar.f258256c;
                        int iOrdinal = savedSearchEntryPointType2.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                                return;
                            }
                        } else if (dVar.f258264d) {
                            return;
                        } else {
                            dVar.f258264d = true;
                        }
                        dVar.f258261a.c(new b(aVar.f258254a, aVar.f258255b.f258253b, savedSearchEntryPointType2.f258248b));
                    }
                };
                final V2 v22 = V2.f318762a;
                cVar.b(lD2.v0(gVar, new l41.g() { // from class: com.avito.android.saved_searches.analytics.f
                    @Override // l41.g
                    public final void accept(Object obj) {
                        v22.f((Throwable) obj);
                    }
                }, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
            cVar2.accept(new com.avito.android.saved_searches.analytics.a(str, savedSearchFromPageType, savedSearchEntryPointType));
        }
    }
}
