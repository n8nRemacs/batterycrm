package com.avito.android.publish.free_delivery.ui;

import android.net.Uri;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FreeDeliveryBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class q extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Uri f235937l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Uri uri) {
        super(2);
        this.f235937l = uri;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else if (!L.f(this.f235937l, Uri.EMPTY)) {
            v.a aVar = v.f42878y1;
            float f12 = 42;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            coil.compose.v.b(this.f235937l, "", C20588k2.q(aVar, f12, f12), null, null, null, a13, 392, 4088);
        }
        return G0.f406611a;
    }
}
