package com.avito.android.travel_search.ui;

import com.avito.android.shortcut_navigation_bar.adapter.InlineFilterNavigationItem;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import com.avito.android.travel_search.ui.TravelSearchFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import vF0.InterfaceC49206a;

/* compiled from: TravelSearchFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItem;", "shortcut", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItem;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.travel_search.ui.TravelSearchFragment$setupObservers$6", f = "TravelSearchFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class f extends SuspendLambda implements Y41.p<ShortcutNavigationItem, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f303240q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TravelSearchFragment f303241r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelSearchFragment travelSearchFragment, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f303241r = travelSearchFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f303241r, continuation);
        fVar.f303240q = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(ShortcutNavigationItem shortcutNavigationItem, Continuation<? super G0> continuation) {
        return ((f) create(shortcutNavigationItem, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        ShortcutNavigationItem shortcutNavigationItem = (ShortcutNavigationItem) this.f303240q;
        if (shortcutNavigationItem instanceof InlineFilterNavigationItem) {
            TravelSearchFragment.a aVar = TravelSearchFragment.f303202F0;
            this.f303241r.r5().accept(new InterfaceC49206a.c(((InlineFilterNavigationItem) shortcutNavigationItem).f283232g));
        }
        return G0.f406611a;
    }
}
