package e60;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileToConvertOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Le60/b;", "", "a", "Le60/b$a;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: e60.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC39957b {

    /* compiled from: ProfileToConvertOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le60/b$a;", "Le60/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e60.b$a */
    public static final /* data */ class a implements InterfaceC39957b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f394960a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f394961b;

        public a(@l PrintableText printableText, boolean z12) {
            this.f394960a = z12;
            this.f394961b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f394960a == aVar.f394960a && L.f(this.f394961b, aVar.f394961b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f394960a) * 31;
            PrintableText printableText = this.f394961b;
            return iHashCode + (printableText == null ? 0 : printableText.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MergeFinished(isMergeSuccess=");
            sb2.append(this.f394960a);
            sb2.append(", mergeSuccessText=");
            return AK.c.m(sb2, this.f394961b, ')');
        }

        public /* synthetic */ a(boolean z12, PrintableText printableText, int i12, C42822w c42822w) {
            this(printableText, (i12 & 1) != 0 ? true : z12);
        }
    }
}
