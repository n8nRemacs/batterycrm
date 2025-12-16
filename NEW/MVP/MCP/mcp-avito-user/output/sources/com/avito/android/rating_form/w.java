package com.avito.android.rating_form;

import ch0.InterfaceC27196b;
import com.avito.android.rating_form.RatingFormStepProgressInteractor;
import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: RatingFormStepProgressInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/w;", "Lcom/avito/android/rating_form/RatingFormStepProgressInteractor;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class w implements RatingFormStepProgressInteractor {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final y f249769a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final s f249770b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RatingFormStepProgressInteractor.RatingFormStepProgressType f249771c;

    /* compiled from: RatingFormStepProgressInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[RatingFormStepProgressInteractor.RatingFormStepProgressType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RatingFormStepProgressInteractor.RatingFormStepProgressType ratingFormStepProgressType = RatingFormStepProgressInteractor.RatingFormStepProgressType.f247918b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RatingFormStepProgressInteractor.RatingFormStepProgressType ratingFormStepProgressType2 = RatingFormStepProgressInteractor.RatingFormStepProgressType.f247918b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public w(@Y61.k y yVar, @Y61.k s sVar, @Y61.k RatingFormStepProgressInteractor.RatingFormStepProgressType ratingFormStepProgressType) {
        this.f249769a = yVar;
        this.f249770b = sVar;
        this.f249771c = ratingFormStepProgressType;
    }

    @Override // com.avito.android.rating_form.RatingFormStepProgressInteractor
    @Y61.k
    public final InterfaceC27196b a(int i12) {
        Integer numValueOf;
        InterfaceC27196b.a aVar;
        InterfaceC27196b cVar;
        if (i12 == -1) {
            return InterfaceC27196b.a.f58101a;
        }
        m mVarB = this.f249769a.b(i12);
        RatingFormAddValueType.StepsList.StepsListData.Step stepA = mVarB.a();
        if (stepA == null) {
            return InterfaceC27196b.a.f58101a;
        }
        int iOrdinal = this.f249771c.ordinal();
        if (iOrdinal == 0) {
            List<RatingFormAddValueType.StepsList.StepsListData.Step> listJ = mVarB.j();
            if (listJ.isEmpty()) {
                listJ = null;
            }
            if (listJ == null) {
                aVar = InterfaceC27196b.a.f58101a;
            } else {
                int iIndexOf = listJ.indexOf(stepA);
                numValueOf = iIndexOf != -1 ? Integer.valueOf(iIndexOf) : null;
                if (numValueOf != null) {
                    cVar = new InterfaceC27196b.c(this.f249770b.a(numValueOf.intValue() + 1, listJ.size()));
                    return cVar;
                }
                aVar = InterfaceC27196b.a.f58101a;
            }
            return aVar;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String navigationTitle = stepA.getNavigationTitle();
            return navigationTitle != null ? new InterfaceC27196b.c(navigationTitle) : InterfaceC27196b.a.f58101a;
        }
        List<RatingFormAddValueType.StepsList.StepsListData.Step> listJ2 = mVarB.j();
        if (listJ2.isEmpty()) {
            listJ2 = null;
        }
        if (listJ2 == null) {
            aVar = InterfaceC27196b.a.f58101a;
        } else {
            int iIndexOf2 = listJ2.indexOf(stepA);
            numValueOf = iIndexOf2 != -1 ? Integer.valueOf(iIndexOf2) : null;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue() + 1;
                if (mVarB.getF248812e() != null) {
                    cVar = new InterfaceC27196b.C2057b(iIntValue / r7.intValue());
                    return cVar;
                }
                aVar = InterfaceC27196b.a.f58101a;
            } else {
                aVar = InterfaceC27196b.a.f58101a;
            }
        }
        return aVar;
    }
}
