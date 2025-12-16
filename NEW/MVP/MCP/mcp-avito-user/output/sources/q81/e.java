package Q81;

import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.avito.android.R;
import com.avito.android.lib.util.y;
import com.avito.android.util.C35835l0;
import hw.InterfaceC41178c;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.DeliveryTerms;

/* compiled from: DeliveryTermsFormatter.kt */
@InterfaceC41178c
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ81/e;", "", "<init>", "()V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f13555a = new e();

    @k
    public static SpannableStringBuilder a(@k Context context, @k DeliveryTerms deliveryTerms) {
        Drawable drawableH;
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) deliveryTerms.f430438b);
        Integer num = deliveryTerms.f430439c;
        if (num != null && (drawableH = C35835l0.h(num.intValue(), context)) != null) {
            drawableH.setTint(C35835l0.d(R.attr.gray44, context));
            drawableH.setBounds(0, 0, drawableH.getIntrinsicWidth(), drawableH.getIntrinsicHeight());
            spannableStringBuilderAppend.append((CharSequence) "  ");
            spannableStringBuilderAppend.append("_", new y(drawableH), 17);
        }
        return spannableStringBuilderAppend;
    }
}
