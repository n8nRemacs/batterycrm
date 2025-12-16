package com.avito.android.blueprints.publish.car_body_condition;

import Y41.l;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: PublishBodyConditionItemPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class d extends H implements l<EditableParameter<?>, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final d f106081b = new d();

    public d() {
        super(1, EditableParameter.class, "hasValue", "hasValue()Z", 0);
    }

    @Override // Y41.l
    public final Boolean invoke(EditableParameter<?> editableParameter) {
        return Boolean.valueOf(editableParameter.hasValue());
    }
}
