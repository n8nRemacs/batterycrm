package IY;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.SortedSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChannelsKey.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LIY/a;", "", "<init>", "()V", "a", "b", "c", "LIY/a$a;", "LIY/a$b;", "LIY/a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class a {

    /* compiled from: ChannelsKey.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIY/a$a;", "LIY/a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: IY.a$a, reason: collision with other inner class name */
    public static final class C0466a extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0466a f8191a = new C0466a();

        public C0466a() {
            super(null);
        }
    }

    /* compiled from: ChannelsKey.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIY/a$b;", "LIY/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f8192a;

        public b(@k String str) {
            super(null);
            this.f8192a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f8192a, ((b) obj).f8192a);
        }

        public final int hashCode() {
            return this.f8192a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Id(channelId="), this.f8192a, ')');
        }
    }

    /* compiled from: ChannelsKey.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIY/a$c;", "LIY/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SortedSet<String> f8193a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SortedSet<String> f8194b;

        public c(@k SortedSet<String> sortedSet, @k SortedSet<String> sortedSet2) {
            super(null);
            this.f8193a = sortedSet;
            this.f8194b = sortedSet2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f8193a, cVar.f8193a) && L.f(this.f8194b, cVar.f8194b);
        }

        public final int hashCode() {
            return this.f8194b.hashCode() + (this.f8193a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Tags(includeTags=" + this.f8193a + ", excludeTags=" + this.f8194b + ')';
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
