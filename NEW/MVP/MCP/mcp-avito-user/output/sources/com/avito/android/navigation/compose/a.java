package com.avito.android.navigation.compose;

import Y41.l;
import androidx.view.C23326c0;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BaseNavActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/c0;", "Lkotlin/G0;", "invoke", "(Landroidx/navigation/c0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a extends N implements l<C23326c0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f207192l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar) {
        super(1);
        this.f207192l = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(C23326c0 c23326c0) {
        C23326c0 c23326c02 = c23326c0;
        Iterator<com.avito.android.lib.compose.design.shared.navigation.a> it = this.f207192l.a2().iterator();
        while (it.hasNext()) {
            it.next().a(c23326c02);
        }
        return G0.f406611a;
    }
}
