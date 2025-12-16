package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "result", "it", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(ZLkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class L extends kotlin.jvm.internal.N implements Y41.p<Boolean, CoroutineContext.Element, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final L f410708l = new L();

    public L() {
        super(2);
    }

    @Override // Y41.p
    public final Boolean invoke(Boolean bool, CoroutineContext.Element element) {
        return Boolean.valueOf(bool.booleanValue() || (element instanceof I));
    }
}
