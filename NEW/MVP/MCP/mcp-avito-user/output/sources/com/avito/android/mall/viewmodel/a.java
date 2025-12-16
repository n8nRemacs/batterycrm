package com.avito.android.mall.viewmodel;

import Y61.k;
import android.os.Bundle;
import androidx.view.AbstractC22991Y;
import com.avito.android.mall.m;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.avito.android.search.p;
import kotlin.Metadata;

/* compiled from: MallViewModelImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mall/viewmodel/a;", "", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {
    void D2();

    @k
    Bundle F5();

    @k
    AbstractC22991Y<m> W();

    @k
    io.reactivex.rxjava3.subjects.e Z7();

    void a8(@k String str);

    void ad();

    void m2(@k p pVar);

    void u4(@k SuggestAction suggestAction);
}
