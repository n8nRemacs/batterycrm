package kN0;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.beduin.common.component.file_uploader.ValidationRule;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.video_requirements.deeplink.VideoRequirementsLink;
import com.avito.android.video_requirements.depplink.VideoRequirementsQueryParameters;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: VideoRequirementsDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LkN0/c;", "LKu/a;", "Lcom/avito/android/video_requirements/deeplink/VideoRequirementsLink;", "<init>", "()V", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kN0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42608c extends AbstractC14350a<VideoRequirementsLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        VideoRequirementsQueryParameters[] videoRequirementsQueryParametersArr = VideoRequirementsQueryParameters.f326007b;
        String queryParameter = uri.getQueryParameter("categoryId");
        Long lValueOf = queryParameter != null ? Long.valueOf(Long.parseLong(queryParameter)) : null;
        String queryParameter2 = uri.getQueryParameter("minDuration");
        Long lValueOf2 = queryParameter2 != null ? Long.valueOf(Long.parseLong(queryParameter2)) : null;
        String queryParameter3 = uri.getQueryParameter("maxDuration");
        Long lValueOf3 = queryParameter3 != null ? Long.valueOf(Long.parseLong(queryParameter3)) : null;
        String queryParameter4 = uri.getQueryParameter(ValidationRule.MAX_FILE_SIZE_RULE);
        return new VideoRequirementsLink(lValueOf, lValueOf2, lValueOf3, queryParameter4 != null ? Long.valueOf(Long.parseLong(queryParameter4)) : null);
    }
}
