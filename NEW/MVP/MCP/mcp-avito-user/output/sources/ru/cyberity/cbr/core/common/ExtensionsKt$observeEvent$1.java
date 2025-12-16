package ru.cyberity.cbr.core.common;

import androidx.view.InterfaceC23040h0;
import kotlin.G0;
import kotlin.Metadata;
import ru.cyberity.cbr.core.presentation.base.Event;

/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0002*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lru/cyberity/cbr/core/presentation/base/Event;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Lru/cyberity/cbr/core/presentation/base/Event;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class ExtensionsKt$observeEvent$1<T> implements InterfaceC23040h0 {
    final /* synthetic */ Y41.l<T, G0> $onEventUnhandledContent;

    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(Event<? extends T> event) {
        T contentIfNotHandled;
        if (event == null || (contentIfNotHandled = event.getContentIfNotHandled()) == null) {
            return;
        }
        this.$onEventUnhandledContent.invoke(contentIfNotHandled);
    }
}
