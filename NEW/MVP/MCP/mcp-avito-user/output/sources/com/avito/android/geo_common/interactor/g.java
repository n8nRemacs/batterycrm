package com.avito.android.geo_common.interactor;

import com.avito.android.geo_common.model.AddressListResult;
import com.avito.android.geo_common.model.SetDefaultAddressResult;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import tF.C48546c;
import tF.C48547d;

/* compiled from: LocationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/geo_common/interactor/g;", "", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface g {

    /* compiled from: LocationInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.C A(double d12, double d13, @Y61.l String str);

    @Y61.k
    io.reactivex.rxjava3.core.z<List<District>> a(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.z<C48546c> c(@Y61.k String str, @Y61.k String str2);

    @Y61.k
    io.reactivex.rxjava3.core.z<C48547d> d(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.z<List<Location>> g();

    @Y61.k
    io.reactivex.rxjava3.core.z<List<Location>> i(@Y61.k String str);

    @Y61.l
    Object j(@Y61.k String str, @Y61.l String str2, @Y61.k Continuation<? super TypedResult<AddressListResult>> continuation);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.C k(@Y61.k String str);

    @Y61.l
    Object l(@Y61.k String str, int i12, @Y61.k Continuation<? super TypedResult<SetDefaultAddressResult>> continuation);

    @Y61.k
    io.reactivex.rxjava3.core.z<MetroResponseBody> m(@Y61.k String str);

    @Y61.l
    Object n(@Y61.k String str, @Y61.l Boolean bool, @Y61.k Continuation continuation);

    @Y61.l
    Object o(@Y61.k String str, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object p(@Y61.k String str, @Y61.l Double d12, @Y61.l Double d13, @Y61.l Double d14, @Y61.l Double d15, @Y61.k Map map, @Y61.k ContinuationImpl continuationImpl);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.C q(double d12, double d13, @Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.C r(@Y61.l Boolean bool, @Y61.k String str, @Y61.l String str2);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.C s(@Y61.k String str);

    @Y61.l
    Object t(@Y61.k String str, @Y61.k ContinuationImpl continuationImpl);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.C u(@Y61.k String str, @Y61.k HashMap map);

    @Y61.l
    Object v(@Y61.k String str, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object w(@Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object x(@Y61.k String str, double d12, double d13, @Y61.k String str2, @Y61.k Continuation<? super TypedResult<Object>> continuation);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.C y(@Y61.k String str, @Y61.l Double d12, @Y61.l Double d13, @Y61.l Double d14, @Y61.l Double d15, @Y61.k Map map);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.C z();
}
