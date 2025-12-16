package kotlinx.coroutines.channels;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.M0;
import okhttp3.internal.http.StatusLine;

/* compiled from: Deprecated.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {517, StatusLine.HTTP_PERM_REDIRECT}, m = "toChannel", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class t0<E, C extends M0<? super E>> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public M0 f410991q;

    /* renamed from: r, reason: collision with root package name */
    public K0 f410992r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC43125y f410993s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f410994t;

    /* renamed from: u, reason: collision with root package name */
    public int f410995u;

    public t0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f410994t = obj;
        this.f410995u |= BeduinInputModel.MIN_TEXT_VERSION;
        return D.b(null, null, this);
    }
}
