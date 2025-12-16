package com.avito.android.beduin.common.component.label.joiner.token_mapper;

import android.content.Context;
import com.avito.android.beduin.network.model.LabelToken;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TextTokenMapper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/q;", "Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/s;", "Lcom/avito/android/beduin/network/model/LabelToken$TextToken;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q implements s<LabelToken.TextToken> {
    @Inject
    public q() {
    }

    @Override // com.avito.android.beduin.common.component.label.joiner.token_mapper.s
    public final CharSequence a(Context context, LabelToken labelToken) {
        String title = ((LabelToken.TextToken) labelToken).getTitle();
        return title == null ? "" : title;
    }
}
