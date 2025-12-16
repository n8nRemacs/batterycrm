package com.avito.android.stories.view.stories_carousel;

import com.avito.android.stories.view.o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StoryCarouselItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f285322l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f285323m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, y yVar) {
        super(0);
        this.f285322l = oVar;
        this.f285323m = yVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f285322l.d(null);
        DisposableHelper.a(this.f285323m);
        return G0.f406611a;
    }
}
