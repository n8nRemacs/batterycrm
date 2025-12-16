package com.avito.android.publish.details;

import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.html_formatter.FormatChange;
import kotlin.Metadata;

/* compiled from: PublishDetailsFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/html_formatter/FormatChange;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/html_formatter/FormatChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class L0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PublishDetailsFragment f233071b;

    public L0(PublishDetailsFragment publishDetailsFragment) {
        this.f233071b = publishDetailsFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        FormatChange formatChange = (FormatChange) obj;
        HtmlEditorViewModel htmlEditorViewModel = this.f233071b.f233107S0;
        if (htmlEditorViewModel == null) {
            htmlEditorViewModel = null;
        }
        htmlEditorViewModel.bd(formatChange);
    }
}
