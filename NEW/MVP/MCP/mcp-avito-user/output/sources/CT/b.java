package Ct;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.core.os.C22777e;
import com.avito.android.cv_publish.deeplink.CvPublishLink;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Navigation;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: CvPublishDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LCt/b;", "Lev/b;", "Lcom/avito/android/cv_publish/deeplink/CvPublishLink;", "a", "_avito_job_cv-publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends AbstractC40162b<CvPublishLink> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final Object f2724e;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f2725d;

    /* compiled from: CvPublishDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LCt/b$a;", "", "<init>", "()V", "", "", "CONFIG", "Ljava/util/Map;", "", "CV_CATEGORY_ID", "I", "_avito_job_cv-publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f2724e = P0.g(new Q("tree", "android"), new Q("layout", "android_add"));
    }

    @Inject
    public b(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f2725d = aVar;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        CvPublishLink cvPublishLink = (CvPublishLink) deepLink;
        this.f2725d.r6(C22777e.b(new Q("with_up_intent", Boolean.FALSE)), new AdvertPublicationLink.Public(new Navigation(null, 112, null, null, f2724e, null, null, null, null, 493, null), null, false, null, false, null, cvPublishLink.f131590b, null, null, cvPublishLink.f131591c, 446, null), str);
        return AbstractC14250d.c.f9171c;
    }
}
