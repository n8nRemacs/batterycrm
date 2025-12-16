package com.avito.android.rating_form.step;

import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormFileInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/rating_form/step/z;", "", "a", "b", "c", "Lcom/avito/android/rating_form/step/z$a;", "Lcom/avito/android/rating_form/step/z$b;", "Lcom/avito/android/rating_form/step/z$c;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface z {

    /* compiled from: RatingFormFileInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/z$a;", "Lcom/avito/android/rating_form/step/z;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f249764a;

        public a(@Y61.k PrintableText printableText) {
            this.f249764a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f249764a, ((a) obj).f249764a);
        }

        public final int hashCode() {
            return this.f249764a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("Error(message="), this.f249764a, ')');
        }
    }

    /* compiled from: RatingFormFileInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/z$b;", "Lcom/avito/android/rating_form/step/z;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f249765a;

        public b(@Y61.k String str) {
            this.f249765a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f249765a, ((b) obj).f249765a);
        }

        public final int hashCode() {
            return this.f249765a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Uploaded(key="), this.f249765a, ')');
        }
    }

    /* compiled from: RatingFormFileInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/z$c;", "Lcom/avito/android/rating_form/step/z;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements z {

        /* renamed from: a, reason: collision with root package name */
        public final float f249766a;

        public c(float f12) {
            this.f249766a = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Float.compare(this.f249766a, ((c) obj).f249766a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f249766a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f249766a, new StringBuilder("Uploading(progress="));
        }
    }
}
