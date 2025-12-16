package ru.cyberity.cbr.presentation.screen.preview;

import Y61.k;
import j.InterfaceC42153i;
import kotlin.Metadata;
import ru.cyberity.cbr.core.common.g;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.presentation.screen.preview.b;
import ru.cyberity.cbr.presentation.screen.preview.b.a;

/* compiled from: CBRBaseDocumentPreviewFragment.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0015¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/a;", "Lru/cyberity/cbr/presentation/screen/preview/b$a;", "S", "Lru/cyberity/cbr/presentation/screen/preview/b;", "VM", "Lru/cyberity/cbr/presentation/screen/a;", "<init>", "()V", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "Lkotlin/G0;", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class a<S extends b.a, VM extends b<S>> extends ru.cyberity.cbr.presentation.screen.a<S, VM> {
    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @InterfaceC42153i
    public void handleEvent(@k CBRViewModel.CBRViewModelEvent event) {
        if (!(event instanceof b.c)) {
            super.handleEvent(event);
            return;
        }
        g appListener = getAppListener();
        if (appListener != null) {
            appListener.a(((b.c) event).getDocument());
        }
    }
}
