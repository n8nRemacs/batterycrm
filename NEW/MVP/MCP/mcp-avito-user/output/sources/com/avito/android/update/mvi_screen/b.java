package com.avito.android.update.mvi_screen;

import GG0.a;
import com.avito.android.deep_linking.links.Store;
import com.avito.android.util.C35853n2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UpdateApplicationMviActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UpdateApplicationMviActivity f306669l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UpdateApplicationMviActivity updateApplicationMviActivity) {
        super(0);
        this.f306669l = updateApplicationMviActivity;
    }

    @Override // Y41.a
    public final G0 invoke() {
        UpdateApplicationMviActivity updateApplicationMviActivity = this.f306669l;
        C35853n2 c35853n2 = updateApplicationMviActivity.f306657m;
        if (c35853n2 == null) {
            c35853n2 = null;
        }
        try {
            updateApplicationMviActivity.startActivity(c35853n2.b(Store.f133676d));
        } catch (Exception unused) {
            ((h) updateApplicationMviActivity.f306659o.getValue()).accept(a.C0338a.f6398a);
        }
        return G0.f406611a;
    }
}
