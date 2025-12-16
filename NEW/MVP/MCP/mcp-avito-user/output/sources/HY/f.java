package HY;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.channels.mvi.interactor.z;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChannelsListOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LHY/f;", "", "a", "b", "c", "d", "LHY/f$a;", "LHY/f$b;", "LHY/f$c;", "LHY/f$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface f {

    /* compiled from: ChannelsListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/f$a;", "LHY/f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f7192a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7193b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f7194c;

        public a(@Y61.k String str, int i12, @Y61.k String str2) {
            this.f7192a = str;
            this.f7193b = i12;
            this.f7194c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f7192a, aVar.f7192a) && this.f7193b == aVar.f7193b && L.f(this.f7194c, aVar.f7194c);
        }

        public final int hashCode() {
            return this.f7194c.hashCode() + r.e(this.f7193b, this.f7192a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChannelClicked(channelId=");
            sb2.append(this.f7192a);
            sb2.append(", position=");
            sb2.append(this.f7193b);
            sb2.append(", flowId=");
            return C22026a.c(sb2, this.f7194c, ')');
        }
    }

    /* compiled from: ChannelsListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/f$b;", "LHY/f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f7195a;

        public b(@Y61.k PrintableText printableText) {
            this.f7195a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f7195a, ((b) obj).f7195a);
        }

        public final int hashCode() {
            return this.f7195a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("ChannelDeletedError(text="), this.f7195a, ')');
        }
    }

    /* compiled from: ChannelsListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHY/f$c;", "LHY/f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final z f7196a;

        public c(@Y61.k z zVar) {
            this.f7196a = zVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f7196a, ((c) obj).f7196a);
        }

        public final int hashCode() {
            return this.f7196a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ChannelLocallyDeletedToastBar(toastInfo=" + this.f7196a + ')';
        }
    }

    /* compiled from: ChannelsListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/f$d;", "LHY/f;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f7197a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -153068455;
        }

        @Y61.k
        public final String toString() {
            return "OpenNotificationSettings";
        }
    }
}
