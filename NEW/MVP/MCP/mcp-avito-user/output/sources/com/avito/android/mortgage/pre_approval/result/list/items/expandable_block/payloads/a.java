package com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.payloads;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ExpandablePayload.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/list/items/expandable_block/payloads/a;", "", "a", "Lcom/avito/android/mortgage/pre_approval/result/list/items/expandable_block/payloads/a$a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: ExpandablePayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/list/items/expandable_block/payloads/a$a;", "Lcom/avito/android/mortgage/pre_approval/result/list/items/expandable_block/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.payloads.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5997a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f202054a;

        public C5997a(boolean z12) {
            this.f202054a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5997a) && this.f202054a == ((C5997a) obj).f202054a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f202054a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ExpandedPayload(isExpanded="), this.f202054a, ')');
        }
    }
}
