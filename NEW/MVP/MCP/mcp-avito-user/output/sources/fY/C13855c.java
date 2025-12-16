package Fy;

import Y61.k;
import Y61.l;
import android.text.Spanned;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EmailUpdateState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LFy/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fy.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C13855c extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f6095c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C13855c f6096d = new C13855c(b.C0316c.f6103a);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f6097b;

    /* compiled from: EmailUpdateState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFy/c$a;", "", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fy.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EmailUpdateState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LFy/c$b;", "", "a", "b", "c", "d", "LFy/c$b$a;", "LFy/c$b$b;", "LFy/c$b$c;", "LFy/c$b$d;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fy.c$b */
    public interface b {

        /* compiled from: EmailUpdateState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFy/c$b$a;", "LFy/c$b;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Fy.c$b$a */
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f6098a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f6099b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f6100c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f6101d;

            public a(@l String str, @k String str2, @k String str3, boolean z12) {
                this.f6098a = str;
                this.f6099b = str2;
                this.f6100c = str3;
                this.f6101d = z12;
            }

            public static a a(a aVar, boolean z12) {
                String str = aVar.f6098a;
                String str2 = aVar.f6099b;
                String str3 = aVar.f6100c;
                aVar.getClass();
                return new a(str, str2, str3, z12);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f6098a, aVar.f6098a) && L.f(this.f6099b, aVar.f6099b) && L.f(this.f6100c, aVar.f6100c) && this.f6101d == aVar.f6101d;
            }

            public final int hashCode() {
                String str = this.f6098a;
                return Boolean.hashCode(this.f6101d) + H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f6099b), 31, this.f6100c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("EnterEmailState(oldEmail=");
                sb2.append(this.f6098a);
                sb2.append(", emailInputTitle=");
                sb2.append(this.f6099b);
                sb2.append(", actionButtonTitle=");
                sb2.append(this.f6100c);
                sb2.append(", updateInProcess=");
                return r.x(sb2, this.f6101d, ')');
            }
        }

        /* compiled from: EmailUpdateState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFy/c$b$b;", "LFy/c$b;", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Fy.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0315b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C0315b f6102a = new C0315b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C0315b);
            }

            public final int hashCode() {
                return -871677242;
            }

            @k
            public final String toString() {
                return "ErrorState";
            }
        }

        /* compiled from: EmailUpdateState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFy/c$b$c;", "LFy/c$b;", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Fy.c$b$c, reason: collision with other inner class name */
        public static final /* data */ class C0316c implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C0316c f6103a = new C0316c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C0316c);
            }

            public final int hashCode() {
                return -1408552750;
            }

            @k
            public final String toString() {
                return "LoadingState";
            }
        }

        /* compiled from: EmailUpdateState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFy/c$b$d;", "LFy/c$b;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Fy.c$b$d */
        public static final /* data */ class d implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Spanned f6104a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f6105b;

            public d(@k Spanned spanned, @k String str) {
                this.f6104a = spanned;
                this.f6105b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return L.f(this.f6104a, dVar.f6104a) && L.f(this.f6105b, dVar.f6105b);
            }

            public final int hashCode() {
                return this.f6105b.hashCode() + (this.f6104a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("VerificationMailSentState(message=");
                sb2.append((Object) this.f6104a);
                sb2.append(", actionButtonTitle=");
                return C22026a.c(sb2, this.f6105b, ')');
            }
        }
    }

    public C13855c(@k b bVar) {
        this.f6097b = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13855c) && L.f(this.f6097b, ((C13855c) obj).f6097b);
    }

    public final int hashCode() {
        return this.f6097b.hashCode();
    }

    @k
    public final String toString() {
        return "EmailUpdateState(emailUpdateViewState=" + this.f6097b + ')';
    }
}
