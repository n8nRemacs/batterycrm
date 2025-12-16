package wj;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BeduinSnippetResponseManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lwj/a;", "", "a", "_avito_job_beduin-snippet-response-manager_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wj.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC49636a {

    /* compiled from: BeduinSnippetResponseManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwj/a$a;", "", "_avito_job_beduin-snippet-response-manager_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wj.a$a, reason: collision with other inner class name */
    public static final class C12828a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f441762a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f441763b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f441764c;

        public C12828a(@k String str, @k String str2, @k DeepLink deepLink) {
            this.f441762a = str;
            this.f441763b = str2;
            this.f441764c = deepLink;
        }
    }

    void a(@k C12828a c12828a);

    @k
    InterfaceC43160i<C12828a> b();
}
