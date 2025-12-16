package com.avito.android.realty_agency.checkerboard.bottom_sheet;

import androidx.compose.runtime.internal.C22096n;
import di0.C39735e;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CheckerboardSectionSelectorBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.realty_agency.checkerboard.bottom_sheet.j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34214j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C34214j f251016a = new C34214j();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f251017b = new C22096n(618041627, a.f251018l, false);

    /* compiled from: CheckerboardSectionSelectorBottomSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.realty_agency.checkerboard.bottom_sheet.j$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f251018l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                ArrayList arrayList = new ArrayList(5);
                for (int i12 = 0; i12 < 5; i12++) {
                    arrayList.add(new C39735e(i12, true, AK.c.g(i12, "Секция "), (i12 * 10) + " объектов"));
                }
                C34205a.a(arrayList, 0L, C34213i.f251015l, a13, 440);
            }
            return G0.f406611a;
        }
    }
}
