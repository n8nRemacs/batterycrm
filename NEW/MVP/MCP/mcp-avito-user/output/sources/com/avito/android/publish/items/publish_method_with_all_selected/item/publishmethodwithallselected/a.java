package com.avito.android.publish.items.publish_method_with_all_selected.item.publishmethodwithallselected;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishMethodOption.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f237074l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f237075m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, DeepLink deepLink) {
        super(0);
        this.f237074l = cVar;
        this.f237075m = deepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f237074l.f237087j.accept(this.f237075m);
        return G0.f406611a;
    }
}
