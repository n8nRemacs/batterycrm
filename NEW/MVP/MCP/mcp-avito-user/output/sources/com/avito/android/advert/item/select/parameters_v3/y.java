package com.avito.android.advert.item.select.parameters_v3;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectParametersV3ScreenState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/select/parameters_v3/y;", "", "a", "b", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AttributedText f79624a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AttributedText f79625b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<a> f79626c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final b f79627d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.select.number_input.f f79628e;

    /* compiled from: AutoSelectParametersV3ScreenState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/select/parameters_v3/y$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f79629a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f79630b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final AttributedText f79631c;

        public a(@Y61.l String str, @Y61.k String str2, @Y61.k AttributedText attributedText) {
            this.f79629a = str;
            this.f79630b = str2;
            this.f79631c = attributedText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f79629a, aVar.f79629a) && L.f(this.f79630b, aVar.f79630b) && L.f(this.f79631c, aVar.f79631c);
        }

        public final int hashCode() {
            String str = this.f79629a;
            return this.f79631c.hashCode() + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f79630b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Advantage(icon=");
            sb2.append(this.f79629a);
            sb2.append(", title=");
            sb2.append(this.f79630b);
            sb2.append(", description=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f79631c, ')');
        }
    }

    /* compiled from: AutoSelectParametersV3ScreenState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/select/parameters_v3/y$b;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f79632a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Image f79633b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final AttributedText f79634c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f79635d;

        public b(@Y61.k String str, @Y61.k AttributedText attributedText, @Y61.k Image image, @Y61.k String str2) {
            this.f79632a = str;
            this.f79633b = image;
            this.f79634c = attributedText;
            this.f79635d = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f79632a, bVar.f79632a) && L.f(this.f79633b, bVar.f79633b) && L.f(this.f79634c, bVar.f79634c) && L.f(this.f79635d, bVar.f79635d);
        }

        public final int hashCode() {
            return this.f79635d.hashCode() + com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.g(this.f79633b, this.f79632a.hashCode() * 31, 31), 31, this.f79634c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Badge(title=");
            sb2.append(this.f79632a);
            sb2.append(", image=");
            sb2.append(this.f79633b);
            sb2.append(", description=");
            sb2.append(this.f79634c);
            sb2.append(", color=");
            return C22026a.c(sb2, this.f79635d, ')');
        }
    }

    public y(@Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2, @Y61.k List<a> list, @Y61.l b bVar, @Y61.k com.avito.android.advert.item.select.number_input.f fVar) {
        this.f79624a = attributedText;
        this.f79625b = attributedText2;
        this.f79626c = list;
        this.f79627d = bVar;
        this.f79628e = fVar;
    }

    public static y a(y yVar, com.avito.android.advert.item.select.number_input.f fVar) {
        return new y(yVar.f79624a, yVar.f79625b, yVar.f79626c, yVar.f79627d, fVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return L.f(this.f79624a, yVar.f79624a) && L.f(this.f79625b, yVar.f79625b) && L.f(this.f79626c, yVar.f79626c) && L.f(this.f79627d, yVar.f79627d) && L.f(this.f79628e, yVar.f79628e);
    }

    public final int hashCode() {
        int iE2 = H.e(com.avito.android.actions_sheet.a.b(this.f79624a.hashCode() * 31, 31, this.f79625b), 31, this.f79626c);
        b bVar = this.f79627d;
        return this.f79628e.hashCode() + ((iE2 + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        return "AutoSelectParametersV3ScreenState(title=" + this.f79624a + ", description=" + this.f79625b + ", advantages=" + this.f79626c + ", badge=" + this.f79627d + ", inputState=" + this.f79628e + ')';
    }

    public /* synthetic */ y(AttributedText attributedText, AttributedText attributedText2, List list, b bVar, com.avito.android.advert.item.select.number_input.f fVar, int i12, C42822w c42822w) {
        this(attributedText, attributedText2, list, (i12 & 8) != 0 ? null : bVar, fVar);
    }
}
