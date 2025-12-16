package com.avito.android.date_time_formatter;

import android.content.res.Resources;
import com.avito.android.R;
import i31.InterfaceC41220a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* compiled from: DateTimeFormatterResourceProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/date_time_formatter/g;", "Lcom/avito/android/date_time_formatter/f;", "a", "b", "_avito_date-time-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f132570a;

    /* renamed from: b, reason: collision with root package name */
    public final int f132571b;

    /* compiled from: DateTimeFormatterResourceProvider.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/date_time_formatter/g$a;", "", "_avito_date-time-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        g a(int i12);
    }

    /* compiled from: DateTimeFormatterResourceProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0083\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/date_time_formatter/g$b;", "", "<init>", "()V", "_avito_date-time-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @P41.c
    public @interface b {
    }

    @i31.c
    public g(@Y61.k Resources resources, @InterfaceC41220a int i12) {
        this.f132570a = resources;
        this.f132571b = i12;
    }

    @Override // com.avito.android.date_time_formatter.f
    @Y61.k
    public final String a(@Y61.k String str, @Y61.k String str2) {
        return this.f132570a.getString(R.string.date_at_time, str, str2);
    }

    @Override // com.avito.android.date_time_formatter.f
    @Y61.k
    public final String b(@Y61.k String str) {
        int i12 = this.f132571b;
        Resources resources = this.f132570a;
        return i12 == 1 ? resources.getString(R.string.today_at_time_cap, str) : resources.getString(R.string.today_at_time, str);
    }

    @Override // com.avito.android.date_time_formatter.f
    @Y61.k
    public final String c(@Y61.k String str) {
        int i12 = this.f132571b;
        Resources resources = this.f132570a;
        return i12 == 1 ? resources.getString(R.string.yesterday_at_time_cap, str) : resources.getString(R.string.yesterday_at_time, str);
    }

    @Override // com.avito.android.date_time_formatter.f
    @Y61.k
    public final String d(@Y61.k String str, @Y61.k String str2) {
        return this.f132570a.getString(R.string.date_at_year, str, str2);
    }
}
