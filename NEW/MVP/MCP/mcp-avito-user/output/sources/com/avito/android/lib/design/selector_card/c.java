package com.avito.android.lib.design.selector_card;

import com.avito.android.lib.design.selector_card.SelectorCardState;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectorCard.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/selector_card/SelectorCardState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class c extends N implements Y41.l<SelectorCardState, SelectorCardState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f180396l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z12) {
        super(1);
        this.f180396l = z12;
    }

    @Override // Y41.l
    public final SelectorCardState invoke(SelectorCardState selectorCardState) {
        return SelectorCardState.a(selectorCardState, null, null, this.f180396l ? SelectorCardState.Border.f180377c : SelectorCardState.Border.f180376b, false, false, null, 123);
    }
}
