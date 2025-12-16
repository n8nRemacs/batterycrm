package com.avito.android.vacancy_publish.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: VacancyPublishDeepLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vacancy_publish/deeplink/a;", "LKu/a;", "Lcom/avito/android/vacancy_publish/deeplink/VacancyPublishLink;", "<init>", "()V", "_avito_job_vacancy-publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC14350a<VacancyPublishLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new VacancyPublishLink();
    }
}
