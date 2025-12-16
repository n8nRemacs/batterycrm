package zi0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_confirmation.code_confirmation.SmsCodeConfirmationParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RecallMeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lzi0/b;", "", "a", "b", "c", "d", "e", "Lzi0/b$a;", "Lzi0/b$b;", "Lzi0/b$c;", "Lzi0/b$d;", "Lzi0/b$e;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zi0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC50572b {

    /* compiled from: RecallMeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzi0/b$a;", "Lzi0/b;", "<init>", "()V", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zi0.b$a */
    public static final class a implements InterfaceC50572b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f444183a = new a();
    }

    /* compiled from: RecallMeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzi0/b$b;", "Lzi0/b;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zi0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12968b implements InterfaceC50572b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SmsCodeConfirmationParams f444184a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CodeConfirmationSource f444185b;

        public C12968b(SmsCodeConfirmationParams smsCodeConfirmationParams, CodeConfirmationSource codeConfirmationSource, int i12, C42822w c42822w) {
            codeConfirmationSource = (i12 & 2) != 0 ? CodeConfirmationSource.f92765m : codeConfirmationSource;
            this.f444184a = smsCodeConfirmationParams;
            this.f444185b = codeConfirmationSource;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12968b)) {
                return false;
            }
            C12968b c12968b = (C12968b) obj;
            return L.f(this.f444184a, c12968b.f444184a) && this.f444185b == c12968b.f444185b;
        }

        public final int hashCode() {
            return this.f444185b.hashCode() + (this.f444184a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OpenCallConfirmation(smsCodeConfirmationParams=" + this.f444184a + ", src=" + this.f444185b + ')';
        }
    }

    /* compiled from: RecallMeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzi0/b$c;", "Lzi0/b;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zi0.b$c */
    public static final /* data */ class c implements InterfaceC50572b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f444186a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f444187b;

        public c(@k String str, @l Long l12) {
            this.f444186a = str;
            this.f444187b = l12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f444186a, cVar.f444186a) && L.f(this.f444187b, cVar.f444187b);
        }

        public final int hashCode() {
            int iHashCode = this.f444186a.hashCode() * 31;
            Long l12 = this.f444187b;
            return iHashCode + (l12 == null ? 0 : l12.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetActivityResult(successMessage=");
            sb2.append(this.f444186a);
            sb2.append(", requestId=");
            return m.m(sb2, this.f444187b, ')');
        }
    }

    /* compiled from: RecallMeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzi0/b$d;", "Lzi0/b;", "<init>", "()V", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zi0.b$d */
    public static final class d implements InterfaceC50572b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f444188a = new d();
    }

    /* compiled from: RecallMeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzi0/b$e;", "Lzi0/b;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zi0.b$e */
    public static final /* data */ class e implements InterfaceC50572b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f444189a;

        public e(@k String str) {
            this.f444189a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f444189a, ((e) obj).f444189a);
        }

        public final int hashCode() {
            return this.f444189a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToastBar(text="), this.f444189a, ')');
        }
    }
}
