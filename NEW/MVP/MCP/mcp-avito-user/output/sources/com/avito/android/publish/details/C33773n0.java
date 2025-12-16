package com.avito.android.publish.details;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishDetailsDraftsManager.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/n0;", "Lcom/avito/android/publish/details/m0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.n0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33773n0 implements InterfaceC33770m0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.C0 f234850b;

    /* renamed from: c, reason: collision with root package name */
    public final int f234851c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f234852d = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PublishDetailsDraftsManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/component/toolbar/d;", "it", "Lkotlin/G0;", "accept", "(Lru/avito/component/toolbar/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.n0$a */
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ItemDetailsView f234853b;

        public a(ItemDetailsView itemDetailsView) {
            this.f234853b = itemDetailsView;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f234853b.f((ru.avito.component.toolbar.d) obj);
        }
    }

    @Inject
    public C33773n0(@Y61.k com.avito.android.publish.C0 c02, @com.avito.android.publish.di.W int i12) {
        this.f234850b = c02;
        this.f234851c = i12;
    }

    @Override // com.avito.android.publish.details.w2
    public final void e0() {
        this.f234852d.e();
    }

    @Override // com.avito.android.publish.details.w2
    public final void p2(@Y61.k ItemDetailsView itemDetailsView) {
        this.f234852d.b(this.f234850b.Pe(this.f234851c).m(new a(itemDetailsView)));
    }
}
