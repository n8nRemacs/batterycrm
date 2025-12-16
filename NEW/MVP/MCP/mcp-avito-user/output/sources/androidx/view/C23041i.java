package androidx.view;

import kotlin.Metadata;

/* compiled from: ComputableLiveData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/i;", "Landroidx/lifecycle/Y;", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23041i extends AbstractC22991Y<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC23043j<Object> f46801a;

    public C23041i(AbstractC23043j<Object> abstractC23043j) {
        this.f46801a = abstractC23043j;
    }

    @Override // androidx.view.AbstractC22991Y
    public final void onActive() {
        AbstractC23043j<Object> abstractC23043j = this.f46801a;
        abstractC23043j.f46802a.execute(abstractC23043j.f46806e);
    }
}
