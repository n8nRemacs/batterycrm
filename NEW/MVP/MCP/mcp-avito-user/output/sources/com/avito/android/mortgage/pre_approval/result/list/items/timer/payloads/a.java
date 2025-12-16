package com.avito.android.mortgage.pre_approval.result.list.items.timer.payloads;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import g00.InterfaceC40507d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TimerPayload.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/list/items/timer/payloads/a;", "", "a", "Lcom/avito/android/mortgage/pre_approval/result/list/items/timer/payloads/a$a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: TimerPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/list/items/timer/payloads/a$a;", "Lcom/avito/android/mortgage/pre_approval/result/list/items/timer/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.pre_approval.result.list.items.timer.payloads.a$a, reason: collision with other inner class name */
    public static final /* data */ class C6001a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC40507d f202080a;

        public C6001a(@k InterfaceC40507d interfaceC40507d) {
            this.f202080a = interfaceC40507d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6001a) && L.f(this.f202080a, ((C6001a) obj).f202080a);
        }

        public final int hashCode() {
            return this.f202080a.hashCode();
        }

        @k
        public final String toString() {
            return "TimePayload(timeLeft=" + this.f202080a + ')';
        }
    }
}
