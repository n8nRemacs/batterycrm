package gr;

import OU.c;
import OU.d;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.util.D6;
import hw.InterfaceC41177b;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InfoBlock.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lgr/b;", "Lgr/a;", "LOU/c;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gr.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40723b implements InterfaceC40722a, c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f396881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f396882c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f396883d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ImageView f396884e;

    public C40723b(@k View view) {
        this.f396881b = view;
        this.f396882c = new d(view.findViewById(R.id.title));
        View viewFindViewById = view.findViewById(R.id.icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f396883d = (ImageView) viewFindViewById;
        this.f396884e = (ImageView) view.findViewById(R.id.info_block_notification);
    }

    public final void b(boolean z12) {
        D6.G(this.f396884e, z12);
    }

    public final void c() {
        D6.w(this.f396881b);
    }

    @Override // OU.c
    public final void g0(@l CharSequence charSequence) {
        this.f396882c.g0(charSequence);
    }

    @Override // gr.InterfaceC40722a
    public final void m6(@l CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            c();
        } else {
            D6.H(this.f396881b);
        }
        g0(charSequence);
    }

    @Override // gr.InterfaceC40722a
    public final void setIcon(@InterfaceC42165v int i12) {
        this.f396883d.setImageResource(i12);
    }
}
