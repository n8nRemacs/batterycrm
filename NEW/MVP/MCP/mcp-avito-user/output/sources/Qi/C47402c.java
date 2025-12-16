package qi;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinForm;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinTabLayoutModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lqi/c;", "", "", "selectedTabId", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "Lqi/c$a;", "tabs", "Lqi/a;", "onSelectTabEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lqi/a;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lqi/a;", "a", "()Lqi/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qi.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C47402c {

    @com.google.gson.annotations.c("onSelectTabEvent")
    @l
    private final C47400a onSelectTabEvent;

    @com.google.gson.annotations.c("selectedTabId")
    @l
    private final String selectedTabId;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String style;

    @com.google.gson.annotations.c("tabs")
    @k
    private final List<a> tabs;

    /* compiled from: BeduinTabLayoutModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lqi/c$a;", "", "", "id", "title", "Lcom/avito/android/beduin_models/BeduinForm;", "topForm", "mainForm", "bottomForm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin_models/BeduinForm;Lcom/avito/android/beduin_models/BeduinForm;Lcom/avito/android/beduin_models/BeduinForm;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "Lcom/avito/android/beduin_models/BeduinForm;", "e", "()Lcom/avito/android/beduin_models/BeduinForm;", "c", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qi.c$a */
    public static final /* data */ class a {

        @com.google.gson.annotations.c("bottomForm")
        @l
        private final BeduinForm bottomForm;

        @com.google.gson.annotations.c("id")
        @k
        private final String id;

        @com.google.gson.annotations.c("mainForm")
        @l
        private final BeduinForm mainForm;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        @com.google.gson.annotations.c("topForm")
        @l
        private final BeduinForm topForm;

        public a(@k String str, @k String str2, @l BeduinForm beduinForm, @l BeduinForm beduinForm2, @l BeduinForm beduinForm3) {
            this.id = str;
            this.title = str2;
            this.topForm = beduinForm;
            this.mainForm = beduinForm2;
            this.bottomForm = beduinForm3;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final BeduinForm getBottomForm() {
            return this.bottomForm;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final BeduinForm getMainForm() {
            return this.mainForm;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final BeduinForm getTopForm() {
            return this.topForm;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.id, aVar.id) && L.f(this.title, aVar.title) && L.f(this.topForm, aVar.topForm) && L.f(this.mainForm, aVar.mainForm) && L.f(this.bottomForm, aVar.bottomForm);
        }

        public final int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
            BeduinForm beduinForm = this.topForm;
            int iHashCode = (iD2 + (beduinForm == null ? 0 : beduinForm.hashCode())) * 31;
            BeduinForm beduinForm2 = this.mainForm;
            int iHashCode2 = (iHashCode + (beduinForm2 == null ? 0 : beduinForm2.hashCode())) * 31;
            BeduinForm beduinForm3 = this.bottomForm;
            return iHashCode2 + (beduinForm3 != null ? beduinForm3.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Tab(id=" + this.id + ", title=" + this.title + ", topForm=" + this.topForm + ", mainForm=" + this.mainForm + ", bottomForm=" + this.bottomForm + ')';
        }
    }

    public C47402c(@l String str, @l String str2, @k List<a> list, @l C47400a c47400a) {
        this.selectedTabId = str;
        this.style = str2;
        this.tabs = list;
        this.onSelectTabEvent = c47400a;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C47400a getOnSelectTabEvent() {
        return this.onSelectTabEvent;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getSelectedTabId() {
        return this.selectedTabId;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @k
    public final List<a> d() {
        return this.tabs;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47402c)) {
            return false;
        }
        C47402c c47402c = (C47402c) obj;
        return L.f(this.selectedTabId, c47402c.selectedTabId) && L.f(this.style, c47402c.style) && L.f(this.tabs, c47402c.tabs) && L.f(this.onSelectTabEvent, c47402c.onSelectTabEvent);
    }

    public final int hashCode() {
        String str = this.selectedTabId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.style;
        int iE2 = H.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.tabs);
        C47400a c47400a = this.onSelectTabEvent;
        return iE2 + (c47400a != null ? c47400a.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "BeduinTabLayoutModel(selectedTabId=" + this.selectedTabId + ", style=" + this.style + ", tabs=" + this.tabs + ", onSelectTabEvent=" + this.onSelectTabEvent + ')';
    }
}
