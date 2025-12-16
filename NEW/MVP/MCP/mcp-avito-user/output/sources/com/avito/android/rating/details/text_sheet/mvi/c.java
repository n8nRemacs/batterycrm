package com.avito.android.rating.details.text_sheet.mvi;

import Eg0.InterfaceC13484a;
import Eg0.b;
import Y61.l;
import com.avito.android.arch.mvi.a;
import com.avito.android.rating.details.interactor.m;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TextSheetActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating/details/text_sheet/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LEg0/a;", "LEg0/b;", "LEg0/d;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC13484a, Eg0.b, Eg0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f247559a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BaseRatingReviewItem.ReviewAction.ReviewActionValue f247560b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueValidation f247561c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public c(@Y61.k m mVar, @Y61.k BaseRatingReviewItem.ReviewAction.ReviewActionValue reviewActionValue) {
        this.f247559a = mVar;
        this.f247560b = reviewActionValue;
        ArrayList arrayList = reviewActionValue.f250274g;
        BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueValidation reviewActionValueValidation = null;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueValidation) next).f250299e == BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueValidation.ReviewActionValueValidationRule.f250300b) {
                    reviewActionValueValidation = next;
                    break;
                }
            }
            reviewActionValueValidation = reviewActionValueValidation;
        }
        this.f247561c = reviewActionValueValidation;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.rating.details.text_sheet.mvi.c r10, kotlinx.coroutines.flow.InterfaceC43172j r11, java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.text_sheet.mvi.c.c(com.avito.android.rating.details.text_sheet.mvi.c, kotlinx.coroutines.flow.j, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Eg0.b> b(InterfaceC13484a interfaceC13484a, Eg0.d dVar) {
        InterfaceC13484a interfaceC13484a2 = interfaceC13484a;
        Eg0.d dVar2 = dVar;
        if (interfaceC13484a2 instanceof InterfaceC13484a.c) {
            return new C43207v(new Eg0.b[]{new b.j(((InterfaceC13484a.c) interfaceC13484a2).f4140a), b.f.f4146a, b.c.f4143a});
        }
        if (interfaceC13484a2.equals(InterfaceC13484a.b.f4139a)) {
            return C43175k.G(new a(dVar2, this, null));
        }
        if (interfaceC13484a2 instanceof InterfaceC13484a.C0243a) {
            return new C43210w(new b.C0244b(((InterfaceC13484a.C0243a) interfaceC13484a2).f4138a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
