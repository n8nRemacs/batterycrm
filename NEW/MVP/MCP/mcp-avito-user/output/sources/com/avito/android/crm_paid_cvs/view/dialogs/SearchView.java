package com.avito.android.crm_paid_cvs.view.dialogs;

import X41.j;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.lib.util.y;
import com.avito.android.util.C35835l0;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SearchView.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/dialogs/SearchView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/avito/android/lib/design/input/Input;", "b", "Lcom/avito/android/lib/design/input/Input;", "getInput$_avito_job_crm_paid_cvs_impl", "()Lcom/avito/android/lib/design/input/Input;", "input", "Lio/reactivex/rxjava3/core/z;", "", "c", "Lio/reactivex/rxjava3/core/z;", "getInputCallbacks$_avito_job_crm_paid_cvs_impl", "()Lio/reactivex/rxjava3/core/z;", "setInputCallbacks$_avito_job_crm_paid_cvs_impl", "(Lio/reactivex/rxjava3/core/z;)V", "inputCallbacks", "value", "getQuery$_avito_job_crm_paid_cvs_impl", "()Ljava/lang/String;", "setQuery$_avito_job_crm_paid_cvs_impl", "(Ljava/lang/String;)V", "query", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"CustomViewStyleable"})
/* loaded from: classes12.dex */
public final class SearchView extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public final Input input;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public z<String> inputCallbacks;

    @j
    public SearchView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @k
    /* renamed from: getInput$_avito_job_crm_paid_cvs_impl, reason: from getter */
    public final Input getInput() {
        return this.input;
    }

    @l
    public final z<String> getInputCallbacks$_avito_job_crm_paid_cvs_impl() {
        return this.inputCallbacks;
    }

    @k
    public final String getQuery$_avito_job_crm_paid_cvs_impl() {
        String string;
        Editable editableM53getText = this.input.m53getText();
        return (editableM53getText == null || (string = editableM53getText.toString()) == null) ? "" : string;
    }

    public final void setInputCallbacks$_avito_job_crm_paid_cvs_impl(@l z<String> zVar) {
        this.inputCallbacks = zVar;
    }

    public final void setQuery$_avito_job_crm_paid_cvs_impl(@k String str) {
        Input.t(this.input, str, false, 6);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        String string;
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        View.inflate(context, R.layout.crm_paid_cvs_search_view, this);
        View viewFindViewById = findViewById(R.id.search_input);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById;
        this.input = input;
        View viewFindViewById2 = findViewById(R.id.clear_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        viewFindViewById2.setOnClickListener(new com.avito.android.comfortable_deal.deal.item.agent.h(this, 17));
        this.inputCallbacks = n.e(input).d0(f.f130810b);
        input.setFocusableInTouchMode(true);
        input.setMaxLength(100);
        Drawable drawableH = C35835l0.h(R.attr.ic_search20, input.getContext());
        int length = 0;
        if (drawableH != null) {
            SpannableString spannableString = new SpannableString(input.getContext().getString(R.string.paid_cvs_filter_search));
            drawableH.setBounds(0, 0, drawableH.getIntrinsicWidth(), drawableH.getIntrinsicHeight());
            drawableH.setTintList(C35835l0.e(R.attr.gray54, input.getContext()));
            spannableString.setSpan(new y(drawableH), 0, 1, 34);
            input.setHint(spannableString);
        }
        Editable editableM53getText = input.m53getText();
        if (editableM53getText != null && (string = editableM53getText.toString()) != null) {
            length = string.length();
        }
        input.setSelection(length);
        FormatterType.f179288e.getClass();
        input.setFormatterType(FormatterType.f179289f);
    }
}
