package com.avito.android.str_cancellation_settings;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.str_cancellation_settings.composables.x0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: StrCancellationSettingsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f288142a = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f288143b = new C22096n(-514093448, C8661a.f288144l, false);

    /* compiled from: StrCancellationSettingsScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.str_cancellation_settings.a$a, reason: collision with other inner class name */
    public static final class C8661a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8661a f288144l = new C8661a();

        public C8661a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = v.f42878y1;
                FillElement fillElement = C20588k2.f28682c;
                aVar.d0(fillElement);
                float f12 = 16;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                x0.b(R1.m(R1.i(fillElement, f12), 0.0f, f12, 0.0f, 0.0f, 13), a13, 6);
            }
            return G0.f406611a;
        }
    }
}
