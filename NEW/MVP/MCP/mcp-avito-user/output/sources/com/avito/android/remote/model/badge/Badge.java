package com.avito.android.remote.model.badge;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;

/* compiled from: Badge.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/badge/Badge;", "", "title", "", "getTitle", "()Ljava/lang/String;", "universalBackgroundColor", "Lcom/avito/android/remote/model/UniversalColor;", "getUniversalBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", "universalTitleColor", "getUniversalTitleColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Badge {
    @k
    String getTitle();

    @l
    UniversalColor getUniversalBackgroundColor();

    @k
    UniversalColor getUniversalTitleColor();
}
