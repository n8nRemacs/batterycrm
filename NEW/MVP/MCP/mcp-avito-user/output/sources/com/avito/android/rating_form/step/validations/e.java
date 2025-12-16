package com.avito.android.rating_form.step.validations;

import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.rating_form.api.remote.model.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ClientValidationCoroutineInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$c;", "Lkotlin/internal/i;", "it", "Lkotlin/Q;", "Lcom/avito/android/rating_form/api/remote/model/a$e;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField;", "invoke", "(Lcom/avito/android/rating_form/api/remote/model/a$c;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements Y41.l<a.c, Q<? extends a.e, ? extends RatingFormField>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<RatingFormField> f249745l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List<RatingFormField> list) {
        super(1);
        this.f249745l = list;
    }

    @Override // Y41.l
    public final Q<? extends a.e, ? extends RatingFormField> invoke(a.c cVar) {
        Object next;
        a.c cVar2 = cVar;
        Iterator<T> it = this.f249745l.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((RatingFormField) next).getViewType() == RatingFormField.ViewType.SCORE) {
                break;
            }
        }
        RatingFormField ratingFormField = (RatingFormField) next;
        long score = cVar2.getData().getScore();
        if (ratingFormField != null) {
            return new Q<>(new a.e(new a.e.AbstractC7454a.c(ratingFormField.getId(), ratingFormField.getSlug(), ratingFormField.getDataType(), score)), ratingFormField);
        }
        return null;
    }
}
