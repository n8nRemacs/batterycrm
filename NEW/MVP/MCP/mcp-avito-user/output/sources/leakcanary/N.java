package leakcanary;

import android.os.Handler;
import kotlin.Metadata;

/* compiled from: ServiceWatcher.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/os/Handler$Callback;", "it", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
final class N extends kotlin.jvm.internal.N implements Y41.l<Handler.Callback, Handler.Callback> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O f414022l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(O o12) {
        super(1);
        this.f414022l = o12;
    }

    @Override // Y41.l
    public final Handler.Callback invoke(Handler.Callback callback) {
        return this.f414022l.f414024m;
    }
}
