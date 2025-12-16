package D80;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PlayerAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LD80/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LD80/a$a;", "LD80/a$b;", "LD80/a$c;", "LD80/a$d;", "LD80/a$e;", "LD80/a$f;", "LD80/a$g;", "LD80/a$h;", "LD80/a$i;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: PlayerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD80/a$a;", "LD80/a;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: D80.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0150a implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Double f2955a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Double f2956b;

        public C0150a(@l Double d12, @l Double d13) {
            this.f2955a = d12;
            this.f2956b = d13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0150a)) {
                return false;
            }
            C0150a c0150a = (C0150a) obj;
            return L.f(this.f2955a, c0150a.f2955a) && L.f(this.f2956b, c0150a.f2956b);
        }

        public final int hashCode() {
            Double d12 = this.f2955a;
            int iHashCode = (d12 == null ? 0 : d12.hashCode()) * 31;
            Double d13 = this.f2956b;
            return iHashCode + (d13 != null ? d13.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClosePressed(playbackPosition=");
            sb2.append(this.f2955a);
            sb2.append(", videoDuration=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f2956b, ')');
        }
    }

    /* compiled from: PlayerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD80/a$b;", "LD80/a;", "<init>", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f2957a = new b();
    }

    /* compiled from: PlayerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD80/a$c;", "LD80/a;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f2958a;

        public c(boolean z12) {
            this.f2958a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f2958a == ((c) obj).f2958a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f2958a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("MutePressed(isMute="), this.f2958a, ')');
        }
    }

    /* compiled from: PlayerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD80/a$d;", "LD80/a;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2959a;

        public d(int i12) {
            this.f2959a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f2959a == ((d) obj).f2959a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f2959a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnFramesDropped(droppedFrames="), this.f2959a, ')');
        }
    }

    /* compiled from: PlayerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD80/a$e;", "LD80/a;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Double f2960a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Double f2961b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f2962c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f2963d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final VideoStopReason f2964e;

        public e(@l Double d12, @l Double d13, @l String str, @l String str2, @k VideoStopReason videoStopReason) {
            this.f2960a = d12;
            this.f2961b = d13;
            this.f2962c = str;
            this.f2963d = str2;
            this.f2964e = videoStopReason;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f2960a, eVar.f2960a) && L.f(this.f2961b, eVar.f2961b) && L.f(this.f2962c, eVar.f2962c) && L.f(this.f2963d, eVar.f2963d) && this.f2964e == eVar.f2964e;
        }

        public final int hashCode() {
            Double d12 = this.f2960a;
            int iHashCode = (d12 == null ? 0 : d12.hashCode()) * 31;
            Double d13 = this.f2961b;
            int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
            String str = this.f2962c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f2963d;
            return this.f2964e.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            return "PausedPressed(playbackPosition=" + this.f2960a + ", videoDuration=" + this.f2961b + ", itemId=" + this.f2962c + ", fromPage=" + this.f2963d + ", stopReason=" + this.f2964e + ')';
        }
    }

    /* compiled from: PlayerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD80/a$f;", "LD80/a;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f2965a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f2966b;

        public f(@l String str, @l String str2) {
            this.f2965a = str;
            this.f2966b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f2965a, fVar.f2965a) && L.f(this.f2966b, fVar.f2966b);
        }

        public final int hashCode() {
            String str = this.f2965a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f2966b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PlayPressed(itemId=");
            sb2.append(this.f2965a);
            sb2.append(", fromPage=");
            return C22026a.c(sb2, this.f2966b, ')');
        }
    }

    /* compiled from: PlayerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD80/a$g;", "LD80/a;", "<init>", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f2967a = new g();
    }

    /* compiled from: PlayerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD80/a$h;", "LD80/a;", "<init>", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f2968a = new h();
    }

    /* compiled from: PlayerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD80/a$i;", "LD80/a;", "<init>", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f2969a = new i();
    }
}
