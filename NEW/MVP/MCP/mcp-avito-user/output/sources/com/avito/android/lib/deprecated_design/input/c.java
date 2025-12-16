package com.avito.android.lib.deprecated_design.input;

import android.graphics.drawable.Drawable;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TextInputView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class c extends N implements Y41.a<Drawable> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TextInputView f178029l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TextInputView textInputView) {
        super(0);
        this.f178029l = textInputView;
    }

    @Override // Y41.a
    public final Drawable invoke() {
        TextInputView textInputView = this.f178029l;
        Drawable drawableU = D6.u(textInputView, R.drawable.text_input_background);
        drawableU.setBounds(0, 0, textInputView.getWidth(), textInputView.getHeight());
        return drawableU;
    }
}
