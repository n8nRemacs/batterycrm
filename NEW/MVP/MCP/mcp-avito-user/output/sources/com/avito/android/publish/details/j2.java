package com.avito.android.publish.details;

import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import kotlin.Metadata;

/* compiled from: PublishDetailsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "param", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class j2<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K1 f234803b;

    public j2(K1 k12) {
        this.f234803b = k12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        EditableParameter<?> editableParameter = (EditableParameter) obj;
        K1 k12 = this.f234803b;
        V0 v02 = k12.f232961J;
        ItemBrief itemBrief = k12.f232960E.f231867e0;
        String id2 = itemBrief != null ? itemBrief.getId() : null;
        S0 s02 = k12.f232975X;
        v02.W8(editableParameter, id2, s02.U().getCategoryId(), s02.C0());
    }
}
