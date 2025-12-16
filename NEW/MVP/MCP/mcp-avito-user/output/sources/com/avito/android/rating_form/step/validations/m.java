package com.avito.android.rating_form.step.validations;

import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.rating_form.api.remote.model.a;
import com.avito.android.rating_form.step.validations.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ClientValidationCoroutineInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormField;", "onChangeField", "Lcom/avito/android/rating_form/step/validations/u$a;", "invoke", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormField;)Lcom/avito/android/rating_form/step/validations/u$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class m extends N implements Y41.l<RatingFormField, u.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<com.avito.android.rating_form.api.remote.model.a> f249751l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f249752m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(List<? extends com.avito.android.rating_form.api.remote.model.a> list, b bVar) {
        super(1);
        this.f249751l = list;
        this.f249752m = bVar;
    }

    @Override // Y41.l
    public final u.a invoke(RatingFormField ratingFormField) {
        Object next;
        RatingFormField.Validation validation;
        Object next2;
        RatingFormField ratingFormField2 = ratingFormField;
        List<com.avito.android.rating_form.api.remote.model.a> list = this.f249751l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof a.e) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a.e) next).getData().getFieldId() == ratingFormField2.getId()) {
                break;
            }
        }
        a.e eVar = (a.e) next;
        this.f249752m.getClass();
        Object objE = b.e(eVar, ratingFormField2);
        if (objE == null) {
            objE = b.g(eVar, ratingFormField2);
        }
        List<RatingFormField.Validation> listS = ratingFormField2.s();
        if (listS != null) {
            Iterator<T> it2 = listS.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((RatingFormField.Validation) next2).getRule() == RatingFormField.Validation.Rule.REQUIRED) {
                    break;
                }
            }
            validation = (RatingFormField.Validation) next2;
        } else {
            validation = null;
        }
        String message = validation != null ? validation.getMessage() : null;
        boolean z12 = (validation != null ? validation.getMessageView() : null) == RatingFormField.Validation.MessageView.TOAST;
        if (objE != null || message == null) {
            return null;
        }
        return new u.a(ratingFormField2.k(), message, z12, null, 8, null);
    }
}
