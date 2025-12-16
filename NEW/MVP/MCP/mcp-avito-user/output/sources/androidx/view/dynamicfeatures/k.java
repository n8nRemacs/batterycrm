package androidx.view.dynamicfeatures;

import Y41.l;
import androidx.view.C23038g0;
import androidx.view.dynamicfeatures.j;
import com.google.android.play.core.splitinstall.AbstractC37204f;
import com.google.android.play.core.splitinstall.InterfaceC37201c;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: DynamicInstallManager.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "sessionId", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class k extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f53095l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f53096m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C23038g0<AbstractC37204f> f53097n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f53098o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, j jVar, C23038g0<AbstractC37204f> c23038g0, String str) {
        super(1);
        this.f53095l = lVar;
        this.f53096m = jVar;
        this.f53097n = c23038g0;
        this.f53098o = str;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        Integer num2 = num;
        int iIntValue = num2.intValue();
        l lVar = this.f53095l;
        lVar.f53101c = iIntValue;
        j jVar = this.f53096m;
        InterfaceC37201c interfaceC37201c = jVar.f53091b;
        lVar.f53102d = interfaceC37201c;
        int iIntValue2 = num2.intValue();
        C23038g0<AbstractC37204f> c23038g0 = this.f53097n;
        if (iIntValue2 == 0) {
            c23038g0.setValue(AbstractC37204f.b(num2.intValue(), 5, 0, 0L, 0L, Collections.singletonList(this.f53098o), C42784z0.f406748b));
            j.f53089c.getClass();
            if (c23038g0.hasActiveObservers()) {
                throw new IllegalStateException("This DynamicInstallMonitor will not emit any more status updates. You should remove all Observers after null has been emitted.");
            }
        } else {
            interfaceC37201c.c(new j.b(jVar.f53090a, c23038g0, lVar));
        }
        return G0.f406611a;
    }
}
