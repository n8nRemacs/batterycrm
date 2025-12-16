package com.avito.android.developments_advice.di;

import Y61.l;
import com.avito.android.analytics.screens.r;
import com.avito.android.developments_advice.ConsultationFormActivity;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.remote.model.ConsultationFormData;
import cv.InterfaceC39417a;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: ConsultationFormComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_advice/di/d;", "", "a", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes12.dex */
public interface d {

    /* compiled from: ConsultationFormComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/di/d$a;", "", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        d a(@Y61.k f fVar, @Y61.k InterfaceC39417a interfaceC39417a, @h31.b @Y61.k r rVar, @h31.b @l ConsultationFormData consultationFormData, @h31.b @l @Named("advert_id") String str, @h31.b @l @Named("development_id") String str2, @h31.b @l @Named("developer_id") String str3, @h31.b @l @Named("development_offer_id") String str4, @h31.b @l @Named("request_type") String str5, @h31.b @l @Named("choose_callback_time") Boolean bool, @h31.b @l @Named("x_hash") String str6, @h31.b @l @Named("mcid") String str7);
    }

    void a(@Y61.k ConsultationFormActivity consultationFormActivity);
}
