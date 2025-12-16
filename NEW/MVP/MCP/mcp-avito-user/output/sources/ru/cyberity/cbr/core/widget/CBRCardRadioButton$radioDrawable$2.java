package ru.cyberity.cbr.core.widget;

import Y61.l;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.content.res.i;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.common.s;

/* compiled from: CBRCardRadioButton.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRCardRadioButton$radioDrawable$2 extends N implements Y41.a<Drawable> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CBRCardRadioButton this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBRCardRadioButton$radioDrawable$2(CBRCardRadioButton cBRCardRadioButton, Context context) {
        super(0);
        this.this$0 = cBRCardRadioButton;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // Y41.a
    @l
    public final Drawable invoke() {
        Resources resources = this.this$0.getResources();
        int iB2 = s.b(this.$context, R.attr.listChoiceIndicatorSingle);
        Resources.Theme theme = this.$context.getTheme();
        ThreadLocal<TypedValue> threadLocal = i.f44673a;
        return resources.getDrawable(iB2, theme);
    }
}
