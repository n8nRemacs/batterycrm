package com.avito.android.model_card;

import Y61.k;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.favorite.l;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinFavoritesInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/model_card/c;", "Lcom/avito/android/beduin/common/component/snippet_list_item/a;", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.beduin.common.component.snippet_list_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f198025b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f198026c = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: BeduinFavoritesInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f198027b = new a<>();

        @Override // l41.g
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* compiled from: BeduinFavoritesInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f198028b = new b<>();

        @Override // l41.g
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @Inject
    public c(@k l lVar) {
        this.f198025b = lVar;
    }

    public final void a(@k String str, @Y61.l String str2, boolean z12) {
        this.f198025b.g(str, new AbstractC30567a.m(str2), z12, null, null, (2016 & 32) != 0 ? null : null, (2016 & 64) != 0 ? null : null, (2016 & 128) != 0 ? null : null, (2016 & 256) != 0 ? null : null, (2016 & 512) != 0 ? null : null, (2016 & 1024) != 0).x(a.f198027b, b.f198028b);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f198026c.e();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return this.f198026c.f401978c;
    }
}
