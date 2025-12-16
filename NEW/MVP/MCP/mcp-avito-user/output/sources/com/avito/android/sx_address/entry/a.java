package com.avito.android.sx_address.entry;

import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SxAddressEntryScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f292912a = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f292913b = new C22096n(2013300127, C8894a.f292914l, false);

    /* compiled from: SxAddressEntryScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.sx_address.entry.a$a, reason: collision with other inner class name */
    public static final class C8894a extends N implements Y41.q<InterfaceC20640y, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8894a f292914l = new C8894a();

        public C8894a() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(InterfaceC20640y interfaceC20640y, A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                C20806p1.a(u0.e.a(R.drawable.placeholders_img_unknown_error_cross, 0, a13), null, null, null, null, 0.0f, null, a13, 56, 124);
            }
            return G0.f406611a;
        }
    }
}
