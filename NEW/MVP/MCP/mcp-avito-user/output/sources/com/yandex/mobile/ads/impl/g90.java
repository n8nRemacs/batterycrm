package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.impl.im;
import com.yandex.mobile.ads.impl.v41;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes8.dex */
final class g90 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final sm1 f385617a = new sm1();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final w41 f385620d = new w41();

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final qm1<y10> f385622f = new qm1<>(new z10(), "Icons", "Icon");

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final qm1<rc0> f385621e = new qm1<>(new uc0(), "MediaFiles", "MediaFile");

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final qm1<ia1> f385623g = new qm1<>(new ka1(), "TrackingEvents", "Tracking");

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final dh1 f385618b = new dh1();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final as f385619c = new as();

    public final void a(@j.N XmlPullParser xmlPullParser, @j.N im.a aVar) {
        this.f385617a.getClass();
        xmlPullParser.require(2, null, "Linear");
        this.f385620d.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "skipoffset");
        aVar.a(!TextUtils.isEmpty(attributeValue) ? new v41.a(attributeValue).a() : null);
        while (true) {
            this.f385617a.getClass();
            if (xmlPullParser.next() == 3) {
                return;
            }
            this.f385617a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Duration".equals(name)) {
                    aVar.a(this.f385619c.a(xmlPullParser));
                } else if ("TrackingEvents".equals(name)) {
                    Iterator it = this.f385623g.a(xmlPullParser).iterator();
                    while (it.hasNext()) {
                        aVar.a((ia1) it.next());
                    }
                } else if ("MediaFiles".equals(name)) {
                    aVar.b(this.f385621e.a(xmlPullParser));
                } else if ("VideoClicks".equals(name)) {
                    ch1 ch1VarA = this.f385618b.a(xmlPullParser);
                    aVar.a(ch1VarA.a());
                    Iterator<String> it2 = ch1VarA.b().iterator();
                    while (it2.hasNext()) {
                        aVar.a(new ia1("clickTracking", it2.next(), null));
                    }
                } else if ("Icons".equals(name)) {
                    aVar.a((List) this.f385622f.a(xmlPullParser));
                } else {
                    this.f385617a.getClass();
                    sm1.d(xmlPullParser);
                }
            }
        }
    }
}
