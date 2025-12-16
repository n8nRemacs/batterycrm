package Og;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.barcode.domain.model.BarcodeData;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BarcodeInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LOg/b;", "", "a", "b", "c", "LOg/b$a;", "LOg/b$b;", "LOg/b$c;", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Og.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC14685b {

    /* compiled from: BarcodeInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOg/b$a;", "LOg/b;", "<init>", "()V", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Og.b$a */
    public static final class a implements InterfaceC14685b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f12480a = new a();
    }

    /* compiled from: BarcodeInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOg/b$b;", "LOg/b;", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Og.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0802b implements InterfaceC14685b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f12481a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f12482b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f12483c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f12484d;

        public C0802b(@k PrintableText printableText, @k PrintableText printableText2, @l String str, @l String str2) {
            this.f12481a = printableText;
            this.f12482b = printableText2;
            this.f12483c = str;
            this.f12484d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0802b)) {
                return false;
            }
            C0802b c0802b = (C0802b) obj;
            return L.f(this.f12481a, c0802b.f12481a) && L.f(this.f12482b, c0802b.f12482b) && L.f(this.f12483c, c0802b.f12483c) && L.f(this.f12484d, c0802b.f12484d);
        }

        public final int hashCode() {
            int iF2 = com.avito.android.actions_sheet.a.f(this.f12482b, this.f12481a.hashCode() * 31, 31);
            String str = this.f12483c;
            int iHashCode = (iF2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f12484d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(errorTitle=");
            sb2.append(this.f12481a);
            sb2.append(", errorText=");
            sb2.append(this.f12482b);
            sb2.append(", code=");
            sb2.append(this.f12483c);
            sb2.append(", providerLabel=");
            return C22026a.c(sb2, this.f12484d, ')');
        }
    }

    /* compiled from: BarcodeInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOg/b$c;", "LOg/b;", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Og.b$c */
    public static final /* data */ class c implements InterfaceC14685b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BarcodeData f12485a;

        public c(@k BarcodeData barcodeData) {
            this.f12485a = barcodeData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f12485a, ((c) obj).f12485a);
        }

        public final int hashCode() {
            return this.f12485a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowContent(content=" + this.f12485a + ')';
        }
    }
}
