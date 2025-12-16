package com.avito.android.advertising.loaders.avito_targeting;

import android.net.Uri;
import androidx.compose.ui.platform.C22491k0;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.advertising.loaders.x;
import com.avito.android.remote.model.advertising.AvitoNetworkBannerRaw;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoBannerConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/avito_targeting/b;", "Lcom/avito/android/advertising/loaders/avito_targeting/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.kebab.i f88028a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x f88029b;

    @Inject
    public b(@Y61.k com.avito.android.advertising.kebab.i iVar, @Y61.k x xVar) {
        this.f88028a = iVar;
        this.f88029b = xVar;
    }

    @Override // com.avito.android.advertising.loaders.avito_targeting.a
    @Y61.k
    public final AvitoNetworkBanner a(@Y61.k AvitoNetworkBannerRaw.Outclick outclick) {
        AvitoNetworkBanner html;
        boolean zF2 = L.f(outclick.getRenderer(), "bd_ui");
        x xVar = this.f88029b;
        if (!zF2) {
            String templateType = outclick.getTemplateType();
            int iHashCode = templateType.hashCode();
            if (iHashCode == 3213227) {
                if (templateType.equals("html")) {
                    String strC = d.c(outclick, "html");
                    if (strC == null) {
                        throw new AvitoNetworkFieldNotFoundException("html");
                    }
                    Float fB2 = d.b(outclick, "ratio");
                    if (fB2 == null) {
                        throw new AvitoNetworkFieldNotFoundException("ratio");
                    }
                    html = new AvitoNetworkBanner.Html(strC, fB2, false, false, d.d(outclick.getProps()), d(outclick.getPixels()), 12, null);
                }
                throw new AvitoNetworkUnsupportedTemplateType(C22491k0.a('\"', "Unsupported templateType \"", outclick.getTemplateType()));
            }
            if (iHashCode != 112202875) {
                if (iHashCode == 887240603 && templateType.equals("stubPoster")) {
                    Map<String, Object> content = outclick.getContent();
                    Object obj = content != null ? content.get("imageUrl") : null;
                    Uri uri = obj != null ? Uri.parse(obj.toString()) : null;
                    if (uri == null) {
                        throw new AvitoNetworkFieldNotFoundException("imageUrl");
                    }
                    String strC2 = d.c(outclick, TooltipAttribute.PARAM_DEEP_LINK);
                    if (strC2 == null) {
                        throw new AvitoNetworkFieldNotFoundException(TooltipAttribute.PARAM_DEEP_LINK);
                    }
                    html = new AvitoNetworkBanner.Image(uri, strC2, d.d(outclick.getProps()), d(outclick.getPixels()));
                }
                throw new AvitoNetworkUnsupportedTemplateType(C22491k0.a('\"', "Unsupported templateType \"", outclick.getTemplateType()));
            }
            if (templateType.equals("video")) {
                String strC3 = d.c(outclick, ContextActionHandler.Link.URL);
                if (strC3 == null) {
                    throw new AvitoNetworkFieldNotFoundException(ContextActionHandler.Link.URL);
                }
                String f88495c = xVar.getF88495c();
                String strE = d.e(strC3, f88495c != null ? f88495c : "");
                String strC4 = d.c(outclick, "title");
                String strC5 = d.c(outclick, "description");
                String strC6 = d.c(outclick, "legalInfo");
                String strC7 = d.c(outclick, "externalLegalInfo");
                String strC8 = d.c(outclick, "age");
                Map<String, Object> content2 = outclick.getContent();
                Object obj2 = content2 != null ? content2.get("videoPreviewUrl") : null;
                Uri uri2 = obj2 == null ? null : Uri.parse(obj2.toString());
                Map<String, Object> content3 = outclick.getContent();
                Object obj3 = content3 != null ? content3.get("videoUrl") : null;
                Uri uri3 = obj3 == null ? null : Uri.parse(obj3.toString());
                if (uri3 == null) {
                    throw new AvitoNetworkFieldNotFoundException("videoUrl");
                }
                Float fB3 = d.b(outclick, "videoRatio");
                if (fB3 == null) {
                    throw new AvitoNetworkFieldNotFoundException("videoRatio");
                }
                float fFloatValue = fB3.floatValue();
                String strC9 = d.c(outclick, "buttonText");
                Map<String, Object> content4 = outclick.getContent();
                Object obj4 = content4 != null ? content4.get("logoImageUrl") : null;
                html = new AvitoNetworkBanner.Video(strE, strC4, strC5, strC6, strC7, strC8, uri2, uri3, fFloatValue, strC9, obj4 != null ? Uri.parse(obj4.toString()) : null, d.b(outclick, "logoImageRatio"), d.d(outclick.getProps()), d(outclick.getPixels()));
            }
            throw new AvitoNetworkUnsupportedTemplateType(C22491k0.a('\"', "Unsupported templateType \"", outclick.getTemplateType()));
        }
        Map<String, Object> content5 = outclick.getContent();
        String templateType2 = outclick.getTemplateType();
        String template = outclick.getTemplate();
        String strC10 = d.c(outclick, ContextActionHandler.Link.URL);
        if (strC10 == null) {
            throw new AvitoNetworkFieldNotFoundException(ContextActionHandler.Link.URL);
        }
        String f88495c2 = xVar.getF88495c();
        html = new AvitoNetworkBanner.BDUI(content5, templateType2, template, d.e(strC10, f88495c2 != null ? f88495c2 : ""), d.d(outclick.getProps()), d(outclick.getPixels()));
        return html;
    }

    @Override // com.avito.android.advertising.loaders.avito_targeting.a
    @Y61.k
    public final AvitoNetworkBanner b(@Y61.k AvitoNetworkBannerRaw avitoNetworkBannerRaw) {
        if (avitoNetworkBannerRaw instanceof AvitoNetworkBannerRaw.Image) {
            AvitoNetworkBannerRaw.Image image = (AvitoNetworkBannerRaw.Image) avitoNetworkBannerRaw;
            Uri uri = Uri.parse(image.getImage());
            String uri2 = image.getUri();
            AvitoNetworkBanner.Pixels.f87983q.getClass();
            return new AvitoNetworkBanner.Image(uri, uri2, null, AvitoNetworkBanner.Pixels.f87984r);
        }
        if (avitoNetworkBannerRaw instanceof AvitoNetworkBannerRaw.ProfilePromo) {
            return c((AvitoNetworkBannerRaw.ProfilePromo) avitoNetworkBannerRaw);
        }
        if (!(avitoNetworkBannerRaw instanceof AvitoNetworkBannerRaw.ProfilePromoGallery)) {
            if (avitoNetworkBannerRaw instanceof AvitoNetworkBannerRaw.Outclick) {
                return a((AvitoNetworkBannerRaw.Outclick) avitoNetworkBannerRaw);
            }
            throw new NoWhenBranchMatchedException();
        }
        AvitoNetworkBannerRaw.ProfilePromoGallery profilePromoGallery = (AvitoNetworkBannerRaw.ProfilePromoGallery) avitoNetworkBannerRaw;
        String title = profilePromoGallery.getTitle();
        List<AvitoNetworkBannerRaw.ProfilePromo> posters = profilePromoGallery.getPosters();
        ArrayList arrayList = new ArrayList(C42745f0.q(posters, 10));
        Iterator<T> it = posters.iterator();
        while (it.hasNext()) {
            arrayList.add(c((AvitoNetworkBannerRaw.ProfilePromo) it.next()));
        }
        return new AvitoNetworkBanner.ProfilePromoGallery(title, arrayList);
    }

    public final AvitoNetworkBanner.ProfilePromo c(AvitoNetworkBannerRaw.ProfilePromo profilePromo) {
        ArrayList arrayList;
        String title = profilePromo.getTitle();
        String description = profilePromo.getDescription();
        Uri uri = Uri.parse(profilePromo.getImage());
        String uri2 = profilePromo.getUri();
        int creativeId = profilePromo.getCreativeId();
        boolean zE2 = this.f88028a.e(profilePromo.getCreativeId());
        AvitoNetworkBannerRaw.MarkInfo markInfo = profilePromo.getMarkInfo();
        AvitoNetworkBanner.MarkInfo markInfo2 = markInfo != null ? new AvitoNetworkBanner.MarkInfo(markInfo.getJuristicInfo(), markInfo.getLegalInfo(), markInfo.getAge()) : null;
        List<AvitoNetworkBannerRaw.HideReason> hideReasons = profilePromo.getHideReasons();
        if (hideReasons != null) {
            List<AvitoNetworkBannerRaw.HideReason> list = hideReasons;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (AvitoNetworkBannerRaw.HideReason hideReason : list) {
                arrayList2.add(new AvitoNetworkBanner.HideReason(hideReason.getId(), hideReason.getDescription()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new AvitoNetworkBanner.ProfilePromo(title, description, uri, uri2, creativeId, zE2, markInfo2, arrayList);
    }

    public final AvitoNetworkBanner.Pixels d(AvitoNetworkBannerRaw.Outclick.Pixels pixels) {
        List<String> view = pixels != null ? pixels.getView() : null;
        if (view == null) {
            view = C42784z0.f406748b;
        }
        x xVar = this.f88029b;
        String f88495c = xVar.getF88495c();
        if (f88495c == null) {
            f88495c = "";
        }
        ArrayList arrayListA = d.a(f88495c, view);
        List<String> click = pixels != null ? pixels.getClick() : null;
        if (click == null) {
            click = C42784z0.f406748b;
        }
        String f88495c2 = xVar.getF88495c();
        ArrayList arrayListA2 = d.a(f88495c2 != null ? f88495c2 : "", click);
        List<String> videoStart = pixels != null ? pixels.getVideoStart() : null;
        if (videoStart == null) {
            videoStart = C42784z0.f406748b;
        }
        List<String> list = videoStart;
        List<String> videoFirstQuartile = pixels != null ? pixels.getVideoFirstQuartile() : null;
        if (videoFirstQuartile == null) {
            videoFirstQuartile = C42784z0.f406748b;
        }
        List<String> list2 = videoFirstQuartile;
        List<String> videoMidpoint = pixels != null ? pixels.getVideoMidpoint() : null;
        if (videoMidpoint == null) {
            videoMidpoint = C42784z0.f406748b;
        }
        List<String> list3 = videoMidpoint;
        List<String> videoThirdQuartile = pixels != null ? pixels.getVideoThirdQuartile() : null;
        if (videoThirdQuartile == null) {
            videoThirdQuartile = C42784z0.f406748b;
        }
        List<String> list4 = videoThirdQuartile;
        List<String> videoComplete = pixels != null ? pixels.getVideoComplete() : null;
        if (videoComplete == null) {
            videoComplete = C42784z0.f406748b;
        }
        return new AvitoNetworkBanner.Pixels(arrayListA, false, arrayListA2, false, null, list, false, list2, false, list3, false, list4, false, videoComplete, false, 21850, null);
    }
}
