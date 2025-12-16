package com.avito.android.user_adverts.root_screen.adverts_host.host_view;

import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HostViewEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/b;", "", "a", "b", "c", "d", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/b$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/b$b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/b$c;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/b$d;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: HostViewEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/b$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f313006a;

        public a(@Y61.k String str) {
            this.f313006a = com.avito.android.printable_text.b.f(str);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f313006a, ((a) obj).f313006a);
        }

        public final int hashCode() {
            return this.f313006a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("CommonToast(text="), this.f313006a, ')');
        }
    }

    /* compiled from: HostViewEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/b$b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.host_view.b$b, reason: collision with other inner class name */
    public static final /* data */ class C9590b implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f313007a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ApiError f313008b;

        public C9590b(@Y61.k ApiError apiError, @Y61.k String str) {
            this.f313007a = com.avito.android.printable_text.b.f(str);
            this.f313008b = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9590b)) {
                return false;
            }
            C9590b c9590b = (C9590b) obj;
            return L.f(this.f313007a, c9590b.f313007a) && L.f(this.f313008b, c9590b.f313008b);
        }

        public final int hashCode() {
            return this.f313008b.hashCode() + (this.f313007a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorToast(text=");
            sb2.append(this.f313007a);
            sb2.append(", error=");
            return AK.c.n(sb2, this.f313008b, ')');
        }
    }

    /* compiled from: HostViewEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/b$c;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f313009a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1965801276;
        }

        @Y61.k
        public final String toString() {
            return "ScrollUp";
        }
    }

    /* compiled from: HostViewEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/b$d;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f313010a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1330986707;
        }

        @Y61.k
        public final String toString() {
            return "UpdateAdvertsToast";
        }
    }
}
