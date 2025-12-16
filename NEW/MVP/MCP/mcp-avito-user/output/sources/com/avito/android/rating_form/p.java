package com.avito.android.rating_form;

import android.content.Intent;
import com.avito.android.A0;
import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.activity.RatingFormFullScreenActivity;
import com.avito.android.rating_form.activity.bottom_sheet.RatingFormBottomSheetActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RatingFormIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/p;", "Lcom/avito/android/rating_form/o;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.features.a f248822a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.activity.a f248823b;

    /* compiled from: RatingFormIntentFactoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_form/p$a;", "", "<init>", "()V", "", "QUERY_MAP_MODAL_KEY", "Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public p(@Y61.k com.avito.android.rating_form.features.a aVar, @Y61.k com.avito.android.rating_form.activity.a aVar2) {
        this.f248822a = aVar;
        this.f248823b = aVar2;
    }

    @Override // com.avito.android.rating_form.o
    @Y61.k
    public final Intent a(int i12, @Y61.l Integer num, @Y61.l String str, @Y61.l String str2, boolean z12) {
        RatingFormArguments.RatingModelArguments ratingModelArguments = new RatingFormArguments.RatingModelArguments(i12, num, str, str2, z12);
        com.avito.android.rating_form.features.a aVar = this.f248822a;
        aVar.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.rating_form.features.a.f248133c[0];
        boolean zBooleanValue = ((Boolean) aVar.f248134b.a().invoke()).booleanValue();
        com.avito.android.rating_form.activity.a aVar2 = this.f248823b;
        if (zBooleanValue) {
            aVar2.getClass();
            RatingFormFullScreenActivity.f247942x.getClass();
            Intent intent = new Intent(aVar2.f247946a, (Class<?>) RatingFormFullScreenActivity.class);
            intent.putExtra("key_arguments", ratingModelArguments);
            return intent;
        }
        aVar2.getClass();
        RatingFormActivity.f247887w.getClass();
        Intent intent2 = new Intent(aVar2.f247946a, (Class<?>) RatingFormActivity.class);
        intent2.putExtra("key_arguments", ratingModelArguments);
        return intent2;
    }

    @Override // com.avito.android.rating_form.o
    @Y61.k
    public final Intent b(@Y61.k String str, @Y61.l String str2, @Y61.k Map map) {
        boolean z12 = Boolean.parseBoolean(String.valueOf(map.get("mobModal")));
        RatingFormArguments.RatingSellerArguments ratingSellerArguments = new RatingFormArguments.RatingSellerArguments(str, map, str2);
        com.avito.android.rating_form.features.a aVar = this.f248822a;
        aVar.getClass();
        kotlin.reflect.n<Object>[] nVarArr = com.avito.android.rating_form.features.a.f248133c;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        A0.a aVar2 = aVar.f248134b;
        boolean zBooleanValue = ((Boolean) aVar2.a().invoke()).booleanValue();
        com.avito.android.rating_form.activity.a aVar3 = this.f248823b;
        if (zBooleanValue && z12) {
            aVar3.getClass();
            RatingFormBottomSheetActivity.f247948z.getClass();
            Intent intent = new Intent(aVar3.f247946a, (Class<?>) RatingFormBottomSheetActivity.class);
            intent.putExtra("key_arguments", ratingSellerArguments);
            return intent;
        }
        kotlin.reflect.n<Object> nVar2 = nVarArr[0];
        if (((Boolean) aVar2.a().invoke()).booleanValue()) {
            aVar3.getClass();
            RatingFormFullScreenActivity.f247942x.getClass();
            Intent intent2 = new Intent(aVar3.f247946a, (Class<?>) RatingFormFullScreenActivity.class);
            intent2.putExtra("key_arguments", ratingSellerArguments);
            return intent2;
        }
        aVar3.getClass();
        RatingFormActivity.f247887w.getClass();
        Intent intent3 = new Intent(aVar3.f247946a, (Class<?>) RatingFormActivity.class);
        intent3.putExtra("key_arguments", ratingSellerArguments);
        return intent3;
    }
}
