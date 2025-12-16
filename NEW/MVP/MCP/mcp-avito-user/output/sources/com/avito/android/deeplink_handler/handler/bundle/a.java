package com.avito.android.deeplink_handler.handler.bundle;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: DeeplinkBundle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/bundle/a;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DeepLink f134520a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f134521b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Bundle f134522c;

    public a(@l Bundle bundle, @k DeepLink deepLink, @l String str) {
        this.f134520a = deepLink;
        this.f134521b = str;
        this.f134522c = bundle;
    }
}
