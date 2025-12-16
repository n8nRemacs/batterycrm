package com.avito.android.realty_agency.checkerboard.ui.checkerboard;

import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SectionSelectorButtonPanel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f251389a = new c();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C22096n f251390b = new C22096n(-1799409603, a.f251391l, false);

    /* compiled from: SectionSelectorButtonPanel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f251391l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                d.a("Секция 1", "37 объектов", b.f251388l, null, a13, 438, 8);
            }
            return G0.f406611a;
        }
    }
}
