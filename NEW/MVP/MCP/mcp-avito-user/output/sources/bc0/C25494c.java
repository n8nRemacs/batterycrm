package bC0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BalanceInfo.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LbC0/c;", "", "", "title", "value", "Lcom/avito/android/remote/model/ButtonAction;", "refillButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/ButtonAction;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Lcom/avito/android/remote/model/ButtonAction;", "a", "()Lcom/avito/android/remote/model/ButtonAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bC0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C25494c {

    @com.google.gson.annotations.c("refillButton")
    @l
    private final ButtonAction refillButton;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("value")
    @k
    private final String value;

    public C25494c(@k String str, @k String str2, @l ButtonAction buttonAction) {
        this.title = str;
        this.value = str2;
        this.refillButton = buttonAction;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final ButtonAction getRefillButton() {
        return this.refillButton;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25494c)) {
            return false;
        }
        C25494c c25494c = (C25494c) obj;
        return L.f(this.title, c25494c.title) && L.f(this.value, c25494c.value) && L.f(this.refillButton, c25494c.refillButton);
    }

    public final int hashCode() {
        int iD2 = H.d(this.title.hashCode() * 31, 31, this.value);
        ButtonAction buttonAction = this.refillButton;
        return iD2 + (buttonAction == null ? 0 : buttonAction.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BalanceInfo(title=");
        sb2.append(this.title);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", refillButton=");
        return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.refillButton, ')');
    }
}
