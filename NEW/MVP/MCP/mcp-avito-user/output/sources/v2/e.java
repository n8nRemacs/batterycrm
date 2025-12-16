package v2;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.http.C41531l0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.l0;

/* loaded from: classes10.dex */
public final class e extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f440386A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ f f440387B;

    /* renamed from: C, reason: collision with root package name */
    public int f440388C;

    /* renamed from: q, reason: collision with root package name */
    public Object f440389q;

    /* renamed from: r, reason: collision with root package name */
    public Object f440390r;

    /* renamed from: s, reason: collision with root package name */
    public C41531l0 f440391s;

    /* renamed from: t, reason: collision with root package name */
    public String f440392t;

    /* renamed from: u, reason: collision with root package name */
    public l0.f f440393u;

    /* renamed from: v, reason: collision with root package name */
    public l0.h f440394v;

    /* renamed from: w, reason: collision with root package name */
    public Object f440395w;

    /* renamed from: x, reason: collision with root package name */
    public Object f440396x;

    /* renamed from: y, reason: collision with root package name */
    public Object f440397y;

    /* renamed from: z, reason: collision with root package name */
    public int f440398z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f440387B = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f440386A = obj;
        this.f440388C |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f440387B.a(null, this);
    }
}
