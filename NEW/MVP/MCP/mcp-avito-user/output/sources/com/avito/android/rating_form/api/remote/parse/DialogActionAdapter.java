package com.avito.android.rating_form.api.remote.parse;

import Y61.k;
import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: DialogActionAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/api/remote/parse/DialogActionAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$DialogAction;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DialogActionAdapter extends RuntimeTypeAdapter<RatingFormAddValueType.Dialog.DialogData.DialogAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f248010a;

    public DialogActionAdapter() {
        super(null, null, null, 7, null);
        this.f248010a = P0.g(new Q("close_dialog", RatingFormAddValueType.Dialog.DialogData.DialogAction.CloseDialogAction.class), new Q("update_state", RatingFormAddValueType.Dialog.DialogData.DialogAction.UpdateStateDialogAction.class), new Q("auth", RatingFormAddValueType.Dialog.DialogData.DialogAction.AuthDialogAction.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Class<? extends com.avito.android.rating_form.api.remote.model.RatingFormAddValueType$Dialog$DialogData$DialogAction>>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @k
    public final Map<String, Class<? extends RatingFormAddValueType.Dialog.DialogData.DialogAction>> getMapping() {
        return this.f248010a;
    }
}
