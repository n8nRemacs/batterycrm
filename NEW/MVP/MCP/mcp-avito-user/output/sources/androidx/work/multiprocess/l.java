package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.IInterface;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: RemoteExecute.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.multiprocess.RemoteExecuteKt", f = "RemoteExecute.kt", i = {0, 0, 0, 0}, l = {61}, m = "execute", n = {"iInterface", "dispatcher", "deathRecipient", "binder"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes10.dex */
final class l<T extends IInterface> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public IInterface f56167q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC23629j f56168r;

    /* renamed from: s, reason: collision with root package name */
    public l0.h f56169s;

    /* renamed from: t, reason: collision with root package name */
    public IBinder f56170t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f56171u;

    /* renamed from: v, reason: collision with root package name */
    public int f56172v;

    public l() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f56171u = obj;
        this.f56172v |= BeduinInputModel.MIN_TEXT_VERSION;
        return o.a(null, null, this);
    }
}
