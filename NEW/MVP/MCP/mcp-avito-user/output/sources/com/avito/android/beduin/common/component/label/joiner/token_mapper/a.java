package com.avito.android.beduin.common.component.label.joiner.token_mapper;

import android.content.Context;
import com.avito.android.beduin.network.model.LabelToken;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DateTimeTokenMapper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/a;", "Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/s;", "Lcom/avito/android/beduin/network/model/LabelToken$DateTimeToken;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements s<LabelToken.DateTimeToken> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.beduin.common.component.label.joiner.token_mapper.s
    public final CharSequence a(Context context, LabelToken labelToken) {
        LabelToken.DateTimeToken dateTimeToken = (LabelToken.DateTimeToken) labelToken;
        Long timestamp = dateTimeToken.getTimestamp();
        if (timestamp == null) {
            return null;
        }
        return new SimpleDateFormat(dateTimeToken.getFormat(), Locale.getDefault()).format(new Date(timestamp.longValue()));
    }
}
