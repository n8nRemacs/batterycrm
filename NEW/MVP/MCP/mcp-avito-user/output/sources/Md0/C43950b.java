package mD0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.akita.compose.foundation.p;
import com.avito.android.R;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConstructorConfigureLevelState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LmD0/b;", "", "a", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mD0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C43950b {

    /* renamed from: a, reason: collision with root package name */
    public final int f414413a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Image f414414b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f414415c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f414416d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f414417e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f414418f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f414419g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ButtonAction f414420h;

    /* compiled from: ConstructorConfigureLevelState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmD0/b$a;", "", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mD0.b$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f414421a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final p f414422b;

        public a(@k String str, @k p pVar) {
            this.f414421a = str;
            this.f414422b = pVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f414421a, aVar.f414421a) && L.f(this.f414422b, aVar.f414422b);
        }

        public final int hashCode() {
            return this.f414422b.hashCode() + r.e(R.attr.ic_check16, this.f414421a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            return "Feature(title=" + this.f414421a + ", iconAttr=2130971738, iconColor=" + this.f414422b + ')';
        }
    }

    public C43950b(int i12, @k Image image, @k String str, @k String str2, @k ArrayList arrayList, @k String str3, @l AttributedText attributedText, @k ButtonAction buttonAction) {
        this.f414413a = i12;
        this.f414414b = image;
        this.f414415c = str;
        this.f414416d = str2;
        this.f414417e = arrayList;
        this.f414418f = str3;
        this.f414419g = attributedText;
        this.f414420h = buttonAction;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43950b)) {
            return false;
        }
        C43950b c43950b = (C43950b) obj;
        return this.f414413a == c43950b.f414413a && L.f(this.f414414b, c43950b.f414414b) && L.f(this.f414415c, c43950b.f414415c) && L.f(this.f414416d, c43950b.f414416d) && this.f414417e.equals(c43950b.f414417e) && L.f(this.f414418f, c43950b.f414418f) && L.f(this.f414419g, c43950b.f414419g) && L.f(this.f414420h, c43950b.f414420h);
    }

    public final int hashCode() {
        int iD2 = H.d(e.g(this.f414417e, H.d(H.d(com.avito.android.actions_sheet.a.g(this.f414414b, Integer.hashCode(this.f414413a) * 31, 31), 31, this.f414415c), 31, this.f414416d), 31), 31, this.f414418f);
        AttributedText attributedText = this.f414419g;
        return this.f414420h.hashCode() + ((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConstructorConfigureLevelItem(id=");
        sb2.append(this.f414413a);
        sb2.append(", image=");
        sb2.append(this.f414414b);
        sb2.append(", title=");
        sb2.append(this.f414415c);
        sb2.append(", description=");
        sb2.append(this.f414416d);
        sb2.append(", features=");
        sb2.append(this.f414417e);
        sb2.append(", price=");
        sb2.append(this.f414418f);
        sb2.append(", actionLink=");
        sb2.append(this.f414419g);
        sb2.append(", button=");
        return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.f414420h, ')');
    }
}
