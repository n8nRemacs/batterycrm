package yq0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShortAdvicesAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lyq0/a;", "", "a", "b", "c", "d", "e", "f", "Lyq0/a$a;", "Lyq0/a$b;", "Lyq0/a$c;", "Lyq0/a$d;", "Lyq0/a$e;", "Lyq0/a$f;", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yq0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC50281a {

    /* compiled from: ShortAdvicesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyq0/a$a;", "Lyq0/a;", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yq0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12919a implements InterfaceC50281a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserAdvertsHintItem f443505a;

        public C12919a(@k UserAdvertsHintItem userAdvertsHintItem) {
            this.f443505a = userAdvertsHintItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12919a) && L.f(this.f443505a, ((C12919a) obj).f443505a);
        }

        public final int hashCode() {
            return this.f443505a.hashCode();
        }

        @k
        public final String toString() {
            return "HintClick(item=" + this.f443505a + ')';
        }
    }

    /* compiled from: ShortAdvicesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyq0/a$b;", "Lyq0/a;", "<init>", "()V", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yq0.a$b */
    public static final /* data */ class b implements InterfaceC50281a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f443506a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1667969018;
        }

        @k
        public final String toString() {
            return "HintComplete";
        }
    }

    /* compiled from: ShortAdvicesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyq0/a$c;", "Lyq0/a;", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yq0.a$c */
    public static final /* data */ class c implements InterfaceC50281a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f443507a;

        public c(@k String str) {
            this.f443507a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f443507a, ((c) obj).f443507a);
        }

        public final int hashCode() {
            return this.f443507a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("HintHidden(hintId="), this.f443507a, ')');
        }
    }

    /* compiled from: ShortAdvicesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyq0/a$d;", "Lyq0/a;", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yq0.a$d */
    public static final /* data */ class d implements InterfaceC50281a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserAdvertsHintItem f443508a;

        public d(@k UserAdvertsHintItem userAdvertsHintItem) {
            this.f443508a = userAdvertsHintItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f443508a, ((d) obj).f443508a);
        }

        public final int hashCode() {
            return this.f443508a.hashCode();
        }

        @k
        public final String toString() {
            return "HintSelected(item=" + this.f443508a + ')';
        }
    }

    /* compiled from: ShortAdvicesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyq0/a$e;", "Lyq0/a;", "<init>", "()V", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yq0.a$e */
    public static final /* data */ class e implements InterfaceC50281a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f443509a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 687421743;
        }

        @k
        public final String toString() {
            return "OpenAllHints";
        }
    }

    /* compiled from: ShortAdvicesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyq0/a$f;", "Lyq0/a;", "<init>", "()V", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yq0.a$f */
    public static final /* data */ class f implements InterfaceC50281a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f443510a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 814700417;
        }

        @k
        public final String toString() {
            return "Refresh";
        }
    }
}
