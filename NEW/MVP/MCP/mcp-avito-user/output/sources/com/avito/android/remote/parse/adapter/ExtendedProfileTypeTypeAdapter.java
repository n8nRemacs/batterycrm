package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.ExtendedProfile;
import com.avito.android.remote.model.ExtendedProfileResultOk;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ExtendedProfileTypeTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ExtendedProfileTypeTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/ExtendedProfileResultOk;", "<init>", "()V", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtendedProfileTypeTypeAdapter extends RuntimeTypeAdapter<ExtendedProfileResultOk> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<String, Class<ExtendedProfile>> f254178a;

    public ExtendedProfileTypeTypeAdapter() {
        super(null, null, null, 7, null);
        this.f254178a = Collections.singletonMap(MessageBody.SystemMessageBody.Platform.Bubble.Item.EXTENDED, ExtendedProfile.class);
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<ExtendedProfile>> getMapping() {
        return this.f254178a;
    }
}
