package o10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: SignAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lo10/b;", "", "a", "b", "c", "d", "e", "Lo10/b$a;", "Lo10/b$b;", "Lo10/b$c;", "Lo10/b$d;", "Lo10/b$e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: o10.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC44504b {

    /* compiled from: SignAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo10/b$a;", "Lo10/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o10.b$a */
    public static final /* data */ class a implements InterfaceC44504b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f419294a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -850870974;
        }

        @k
        public final String toString() {
            return "ClearSign";
        }
    }

    /* compiled from: SignAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo10/b$b;", "Lo10/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o10.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12156b implements InterfaceC44504b {

        /* renamed from: a, reason: collision with root package name */
        public final float f419295a;

        /* renamed from: b, reason: collision with root package name */
        public final float f419296b;

        public C12156b(float f12, float f13) {
            this.f419295a = f12;
            this.f419296b = f13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12156b)) {
                return false;
            }
            C12156b c12156b = (C12156b) obj;
            return Float.compare(this.f419295a, c12156b.f419295a) == 0 && Float.compare(this.f419296b, c12156b.f419296b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f419296b) + (Float.hashCode(this.f419295a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DrawPoint(x=");
            sb2.append(this.f419295a);
            sb2.append(", y=");
            return r.k(')', this.f419296b, sb2);
        }
    }

    /* compiled from: SignAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo10/b$c;", "Lo10/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o10.b$c */
    public static final /* data */ class c implements InterfaceC44504b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<com.avito.android.mortgage.sign.draw.c> f419297a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@k List<? extends com.avito.android.mortgage.sign.draw.c> list) {
            this.f419297a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f419297a, ((c) obj).f419297a);
        }

        public final int hashCode() {
            return this.f419297a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("PathEnd(actions="), this.f419297a, ')');
        }
    }

    /* compiled from: SignAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo10/b$d;", "Lo10/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o10.b$d */
    public static final /* data */ class d implements InterfaceC44504b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Float f419298a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Float f419299b;

        public d(@l Float f12, @l Float f13) {
            this.f419298a = f12;
            this.f419299b = f13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f419298a, dVar.f419298a) && L.f(this.f419299b, dVar.f419299b);
        }

        public final int hashCode() {
            Float f12 = this.f419298a;
            int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
            Float f13 = this.f419299b;
            return iHashCode + (f13 != null ? f13.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SaveSign(width=");
            sb2.append(this.f419298a);
            sb2.append(", height=");
            return h.d(sb2, this.f419299b, ')');
        }
    }

    /* compiled from: SignAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo10/b$e;", "Lo10/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o10.b$e */
    public static final /* data */ class e implements InterfaceC44504b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f419300a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1709701026;
        }

        @k
        public final String toString() {
            return "StartDraw";
        }
    }
}
