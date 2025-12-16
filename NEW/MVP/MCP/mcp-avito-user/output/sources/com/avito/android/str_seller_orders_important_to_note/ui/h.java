package com.avito.android.str_seller_orders_important_to_note.ui;

import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: BottomSheetScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final h f291433a = new h();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C22096n f291434b = new C22096n(-1211442491, a.f291435l, false);

    /* compiled from: BottomSheetScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f291435l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                d.a("Отклонить заяку? ", new AttributedText("Частые отмены могут привести к отключению онлайн бронирования", C42784z0.f406748b, 0, 4, null), "Отклонить", "Не отклонять", e.f291430l, f.f291431l, g.f291432l, a13, 1797574);
            }
            return G0.f406611a;
        }
    }
}
