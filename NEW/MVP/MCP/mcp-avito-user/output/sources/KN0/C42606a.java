package kN0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.video_requirements.deeplink.VideoRequirementsLink;
import com.avito.android.video_requirements.view.VideoRequirementsDialog;
import com.avito.android.video_requirements.view.VideoRequirementsOpenParams;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VideoRequirementsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LkN0/a;", "Lev/b;", "Lcom/avito/android/video_requirements/deeplink/VideoRequirementsLink;", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kN0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42606a extends AbstractC40162b<VideoRequirementsLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.d f406250d;

    @Inject
    public C42606a(@k a.d dVar) {
        this.f406250d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        VideoRequirementsLink videoRequirementsLink = (VideoRequirementsLink) deepLink;
        VideoRequirementsDialog.a aVar = VideoRequirementsDialog.f326034r0;
        VideoRequirementsOpenParams videoRequirementsOpenParams = new VideoRequirementsOpenParams(videoRequirementsLink.f326003b, videoRequirementsLink.f326004c, videoRequirementsLink.f326005d, videoRequirementsLink.f326006e);
        aVar.getClass();
        VideoRequirementsDialog videoRequirementsDialog = new VideoRequirementsDialog();
        videoRequirementsDialog.f326039k0.setValue(videoRequirementsDialog, VideoRequirementsDialog.f326035s0[0], videoRequirementsOpenParams);
        this.f406250d.w1(videoRequirementsDialog, "video_requirements_dialog_tag");
        return AbstractC14250d.c.f9171c;
    }
}
