package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.PublishStartInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: PublishStartInfoDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/PublishStartInfoDeserializer;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/PublishStartInfo;", "<init>", "()V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PublishStartInfoDeserializer extends RuntimeTypeAdapter<PublishStartInfo> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f254208a;

    public PublishStartInfoDeserializer() {
        super(null, null, null, 7, null);
        this.f254208a = P0.j(new kotlin.Q("multiprofile", PublishStartInfo.MultiProfile.class), new kotlin.Q("user-draft", PublishStartInfo.UserDraft.class), new kotlin.Q("publish", PublishStartInfo.Publish.class));
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<? extends PublishStartInfo>> getMapping() {
        return this.f254208a;
    }
}
