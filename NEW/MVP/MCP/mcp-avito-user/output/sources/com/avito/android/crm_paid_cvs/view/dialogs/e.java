package com.avito.android.crm_paid_cvs.view.dialogs;

import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.select.Select;
import com.avito.android.lib.design.select.state.SelectState;
import com.avito.android.util.I5;
import com.google.android.material.internal.CheckableImageButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NoteDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/dialogs/e;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"RestrictedApi"})
/* loaded from: classes12.dex */
public final class e extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f130805I = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final l<? super String, G0> f130806E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final Input f130807F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f130808G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final CheckableImageButton f130809H;

    public e(@k Context context, @k String str, @k String str2, @k String str3, boolean z12, boolean z13, @k CvStatus cvStatus, @k l<? super String, G0> lVar, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2, @k l<? super String, G0> lVar2) {
        super(context, 0, 2, null);
        this.f130806E = lVar2;
        setContentView(R.layout.crm_paid_cvs_note_dialog);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
        Input input = (Input) findViewById(R.id.note_input);
        this.f130807F = input;
        I5.a((TextView) findViewById(R.id.title), str, true);
        I5.a((TextView) findViewById(R.id.subtitle), str2, true);
        Select select = (Select) findViewById(R.id.status_select);
        select.setState(new SelectState(context.getString(R.string.paid_cvs_text_with_prefix, context.getString(cvStatus.f130348c)), null, false, false, null, null, null, null, null, false, false, null, null, false, 0, 32766, null));
        select.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(3, this, lVar));
        View viewFindViewById = findViewById(R.id.status_badge);
        viewFindViewById.setBackgroundTintList(ColorStateList.valueOf(androidx.core.content.d.getColor(viewFindViewById.getContext(), cvStatus.f130349d)));
        CheckableImageButton checkableImageButton = (CheckableImageButton) findViewById(R.id.btn_favorite);
        checkableImageButton.setChecked(z12);
        checkableImageButton.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(checkableImageButton, aVar));
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) findViewById(R.id.btn_comparison);
        checkableImageButton2.setChecked(z13);
        checkableImageButton2.setOnClickListener(new com.avito.android.component.user_hat.items.k(21, aVar2));
        this.f130809H = checkableImageButton2;
        Input.t(input, str3, false, 6);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.d, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f130808G) {
            return;
        }
        this.f130806E.invoke(this.f130807F.getDeformattedText());
    }
}
