package com.avito.android.categories;

import Gn.InterfaceC13898a;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Category;
import io.reactivex.rxjava3.core.z;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.g;

/* compiled from: CategoriesInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/categories/b;", "Lcom/avito/android/categories/a;", "_avito-discouraged_avito-api_categories"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.categories.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC13898a f116297a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public List<Category> f116298b;

    /* compiled from: CategoriesInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/Category;", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.this.f116298b = (List) obj;
        }
    }

    @Inject
    public b(@k InterfaceC13898a interfaceC13898a) {
        this.f116297a = interfaceC13898a;
    }

    @Override // com.avito.android.categories.a
    @k
    public final z<List<Category>> a() {
        List<Category> list = this.f116298b;
        return list != null ? z.c0(list) : this.f116297a.a().K(new a());
    }

    @Override // com.avito.android.categories.a
    @l
    public final Category b(@k String str) {
        List<Category> list = this.f116298b;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (L.f(((Category) next).getId(), str)) {
                obj = next;
                break;
            }
        }
        return (Category) obj;
    }
}
