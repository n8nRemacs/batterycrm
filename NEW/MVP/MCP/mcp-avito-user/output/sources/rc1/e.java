package rc1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.http.C41531l0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.l0;

/* loaded from: classes9.dex */
public final class e extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public int f429916A;

    /* renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f429917B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ f f429918C;

    /* renamed from: D, reason: collision with root package name */
    public int f429919D;

    /* renamed from: q, reason: collision with root package name */
    public Object f429920q;

    /* renamed from: r, reason: collision with root package name */
    public Object f429921r;

    /* renamed from: s, reason: collision with root package name */
    public C41531l0 f429922s;

    /* renamed from: t, reason: collision with root package name */
    public Wb1.a f429923t;

    /* renamed from: u, reason: collision with root package name */
    public P51.a f429924u;

    /* renamed from: v, reason: collision with root package name */
    public l0.f f429925v;

    /* renamed from: w, reason: collision with root package name */
    public l0.h f429926w;

    /* renamed from: x, reason: collision with root package name */
    public Object f429927x;

    /* renamed from: y, reason: collision with root package name */
    public Object f429928y;

    /* renamed from: z, reason: collision with root package name */
    public Object f429929z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f429918C = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f429917B = obj;
        this.f429919D |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f429918C.a(null, null, null, this);
    }
}
