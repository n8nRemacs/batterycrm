package com.avito.android.rating_form.step.validations;

import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.rating_form.api.remote.model.a;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: ClientValidationCoroutineInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/rating_form/api/remote/model/a$e;", "Lkotlin/internal/i;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField;", "it", "", "invoke", "(Lkotlin/Q;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class j extends N implements Y41.l<Q<? extends a.e, ? extends RatingFormField>, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final j f249749l = new j();

    public j() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final Boolean invoke(Q<? extends a.e, ? extends RatingFormField> q12) {
        return Boolean.valueOf(((RatingFormField) q12.f406620c).s() != null ? !r1.isEmpty() : false);
    }
}
