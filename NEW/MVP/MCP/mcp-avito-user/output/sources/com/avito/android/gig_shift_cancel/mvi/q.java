package com.avito.android.gig_shift_cancel.mvi;

import androidx.compose.runtime.C22026a;
import com.avito.android.gig.shift_cancel_impl.generated.api.cancel_info_v_1.Reason;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigShiftCancelInternalAction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b`\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/q;", "", "a", "b", "c", "d", "e", "f", "g", "h", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface q {

    /* compiled from: GigShiftCancelInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/q$a;", "Lcom/avito/android/gig_shift_cancel/mvi/q;", "<init>", "()V", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f160666a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -746391338;
        }

        @Y61.k
        public final String toString() {
            return "ActionOk";
        }
    }

    /* compiled from: GigShiftCancelInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/q$b;", "Lcom/avito/android/gig_shift_cancel/mvi/q;", "<init>", "()V", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f160667a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 78883385;
        }

        @Y61.k
        public final String toString() {
            return "CommonError";
        }
    }

    /* compiled from: GigShiftCancelInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/q$c;", "Lcom/avito/android/gig_shift_cancel/mvi/q;", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f160668a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f160669b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final r f160670c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f160671d;

        public c(@Y61.k String str, @Y61.l String str2, @Y61.k r rVar, @Y61.k String str3) {
            this.f160668a = str;
            this.f160669b = str2;
            this.f160670c = rVar;
            this.f160671d = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f160668a, cVar.f160668a) && L.f(this.f160669b, cVar.f160669b) && L.f(this.f160670c, cVar.f160670c) && L.f(this.f160671d, cVar.f160671d);
        }

        public final int hashCode() {
            int iHashCode = this.f160668a.hashCode() * 31;
            String str = this.f160669b;
            return this.f160671d.hashCode() + ((this.f160670c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(title=");
            sb2.append(this.f160668a);
            sb2.append(", description=");
            sb2.append(this.f160669b);
            sb2.append(", itemState=");
            sb2.append(this.f160670c);
            sb2.append(", buttonText=");
            return C22026a.c(sb2, this.f160671d, ')');
        }
    }

    /* compiled from: GigShiftCancelInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/q$d;", "Lcom/avito/android/gig_shift_cancel/mvi/q;", "<init>", "()V", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f160672a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1069926426;
        }

        @Y61.k
        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: GigShiftCancelInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/q$e;", "Lcom/avito/android/gig_shift_cancel/mvi/q;", "<init>", "()V", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f160673a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1271734169;
        }

        @Y61.k
        public final String toString() {
            return "LoadNotFound";
        }
    }

    /* compiled from: GigShiftCancelInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/q$f;", "Lcom/avito/android/gig_shift_cancel/mvi/q;", "<init>", "()V", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f160674a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1890018968;
        }

        @Y61.k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: GigShiftCancelInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/q$g;", "Lcom/avito/android/gig_shift_cancel/mvi/q;", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Reason f160675a;

        public g(@Y61.k Reason reason) {
            this.f160675a = reason;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f160675a, ((g) obj).f160675a);
        }

        public final int hashCode() {
            return this.f160675a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReasonChecked(reason=" + this.f160675a + ')';
        }
    }

    /* compiled from: GigShiftCancelInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/q$h;", "Lcom/avito/android/gig_shift_cancel/mvi/q;", "<init>", "()V", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f160676a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -798227378;
        }

        @Y61.k
        public final String toString() {
            return "ShowReasons";
        }
    }
}
