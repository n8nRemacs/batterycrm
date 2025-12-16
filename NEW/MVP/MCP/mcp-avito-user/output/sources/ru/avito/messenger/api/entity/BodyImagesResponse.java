package ru.avito.messenger.api.entity;

import Y61.k;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: BodyImagesResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/avito/messenger/api/entity/BodyImagesResponse;", "", "images", "", "", "Lru/avito/messenger/api/entity/Image;", "(Ljava/util/Map;)V", "getImages", "()Ljava/util/Map;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BodyImagesResponse {

    @k
    private final Map<String, Image> images;

    public BodyImagesResponse(@k Map<String, Image> map) {
        this.images = map;
    }

    @k
    public final Map<String, Image> getImages() {
        return this.images;
    }
}
