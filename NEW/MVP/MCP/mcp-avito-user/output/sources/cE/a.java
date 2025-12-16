package CE;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api21FeesFeesMethodsGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LCE/a;", "", "a", "b", "LCE/a$a;", "LCE/a$b;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {

    /* compiled from: Api21FeesFeesMethodsGetResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LCE/a$a;", "LCE/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "action", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: CE.a$a, reason: collision with other inner class name */
    public static final class C0095a implements a {

        @com.google.gson.annotations.c("action")
        @Y61.k
        private final DeepLink action;

        public C0095a(@Y61.k DeepLink deepLink) {
            this.action = deepLink;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final DeepLink getAction() {
            return this.action;
        }
    }

    /* compiled from: Api21FeesFeesMethodsGetResponse.kt */
    @P
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b0\u0010\u001f¨\u00061"}, d2 = {"LCE/a$b;", "LCE/a;", "LCE/f;", "alert", "LCE/g;", "bar", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LCE/h;", "details", ServiceTransportationWidget.DisclaimerField.TYPE, "", "itemId", "", "LCE/j;", "list", "LCE/d;", "navBar", "", "showFeesMethodsInfoForced", "title", "<init>", "(LCE/f;LCE/g;Lcom/avito/android/remote/model/text/AttributedText;LCE/h;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/util/List;LCE/d;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;)V", "LCE/f;", "a", "()LCE/f;", "LCE/g;", "b", "()LCE/g;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "LCE/h;", "d", "()LCE/h;", "e", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Ljava/util/List;", "g", "()Ljava/util/List;", "LCE/d;", "h", "()LCE/d;", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "j", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        @com.google.gson.annotations.c("alert")
        @l
        private final f alert;

        @com.google.gson.annotations.c("bar")
        @l
        private final g bar;

        @com.google.gson.annotations.c("description")
        @l
        private final AttributedText description;

        @com.google.gson.annotations.c("details")
        @l
        private final h details;

        @com.google.gson.annotations.c(ServiceTransportationWidget.DisclaimerField.TYPE)
        @l
        private final AttributedText disclaimer;

        @com.google.gson.annotations.c("itemId")
        @Y61.k
        private final String itemId;

        @com.google.gson.annotations.c("list")
        @Y61.k
        private final List<j> list;

        @com.google.gson.annotations.c("navBar")
        @l
        private final d navBar;

        @com.google.gson.annotations.c("showFeesMethodsInfoForced")
        @l
        private final Boolean showFeesMethodsInfoForced;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final AttributedText title;

        public b(@l f fVar, @l g gVar, @l AttributedText attributedText, @l h hVar, @l AttributedText attributedText2, @Y61.k String str, @Y61.k List<j> list, @l d dVar, @l Boolean bool, @Y61.k AttributedText attributedText3) {
            this.alert = fVar;
            this.bar = gVar;
            this.description = attributedText;
            this.details = hVar;
            this.disclaimer = attributedText2;
            this.itemId = str;
            this.list = list;
            this.navBar = dVar;
            this.showFeesMethodsInfoForced = bool;
            this.title = attributedText3;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final f getAlert() {
            return this.alert;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final g getBar() {
            return this.bar;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final h getDetails() {
            return this.details;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final AttributedText getDisclaimer() {
            return this.disclaimer;
        }

        @Y61.k
        /* renamed from: f, reason: from getter */
        public final String getItemId() {
            return this.itemId;
        }

        @Y61.k
        public final List<j> g() {
            return this.list;
        }

        @l
        /* renamed from: h, reason: from getter */
        public final d getNavBar() {
            return this.navBar;
        }

        @l
        /* renamed from: i, reason: from getter */
        public final Boolean getShowFeesMethodsInfoForced() {
            return this.showFeesMethodsInfoForced;
        }

        @Y61.k
        /* renamed from: j, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }
    }
}
