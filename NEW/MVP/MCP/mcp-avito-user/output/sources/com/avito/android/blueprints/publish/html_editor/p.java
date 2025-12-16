package com.avito.android.blueprints.publish.html_editor;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import androidx.compose.runtime.internal.P;
import com.avito.android.html_editor.f;
import com.avito.android.html_formatter.HtmlCharSequence;
import com.avito.android.html_formatter.span.HtmlSpan;
import hJ.C40836a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: HtmlEditorTextWatcher.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/html_editor/p;", "Landroid/text/TextWatcher;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f106290b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final hJ.m f106291c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.html_editor.j f106292d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.html_editor.g f106293e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final N f106294f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f106295g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final o f106296h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Spannable f106297i;

    /* renamed from: j, reason: collision with root package name */
    public int f106298j;

    /* compiled from: HtmlEditorTextWatcher.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.q<CharSequence, Integer, Integer, G0> {
        @Override // Y41.q
        public final G0 invoke(CharSequence charSequence, Integer num, Integer num2) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            ((o) this.receiver).a(iIntValue, iIntValue2, charSequence);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(@Y61.k f fVar, @Y61.k hJ.m mVar, @Y61.k com.avito.android.html_editor.j jVar, @Y61.k com.avito.android.html_editor.g gVar, @Y61.l Y41.p pVar, @Y61.k Y41.a aVar, @Y61.k o oVar) {
        this.f106290b = fVar;
        this.f106291c = mVar;
        this.f106292d = jVar;
        this.f106293e = gVar;
        this.f106294f = (N) pVar;
        this.f106295g = aVar;
        this.f106296h = oVar;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [Y41.p, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.text.Spanned, java.lang.CharSequence, java.lang.Object] */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Y61.k Editable editable) {
        if (String.valueOf(this.f106297i).equals(editable.toString())) {
            return;
        }
        ((n) this.f106295g).invoke();
        Object[] spans = editable.getSpans(0, editable.length(), Object.class);
        int length = spans.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            Object obj = spans[i12];
            if (obj instanceof com.avito.android.html_formatter.span.a ? true : obj instanceof HtmlSpan ? true : obj instanceof StyleSpan) {
                editable.removeSpan(obj);
            }
            i12++;
        }
        Spanned spannableString = this.f106297i;
        if (spannableString == null) {
            spannableString = new SpannableString("");
        }
        f.a aVarC = this.f106293e.c(this.f106291c, spannableString, this.f106292d.b(editable));
        HtmlCharSequence htmlCharSequence = aVarC.f164137b;
        this.f106297i = htmlCharSequence;
        if (L.f(editable.toString(), htmlCharSequence.f164164b.toString())) {
            ?? r42 = htmlCharSequence.f164164b;
            for (Object obj2 : r42.getSpans(0, r42.length(), Object.class)) {
                if (obj2 instanceof com.avito.android.html_formatter.span.a ? true : obj2 instanceof HtmlSpan ? true : obj2 instanceof StyleSpan) {
                    editable.setSpan(obj2, r42.getSpanStart(obj2), r42.getSpanEnd(obj2), r42.getSpanFlags(obj2));
                }
            }
        } else {
            f fVar = this.f106290b;
            fVar.mr(null);
            fVar.m7();
            fVar.gj(htmlCharSequence);
            fVar.MF(this);
            fVar.mr(new a(3, this.f106296h, o.class, "onSelectionChanged", "onSelectionChanged(Ljava/lang/CharSequence;II)V", 0));
            Spannable spannable = (Spannable) fVar.getText();
            Selection.setSelection(spannable, kotlin.ranges.s.g(this.f106298j + aVarC.f164138c, 0, spannable.length()));
        }
        this.f106294f.invoke(htmlCharSequence, aVarC.f164136a);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Y61.k CharSequence charSequence, int i12, int i13, int i14) {
        com.avito.android.html_editor.j jVar = this.f106292d;
        if (i13 != 0) {
            jVar.f164147a = new C40836a(i12, i13 + i12);
        }
        if (this.f106297i == null) {
            this.f106297i = new SpannableString(charSequence);
        }
        Spannable spannable = this.f106297i;
        if (spannable != null) {
            Selection.setSelection(spannable, kotlin.ranges.s.g(Selection.getSelectionStart(charSequence), 0, spannable.length()));
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Y61.k CharSequence charSequence, int i12, int i13, int i14) {
        boolean zEquals = String.valueOf(this.f106297i).equals(charSequence.toString());
        com.avito.android.html_editor.j jVar = this.f106292d;
        if (zEquals) {
            jVar.a(charSequence instanceof Spannable ? (Spannable) charSequence : null);
        } else {
            this.f106298j = i12 + i14;
            jVar.c((Spannable) charSequence, i12, i14);
        }
    }
}
