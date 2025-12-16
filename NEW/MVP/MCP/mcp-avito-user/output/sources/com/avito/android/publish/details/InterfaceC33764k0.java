package com.avito.android.publish.details;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PublishDetailsButtonsStateHolder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/k0;", "Lcom/avito/android/publish/details/j0;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.k0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC33764k0 extends InterfaceC33761j0 {

    /* compiled from: PublishDetailsButtonsStateHolder.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/k0$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.k0$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f234804a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f234805b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f234806c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f234807d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.publish.slots.card_select.item.k f234808e;

        public a() {
            this(null, false, false, false, null, 31, null);
        }

        public static a a(a aVar, String str, boolean z12, boolean z13, boolean z14, com.avito.android.publish.slots.card_select.item.k kVar, int i12) {
            if ((i12 & 1) != 0) {
                str = aVar.f234804a;
            }
            String str2 = str;
            if ((i12 & 2) != 0) {
                z12 = aVar.f234805b;
            }
            boolean z15 = z12;
            if ((i12 & 4) != 0) {
                z13 = aVar.f234806c;
            }
            boolean z16 = z13;
            if ((i12 & 8) != 0) {
                z14 = aVar.f234807d;
            }
            boolean z17 = z14;
            if ((i12 & 16) != 0) {
                kVar = aVar.f234808e;
            }
            aVar.getClass();
            return new a(str2, z15, z16, z17, kVar);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f234804a, aVar.f234804a) && this.f234805b == aVar.f234805b && this.f234806c == aVar.f234806c && this.f234807d == aVar.f234807d && kotlin.jvm.internal.L.f(this.f234808e, aVar.f234808e);
        }

        public final int hashCode() {
            String str = this.f234804a;
            int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f234805b), 31, this.f234806c), 31, this.f234807d);
            com.avito.android.publish.slots.card_select.item.k kVar = this.f234808e;
            return i12 + (kVar != null ? kVar.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "ButtonsState(buttonTitle=" + this.f234804a + ", isEnabled=" + this.f234805b + ", isVisible=" + this.f234806c + ", isSecondary=" + this.f234807d + ", conditionalAction=" + this.f234808e + ')';
        }

        public a(@Y61.l String str, boolean z12, boolean z13, boolean z14, @Y61.l com.avito.android.publish.slots.card_select.item.k kVar) {
            this.f234804a = str;
            this.f234805b = z12;
            this.f234806c = z13;
            this.f234807d = z14;
            this.f234808e = kVar;
        }

        public /* synthetic */ a(String str, boolean z12, boolean z13, boolean z14, com.avito.android.publish.slots.card_select.item.k kVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) != 0 ? null : kVar);
        }
    }
}
