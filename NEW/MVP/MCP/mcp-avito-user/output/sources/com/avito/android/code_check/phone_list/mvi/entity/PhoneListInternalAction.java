package com.avito.android.code_check.phone_list.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.code_check.phone_list.adapter.PhoneListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhoneListInternalAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check/phone_list/mvi/entity/PhoneListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ShowFilteredPhones", "Lcom/avito/android/code_check/phone_list/mvi/entity/PhoneListInternalAction$ShowFilteredPhones;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PhoneListInternalAction extends n {

    /* compiled from: PhoneListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/phone_list/mvi/entity/PhoneListInternalAction$ShowFilteredPhones;", "Lcom/avito/android/code_check/phone_list/mvi/entity/PhoneListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowFilteredPhones implements PhoneListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<PhoneListItem> f119002b;

        /* JADX WARN: Multi-variable type inference failed */
        public ShowFilteredPhones(@k List<? extends PhoneListItem> list) {
            this.f119002b = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF221519d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowFilteredPhones) && L.f(this.f119002b, ((ShowFilteredPhones) obj).f119002b);
        }

        public final int hashCode() {
            return this.f119002b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ShowFilteredPhones(phones="), this.f119002b, ')');
        }
    }
}
