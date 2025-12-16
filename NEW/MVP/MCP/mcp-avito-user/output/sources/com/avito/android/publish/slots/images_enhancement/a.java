package com.avito.android.publish.slots.images_enhancement;

import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.MultipleIntParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import xM.C49860a;

/* compiled from: ImagesEnhancementSlotWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_cache/PhotoUpload;", "photosInDb", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class a<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f244105b;

    public a(e eVar) {
        this.f244105b = eVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ParameterSlot parameterSlot;
        List<ParameterSlot> parameters;
        T next;
        List list = (List) obj;
        CategoryParameters categoryParameters = this.f244105b.f244110c.f231873k0;
        if (categoryParameters == null || (parameters = categoryParameters.getParameters()) == null) {
            parameterSlot = null;
        } else {
            Iterator<T> it = parameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (C49860a.a((ParameterSlot) next)) {
                        break;
                    }
                }
            }
            parameterSlot = (ParameterSlot) next;
        }
        MultipleIntParameter multipleIntParameter = parameterSlot instanceof MultipleIntParameter ? (MultipleIntParameter) parameterSlot : null;
        if (multipleIntParameter == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            String str = ((PhotoUpload) it2.next()).f216309k;
            Long lZ02 = str != null ? C43066x.z0(str) : null;
            if (lZ02 != null) {
                arrayList.add(lZ02);
            }
        }
        if (arrayList.size() == list.size()) {
            multipleIntParameter.setValue(arrayList);
        }
    }
}
