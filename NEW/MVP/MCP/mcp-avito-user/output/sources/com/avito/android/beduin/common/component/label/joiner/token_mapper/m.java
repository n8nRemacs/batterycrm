package com.avito.android.beduin.common.component.label.joiner.token_mapper;

import android.content.Context;
import com.avito.android.beduin.network.model.LabelToken;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StorageTextTokenMapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/m;", "Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/s;", "Lcom/avito/android/beduin/network/model/LabelToken$StorageTextToken;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m implements s<LabelToken.StorageTextToken> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.storage.d f101687a;

    @Inject
    public m(@Y61.k com.avito.android.beduin.common.storage.d dVar) {
        this.f101687a = dVar;
    }

    @Override // com.avito.android.beduin.common.component.label.joiner.token_mapper.s
    public final CharSequence a(Context context, LabelToken labelToken) {
        Object obj;
        LabelToken.StorageTextToken storageTextToken = (LabelToken.StorageTextToken) labelToken;
        Map<String, Object> map = this.f101687a.a(storageTextToken.getStorageType()).get(storageTextToken.getStorageKey());
        if (map == null || (obj = map.get(storageTextToken.getParam())) == null) {
            return null;
        }
        return obj.toString();
    }
}
