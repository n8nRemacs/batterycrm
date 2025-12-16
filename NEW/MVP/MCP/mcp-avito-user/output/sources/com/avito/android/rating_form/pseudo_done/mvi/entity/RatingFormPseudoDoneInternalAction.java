package com.avito.android.rating_form.pseudo_done.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;

/* compiled from: RatingFormPseudoDoneInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/pseudo_done/mvi/entity/RatingFormPseudoDoneInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Empty", "Lcom/avito/android/rating_form/pseudo_done/mvi/entity/RatingFormPseudoDoneInternalAction$Close;", "Lcom/avito/android/rating_form/pseudo_done/mvi/entity/RatingFormPseudoDoneInternalAction$Empty;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface RatingFormPseudoDoneInternalAction extends n {

    /* compiled from: RatingFormPseudoDoneInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/pseudo_done/mvi/entity/RatingFormPseudoDoneInternalAction$Close;", "Lcom/avito/android/rating_form/pseudo_done/mvi/entity/RatingFormPseudoDoneInternalAction;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements RatingFormPseudoDoneInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f248853b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1068299779;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: RatingFormPseudoDoneInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/pseudo_done/mvi/entity/RatingFormPseudoDoneInternalAction$Empty;", "Lcom/avito/android/rating_form/pseudo_done/mvi/entity/RatingFormPseudoDoneInternalAction;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Empty implements RatingFormPseudoDoneInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Empty f248854b = new Empty();

        private Empty() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return -1066421934;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }
}
