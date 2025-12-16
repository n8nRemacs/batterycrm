package com.avito.android.category;

import android.text.TextUtils;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.C22491k0;
import com.avito.android.location.r;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.R0;
import io.reactivex.rxjava3.core.z;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;

/* compiled from: CategoryFlowInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category/g;", "Lcom/avito/android/category/d;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.r f116635a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<V0> f116636b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f116637c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f116638d;

    @Inject
    public g(@Y61.k com.avito.android.location.r rVar, @Y61.k h31.e<V0> eVar, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k R0 r02) {
        this.f116635a = rVar;
        this.f116636b = eVar;
        this.f116637c = searchParamsConverter;
        this.f116638d = r02;
    }

    @Override // com.avito.android.category.d
    @Y61.k
    public final kotlinx.coroutines.flow.internal.l a(@Y61.l Location location, @Y61.l String str) {
        return C43175k.Y(C43175k.I(this.f116638d.a(), new C43210w(location != null ? z.c0(location) : r.a.b(this.f116635a, false, 3))), new e(null, this, str));
    }

    @Override // com.avito.android.category.d
    @Y61.k
    public final C0 b(@Y61.k Location location, @Y61.l String str, @Y61.l Map map) {
        SearchParams searchParams;
        SearchParams searchParams2 = new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
        if (TextUtils.isEmpty(str)) {
            searchParams = searchParams2;
        } else {
            searchParams = searchParams2;
            searchParams.setCategoryId(str);
        }
        searchParams.setLocationId(location.getId());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(SearchParamsConverter.DefaultImpls.convertToMap$default(this.f116637c, searchParams, null, false, null, 14, null));
        if (map != null) {
            for (String str2 : map.keySet()) {
                linkedHashMap.put(C22491k0.a(']', "params[", str2), map.get(str2));
            }
        }
        return C43175k.B(new f(this, null), C43175k.I(this.f116638d.a(), new C43210w(linkedHashMap)));
    }
}
