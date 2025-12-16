package ru.avito.component.serp.job.geo;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.AfterWithIcon;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ru.avito.component.serp.job.geo.a;

/* compiled from: AdvertRichJobGeoParser2.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/component/serp/job/geo/b;", "", "<init>", "()V", "a", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b {

    /* compiled from: AdvertRichJobGeoParser2.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/serp/job/geo/b$a;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f430514a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f430515b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f430516c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ArrayList f430517d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f430518e;

        public a(@l String str, @l String str2, @l String str3, @l String str4, @l ArrayList arrayList) {
            this.f430514a = str;
            this.f430515b = str2;
            this.f430516c = str3;
            this.f430517d = arrayList;
            this.f430518e = str4;
        }
    }

    @Inject
    public b() {
    }

    @k
    public static ru.avito.component.serp.job.geo.a a(@l GeoReference geoReference, @l String str, @l String str2, @l String str3, @l ArrayList arrayList) {
        a aVar;
        GeoReference.AdditionalInfo additionalInfo;
        String str4;
        String content;
        if (geoReference == null || (content = geoReference.getContent()) == null || C43066x.K(content)) {
            String str5 = (str2 == null || C43066x.K(str2)) ? str3 : str2;
            if (geoReference != null && (additionalInfo = geoReference.getAdditionalInfo()) != null) {
                content = additionalInfo.getContent();
            }
            aVar = new a(str5, str, null, content, null);
        } else {
            String content2 = geoReference.getContent();
            AfterWithIcon afterWithIcon = geoReference.getAfterWithIcon();
            String text = afterWithIcon != null ? afterWithIcon.getText() : null;
            AfterWithIcon afterWithIcon2 = geoReference.getAfterWithIcon();
            String iconName = afterWithIcon2 != null ? afterWithIcon2.getIconName() : null;
            GeoReference.AdditionalInfo additionalInfo2 = geoReference.getAdditionalInfo();
            aVar = new a(content2, text, iconName, additionalInfo2 != null ? additionalInfo2.getContent() : null, arrayList);
        }
        boolean z12 = true;
        int iB2 = 0;
        String str6 = aVar.f430515b;
        String str7 = aVar.f430514a;
        boolean z13 = (str7 == null || C43066x.K(str7) || ((str6 == null || C43066x.K(str6)) && ((str4 = aVar.f430516c) == null || C43066x.K(str4)))) ? false : true;
        if (str7 != null && !C43066x.K(str7)) {
            z12 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (!z12) {
            sb2.append(str7);
        }
        if (z13) {
            sb2.append(",");
        }
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        if (str6 != null && !C43066x.K(str6)) {
            sb3.append(str6);
        }
        String string2 = sb3.toString();
        if (O2.a(arrayList) && !z12) {
            iB2 = y6.b(4);
        }
        return new ru.avito.component.serp.job.geo.a(new a.C12400a(iB2, string), string2, aVar.f430516c, aVar.f430517d, aVar.f430518e);
    }
}
