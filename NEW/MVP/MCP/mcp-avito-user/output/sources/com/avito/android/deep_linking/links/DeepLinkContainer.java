package com.avito.android.deep_linking.links;

import android.net.Uri;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: DeepLinkContainer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLinkContainer;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DeepLinkContainer extends DeepLink {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f133174b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Uri f133175c;

    public DeepLinkContainer(@Y61.k ArrayList arrayList, @Y61.k Uri uri) {
        this.f133174b = arrayList;
        this.f133175c = uri;
    }
}
