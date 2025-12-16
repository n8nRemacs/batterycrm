package com.avito.android.rating_form.custom_params;

import com.avito.android.di.B;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CustomParamsHelper.kt */
@B
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/custom_params/d;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Set<i<?>> f248016a;

    @Inject
    public d(@Y61.k Set<i<?>> set) {
        this.f248016a = set;
    }

    @Y61.l
    public final <T> T a(@Y61.k kotlin.reflect.d<T> dVar, @Y61.l Map<String, ? extends Object> map) {
        T next;
        Iterator<T> it = this.f248016a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((i) next).getKey(), dVar)) {
                break;
            }
        }
        i iVar = next instanceof i ? (i) next : null;
        if (iVar != null) {
            return (T) iVar.a(map);
        }
        throw new IllegalArgumentException("No provider for given class");
    }
}
