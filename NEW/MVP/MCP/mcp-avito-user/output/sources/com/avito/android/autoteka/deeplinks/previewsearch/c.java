package com.avito.android.autoteka.deeplinks.previewsearch;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchDetails;
import com.avito.android.autoteka.deeplinks.AutotekaPreviewSearchLink;
import com.avito.android.autoteka.deeplinks.AutotekaStep;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.util.UtmParams;
import com.google.gson.Gson;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AutotekaPreviewSearchDeepLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/previewsearch/c;", "LKu/a;", "Lcom/avito/android/autoteka/deeplinks/AutotekaPreviewSearchLink;", "<init>", "()V", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c extends AbstractC14350a<AutotekaPreviewSearchLink> {

    /* compiled from: AutotekaPreviewSearchDeepLinkParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/previewsearch/c$a;", "", "<init>", "()V", "", "AUTOTEKA_STEP", "Ljava/lang/String;", "KEY_FROM_BLOCK", "KEY_HIDE_EXAMPLE_REPORT_BUTTON", "KEY_REPURCHASE", "KEY_SEARCH_KEY", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutotekaPreviewSearchDeepLinkParser.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<AutotekaStep> f96299a = kotlin.enums.c.a(AutotekaStep.values());
    }

    static {
        new a(null);
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter = uri.getQueryParameter("searchKey");
        String queryParameter2 = uri.getQueryParameter("autotekaStep");
        UtmParams.f318750c.getClass();
        UtmParams utmParamsA = UtmParams.a.a(uri);
        String queryParameter3 = uri.getQueryParameter("fromBlock");
        Object obj = null;
        Integer numY0 = queryParameter3 != null ? C43066x.y0(queryParameter3) : null;
        boolean z12 = uri.getQueryParameter("repurchase") != null;
        boolean z13 = uri.getQueryParameter("hideExampleReportButton") != null;
        Iterator it = ((AbstractC42738c) b.f96299a).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ((AutotekaStep) next).getClass();
            if ("products".equals(queryParameter2)) {
                obj = next;
                break;
            }
        }
        return new AutotekaPreviewSearchLink(new AutotekaPreviewSearchDetails(queryParameter, numY0, utmParamsA, (AutotekaStep) obj, z12, z13));
    }
}
