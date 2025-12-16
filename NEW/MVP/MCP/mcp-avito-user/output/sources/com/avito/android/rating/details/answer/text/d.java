package com.avito.android.rating.details.answer.text;

import Y61.k;
import Y61.l;
import com.avito.android.rating.details.answer.text.RatingAddAnswerTextValidationInteractor;
import com.avito.android.ratings.RatingActionAnswerLengthValidationData;
import com.avito.android.util.C5;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RatingAddAnswerTextValidationInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001¨\u0006\u0006²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/text/d;", "Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor;", "", "textLengthFormatted", "minLengthValidationFormatted", "maxLengthValidationFormatted", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements RatingAddAnswerTextValidationInteractor {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final RatingActionAnswerLengthValidationData f246840a;

    /* compiled from: RatingAddAnswerTextValidationInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<String> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f246842m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12) {
            super(0);
            this.f246842m = i12;
        }

        @Override // Y41.a
        public final String invoke() {
            return d.b(d.this, this.f246842m);
        }
    }

    /* compiled from: RatingAddAnswerTextValidationInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f246844m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12) {
            super(0);
            this.f246844m = i12;
        }

        @Override // Y41.a
        public final String invoke() {
            return d.b(d.this, this.f246844m);
        }
    }

    /* compiled from: RatingAddAnswerTextValidationInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<String> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f246846m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12) {
            super(0);
            this.f246846m = i12;
        }

        @Override // Y41.a
        public final String invoke() {
            return d.b(d.this, this.f246846m);
        }
    }

    @Inject
    public d(@l RatingActionAnswerLengthValidationData ratingActionAnswerLengthValidationData) {
        this.f246840a = ratingActionAnswerLengthValidationData;
    }

    public static final String b(d dVar, int i12) {
        dVar.getClass();
        String strE = C5.e(String.valueOf(i12), ' ');
        return strE == null ? String.valueOf(i12) : strE;
    }

    @Override // com.avito.android.rating.details.answer.text.RatingAddAnswerTextValidationInteractor
    @k
    public final RatingAddAnswerTextValidationInteractor.ValidationTextResult a(@k String str, boolean z12) {
        RatingActionAnswerLengthValidationData ratingActionAnswerLengthValidationData = this.f246840a;
        if (ratingActionAnswerLengthValidationData == null) {
            return new RatingAddAnswerTextValidationInteractor.ValidationTextResult.Ok(RatingAddAnswerTextValidationInteractor.ValidationTextMessage.EmptyMessage.f246826b);
        }
        Integer numValueOf = Integer.valueOf(ratingActionAnswerLengthValidationData.f250504b);
        Integer numValueOf2 = Integer.valueOf(ratingActionAnswerLengthValidationData.f250505c);
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        int length = str.length();
        InterfaceC42726C interfaceC42726CC = C42727D.c(new c(length));
        InterfaceC42726C interfaceC42726CC2 = C42727D.c(new b(iIntValue));
        InterfaceC42726C interfaceC42726CC3 = C42727D.c(new a(iIntValue2));
        return ((length < iIntValue || length > iIntValue2) && z12) ? new RatingAddAnswerTextValidationInteractor.ValidationTextResult.Failure(new RatingAddAnswerTextValidationInteractor.ValidationTextMessage.ErrorMessage((String) interfaceC42726CC2.getValue(), (String) interfaceC42726CC3.getValue()), true) : (1 > length || length > iIntValue2) ? length > iIntValue2 ? new RatingAddAnswerTextValidationInteractor.ValidationTextResult.Failure(new RatingAddAnswerTextValidationInteractor.ValidationTextMessage.Message((String) interfaceC42726CC.getValue(), (String) interfaceC42726CC3.getValue(), true), false) : new RatingAddAnswerTextValidationInteractor.ValidationTextResult.Ok(new RatingAddAnswerTextValidationInteractor.ValidationTextMessage.DefaultMessage((String) interfaceC42726CC3.getValue())) : new RatingAddAnswerTextValidationInteractor.ValidationTextResult.Ok(new RatingAddAnswerTextValidationInteractor.ValidationTextMessage.Message((String) interfaceC42726CC.getValue(), (String) interfaceC42726CC3.getValue(), false));
    }
}
