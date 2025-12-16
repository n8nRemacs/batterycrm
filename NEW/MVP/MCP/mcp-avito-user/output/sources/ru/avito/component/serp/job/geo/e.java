package ru.avito.component.serp.job.geo;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.AfterWithIcon;
import com.avito.android.remote.model.GeoDistance;
import com.avito.android.remote.model.GeoReference;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C42829l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AdvertRichJobGeoParser.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/component/serp/job/geo/e;", "", "<init>", "()V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class e {
    @Inject
    public e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static g a(@l GeoReference geoReference, @l String str, @l String str2, @l String str3, @l ArrayList arrayList, @l GeoDistance geoDistance) {
        C42829l0 c42829l0;
        if ((geoDistance != null ? geoDistance.getAttributedText() : null) != null) {
            if (str2 == null || C43066x.K(str2)) {
                str2 = str3;
            }
            c42829l0 = new C42829l0(str2, null, null);
        } else {
            if ((geoReference != null ? geoReference.getAfterWithIcon() : null) != null) {
                String content = geoReference.getContent();
                AfterWithIcon afterWithIcon = geoReference.getAfterWithIcon();
                String text = afterWithIcon != null ? afterWithIcon.getText() : null;
                AfterWithIcon afterWithIcon2 = geoReference.getAfterWithIcon();
                c42829l0 = new C42829l0(content, text, afterWithIcon2 != null ? afterWithIcon2.getIconName() : null);
            } else {
                if (str2 == null || C43066x.K(str2)) {
                    str2 = str3;
                }
                c42829l0 = new C42829l0(str2, str, null);
            }
        }
        String str4 = (String) c42829l0.f406871b;
        String str5 = (String) c42829l0.f406872c;
        String str6 = (String) c42829l0.f406873d;
        boolean z12 = (str4 == null || C43066x.K(str4) || ((str5 == null || C43066x.K(str5)) && (str6 == null || C43066x.K(str6)))) ? false : true;
        boolean z13 = str4 == null || C43066x.K(str4);
        boolean z14 = str5 == null || C43066x.K(str5);
        StringBuilder sb2 = new StringBuilder();
        if (!z13) {
            sb2.append(str4);
        }
        if (z12) {
            sb2.append(",");
        }
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        if (!z14) {
            sb3.append(str5);
        }
        return new g(string, sb3.toString(), str6, arrayList, geoDistance != null ? geoDistance.getAttributedText() : null);
    }
}
