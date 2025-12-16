package com.avito.android.date_time_formatter;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.di.module.C30070i4;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: Job24ResourceProviderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/date_time_formatter/l;", "Lcom/avito/android/date_time_formatter/f;", "_avito_date-time-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f132576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f132577b;

    @Inject
    public l(@Y61.k Resources resources, @Y61.k @C30070i4.c f fVar) {
        this.f132576a = resources;
        this.f132577b = fVar;
    }

    @Override // com.avito.android.date_time_formatter.f
    @Y61.k
    public final String a(@Y61.k String str, @Y61.k String str2) {
        return this.f132577b.a(str, str2);
    }

    @Override // com.avito.android.date_time_formatter.f
    @Y61.k
    public final String b(@Y61.k String str) {
        return this.f132576a.getString(R.string.today_at_time_cap_job_24);
    }

    @Override // com.avito.android.date_time_formatter.f
    @Y61.k
    public final String c(@Y61.k String str) {
        return this.f132577b.c(str);
    }

    @Override // com.avito.android.date_time_formatter.f
    @Y61.k
    public final String d(@Y61.k String str, @Y61.k String str2) {
        return this.f132577b.d(str, str2);
    }
}
