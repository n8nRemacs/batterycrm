package com.avito.android.beduin.common.component.payment_type_selector;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.payment_type_selector.item.PaymentMethodItem;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.adapter.j;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinPaymentMethodSelectorView.kt */
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0011J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\u00052\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_type_selector/f;", "Landroidx/recyclerview/widget/RecyclerView;", "", "Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentMethodElement;", "items", "Lkotlin/G0;", "setItems", "(Ljava/util/List;)V", "Lkotlin/Function1;", "", "listener", "setOnPaymentClickListener", "(LY41/l;)V", "Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentMethodSelectorCustomPaddings;", "paddings", "setPaddings", "(Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentMethodSelectorCustomPaddings;)V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends RecyclerView {

    /* renamed from: F0, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f101814F0;

    /* renamed from: G0, reason: collision with root package name */
    @l
    public Y41.l<? super Integer, G0> f101815G0;

    /* renamed from: H0, reason: collision with root package name */
    @l
    public PaymentMethodSelectorCustomPaddings f101816H0;

    /* compiled from: BeduinPaymentMethodSelectorView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_type_selector/f$a;", "", "<init>", "()V", "", "DEFAULT_PADDING_BETWEEN", "I", "DEFAULT_PADDING_BOTTOM", "DEFAULT_PADDING_LEFT", "DEFAULT_PADDING_RIGHT", "DEFAULT_PADDING_TOP", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public f(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) throws BlueprintCollisionException {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        L0();
        setHasFixedSize(true);
        com.avito.android.beduin.common.component.payment_type_selector.item.b bVar = new com.avito.android.beduin.common.component.payment_type_selector.item.b(new com.avito.android.beduin.common.component.payment_type_selector.item.d(new g(this)));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f101814F0 = hVar;
        setLayoutManager(new LinearLayoutManager(0, false));
        setAdapter(new j(hVar, aVarA));
        l(new e(this), -1);
    }

    public final void L0() {
        Integer bottom;
        Integer top;
        PaymentMethodSelectorCustomPaddings paymentMethodSelectorCustomPaddings = this.f101816H0;
        int iB2 = y6.b((paymentMethodSelectorCustomPaddings == null || (top = paymentMethodSelectorCustomPaddings.getTop()) == null) ? 10 : top.intValue());
        PaymentMethodSelectorCustomPaddings paymentMethodSelectorCustomPaddings2 = this.f101816H0;
        D6.f(this, 0, iB2, 0, y6.b((paymentMethodSelectorCustomPaddings2 == null || (bottom = paymentMethodSelectorCustomPaddings2.getBottom()) == null) ? 8 : bottom.intValue()), 5);
    }

    public final void setItems(@k List<PaymentMethodElement> items) {
        List<PaymentMethodElement> list = items;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList.add(new PaymentMethodItem(String.valueOf(i12), (PaymentMethodElement) obj));
            i12 = i13;
        }
        this.f101814F0.f338510e = new UV0.c(arrayList);
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void setOnPaymentClickListener(@l Y41.l<? super Integer, G0> listener) {
        this.f101815G0 = listener;
    }

    public final void setPaddings(@l PaymentMethodSelectorCustomPaddings paddings) {
        if (L.f(this.f101816H0, paddings)) {
            return;
        }
        this.f101816H0 = paddings;
        L0();
        requestLayout();
    }
}
