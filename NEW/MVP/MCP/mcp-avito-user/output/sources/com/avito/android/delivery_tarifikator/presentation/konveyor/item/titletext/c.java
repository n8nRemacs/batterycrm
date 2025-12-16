package com.avito.android.delivery_tarifikator.presentation.konveyor.item.titletext;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TitleTextItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/titletext/c;", "", "a", "b", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/titletext/c$a;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/titletext/c$b;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface c {

    /* compiled from: TitleTextItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/titletext/c$a;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/titletext/c;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AttributedText f135505a;

        public a(@k AttributedText attributedText) {
            this.f135505a = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f135505a, ((a) obj).f135505a);
        }

        public final int hashCode() {
            return this.f135505a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("Attributed(attributedText="), this.f135505a, ')');
        }
    }

    /* compiled from: TitleTextItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/titletext/c$b;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/titletext/c;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f135506a;

        public b(@k PrintableText printableText) {
            this.f135506a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f135506a, ((b) obj).f135506a);
        }

        public final int hashCode() {
            return this.f135506a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("Printable(text="), this.f135506a, ')');
        }
    }
}
