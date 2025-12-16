package Vo0;

import Uo0.InterfaceC15546c;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutoDispatchPresetsViewFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LVo0/e;", "LVo0/c;", "LUo0/c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements InterfaceC15702c<InterfaceC15546c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f17389a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.sbc.utils.a f17390b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f17391c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f17392d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f17393e;

    /* renamed from: f, reason: collision with root package name */
    public final Badge f17394f;

    public e(@k View view, @k com.avito.android.sbc.utils.a aVar) {
        this.f17389a = view;
        this.f17390b = aVar;
        this.f17391c = (TextView) view.findViewById(R.id.sbc_configurator_dispatch_preset_title);
        this.f17392d = (TextView) view.findViewById(R.id.sbc_configurator_dispatch_preset_subtitle);
        this.f17393e = (TextView) view.findViewById(R.id.sbc_configurator_dispatch_preset_body);
        this.f17394f = (Badge) view.findViewById(R.id.recommendedBadge);
    }

    @Override // Vo0.InterfaceC15702c
    public final void a(InterfaceC15546c interfaceC15546c) {
        InterfaceC15546c interfaceC15546c2 = interfaceC15546c;
        if (interfaceC15546c2 instanceof InterfaceC15546c.b) {
            InterfaceC15546c.b bVar = (InterfaceC15546c.b) interfaceC15546c2;
            this.f17391c.setText(this.f17390b.a(bVar.f16605c));
            View view = this.f17389a;
            Resources resources = view.getResources();
            long j12 = bVar.f16606d;
            this.f17392d.setText(resources.getQuantityString(R.plurals.sbc_auto_dispatch_preset_duration_days, (int) j12, Long.valueOf(j12)));
            To0.e eVar = bVar.f16607e;
            Long l12 = eVar.f15906a;
            long j13 = eVar.f15907b;
            this.f17393e.setText(l12 == null ? view.getResources().getQuantityString(R.plurals.sbc_auto_dispatch_preset_recipients, (int) j13, Long.valueOf(j13)) : view.getResources().getString(R.string.sbc_auto_dispatch_min_max_preset_recipients_interval, eVar.f15906a, Long.valueOf(j13)));
            this.f17394f.setVisibility(bVar.f16608f ? 0 : 8);
        }
    }

    @Override // Vo0.InterfaceC15702c
    @k
    /* renamed from: getRoot, reason: from getter */
    public final View getF17389a() {
        return this.f17389a;
    }
}
