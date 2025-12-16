package com.avito.android.rating_form.api.remote.parse;

import Y61.k;
import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: DialogOnCloseActionAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/api/remote/parse/DialogOnCloseActionAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType$Dialog$DialogData$OnCloseAction;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DialogOnCloseActionAdapter extends RuntimeTypeAdapter<RatingFormAddValueType.Dialog.DialogData.OnCloseAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f248011a;

    public DialogOnCloseActionAdapter() {
        super(null, null, null, 7, null);
        this.f248011a = P0.g(new Q("focus_field", RatingFormAddValueType.Dialog.DialogData.OnCloseAction.FocusFieldAction.class), new Q("send_analytics", RatingFormAddValueType.Dialog.DialogData.OnCloseAction.SendAnalyticsAction.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Class<? extends com.avito.android.rating_form.api.remote.model.RatingFormAddValueType$Dialog$DialogData$OnCloseAction>>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @k
    public final Map<String, Class<? extends RatingFormAddValueType.Dialog.DialogData.OnCloseAction>> getMapping() {
        return this.f248011a;
    }
}
