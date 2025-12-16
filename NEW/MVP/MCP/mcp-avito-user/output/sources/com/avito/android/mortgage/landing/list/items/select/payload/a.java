package com.avito.android.mortgage.landing.list.items.select.payload;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.select.SelectItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectPayload.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/select/payload/a;", "", "a", "Lcom/avito/android/mortgage/landing/list/items/select/payload/a$a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: SelectPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/select/payload/a$a;", "Lcom/avito/android/mortgage/landing/list/items/select/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.landing.list.items.select.payload.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5913a implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final SelectItem.Option f199971a;

        public C5913a(@l SelectItem.Option option) {
            this.f199971a = option;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5913a) && L.f(this.f199971a, ((C5913a) obj).f199971a);
        }

        public final int hashCode() {
            SelectItem.Option option = this.f199971a;
            if (option == null) {
                return 0;
            }
            return option.hashCode();
        }

        @k
        public final String toString() {
            return "SelectItemChanged(selectedOption=" + this.f199971a + ')';
        }
    }
}
