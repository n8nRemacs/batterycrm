package KZ;

import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApplicationBorrowerItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001a¨\u0006\u001b"}, d2 = {"LKZ/m;", "LKZ/p;", "", "id", "title", "titleStyle", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "", "LKZ/K;", "actions", "", "canDeleteMeta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "e", "f", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/Boolean;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KZ.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C14283m implements InterfaceC14286p {

    @com.google.gson.annotations.c("actions")
    @Y61.k
    private final List<K> actions;

    @com.google.gson.annotations.c("canDelete")
    @Y61.l
    private final Boolean canDeleteMeta;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("titleStyle")
    @Y61.l
    private final String titleStyle;

    public C14283m(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l AttributedText attributedText, @Y61.k List<K> list, @Y61.l Boolean bool) {
        this.id = str;
        this.title = str2;
        this.titleStyle = str3;
        this.subtitle = attributedText;
        this.actions = list;
        this.canDeleteMeta = bool;
    }

    @Y61.k
    public final List<K> a() {
        return this.actions;
    }

    public final boolean b() {
        Boolean bool = this.canDeleteMeta;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14283m)) {
            return false;
        }
        C14283m c14283m = (C14283m) obj;
        return kotlin.jvm.internal.L.f(this.id, c14283m.id) && kotlin.jvm.internal.L.f(this.title, c14283m.title) && kotlin.jvm.internal.L.f(this.titleStyle, c14283m.titleStyle) && kotlin.jvm.internal.L.f(this.subtitle, c14283m.subtitle) && kotlin.jvm.internal.L.f(this.actions, c14283m.actions) && kotlin.jvm.internal.L.f(this.canDeleteMeta, c14283m.canDeleteMeta);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final String getTitleStyle() {
        return this.titleStyle;
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.id.hashCode() * 31, 31, this.title);
        String str = this.titleStyle;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.subtitle;
        int iE2 = androidx.compose.foundation.H.e((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.actions);
        Boolean bool = this.canDeleteMeta;
        return iE2 + (bool != null ? bool.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationBorrowerItemValue(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", titleStyle=");
        sb2.append(this.titleStyle);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", canDeleteMeta=");
        return C0.g(sb2, this.canDeleteMeta, ')');
    }
}
