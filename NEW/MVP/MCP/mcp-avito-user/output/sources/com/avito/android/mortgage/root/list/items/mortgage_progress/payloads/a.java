package com.avito.android.mortgage.root.list.items.mortgage_progress.payloads;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageProgressPayload.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/mortgage_progress/payloads/a;", "", "a", "b", "c", "Lcom/avito/android/mortgage/root/list/items/mortgage_progress/payloads/a$a;", "Lcom/avito/android/mortgage/root/list/items/mortgage_progress/payloads/a$b;", "Lcom/avito/android/mortgage/root/list/items/mortgage_progress/payloads/a$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: MortgageProgressPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/mortgage_progress/payloads/a$a;", "Lcom/avito/android/mortgage/root/list/items/mortgage_progress/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.root.list.items.mortgage_progress.payloads.a$a, reason: collision with other inner class name */
    public static final /* data */ class C6032a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f202695a;

        public C6032a(int i12) {
            this.f202695a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6032a) && this.f202695a == ((C6032a) obj).f202695a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f202695a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("CurrentStepIdxUpdated(idx="), this.f202695a, ')');
        }
    }

    /* compiled from: MortgageProgressPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/mortgage_progress/payloads/a$b;", "Lcom/avito/android/mortgage/root/list/items/mortgage_progress/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f202696a;

        public b(@k ArrayList arrayList) {
            this.f202696a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f202696a.equals(((b) obj).f202696a);
        }

        public final int hashCode() {
            return this.f202696a.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("StepsUpdated(steps="), this.f202696a, ')');
        }
    }

    /* compiled from: MortgageProgressPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/mortgage_progress/payloads/a$c;", "Lcom/avito/android/mortgage/root/list/items/mortgage_progress/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f202697a;

        public c(@k String str) {
            this.f202697a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f202697a, ((c) obj).f202697a);
        }

        public final int hashCode() {
            return this.f202697a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TitleUpdated(text="), this.f202697a, ')');
        }
    }
}
