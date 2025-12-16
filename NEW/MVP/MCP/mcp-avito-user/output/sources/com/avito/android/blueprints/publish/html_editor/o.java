package com.avito.android.blueprints.publish.html_editor;

import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HtmlEditorSelectionListener.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/html_editor/o;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.html_editor.f f106286a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final HtmlEditorViewModel f106287b;

    /* renamed from: c, reason: collision with root package name */
    public int f106288c;

    /* renamed from: d, reason: collision with root package name */
    public int f106289d;

    public o(int i12, int i13, @Y61.k com.avito.android.html_editor.f fVar, @Y61.k HtmlEditorViewModel htmlEditorViewModel) {
        this.f106286a = fVar;
        this.f106287b = htmlEditorViewModel;
        this.f106288c = i12;
        this.f106289d = i13;
    }

    public final void a(int i12, int i13, @Y61.l CharSequence charSequence) {
        int i14 = this.f106288c;
        com.avito.android.html_editor.f fVar = this.f106286a;
        if (i12 != i14 || i13 != this.f106289d) {
            fVar.a();
        }
        Spanned spannableString = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spannableString == null) {
            spannableString = new SpannableString("");
        }
        this.f106287b.setFormat(fVar.b(spannableString, i12, i13));
        this.f106288c = i12;
        this.f106289d = i13;
    }

    public /* synthetic */ o(int i12, int i13, com.avito.android.html_editor.f fVar, HtmlEditorViewModel htmlEditorViewModel, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? 0 : i12, (i14 & 2) != 0 ? 0 : i13, fVar, htmlEditorViewModel);
    }
}
