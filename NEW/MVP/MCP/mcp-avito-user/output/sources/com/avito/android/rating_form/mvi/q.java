package com.avito.android.rating_form.mvi;

import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.StepIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.rating_form.step.t;
import com.avito.android.rating_form.y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RatingResultMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/mvi/q;", "Lcom/avito/android/rating_form/mvi/p;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q implements p {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f248799e = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RatingFormArguments f248800a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final y f248801b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final t f248802c;

    /* renamed from: d, reason: collision with root package name */
    public int f248803d = -1;

    /* compiled from: RatingResultMapper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/rating_form/mvi/q$a;", "", "<init>", "()V", "", "HIGH_PRIORITY", "I", "LEAST_PRIORITY", "LOW_PRIORITY", "", "SELECT_ITEM_STEP_SLUG", "Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public q(@Y61.k RatingFormArguments ratingFormArguments, @Y61.k y yVar, @Y61.k t tVar) {
        this.f248800a = ratingFormArguments;
        this.f248801b = yVar;
        this.f248802c = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0651  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Boolean, java.util.Map, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.String] */
    @Override // com.avito.android.rating_form.mvi.p
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(@Y61.k com.avito.android.rating_form.api.remote.model.RatingFormResult r27, @Y61.k java.util.Map r28) {
        /*
            Method dump skipped, instructions count: 1644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.mvi.q.a(com.avito.android.rating_form.api.remote.model.RatingFormResult, java.util.Map):java.util.ArrayList");
    }

    public final com.avito.android.rating_form.m b() {
        return this.f248801b.b(this.f248803d);
    }

    public final boolean c(RatingFormAddValueType.FieldsList fieldsList) {
        return b().z(new StepIdentifier(fieldsList.getData().getStepId(), fieldsList.getData().getStepSlug())) > b().z(b().getF248810c());
    }

    public final boolean d(RatingFormAddValueType.RenderList renderList) {
        return b().z(new StepIdentifier(0, renderList.getData().getStepSlug(), 1, null)) > b().z(b().getF248810c());
    }
}
