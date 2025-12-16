package dU;

import C11.b;
import android.content.Context;
import com.squareup.anvil.annotations.ContributesBinding;
import dU.p;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinComposeRendererComponentImpl.kt */
@InterfaceC39624A
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LdU/q;", "LdU/p;", "a", "b", "_design-modules_beduin-v2_renderer-compose_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface q extends p {

    /* compiled from: BeduinComposeRendererComponentImpl.kt */
    @ContributesBinding
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdU/q$a;", "LdU/p$a;", "_design-modules_beduin-v2_renderer-compose_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements p.a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final b f393874a;

        @Inject
        public a(@Y61.k b bVar) {
            this.f393874a = bVar;
        }
    }

    /* compiled from: BeduinComposeRendererComponentImpl.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdU/q$b;", "", "_design-modules_beduin-v2_renderer-compose_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @Y61.k
        q a(@y @h31.b @Y61.k Context context, @Y61.k m mVar, @h31.b @Y61.k com.avito.beduin.v2.engine.component.B b12);
    }
}
