package com.avito.android.ticket_view.mvi;

import androidx.appcompat.app.r;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TicketViewInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/ticket_view/mvi/k;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/ticket_view/mvi/k$a;", "Lcom/avito/android/ticket_view/mvi/k$b;", "Lcom/avito/android/ticket_view/mvi/k$c;", "Lcom/avito/android/ticket_view/mvi/k$d;", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class k {

    /* compiled from: TicketViewInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ticket_view/mvi/k$a;", "Lcom/avito/android/ticket_view/mvi/k;", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiException f301433a;

        public a(@Y61.k ApiException apiException) {
            super(null);
            this.f301433a = apiException;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f301433a, ((a) obj).f301433a);
        }

        public final int hashCode() {
            return this.f301433a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.q(new StringBuilder("ContentError(error="), this.f301433a, ')');
        }
    }

    /* compiled from: TicketViewInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ticket_view/mvi/k$b;", "Lcom/avito/android/ticket_view/mvi/k;", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends k {

        /* renamed from: a, reason: collision with root package name */
        public final int f301434a;

        public b(int i12) {
            super(null);
            this.f301434a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f301434a == ((b) obj).f301434a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f301434a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("ContentLoaded(quantity="), this.f301434a, ')');
        }
    }

    /* compiled from: TicketViewInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ticket_view/mvi/k$c;", "Lcom/avito/android/ticket_view/mvi/k;", "<init>", "()V", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f301435a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 760971849;
        }

        @Y61.k
        public final String toString() {
            return "HideTicket";
        }
    }

    /* compiled from: TicketViewInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ticket_view/mvi/k$d;", "Lcom/avito/android/ticket_view/mvi/k;", "<init>", "()V", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f301436a = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 814334653;
        }

        @Y61.k
        public final String toString() {
            return "TicketNoItemsLoaded";
        }
    }

    public /* synthetic */ k(C42822w c42822w) {
        this();
    }

    public k() {
    }
}
