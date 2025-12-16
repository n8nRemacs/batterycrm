package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.social.SocialNetwork;
import com.avito.android.util.C35755b0;
import hD.C40806a;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: SocialNetworkTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/SocialNetworkTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/social/SocialNetwork;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SocialNetworkTypeAdapter extends RuntimeTypeAdapter<SocialNetwork> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f254246a;

    public SocialNetworkTypeAdapter(@Y61.k C40806a c40806a) {
        super("type", null, null, 6, null);
        this.f254246a = C35755b0.c(P0.g(new kotlin.Q("gp", SocialNetwork.Google.class), new kotlin.Q("ok", SocialNetwork.Odnoklassniki.class), new kotlin.Q("vk", SocialNetwork.Vkontakte.class), new kotlin.Q("vk-id", SocialNetwork.VkId.class), new kotlin.Q("apple", SocialNetwork.Apple.class), new kotlin.Q("avitofake", c40806a.v().invoke().booleanValue() ? SocialNetwork.AvitoFake.class : null)));
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Type> getMapping() {
        return this.f254246a;
    }
}
