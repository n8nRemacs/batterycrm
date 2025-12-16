package com.avito.android.passport.network.model;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BusinessVrfResult.kt */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/passport/network/model/Banner;", "", "title", "", "text", "Lcom/avito/android/remote/model/text/AttributedText;", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Banner {

    @k
    private final AttributedText text;

    @k
    private final String title;

    public Banner(@k String str, @k AttributedText attributedText) {
        this.title = str;
        this.text = attributedText;
    }

    public static /* synthetic */ Banner copy$default(Banner banner, String str, AttributedText attributedText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = banner.title;
        }
        if ((i12 & 2) != 0) {
            attributedText = banner.text;
        }
        return banner.copy(str, attributedText);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @k
    public final Banner copy(@k String title, @k AttributedText text) {
        return new Banner(title, text);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Banner)) {
            return false;
        }
        Banner banner = (Banner) other;
        return L.f(this.title, banner.title) && L.f(this.text, banner.text);
    }

    @k
    public final AttributedText getText() {
        return this.text;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.title.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Banner(title=");
        sb2.append(this.title);
        sb2.append(", text=");
        return a.w(sb2, this.text, ')');
    }
}
