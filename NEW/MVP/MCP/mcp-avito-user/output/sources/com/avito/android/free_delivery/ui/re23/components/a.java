package com.avito.android.free_delivery.ui.re23.components;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FreeDeliveryListItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f158872a = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f158873b = new C22096n(1699948885, C4640a.f158874l, false);

    /* compiled from: FreeDeliveryListItem.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.free_delivery.ui.re23.components.a$a, reason: collision with other inner class name */
    public static final class C4640a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4640a f158874l = new C4640a();

        public C4640a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                UniversalImage universalImageUniversalImageOf$default = UniversalImageKt.universalImageOf$default(null, null, 3, null);
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                o.a("Очень выгодно", universalImageUniversalImageOf$default, R1.i(C20588k2.d(v.f42878y1, 1.0f), 16), a13, 454);
            }
            return G0.f406611a;
        }
    }
}
