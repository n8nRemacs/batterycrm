package GK0;

import Y61.k;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.avito.android.remote.model.text.OnClickListener;
import kotlin.Metadata;

/* compiled from: FontAttributeFormatterV1.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGK0/b;", "Landroid/text/style/ClickableSpan;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnClickListener f6448b;

    public b(OnClickListener onClickListener) {
        this.f6448b = onClickListener;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@k View view) {
        this.f6448b.onClick();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@k TextPaint textPaint) {
    }
}
