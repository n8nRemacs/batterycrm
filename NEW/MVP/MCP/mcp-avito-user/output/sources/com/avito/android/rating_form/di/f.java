package com.avito.android.rating_form.di;

import android.content.res.Resources;
import androidx.view.S0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.rating_form.RatingFormActivity;
import com.avito.android.rating_form.RatingFormArguments;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: RatingFormComponent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/di/f;", "Lcom/avito/android/rating_form/di/e;", "Lcom/avito/android/rating_form/step/di/d;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes16.dex */
public interface f extends e, com.avito.android.rating_form.step.di.d {

    /* compiled from: RatingFormComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/di/f$a;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        f a(@h31.b @Y61.k S0 s02, @h31.b @Y61.k RatingFormArguments ratingFormArguments, @h31.b @Y61.k Resources resources, @h31.b @Y61.k C28478k c28478k, @d @h31.b boolean z12, @h31.b @b boolean z13, @Y61.k g gVar, @Y61.k InterfaceC39417a interfaceC39417a);
    }

    void H8(@Y61.k com.avito.android.rating_form.activity.c cVar);

    void yb(@Y61.k RatingFormActivity ratingFormActivity);
}
