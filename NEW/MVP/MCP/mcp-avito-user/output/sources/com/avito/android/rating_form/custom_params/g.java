package com.avito.android.rating_form.custom_params;

import com.avito.android.di.B;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;

/* compiled from: DevelopmentParamsProvider.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/custom_params/g;", "Lcom/avito/android/rating_form/custom_params/i;", "Lcom/avito/android/rating_form/custom_params/f;", "<init>", "()V", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements i<f> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.d<f> f248019a = m0.f406844a.b(f.class);

    /* compiled from: DevelopmentParamsProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_form/custom_params/g$a;", "", "<init>", "()V", "", "DISPLAYED_VALUE_KEY", "Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public g() {
    }

    @Override // com.avito.android.rating_form.custom_params.i
    public final f a(Map map) {
        if (map == null) {
            return null;
        }
        Object obj = map.get("displayedValue");
        return new f(obj instanceof String ? (String) obj : null);
    }

    @Override // com.avito.android.rating_form.custom_params.i
    @Y61.k
    public final kotlin.reflect.d<f> getKey() {
        return this.f248019a;
    }
}
