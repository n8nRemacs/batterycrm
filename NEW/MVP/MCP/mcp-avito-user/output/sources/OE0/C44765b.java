package oe0;

import Y61.k;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.g;
import com.avito.android.remote.model.category_parameters.ManualVin;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VinManualBottomSheetFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loe0/b;", "Loe0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oe0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C44765b implements InterfaceC44764a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC44767d f419977a;

    @Inject
    public C44765b(@k InterfaceC44767d interfaceC44767d) {
        this.f419977a = interfaceC44767d;
    }

    @Override // oe0.InterfaceC44764a
    public final void a(@k Context context, @k ManualVin manualVin) {
        View viewA = this.f419977a.a(context, manualVin);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, R.style.Design_Widget_BottomSheetDialog);
        dVar.setContentView(viewA);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 3);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        View viewFindViewById = viewA.findViewById(R.id.close_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        ((Button) viewFindViewById).setOnClickListener(new S7.a(dVar, 24));
        g.a(dVar);
    }
}
