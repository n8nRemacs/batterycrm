package com.avito.android.rating.details.text_sheet.mvi;

import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TextSheetFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f247567a;

    /* renamed from: b, reason: collision with root package name */
    public final i f247568b;

    /* renamed from: c, reason: collision with root package name */
    public final k f247569c;

    /* renamed from: d, reason: collision with root package name */
    public final l f247570d;

    public g(d dVar, i iVar, k kVar, l lVar) {
        this.f247567a = dVar;
        this.f247568b = iVar;
        this.f247569c = kVar;
        this.f247570d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Object next;
        c cVar = (c) this.f247567a.get();
        h hVar = (h) this.f247568b.get();
        this.f247569c.getClass();
        j jVar = new j();
        BaseRatingReviewItem.ReviewAction.ReviewActionValue reviewActionValue = (BaseRatingReviewItem.ReviewAction.ReviewActionValue) this.f247570d.f393949a;
        Eg0.d.f4159g.getClass();
        String str = reviewActionValue.f250270c;
        PrintableText printableTextF = str != null ? com.avito.android.printable_text.b.f(str) : com.avito.android.printable_text.b.c(R.string.review_add_answer_text_input_hint, new Serializable[0]);
        Integer num = null;
        ArrayList arrayList = reviewActionValue.f250274g;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueValidation) next).f250299e == BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueValidation.ReviewActionValueValidationRule.f250300b) {
                    break;
                }
            }
            BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueValidation reviewActionValueValidation = (BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueValidation) next;
            if (reviewActionValueValidation != null) {
                num = reviewActionValueValidation.f250296b;
            }
        }
        return new f("TextSheet", new Eg0.d(reviewActionValue.f250269b, "", printableTextF, null, false, num), new e(cVar, jVar, hVar));
    }
}
