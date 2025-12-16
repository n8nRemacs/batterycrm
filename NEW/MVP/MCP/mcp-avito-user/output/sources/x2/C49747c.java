package x2;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: x2.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C49747c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f442120q;

    /* renamed from: r, reason: collision with root package name */
    public int f442121r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C49748d f442122s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49747c(C49748d c49748d, Continuation continuation) {
        super(continuation);
        this.f442122s = c49748d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f442120q = obj;
        this.f442121r |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f442122s.emit(null, this);
    }
}
