package com.avito.android.messenger.map.search;

import com.avito.android.messenger.map.search.q;
import com.avito.android.mvi.e;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GeoSearchFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/map/search/q$a;", "viewState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/map/search/q$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.map.search.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32533d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GeoSearchFragment f196535b;

    public C32533d(GeoSearchFragment geoSearchFragment) {
        this.f196535b = geoSearchFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        q.a aVar = (q.a) obj;
        B b12 = this.f196535b.f196492t0;
        if (b12 == null) {
            b12 = null;
        }
        b12.getClass();
        e.a.a(b12, aVar);
    }
}
