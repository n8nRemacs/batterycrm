package com.avito.android.publish.edit_advert_request_mvi;

import com.avito.android.deep_linking.links.DeepLink;
import ee0.InterfaceC40094a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditRequestFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EditRequestFragment f235562l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f235563m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditRequestFragment editRequestFragment, DeepLink deepLink) {
        super(0);
        this.f235562l = editRequestFragment;
        this.f235563m = deepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f235562l.q5().accept(new InterfaceC40094a.C11096a(this.f235563m));
        return G0.f406611a;
    }
}
