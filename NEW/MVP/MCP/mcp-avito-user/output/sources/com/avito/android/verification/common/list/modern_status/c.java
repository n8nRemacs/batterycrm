package com.avito.android.verification.common.list.modern_status;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ModernStatusItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ModernStatusItem f323431l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f323432m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ModernStatusItem modernStatusItem, e eVar) {
        super(0);
        this.f323431l = modernStatusItem;
        this.f323432m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f323431l.f323419f;
        if (deepLink != null) {
            this.f323432m.f323434b.i7(deepLink);
        }
        return G0.f406611a;
    }
}
