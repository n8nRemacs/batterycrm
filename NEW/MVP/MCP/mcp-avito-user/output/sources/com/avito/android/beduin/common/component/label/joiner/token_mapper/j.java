package com.avito.android.beduin.common.component.label.joiner.token_mapper;

import android.content.Context;
import android.text.SpannableString;
import com.avito.android.beduin.common.utils.C;
import com.avito.android.beduin.network.model.LabelToken;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SpacingTokenMapper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/j;", "Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/s;", "Lcom/avito/android/beduin/network/model/LabelToken$SpacingToken;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements s<LabelToken.SpacingToken> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.beduin.common.component.label.joiner.token_mapper.s
    public final CharSequence a(Context context, LabelToken labelToken) {
        SpannableString spannableString = new SpannableString(" ");
        C.a(spannableString, new PK0.h(y6.b(((LabelToken.SpacingToken) labelToken).getWidth())));
        return spannableString;
    }
}
