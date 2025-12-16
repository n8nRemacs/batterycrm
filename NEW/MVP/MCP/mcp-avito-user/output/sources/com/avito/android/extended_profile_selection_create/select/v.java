package com.avito.android.extended_profile_selection_create.select;

import RA.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateFragment;
import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateState;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.shortcut_navigation_bar.adapter.ClarifyButtonItem;
import com.avito.android.shortcut_navigation_bar.adapter.InlineFilterNavigationItem;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItemImpl;
import com.avito.android.shortcut_navigation_bar.adapter.SkeletonItem;
import com.avito.android.shortcut_navigation_bar.adapter.TagShortcutItem;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ExtendedProfileSelectionCreateView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItem;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItem;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateView$initInlineFilters$4", f = "ExtendedProfileSelectionCreateView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class v extends SuspendLambda implements Y41.p<ShortcutNavigationItem, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f152426q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ H f152427r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(H h12, Continuation<? super v> continuation) {
        super(2, continuation);
        this.f152427r = h12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        v vVar = new v(this.f152427r, continuation);
        vVar.f152426q = obj;
        return vVar;
    }

    @Override // Y41.p
    public final Object invoke(ShortcutNavigationItem shortcutNavigationItem, Continuation<? super G0> continuation) {
        return ((v) create(shortcutNavigationItem, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        ShortcutNavigationItem shortcutNavigationItem = (ShortcutNavigationItem) this.f152426q;
        H h12 = this.f152427r;
        h12.getClass();
        boolean z12 = shortcutNavigationItem instanceof ShortcutNavigationItemImpl;
        Y41.l<RA.a, G0> lVar = h12.f152005c;
        if (z12) {
            DeepLink deepLink = ((ShortcutNavigationItemImpl) shortcutNavigationItem).f283245d;
            if (deepLink != null) {
                ((ExtendedProfileSelectionCreateFragment.d) lVar).invoke(new a.g(deepLink));
            }
        } else if (shortcutNavigationItem instanceof InlineFilterNavigationItem) {
            SearchParams searchParams = ((ExtendedProfileSelectionCreateState) ((ExtendedProfileSelectionCreateFragment.e) h12.f152007e).invoke()).f152343d;
            h12.f152010h.y1(((InlineFilterNavigationItem) shortcutNavigationItem).f283232g, searchParams, null, null);
        } else if (shortcutNavigationItem instanceof ClarifyButtonItem) {
            ((ExtendedProfileSelectionCreateFragment.d) lVar).invoke(a.d.f14166a);
        } else if (!(shortcutNavigationItem instanceof SkeletonItem)) {
            boolean z13 = shortcutNavigationItem instanceof TagShortcutItem;
        }
        return G0.f406611a;
    }
}
