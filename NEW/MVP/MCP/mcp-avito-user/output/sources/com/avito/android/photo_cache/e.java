package com.avito.android.photo_cache;

import android.database.ContentObserver;
import android.os.Handler;
import com.avito.android.db.r;
import com.avito.android.photo_cache.c;
import io.reactivex.rxjava3.core.InterfaceC41779l;
import kotlin.Metadata;

/* compiled from: PhotoInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_cache/e;", "Landroid/database/ContentObserver;", "_avito_photo-cache_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41779l<r> f216330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.C6488c f216331b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC41779l interfaceC41779l, c.C6488c c6488c, Handler handler) {
        super(handler);
        this.f216330a = interfaceC41779l;
        this.f216331b = c6488c;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z12) {
        this.f216330a.onNext(this.f216331b);
    }
}
