package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: ProfileCreateExtendedLink.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/j;", "", "a", "b", "c", "Lcom/avito/android/deep_linking/links/j$a;", "Lcom/avito/android/deep_linking/links/j$b;", "Lcom/avito/android/deep_linking/links/j$c;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deep_linking.links.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC29684j {

    /* compiled from: ProfileCreateExtendedLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/j$a;", "Lcom/avito/android/deep_linking/links/j;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deep_linking.links.j$a */
    public static final class a implements InterfaceC29684j, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f134005b = new a();
    }

    /* compiled from: ProfileCreateExtendedLink.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/j$b;", "Lcom/avito/android/deep_linking/links/j;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deep_linking.links.j$b */
    public static final /* data */ class b implements InterfaceC29684j, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f134006b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final PrintableText f134007c;

        public b(@Y61.l PrintableText printableText, boolean z12) {
            this.f134006b = z12;
            this.f134007c = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f134006b == bVar.f134006b && kotlin.jvm.internal.L.f(this.f134007c, bVar.f134007c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f134006b) * 31;
            PrintableText printableText = this.f134007c;
            return iHashCode + (printableText == null ? 0 : printableText.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FlowComplete(isProfileFinalized=");
            sb2.append(this.f134006b);
            sb2.append(", mergeSuccessText=");
            return AK.c.m(sb2, this.f134007c, ')');
        }
    }

    /* compiled from: ProfileCreateExtendedLink.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/j$c;", "Lcom/avito/android/deep_linking/links/j;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deep_linking.links.j$c */
    public static final /* data */ class c implements InterfaceC29684j, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        public final int f134008b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f134009c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f134010d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f134011e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f134012f;

        public c(int i12, @Y61.l Integer num, @Y61.k String str, @Y61.l String str2, boolean z12) {
            this.f134008b = i12;
            this.f134009c = str;
            this.f134010d = num;
            this.f134011e = str2;
            this.f134012f = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f134008b == cVar.f134008b && kotlin.jvm.internal.L.f(this.f134009c, cVar.f134009c) && kotlin.jvm.internal.L.f(this.f134010d, cVar.f134010d) && kotlin.jvm.internal.L.f(this.f134011e, cVar.f134011e) && this.f134012f == cVar.f134012f;
        }

        public final int hashCode() {
            int iD2 = androidx.compose.foundation.H.d(Integer.hashCode(this.f134008b) * 31, 31, this.f134009c);
            Integer num = this.f134010d;
            int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f134011e;
            return Boolean.hashCode(this.f134012f) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnlySelectVerticalAndSpecificFlowComplete(verticalId=");
            sb2.append(this.f134008b);
            sb2.append(", verticalTitle=");
            sb2.append(this.f134009c);
            sb2.append(", specificId=");
            sb2.append(this.f134010d);
            sb2.append(", specificTitle=");
            sb2.append(this.f134011e);
            sb2.append(", hasMultipleSpecifics=");
            return androidx.appcompat.app.r.x(sb2, this.f134012f, ')');
        }
    }
}
