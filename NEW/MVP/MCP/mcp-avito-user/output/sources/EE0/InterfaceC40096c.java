package ee0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import kotlin.Metadata;

/* compiled from: EditRequestOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lee0/c;", "", "a", "b", "c", "Lee0/c$a;", "Lee0/c$b;", "Lee0/c$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ee0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC40096c {

    /* compiled from: EditRequestOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lee0/c$a;", "Lee0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ee0.c$a */
    public static final class a implements InterfaceC40096c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f395298a;

        public a(@l String str) {
            this.f395298a = str;
        }
    }

    /* compiled from: EditRequestOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lee0/c$b;", "Lee0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ee0.c$b */
    public static final class b implements InterfaceC40096c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f395299a;

        public b(@k DeepLink deepLink) {
            this.f395299a = deepLink;
        }
    }

    /* compiled from: EditRequestOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lee0/c$c;", "Lee0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ee0.c$c, reason: collision with other inner class name */
    public static final class C11098c implements InterfaceC40096c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Action.Confirmation f395300a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f395301b;

        public C11098c(@k Action.Confirmation confirmation, @k DeepLink deepLink) {
            this.f395300a = confirmation;
            this.f395301b = deepLink;
        }
    }
}
