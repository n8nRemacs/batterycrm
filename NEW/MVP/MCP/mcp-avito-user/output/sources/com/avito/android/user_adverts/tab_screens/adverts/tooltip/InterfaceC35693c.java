package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: UserAdvertsTooltip.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/c;", "", "a", "b", "c", "Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/c$a;", "Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/c$b;", "Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/c$c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.tooltip.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC35693c {

    /* compiled from: UserAdvertsTooltip.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/c$a;", "Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/c;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.tooltip.c$a */
    public static final class a implements InterfaceC35693c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f315620a = new a();
    }

    /* compiled from: UserAdvertsTooltip.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/c$b;", "Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.tooltip.c$b */
    public static final /* data */ class b implements InterfaceC35693c {

        /* renamed from: a, reason: collision with root package name */
        public final long f315621a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final PrintableText f315622b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final PrintableText f315623c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final PrintableText f315624d;

        public b(long j12, @Y61.k PrintableText printableText, @Y61.k PrintableText printableText2, @Y61.l PrintableText printableText3) {
            this.f315621a = j12;
            this.f315622b = printableText;
            this.f315623c = printableText2;
            this.f315624d = printableText3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f315621a == bVar.f315621a && kotlin.jvm.internal.L.f(this.f315622b, bVar.f315622b) && kotlin.jvm.internal.L.f(this.f315623c, bVar.f315623c) && kotlin.jvm.internal.L.f(this.f315624d, bVar.f315624d);
        }

        public final int hashCode() {
            int iF2 = com.avito.android.actions_sheet.a.f(this.f315623c, com.avito.android.actions_sheet.a.f(this.f315622b, Long.hashCode(this.f315621a) * 31, 31), 31);
            PrintableText printableText = this.f315624d;
            return iF2 + (printableText == null ? 0 : printableText.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MultiAction(itemId=");
            sb2.append(this.f315621a);
            sb2.append(", title=");
            sb2.append(this.f315622b);
            sb2.append(", text=");
            sb2.append(this.f315623c);
            sb2.append(", btnText=");
            return AK.c.m(sb2, this.f315624d, ')');
        }
    }

    /* compiled from: UserAdvertsTooltip.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/c$c;", "Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.tooltip.c$c, reason: collision with other inner class name */
    public static final /* data */ class C9780c implements InterfaceC35693c {

        /* renamed from: a, reason: collision with root package name */
        public final long f315625a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f315626b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f315627c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final DeepLink f315628d;

        public C9780c(long j12, @Y61.l DeepLink deepLink, @Y61.k String str, @Y61.k String str2) {
            this.f315625a = j12;
            this.f315626b = str;
            this.f315627c = str2;
            this.f315628d = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9780c)) {
                return false;
            }
            C9780c c9780c = (C9780c) obj;
            return this.f315625a == c9780c.f315625a && kotlin.jvm.internal.L.f(this.f315626b, c9780c.f315626b) && kotlin.jvm.internal.L.f(this.f315627c, c9780c.f315627c) && kotlin.jvm.internal.L.f(this.f315628d, c9780c.f315628d);
        }

        public final int hashCode() {
            int iD2 = androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(Long.hashCode(this.f315625a) * 31, 31, this.f315626b), 31, this.f315627c);
            DeepLink deepLink = this.f315628d;
            return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MultiItemGroup(itemId=");
            sb2.append(this.f315625a);
            sb2.append(", title=");
            sb2.append(this.f315626b);
            sb2.append(", text=");
            sb2.append(this.f315627c);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f315628d, ')');
        }
    }
}
