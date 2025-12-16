package com.avito.android.mortgage.person_form.list.items.select.payloads;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.select.SelectItem;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectPayload.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/select/payloads/a;", "", "a", "b", "c", "Lcom/avito/android/mortgage/person_form/list/items/select/payloads/a$a;", "Lcom/avito/android/mortgage/person_form/list/items/select/payloads/a$b;", "Lcom/avito/android/mortgage/person_form/list/items/select/payloads/a$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: SelectPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/select/payloads/a$a;", "Lcom/avito/android/mortgage/person_form/list/items/select/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.person_form.list.items.select.payloads.a$a, reason: collision with other inner class name */
    public static final class C5947a implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f200776a;

        public C5947a(@l PrintableText printableText) {
            this.f200776a = printableText;
        }
    }

    /* compiled from: SelectPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/select/payloads/a$b;", "Lcom/avito/android/mortgage/person_form/list/items/select/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SelectItem f200777a;

        public b(@k SelectItem selectItem) {
            this.f200777a = selectItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f200777a, ((b) obj).f200777a);
        }

        public final int hashCode() {
            return this.f200777a.hashCode();
        }

        @k
        public final String toString() {
            return "OptionsChanged(item=" + this.f200777a + ')';
        }
    }

    /* compiled from: SelectPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/select/payloads/a$c;", "Lcom/avito/android/mortgage/person_form/list/items/select/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SelectItem f200778a;

        public c(@k SelectItem selectItem) {
            this.f200778a = selectItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f200778a, ((c) obj).f200778a);
        }

        public final int hashCode() {
            return this.f200778a.hashCode();
        }

        @k
        public final String toString() {
            return "TextChanged(item=" + this.f200778a + ')';
        }
    }
}
