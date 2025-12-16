package com.avito.android.crm_paid_cvs.view.dialogs;

import Ca1.ViewOnClickListenerC13236c;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StatusDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/dialogs/h;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    @k
    public CvStatus f130811E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final l<CvStatus, G0> f130812F;

    /* renamed from: G, reason: collision with root package name */
    @k
    public final ViewGroup f130813G;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@k Context context, @k CvStatus cvStatus, @k List<CvStatus> list, @k l<? super CvStatus, G0> lVar) {
        super(context, 0, 2, null);
        this.f130811E = cvStatus;
        this.f130812F = lVar;
        setContentView(R.layout.crm_paid_cvs_status_dialog);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
        this.f130813G = (ViewGroup) findViewById(R.id.status_container);
        for (CvStatus cvStatus2 : list) {
            View viewInflate = getLayoutInflater().inflate(R.layout.crm_paid_cvs_status_item, (ViewGroup) null, false);
            View viewFindViewById = viewInflate.findViewById(R.id.status_badge);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            viewFindViewById.setBackgroundTintList(ColorStateList.valueOf(androidx.core.content.d.getColor(viewFindViewById.getContext(), cvStatus2.f130349d)));
            View viewFindViewById2 = viewInflate.findViewById(R.id.status_text);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            I5.a((TextView) viewFindViewById2, getContext().getString(cvStatus2.f130348c), false);
            View viewFindViewById3 = viewInflate.findViewById(R.id.select_mark);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            D6.G(viewFindViewById3, cvStatus2.equals(this.f130811E));
            viewInflate.setOnClickListener(new ViewOnClickListenerC13236c((Object) this, viewFindViewById3, (Parcelable) cvStatus2, 24));
            this.f130813G.addView(viewInflate);
        }
    }

    @Override // com.avito.android.lib.design.bottom_sheet.d, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f130812F.invoke(this.f130811E);
    }
}
