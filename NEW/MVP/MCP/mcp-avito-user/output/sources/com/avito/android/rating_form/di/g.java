package com.avito.android.rating_form.di;

import android.app.Application;
import com.avito.android.M;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.rating_form.y;
import com.avito.android.suggest_locations.InterfaceC35139d;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import hx.InterfaceC41184a;
import kotlin.Metadata;

/* compiled from: RatingFormDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/di/g;", "Lcom/avito/android/di/h;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface g extends InterfaceC29971h {
    @Y61.k
    com.avito.android.rating_form.features.a Ai();

    @Y61.k
    com.avito.android.rating_form.item.photo_picker.m Ca();

    @Y61.k
    com.avito.android.photo_cache.b F();

    @Y61.k
    M O();

    @Y61.k
    PhotoPickerIntentFactory X();

    @Y61.k
    InterfaceC28373a a();

    @Y61.k
    InterfaceC28481c b();

    @Y61.k
    R0 c();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    InterfaceC35845m2 h();

    @Y61.k
    y hc();

    @Y61.k
    Application k();

    @Y61.k
    InterfaceC41184a o7();

    @Y61.k
    InterfaceC35139d r1();

    @Y61.k
    Gson s();

    @Y61.k
    Vg0.d ve();
}
