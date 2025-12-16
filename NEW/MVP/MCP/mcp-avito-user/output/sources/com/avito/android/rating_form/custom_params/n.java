package com.avito.android.rating_form.custom_params;

import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin.common.component.input.single_line.SingleLineInputModel;
import com.avito.android.di.B;
import com.avito.android.rating_form.custom_params.m;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;

/* compiled from: SelectParamsProvider.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/custom_params/n;", "Lcom/avito/android/rating_form/custom_params/i;", "Lcom/avito/android/rating_form/custom_params/m;", "<init>", "()V", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements i<m> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.d<m> f248030a = m0.f406844a.b(m.class);

    /* compiled from: SelectParamsProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/rating_form/custom_params/n$a;", "", "<init>", "()V", "", "DISABLED_KEY", "Ljava/lang/String;", "SEARCH_KEY", "SHOW_AT_KEY", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public n() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.rating_form.custom_params.i
    public final m a(Map map) {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (map == null) {
            return null;
        }
        Object obj = map.get(SingleLineInputModel.STYLE_SEARCH);
        Map map2 = obj instanceof Map ? (Map) obj : null;
        if (map2 == null) {
            return new m(objArr2 == true ? 1 : 0, 1, objArr == true ? 1 : 0);
        }
        Object obj2 = map2.get(BeduinCartItemModel.DISABLED_STRING);
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        Object obj3 = map2.get("showAt");
        Long l12 = obj3 instanceof Long ? (Long) obj3 : null;
        return new m(new m.a(l12 != null ? Integer.valueOf((int) l12.longValue()) : null, bool));
    }

    @Override // com.avito.android.rating_form.custom_params.i
    @Y61.k
    public final kotlin.reflect.d<m> getKey() {
        return this.f248030a;
    }
}
