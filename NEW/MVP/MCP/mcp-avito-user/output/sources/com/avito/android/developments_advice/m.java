package com.avito.android.developments_advice;

import android.app.Application;
import android.content.Intent;
import com.avito.android.developments_advice.ConsultationFormActivity;
import com.avito.android.remote.model.ConsultationFormData;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DevelopmentsAdviceIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_advice/m;", "Lcom/avito/android/developments_advice/l;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f136124a;

    @Inject
    public m(@Y61.k Application application) {
        this.f136124a = application;
    }

    @Override // com.avito.android.developments_advice.l
    @Y61.k
    public final Intent a(@Y61.l ConsultationFormData consultationFormData, @Y61.l Boolean bool, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7) {
        new ConsultationFormActivity.a();
        Intent intent = new Intent(this.f136124a, (Class<?>) ConsultationFormActivity.class);
        if (str != null) {
            intent.putExtra("advert_id", str);
        }
        if (str2 != null) {
            intent.putExtra("development_id", str2);
        }
        if (str3 != null) {
            intent.putExtra("developer_id", str3);
        }
        if (str4 != null) {
            intent.putExtra("development_offer_id", str4);
        }
        if (consultationFormData != null) {
            intent.putExtra("form", consultationFormData);
        }
        if (str5 != null) {
            intent.putExtra("request_type", str5);
        }
        if (bool != null) {
            intent.putExtra("choose_callback_time", bool.booleanValue());
        }
        if (str6 != null) {
            intent.putExtra("x_hash", str6);
        }
        if (str7 != null) {
            intent.putExtra("mcid", str7);
        }
        return intent;
    }
}
