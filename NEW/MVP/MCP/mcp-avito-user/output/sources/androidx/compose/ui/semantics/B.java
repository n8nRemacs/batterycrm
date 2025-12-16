package androidx.compose.ui.semantics;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class B extends N implements Y41.l<List<Float>, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f41718l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Y41.a<Float> aVar) {
        super(1);
        this.f41718l = aVar;
    }

    @Override // Y41.l
    public final Boolean invoke(List<Float> list) {
        boolean z12;
        List<Float> list2 = list;
        Float fInvoke = this.f41718l.invoke();
        if (fInvoke == null) {
            z12 = false;
        } else {
            list2.add(fInvoke);
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
