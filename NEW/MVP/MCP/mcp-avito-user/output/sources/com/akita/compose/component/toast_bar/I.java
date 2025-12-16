package com.akita.compose.component.toast_bar;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ToastBarResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/akita/compose/component/toast_bar/I;", "", "a", "b", "c", "d", "Lcom/akita/compose/component/toast_bar/I$a;", "Lcom/akita/compose/component/toast_bar/I$b;", "Lcom/akita/compose/component/toast_bar/I$c;", "Lcom/akita/compose/component/toast_bar/I$d;", "toast-bar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface I {

    /* compiled from: ToastBarResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/toast_bar/I$a;", "Lcom/akita/compose/component/toast_bar/I;", "<init>", "()V", "toast-bar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f63212a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -142084173;
        }

        @Y61.k
        public final String toString() {
            return "Dismissed";
        }
    }

    /* compiled from: ToastBarResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/toast_bar/I$b;", "Lcom/akita/compose/component/toast_bar/I;", "<init>", "()V", "toast-bar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f63213a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1226205900;
        }

        @Y61.k
        public final String toString() {
            return "ForceDismissed";
        }
    }

    /* compiled from: ToastBarResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/toast_bar/I$c;", "Lcom/akita/compose/component/toast_bar/I;", "<init>", "()V", "toast-bar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements I {
        static {
            new c();
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1642768405;
        }

        @Y61.k
        public final String toString() {
            return "NegativePerformed";
        }
    }

    /* compiled from: ToastBarResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/toast_bar/I$d;", "Lcom/akita/compose/component/toast_bar/I;", "<init>", "()V", "toast-bar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f63214a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 405296849;
        }

        @Y61.k
        public final String toString() {
            return "PositivePerformed";
        }
    }
}
