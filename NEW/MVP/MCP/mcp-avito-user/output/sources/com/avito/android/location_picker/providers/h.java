package com.avito.android.location_picker.providers;

import com.avito.android.location_picker.providers.g;
import com.avito.android.remote.model.Coordinates;
import kotlin.Metadata;
import yW.AbstractC50188a;

/* compiled from: AdvertsCountProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LyW/a;", "it", "Lkotlin/G0;", "accept", "(LyW/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f182451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f182452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Coordinates f182453d;

    public h(g gVar, String str, Coordinates coordinates) {
        this.f182451b = gVar;
        this.f182452c = str;
        this.f182453d = coordinates;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AbstractC50188a abstractC50188a = (AbstractC50188a) obj;
        if (abstractC50188a instanceof AbstractC50188a.c) {
            this.f182451b.f182448b.put(new g.a(this.f182453d, this.f182452c), abstractC50188a);
        }
    }
}
