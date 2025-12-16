package vb0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacEnableBottomSheetOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lvb0/b;", "", "a", "b", "Lvb0/b$a;", "Lvb0/b$b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vb0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC49295b {

    /* compiled from: IacEnableBottomSheetOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvb0/b$a;", "Lvb0/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vb0.b$a */
    public static final /* data */ class a implements InterfaceC49295b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f440871a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f440872b;

        public a(@k PrintableText printableText, @k Throwable th2) {
            this.f440871a = printableText;
            this.f440872b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f440871a, aVar.f440871a) && L.f(this.f440872b, aVar.f440872b);
        }

        public final int hashCode() {
            return this.f440872b.hashCode() + (this.f440871a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowError(errorMessage=");
            sb2.append(this.f440871a);
            sb2.append(", error=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f440872b, ')');
        }
    }

    /* compiled from: IacEnableBottomSheetOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvb0/b$b;", "Lvb0/b;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vb0.b$b, reason: collision with other inner class name */
    public static final class C12783b implements InterfaceC49295b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12783b f440873a = new C12783b();
    }
}
