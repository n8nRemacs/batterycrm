package com.avito.android.crm_candidates.view.ui.search_view;

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
import com.avito.android.comfortable_deal.deal.item.agent.h;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.lib.util.y;
import com.avito.android.util.C35835l0;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmCandidatesSearchView.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00038@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/crm_candidates/view/ui/search_view/JobCrmCandidatesSearchView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lio/reactivex/rxjava3/core/z;", "", "c", "Lio/reactivex/rxjava3/core/z;", "getInputCallbacks$_avito_job_crm_candidates_impl", "()Lio/reactivex/rxjava3/core/z;", "setInputCallbacks$_avito_job_crm_candidates_impl", "(Lio/reactivex/rxjava3/core/z;)V", "inputCallbacks", "value", "getQuery$_avito_job_crm_candidates_impl", "()Ljava/lang/String;", "setQuery$_avito_job_crm_candidates_impl", "(Ljava/lang/String;)V", "query", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"CustomViewStyleable"})
/* loaded from: classes12.dex */
public final class JobCrmCandidatesSearchView extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Input f130279b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public z<String> inputCallbacks;

    @j
    public JobCrmCandidatesSearchView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @l
    public final z<String> getInputCallbacks$_avito_job_crm_candidates_impl() {
        return this.inputCallbacks;
    }

    @k
    public final String getQuery$_avito_job_crm_candidates_impl() {
        String string;
        Editable editableM53getText = this.f130279b.m53getText();
        return (editableM53getText == null || (string = editableM53getText.toString()) == null) ? "" : string;
    }

    public final void setInputCallbacks$_avito_job_crm_candidates_impl(@l z<String> zVar) {
        this.inputCallbacks = zVar;
    }

    public final void setQuery$_avito_job_crm_candidates_impl(@k String str) {
        Input.t(this.f130279b, str, false, 6);
    }

    public JobCrmCandidatesSearchView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        String string;
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        View.inflate(context, R.layout.job_employers_crm_candidates_search_view, this);
        View viewFindViewById = findViewById(R.id.search_input);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById;
        this.f130279b = input;
        View viewFindViewById2 = findViewById(R.id.clear_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        viewFindViewById2.setOnClickListener(new h(this, 15));
        this.inputCallbacks = n.e(input).d0(a.f130281b);
        input.setFocusableInTouchMode(true);
        input.setMaxLength(100);
        Drawable drawableH = C35835l0.h(R.attr.ic_search20, input.getContext());
        int length = 0;
        if (drawableH != null) {
            SpannableString spannableString = new SpannableString(input.getContext().getString(R.string.vacancy_search));
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
