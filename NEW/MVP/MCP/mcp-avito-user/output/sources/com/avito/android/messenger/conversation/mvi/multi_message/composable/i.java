package com.avito.android.messenger.conversation.mvi.multi_message.composable;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiMessageBannerState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/composable/i;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f193686a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f193687b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Image f193688c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalImage f193689d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f193690e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a f193691f;

    /* compiled from: MultiMessageBannerState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/composable/i$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f193692a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f193693b;

        public a(@k String str, @l String str2) {
            this.f193692a = str;
            this.f193693b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f193692a, aVar.f193692a) && L.f(this.f193693b, aVar.f193693b);
        }

        public final int hashCode() {
            int iHashCode = this.f193692a.hashCode() * 31;
            String str = this.f193693b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.f193692a);
            sb2.append(", style=");
            return C22026a.c(sb2, this.f193693b, ')');
        }
    }

    public i(@l String str, @l AttributedText attributedText, @l Image image, @l UniversalImage universalImage, boolean z12, @k a aVar) {
        this.f193686a = str;
        this.f193687b = attributedText;
        this.f193688c = image;
        this.f193689d = universalImage;
        this.f193690e = z12;
        this.f193691f = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f193686a, iVar.f193686a) && L.f(this.f193687b, iVar.f193687b) && L.f(this.f193688c, iVar.f193688c) && L.f(this.f193689d, iVar.f193689d) && this.f193690e == iVar.f193690e && L.f(this.f193691f, iVar.f193691f);
    }

    public final int hashCode() {
        String str = this.f193686a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.f193687b;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Image image = this.f193688c;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        UniversalImage universalImage = this.f193689d;
        return this.f193691f.hashCode() + r.i((iHashCode3 + (universalImage != null ? universalImage.hashCode() : 0)) * 31, 31, this.f193690e);
    }

    @k
    public final String toString() {
        return "MultiMessageBannerState(title=" + this.f193686a + ", description=" + this.f193687b + ", image=" + this.f193688c + ", imagePlaceholder=" + this.f193689d + ", isCloseButtonVisible=" + this.f193690e + ", button=" + this.f193691f + ')';
    }
}
