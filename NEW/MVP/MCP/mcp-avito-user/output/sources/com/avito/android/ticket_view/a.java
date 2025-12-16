package com.avito.android.ticket_view;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: TicketIconState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/ticket_view/a;", "", "a", "b", "c", "Lcom/avito/android/ticket_view/a$a;", "Lcom/avito/android/ticket_view/a$b;", "Lcom/avito/android/ticket_view/a$c;", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: TicketIconState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ticket_view/a$a;", "Lcom/avito/android/ticket_view/a;", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ticket_view.a$a, reason: collision with other inner class name */
    public static final /* data */ class C9221a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f301387a;

        public C9221a(int i12) {
            this.f301387a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9221a) && this.f301387a == ((C9221a) obj).f301387a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f301387a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("HasItems(quantity="), this.f301387a, ')');
        }
    }

    /* compiled from: TicketIconState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ticket_view/a$b;", "Lcom/avito/android/ticket_view/a;", "<init>", "()V", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f301388a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1480788339;
        }

        @k
        public final String toString() {
            return "Hidden";
        }
    }

    /* compiled from: TicketIconState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ticket_view/a$c;", "Lcom/avito/android/ticket_view/a;", "<init>", "()V", "_avito_ticket-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f301389a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1777394180;
        }

        @k
        public final String toString() {
            return "NoItems";
        }
    }
}
