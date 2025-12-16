package com.avito.android.cart_sheet_after_adding.ui.components;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.InterfaceC43030m;
import kotlin.sequences.o0;

/* compiled from: DiscountOnDelivery.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002j\u0002`\u00060\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/ui/components/A;", "LB0/h;", "Lkotlin/Q;", "Lcom/avito/android/remote/model/text/AttributedText;", "", "Lcom/avito/android/cart_sheet_after_adding/ui/components/B;", "Lcom/avito/android/cart_sheet_after_adding/ui/components/DiscountOnDeliveryState;", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class A implements B0.h<Q<? extends AttributedText, ? extends List<? extends B>>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final o0 f115521a;

    /* compiled from: DiscountOnDelivery.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/remote/model/text/AttributedText;", "", "", "it", "Lcom/avito/android/cart_sheet_after_adding/ui/components/B;", "invoke", "(Lkotlin/Q;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Q<? extends AttributedText, ? extends List<? extends Float>>, Q<? extends AttributedText, ? extends List<? extends B>>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f115522l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Q<? extends AttributedText, ? extends List<? extends B>> invoke(Q<? extends AttributedText, ? extends List<? extends Float>> q12) {
            Q<? extends AttributedText, ? extends List<? extends Float>> q13 = q12;
            Iterable iterable = (Iterable) q13.f406620c;
            ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                float fFloatValue = ((Number) it.next()).floatValue();
                if (0.0f > fFloatValue || fFloatValue > 1.0f) {
                    throw new IllegalArgumentException("Progress values must be in range [0f; 1f]");
                }
                arrayList.add(B.a(fFloatValue));
            }
            return new Q<>(q13.f406619b, arrayList);
        }
    }

    public A() {
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f115521a = new o0(C42756l.f(new Q[]{new Q(new AttributedText("Ещё 1 товар, и скидка на доставку — ваша", c42784z0, 1), C42745f0.U(Float.valueOf(1.0f), Float.valueOf(0.0f))), new Q(new AttributedText("Ещё 1 800 ₽ и скидка на доставку — ваша", c42784z0, 1), Collections.singletonList(Float.valueOf(0.5f))), new Q(new AttributedText("Доставка теперь со скидкой", c42784z0, 1), C42745f0.U(Float.valueOf(1.0f), Float.valueOf(1.0f))), new Q(new AttributedText("Доставка теперь со скидкой", c42784z0, 1), Collections.singletonList(Float.valueOf(1.0f))), new Q(new AttributedText("Large text to test how it will be asdf asdf asdfaaaasadfasd fasd fasdddddd", c42784z0, 1), Collections.singletonList(Float.valueOf(1.0f)))}), a.f115522l);
    }

    @Override // B0.h
    @Y61.k
    public final InterfaceC43030m<Q<? extends AttributedText, ? extends List<? extends B>>> a() {
        return this.f115521a;
    }
}
