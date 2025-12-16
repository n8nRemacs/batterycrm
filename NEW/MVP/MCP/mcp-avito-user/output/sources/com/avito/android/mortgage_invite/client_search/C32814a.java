package com.avito.android.mortgage_invite.client_search;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageClientSearchScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage_invite.client_search.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32814a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C32814a f205357a = new C32814a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f205358b = new C22096n(-926631206, C6117a.f205360l, false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22096n f205359c = new C22096n(1552142644, b.f205361l, false);

    /* compiled from: MortgageClientSearchScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage_invite.client_search.a$a, reason: collision with other inner class name */
    public static final class C6117a extends N implements Y41.q<InterfaceC20640y, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6117a f205360l = new C6117a();

        public C6117a() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(InterfaceC20640y interfaceC20640y, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MortgageClientSearchScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage_invite.client_search.a$b */
    public static final class b extends N implements Y41.q<InterfaceC20793y, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f205361l = new b();

        public b() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(InterfaceC20793y interfaceC20793y, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                String strC = u0.i.c(a13, R.string.mortgage_client_search_empty_message);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65241l;
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.p.b(strC, rVar, R1.m(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), 0.0f, 23, 0.0f, 14, 5), false, 0L, null, 0, 0, false, null, a13, 384, 1016);
            }
            return G0.f406611a;
        }
    }
}
