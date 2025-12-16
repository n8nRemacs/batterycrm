package com.avito.android.date_time_formatter;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: Job23ResourceProviderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/date_time_formatter/j;", "Lcom/avito/android/date_time_formatter/f;", "_avito_date-time-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f132574a;

    @Inject
    public j(@Y61.k Resources resources) {
        this.f132574a = resources;
    }

    @Override // com.avito.android.date_time_formatter.f
    @Y61.k
    public final String a(@Y61.k String str, @Y61.k String str2) {
        return this.f132574a.getString(R.string.date_at_time_job_23, str);
    }

    @Override // com.avito.android.date_time_formatter.f
    @Y61.k
    public final String b(@Y61.k String str) {
        return this.f132574a.getString(R.string.today_at_time_cap_job_23, str);
    }

    @Override // com.avito.android.date_time_formatter.f
    @Y61.k
    public final String c(@Y61.k String str) {
        return this.f132574a.getString(R.string.yesterday_at_time_cap_job_23);
    }

    @Override // com.avito.android.date_time_formatter.f
    @Y61.k
    public final String d(@Y61.k String str, @Y61.k String str2) {
        return this.f132574a.getString(R.string.date_at_year_job_23, str);
    }
}
