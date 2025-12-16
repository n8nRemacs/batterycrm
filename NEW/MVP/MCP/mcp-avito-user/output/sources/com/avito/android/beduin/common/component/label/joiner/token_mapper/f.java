package com.avito.android.beduin.common.component.label.joiner.token_mapper;

import Ui.InterfaceC15523b;
import android.content.Context;
import android.text.SpannableString;
import com.avito.android.beduin.common.utils.C;
import com.avito.android.beduin.network.model.LabelToken;
import com.avito.android.beduin_models.BeduinAction;
import ii.C41405a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LinkTokenMapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/f;", "Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/s;", "Lcom/avito/android/beduin/network/model/LabelToken$LinkToken;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements s<LabelToken.LinkToken> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f101672a;

    @Inject
    public f(@Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b) {
        this.f101672a = interfaceC15523b;
    }

    @Override // com.avito.android.beduin.common.component.label.joiner.token_mapper.s
    public final CharSequence a(Context context, LabelToken labelToken) {
        LabelToken.LinkToken linkToken = (LabelToken.LinkToken) labelToken;
        C41405a c41405a = new C41405a(linkToken.getOnTapActions(), new e(this.f101672a), true);
        SpannableString spannableString = new SpannableString(linkToken.getTitle());
        C.a(spannableString, c41405a);
        return spannableString;
    }
}
