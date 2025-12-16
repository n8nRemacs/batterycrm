package com.avito.android.photo_cache;

import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.S;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UploadingProgressInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_cache/n;", "Lcom/avito/android/photo_cache/j;", "_avito_photo-cache_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f216334a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f216335b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f216336c;

    @Inject
    public n(@Y61.k String str, @Y61.k b bVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f216334a = str;
        this.f216335b = bVar;
        this.f216336c = interfaceC35745a5;
    }

    @Override // com.avito.android.photo_cache.j
    @Y61.k
    public final B0 a() {
        return new S(this.f216335b.a(this.f216334a)).q().d0(k.f216332b);
    }

    @Override // com.avito.android.photo_cache.j
    @Y61.k
    public final C41982q1 b() {
        return this.f216335b.a(this.f216334a).d0(m.f216333b).x0(this.f216336c.c());
    }
}
