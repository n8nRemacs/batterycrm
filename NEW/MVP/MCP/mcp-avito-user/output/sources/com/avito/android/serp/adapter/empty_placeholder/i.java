package com.avito.android.serp.adapter.empty_placeholder;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.PlaceholderAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EmptyPlaceholderItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PlaceholderAction f269911l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f269912m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PlaceholderAction placeholderAction, j jVar) {
        super(0);
        this.f269911l = placeholderAction;
        this.f269912m = jVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink uri = this.f269911l.getUri();
        if (uri != null) {
            this.f269912m.f269913b.get().B(uri);
        }
        return G0.f406611a;
    }
}
