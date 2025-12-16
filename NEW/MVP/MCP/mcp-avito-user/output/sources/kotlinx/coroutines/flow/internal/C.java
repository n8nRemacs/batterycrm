package kotlinx.coroutines.flow.internal;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.internal.W;

/* compiled from: SafeCollector.common.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "count", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(ILkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class C extends N implements Y41.p<Integer, CoroutineContext.Element, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A<?> f411443l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(A<?> a12) {
        super(2);
        this.f411443l = a12;
    }

    @Override // Y41.p
    public final Integer invoke(Integer num, CoroutineContext.Element element) {
        int iIntValue = num.intValue();
        CoroutineContext.Element element2 = element;
        CoroutineContext.Key<?> key = element2.getKey();
        CoroutineContext.Element element3 = this.f411443l.f411435r.get(key);
        if (key != N0.f410716u2) {
            return Integer.valueOf(element2 != element3 ? BeduinInputModel.MIN_TEXT_VERSION : iIntValue + 1);
        }
        N0 n02 = (N0) element3;
        N0 parent = (N0) element2;
        while (true) {
            if (parent != null) {
                if (parent == n02 || !(parent instanceof W)) {
                    break;
                }
                parent = parent.getParent();
            } else {
                parent = null;
                break;
            }
        }
        if (parent == n02) {
            if (n02 != null) {
                iIntValue++;
            }
            return Integer.valueOf(iIntValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + n02 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
