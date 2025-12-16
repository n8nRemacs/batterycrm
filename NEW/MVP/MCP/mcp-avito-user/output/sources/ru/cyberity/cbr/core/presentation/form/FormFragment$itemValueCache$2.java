package ru.cyberity.cbr.core.presentation.form;

import Y41.a;
import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FormFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class FormFragment$itemValueCache$2 extends N implements a<ItemValueCache> {
    final /* synthetic */ FormFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormFragment$itemValueCache$2(FormFragment formFragment) {
        super(0);
        this.this$0 = formFragment;
    }

    @Override // Y41.a
    @k
    public final ItemValueCache invoke() {
        HostViewModel hostViewModel = this.this$0.getHostViewModel();
        if (hostViewModel != null) {
            return hostViewModel.getItemValueCache();
        }
        return null;
    }
}
