package com.avito.android.travel_payment_selector.mvi.model;

import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.parse.adapter.C34374q;
import com.avito.android.travel_payment_selector.generated.api.api_2_str_booking_payment_types_get.AttributedTextWithIcon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentSelectorKonveyorMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/travel_payment_selector/mvi/model/c;", "", "<init>", "()V", "a", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f302699b = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C34374q f302700a = new C34374q();

    /* compiled from: PaymentSelectorKonveyorMapper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/travel_payment_selector/mvi/model/c$a;", "", "<init>", "()V", "", "DESCRIPTION_BLOCK_ID", "Ljava/lang/String;", "DESCRIPTION_TITLE_ID", "LOAN_TERMS_ID", "TITLE_ID", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Inject
    public c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(ArrayList arrayList, kF0.c cVar, int i12) {
        AttributedText attributedText;
        C42784z0 c42784z0;
        Boolean defaultCollapsed;
        arrayList.add(new com.avito.android.travel_payment_selector.view.items.title.c(AK.c.g(i12, "description_title_id"), cVar.getTitle()));
        int i13 = 0;
        for (Object obj : cVar.a()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            kF0.d dVar = (kF0.d) obj;
            String str = "description_block_id" + i12 + i13;
            AttributedText text = dVar.getItem().getLeftPart().getText();
            String hint = dVar.getHint();
            AttributedTextWithIcon rightPart = dVar.getItem().getRightPart();
            if (rightPart == null || (attributedText = rightPart.getText()) == null) {
                attributedText = new AttributedText("", C42784z0.f406748b, 0, 4, null);
            }
            AttributedText attributedText2 = attributedText;
            boolean zBooleanValue = (dVar.a() == null || (defaultCollapsed = dVar.getDefaultCollapsed()) == null) ? false : defaultCollapsed.booleanValue();
            List<kF0.d> listA = dVar.a();
            if (listA != null) {
                List<kF0.d> list = listA;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((kF0.d) it.next()).getItem());
                }
                c42784z0 = arrayList2;
            } else {
                c42784z0 = C42784z0.f406748b;
            }
            arrayList.add(new com.avito.android.travel_payment_selector.view.items.description.c(str, text, attributedText2, hint, zBooleanValue, c42784z0));
            i13 = i14;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0271  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(@Y61.k com.avito.android.travel_payment_selector.mvi.model.a r42, int r43, @Y61.l java.lang.Integer r44) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.travel_payment_selector.mvi.model.c.b(com.avito.android.travel_payment_selector.mvi.model.a, int, java.lang.Integer):java.util.ArrayList");
    }
}
