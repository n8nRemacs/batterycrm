package Mx;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.ToastMessageLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LMx/b;", "", "a", "b", "c", "d", "LMx/b$a;", "LMx/b$b;", "LMx/b$c;", "LMx/b$d;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mx.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC14539b {

    /* compiled from: EarlyAccessOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMx/b$a;", "LMx/b;", "<init>", "()V", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mx.b$a */
    public static final class a implements InterfaceC14539b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f11110a = new a();
    }

    /* compiled from: EarlyAccessOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMx/b$b;", "LMx/b;", "<init>", "()V", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mx.b$b, reason: collision with other inner class name */
    public static final class C0710b implements InterfaceC14539b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0710b f11111a = new C0710b();
    }

    /* compiled from: EarlyAccessOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMx/b$d;", "LMx/b;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mx.b$d */
    public static final /* data */ class d implements InterfaceC14539b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11114a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ToastMessageLink.ToastType f11115b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ToastMessageLink.ToastBarPosition f11116c;

        public d(@k String str, @k ToastMessageLink.ToastType toastType, @k ToastMessageLink.ToastBarPosition toastBarPosition) {
            this.f11114a = str;
            this.f11115b = toastType;
            this.f11116c = toastBarPosition;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f11114a, dVar.f11114a) && this.f11115b == dVar.f11115b && this.f11116c == dVar.f11116c;
        }

        public final int hashCode() {
            return this.f11116c.hashCode() + ((this.f11115b.hashCode() + (this.f11114a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "Toast(text=" + this.f11114a + ", type=" + this.f11115b + ", position=" + this.f11116c + ')';
        }
    }

    /* compiled from: EarlyAccessOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMx/b$c;", "LMx/b;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mx.b$c */
    public static final /* data */ class c implements InterfaceC14539b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11112a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f11113b;

        public c(@k String str, @l String str2) {
            this.f11112a = str;
            this.f11113b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f11112a, cVar.f11112a) && L.f(this.f11113b, cVar.f11113b);
        }

        public final int hashCode() {
            int iHashCode = this.f11112a.hashCode() * 31;
            String str = this.f11113b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Screen(uri=");
            sb2.append(this.f11112a);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f11113b, ')');
        }

        public /* synthetic */ c(String str, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2);
        }
    }
}
