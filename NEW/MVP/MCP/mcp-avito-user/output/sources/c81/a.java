package C81;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f1985q;

    /* renamed from: r, reason: collision with root package name */
    public String f1986r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f1987s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f1988t;

    /* renamed from: u, reason: collision with root package name */
    public int f1989u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f1988t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1987s = obj;
        this.f1989u |= BeduinInputModel.MIN_TEXT_VERSION;
        return c.a(this.f1988t, null, null, this);
    }
}
