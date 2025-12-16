package MR;

import Y41.l;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.design.toggle.ToggleState;
import com.avito.beduin.v2.avito.component.checkbox.state.CheckboxValue;
import com.avito.beduin.v2.avito.component.checkbox.state.i;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CheckboxComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LMR/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/checkbox/state/a;", "Lcom/avito/android/lib/design/toggle/Checkbox;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_checkbox"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36333c<com.avito.beduin.v2.avito.component.checkbox.state.a, Checkbox> {

    /* compiled from: CheckboxComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LMR/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/checkbox/state/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_checkbox"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: MR.a$a, reason: collision with other inner class name */
    public static final class C0678a extends n<com.avito.beduin.v2.avito.component.checkbox.state.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C0678a f10686c = new C0678a();

        public C0678a() {
            super(i.f334023c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new a();
        }
    }

    /* compiled from: CheckboxComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[CheckboxValue.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CheckboxValue.a aVar = CheckboxValue.f333999c;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CheckboxValue.a aVar2 = CheckboxValue.f333999c;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.checkbox.state.a aVar) {
        ToggleState.ToggleValue toggleValue;
        Checkbox checkbox = (Checkbox) view;
        com.avito.beduin.v2.avito.component.checkbox.state.a aVar2 = aVar;
        CheckboxValue checkboxValue = aVar2.f334005a;
        if (checkboxValue == null) {
            checkboxValue = aVar2.f334006b ? CheckboxValue.f334001e : CheckboxValue.f334000d;
        }
        int iOrdinal = checkboxValue.ordinal();
        if (iOrdinal == 0) {
            toggleValue = ToggleState.ToggleValue.f181168b;
        } else if (iOrdinal == 1) {
            toggleValue = ToggleState.ToggleValue.f181169c;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            toggleValue = ToggleState.ToggleValue.f181170d;
        }
        ToggleState.ToggleValue toggleValue2 = toggleValue;
        l<Boolean, G0> lVar = aVar2.f334009e;
        checkbox.setState(new ToggleState(lVar, aVar2.f334007c, aVar2.f334008d, lVar != null, toggleValue2));
        M.a(checkbox, aVar2.f334011g);
        checkbox.setStyle((com.avito.android.lib.design.toggle.a) D.a(aVar2.f334010f, kVar));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new Checkbox(viewGroup.getContext(), null);
    }
}
