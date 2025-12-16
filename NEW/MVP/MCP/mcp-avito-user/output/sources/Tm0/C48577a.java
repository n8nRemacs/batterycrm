package tM0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasUnionV2Result.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LtM0/a;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "icon", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "a", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tM0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C48577a {

    @com.google.gson.annotations.c("icon")
    @k
    private final AttributedText icon;

    @com.google.gson.annotations.c("text")
    @k
    private final AttributedText text;

    public C48577a(@k AttributedText attributedText, @k AttributedText attributedText2) {
        this.text = attributedText;
        this.icon = attributedText2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final AttributedText getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48577a)) {
            return false;
        }
        C48577a c48577a = (C48577a) obj;
        return L.f(this.text, c48577a.text) && L.f(this.icon, c48577a.icon);
    }

    public final int hashCode() {
        return this.icon.hashCode() + (this.text.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasBundlesBenefit(text=");
        sb2.append(this.text);
        sb2.append(", icon=");
        return com.avito.android.actions_sheet.a.w(sb2, this.icon, ')');
    }
}
