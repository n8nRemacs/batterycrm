package Vo0;

import Uo0.h;
import Y61.k;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: SbcFastChipsGroupView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LVo0/g;", "LVo0/c;", "LUo0/h;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements InterfaceC15702c<Uo0.h> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f17396a;

    public g(@k View view) {
        this.f17396a = view;
        ((ImageView) view.findViewById(R.id.sbc_configurator_fast_chip_custom_preset_icon)).setImageTintList(C35835l0.e(R.attr.black, view.getContext()));
    }

    @Override // Vo0.InterfaceC15702c
    public final void a(Uo0.h hVar) {
        Uo0.h hVar2 = hVar;
        if (hVar2 instanceof h.a) {
            this.f17396a.setTag(((h.a) hVar2).getF16686c());
        }
    }

    @Override // Vo0.InterfaceC15702c
    @k
    /* renamed from: getRoot, reason: from getter */
    public final View getF17396a() {
        return this.f17396a;
    }
}
