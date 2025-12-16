package com.avito.android.remote.parse.adapter.date;

import Y61.k;
import Y61.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import retrofit2.f;

/* compiled from: DateConverterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/date/b;", "Lretrofit2/f$a;", "<init>", "()V", "a", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends f.a {

    /* compiled from: DateConverterFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/date/b$a;", "Lretrofit2/f;", "Ljava/util/Date;", "", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements f<Date, String> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SimpleDateFormat f254265a = new SimpleDateFormat("dd.MM.yyyy", Locale.US);

        @Override // retrofit2.f
        public final String convert(Date date) {
            return this.f254265a.format(date);
        }
    }

    @Override // retrofit2.f.a
    @l
    public final f c(@k Type type, @k Annotation[] annotationArr) {
        Class cls = type instanceof Class ? (Class) type : null;
        if (cls == null || !Date.class.isAssignableFrom(cls)) {
            return null;
        }
        for (Annotation annotation : annotationArr) {
            if (annotation instanceof com.avito.android.remote.parse.adapter.date.a) {
                return new a();
            }
        }
        return null;
    }
}
