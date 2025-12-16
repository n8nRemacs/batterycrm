package com.avito.android.advert.item.recall_me;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RecallMeV2ResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/recall_me/E;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f78458a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f78459b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f78460c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f78461d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f78462e;

    @Inject
    public E(@Y61.k Resources resources) {
        this.f78458a = resources.getString(R.string.advert_details_recall_me_success_message);
        this.f78459b = resources.getString(R.string.advert_details_recall_me_invalid_phone);
        this.f78460c = resources.getString(R.string.advert_details_recall_me_sms_code_error);
        this.f78461d = resources.getString(R.string.advert_details_recall_me_request_failed_error);
        this.f78462e = resources.getString(R.string.advert_details_recall_me_default_error);
    }
}
