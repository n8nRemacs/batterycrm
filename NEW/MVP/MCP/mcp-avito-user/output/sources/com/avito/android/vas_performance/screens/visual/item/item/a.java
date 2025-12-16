package com.avito.android.vas_performance.screens.visual.item.item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VisualVasItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/item/item/a;", "Lcom/avito/conveyor_item/a;", "a", "b", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f321049b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f321050c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f321051d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f321052e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f321053f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Image f321054g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f321055h;

    /* renamed from: i, reason: collision with root package name */
    public final long f321056i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f321057j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final b f321058k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final C9945a f321059l;

    /* compiled from: VisualVasItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/item/item/a$a;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.vas_performance.screens.visual.item.item.a$a, reason: collision with other inner class name */
    public static final /* data */ class C9945a {

        /* renamed from: a, reason: collision with root package name */
        public final float f321060a;

        /* renamed from: b, reason: collision with root package name */
        public final int f321061b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedText f321062c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f321063d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final UniversalColor f321064e;

        public C9945a(int i12, float f12, @l AttributedText attributedText, @l String str, @l UniversalColor universalColor) {
            this.f321060a = f12;
            this.f321061b = i12;
            this.f321062c = attributedText;
            this.f321063d = str;
            this.f321064e = universalColor;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9945a)) {
                return false;
            }
            C9945a c9945a = (C9945a) obj;
            return Float.compare(this.f321060a, c9945a.f321060a) == 0 && this.f321061b == c9945a.f321061b && L.f(this.f321062c, c9945a.f321062c) && L.f(this.f321063d, c9945a.f321063d) && L.f(this.f321064e, c9945a.f321064e);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f321061b, Float.hashCode(this.f321060a) * 31, 31);
            AttributedText attributedText = this.f321062c;
            int iHashCode = (iE2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            String str = this.f321063d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            UniversalColor universalColor = this.f321064e;
            return iHashCode2 + (universalColor != null ? universalColor.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Contacts(progress=");
            sb2.append(this.f321060a);
            sb2.append(", count=");
            sb2.append(this.f321061b);
            sb2.append(", text=");
            sb2.append(this.f321062c);
            sb2.append(", iconName=");
            sb2.append(this.f321063d);
            sb2.append(", progressColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f321064e, ')');
        }
    }

    /* compiled from: VisualVasItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/item/item/a$b;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final UniversalImage f321065a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f321066b;

        public b(@l UniversalImage universalImage, @l AttributedText attributedText) {
            this.f321065a = universalImage;
            this.f321066b = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f321065a, bVar.f321065a) && L.f(this.f321066b, bVar.f321066b);
        }

        public final int hashCode() {
            UniversalImage universalImage = this.f321065a;
            int iHashCode = (universalImage == null ? 0 : universalImage.hashCode()) * 31;
            AttributedText attributedText = this.f321066b;
            return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ExtraOption(icon=");
            sb2.append(this.f321065a);
            sb2.append(", description=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f321066b, ')');
        }
    }

    public a(@k String str, @k String str2, @k AttributedText attributedText, @k AttributedText attributedText2, @l AttributedText attributedText3, @l Image image, @k String str3, long j12, boolean z12, @l b bVar, @l C9945a c9945a) {
        this.f321049b = str;
        this.f321050c = str2;
        this.f321051d = attributedText;
        this.f321052e = attributedText2;
        this.f321053f = attributedText3;
        this.f321054g = image;
        this.f321055h = str3;
        this.f321056i = j12;
        this.f321057j = z12;
        this.f321058k = bVar;
        this.f321059l = c9945a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f321049b, aVar.f321049b) && L.f(this.f321050c, aVar.f321050c) && L.f(this.f321051d, aVar.f321051d) && L.f(this.f321052e, aVar.f321052e) && L.f(this.f321053f, aVar.f321053f) && L.f(this.f321054g, aVar.f321054g) && L.f(this.f321055h, aVar.f321055h) && this.f321056i == aVar.f321056i && this.f321057j == aVar.f321057j && L.f(this.f321058k, aVar.f321058k) && L.f(this.f321059l, aVar.f321059l);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return getF321049b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF321049b() {
        return this.f321049b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(H.d(this.f321049b.hashCode() * 31, 31, this.f321050c), 31, this.f321051d), 31, this.f321052e);
        AttributedText attributedText = this.f321053f;
        int iHashCode = (iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Image image = this.f321054g;
        int i12 = r.i(r.g(H.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f321055h), 31, this.f321056i), 31, this.f321057j);
        b bVar = this.f321058k;
        int iHashCode2 = (i12 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C9945a c9945a = this.f321059l;
        return iHashCode2 + (c9945a != null ? c9945a.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "VisualVasItem(stringId=" + this.f321049b + ", title=" + this.f321050c + ", description=" + this.f321051d + ", price=" + this.f321052e + ", oldPrice=" + this.f321053f + ", icon=" + this.f321054g + ", duration=" + this.f321055h + ", priceValue=" + this.f321056i + ", isSelected=" + this.f321057j + ", extraOption=" + this.f321058k + ", contacts=" + this.f321059l + ')';
    }
}
