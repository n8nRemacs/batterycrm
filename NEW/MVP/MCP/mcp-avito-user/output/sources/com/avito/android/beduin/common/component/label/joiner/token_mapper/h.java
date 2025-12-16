package com.avito.android.beduin.common.component.label.joiner.token_mapper;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.avito.android.R;
import com.avito.android.beduin.common.utils.C;
import com.avito.android.beduin.network.model.LabelToken;
import com.avito.android.util.C35835l0;
import ii.C41407c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SalesStrikeThroughTokenMapper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/h;", "Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/s;", "Lcom/avito/android/beduin/network/model/LabelToken$SalesStrikeThroughToken;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements s<LabelToken.SalesStrikeThroughToken> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.beduin.common.component.label.joiner.token_mapper.s
    public final CharSequence a(Context context, LabelToken labelToken) {
        LabelToken.SalesStrikeThroughToken salesStrikeThroughToken = (LabelToken.SalesStrikeThroughToken) labelToken;
        Drawable drawableN = C35835l0.n(context, R.attr.img_strikethrough, context.getColor(R.color.common_red_600));
        if (drawableN == null) {
            return "";
        }
        SpannableString spannableString = new SpannableString(salesStrikeThroughToken.getTitle());
        C.a(spannableString, new C41407c(drawableN));
        return spannableString;
    }
}
