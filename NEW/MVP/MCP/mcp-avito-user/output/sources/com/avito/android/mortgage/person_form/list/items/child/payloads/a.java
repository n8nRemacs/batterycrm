package com.avito.android.mortgage.person_form.list.items.child.payloads;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChildPayload.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/child/payloads/a;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/mortgage/person_form/list/items/child/payloads/a$a;", "Lcom/avito/android/mortgage/person_form/list/items/child/payloads/a$b;", "Lcom/avito/android/mortgage/person_form/list/items/child/payloads/a$c;", "Lcom/avito/android/mortgage/person_form/list/items/child/payloads/a$d;", "Lcom/avito/android/mortgage/person_form/list/items/child/payloads/a$e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: ChildPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/child/payloads/a$a;", "Lcom/avito/android/mortgage/person_form/list/items/child/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.person_form.list.items.child.payloads.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5937a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f200635a;

        public C5937a(boolean z12) {
            this.f200635a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5937a) && this.f200635a == ((C5937a) obj).f200635a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f200635a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CheckboxCheckedChanged(isChecked="), this.f200635a, ')');
        }
    }

    /* compiled from: ChildPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/child/payloads/a$b;", "Lcom/avito/android/mortgage/person_form/list/items/child/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f200636a;

        public b(@l PrintableText printableText) {
            this.f200636a = printableText;
        }
    }

    /* compiled from: ChildPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/child/payloads/a$c;", "Lcom/avito/android/mortgage/person_form/list/items/child/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f200637a;

        public c(boolean z12) {
            this.f200637a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f200637a == ((c) obj).f200637a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f200637a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("InputClearOnFocusChanged(clearOnFocus="), this.f200637a, ')');
        }
    }

    /* compiled from: ChildPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/child/payloads/a$d;", "Lcom/avito/android/mortgage/person_form/list/items/child/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f200638a;

        public d(@k String str) {
            this.f200638a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f200638a, ((d) obj).f200638a);
        }

        public final int hashCode() {
            return this.f200638a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputTextChanged(text="), this.f200638a, ')');
        }
    }

    /* compiled from: ChildPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/child/payloads/a$e;", "Lcom/avito/android/mortgage/person_form/list/items/child/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f200639a;

        public e(@k String str) {
            this.f200639a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f200639a, ((e) obj).f200639a);
        }

        public final int hashCode() {
            return this.f200639a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TitleChanged(title="), this.f200639a, ')');
        }
    }
}
