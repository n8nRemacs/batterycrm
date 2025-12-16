package hh0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ButtonsModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhh0/b;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hh0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C40940b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f397358a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f397359b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f397360c;

    public C40940b(@k ArrayList arrayList, @l AttributedText attributedText, boolean z12) {
        this.f397358a = arrayList;
        this.f397359b = attributedText;
        this.f397360c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40940b)) {
            return false;
        }
        C40940b c40940b = (C40940b) obj;
        return this.f397358a.equals(c40940b.f397358a) && L.f(this.f397359b, c40940b.f397359b) && this.f397360c == c40940b.f397360c;
    }

    public final int hashCode() {
        int iHashCode = this.f397358a.hashCode() * 31;
        AttributedText attributedText = this.f397359b;
        return Boolean.hashCode(this.f397360c) + ((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonsModel(buttons=");
        sb2.append(this.f397358a);
        sb2.append(", disclaimer=");
        sb2.append(this.f397359b);
        sb2.append(", redesignDisclaimerIsVisible=");
        return r.x(sb2, this.f397360c, ')');
    }
}
