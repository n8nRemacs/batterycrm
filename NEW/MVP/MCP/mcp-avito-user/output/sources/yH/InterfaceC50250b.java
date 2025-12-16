package yh;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: BblConfigureOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lyh/b;", "", "a", "b", "Lyh/b$a;", "Lyh/b$b;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yh.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC50250b {

    /* compiled from: BblConfigureOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyh/b$a;", "Lyh/b;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yh.b$a */
    public static final /* data */ class a implements InterfaceC50250b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f443452a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -357714957;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: BblConfigureOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyh/b$b;", "Lyh/b;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yh.b$b, reason: collision with other inner class name */
    public static final class C12915b implements InterfaceC50250b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f443453a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f443454b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f443455c;

        public C12915b(@k DeepLink deepLink, @l Integer num, @l Long l12) {
            this.f443453a = deepLink;
            this.f443454b = l12;
            this.f443455c = num;
        }
    }
}
