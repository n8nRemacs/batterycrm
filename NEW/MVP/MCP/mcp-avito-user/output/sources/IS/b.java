package IS;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.lib.design.stepper.StepperState;
import com.avito.android.lib.design.stepper.i;
import com.avito.android.util.D6;
import com.avito.beduin.v2.avito.component.stepper.state.Mode;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StepperComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LIS/b;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/stepper/state/a;", "LIS/d;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_stepper"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC36333c<com.avito.beduin.v2.avito.component.stepper.state.a, d> {

    /* compiled from: StepperComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LIS/b$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/stepper/state/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_stepper"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends n<com.avito.beduin.v2.avito.component.stepper.state.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f8180c = new a();

        public a() {
            super(com.avito.beduin.v2.avito.component.stepper.state.k.f335184c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new b();
        }
    }

    /* compiled from: StepperComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: IS.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0465b {
        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Mode mode = Mode.f335152b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Mode mode2 = Mode.f335152b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.stepper.state.a aVar) {
        StepperState.Mode mode;
        d dVar = (d) view;
        com.avito.beduin.v2.avito.component.stepper.state.a aVar2 = aVar;
        dVar.setStyle((i) D.a(aVar2.f335168i, kVar));
        int iOrdinal = aVar2.f335164e.ordinal();
        if (iOrdinal == 0) {
            mode = StepperState.Mode.f180611b;
        } else if (iOrdinal == 1) {
            mode = StepperState.Mode.f180612c;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            mode = StepperState.Mode.f180613d;
        }
        StepperState.Mode mode2 = mode;
        dVar.setState(new StepperState(aVar2.f335160a, aVar2.f335161b, aVar2.f335162c, aVar2.f335163d, mode2, aVar2.f335166g, aVar2.f335167h));
        D6.G(dVar, aVar2.f335169j);
        dVar.setWidthStrategy(aVar2.f335165f);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new d(viewGroup.getContext());
    }
}
