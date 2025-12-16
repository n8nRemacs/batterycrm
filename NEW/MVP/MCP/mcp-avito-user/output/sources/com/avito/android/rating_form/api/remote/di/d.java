package com.avito.android.rating_form.api.remote.di;

import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.b1;

/* compiled from: RatingFormJsonModule_ProvideRatingFormAddValueTypeAdapterFactoryFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes16.dex */
public final class d implements h<Set<r>> {

    /* compiled from: RatingFormJsonModule_ProvideRatingFormAddValueTypeAdapterFactoryFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f247973a = new d();
    }

    public static d a() {
        return a.f247973a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.rating_form.api.remote.di.a.f247970a.getClass();
        RuntimeTypeAdapterFactory.f254218g.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = new RuntimeTypeAdapterFactory(RatingFormAddValueType.class);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.DraftCreated.class, "draftCreated", null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.StepsList.class, "stepsList", null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.RenderList.class, "renderList", null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.FieldsList.class, "fieldsList", null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.FieldUpdate.class, "fieldUpdate", null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.ValueAccepted.class, "valueAccepted", null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.ValidationFailed.class, "validationFailed", null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.StepFinished.class, "stepFinished", null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.Done.class, PaymentStateKt.PAYMENT_STATE_DONE, null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.DoneToast.class, "done.toast", null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.DonePseudoStep.class, "done.pseudostep", null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.Error.class, "error", null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.StepValidationFailed.class, "stepValidationFailed", null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.Action.class, "action", null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.Dialog.class, "dialog", null);
        runtimeTypeAdapterFactory.b(RatingFormAddValueType.HiddenFields.class, "hiddenFields", null);
        return b1.g(runtimeTypeAdapterFactory);
    }
}
