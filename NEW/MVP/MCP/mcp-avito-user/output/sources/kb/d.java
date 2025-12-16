package kB;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetImageUploader;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetEditBlockState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LkB/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UniversalWidgetSectionModel.Block f406175b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f406176c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f406177d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalWidgetImageUploader.a f406178e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalWidgetImageUploader.a f406179f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Boolean f406180g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f406181h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final a f406182i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final a f406183j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final a f406184k;

    /* compiled from: UniversalWidgetEditBlockState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkB/d$a;", "", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f406185a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f406186b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f406187c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f406188d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f406189e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f406190f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f406191g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f406192h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f406193i;

        public a(@k String str, @k String str2, @k String str3, @l Integer num, boolean z12, @l String str4, @l String str5, boolean z13, boolean z14) {
            this.f406185a = str;
            this.f406186b = str2;
            this.f406187c = str3;
            this.f406188d = num;
            this.f406189e = z12;
            this.f406190f = str4;
            this.f406191g = str5;
            this.f406192h = z13;
            this.f406193i = z14;
        }

        public static a a(a aVar, String str, boolean z12, int i12) {
            String str2 = aVar.f406185a;
            if ((i12 & 2) != 0) {
                str = aVar.f406186b;
            }
            String str3 = aVar.f406187c;
            Integer num = aVar.f406188d;
            boolean z13 = aVar.f406189e;
            String str4 = aVar.f406190f;
            String str5 = aVar.f406191g;
            boolean z14 = aVar.f406192h;
            aVar.getClass();
            return new a(str2, str, str3, num, z13, str4, str5, z14, z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f406185a.equals(aVar.f406185a) && L.f(this.f406186b, aVar.f406186b) && this.f406187c.equals(aVar.f406187c) && L.f(this.f406188d, aVar.f406188d) && this.f406189e == aVar.f406189e && L.f(this.f406190f, aVar.f406190f) && L.f(this.f406191g, aVar.f406191g) && this.f406192h == aVar.f406192h && this.f406193i == aVar.f406193i;
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f406185a.hashCode() * 31, 31, this.f406186b), 31, this.f406187c);
            Integer num = this.f406188d;
            int i12 = r.i((iD2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f406189e);
            String str = this.f406190f;
            int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f406191g;
            return Boolean.hashCode(this.f406193i) + r.i((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f406192h);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextInput(title=");
            sb2.append(this.f406185a);
            sb2.append(", value=");
            sb2.append(this.f406186b);
            sb2.append(", hint=");
            sb2.append(this.f406187c);
            sb2.append(", textLimit=");
            sb2.append(this.f406188d);
            sb2.append(", isMultiline=");
            sb2.append(this.f406189e);
            sb2.append(", errorInput=");
            sb2.append(this.f406190f);
            sb2.append(", errorMessage=");
            sb2.append(this.f406191g);
            sb2.append(", isRequired=");
            sb2.append(this.f406192h);
            sb2.append(", showRequiredError=");
            return r.x(sb2, this.f406193i, ')');
        }
    }

    public /* synthetic */ d(UniversalWidgetSectionModel.Block block, String str, String str2, UniversalWidgetImageUploader.a aVar, UniversalWidgetImageUploader.a aVar2, Boolean bool, String str3, a aVar3, a aVar4, a aVar5, int i12, C42822w c42822w) {
        this(block, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : aVar, (i12 & 16) != 0 ? null : aVar2, (i12 & 32) != 0 ? null : bool, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : aVar3, (i12 & 256) != 0 ? null : aVar4, (i12 & 512) == 0 ? aVar5 : null);
    }

    public static d a(d dVar, UniversalWidgetSectionModel.Block block, String str, String str2, UniversalWidgetImageUploader.a aVar, UniversalWidgetImageUploader.a aVar2, Boolean bool, String str3, a aVar3, a aVar4, a aVar5, int i12) {
        UniversalWidgetSectionModel.Block block2 = (i12 & 1) != 0 ? dVar.f406175b : block;
        String str4 = (i12 & 2) != 0 ? dVar.f406176c : str;
        String str5 = (i12 & 4) != 0 ? dVar.f406177d : str2;
        UniversalWidgetImageUploader.a aVar6 = (i12 & 8) != 0 ? dVar.f406178e : aVar;
        UniversalWidgetImageUploader.a aVar7 = (i12 & 16) != 0 ? dVar.f406179f : aVar2;
        Boolean bool2 = (i12 & 32) != 0 ? dVar.f406180g : bool;
        String str6 = (i12 & 64) != 0 ? dVar.f406181h : str3;
        a aVar8 = (i12 & 128) != 0 ? dVar.f406182i : aVar3;
        a aVar9 = (i12 & 256) != 0 ? dVar.f406183j : aVar4;
        a aVar10 = (i12 & 512) != 0 ? dVar.f406184k : aVar5;
        dVar.getClass();
        return new d(block2, str4, str5, aVar6, aVar7, bool2, str6, aVar8, aVar9, aVar10);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f406175b, dVar.f406175b) && L.f(this.f406176c, dVar.f406176c) && L.f(this.f406177d, dVar.f406177d) && L.f(this.f406178e, dVar.f406178e) && L.f(this.f406179f, dVar.f406179f) && L.f(this.f406180g, dVar.f406180g) && L.f(this.f406181h, dVar.f406181h) && L.f(this.f406182i, dVar.f406182i) && L.f(this.f406183j, dVar.f406183j) && L.f(this.f406184k, dVar.f406184k);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f406175b.hashCode() * 31, 31, this.f406176c);
        String str = this.f406177d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        UniversalWidgetImageUploader.a aVar = this.f406178e;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        UniversalWidgetImageUploader.a aVar2 = this.f406179f;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Boolean bool = this.f406180g;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f406181h;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar3 = this.f406182i;
        int iHashCode6 = (iHashCode5 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        a aVar4 = this.f406183j;
        int iHashCode7 = (iHashCode6 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        a aVar5 = this.f406184k;
        return iHashCode7 + (aVar5 != null ? aVar5.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "UniversalWidgetEditBlockState(block=" + this.f406175b + ", title=" + this.f406176c + ", imagesTitle=" + this.f406177d + ", firstImageUploaderState=" + this.f406178e + ", secondImageUploaderState=" + this.f406179f + ", colorInvertedSwitched=" + this.f406180g + ", colorInvertedText=" + this.f406181h + ", firstTextInput=" + this.f406182i + ", secondTextInput=" + this.f406183j + ", thirdTextInput=" + this.f406184k + ')';
    }

    public d(@k UniversalWidgetSectionModel.Block block, @k String str, @l String str2, @l UniversalWidgetImageUploader.a aVar, @l UniversalWidgetImageUploader.a aVar2, @l Boolean bool, @l String str3, @l a aVar3, @l a aVar4, @l a aVar5) {
        this.f406175b = block;
        this.f406176c = str;
        this.f406177d = str2;
        this.f406178e = aVar;
        this.f406179f = aVar2;
        this.f406180g = bool;
        this.f406181h = str3;
        this.f406182i = aVar3;
        this.f406183j = aVar4;
        this.f406184k = aVar5;
    }
}
