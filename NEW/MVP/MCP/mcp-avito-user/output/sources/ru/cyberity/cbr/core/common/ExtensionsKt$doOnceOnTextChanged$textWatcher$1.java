package ru.cyberity.cbr.core.common;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"ru/cyberity/cbr/core/common/ExtensionsKt$doOnceOnTextChanged$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lkotlin/G0;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 176)
/* loaded from: classes9.dex */
public final class ExtensionsKt$doOnceOnTextChanged$textWatcher$1 implements TextWatcher {
    final /* synthetic */ Y41.r<CharSequence, Integer, Integer, Integer, G0> $onTextChanged;
    final /* synthetic */ TextView $this_doOnceOnTextChanged;

    @Override // android.text.TextWatcher
    public void onTextChanged(@Y61.l CharSequence text, int start, int before, int count) {
        this.$onTextChanged.invoke(text, Integer.valueOf(start), Integer.valueOf(before), Integer.valueOf(count));
        this.$this_doOnceOnTextChanged.removeTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Y61.l Editable s5) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Y61.l CharSequence text, int start, int count, int after) {
    }
}
