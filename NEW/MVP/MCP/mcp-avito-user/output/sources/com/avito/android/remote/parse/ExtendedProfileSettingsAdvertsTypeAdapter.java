package com.avito.android.remote.parse;

import Y61.k;
import com.avito.android.remote.model.extended.ExtendedProfileAdvertModel;
import com.avito.android.remote.model.extended.adverts.ExtendedProfileSettingsAdvertsResult;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ExtendedProfileSettingsAdvertsTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/ExtendedProfileSettingsAdvertsTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/extended/adverts/ExtendedProfileSettingsAdvertsResult$Item;", "<init>", "()V", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtendedProfileSettingsAdvertsTypeAdapter extends RuntimeTypeAdapter<ExtendedProfileSettingsAdvertsResult.Item> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f254141a;

    public ExtendedProfileSettingsAdvertsTypeAdapter() {
        super(null, null, null, 7, null);
        this.f254141a = P0.j(new Q("item", ExtendedProfileAdvertModel.class));
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @k
    public final Map<String, Class<ExtendedProfileAdvertModel>> getMapping() {
        return this.f254141a;
    }
}
