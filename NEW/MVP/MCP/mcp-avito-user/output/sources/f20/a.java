package F20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiMessageBannerData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LF20/a;", "", "a", "_avito_multi-message-send_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f4485a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f4486b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Image f4487c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalImage f4488d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C0272a f4489e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f4490f;

    /* compiled from: MultiMessageBannerData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LF20/a$a;", "", "_avito_multi-message-send_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: F20.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0272a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f4491a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f4492b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f4493c;

        public C0272a(@k String str, @k DeepLink deepLink, @k String str2) {
            this.f4491a = str;
            this.f4492b = deepLink;
            this.f4493c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0272a)) {
                return false;
            }
            C0272a c0272a = (C0272a) obj;
            return L.f(this.f4491a, c0272a.f4491a) && L.f(this.f4492b, c0272a.f4492b) && L.f(this.f4493c, c0272a.f4493c);
        }

        public final int hashCode() {
            return this.f4493c.hashCode() + com.avito.android.actions_sheet.a.e(this.f4492b, this.f4491a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.f4491a);
            sb2.append(", deeplink=");
            sb2.append(this.f4492b);
            sb2.append(", style=");
            return C22026a.c(sb2, this.f4493c, ')');
        }
    }

    public a(@l String str, @l AttributedText attributedText, @l Image image, @l UniversalImage universalImage, @k C0272a c0272a, @l DeepLink deepLink) {
        this.f4485a = str;
        this.f4486b = attributedText;
        this.f4487c = image;
        this.f4488d = universalImage;
        this.f4489e = c0272a;
        this.f4490f = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f4485a, aVar.f4485a) && L.f(this.f4486b, aVar.f4486b) && L.f(this.f4487c, aVar.f4487c) && L.f(this.f4488d, aVar.f4488d) && L.f(this.f4489e, aVar.f4489e) && L.f(this.f4490f, aVar.f4490f);
    }

    public final int hashCode() {
        String str = this.f4485a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.f4486b;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Image image = this.f4487c;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        UniversalImage universalImage = this.f4488d;
        int iHashCode4 = (this.f4489e.hashCode() + ((iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31)) * 31;
        DeepLink deepLink = this.f4490f;
        return iHashCode4 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiMessageBannerData(title=");
        sb2.append(this.f4485a);
        sb2.append(", description=");
        sb2.append(this.f4486b);
        sb2.append(", image=");
        sb2.append(this.f4487c);
        sb2.append(", imagePlaceholder=");
        sb2.append(this.f4488d);
        sb2.append(", button=");
        sb2.append(this.f4489e);
        sb2.append(", onCloseDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f4490f, ')');
    }
}
