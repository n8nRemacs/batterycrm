package com.avito.android.similar_adverts.di;

import Mw0.InterfaceC14537a;
import android.content.res.Resources;
import androidx.view.S0;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.rec.ScreenSource;
import com.avito.android.similar_adverts.SimilarAdvertsDialog;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: SimilarAdvertsComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/similar_adverts/di/h;", "", "a", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes3.dex */
public interface h {

    /* compiled from: SimilarAdvertsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/similar_adverts/di/h$a;", "", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        h a(@h31.b @Y61.k Resources resources, @h31.b @Y61.k SimilarAdvertsDialog similarAdvertsDialog, @h31.b @Y61.k String str, @h31.b @Y61.k ScreenSource.FAVORITES favorites, @InterfaceC14537a @h31.b boolean z12, @h31.b @Y61.k r rVar, @h31.b @Y61.k S0 s02, @Y61.k i iVar, @Y61.k InterfaceC39417a interfaceC39417a);
    }

    void a(@Y61.k SimilarAdvertsDialog similarAdvertsDialog);
}
