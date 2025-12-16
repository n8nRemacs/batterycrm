package com.avito.android.categories_global;

import Ln.C14417b;
import Ln.C14418c;
import com.avito.android.categories_global.domain.CategoriesModel;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: CategoriesInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-global_categories-global_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public static final C14417b a(CategoriesModel categoriesModel) {
        ?? arrayList;
        List<CategoriesModel.Category> listC = categoriesModel.c();
        if (listC != null) {
            List<CategoriesModel.Category> list = listC;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b((CategoriesModel.Category) it.next()));
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        return new C14417b("", "", null, new C14418c(arrayList), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public static final C14417b b(CategoriesModel.Category category) {
        ?? arrayList;
        String id2 = category.getId();
        String name = category.getName();
        Image image = category.getImage();
        List<CategoriesModel.Category> listC = category.c();
        if (listC != null) {
            List<CategoriesModel.Category> list = listC;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b((CategoriesModel.Category) it.next()));
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        C14418c c14418c = new C14418c(arrayList);
        CategoriesModel.ProceedButton proceedButton = category.getProceedButton();
        return new C14417b(id2, name, image, c14418c, proceedButton == null ? null : new C14417b.a(proceedButton.getTitle(), proceedButton.getDeepLink()));
    }
}
