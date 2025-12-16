package com.avito.android.mortgage.person_form.list.items.input.payloads;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputPayload.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/input/payloads/a;", "", "a", "b", "c", "Lcom/avito/android/mortgage/person_form/list/items/input/payloads/a$a;", "Lcom/avito/android/mortgage/person_form/list/items/input/payloads/a$b;", "Lcom/avito/android/mortgage/person_form/list/items/input/payloads/a$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/input/payloads/a$a;", "Lcom/avito/android/mortgage/person_form/list/items/input/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.person_form.list.items.input.payloads.a$a, reason: collision with other inner class name */
    public static final class C5943a implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f200724a;

        public C5943a(@l PrintableText printableText) {
            this.f200724a = printableText;
        }
    }

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/input/payloads/a$b;", "Lcom/avito/android/mortgage/person_form/list/items/input/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f200725a;

        public b(boolean z12) {
            this.f200725a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f200725a == ((b) obj).f200725a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f200725a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("InputClearOnFocusChanged(clearOnFocus="), this.f200725a, ')');
        }
    }

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/input/payloads/a$c;", "Lcom/avito/android/mortgage/person_form/list/items/input/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f200726a;

        public c(@k String str) {
            this.f200726a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f200726a, ((c) obj).f200726a);
        }

        public final int hashCode() {
            return this.f200726a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputTextChanged(text="), this.f200726a, ')');
        }
    }
}
