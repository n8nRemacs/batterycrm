package Z91;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f19942q;

    /* renamed from: r, reason: collision with root package name */
    public b f19943r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f19944s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f19945t;

    /* renamed from: u, reason: collision with root package name */
    public int f19946u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f19945t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f19944s = obj;
        this.f19946u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f19945t.a(null, this);
    }
}
