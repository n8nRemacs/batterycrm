package com.avito.android.rating_form.step.validations;

import com.avito.android.rating_form.FieldIdentifier;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0015\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$e;", "Lkotlin/internal/i;", "command", "Lkotlin/Q;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField;", "invoke", "(Lcom/avito/android/rating_form/api/remote/model/a$e;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i extends N implements Y41.l<a.e, Q<? extends a.e, ? extends RatingFormField>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<RatingFormField> f249748l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List<RatingFormField> list) {
        super(1);
        this.f249748l = list;
    }

    @Override // Y41.l
    public final Q<? extends a.e, ? extends RatingFormField> invoke(a.e eVar) {
        Object next;
        a.e eVar2 = eVar;
        a.e.AbstractC7454a data = eVar2.getData();
        data.getClass();
        FieldIdentifier fieldIdentifier = new FieldIdentifier(data.getFieldId(), data.getFieldSlug());
        Iterator<T> it = this.f249748l.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((RatingFormField) next).k().equals(fieldIdentifier)) {
                break;
            }
        }
        RatingFormField ratingFormField = (RatingFormField) next;
        if (ratingFormField != null) {
            return new Q<>(eVar2, ratingFormField);
        }
        return null;
    }
}
