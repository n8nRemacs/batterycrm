package M41;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.l0;

/* loaded from: classes8.dex */
public final class b extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ c f10380A;

    /* renamed from: B, reason: collision with root package name */
    public int f10381B;

    /* renamed from: q, reason: collision with root package name */
    public Object f10382q;

    /* renamed from: r, reason: collision with root package name */
    public Object f10383r;

    /* renamed from: s, reason: collision with root package name */
    public String f10384s;

    /* renamed from: t, reason: collision with root package name */
    public l0.f f10385t;

    /* renamed from: u, reason: collision with root package name */
    public l0.h f10386u;

    /* renamed from: v, reason: collision with root package name */
    public Object f10387v;

    /* renamed from: w, reason: collision with root package name */
    public Object f10388w;

    /* renamed from: x, reason: collision with root package name */
    public Object f10389x;

    /* renamed from: y, reason: collision with root package name */
    public int f10390y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f10391z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10380A = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10391z = obj;
        this.f10381B |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f10380A.a(this);
    }
}
