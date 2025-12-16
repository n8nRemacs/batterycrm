package com.avito.android.messenger.blacklist_reasons;

import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.architecture_components.D;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BlacklistReasonsPresenter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/e;", "LS20/a;", "Lcom/avito/android/messenger/blacklist_reasons/e$a;", "Lcom/avito/android/messenger/blacklist_reasons/b;", "Lcom/avito/android/messenger/blacklist_reasons/a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface e extends S20.a<a>, InterfaceC31689b, InterfaceC31688a {

    /* compiled from: BlacklistReasonsPresenter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/e$a;", "", "a", "b", "c", "d", "Lcom/avito/android/messenger/blacklist_reasons/e$a$a;", "Lcom/avito/android/messenger/blacklist_reasons/e$a$b;", "Lcom/avito/android/messenger/blacklist_reasons/e$a$c;", "Lcom/avito/android/messenger/blacklist_reasons/e$a$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: BlacklistReasonsPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/e$a$a;", "Lcom/avito/android/messenger/blacklist_reasons/e$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.blacklist_reasons.e$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5475a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C5475a f186581a = new C5475a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C5475a);
            }

            public final int hashCode() {
                return -652091183;
            }

            @Y61.k
            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: BlacklistReasonsPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/e$a$b;", "Lcom/avito/android/messenger/blacklist_reasons/e$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final List<com.avito.android.messenger.blacklist_reasons.list_items.a> f186582a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f186583b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f186584c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final Long f186585d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final CharSequence f186586e;

            /* JADX WARN: Multi-variable type inference failed */
            public b(@Y61.k List<? extends com.avito.android.messenger.blacklist_reasons.list_items.a> list, boolean z12, boolean z13, @Y61.l Long l12, @Y61.k CharSequence charSequence) {
                this.f186582a = list;
                this.f186583b = z12;
                this.f186584c = z13;
                this.f186585d = l12;
                this.f186586e = charSequence;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static b a(b bVar, ArrayList arrayList, boolean z12, Long l12, CharSequence charSequence, int i12) {
                List list = arrayList;
                if ((i12 & 1) != 0) {
                    list = bVar.f186582a;
                }
                List list2 = list;
                if ((i12 & 2) != 0) {
                    z12 = bVar.f186583b;
                }
                boolean z13 = z12;
                if ((i12 & 8) != 0) {
                    l12 = bVar.f186585d;
                }
                Long l13 = l12;
                if ((i12 & 16) != 0) {
                    charSequence = bVar.f186586e;
                }
                return new b(list2, z13, bVar.f186584c, l13, charSequence);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f186582a, bVar.f186582a) && this.f186583b == bVar.f186583b && this.f186584c == bVar.f186584c && L.f(this.f186585d, bVar.f186585d) && L.f(this.f186586e, bVar.f186586e);
            }

            public final int hashCode() {
                int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(this.f186582a.hashCode() * 31, 31, this.f186583b), 31, this.f186584c);
                Long l12 = this.f186585d;
                return this.f186586e.hashCode() + ((i12 + (l12 == null ? 0 : l12.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("LoadedReasons(listItems=");
                sb2.append(this.f186582a);
                sb2.append(", blockButtonIsEnabled=");
                sb2.append(this.f186583b);
                sb2.append(", blockingInProgress=");
                sb2.append(this.f186584c);
                sb2.append(", selectedReasonId=");
                sb2.append(this.f186585d);
                sb2.append(", customReasonText=");
                return AK.c.r(sb2, this.f186586e, ')');
            }
        }

        /* compiled from: BlacklistReasonsPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/e$a$c;", "Lcom/avito/android/messenger/blacklist_reasons/e$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f186587a = new c();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1218368817;
            }

            @Y61.k
            public final String toString() {
                return "LoadingReasons";
            }
        }

        /* compiled from: BlacklistReasonsPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/e$a$d;", "Lcom/avito/android/messenger/blacklist_reasons/e$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final PrintableText f186588a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Throwable f186589b;

            public d(@Y61.k PrintableText printableText, @Y61.l Throwable th2) {
                this.f186588a = printableText;
                this.f186589b = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return L.f(this.f186588a, dVar.f186588a) && L.f(this.f186589b, dVar.f186589b);
            }

            public final int hashCode() {
                int iHashCode = this.f186588a.hashCode() * 31;
                Throwable th2 = this.f186589b;
                return iHashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ReasonsLoadingError(formattedErrorMessage=");
                sb2.append(this.f186588a);
                sb2.append(", errorThrowable=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f186589b, ')');
            }
        }
    }

    void Bd(@Y61.k String str, @Y61.k String str2, @Y61.l String str3);

    void Da();

    void S3();

    @Y61.k
    D Z();

    @Y61.k
    D k8();
}
