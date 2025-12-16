package rc1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.l0;

/* loaded from: classes9.dex */
public final class c extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ f f429901A;

    /* renamed from: B, reason: collision with root package name */
    public int f429902B;

    /* renamed from: q, reason: collision with root package name */
    public Object f429903q;

    /* renamed from: r, reason: collision with root package name */
    public Object f429904r;

    /* renamed from: s, reason: collision with root package name */
    public String f429905s;

    /* renamed from: t, reason: collision with root package name */
    public l0.f f429906t;

    /* renamed from: u, reason: collision with root package name */
    public l0.h f429907u;

    /* renamed from: v, reason: collision with root package name */
    public Object f429908v;

    /* renamed from: w, reason: collision with root package name */
    public Object f429909w;

    /* renamed from: x, reason: collision with root package name */
    public Object f429910x;

    /* renamed from: y, reason: collision with root package name */
    public int f429911y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f429912z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f429901A = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f429912z = obj;
        this.f429902B |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f429901A.b(null, this);
    }
}
