package com.avito.android.rating_form.interactor;

import Wg0.AbstractC15763a;
import com.avito.android.rating_form.mvi.p;
import com.avito.android.rating_form.step.validations.o;
import com.avito.android.rating_form.step.validations.r;
import com.avito.android.rating_form.y;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import okhttp3.MultipartBody;

/* compiled from: RatingFormInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/interactor/l;", "Lcom/avito/android/rating_form/interactor/d;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends d {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Vg0.d f248259j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final c f248260k;

    /* compiled from: RatingFormInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_form/interactor/l$a;", "", "<init>", "()V", "", "REQUEST_PARAM_DATA", "Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public l(@Y61.k Vg0.d dVar, @Y61.k c cVar, @Y61.k p pVar, @Y61.k y yVar, @Y61.k o oVar, @Y61.k com.avito.android.rating_form.step.validations.a aVar, @Y61.k r rVar, boolean z12) {
        super(yVar, oVar, aVar, rVar, pVar, z12);
        this.f248259j = dVar;
        this.f248260k = cVar;
    }

    @Override // com.avito.android.rating_form.interactor.d
    @Y61.l
    public final Object h(@Y61.k List list, @Y61.l Integer num, @Y61.l String str, @Y61.k Continuation continuation) {
        return this.f248259j.d(MultipartBody.Part.INSTANCE.createFormData("data", this.f248260k.a(new AbstractC15763a.b(num, list, str))), continuation);
    }
}
