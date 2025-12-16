package com.avito.android.mortgage.pre_approval.form.list.items.select.payload;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.pre_approval.form.list.items.select.SelectItem;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectPayload.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/select/payload/a;", "", "a", "b", "Lcom/avito/android/mortgage/pre_approval/form/list/items/select/payload/a$a;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/select/payload/a$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: SelectPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/select/payload/a$a;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/select/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.pre_approval.form.list.items.select.payload.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5987a implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f201842a;

        public C5987a(@l PrintableText printableText) {
            this.f201842a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5987a) && L.f(this.f201842a, ((C5987a) obj).f201842a);
        }

        public final int hashCode() {
            PrintableText printableText = this.f201842a;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ErrorPayload(error="), this.f201842a, ')');
        }
    }

    /* compiled from: SelectPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/select/payload/a$b;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/select/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final SelectItem.Option f201843a;

        public b(@l SelectItem.Option option) {
            this.f201843a = option;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f201843a, ((b) obj).f201843a);
        }

        public final int hashCode() {
            SelectItem.Option option = this.f201843a;
            if (option == null) {
                return 0;
            }
            return option.hashCode();
        }

        @k
        public final String toString() {
            return "SelectedOptionPayload(option=" + this.f201843a + ')';
        }
    }
}
