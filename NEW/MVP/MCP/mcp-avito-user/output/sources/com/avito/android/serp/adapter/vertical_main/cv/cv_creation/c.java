package com.avito.android.serp.adapter.vertical_main.cv.cv_creation;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.J0;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.module.ga;
import com.avito.android.remote.model.cv.CvCreationIcon;
import com.avito.android.remote.model.cv.CvCreationWidget;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: CvCreationItemConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/cv/cv_creation/c;", "", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final J0 f272753a;

    /* compiled from: CvCreationItemConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/cv/cv_creation/c$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CvCreationItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f272754a;

        static {
            int[] iArr = new int[CvCreationIcon.values().length];
            try {
                iArr[CvCreationIcon.PLUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f272754a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public c(@ga @k J0 j02) {
        this.f272753a = j02;
    }

    @k
    public final CvCreationItem a(@k CvCreationWidget cvCreationWidget) {
        Integer numValueOf;
        String strK = com.avito.android.bxcontent.mvi.entity.f.k(this.f272753a, new StringBuilder("cvCreateWidget"));
        String title = cvCreationWidget.getTitle();
        String subtitle = cvCreationWidget.getSubtitle();
        String title2 = cvCreationWidget.getAction().getTitle();
        DeepLink deeplink = cvCreationWidget.getAction().getDeeplink();
        CvCreationIcon icon = cvCreationWidget.getAction().getIcon();
        int i12 = icon == null ? -1 : b.f272754a[icon.ordinal()];
        if (i12 == -1) {
            numValueOf = null;
        } else {
            if (i12 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = Integer.valueOf(R.attr.ic_plus20);
        }
        return new CvCreationItem(strK, title, subtitle, new CvCreationItemAction(deeplink, numValueOf, title2), cvCreationWidget.getAnalytics(), cvCreationWidget.getSettings());
    }
}
