package com.avito.android.edit_seller_type.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EditSellerTypeState.kt */
@F3
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "Lcom/avito/android/edit_seller_type/mvi/entity/c$b;", "Lcom/avito/android/edit_seller_type/mvi/entity/c$c;", "Lcom/avito/android/edit_seller_type/mvi/entity/c$g;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class c extends q {

    /* compiled from: EditSellerTypeState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/c$a;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f146805a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f146806b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f146807c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f146808d;

        public a(@k String str, @k AttributedText attributedText, @k String str2, @k String str3) {
            this.f146805a = str;
            this.f146806b = attributedText;
            this.f146807c = str2;
            this.f146808d = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f146805a, aVar.f146805a) && L.f(this.f146806b, aVar.f146806b) && L.f(this.f146807c, aVar.f146807c) && L.f(this.f146808d, aVar.f146808d);
        }

        public final int hashCode() {
            return this.f146808d.hashCode() + H.d(com.avito.android.actions_sheet.a.b(this.f146805a.hashCode() * 31, 31, this.f146806b), 31, this.f146807c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ConfirmDialogState(title=");
            sb2.append(this.f146805a);
            sb2.append(", subtitle=");
            sb2.append(this.f146806b);
            sb2.append(", buttonTitle=");
            sb2.append(this.f146807c);
            sb2.append(", closeButtonTitle=");
            return C22026a.c(sb2, this.f146808d, ')');
        }
    }

    /* compiled from: EditSellerTypeState.kt */
    @F3
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/c$b;", "Lcom/avito/android/edit_seller_type/mvi/entity/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f146809b;

        public b(@k String str) {
            super(null);
            this.f146809b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f146809b, ((b) obj).f146809b);
        }

        public final int hashCode() {
            return this.f146809b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(message="), this.f146809b, ')');
        }
    }

    /* compiled from: EditSellerTypeState.kt */
    @F3
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/c$c;", "Lcom/avito/android/edit_seller_type/mvi/entity/c;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.edit_seller_type.mvi.entity.c$c, reason: collision with other inner class name */
    public static final /* data */ class C4273c extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C4273c f146810b = new C4273c();

        public C4273c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C4273c);
        }

        public final int hashCode() {
            return 541016989;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: EditSellerTypeState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/c$d;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f146811a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f146812b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedText f146813c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<e> f146814d;

        public d(int i12, @k String str, @l AttributedText attributedText, @k List<e> list) {
            this.f146811a = i12;
            this.f146812b = str;
            this.f146813c = attributedText;
            this.f146814d = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f146811a == dVar.f146811a && L.f(this.f146812b, dVar.f146812b) && L.f(this.f146813c, dVar.f146813c) && L.f(this.f146814d, dVar.f146814d);
        }

        public final int hashCode() {
            int iD2 = H.d(Integer.hashCode(this.f146811a) * 31, 31, this.f146812b);
            AttributedText attributedText = this.f146813c;
            return this.f146814d.hashCode() + ((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SellerTypeGroup(id=");
            sb2.append(this.f146811a);
            sb2.append(", title=");
            sb2.append(this.f146812b);
            sb2.append(", subtitle=");
            sb2.append(this.f146813c);
            sb2.append(", options=");
            return H.p(sb2, this.f146814d, ')');
        }
    }

    /* compiled from: EditSellerTypeState.kt */
    @F3
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/c$g;", "Lcom/avito/android/edit_seller_type/mvi/entity/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f146825b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f146826c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f146827d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final com.avito.android.edit_seller_type.mvi.entity.d f146828e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final f f146829f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f146830g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f146831h;

        public g(@k String str, @k AttributedText attributedText, @k String str2, @k com.avito.android.edit_seller_type.mvi.entity.d dVar, @l f fVar, boolean z12, boolean z13) {
            super(null);
            this.f146825b = str;
            this.f146826c = attributedText;
            this.f146827d = str2;
            this.f146828e = dVar;
            this.f146829f = fVar;
            this.f146830g = z12;
            this.f146831h = z13;
        }

        public static g a(g gVar, com.avito.android.edit_seller_type.mvi.entity.d dVar, boolean z12, int i12) {
            String str = gVar.f146825b;
            AttributedText attributedText = gVar.f146826c;
            String str2 = gVar.f146827d;
            if ((i12 & 8) != 0) {
                dVar = gVar.f146828e;
            }
            com.avito.android.edit_seller_type.mvi.entity.d dVar2 = dVar;
            f fVar = gVar.f146829f;
            if ((i12 & 32) != 0) {
                z12 = gVar.f146830g;
            }
            boolean z13 = z12;
            boolean z14 = (i12 & 64) != 0 ? gVar.f146831h : true;
            gVar.getClass();
            return new g(str, attributedText, str2, dVar2, fVar, z13, z14);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f146825b, gVar.f146825b) && L.f(this.f146826c, gVar.f146826c) && L.f(this.f146827d, gVar.f146827d) && L.f(this.f146828e, gVar.f146828e) && L.f(this.f146829f, gVar.f146829f) && this.f146830g == gVar.f146830g && this.f146831h == gVar.f146831h;
        }

        public final int hashCode() {
            int iHashCode = (this.f146828e.hashCode() + H.d(com.avito.android.actions_sheet.a.b(this.f146825b.hashCode() * 31, 31, this.f146826c), 31, this.f146827d)) * 31;
            f fVar = this.f146829f;
            return Boolean.hashCode(this.f146831h) + r.i((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.f146830g);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Success(title=");
            sb2.append(this.f146825b);
            sb2.append(", subtitle=");
            sb2.append(this.f146826c);
            sb2.append(", continueButtonText=");
            sb2.append(this.f146827d);
            sb2.append(", sellerTypesListState=");
            sb2.append(this.f146828e);
            sb2.append(", initialSelectedType=");
            sb2.append(this.f146829f);
            sb2.append(", continueEnabled=");
            sb2.append(this.f146830g);
            sb2.append(", isLoading=");
            return r.x(sb2, this.f146831h, ')');
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }

    /* compiled from: EditSellerTypeState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/c$f;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f146823a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f146824b;

        public f(int i12, @l Integer num) {
            this.f146823a = i12;
            this.f146824b = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f146823a == fVar.f146823a && L.f(this.f146824b, fVar.f146824b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f146823a) * 31;
            Integer num = this.f146824b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SellerTypePair(typeId=");
            sb2.append(this.f146823a);
            sb2.append(", subtypeId=");
            return s.j(sb2, this.f146824b, ')');
        }

        public /* synthetic */ f(int i12, Integer num, int i13, C42822w c42822w) {
            this(i12, (i13 & 2) != 0 ? null : num);
        }
    }

    /* compiled from: EditSellerTypeState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/c$e;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f146815a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f146816b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f146817c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f146818d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final f f146819e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f146820f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final a f146821g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final DeepLink f146822h;

        public e(@k String str, @k String str2, @l String str3, boolean z12, @k f fVar, boolean z13, @l a aVar, @l DeepLink deepLink) {
            this.f146815a = str;
            this.f146816b = str2;
            this.f146817c = str3;
            this.f146818d = z12;
            this.f146819e = fVar;
            this.f146820f = z13;
            this.f146821g = aVar;
            this.f146822h = deepLink;
        }

        public static e a(e eVar, boolean z12) {
            return new e(eVar.f146815a, eVar.f146816b, eVar.f146817c, z12, eVar.f146819e, eVar.f146820f, eVar.f146821g, eVar.f146822h);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f146815a, eVar.f146815a) && L.f(this.f146816b, eVar.f146816b) && L.f(this.f146817c, eVar.f146817c) && this.f146818d == eVar.f146818d && L.f(this.f146819e, eVar.f146819e) && this.f146820f == eVar.f146820f && L.f(this.f146821g, eVar.f146821g) && L.f(this.f146822h, eVar.f146822h);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f146815a.hashCode() * 31, 31, this.f146816b);
            String str = this.f146817c;
            int i12 = r.i((this.f146819e.hashCode() + r.i((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f146818d)) * 31, 31, this.f146820f);
            a aVar = this.f146821g;
            int iHashCode = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            DeepLink deepLink = this.f146822h;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SellerTypeOption(title=");
            sb2.append(this.f146815a);
            sb2.append(", subtitle=");
            sb2.append(this.f146816b);
            sb2.append(", badgeText=");
            sb2.append(this.f146817c);
            sb2.append(", isChecked=");
            sb2.append(this.f146818d);
            sb2.append(", type=");
            sb2.append(this.f146819e);
            sb2.append(", isEnabled=");
            sb2.append(this.f146820f);
            sb2.append(", confirmDialogState=");
            sb2.append(this.f146821g);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f146822h, ')');
        }

        public /* synthetic */ e(String str, String str2, String str3, boolean z12, f fVar, boolean z13, a aVar, DeepLink deepLink, int i12, C42822w c42822w) {
            this(str, str2, str3, (i12 & 8) != 0 ? false : z12, fVar, (i12 & 32) != 0 ? true : z13, aVar, deepLink);
        }
    }
}
