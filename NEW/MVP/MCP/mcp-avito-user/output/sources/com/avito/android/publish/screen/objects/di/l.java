package com.avito.android.publish.screen.objects.di;

import com.avito.android.publish.C0;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.StringMapParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.images_groups.ImagesGroupsSlot;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ObjectFillFormModule.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/objects/di/l;", "Lcom/avito/android/remote/model/category_parameters/slot/images_groups/ImagesGroupsSlot$ParameterProvider;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements ImagesGroupsSlot.ParameterProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0 f239913a;

    public l(C0 c02) {
        this.f239913a = c02;
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.images_groups.ImagesGroupsSlot.ParameterProvider
    @Y61.l
    public final StringMapParameter getImagesGroupsParameter() {
        ParameterSlot parameterSlot;
        ImagesGroupsSlot imagesGroupsSlot;
        List<ParameterSlot> parameters;
        Object next;
        CategoryParameters categoryParameters = this.f239913a.f231873k0;
        if (categoryParameters == null || (imagesGroupsSlot = (ImagesGroupsSlot) categoryParameters.getFirstParameterOfType(ImagesGroupsSlot.class)) == null || (parameters = imagesGroupsSlot.getParameters()) == null) {
            parameterSlot = null;
        } else {
            Iterator<T> it = parameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((ParameterSlot) next).getId(), ImagesGroupsSlot.f253817ID)) {
                    break;
                }
            }
            parameterSlot = (ParameterSlot) next;
        }
        if (parameterSlot instanceof StringMapParameter) {
            return (StringMapParameter) parameterSlot;
        }
        return null;
    }
}
