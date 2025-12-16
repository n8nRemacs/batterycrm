package yQ0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: StunMessageType.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LyQ0/g;", "LyQ0/a;", "Companion", "a", "b", "c", "e", "LyQ0/g$a;", "LyQ0/g$b;", "LyQ0/g$e;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface g extends InterfaceC50159a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = Companion.f443110a;

    /* compiled from: StunMessageType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyQ0/g$a;", "LyQ0/g;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f443106a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final short f443107b = 1;

        @k
        public final String toString() {
            return "BindingRequest";
        }
    }

    /* compiled from: StunMessageType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyQ0/g$b;", "LyQ0/g;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f443108a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final short f443109b = 257;

        @k
        public final String toString() {
            return "BindingResponse";
        }
    }

    /* compiled from: StunMessageType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyQ0/g$c;", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yQ0.g$c, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f443110a = new Companion();
    }

    /* compiled from: StunMessageType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d {
    }

    /* compiled from: StunMessageType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyQ0/g$e;", "LyQ0/g;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements g {

        /* renamed from: a, reason: collision with root package name */
        public final short f443111a;

        public e(short s5) {
            this.f443111a = s5;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f443111a == ((e) obj).f443111a;
        }

        public final int hashCode() {
            return Short.hashCode(this.f443111a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("Unknown(value="), this.f443111a, ')');
        }
    }
}
