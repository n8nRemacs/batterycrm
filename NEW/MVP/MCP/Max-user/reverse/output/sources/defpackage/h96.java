package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;
import one.me.folders.edit.FolderEditScreen;
import one.me.sdk.uikit.common.span.FitFontImageSpan;

/* loaded from: classes2.dex */
public final class h96 extends d2f {
    public final veb E0;
    public FolderEditScreen F0;

    public h96(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        super(frameLayout);
        veb vebVar = new veb(frameLayout.getContext());
        this.E0 = vebVar;
        frameLayout.setId(ryc.oneme_folders_edit_folder_name_field);
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        vebVar.setHint(z7.e(vebVar.getContext(), f5b.i));
        vebVar.f(new d92(23, this));
        vebVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        vebVar.setImeOptions(6);
        frameLayout.addView(vebVar, new FrameLayout.LayoutParams(-1, -2, 17));
        tqi.c(new ld0(this, (Continuation) null, 15), frameLayout);
    }

    @Override // defpackage.d2f
    public final void C() {
        CharSequence text = this.E0.getText();
        int length = text.length();
        Object[] spans = null;
        try {
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                spans = spanned.getSpans(0, length, FitFontImageSpan.class);
            }
        } catch (Throwable unused) {
        }
        if (spans == null) {
            spans = new FitFontImageSpan[0];
        }
        for (Object obj : spans) {
            ((FitFontImageSpan) obj).updateDrawableSize(kti.d(15 * vw4.d().getDisplayMetrics().density), a16.c, false);
        }
    }

    @Override // defpackage.d2f
    public final void E() {
        this.F0 = null;
    }

    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(g96 g96Var) {
        boolean z = g96Var.b;
        veb vebVar = this.E0;
        vebVar.setEnabled(z);
        vebVar.setTextColorAttr(z ? w9b.X : w9b.U);
        if (vebVar.getText().length() == 0) {
            s5g s5gVar = g96Var.a;
            CharSequence charSequenceA = s5gVar != null ? s5gVar.a(this) : null;
            if (charSequenceA == null) {
                charSequenceA = "";
            }
            vebVar.setText(charSequenceA);
        }
        vebVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(g96Var.c)});
        this.F0 = null;
    }
}
