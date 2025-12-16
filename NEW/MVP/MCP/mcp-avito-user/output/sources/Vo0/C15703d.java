package Vo0;

import Uo0.h;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: SbcFastChipsGroupView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LVo0/d;", "LVo0/c;", "LUo0/h;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vo0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15703d implements InterfaceC15702c<Uo0.h> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f17386a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f17387b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f17388c;

    public C15703d(@k View view) {
        this.f17386a = view;
        this.f17387b = (TextView) view.findViewById(R.id.sbc_configurator_fast_chip_title);
        this.f17388c = (TextView) view.findViewById(R.id.sbc_configurator_fast_chip_subtitle);
    }

    @Override // Vo0.InterfaceC15702c
    public final void a(Uo0.h hVar) {
        Uo0.h hVar2 = hVar;
        if (hVar2 instanceof h.b) {
            h.b bVar = (h.b) hVar2;
            String f16686c = bVar.getF16686c();
            View view = this.f17386a;
            view.setTag(f16686c);
            h.b bVar2 = (h.b) hVar2;
            String str = bVar2.f16687d;
            TextView textView = this.f17387b;
            textView.setText(str);
            this.f17388c.setText(bVar2.f16688e);
            if (bVar.getF16684a()) {
                textView.setTextColor(C35835l0.d(R.attr.green800, view.getContext()));
            } else {
                textView.setTextColor(C35835l0.d(R.attr.gray54, view.getContext()));
            }
        }
    }

    @Override // Vo0.InterfaceC15702c
    @k
    /* renamed from: getRoot, reason: from getter */
    public final View getF17386a() {
        return this.f17386a;
    }
}
