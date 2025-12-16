package com.avito.android.free_delivery.ui.re23.components;

import android.net.Uri;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FreeDeliveryListItem.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Uri f158900l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f158901m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Uri uri, float f12) {
        super(2);
        this.f158900l = uri;
        this.f158901m = f12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = v.f42878y1;
            float f12 = this.f158901m;
            v vVarQ = C20588k2.q(aVar, f12, f12);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            coil.compose.v.a(this.f158900l, "", vVarQ, new androidx.compose.ui.graphics.painter.d(com.akita.compose.theme.re23.b.f63984b.f63897X.c(a13), null), null, null, null, null, null, null, null, null, a13, 4104, 0, 65520);
        }
        return G0.f406611a;
    }
}
