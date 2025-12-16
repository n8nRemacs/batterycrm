package vH;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import sH.j;

/* compiled from: MotivationPaymentOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LvH/b;", "", "a", "b", "c", "LvH/b$a;", "LvH/b$b;", "LvH/b$c;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vH.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC49212b {

    /* compiled from: MotivationPaymentOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvH/b$a;", "LvH/b;", "<init>", "()V", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vH.b$a */
    public static final /* data */ class a implements InterfaceC49212b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f440635a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -646133506;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: MotivationPaymentOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvH/b$b;", "LvH/b;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vH.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12759b implements InterfaceC49212b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f440636a;

        public C12759b(@k String str) {
            this.f440636a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12759b) && L.f(this.f440636a, ((C12759b) obj).f440636a);
        }

        public final int hashCode() {
            return this.f440636a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToast(text="), this.f440636a, ')');
        }
    }

    /* compiled from: MotivationPaymentOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvH/b$c;", "LvH/b;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vH.b$c */
    public static final /* data */ class c implements InterfaceC49212b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final j f440637a;

        public c(@k j jVar) {
            this.f440637a = jVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f440637a, ((c) obj).f440637a);
        }

        public final int hashCode() {
            return this.f440637a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowToastInfo(toastInfo=" + this.f440637a + ')';
        }
    }
}
