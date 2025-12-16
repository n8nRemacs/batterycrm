package com.avito.android.category_parameters;

import android.net.Uri;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.items.ItemWithState;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.badge.SimpleBadge;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.AttributedDescription;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.category_parameters.DeliveryOnVideoUploadConfig;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.FileUploadButtonConfig;
import com.avito.android.remote.model.category_parameters.FileUploadParameterValue;
import com.avito.android.remote.model.category_parameters.GroupParameter;
import com.avito.android.remote.model.category_parameters.ImageAction;
import com.avito.android.remote.model.category_parameters.ImageBadgeGroup;
import com.avito.android.remote.model.category_parameters.ImageGroup;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.NavigationNode;
import com.avito.android.remote.model.category_parameters.OnboardingConfig;
import com.avito.android.remote.model.category_parameters.OnboardingV2;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.remote.model.category_parameters.TipIconParameters;
import com.avito.android.remote.model.category_parameters.TooltipOptions;
import com.avito.android.remote.model.category_parameters.slot.images_enhancement.ImagesEnhancementSlotConfig;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.suggest_institutes_bottom_sheet.SelectedSuggestInstitute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlin.sequences.C43033p;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: ParameterElement.kt */
@P
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:(\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()\u0082\u0001%*+,-./0123456789:;<=>?@ABCDEFGHIJKLMN¨\u0006O"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/conveyor_item/a;", "a", "b", "c", "d", "e", "f", "DisplayType", "g", "h", "i", "j", "k", "l", "m", "n", "o", "Header", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "SelectorCardsCarousel", "G", "H", "VariableLengthParameter", "I", "J", "Lcom/avito/android/category_parameters/ParameterElement$a;", "Lcom/avito/android/category_parameters/ParameterElement$b;", "Lcom/avito/android/category_parameters/ParameterElement$c;", "Lcom/avito/android/category_parameters/ParameterElement$d;", "Lcom/avito/android/category_parameters/ParameterElement$e;", "Lcom/avito/android/category_parameters/ParameterElement$g;", "Lcom/avito/android/category_parameters/ParameterElement$h;", "Lcom/avito/android/category_parameters/ParameterElement$i;", "Lcom/avito/android/category_parameters/ParameterElement$j;", "Lcom/avito/android/category_parameters/ParameterElement$k;", "Lcom/avito/android/category_parameters/ParameterElement$l;", "Lcom/avito/android/category_parameters/ParameterElement$n;", "Lcom/avito/android/category_parameters/ParameterElement$Header;", "Lcom/avito/android/category_parameters/ParameterElement$p;", "Lcom/avito/android/category_parameters/ParameterElement$q;", "Lcom/avito/android/category_parameters/ParameterElement$r;", "Lcom/avito/android/category_parameters/ParameterElement$s;", "Lcom/avito/android/category_parameters/ParameterElement$t;", "Lcom/avito/android/category_parameters/ParameterElement$u;", "Lcom/avito/android/category_parameters/ParameterElement$v;", "Lcom/avito/android/category_parameters/ParameterElement$w;", "Lcom/avito/android/category_parameters/ParameterElement$x;", "Lcom/avito/android/category_parameters/ParameterElement$y;", "Lcom/avito/android/category_parameters/ParameterElement$z;", "Lcom/avito/android/category_parameters/ParameterElement$A;", "Lcom/avito/android/category_parameters/ParameterElement$B;", "Lcom/avito/android/category_parameters/ParameterElement$C;", "Lcom/avito/android/category_parameters/ParameterElement$C$a;", "Lcom/avito/android/category_parameters/ParameterElement$D;", "Lcom/avito/android/category_parameters/ParameterElement$E;", "Lcom/avito/android/category_parameters/ParameterElement$F;", "Lcom/avito/android/category_parameters/ParameterElement$SelectorCardsCarousel;", "Lcom/avito/android/category_parameters/ParameterElement$G;", "Lcom/avito/android/category_parameters/ParameterElement$H;", "Lcom/avito/android/category_parameters/ParameterElement$VariableLengthParameter;", "Lcom/avito/android/category_parameters/ParameterElement$I;", "Lcom/avito/android/category_parameters/ParameterElement$J;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ParameterElement implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f117181b;

    /* renamed from: c, reason: collision with root package name */
    public final long f117182c;

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$A;", "Lcom/avito/android/category_parameters/ParameterElement;", "a", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class A extends ParameterElement {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117183d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public String f117184e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f117185f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final ArrayList f117186g;

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$A$a;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f117187a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f117188b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final SimpleBadge f117189c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final UniversalColor f117190d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final PublishMethodWithAllSelectedValueParameter.OptionDisplayDescription f117191e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f117192f;

            public a(@Y61.k String str, @Y61.k String str2, @Y61.l SimpleBadge simpleBadge, @Y61.l UniversalColor universalColor, @Y61.l PublishMethodWithAllSelectedValueParameter.OptionDisplayDescription optionDisplayDescription, boolean z12) {
                this.f117187a = str;
                this.f117188b = str2;
                this.f117189c = simpleBadge;
                this.f117190d = universalColor;
                this.f117191e = optionDisplayDescription;
                this.f117192f = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f117187a, aVar.f117187a) && L.f(this.f117188b, aVar.f117188b) && L.f(this.f117189c, aVar.f117189c) && L.f(this.f117190d, aVar.f117190d) && L.f(this.f117191e, aVar.f117191e) && this.f117192f == aVar.f117192f;
            }

            public final int hashCode() {
                int iD2 = androidx.compose.foundation.H.d(this.f117187a.hashCode() * 31, 31, this.f117188b);
                SimpleBadge simpleBadge = this.f117189c;
                int iHashCode = (iD2 + (simpleBadge == null ? 0 : simpleBadge.hashCode())) * 31;
                UniversalColor universalColor = this.f117190d;
                int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
                PublishMethodWithAllSelectedValueParameter.OptionDisplayDescription optionDisplayDescription = this.f117191e;
                return Boolean.hashCode(this.f117192f) + ((iHashCode2 + (optionDisplayDescription != null ? optionDisplayDescription.hashCode() : 0)) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Option(id=");
                sb2.append(this.f117187a);
                sb2.append(", title=");
                sb2.append(this.f117188b);
                sb2.append(", badge=");
                sb2.append(this.f117189c);
                sb2.append(", backgroundColor=");
                sb2.append(this.f117190d);
                sb2.append(", description=");
                sb2.append(this.f117191e);
                sb2.append(", selected=");
                return androidx.appcompat.app.r.x(sb2, this.f117192f, ')');
            }
        }

        public A(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.k ArrayList arrayList) {
            super(str, null);
            this.f117183d = str;
            this.f117184e = str2;
            this.f117185f = str3;
            this.f117186g = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof A)) {
                return false;
            }
            A a12 = (A) obj;
            return L.f(this.f117183d, a12.f117183d) && L.f(this.f117184e, a12.f117184e) && L.f(this.f117185f, a12.f117185f) && L.f(this.f117186g, a12.f117186g);
        }

        public final int hashCode() {
            int iHashCode = this.f117183d.hashCode() * 31;
            String str = this.f117184e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f117185f;
            return this.f117186g.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PublishMethodWithAllSelectedValueItem(itemId=");
            sb2.append(this.f117183d);
            sb2.append(", value=");
            sb2.append(this.f117184e);
            sb2.append(", allSelectedValue=");
            sb2.append(this.f117185f);
            sb2.append(", options=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f117186g, ')');
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$B;", "Lcom/avito/android/category_parameters/ParameterElement;", "LJO/k;", "Lcom/avito/android/category_parameters/l;", "Lcom/avito/android/items/ItemWithState;", "Lcom/avito/android/items/e;", "LJO/h;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class B extends ParameterElement implements JO.k, com.avito.android.category_parameters.l, ItemWithState, com.avito.android.items.e, JO.h {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117193d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f117194e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f117195f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final List<JO.m> f117196g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f117197h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f117198i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final v.a f117199j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f117200k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f117201l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117202m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public String f117203n;

        public /* synthetic */ B(String str, String str2, String str3, List list, String str4, boolean z12, v.a aVar, boolean z13, boolean z14, ItemWithState.State state, String str5, int i12, C42822w c42822w) {
            this(str, str2, str3, list, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? true : z12, (i12 & 64) != 0 ? null : aVar, (i12 & 128) != 0 ? false : z13, (i12 & 256) != 0 ? false : z14, state, str5);
        }

        @Override // JO.k
        /* renamed from: M, reason: from getter */
        public final boolean getF117609n() {
            return this.f117201l;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117202m = state;
        }

        @Override // JO.h
        public final boolean b(@Y61.k JO.h hVar) {
            return (hVar instanceof B) && equals(hVar);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof B)) {
                return false;
            }
            B b12 = (B) obj;
            return L.f(this.f117193d, b12.f117193d) && L.f(this.f117194e, b12.f117194e) && L.f(this.f117195f, b12.f117195f) && L.f(this.f117196g, b12.f117196g) && L.f(this.f117197h, b12.f117197h) && this.f117198i == b12.f117198i && L.f(this.f117199j, b12.f117199j) && this.f117200k == b12.f117200k && this.f117201l == b12.f117201l && L.f(this.f117202m, b12.f117202m) && L.f(this.f117203n, b12.f117203n);
        }

        @Override // com.avito.android.items.e
        @Y61.l
        /* renamed from: getError, reason: from getter */
        public final String getF238672c() {
            return this.f117203n;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117202m;
        }

        public final int hashCode() {
            int iD2 = androidx.compose.foundation.H.d(this.f117193d.hashCode() * 31, 31, this.f117194e);
            String str = this.f117195f;
            int iE2 = androidx.compose.foundation.H.e((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f117196g);
            String str2 = this.f117197h;
            int i12 = androidx.appcompat.app.r.i((iE2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f117198i);
            v.a aVar = this.f117199j;
            int iHashCode = (this.f117202m.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((i12 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f117200k), 31, this.f117201l)) * 31;
            String str3 = this.f117203n;
            return iHashCode + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // com.avito.android.items.e
        public final void o() {
            this.f117203n = null;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RegionRoute(itemId=");
            sb2.append(this.f117193d);
            sb2.append(", title=");
            sb2.append(this.f117194e);
            sb2.append(", value=");
            sb2.append(this.f117195f);
            sb2.append(", values=");
            sb2.append(this.f117196g);
            sb2.append(", placeholder=");
            sb2.append(this.f117197h);
            sb2.append(", isEnabled=");
            sb2.append(this.f117198i);
            sb2.append(", customPaddings=");
            sb2.append(this.f117199j);
            sb2.append(", hideTitle=");
            sb2.append(this.f117200k);
            sb2.append(", toFillIn=");
            sb2.append(this.f117201l);
            sb2.append(", state=");
            sb2.append(this.f117202m);
            sb2.append(", error=");
            return C22026a.c(sb2, this.f117203n, ')');
        }

        public B(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k List<JO.m> list, @Y61.l String str4, boolean z12, @Y61.l v.a aVar, boolean z13, boolean z14, @Y61.k ItemWithState.State state, @Y61.l String str5) {
            super(str, null);
            this.f117193d = str;
            this.f117194e = str2;
            this.f117195f = str3;
            this.f117196g = list;
            this.f117197h = str4;
            this.f117198i = z12;
            this.f117199j = aVar;
            this.f117200k = z13;
            this.f117201l = z14;
            this.f117202m = state;
            this.f117203n = str5;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$D;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/items/e;", "LJO/i;", "Lcom/avito/android/items/ItemWithState;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class D extends ParameterElement implements com.avito.android.items.e, JO.i, ItemWithState {

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final AttributedText f117243d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public String f117244e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117245f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public D(String str, String str2, String str3, AttributedText attributedText, String str4, boolean z12, boolean z13, String str5, ItemWithState.State state, DeepLink deepLink, int i12, C42822w c42822w) {
            super(str, null);
            CharSequence charSequence = null;
            Object[] objArr = 0;
            str4 = (i12 & 16) != 0 ? null : str4;
            state = (i12 & 256) != 0 ? new ItemWithState.State.Normal(charSequence, 1, objArr == true ? 1 : 0) : state;
            this.f117243d = attributedText;
            this.f117244e = str4;
            this.f117245f = state;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117245f = state;
        }

        @Override // com.avito.android.items.e
        @Y61.l
        /* renamed from: getError, reason: from getter */
        public final String getF238672c() {
            return this.f117244e;
        }

        @Override // JO.i
        @Y61.l
        /* renamed from: getMotivation, reason: from getter */
        public final AttributedText getF173922g() {
            return this.f117243d;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117245f;
        }

        @Override // com.avito.android.items.e
        public final void o() {
            this.f117244e = null;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0018\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0018\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123¨\u00064"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "", "<init>", "()V", "a", "b", "c", "d", "e", "Chips", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$a;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$b;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$c;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$d;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$e;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$Chips;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$f;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$g;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$h;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$i;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$j;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$k;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$l;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$m;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$n;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$o;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$p;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$q;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$r;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$s;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$t;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$u;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$v;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType$w;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class DisplayType {

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$Chips;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "Style", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Chips extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f117246a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Style f117247b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ParameterElement.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$Chips$Style;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Style {

                /* renamed from: b, reason: collision with root package name */
                public static final Style f117248b;

                /* renamed from: c, reason: collision with root package name */
                public static final Style f117249c;

                /* renamed from: d, reason: collision with root package name */
                public static final Style f117250d;

                /* renamed from: e, reason: collision with root package name */
                public static final Style f117251e;

                /* renamed from: f, reason: collision with root package name */
                public static final /* synthetic */ Style[] f117252f;

                /* renamed from: g, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f117253g;

                static {
                    Style style = new Style("SINGLE_LINE_FIXED", 0);
                    f117248b = style;
                    Style style2 = new Style("SINGLE_LINE_STRETCH", 1);
                    f117249c = style2;
                    Style style3 = new Style("SINGLE_LINE_SCROLLABLE", 2);
                    f117250d = style3;
                    Style style4 = new Style("MULTIPLE_LINES", 3);
                    f117251e = style4;
                    Style[] styleArr = {style, style2, style3, style4};
                    f117252f = styleArr;
                    f117253g = kotlin.enums.c.a(styleArr);
                }

                public Style() {
                    throw null;
                }

                public static Style valueOf(String str) {
                    return (Style) Enum.valueOf(Style.class, str);
                }

                public static Style[] values() {
                    return (Style[]) f117252f.clone();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Chips() {
                this(false, null, 3, 0 == true ? 1 : 0);
            }

            public Chips(boolean z12, @Y61.l Style style) {
                super(null);
                this.f117246a = z12;
                this.f117247b = style;
            }

            public /* synthetic */ Chips(boolean z12, Style style, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? null : style);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$a;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f117254a = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$b;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f117255a = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$c;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f117256a = new c();

            public c() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$d;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f117257a = new d();

            public d() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$e;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final e f117258a = new e();

            public e() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$f;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class f extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final f f117259a = new f();

            public f() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$g;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class g extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final g f117260a = new g();

            public g() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$h;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class h extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final h f117261a = new h();

            public h() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$i;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class i extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final i f117262a = new i();

            public i() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$j;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class j extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final j f117263a = new j();

            public j() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$k;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class k extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final k f117264a = new k();

            public k() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$l;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class l extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final l f117265a = new l();

            public l() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$m;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class m extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final m f117266a = new m();

            public m() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$n;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class n extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final n f117267a = new n();

            public n() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$o;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class o extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final o f117268a = new o();

            public o() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$p;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class p extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final p f117269a = new p();

            public p() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$q;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class q extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final q f117270a = new q();

            public q() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$r;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class r extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final r f117271a = new r();

            public r() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$s;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class s extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final s f117272a = new s();

            public s() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$t;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class t extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final t f117273a = new t();

            public t() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$u;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class u extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final u f117274a = new u();

            public u() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$v;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class v extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final v f117275a = new v();

            public v() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$DisplayType$w;", "Lcom/avito/android/category_parameters/ParameterElement$DisplayType;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class w extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final w f117276a = new w();

            public w() {
                super(null);
            }
        }

        public /* synthetic */ DisplayType(C42822w c42822w) {
            this();
        }

        public DisplayType() {
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$G;", "Lcom/avito/android/category_parameters/ParameterElement;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class G extends ParameterElement {
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$Header;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/category_parameters/ParameterElement$o;", "Type", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Header extends ParameterElement implements o {

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f117320d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$Header$Type;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f117321b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f117322c;

            static {
                Type[] typeArr = {new Type("H2", 0), new Type("H5", 1)};
                f117321b = typeArr;
                f117322c = kotlin.enums.c.a(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f117321b.clone();
            }
        }

        public Header(@Y61.k String str, @Y61.l String str2) {
            super(str, null);
            this.f117320d = str2;
        }

        @Override // com.avito.android.category_parameters.ParameterElement.o
        @Y61.l
        /* renamed from: getGroupId, reason: from getter */
        public final String getF173926k() {
            return this.f117320d;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$VariableLengthParameter;", "Lcom/avito/android/category_parameters/ParameterElement;", "a", "Companion", "b", "Lcom/avito/android/category_parameters/ParameterElement$VariableLengthParameter$a;", "Lcom/avito/android/category_parameters/ParameterElement$VariableLengthParameter$b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class VariableLengthParameter extends ParameterElement {

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$VariableLengthParameter$Companion;", "", "()V", "Type", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ParameterElement.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$VariableLengthParameter$Companion$Type;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Type {

                /* renamed from: b, reason: collision with root package name */
                public static final Type f117374b;

                /* renamed from: c, reason: collision with root package name */
                public static final Type f117375c;

                /* renamed from: d, reason: collision with root package name */
                public static final /* synthetic */ Type[] f117376d;

                /* renamed from: e, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f117377e;

                static {
                    Type type = new Type("CHILDREN", 0);
                    f117374b = type;
                    Type type2 = new Type("DISCOUNTS", 1);
                    f117375c = type2;
                    Type[] typeArr = {type, type2};
                    f117376d = typeArr;
                    f117377e = kotlin.enums.c.a(typeArr);
                }

                public Type() {
                    throw null;
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) f117376d.clone();
                }
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            public Companion() {
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$VariableLengthParameter$a;", "Lcom/avito/android/category_parameters/ParameterElement$VariableLengthParameter;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends VariableLengthParameter {

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f117378d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final String f117379e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.k
            public final Companion.Type f117380f;

            public a(@Y61.k String str, @Y61.l String str2, @Y61.k Companion.Type type) {
                super(str, type, null);
                this.f117378d = str;
                this.f117379e = str2;
                this.f117380f = type;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f117378d, aVar.f117378d) && L.f(this.f117379e, aVar.f117379e) && this.f117380f == aVar.f117380f;
            }

            public final int hashCode() {
                int iHashCode = this.f117378d.hashCode() * 31;
                String str = this.f117379e;
                return this.f117380f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                return "AddButton(itemId=" + this.f117378d + ", addButtonText=" + this.f117379e + ", type=" + this.f117380f + ')';
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$VariableLengthParameter$b;", "Lcom/avito/android/category_parameters/ParameterElement$VariableLengthParameter;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends VariableLengthParameter {

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f117381d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final String f117382e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.k
            public final Companion.Type f117383f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.l
            public final DeepLink f117384g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f117385h;

            public /* synthetic */ b(String str, String str2, Companion.Type type, DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
                this(str, str2, type, (i12 & 8) != 0 ? null : deepLink, (i12 & 16) != 0 ? false : z12);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f117381d, bVar.f117381d) && L.f(this.f117382e, bVar.f117382e) && this.f117383f == bVar.f117383f && L.f(this.f117384g, bVar.f117384g) && this.f117385h == bVar.f117385h;
            }

            @Y61.k
            /* renamed from: f, reason: from getter */
            public final Companion.Type getF117383f() {
                return this.f117383f;
            }

            public final int hashCode() {
                int iHashCode = (this.f117383f.hashCode() + androidx.compose.foundation.H.d(this.f117381d.hashCode() * 31, 31, this.f117382e)) * 31;
                DeepLink deepLink = this.f117384g;
                return Boolean.hashCode(this.f117385h) + ((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Header(itemId=");
                sb2.append(this.f117381d);
                sb2.append(", title=");
                sb2.append(this.f117382e);
                sb2.append(", type=");
                sb2.append(this.f117383f);
                sb2.append(", tooltipDeeplink=");
                sb2.append(this.f117384g);
                sb2.append(", isNew=");
                return androidx.appcompat.app.r.x(sb2, this.f117385h, ')');
            }

            public b(@Y61.k String str, @Y61.k String str2, @Y61.k Companion.Type type, @Y61.l DeepLink deepLink, boolean z12) {
                super(str, type, null);
                this.f117381d = str;
                this.f117382e = str2;
                this.f117383f = type;
                this.f117384g = deepLink;
                this.f117385h = z12;
            }
        }

        static {
            new Companion(null);
        }

        public VariableLengthParameter(String str, Companion.Type type, C42822w c42822w) {
            super(str, null);
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$a;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/items/e;", "Lcom/avito/android/items/ItemWithState;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.category_parameters.ParameterElement$a, reason: case insensitive filesystem */
    public static final class C29373a extends ParameterElement implements com.avito.android.items.e, ItemWithState {

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public String f117386d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117387e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29373a(String str, String str2, String str3, ItemWithState.State state, int i12, C42822w c42822w) {
            super(str, null);
            CharSequence charSequence = null;
            Object[] objArr = 0;
            str3 = (i12 & 4) != 0 ? null : str3;
            state = (i12 & 8) != 0 ? new ItemWithState.State.Normal(charSequence, 1, objArr == true ? 1 : 0) : state;
            this.f117386d = str3;
            this.f117387e = state;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117387e = state;
        }

        @Override // com.avito.android.items.e
        @Y61.l
        /* renamed from: getError, reason: from getter */
        public final String getF238672c() {
            return this.f117386d;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117387e;
        }

        @Override // com.avito.android.items.e
        public final void o() {
            this.f117386d = null;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$b;", "Lcom/avito/android/category_parameters/ParameterElement;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.category_parameters.ParameterElement$b, reason: case insensitive filesystem */
    public static final /* data */ class C29374b extends ParameterElement {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117388d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f117389e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final AttributedText f117390f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final List<ParameterElement> f117391g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final List<NavigationNode> f117392h;

        public C29374b() {
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29374b(String str, String str2, AttributedText attributedText, List list, List list2, int i12, C42822w c42822w) {
            super(str, null);
            attributedText = (i12 & 4) != 0 ? null : attributedText;
            list2 = (i12 & 16) != 0 ? null : list2;
            this.f117388d = str;
            this.f117389e = str2;
            this.f117390f = attributedText;
            this.f117391g = list;
            this.f117392h = list2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29374b)) {
                return false;
            }
            C29374b c29374b = (C29374b) obj;
            return L.f(this.f117388d, c29374b.f117388d) && L.f(this.f117389e, c29374b.f117389e) && L.f(this.f117390f, c29374b.f117390f) && L.f(this.f117391g, c29374b.f117391g) && L.f(this.f117392h, c29374b.f117392h);
        }

        public final int hashCode() {
            int iD2 = androidx.compose.foundation.H.d(this.f117388d.hashCode() * 31, 31, this.f117389e);
            AttributedText attributedText = this.f117390f;
            int iE2 = androidx.compose.foundation.H.e((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f117391g);
            List<NavigationNode> list = this.f117392h;
            return iE2 + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CategoryGroup(itemId=");
            sb2.append(this.f117388d);
            sb2.append(", title=");
            sb2.append(this.f117389e);
            sb2.append(", subtitle=");
            sb2.append(this.f117390f);
            sb2.append(", elements=");
            sb2.append(this.f117391g);
            sb2.append(", backNavigation=");
            return androidx.compose.foundation.H.p(sb2, this.f117392h, ')');
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$c;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/category_parameters/ParameterElement$o;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.category_parameters.ParameterElement$c, reason: case insensitive filesystem */
    public static final /* data */ class C29375c extends ParameterElement implements o {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117393d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f117394e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f117395f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final C.b f117396g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final C.b f117397h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final p f117398i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final String f117399j;

        public C29375c(@Y61.k String str, @Y61.l String str2, boolean z12, @Y61.k C.b bVar, @Y61.k C.b bVar2, @Y61.k p pVar, @Y61.l String str3) {
            super(str, null);
            this.f117393d = str;
            this.f117394e = str2;
            this.f117395f = z12;
            this.f117396g = bVar;
            this.f117397h = bVar2;
            this.f117398i = pVar;
            this.f117399j = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29375c)) {
                return false;
            }
            C29375c c29375c = (C29375c) obj;
            return L.f(this.f117393d, c29375c.f117393d) && L.f(this.f117394e, c29375c.f117394e) && this.f117395f == c29375c.f117395f && L.f(this.f117396g, c29375c.f117396g) && L.f(this.f117397h, c29375c.f117397h) && L.f(this.f117398i, c29375c.f117398i) && L.f(this.f117399j, c29375c.f117399j);
        }

        @Override // com.avito.android.category_parameters.ParameterElement.o
        @Y61.l
        /* renamed from: getGroupId, reason: from getter */
        public final String getF173926k() {
            return this.f117399j;
        }

        public final int hashCode() {
            int iHashCode = this.f117393d.hashCode() * 31;
            String str = this.f117394e;
            int iHashCode2 = (this.f117398i.hashCode() + ((this.f117397h.hashCode() + ((this.f117396g.hashCode() + androidx.appcompat.app.r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f117395f)) * 31)) * 31)) * 31;
            String str2 = this.f117399j;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChildrenAgeSelect(itemId=");
            sb2.append(this.f117393d);
            sb2.append(", title=");
            sb2.append(this.f117394e);
            sb2.append(", canBeDeleted=");
            sb2.append(this.f117395f);
            sb2.append(", fromAgeSelectItem=");
            sb2.append(this.f117396g);
            sb2.append(", toAgeSelectItem=");
            sb2.append(this.f117397h);
            sb2.append(", priceInputItem=");
            sb2.append(this.f117398i);
            sb2.append(", groupId=");
            return C22026a.c(sb2, this.f117399j, ')');
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$f;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.category_parameters.ParameterElement$f, reason: case insensitive filesystem */
    public static final class C29378f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Integer f117421a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f117422b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Integer f117423c;

        public C29378f(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3) {
            this.f117421a = num;
            this.f117422b = num2;
            this.f117423c = num3;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$g;", "Lcom/avito/android/category_parameters/ParameterElement;", "LJO/k;", "Lcom/avito/android/category_parameters/l;", "Lcom/avito/android/items/ItemWithState;", "Lcom/avito/android/items/e;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.category_parameters.ParameterElement$g, reason: case insensitive filesystem */
    public static final class C29379g extends ParameterElement implements JO.k, com.avito.android.category_parameters.l, ItemWithState, com.avito.android.items.e {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117424d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f117425e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final List<JO.m> f117426f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f117427g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f117428h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final CustomPaddings f117429i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f117430j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f117431k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117432l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public String f117433m;

        public /* synthetic */ C29379g(String str, String str2, String str3, List list, String str4, boolean z12, CustomPaddings customPaddings, boolean z13, boolean z14, ItemWithState.State state, String str5, int i12, C42822w c42822w) {
            this(str, str2, str3, list, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? true : z12, (i12 & 64) != 0 ? null : customPaddings, (i12 & 128) != 0 ? false : z13, (i12 & 256) != 0 ? false : z14, state, str5);
        }

        @Override // JO.k
        /* renamed from: M, reason: from getter */
        public final boolean getF117609n() {
            return this.f117431k;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117432l = state;
        }

        @Override // com.avito.android.items.e
        @Y61.l
        /* renamed from: getError, reason: from getter */
        public final String getF238672c() {
            return this.f117433m;
        }

        @Override // com.avito.android.category_parameters.l
        /* renamed from: getHideTitle */
        public final boolean getF117494s() {
            throw null;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117432l;
        }

        @Override // com.avito.android.items.e
        public final void o() {
            this.f117433m = null;
        }

        public C29379g(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k List<JO.m> list, @Y61.l String str4, boolean z12, @Y61.l CustomPaddings customPaddings, boolean z13, boolean z14, @Y61.k ItemWithState.State state, @Y61.l String str5) {
            super(str, null);
            this.f117424d = str2;
            this.f117425e = str3;
            this.f117426f = list;
            this.f117427g = str4;
            this.f117428h = z12;
            this.f117429i = customPaddings;
            this.f117430j = z13;
            this.f117431k = z14;
            this.f117432l = state;
            this.f117433m = str5;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$h;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/category_parameters/ParameterElement$o;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.category_parameters.ParameterElement$h, reason: case insensitive filesystem */
    public static final /* data */ class C29380h extends ParameterElement implements o {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117434d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f117435e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final p f117436f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final p f117437g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f117438h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29380h(String str, String str2, p pVar, p pVar2, String str3, int i12, C42822w c42822w) {
            super(str, null);
            str3 = (i12 & 16) != 0 ? null : str3;
            this.f117434d = str;
            this.f117435e = str2;
            this.f117436f = pVar;
            this.f117437g = pVar2;
            this.f117438h = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29380h)) {
                return false;
            }
            C29380h c29380h = (C29380h) obj;
            return L.f(this.f117434d, c29380h.f117434d) && L.f(this.f117435e, c29380h.f117435e) && L.f(this.f117436f, c29380h.f117436f) && L.f(this.f117437g, c29380h.f117437g) && L.f(this.f117438h, c29380h.f117438h);
        }

        @Override // com.avito.android.category_parameters.ParameterElement.o
        @Y61.l
        /* renamed from: getGroupId, reason: from getter */
        public final String getF173926k() {
            return this.f117438h;
        }

        public final int hashCode() {
            int iHashCode = this.f117434d.hashCode() * 31;
            String str = this.f117435e;
            int iHashCode2 = (this.f117437g.hashCode() + ((this.f117436f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
            String str2 = this.f117438h;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DoubleInput(itemId=");
            sb2.append(this.f117434d);
            sb2.append(", title=");
            sb2.append(this.f117435e);
            sb2.append(", inputFirst=");
            sb2.append(this.f117436f);
            sb2.append(", inputSecond=");
            sb2.append(this.f117437g);
            sb2.append(", groupId=");
            return C22026a.c(sb2, this.f117438h, ')');
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$i;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/category_parameters/ParameterElement$o;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.category_parameters.ParameterElement$i, reason: case insensitive filesystem */
    public static final /* data */ class C29381i extends ParameterElement implements o {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117439d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final p f117440e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final p f117441f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f117442g;

        public C29381i(@Y61.k String str, @Y61.k p pVar, @Y61.k p pVar2, @Y61.l String str2) {
            super(str, null);
            this.f117439d = str;
            this.f117440e = pVar;
            this.f117441f = pVar2;
            this.f117442g = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29381i)) {
                return false;
            }
            C29381i c29381i = (C29381i) obj;
            return L.f(this.f117439d, c29381i.f117439d) && L.f(this.f117440e, c29381i.f117440e) && L.f(this.f117441f, c29381i.f117441f) && L.f(this.f117442g, c29381i.f117442g);
        }

        @Override // com.avito.android.category_parameters.ParameterElement.o
        @Y61.l
        /* renamed from: getGroupId, reason: from getter */
        public final String getF173926k() {
            return this.f117442g;
        }

        public final int hashCode() {
            int iHashCode = (this.f117441f.hashCode() + ((this.f117440e.hashCode() + (this.f117439d.hashCode() * 31)) * 31)) * 31;
            String str = this.f117442g;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DurationDiscountSelect(itemId=");
            sb2.append(this.f117439d);
            sb2.append(", daysInput=");
            sb2.append(this.f117440e);
            sb2.append(", percentInput=");
            sb2.append(this.f117441f);
            sb2.append(", groupId=");
            return C22026a.c(sb2, this.f117442g, ')');
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$j;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/category_parameters/ParameterElement$o;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.category_parameters.ParameterElement$j, reason: case insensitive filesystem */
    public static final /* data */ class C29382j extends ParameterElement implements o {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117443d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f117444e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f117445f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final p f117446g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final p f117447h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f117448i;

        public C29382j(@Y61.k String str, @Y61.l String str2, boolean z12, @Y61.k p pVar, @Y61.k p pVar2, @Y61.l String str3) {
            super(str, null);
            this.f117443d = str;
            this.f117444e = str2;
            this.f117445f = z12;
            this.f117446g = pVar;
            this.f117447h = pVar2;
            this.f117448i = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29382j)) {
                return false;
            }
            C29382j c29382j = (C29382j) obj;
            return L.f(this.f117443d, c29382j.f117443d) && L.f(this.f117444e, c29382j.f117444e) && this.f117445f == c29382j.f117445f && L.f(this.f117446g, c29382j.f117446g) && L.f(this.f117447h, c29382j.f117447h) && L.f(this.f117448i, c29382j.f117448i);
        }

        @Override // com.avito.android.category_parameters.ParameterElement.o
        @Y61.l
        /* renamed from: getGroupId, reason: from getter */
        public final String getF173926k() {
            return this.f117448i;
        }

        public final int hashCode() {
            int iHashCode = this.f117443d.hashCode() * 31;
            String str = this.f117444e;
            int iHashCode2 = (this.f117447h.hashCode() + ((this.f117446g.hashCode() + androidx.appcompat.app.r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f117445f)) * 31)) * 31;
            String str2 = this.f117448i;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("EarlyBookingDiscountSelect(itemId=");
            sb2.append(this.f117443d);
            sb2.append(", title=");
            sb2.append(this.f117444e);
            sb2.append(", isChecked=");
            sb2.append(this.f117445f);
            sb2.append(", daysInput=");
            sb2.append(this.f117446g);
            sb2.append(", percentInput=");
            sb2.append(this.f117447h);
            sb2.append(", groupId=");
            return C22026a.c(sb2, this.f117448i, ')');
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$k;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/items/e;", "Lcom/avito/android/items/ItemWithState;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k extends ParameterElement implements com.avito.android.items.e, ItemWithState {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117449d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f117450e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public String f117451f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117452g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f117453h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(String str, String str2, String str3, String str4, ItemWithState.State state, boolean z12, int i12, C42822w c42822w) {
            super(str, null);
            CharSequence charSequence = null;
            Object[] objArr = 0;
            str4 = (i12 & 8) != 0 ? null : str4;
            state = (i12 & 16) != 0 ? new ItemWithState.State.Normal(charSequence, 1, objArr == true ? 1 : 0) : state;
            z12 = (i12 & 32) != 0 ? true : z12;
            this.f117449d = str2;
            this.f117450e = str3;
            this.f117451f = str4;
            this.f117452g = state;
            this.f117453h = z12;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117452g = state;
        }

        @Override // com.avito.android.items.e
        @Y61.l
        /* renamed from: getError, reason: from getter */
        public final String getF238672c() {
            return this.f117451f;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117452g;
        }

        @Override // com.avito.android.items.e
        public final void o() {
            this.f117451f = null;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$l;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/items/e;", "Lcom/avito/android/items/ItemWithState;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l extends ParameterElement implements com.avito.android.items.e, ItemWithState {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117454d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public String f117455e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f117456f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final List<String> f117457g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final List<FileUploadParameterValue> f117458h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final FileUploadButtonConfig f117459i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final AttributedText f117460j;

        /* renamed from: k, reason: collision with root package name */
        public final int f117461k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f117462l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public final String f117463m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final String f117464n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public final String f117465o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.l
        public final String f117466p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.l
        public final String f117467q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f117468r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f117469s;

        public l(@Y61.k ItemWithState.State state, @Y61.l String str, @Y61.k String str2, @Y61.l List<String> list, @Y61.l List<FileUploadParameterValue> list2, @Y61.l FileUploadButtonConfig fileUploadButtonConfig, @Y61.l AttributedText attributedText, int i12, boolean z12, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, boolean z13, boolean z14) {
            super(str2, null);
            this.f117454d = state;
            this.f117455e = str;
            this.f117456f = str2;
            this.f117457g = list;
            this.f117458h = list2;
            this.f117459i = fileUploadButtonConfig;
            this.f117460j = attributedText;
            this.f117461k = i12;
            this.f117462l = z12;
            this.f117463m = str3;
            this.f117464n = str4;
            this.f117465o = str5;
            this.f117466p = str6;
            this.f117467q = str7;
            this.f117468r = z13;
            this.f117469s = z14;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117454d = state;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f117454d, lVar.f117454d) && L.f(this.f117455e, lVar.f117455e) && L.f(this.f117456f, lVar.f117456f) && L.f(this.f117457g, lVar.f117457g) && L.f(this.f117458h, lVar.f117458h) && L.f(this.f117459i, lVar.f117459i) && L.f(this.f117460j, lVar.f117460j) && this.f117461k == lVar.f117461k && this.f117462l == lVar.f117462l && L.f(this.f117463m, lVar.f117463m) && L.f(this.f117464n, lVar.f117464n) && L.f(this.f117465o, lVar.f117465o) && L.f(this.f117466p, lVar.f117466p) && L.f(this.f117467q, lVar.f117467q) && this.f117468r == lVar.f117468r && this.f117469s == lVar.f117469s;
        }

        @Override // com.avito.android.items.e
        @Y61.l
        /* renamed from: getError, reason: from getter */
        public final String getF238672c() {
            return this.f117455e;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117454d;
        }

        public final int hashCode() {
            int iHashCode = this.f117454d.hashCode() * 31;
            String str = this.f117455e;
            int iD2 = androidx.compose.foundation.H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f117456f);
            List<String> list = this.f117457g;
            int iHashCode2 = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
            List<FileUploadParameterValue> list2 = this.f117458h;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            FileUploadButtonConfig fileUploadButtonConfig = this.f117459i;
            int iHashCode4 = (iHashCode3 + (fileUploadButtonConfig == null ? 0 : fileUploadButtonConfig.hashCode())) * 31;
            AttributedText attributedText = this.f117460j;
            int iD3 = androidx.compose.foundation.H.d(androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.f117461k, (iHashCode4 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31), 31, this.f117462l), 31, this.f117463m);
            String str2 = this.f117464n;
            int iHashCode5 = (iD3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f117465o;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f117466p;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f117467q;
            return Boolean.hashCode(this.f117469s) + androidx.appcompat.app.r.i((iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.f117468r);
        }

        @Override // com.avito.android.items.e
        public final void o() {
            this.f117455e = null;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FileUpload(state=");
            sb2.append(this.f117454d);
            sb2.append(", error=");
            sb2.append(this.f117455e);
            sb2.append(", itemId=");
            sb2.append(this.f117456f);
            sb2.append(", types=");
            sb2.append(this.f117457g);
            sb2.append(", items=");
            sb2.append(this.f117458h);
            sb2.append(", buttonConfig=");
            sb2.append(this.f117459i);
            sb2.append(", description=");
            sb2.append(this.f117460j);
            sb2.append(", minimumFilesCount=");
            sb2.append(this.f117461k);
            sb2.append(", isMultiUploadEnabled=");
            sb2.append(this.f117462l);
            sb2.append(", requiredErrorMessage=");
            sb2.append(this.f117463m);
            sb2.append(", title=");
            sb2.append(this.f117464n);
            sb2.append(", titleFileUploaded=");
            sb2.append(this.f117465o);
            sb2.append(", actionTitle=");
            sb2.append(this.f117466p);
            sb2.append(", actionDescription=");
            sb2.append(this.f117467q);
            sb2.append(", isRedesign=");
            sb2.append(this.f117468r);
            sb2.append(", isDduFileUploader=");
            return androidx.appcompat.app.r.x(sb2, this.f117469s, ')');
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$m;", "", "<init>", "()V", "a", "Lcom/avito/android/category_parameters/ParameterElement$m$a;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class m {

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$m$a;", "Lcom/avito/android/category_parameters/ParameterElement$m;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends m {
            public a() {
                super(null);
            }
        }

        public /* synthetic */ m(C42822w c42822w) {
            this();
        }

        public m() {
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$n;", "Lcom/avito/android/category_parameters/ParameterElement;", "a", "b", "Lcom/avito/android/category_parameters/ParameterElement$n$a;", "Lcom/avito/android/category_parameters/ParameterElement$n$b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class n extends ParameterElement {

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$n$a;", "Lcom/avito/android/category_parameters/ParameterElement$n;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends n {
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$n$b;", "Lcom/avito/android/category_parameters/ParameterElement$n;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends n {

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f117470d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final AttributedText f117471e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.l
            public final Boolean f117472f;

            public b(@Y61.k String str, @Y61.k String str2, @Y61.l AttributedText attributedText, @Y61.l Boolean bool) {
                super(str, null);
                this.f117470d = str2;
                this.f117471e = attributedText;
                this.f117472f = bool;
            }
        }

        public n(String str, C42822w c42822w) {
            super(str, null);
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$o;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface o {
        @Y61.l
        /* renamed from: getGroupId */
        String getF173926k();
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$q;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/items/ItemWithState;", "Lcom/avito/android/items/e;", "LJO/k;", "a", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q extends ParameterElement implements ItemWithState, com.avito.android.items.e, JO.k {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117502d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public String f117503e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f117504f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f117505g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Boolean f117506h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f117507i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final String f117508j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final String f117509k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final AttributedText f117510l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final String f117511m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final String f117512n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public final Integer f117513o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.l
        public final Integer f117514p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.l
        public final String f117515q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.l
        public final AttributedText f117516r;

        /* renamed from: s, reason: collision with root package name */
        @Y61.l
        public final String f117517s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.k
        public final String f117518t;

        /* renamed from: u, reason: collision with root package name */
        @Y61.l
        public final List<a> f117519u;

        /* renamed from: v, reason: collision with root package name */
        @Y61.k
        public final JobMultiGeoLink.FlowType f117520v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f117521w;

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$q$a;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final int f117522a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Integer f117523b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f117524c;

            /* renamed from: d, reason: collision with root package name */
            public final double f117525d;

            /* renamed from: e, reason: collision with root package name */
            public final double f117526e;

            public a(@Y61.k String str, int i12, @Y61.l Integer num, double d12, double d13) {
                this.f117522a = i12;
                this.f117523b = num;
                this.f117524c = str;
                this.f117525d = d12;
                this.f117526e = d13;
            }
        }

        public /* synthetic */ q(ItemWithState.State state, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, AttributedText attributedText, String str7, String str8, Integer num, Integer num2, String str9, AttributedText attributedText2, String str10, String str11, List list, JobMultiGeoLink.FlowType flowType, boolean z12, int i12, C42822w c42822w) {
            this(state, str, str2, str3, bool, str4, str5, str6, attributedText, str7, str8, num, num2, str9, attributedText2, str10, str11, list, flowType, (i12 & 524288) != 0 ? false : z12);
        }

        @Override // JO.k
        /* renamed from: M, reason: from getter */
        public final boolean getF117609n() {
            return this.f117521w;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117502d = state;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return L.f(this.f117502d, qVar.f117502d) && L.f(this.f117503e, qVar.f117503e) && L.f(this.f117504f, qVar.f117504f) && L.f(this.f117505g, qVar.f117505g) && L.f(this.f117506h, qVar.f117506h) && L.f(this.f117507i, qVar.f117507i) && L.f(this.f117508j, qVar.f117508j) && L.f(this.f117509k, qVar.f117509k) && L.f(this.f117510l, qVar.f117510l) && L.f(this.f117511m, qVar.f117511m) && L.f(this.f117512n, qVar.f117512n) && L.f(this.f117513o, qVar.f117513o) && L.f(this.f117514p, qVar.f117514p) && L.f(this.f117515q, qVar.f117515q) && L.f(this.f117516r, qVar.f117516r) && L.f(this.f117517s, qVar.f117517s) && L.f(this.f117518t, qVar.f117518t) && L.f(this.f117519u, qVar.f117519u) && this.f117520v == qVar.f117520v && this.f117521w == qVar.f117521w;
        }

        @Override // com.avito.android.items.e
        @Y61.l
        /* renamed from: getError, reason: from getter */
        public final String getF238672c() {
            return this.f117503e;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117502d;
        }

        public final int hashCode() {
            int iHashCode = this.f117502d.hashCode() * 31;
            String str = this.f117503e;
            int iD2 = androidx.compose.foundation.H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f117504f);
            String str2 = this.f117505g;
            int iHashCode2 = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.f117506h;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.f117507i;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f117508j;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f117509k;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            AttributedText attributedText = this.f117510l;
            int iHashCode7 = (iHashCode6 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            String str6 = this.f117511m;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f117512n;
            int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Integer num = this.f117513o;
            int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f117514p;
            int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str8 = this.f117515q;
            int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
            AttributedText attributedText2 = this.f117516r;
            int iHashCode13 = (iHashCode12 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
            String str9 = this.f117517s;
            int iD3 = androidx.compose.foundation.H.d((iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.f117518t);
            List<a> list = this.f117519u;
            return Boolean.hashCode(this.f117521w) + ((this.f117520v.hashCode() + ((iD3 + (list != null ? list.hashCode() : 0)) * 31)) * 31);
        }

        @Override // com.avito.android.items.e
        public final void o() {
            this.f117503e = null;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("JobMultiGeoItem(state=");
            sb2.append(this.f117502d);
            sb2.append(", error=");
            sb2.append(this.f117503e);
            sb2.append(", itemId=");
            sb2.append(this.f117504f);
            sb2.append(", title=");
            sb2.append(this.f117505g);
            sb2.append(", hideTitle=");
            sb2.append(this.f117506h);
            sb2.append(", subtitle=");
            sb2.append(this.f117507i);
            sb2.append(", listTitle=");
            sb2.append(this.f117508j);
            sb2.append(", notificationBadgeTitle=");
            sb2.append(this.f117509k);
            sb2.append(", description=");
            sb2.append(this.f117510l);
            sb2.append(", buttonTitle=");
            sb2.append(this.f117511m);
            sb2.append(", showAllTitle=");
            sb2.append(this.f117512n);
            sb2.append(", widgetLimit=");
            sb2.append(this.f117513o);
            sb2.append(", maxLimit=");
            sb2.append(this.f117514p);
            sb2.append(", showAsMultiAddressRegexp=");
            sb2.append(this.f117515q);
            sb2.append(", warning=");
            sb2.append(this.f117516r);
            sb2.append(", errorText=");
            sb2.append(this.f117517s);
            sb2.append(", jwt=");
            sb2.append(this.f117518t);
            sb2.append(", addressList=");
            sb2.append(this.f117519u);
            sb2.append(", flowType=");
            sb2.append(this.f117520v);
            sb2.append(", toFillIn=");
            return androidx.appcompat.app.r.x(sb2, this.f117521w, ')');
        }

        public q(@Y61.k ItemWithState.State state, @Y61.l String str, @Y61.k String str2, @Y61.l String str3, @Y61.l Boolean bool, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l AttributedText attributedText, @Y61.l String str7, @Y61.l String str8, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l String str9, @Y61.l AttributedText attributedText2, @Y61.l String str10, @Y61.k String str11, @Y61.l List<a> list, @Y61.k JobMultiGeoLink.FlowType flowType, boolean z12) {
            super(str2, null);
            this.f117502d = state;
            this.f117503e = str;
            this.f117504f = str2;
            this.f117505g = str3;
            this.f117506h = bool;
            this.f117507i = str4;
            this.f117508j = str5;
            this.f117509k = str6;
            this.f117510l = attributedText;
            this.f117511m = str7;
            this.f117512n = str8;
            this.f117513o = num;
            this.f117514p = num2;
            this.f117515q = str9;
            this.f117516r = attributedText2;
            this.f117517s = str10;
            this.f117518t = str11;
            this.f117519u = list;
            this.f117520v = flowType;
            this.f117521w = z12;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$r;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/items/ItemWithState;", "LJO/h;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r extends ParameterElement implements ItemWithState, JO.h {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117527d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f117528e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f117529f;

        /* renamed from: g, reason: collision with root package name */
        public final long f117530g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117531h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final SelectedSuggestInstitute f117532i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(String str, String str2, String str3, long j12, ItemWithState.State state, SelectedSuggestInstitute selectedSuggestInstitute, int i12, C42822w c42822w) {
            super(str, null);
            state = (i12 & 16) != 0 ? new ItemWithState.State.Normal(null, 1, 0 == true ? 1 : 0) : state;
            this.f117527d = str;
            this.f117528e = str2;
            this.f117529f = str3;
            this.f117530g = j12;
            this.f117531h = state;
            this.f117532i = selectedSuggestInstitute;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117531h = state;
        }

        @Override // JO.h
        public final boolean b(@Y61.k JO.h hVar) {
            if (hVar != this) {
                if (hVar instanceof r) {
                    r rVar = (r) hVar;
                    if (!L.f(rVar.f117528e, this.f117528e) || !L.f(rVar.f117529f, this.f117529f) || !L.f(rVar.f117531h, this.f117531h) || !L.f(rVar.f117532i, this.f117532i)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return L.f(this.f117527d, rVar.f117527d) && L.f(this.f117528e, rVar.f117528e) && L.f(this.f117529f, rVar.f117529f) && this.f117530g == rVar.f117530g && L.f(this.f117531h, rVar.f117531h) && L.f(this.f117532i, rVar.f117532i);
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117531h;
        }

        public final int hashCode() {
            return this.f117532i.hashCode() + ((this.f117531h.hashCode() + androidx.appcompat.app.r.g(androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.f117527d.hashCode() * 31, 31, this.f117528e), 31, this.f117529f), 31, this.f117530g)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "JobSuggestItem(itemId=" + this.f117527d + ", title=" + this.f117528e + ", hint=" + this.f117529f + ", limit=" + this.f117530g + ", state=" + this.f117531h + ", selectedSuggestInstitute=" + this.f117532i + ')';
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$s;", "Lcom/avito/android/category_parameters/ParameterElement;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s extends ParameterElement {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            ((s) obj).getClass();
            return L.f(null, null) && L.f(null, null) && L.f(null, null) && L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LocationGroup(itemId=");
            sb2.append((String) null);
            sb2.append(", title=");
            sb2.append((String) null);
            sb2.append(", richTitle=");
            sb2.append((Object) null);
            sb2.append(", parameters=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, null, ')');
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$t;", "Lcom/avito/android/category_parameters/ParameterElement;", "LJO/k;", "Lcom/avito/android/category_parameters/l;", "Lcom/avito/android/items/ItemWithState;", "Lcom/avito/android/items/e;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class t extends ParameterElement implements JO.k, com.avito.android.category_parameters.l, ItemWithState, com.avito.android.items.e {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117533d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f117534e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final List<JO.m> f117535f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f117536g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f117537h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final CustomPaddings f117538i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f117539j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f117540k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117541l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public String f117542m;

        public /* synthetic */ t(String str, String str2, String str3, List list, String str4, boolean z12, CustomPaddings customPaddings, boolean z13, boolean z14, ItemWithState.State state, String str5, int i12, C42822w c42822w) {
            this(str, str2, str3, list, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? true : z12, (i12 & 64) != 0 ? null : customPaddings, (i12 & 128) != 0 ? false : z13, (i12 & 256) != 0 ? false : z14, state, str5);
        }

        @Override // JO.k
        /* renamed from: M, reason: from getter */
        public final boolean getF117609n() {
            return this.f117540k;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117541l = state;
        }

        @Override // com.avito.android.items.e
        @Y61.l
        /* renamed from: getError, reason: from getter */
        public final String getF238672c() {
            return this.f117542m;
        }

        @Override // com.avito.android.category_parameters.l
        /* renamed from: getHideTitle */
        public final boolean getF117494s() {
            throw null;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117541l;
        }

        @Override // com.avito.android.items.e
        public final void o() {
            this.f117542m = null;
        }

        public t(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k List<JO.m> list, @Y61.l String str4, boolean z12, @Y61.l CustomPaddings customPaddings, boolean z13, boolean z14, @Y61.k ItemWithState.State state, @Y61.l String str5) {
            super(str, null);
            this.f117533d = str2;
            this.f117534e = str3;
            this.f117535f = list;
            this.f117536g = str4;
            this.f117537h = z12;
            this.f117538i = customPaddings;
            this.f117539j = z13;
            this.f117540k = z14;
            this.f117541l = state;
            this.f117542m = str5;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$u;", "Lcom/avito/android/category_parameters/ParameterElement;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class u extends ParameterElement {
        static {
            new u();
        }

        public u() {
            super("more_items_id", null);
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$v;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/category_parameters/l;", "LJO/i;", "Lcom/avito/android/items/e;", "Lcom/avito/android/items/ItemWithState;", "Lcom/avito/android/category_parameters/ParameterElement$o;", "Lcom/avito/android/category_parameters/g;", "LJO/j;", "LJO/k;", "a", "b", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class v extends ParameterElement implements com.avito.android.category_parameters.l, JO.i, com.avito.android.items.e, ItemWithState, o, g, JO.j, JO.k {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117543d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public String f117544e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final List<JO.m> f117545f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final AttributedText f117546g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final DisplayType f117547h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f117548i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final String f117549j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final List<b> f117550k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final a f117551l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public String f117552m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f117553n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public final String f117554o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117555p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f117556q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.l
        public final AttributedText f117557r;

        /* renamed from: s, reason: collision with root package name */
        @Y61.l
        public final Integer f117558s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.l
        public final TipIconParameters f117559t;

        /* renamed from: u, reason: collision with root package name */
        @Y61.l
        public final DeepLink f117560u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f117561v;

        /* renamed from: w, reason: collision with root package name */
        @Y61.l
        public final String f117562w;

        /* renamed from: x, reason: collision with root package name */
        @Y61.l
        public final Theme f117563x;

        /* renamed from: y, reason: collision with root package name */
        public final boolean f117564y;

        /* renamed from: z, reason: collision with root package name */
        @Y61.l
        public final String f117565z;

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$v$a;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final Integer f117566a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Integer f117567b;

            public a(@Y61.l Integer num, @Y61.l Integer num2) {
                this.f117566a = num;
                this.f117567b = num2;
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$v$b;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b {
        }

        public v() {
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public v(String str, String str2, String str3, List list, AttributedText attributedText, DisplayType displayType, boolean z12, String str4, List list2, a aVar, Boolean bool, String str5, boolean z13, boolean z14, String str6, ItemWithState.State state, boolean z15, AttributedText attributedText2, Integer num, TipIconParameters tipIconParameters, DeepLink deepLink, boolean z16, MultiselectParameter.FilterHint filterHint, String str7, Theme theme, boolean z17, String str8, int i12, C42822w c42822w) {
            String str9;
            String str10;
            CharSequence charSequence = null;
            Object[] objArr = 0;
            AttributedText attributedText3 = (i12 & 16) != 0 ? null : attributedText;
            DisplayType displayType2 = (i12 & 32) != 0 ? null : displayType;
            boolean z18 = (i12 & 64) != 0 ? false : z12;
            String str11 = (i12 & 128) != 0 ? null : str4;
            List list3 = (i12 & 256) != 0 ? null : list2;
            a aVar2 = (i12 & 512) != 0 ? null : aVar;
            int i13 = 1;
            boolean z19 = (i12 & 4096) != 0 ? true : z13;
            String str12 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str6;
            ItemWithState.State normal = (32768 & i12) != 0 ? new ItemWithState.State.Normal(charSequence, i13, objArr == true ? 1 : 0) : state;
            boolean z22 = (65536 & i12) != 0 ? false : z15;
            AttributedText attributedText4 = (131072 & i12) != 0 ? null : attributedText2;
            Integer num2 = (262144 & i12) != 0 ? null : num;
            TipIconParameters tipIconParameters2 = (i12 & 524288) != 0 ? null : tipIconParameters;
            DeepLink deepLink2 = (i12 & 1048576) != 0 ? null : deepLink;
            boolean z23 = (i12 & 2097152) != 0 ? false : z16;
            String str13 = (i12 & 8388608) != 0 ? null : str7;
            Theme theme2 = (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : theme;
            boolean z24 = (i12 & 33554432) != 0 ? false : z17;
            if ((i12 & 67108864) != 0) {
                str9 = str;
                str10 = null;
            } else {
                str9 = str;
                str10 = str8;
            }
            super(str9, null);
            this.f117543d = str2;
            this.f117544e = str3;
            this.f117545f = list;
            this.f117546g = attributedText3;
            this.f117547h = displayType2;
            this.f117548i = z18;
            this.f117549j = str11;
            this.f117550k = list3;
            this.f117551l = aVar2;
            this.f117552m = str5;
            this.f117553n = z19;
            this.f117554o = str12;
            this.f117555p = normal;
            this.f117556q = z22;
            this.f117557r = attributedText4;
            this.f117558s = num2;
            this.f117559t = tipIconParameters2;
            this.f117560u = deepLink2;
            this.f117561v = z23;
            this.f117562w = str13;
            this.f117563x = theme2;
            this.f117564y = z24;
            this.f117565z = str10;
        }

        @Override // JO.k
        /* renamed from: M, reason: from getter */
        public final boolean getF117609n() {
            return this.f117564y;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117555p = state;
        }

        @Override // JO.j
        /* renamed from: a */
        public final boolean getF117475C() {
            throw null;
        }

        @Override // com.avito.android.items.e
        @Y61.l
        /* renamed from: getError, reason: from getter */
        public final String getF238672c() {
            return this.f117552m;
        }

        @Override // com.avito.android.category_parameters.ParameterElement.o
        @Y61.l
        /* renamed from: getGroupId, reason: from getter */
        public final String getF173926k() {
            return this.f117562w;
        }

        @Override // com.avito.android.category_parameters.l
        /* renamed from: getHideTitle */
        public final boolean getF117494s() {
            throw null;
        }

        @Override // JO.i
        @Y61.l
        /* renamed from: getMotivation, reason: from getter */
        public final AttributedText getF173922g() {
            return this.f117546g;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117555p;
        }

        @Override // com.avito.android.category_parameters.g
        @Y61.l
        /* renamed from: getTheme, reason: from getter */
        public final Theme getF117608m() {
            return this.f117563x;
        }

        @Override // com.avito.android.items.e
        public final void o() {
            this.f117552m = null;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$x;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/category_parameters/ParameterElement$o;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class x extends ParameterElement implements o {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117591d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f117592e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final p f117593f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final C.b f117594g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f117595h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f117596i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final GroupParameter.OnboardingTooltip f117597j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final String f117598k;

        public x(@Y61.l String str, @Y61.k p pVar, @Y61.k C.b bVar, boolean z12, @Y61.l GroupParameter.OnboardingTooltip onboardingTooltip) {
            super("petFeeGroup", null);
            this.f117591d = "petFeeGroup";
            this.f117592e = str;
            this.f117593f = pVar;
            this.f117594g = bVar;
            this.f117595h = z12;
            this.f117596i = true;
            this.f117597j = onboardingTooltip;
            this.f117598k = "petFeeGroup";
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return L.f(this.f117591d, xVar.f117591d) && L.f(this.f117592e, xVar.f117592e) && L.f(this.f117593f, xVar.f117593f) && L.f(this.f117594g, xVar.f117594g) && this.f117595h == xVar.f117595h && this.f117596i == xVar.f117596i && L.f(this.f117597j, xVar.f117597j) && L.f(this.f117598k, xVar.f117598k);
        }

        @Override // com.avito.android.category_parameters.ParameterElement.o
        @Y61.l
        /* renamed from: getGroupId, reason: from getter */
        public final String getF173926k() {
            return this.f117598k;
        }

        public final int hashCode() {
            int iHashCode = this.f117591d.hashCode() * 31;
            String str = this.f117592e;
            int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f117594g.hashCode() + ((this.f117593f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.f117595h), 31, this.f117596i);
            GroupParameter.OnboardingTooltip onboardingTooltip = this.f117597j;
            int iHashCode2 = (i12 + (onboardingTooltip == null ? 0 : onboardingTooltip.hashCode())) * 31;
            String str2 = this.f117598k;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PairElement(itemId=");
            sb2.append(this.f117591d);
            sb2.append(", title=");
            sb2.append(this.f117592e);
            sb2.append(", input=");
            sb2.append(this.f117593f);
            sb2.append(", select=");
            sb2.append(this.f117594g);
            sb2.append(", isNew=");
            sb2.append(this.f117595h);
            sb2.append(", visible=");
            sb2.append(this.f117596i);
            sb2.append(", tooltipOptions=");
            sb2.append(this.f117597j);
            sb2.append(", groupId=");
            return C22026a.c(sb2, this.f117598k, ')');
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$y;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/items/e;", "Lcom/avito/android/items/ItemWithState;", "LJO/i;", "Lcom/avito/android/category_parameters/l;", "Lcom/avito/android/category_parameters/g;", "LJO/k;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class y extends ParameterElement implements com.avito.android.items.e, ItemWithState, JO.i, com.avito.android.category_parameters.l, g, JO.k {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117599d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f117600e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public String f117601f;

        /* renamed from: g, reason: collision with root package name */
        public final int f117602g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final ImagesEnhancementSlotConfig f117603h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f117604i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117605j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final AttributedText f117606k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f117607l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final Theme f117608m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f117609n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public y(String str, String str2, String str3, String str4, int i12, ImagesEnhancementSlotConfig imagesEnhancementSlotConfig, boolean z12, ItemWithState.State state, AttributedText attributedText, boolean z13, Theme theme, boolean z14, int i13, C42822w c42822w) {
            super(str, null);
            CharSequence charSequence = null;
            Object[] objArr = 0;
            String str5 = (i13 & 4) != 0 ? null : str3;
            String str6 = (i13 & 8) != 0 ? null : str4;
            ImagesEnhancementSlotConfig imagesEnhancementSlotConfig2 = (i13 & 32) != 0 ? null : imagesEnhancementSlotConfig;
            boolean z15 = false;
            boolean z16 = (i13 & 64) != 0 ? false : z12;
            ItemWithState.State normal = (i13 & 128) != 0 ? new ItemWithState.State.Normal(charSequence, 1, objArr == true ? 1 : 0) : state;
            AttributedText attributedText2 = (i13 & 256) != 0 ? null : attributedText;
            Theme theme2 = (i13 & 1024) != 0 ? null : theme;
            if ((i13 & 2048) == 0) {
                z15 = z14;
            }
            this.f117599d = str2;
            this.f117600e = str5;
            this.f117601f = str6;
            this.f117602g = i12;
            this.f117603h = imagesEnhancementSlotConfig2;
            this.f117604i = z16;
            this.f117605j = normal;
            this.f117606k = attributedText2;
            this.f117607l = z13;
            this.f117608m = theme2;
            this.f117609n = z15;
        }

        @Override // JO.k
        /* renamed from: M, reason: from getter */
        public final boolean getF117609n() {
            return this.f117609n;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117605j = state;
        }

        @Override // com.avito.android.items.e
        @Y61.l
        /* renamed from: getError, reason: from getter */
        public final String getF238672c() {
            return this.f117601f;
        }

        @Override // com.avito.android.category_parameters.l
        /* renamed from: getHideTitle */
        public final boolean getF117494s() {
            throw null;
        }

        @Override // JO.i
        @Y61.l
        /* renamed from: getMotivation, reason: from getter */
        public final AttributedText getF173922g() {
            return this.f117606k;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117605j;
        }

        @Override // com.avito.android.category_parameters.g
        @Y61.l
        /* renamed from: getTheme, reason: from getter */
        public final Theme getF117608m() {
            return this.f117608m;
        }

        @Override // com.avito.android.items.e
        public final void o() {
            this.f117601f = null;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$z;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/items/e;", "Lcom/avito/android/items/ItemWithState;", "Lcom/avito/android/category_parameters/l;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class z extends ParameterElement implements com.avito.android.items.e, ItemWithState, com.avito.android.category_parameters.l {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117610d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public String f117611e;

        /* renamed from: f, reason: collision with root package name */
        public final int f117612f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final List<ImageAction> f117613g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final List<ImageBadgeGroup> f117614h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final List<ImageGroup> f117615i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117616j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f117617k;

        public z() {
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public z(String str, String str2, String str3, int i12, List list, List list2, List list3, ItemWithState.State state, boolean z12, int i13, C42822w c42822w) {
            super(str, null);
            CharSequence charSequence = null;
            Object[] objArr = 0;
            str3 = (i13 & 4) != 0 ? null : str3;
            state = (i13 & 128) != 0 ? new ItemWithState.State.Normal(charSequence, 1, objArr == true ? 1 : 0) : state;
            this.f117610d = str2;
            this.f117611e = str3;
            this.f117612f = i12;
            this.f117613g = list;
            this.f117614h = list2;
            this.f117615i = list3;
            this.f117616j = state;
            this.f117617k = z12;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117616j = state;
        }

        @Override // com.avito.android.items.e
        @Y61.l
        /* renamed from: getError, reason: from getter */
        public final String getF238672c() {
            return this.f117611e;
        }

        @Override // com.avito.android.category_parameters.l
        /* renamed from: getHideTitle */
        public final boolean getF117494s() {
            throw null;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117616j;
        }

        @Override // com.avito.android.items.e
        public final void o() {
            this.f117611e = null;
        }
    }

    public ParameterElement(String str, C42822w c42822w) {
        this.f117181b = str;
        this.f117182c = str.hashCode();
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF78563b() {
        return this.f117182c;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF246539b() {
        return this.f117181b;
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0003\n\u000b\f\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$C;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/category_parameters/l;", "Lcom/avito/android/items/e;", "Lcom/avito/android/items/ItemWithState;", "LJO/i;", "LJO/j;", "Lcom/avito/android/category_parameters/ParameterElement$o;", "Lcom/avito/android/category_parameters/g;", "LJO/k;", "a", "b", "c", "Lcom/avito/android/category_parameters/ParameterElement$C$b;", "Lcom/avito/android/category_parameters/ParameterElement$C$c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class C extends ParameterElement implements com.avito.android.category_parameters.l, com.avito.android.items.e, ItemWithState, JO.i, JO.j, o, g, JO.k {

        /* renamed from: A, reason: collision with root package name */
        @Y61.l
        public final AttributedText f117204A;

        /* renamed from: B, reason: collision with root package name */
        @Y61.k
        public final AddressParameter.MotivationPosition f117205B;

        /* renamed from: C, reason: collision with root package name */
        @Y61.l
        public final AddressParameter.InputStyle f117206C;

        /* renamed from: D, reason: collision with root package name */
        @Y61.l
        public final AddressParameter.SellerAddresses f117207D;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117208d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final AttributedText f117209e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f117210f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final AttributedText f117211g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public JO.m f117212h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final DisplayType f117213i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public String f117214j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f117215k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f117216l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f117217m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final String f117218n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117219o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f117220p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f117221q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.l
        public final TipIconParameters f117222r;

        /* renamed from: s, reason: collision with root package name */
        @Y61.l
        public final SelectParameter.Displaying f117223s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.l
        public final TooltipOptions f117224t;

        /* renamed from: u, reason: collision with root package name */
        @Y61.l
        public final String f117225u;

        /* renamed from: v, reason: collision with root package name */
        @Y61.l
        public final Theme f117226v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f117227w;

        /* renamed from: x, reason: collision with root package name */
        public final boolean f117228x;

        /* renamed from: y, reason: collision with root package name */
        public final boolean f117229y;

        /* renamed from: z, reason: collision with root package name */
        @Y61.l
        public final DeepLink f117230z;

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$C$a;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/category_parameters/ParameterElement$o;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends ParameterElement implements o {

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f117231d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final b f117232e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.k
            public final b f117233f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f117234g;

            /* renamed from: h, reason: collision with root package name */
            @Y61.l
            public final String f117235h;

            public /* synthetic */ a(String str, b bVar, b bVar2, boolean z12, String str2, int i12, C42822w c42822w) {
                this(str, bVar, bVar2, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? null : str2);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f117231d, aVar.f117231d) && L.f(this.f117232e, aVar.f117232e) && L.f(this.f117233f, aVar.f117233f) && this.f117234g == aVar.f117234g && L.f(this.f117235h, aVar.f117235h);
            }

            @Override // com.avito.android.category_parameters.ParameterElement.o
            @Y61.l
            /* renamed from: getGroupId, reason: from getter */
            public final String getF173926k() {
                return this.f117235h;
            }

            public final int hashCode() {
                int i12 = androidx.appcompat.app.r.i((this.f117233f.hashCode() + ((this.f117232e.hashCode() + (this.f117231d.hashCode() * 31)) * 31)) * 31, 31, this.f117234g);
                String str = this.f117235h;
                return i12 + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("DoubleSelect(itemId=");
                sb2.append(this.f117231d);
                sb2.append(", firstSelect=");
                sb2.append(this.f117232e);
                sb2.append(", secondSelect=");
                sb2.append(this.f117233f);
                sb2.append(", nonCleared=");
                sb2.append(this.f117234g);
                sb2.append(", groupId=");
                return C22026a.c(sb2, this.f117235h, ')');
            }

            public a(@Y61.k String str, @Y61.k b bVar, @Y61.k b bVar2, boolean z12, @Y61.l String str2) {
                super(str, null);
                this.f117231d = str;
                this.f117232e = bVar;
                this.f117233f = bVar2;
                this.f117234g = z12;
                this.f117235h = str2;
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @s0
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$C$b;", "Lcom/avito/android/category_parameters/ParameterElement$C;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends C {

            /* renamed from: E, reason: collision with root package name */
            @Y61.k
            public final List<JO.m> f117236E;

            /* renamed from: F, reason: collision with root package name */
            @Y61.l
            public final List<Long> f117237F;

            /* renamed from: G, reason: collision with root package name */
            public final int f117238G;

            /* renamed from: H, reason: collision with root package name */
            @Y61.l
            public final AttributedText f117239H;

            /* renamed from: I, reason: collision with root package name */
            public final boolean f117240I;

            public b() {
                throw null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b(String str, String str2, AttributedText attributedText, String str3, AttributedText attributedText2, SelectParameter.Displaying displaying, TooltipOptions tooltipOptions, JO.m mVar, List list, DisplayType displayType, String str4, boolean z12, boolean z13, boolean z14, String str5, ItemWithState.State state, boolean z15, boolean z16, TipIconParameters tipIconParameters, String str6, Theme theme, boolean z17, boolean z18, boolean z19, List list2, DeepLink deepLink, AttributedText attributedText3, AddressParameter.MotivationPosition motivationPosition, AddressParameter.InputStyle inputStyle, int i12, AddressParameter.SellerAddresses sellerAddresses, AttributedText attributedText4, boolean z22, int i13, int i14, C42822w c42822w) {
                int iHashCode;
                CharSequence charSequence = null;
                Object[] objArr = 0;
                AttributedText attributedText5 = (i13 & 4) != 0 ? null : attributedText;
                String str7 = (i13 & 8) != 0 ? null : str3;
                AttributedText attributedText6 = (i13 & 16) != 0 ? null : attributedText2;
                SelectParameter.Displaying displaying2 = (i13 & 32) != 0 ? null : displaying;
                TooltipOptions tooltipOptions2 = (i13 & 64) != 0 ? null : tooltipOptions;
                JO.m mVar2 = (i13 & 128) != 0 ? null : mVar;
                List list3 = (i13 & 256) != 0 ? C42784z0.f406748b : list;
                DisplayType displayType2 = (i13 & 512) != 0 ? null : displayType;
                String str8 = (i13 & 1024) != 0 ? null : str4;
                boolean z23 = (i13 & 2048) != 0 ? false : z12;
                int i15 = 1;
                boolean z24 = (i13 & 4096) != 0 ? true : z13;
                String str9 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str5;
                ItemWithState.State normal = (32768 & i13) != 0 ? new ItemWithState.State.Normal(charSequence, i15, objArr == true ? 1 : 0) : state;
                boolean z25 = (65536 & i13) != 0 ? false : z15;
                boolean z26 = (131072 & i13) != 0 ? false : z16;
                TipIconParameters tipIconParameters2 = (262144 & i13) != 0 ? null : tipIconParameters;
                String str10 = (524288 & i13) != 0 ? null : str6;
                Theme theme2 = (1048576 & i13) != 0 ? null : theme;
                boolean z27 = (2097152 & i13) != 0 ? false : z17;
                boolean z28 = (4194304 & i13) != 0 ? false : z18;
                boolean z29 = (8388608 & i13) != 0 ? false : z19;
                List list4 = (16777216 & i13) != 0 ? null : list2;
                DeepLink deepLink2 = (i13 & 33554432) != 0 ? null : deepLink;
                AttributedText attributedText7 = (i13 & 67108864) != 0 ? null : attributedText3;
                AddressParameter.MotivationPosition motivationPosition2 = (i13 & 134217728) != 0 ? AddressParameter.MotivationPosition.BOTTOM : motivationPosition;
                AddressParameter.InputStyle inputStyle2 = (i13 & 268435456) != 0 ? null : inputStyle;
                if ((i13 & 536870912) != 0) {
                    List list5 = list3;
                    ArrayList arrayList = new ArrayList(C42745f0.q(list5, 10));
                    Iterator it = list5.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Boolean.valueOf(((JO.m) it.next()).f8968i));
                    }
                    iHashCode = arrayList.hashCode();
                } else {
                    iHashCode = i12;
                }
                AddressParameter.SellerAddresses sellerAddresses2 = (1073741824 & i13) != 0 ? null : sellerAddresses;
                AttributedText attributedText8 = (i13 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : attributedText4;
                boolean z32 = (i14 & 1) != 0 ? false : z22;
                AttributedText attributedText9 = attributedText8;
                List list6 = list3;
                super(str, str2, attributedText5, str7, attributedText6, mVar2, displayType2, str8, z23, z24, z14, str9, normal, z25, z26, tipIconParameters2, displaying2, tooltipOptions2, null, str10, theme2, z27, z28, z29, deepLink2, attributedText7, motivationPosition2, inputStyle2, sellerAddresses2, 262144, null);
                this.f117236E = list6;
                this.f117237F = list4;
                this.f117238G = iHashCode;
                this.f117239H = attributedText9;
                this.f117240I = z32;
            }

            public static b L(b bVar, JO.m mVar, List list, String str, int i12) {
                String str2 = bVar.f117181b;
                String str3 = bVar.f117208d;
                AttributedText attributedText = bVar.f117209e;
                String str4 = bVar.f117210f;
                AttributedText attributedText2 = bVar.f117211g;
                SelectParameter.Displaying displaying = bVar.f117223s;
                TooltipOptions tooltipOptions = bVar.f117224t;
                JO.m mVar2 = (i12 & 128) != 0 ? bVar.f117212h : mVar;
                List list2 = (i12 & 256) != 0 ? bVar.f117236E : list;
                DisplayType displayType = bVar.f117213i;
                String str5 = bVar.f117214j;
                boolean z12 = bVar.f117215k;
                boolean z13 = bVar.f117216l;
                boolean z14 = bVar.f117217m;
                String str6 = bVar.f117218n;
                ItemWithState.State state = bVar.f117219o;
                boolean z15 = bVar.f117220p;
                boolean z16 = bVar.f117221q;
                TipIconParameters tipIconParameters = bVar.f117222r;
                String str7 = (i12 & 524288) != 0 ? bVar.f117225u : str;
                Theme theme = bVar.f117226v;
                boolean z17 = bVar.f117227w;
                boolean z18 = bVar.f117228x;
                boolean z19 = bVar.f117229y;
                DeepLink deepLink = bVar.f117230z;
                AddressParameter.MotivationPosition motivationPosition = AddressParameter.MotivationPosition.BOTTOM;
                AddressParameter.InputStyle inputStyle = bVar.f117206C;
                AddressParameter.SellerAddresses sellerAddresses = bVar.f117207D;
                bVar.getClass();
                return new b(str2, str3, attributedText, str4, attributedText2, displaying, tooltipOptions, mVar2, list2, displayType, str5, z12, z13, z14, str6, state, z15, z16, tipIconParameters, str7, theme, z17, z18, z19, null, deepLink, null, motivationPosition, inputStyle, 0, sellerAddresses, null, false, -1526726656, 1, null);
            }

            @Override // com.avito.android.category_parameters.ParameterElement.C
            @Y61.k
            public final List<JO.m> f() {
                return this.f117236E;
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$C$c;", "Lcom/avito/android/category_parameters/ParameterElement$C;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends C {

            /* renamed from: E, reason: collision with root package name */
            @Y61.k
            public final List<JO.n> f117241E;

            /* compiled from: ParameterElement.kt */
            @s0
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LJO/n;", "it", "", "Lcom/avito/conveyor_item/a;", "invoke", "(LJO/n;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class a extends N implements Y41.l<JO.n, List<? extends com.avito.conveyor_item.a>> {

                /* renamed from: l, reason: collision with root package name */
                public static final a f117242l = new a();

                public a() {
                    super(1);
                }

                @Override // Y41.l
                public final List<? extends com.avito.conveyor_item.a> invoke(JO.n nVar) {
                    JO.n nVar2 = nVar;
                    ArrayList arrayList = nVar2.f8978c;
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    String str = nVar2.f8977b;
                    if (str == null || str.length() == 0) {
                        return arrayList;
                    }
                    t0 t0Var = new t0(2);
                    t0Var.a(new com.avito.android.select.title.a(str));
                    t0Var.b(arrayList.toArray(new JO.m[0]));
                    ArrayList<Object> arrayList2 = t0Var.f406850a;
                    return C42745f0.U(arrayList2.toArray(new com.avito.conveyor_item.a[arrayList2.size()]));
                }
            }

            public c() {
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /* JADX WARN: Multi-variable type inference failed */
            public c(String str, String str2, String str3, AttributedText attributedText, JO.m mVar, List list, String str4, boolean z12, boolean z13, String str5, ItemWithState.State state, boolean z14, String str6, boolean z15, DeepLink deepLink, AddressParameter.InputStyle inputStyle, AddressParameter.SellerAddresses sellerAddresses, int i12, C42822w c42822w) {
                CharSequence charSequence = null;
                Object[] objArr = 0;
                String str7 = (i12 & 4) != 0 ? null : str3;
                AttributedText attributedText2 = (i12 & 8) != 0 ? null : attributedText;
                JO.m mVar2 = (i12 & 16) != 0 ? null : mVar;
                List list2 = (i12 & 32) != 0 ? C42784z0.f406748b : list;
                super(str, str2, null, str7, attributedText2, mVar2, null, (i12 & 64) != 0 ? null : str4, (i12 & 128) != 0 ? false : z12, (i12 & 2048) != 0 ? true : z14, z13, (i12 & 512) != 0 ? null : str5, (i12 & 1024) != 0 ? new ItemWithState.State.Normal(charSequence, 1, objArr == true ? 1 : 0) : state, false, false, null, null, null, null, (i12 & 4096) != 0 ? null : str6, null, false, false, (i12 & 8192) != 0 ? false : z15, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : deepLink, null, null, (32768 & i12) != 0 ? null : inputStyle, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : sellerAddresses, 108519428, null);
                this.f117241E = list2;
            }

            @Override // com.avito.android.category_parameters.ParameterElement.C
            @Y61.k
            public final List<com.avito.conveyor_item.a> f() {
                return C43033p.D(C43033p.r(C43033p.y(new C42770s0(this.f117241E), a.f117242l)));
            }
        }

        public /* synthetic */ C(String str, String str2, AttributedText attributedText, String str3, AttributedText attributedText2, JO.m mVar, DisplayType displayType, String str4, boolean z12, boolean z13, boolean z14, String str5, ItemWithState.State state, boolean z15, boolean z16, TipIconParameters tipIconParameters, SelectParameter.Displaying displaying, TooltipOptions tooltipOptions, String str6, String str7, Theme theme, boolean z17, boolean z18, boolean z19, DeepLink deepLink, AttributedText attributedText3, AddressParameter.MotivationPosition motivationPosition, AddressParameter.InputStyle inputStyle, AddressParameter.SellerAddresses sellerAddresses, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : attributedText, str3, attributedText2, mVar, displayType, str4, z12, (i12 & 512) != 0 ? true : z13, z14, str5, state, (i12 & 8192) != 0 ? false : z15, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z16, (32768 & i12) != 0 ? null : tipIconParameters, (65536 & i12) != 0 ? null : displaying, (131072 & i12) != 0 ? null : tooltipOptions, (262144 & i12) != 0 ? null : str6, (524288 & i12) != 0 ? null : str7, (1048576 & i12) != 0 ? null : theme, (2097152 & i12) != 0 ? false : z17, (4194304 & i12) != 0 ? false : z18, (8388608 & i12) != 0 ? false : z19, deepLink, (33554432 & i12) != 0 ? null : attributedText3, (67108864 & i12) != 0 ? AddressParameter.MotivationPosition.BOTTOM : motivationPosition, (134217728 & i12) != 0 ? null : inputStyle, (i12 & 268435456) != 0 ? null : sellerAddresses, null);
        }

        @Override // JO.k
        /* renamed from: M, reason: from getter */
        public final boolean getF117609n() {
            return this.f117227w;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117219o = state;
        }

        @Y61.k
        public abstract List<com.avito.conveyor_item.a> f();

        @Override // com.avito.android.items.e
        @Y61.l
        /* renamed from: getError, reason: from getter */
        public final String getF238672c() {
            return this.f117214j;
        }

        @Override // com.avito.android.category_parameters.ParameterElement.o
        @Y61.l
        /* renamed from: getGroupId, reason: from getter */
        public final String getF173926k() {
            return this.f117225u;
        }

        @Override // JO.i
        @Y61.l
        /* renamed from: getMotivation, reason: from getter */
        public final AttributedText getF173922g() {
            return this.f117211g;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117219o;
        }

        @Override // com.avito.android.category_parameters.g
        @Y61.l
        /* renamed from: getTheme, reason: from getter */
        public final Theme getF117608m() {
            return this.f117226v;
        }

        @Override // com.avito.android.items.e
        public final void o() {
            this.f117214j = null;
        }

        public C(String str, String str2, AttributedText attributedText, String str3, AttributedText attributedText2, JO.m mVar, DisplayType displayType, String str4, boolean z12, boolean z13, boolean z14, String str5, ItemWithState.State state, boolean z15, boolean z16, TipIconParameters tipIconParameters, SelectParameter.Displaying displaying, TooltipOptions tooltipOptions, String str6, String str7, Theme theme, boolean z17, boolean z18, boolean z19, DeepLink deepLink, AttributedText attributedText3, AddressParameter.MotivationPosition motivationPosition, AddressParameter.InputStyle inputStyle, AddressParameter.SellerAddresses sellerAddresses, C42822w c42822w) {
            super(str, null);
            this.f117208d = str2;
            this.f117209e = attributedText;
            this.f117210f = str3;
            this.f117211g = attributedText2;
            this.f117212h = mVar;
            this.f117213i = displayType;
            this.f117214j = str4;
            this.f117215k = z12;
            this.f117216l = z13;
            this.f117217m = z14;
            this.f117218n = str5;
            this.f117219o = state;
            this.f117220p = z15;
            this.f117221q = z16;
            this.f117222r = tipIconParameters;
            this.f117223s = displaying;
            this.f117224t = tooltipOptions;
            this.f117225u = str7;
            this.f117226v = theme;
            this.f117227w = z17;
            this.f117228x = z18;
            this.f117229y = z19;
            this.f117230z = deepLink;
            this.f117204A = attributedText3;
            this.f117205B = motivationPosition;
            this.f117206C = inputStyle;
            this.f117207D = sellerAddresses;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t¨\u0006\n"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$H;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/items/e;", "Lcom/avito/android/items/ItemWithState;", "Lcom/avito/android/items/a;", "Lcom/avito/android/category_parameters/l;", "LJO/i;", "LJO/j;", "Lcom/avito/android/items/f;", "LJO/k;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class H extends ParameterElement implements com.avito.android.items.e, ItemWithState, com.avito.android.items.a, com.avito.android.category_parameters.l, JO.i, JO.j, com.avito.android.items.f, JO.k {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117298d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f117299e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public String f117300f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public String f117301g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f117302h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final FormatterType f117303i;

        /* renamed from: j, reason: collision with root package name */
        public final int f117304j;

        /* renamed from: k, reason: collision with root package name */
        public final int f117305k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final String f117306l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final String f117307m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final DisplayingOptions f117308n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117309o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f117310p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.l
        public final AttributedText f117311q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.l
        public hJ.m f117312r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f117313s;

        /* renamed from: t, reason: collision with root package name */
        public final boolean f117314t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f117315u;

        /* renamed from: v, reason: collision with root package name */
        @Y61.l
        public final Boolean f117316v;

        /* renamed from: w, reason: collision with root package name */
        @Y61.l
        public final CharParameter.AutoDescription f117317w;

        /* renamed from: x, reason: collision with root package name */
        @Y61.l
        public final CharParameter.AutoBeautification f117318x;

        /* renamed from: y, reason: collision with root package name */
        @Y61.l
        public final String f117319y;

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ H(String str, String str2, String str3, String str4, boolean z12, FormatterType formatterType, int i12, int i13, String str5, String str6, DisplayingOptions displayingOptions, ItemWithState.State state, boolean z13, AttributedText attributedText, hJ.m mVar, boolean z14, boolean z15, boolean z16, Boolean bool, CharParameter.AutoDescription autoDescription, CharParameter.AutoBeautification autoBeautification, String str7, int i14, C42822w c42822w) {
            this(str, str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? false : z12, formatterType, i12, i13, str5, str6, (i14 & 1024) != 0 ? null : displayingOptions, (i14 & 2048) != 0 ? new ItemWithState.State.Normal(null, 1, 0 == true ? 1 : 0) : state, (i14 & 4096) != 0 ? false : z13, (i14 & 8192) != 0 ? null : attributedText, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : mVar, (32768 & i14) != 0 ? false : z14, (65536 & i14) != 0 ? false : z15, (131072 & i14) != 0 ? true : z16, (262144 & i14) != 0 ? null : bool, (524288 & i14) != 0 ? null : autoDescription, (1048576 & i14) != 0 ? null : autoBeautification, (i14 & 2097152) != 0 ? null : str7);
        }

        @Override // JO.k
        /* renamed from: M, reason: from getter */
        public final boolean getF117609n() {
            return this.f117313s;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117309o = state;
        }

        @Override // JO.j
        /* renamed from: a */
        public final boolean getF117475C() {
            throw null;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof H)) {
                return false;
            }
            H h12 = (H) obj;
            return L.f(this.f117298d, h12.f117298d) && L.f(this.f117299e, h12.f117299e) && L.f(this.f117300f, h12.f117300f) && L.f(this.f117301g, h12.f117301g) && this.f117302h == h12.f117302h && L.f(this.f117303i, h12.f117303i) && this.f117304j == h12.f117304j && this.f117305k == h12.f117305k && L.f(this.f117306l, h12.f117306l) && L.f(this.f117307m, h12.f117307m) && L.f(this.f117308n, h12.f117308n) && L.f(this.f117309o, h12.f117309o) && this.f117310p == h12.f117310p && L.f(this.f117311q, h12.f117311q) && L.f(this.f117312r, h12.f117312r) && this.f117313s == h12.f117313s && this.f117314t == h12.f117314t && this.f117315u == h12.f117315u && L.f(this.f117316v, h12.f117316v) && L.f(this.f117317w, h12.f117317w) && L.f(this.f117318x, h12.f117318x) && L.f(this.f117319y, h12.f117319y);
        }

        @Override // com.avito.android.items.e
        @Y61.l
        /* renamed from: getError, reason: from getter */
        public final String getF238672c() {
            return this.f117301g;
        }

        @Override // com.avito.android.category_parameters.l
        /* renamed from: getHideTitle */
        public final boolean getF117494s() {
            throw null;
        }

        @Override // JO.i
        @Y61.l
        /* renamed from: getMotivation, reason: from getter */
        public final AttributedText getF173922g() {
            return this.f117311q;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117309o;
        }

        @Override // com.avito.android.items.a
        @Y61.l
        /* renamed from: getValue, reason: from getter */
        public final String getF117481f() {
            return this.f117300f;
        }

        public final int hashCode() {
            int iD2 = androidx.compose.foundation.H.d(this.f117298d.hashCode() * 31, 31, this.f117299e);
            String str = this.f117300f;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f117301g;
            int iE2 = androidx.appcompat.app.r.e(this.f117305k, androidx.appcompat.app.r.e(this.f117304j, (this.f117303i.hashCode() + androidx.appcompat.app.r.i((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f117302h)) * 31, 31), 31);
            String str3 = this.f117306l;
            int iHashCode2 = (iE2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f117307m;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            DisplayingOptions displayingOptions = this.f117308n;
            int i12 = androidx.appcompat.app.r.i((this.f117309o.hashCode() + ((iHashCode3 + (displayingOptions == null ? 0 : displayingOptions.hashCode())) * 31)) * 31, 31, this.f117310p);
            AttributedText attributedText = this.f117311q;
            int iHashCode4 = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            hJ.m mVar = this.f117312r;
            int i13 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode4 + (mVar == null ? 0 : mVar.hashCode())) * 31, 31, this.f117313s), 31, this.f117314t), 31, this.f117315u);
            Boolean bool = this.f117316v;
            int iHashCode5 = (i13 + (bool == null ? 0 : bool.hashCode())) * 31;
            CharParameter.AutoDescription autoDescription = this.f117317w;
            int iHashCode6 = (iHashCode5 + (autoDescription == null ? 0 : autoDescription.hashCode())) * 31;
            CharParameter.AutoBeautification autoBeautification = this.f117318x;
            int iHashCode7 = (iHashCode6 + (autoBeautification == null ? 0 : autoBeautification.hashCode())) * 31;
            String str5 = this.f117319y;
            return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
        }

        @Override // com.avito.android.items.a
        public final void m(@Y61.l String str) {
            this.f117300f = str;
        }

        @Override // com.avito.android.items.f
        @Y61.l
        /* renamed from: n, reason: from getter */
        public final hJ.m getF117495t() {
            return this.f117312r;
        }

        @Override // com.avito.android.items.e
        public final void o() {
            this.f117301g = null;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TaggedInput(itemId=");
            sb2.append(this.f117298d);
            sb2.append(", title=");
            sb2.append(this.f117299e);
            sb2.append(", value=");
            sb2.append(this.f117300f);
            sb2.append(", error=");
            sb2.append(this.f117301g);
            sb2.append(", dynamicTags=");
            sb2.append(this.f117302h);
            sb2.append(", inputType=");
            sb2.append(this.f117303i);
            sb2.append(", androidSdkInputType=");
            sb2.append(this.f117304j);
            sb2.append(", lines=");
            sb2.append(this.f117305k);
            sb2.append(", placeholder=");
            sb2.append(this.f117306l);
            sb2.append(", subTitle=");
            sb2.append(this.f117307m);
            sb2.append(", displayingOptions=");
            sb2.append(this.f117308n);
            sb2.append(", state=");
            sb2.append(this.f117309o);
            sb2.append(", hideTitle=");
            sb2.append(this.f117310p);
            sb2.append(", motivation=");
            sb2.append(this.f117311q);
            sb2.append(", htmlRootNode=");
            sb2.append(this.f117312r);
            sb2.append(", toFillIn=");
            sb2.append(this.f117313s);
            sb2.append(", showRequiredFieldSign=");
            sb2.append(this.f117314t);
            sb2.append(", needFormatting=");
            sb2.append(this.f117315u);
            sb2.append(", withClearButton=");
            sb2.append(this.f117316v);
            sb2.append(", autoDescription=");
            sb2.append(this.f117317w);
            sb2.append(", autoBeautification=");
            sb2.append(this.f117318x);
            sb2.append(", description=");
            return C22026a.c(sb2, this.f117319y, ')');
        }

        @Override // com.avito.android.items.f
        public final void z1(@Y61.l hJ.m mVar) {
            this.f117312r = mVar;
        }

        public H(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, boolean z12, @Y61.k FormatterType formatterType, int i12, int i13, @Y61.l String str5, @Y61.l String str6, @Y61.l DisplayingOptions displayingOptions, @Y61.k ItemWithState.State state, boolean z13, @Y61.l AttributedText attributedText, @Y61.l hJ.m mVar, boolean z14, boolean z15, boolean z16, @Y61.l Boolean bool, @Y61.l CharParameter.AutoDescription autoDescription, @Y61.l CharParameter.AutoBeautification autoBeautification, @Y61.l String str7) {
            super(str, null);
            this.f117298d = str;
            this.f117299e = str2;
            this.f117300f = str3;
            this.f117301g = str4;
            this.f117302h = z12;
            this.f117303i = formatterType;
            this.f117304j = i12;
            this.f117305k = i13;
            this.f117306l = str5;
            this.f117307m = str6;
            this.f117308n = displayingOptions;
            this.f117309o = state;
            this.f117310p = z13;
            this.f117311q = attributedText;
            this.f117312r = mVar;
            this.f117313s = z14;
            this.f117314t = z15;
            this.f117315u = z16;
            this.f117316v = bool;
            this.f117317w = autoDescription;
            this.f117318x = autoBeautification;
            this.f117319y = str7;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$J;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/items/ItemWithState;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class J extends ParameterElement implements ItemWithState {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117337d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f117338e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f117339f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final AttributedDescription f117340g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f117341h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final Image f117342i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final Long f117343j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final Long f117344k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final Long f117345l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final Boolean f117346m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final OnboardingConfig f117347n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public final OnboardingV2 f117348o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.l
        public final DeliveryOnVideoUploadConfig f117349p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f117350q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.l
        public final String f117351r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f117352s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117353t;

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ J(String str, String str2, String str3, AttributedDescription attributedDescription, String str4, Image image, Long l12, Long l13, Long l14, Boolean bool, OnboardingConfig onboardingConfig, OnboardingV2 onboardingV2, DeliveryOnVideoUploadConfig deliveryOnVideoUploadConfig, boolean z12, String str5, boolean z13, ItemWithState.State state, int i12, C42822w c42822w) {
            ItemWithState.State normal;
            if ((i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0) {
                normal = new ItemWithState.State.Normal(null, 1, 0 == true ? 1 : 0);
            } else {
                normal = state;
            }
            this(str, str2, str3, attributedDescription, str4, image, l12, l13, l14, bool, onboardingConfig, onboardingV2, deliveryOnVideoUploadConfig, z12, str5, z13, normal);
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117353t = state;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof J)) {
                return false;
            }
            J j12 = (J) obj;
            return L.f(this.f117337d, j12.f117337d) && L.f(this.f117338e, j12.f117338e) && L.f(this.f117339f, j12.f117339f) && L.f(this.f117340g, j12.f117340g) && L.f(this.f117341h, j12.f117341h) && L.f(this.f117342i, j12.f117342i) && L.f(this.f117343j, j12.f117343j) && L.f(this.f117344k, j12.f117344k) && L.f(this.f117345l, j12.f117345l) && L.f(this.f117346m, j12.f117346m) && L.f(this.f117347n, j12.f117347n) && L.f(this.f117348o, j12.f117348o) && L.f(this.f117349p, j12.f117349p) && this.f117350q == j12.f117350q && L.f(this.f117351r, j12.f117351r) && this.f117352s == j12.f117352s && L.f(this.f117353t, j12.f117353t);
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117353t;
        }

        public final int hashCode() {
            int iHashCode = this.f117337d.hashCode() * 31;
            String str = this.f117338e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f117339f;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AttributedDescription attributedDescription = this.f117340g;
            int iHashCode4 = (iHashCode3 + (attributedDescription == null ? 0 : attributedDescription.hashCode())) * 31;
            String str3 = this.f117341h;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Image image = this.f117342i;
            int iHashCode6 = (iHashCode5 + (image == null ? 0 : image.hashCode())) * 31;
            Long l12 = this.f117343j;
            int iHashCode7 = (iHashCode6 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.f117344k;
            int iHashCode8 = (iHashCode7 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Long l14 = this.f117345l;
            int iHashCode9 = (iHashCode8 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Boolean bool = this.f117346m;
            int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
            OnboardingConfig onboardingConfig = this.f117347n;
            int iHashCode11 = (iHashCode10 + (onboardingConfig == null ? 0 : onboardingConfig.hashCode())) * 31;
            OnboardingV2 onboardingV2 = this.f117348o;
            int iHashCode12 = (iHashCode11 + (onboardingV2 == null ? 0 : onboardingV2.hashCode())) * 31;
            DeliveryOnVideoUploadConfig deliveryOnVideoUploadConfig = this.f117349p;
            int i12 = androidx.appcompat.app.r.i((iHashCode12 + (deliveryOnVideoUploadConfig == null ? 0 : deliveryOnVideoUploadConfig.hashCode())) * 31, 31, this.f117350q);
            String str4 = this.f117351r;
            return this.f117353t.hashCode() + androidx.appcompat.app.r.i((i12 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f117352s);
        }

        @Y61.k
        public final String toString() {
            return "VideoUpload(itemId=" + this.f117337d + ", title=" + this.f117338e + ", description=" + this.f117339f + ", attributedDescription=" + this.f117340g + ", videoId=" + this.f117341h + ", thumbnail=" + this.f117342i + ", maxFileSize=" + this.f117343j + ", maxVideoDuration=" + this.f117344k + ", minVideoDuration=" + this.f117345l + ", isNew=" + this.f117346m + ", onboarding=" + this.f117347n + ", onboardingV2=" + this.f117348o + ", deliveryConfig=" + this.f117349p + ", isDisabled=" + this.f117350q + ", disabledText=" + this.f117351r + ", toFillIn=" + this.f117352s + ", state=" + this.f117353t + ')';
        }

        public J(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l AttributedDescription attributedDescription, @Y61.l String str4, @Y61.l Image image, @Y61.l Long l12, @Y61.l Long l13, @Y61.l Long l14, @Y61.l Boolean bool, @Y61.l OnboardingConfig onboardingConfig, @Y61.l OnboardingV2 onboardingV2, @Y61.l DeliveryOnVideoUploadConfig deliveryOnVideoUploadConfig, boolean z12, @Y61.l String str5, boolean z13, @Y61.k ItemWithState.State state) {
            super(str, null);
            this.f117337d = str;
            this.f117338e = str2;
            this.f117339f = str3;
            this.f117340g = attributedDescription;
            this.f117341h = str4;
            this.f117342i = image;
            this.f117343j = l12;
            this.f117344k = l13;
            this.f117345l = l14;
            this.f117346m = bool;
            this.f117347n = onboardingConfig;
            this.f117348o = onboardingV2;
            this.f117349p = deliveryOnVideoUploadConfig;
            this.f117350q = z12;
            this.f117351r = str5;
            this.f117352s = z13;
            this.f117353t = state;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$SelectorCardsCarousel;", "Lcom/avito/android/category_parameters/ParameterElement;", "LJO/i;", "Lcom/avito/android/items/ItemWithState;", "Lcom/avito/android/category_parameters/ParameterElement$o;", "a", "SelectType", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectorCardsCarousel extends ParameterElement implements JO.i, ItemWithState, o {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117354d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final List<a> f117355e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final DeepLink f117356f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final SelectType f117357g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f117358h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final AttributedText f117359i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117360j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final String f117361k;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$SelectorCardsCarousel$SelectType;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SelectType {

            /* renamed from: b, reason: collision with root package name */
            public static final SelectType f117362b;

            /* renamed from: c, reason: collision with root package name */
            public static final SelectType f117363c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ SelectType[] f117364d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f117365e;

            static {
                SelectType selectType = new SelectType("SINGLE", 0);
                f117362b = selectType;
                SelectType selectType2 = new SelectType("MULTIPLE", 1);
                f117363c = selectType2;
                SelectType[] selectTypeArr = {selectType, selectType2};
                f117364d = selectTypeArr;
                f117365e = kotlin.enums.c.a(selectTypeArr);
            }

            public SelectType() {
                throw null;
            }

            public static SelectType valueOf(String str) {
                return (SelectType) Enum.valueOf(SelectType.class, str);
            }

            public static SelectType[] values() {
                return (SelectType[]) f117364d.clone();
            }
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$SelectorCardsCarousel$a;", "Lcom/avito/android/lib/design/selector_card/r;", "a", "b", "Lcom/avito/android/category_parameters/ParameterElement$SelectorCardsCarousel$a$a;", "Lcom/avito/android/category_parameters/ParameterElement$SelectorCardsCarousel$a$b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class a implements com.avito.android.lib.design.selector_card.r {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f117366b;

            /* compiled from: ParameterElement.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$SelectorCardsCarousel$a$a;", "Lcom/avito/android/category_parameters/ParameterElement$SelectorCardsCarousel$a;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.category_parameters.ParameterElement$SelectorCardsCarousel$a$a, reason: collision with other inner class name */
            public static final /* data */ class C3417a extends a {

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final String f117367c;

                /* renamed from: d, reason: collision with root package name */
                @Y61.k
                public final String f117368d;

                /* renamed from: e, reason: collision with root package name */
                @Y61.k
                public final UniversalImage f117369e;

                /* renamed from: f, reason: collision with root package name */
                public final boolean f117370f;

                public C3417a(@Y61.k String str, @Y61.k String str2, @Y61.k UniversalImage universalImage, boolean z12) {
                    super(z12, null);
                    this.f117367c = str;
                    this.f117368d = str2;
                    this.f117369e = universalImage;
                    this.f117370f = z12;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3417a)) {
                        return false;
                    }
                    C3417a c3417a = (C3417a) obj;
                    return L.f(this.f117367c, c3417a.f117367c) && L.f(this.f117368d, c3417a.f117368d) && L.f(this.f117369e, c3417a.f117369e) && this.f117370f == c3417a.f117370f;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f117370f) + com.avito.android.actions_sheet.a.a(androidx.compose.foundation.H.d(this.f117367c.hashCode() * 31, 31, this.f117368d), 31, this.f117369e);
                }

                @Override // com.avito.android.category_parameters.ParameterElement.SelectorCardsCarousel.a
                /* renamed from: isSelected, reason: from getter */
                public final boolean getF117366b() {
                    return this.f117370f;
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("OptionWithImage(id=");
                    sb2.append(this.f117367c);
                    sb2.append(", title=");
                    sb2.append(this.f117368d);
                    sb2.append(", image=");
                    sb2.append(this.f117369e);
                    sb2.append(", isSelected=");
                    return androidx.appcompat.app.r.x(sb2, this.f117370f, ')');
                }
            }

            /* compiled from: ParameterElement.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$SelectorCardsCarousel$a$b;", "Lcom/avito/android/category_parameters/ParameterElement$SelectorCardsCarousel$a;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class b extends a {

                /* renamed from: c, reason: collision with root package name */
                public final int f117371c;

                /* renamed from: d, reason: collision with root package name */
                public final boolean f117372d;

                /* renamed from: e, reason: collision with root package name */
                public final boolean f117373e;

                public b(int i12, boolean z12, boolean z13) {
                    super(z13, null);
                    this.f117371c = i12;
                    this.f117372d = z12;
                    this.f117373e = z13;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.f117371c == bVar.f117371c && this.f117372d == bVar.f117372d && this.f117373e == bVar.f117373e;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f117373e) + androidx.appcompat.app.r.i(Integer.hashCode(this.f117371c) * 31, 31, this.f117372d);
                }

                @Override // com.avito.android.category_parameters.ParameterElement.SelectorCardsCarousel.a
                /* renamed from: isSelected, reason: from getter */
                public final boolean getF117366b() {
                    return this.f117373e;
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("SupplementaryOption(selectedOptionsWithoutImageCount=");
                    sb2.append(this.f117371c);
                    sb2.append(", showIcon=");
                    sb2.append(this.f117372d);
                    sb2.append(", isSelected=");
                    return androidx.appcompat.app.r.x(sb2, this.f117373e, ')');
                }
            }

            public a(boolean z12, C42822w c42822w) {
                this.f117366b = z12;
            }

            @Override // com.avito.android.lib.design.selector_card.r
            public final boolean a(@Y61.k com.avito.android.lib.design.selector_card.r rVar) {
                return (rVar instanceof a) && equals(rVar);
            }

            @Override // com.avito.android.lib.design.selector_card.r
            /* renamed from: isEnabled */
            public final boolean getF309669f() {
                return true;
            }

            /* renamed from: isSelected, reason: from getter */
            public boolean getF117366b() {
                return this.f117366b;
            }
        }

        public /* synthetic */ SelectorCardsCarousel(String str, List list, DeepLink deepLink, SelectType selectType, String str2, AttributedText attributedText, ItemWithState.State state, String str3, int i12, C42822w c42822w) {
            this(str, list, (i12 & 4) != 0 ? null : deepLink, (i12 & 8) != 0 ? SelectType.f117363c : selectType, str2, attributedText, state, str3);
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117360j = state;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectorCardsCarousel)) {
                return false;
            }
            SelectorCardsCarousel selectorCardsCarousel = (SelectorCardsCarousel) obj;
            return L.f(this.f117354d, selectorCardsCarousel.f117354d) && L.f(this.f117355e, selectorCardsCarousel.f117355e) && L.f(this.f117356f, selectorCardsCarousel.f117356f) && this.f117357g == selectorCardsCarousel.f117357g && L.f(this.f117358h, selectorCardsCarousel.f117358h) && L.f(this.f117359i, selectorCardsCarousel.f117359i) && L.f(this.f117360j, selectorCardsCarousel.f117360j) && L.f(this.f117361k, selectorCardsCarousel.f117361k);
        }

        @Override // com.avito.android.category_parameters.ParameterElement.o
        @Y61.l
        /* renamed from: getGroupId, reason: from getter */
        public final String getF173926k() {
            return this.f117358h;
        }

        @Override // JO.i
        @Y61.l
        /* renamed from: getMotivation, reason: from getter */
        public final AttributedText getF173922g() {
            return this.f117359i;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117360j;
        }

        public final int hashCode() {
            int iE2 = androidx.compose.foundation.H.e(this.f117354d.hashCode() * 31, 31, this.f117355e);
            DeepLink deepLink = this.f117356f;
            int iHashCode = (this.f117357g.hashCode() + ((iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31)) * 31;
            String str = this.f117358h;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AttributedText attributedText = this.f117359i;
            int iHashCode3 = attributedText != null ? attributedText.hashCode() : 0;
            return this.f117361k.hashCode() + ((this.f117360j.hashCode() + ((iHashCode2 + iHashCode3) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectorCardsCarousel(title=");
            sb2.append(this.f117354d);
            sb2.append(", options=");
            sb2.append(this.f117355e);
            sb2.append(", titleTipAction=");
            sb2.append(this.f117356f);
            sb2.append(", selectType=");
            sb2.append(this.f117357g);
            sb2.append(", groupId=");
            sb2.append(this.f117358h);
            sb2.append(", motivation=");
            sb2.append(this.f117359i);
            sb2.append(", state=");
            sb2.append(this.f117360j);
            sb2.append(", itemId=");
            return C22026a.c(sb2, this.f117361k, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SelectorCardsCarousel(@Y61.k String str, @Y61.k List<? extends a> list, @Y61.l DeepLink deepLink, @Y61.k SelectType selectType, @Y61.l String str2, @Y61.l AttributedText attributedText, @Y61.k ItemWithState.State state, @Y61.k String str3) {
            super(str3, null);
            this.f117354d = str;
            this.f117355e = list;
            this.f117356f = deepLink;
            this.f117357g = selectType;
            this.f117358h = str2;
            this.f117359i = attributedText;
            this.f117360j = state;
            this.f117361k = str3;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$d;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/items/ItemWithState;", "LJO/k;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.category_parameters.ParameterElement$d, reason: case insensitive filesystem */
    public static final class C29376d extends ParameterElement implements ItemWithState, JO.k {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117400d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final C29377e f117401e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final C29377e f117402f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f117403g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Map<String, C29378f> f117404h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f117405i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117406j;

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ C29376d(String str, String str2, C29377e c29377e, C29377e c29377e2, boolean z12, ItemWithState.State state, Map map, boolean z13, int i12, C42822w c42822w) {
            this(str, str2, c29377e, c29377e2, z12, (i12 & 32) != 0 ? new ItemWithState.State.Normal(null, 1, 0 == true ? 1 : 0) : state, (i12 & 64) != 0 ? null : map, (i12 & 128) != 0 ? false : z13);
        }

        @Override // JO.k
        /* renamed from: M, reason: from getter */
        public final boolean getF117609n() {
            return this.f117405i;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            C29377e c29377e = this.f117401e;
            if (c29377e != null && ((!c29377e.f117411h && c29377e.f117408e == null) || !(c29377e.f117419p instanceof ItemWithState.State.Normal))) {
                c29377e.f117419p = state;
            }
            C29377e c29377e2 = this.f117402f;
            if (c29377e2 != null && ((!c29377e2.f117411h && c29377e2.f117408e == null) || !(c29377e2.f117419p instanceof ItemWithState.State.Normal))) {
                c29377e2.f117419p = state;
            }
            this.f117406j = state;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117406j;
        }

        public C29376d(@Y61.k String str, @Y61.k String str2, @Y61.l C29377e c29377e, @Y61.l C29377e c29377e2, boolean z12, @Y61.k ItemWithState.State state, @Y61.l Map<String, C29378f> map, boolean z13) {
            super(str, null);
            this.f117400d = str2;
            this.f117401e = c29377e;
            this.f117402f = c29377e2;
            this.f117403g = z12;
            this.f117404h = map;
            this.f117405i = z13;
            this.f117406j = state;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$e;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/items/e;", "Lcom/avito/android/items/ItemWithState;", "LJO/k;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.category_parameters.ParameterElement$e, reason: case insensitive filesystem */
    public static final class C29377e extends ParameterElement implements com.avito.android.items.e, ItemWithState, JO.k {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117407d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public Long f117408e;

        /* renamed from: f, reason: collision with root package name */
        public final long f117409f;

        /* renamed from: g, reason: collision with root package name */
        public final long f117410g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f117411h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f117412i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f117413j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final SelectionType f117414k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final String f117415l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f117416m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final DeepLink f117417n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public String f117418o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117419p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f117420q;

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ C29377e(String str, String str2, Long l12, long j12, long j13, boolean z12, String str3, boolean z13, SelectionType selectionType, String str4, boolean z14, DeepLink deepLink, String str5, ItemWithState.State state, boolean z15, int i12, C42822w c42822w) {
            this(str, str2, l12, j12, j13, z12, str3, z13, (i12 & 256) != 0 ? null : selectionType, (i12 & 512) != 0 ? null : str4, (i12 & 1024) != 0 ? true : z14, (i12 & 2048) != 0 ? null : deepLink, (i12 & 4096) != 0 ? null : str5, (i12 & 8192) != 0 ? new ItemWithState.State.Normal(null, 1, 0 == true ? 1 : 0) : state, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z15);
        }

        @Override // JO.k
        /* renamed from: M, reason: from getter */
        public final boolean getF117609n() {
            return this.f117420q;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117419p = state;
        }

        @Override // com.avito.android.items.e
        @Y61.l
        /* renamed from: getError, reason: from getter */
        public final String getF238672c() {
            return this.f117418o;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117419p;
        }

        @Override // com.avito.android.items.e
        public final void o() {
            this.f117418o = null;
        }

        public C29377e(@Y61.k String str, @Y61.k String str2, @Y61.l Long l12, long j12, long j13, boolean z12, @Y61.l String str3, boolean z13, @Y61.l SelectionType selectionType, @Y61.l String str4, boolean z14, @Y61.l DeepLink deepLink, @Y61.l String str5, @Y61.k ItemWithState.State state, boolean z15) {
            super(str, null);
            this.f117407d = str2;
            this.f117408e = l12;
            this.f117409f = j12;
            this.f117410g = j13;
            this.f117411h = z12;
            this.f117412i = str3;
            this.f117413j = z13;
            this.f117414k = selectionType;
            this.f117415l = str4;
            this.f117416m = z14;
            this.f117417n = deepLink;
            this.f117418o = str5;
            this.f117419p = state;
            this.f117420q = z15;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$w;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/category_parameters/l;", "Lcom/avito/android/items/ItemWithState;", "LJO/i;", "Lcom/avito/android/items/e;", "LJO/k;", "a", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class w extends ParameterElement implements com.avito.android.category_parameters.l, ItemWithState, JO.i, com.avito.android.items.e, JO.k {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117568d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final AttributedText f117569e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f117570f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f117571g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f117572h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f117573i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final List<a> f117574j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f117575k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f117576l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117577m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final AttributedText f117578n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public String f117579o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f117580p;

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$w$a;", "", "a", "b", "c", "Lcom/avito/android/category_parameters/ParameterElement$w$a$a;", "Lcom/avito/android/category_parameters/ParameterElement$w$a$b;", "Lcom/avito/android/category_parameters/ParameterElement$w$a$c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class a {

            /* compiled from: ParameterElement.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$w$a$a;", "Lcom/avito/android/category_parameters/ParameterElement$w$a;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.category_parameters.ParameterElement$w$a$a, reason: collision with other inner class name */
            public static final /* data */ class C3418a extends a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final String f117581a;

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final String f117582b;

                /* renamed from: c, reason: collision with root package name */
                public final boolean f117583c;

                public /* synthetic */ C3418a(String str, String str2, boolean z12, int i12, C42822w c42822w) {
                    this(str, str2, (i12 & 4) != 0 ? false : z12);
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3418a)) {
                        return false;
                    }
                    C3418a c3418a = (C3418a) obj;
                    return L.f(this.f117581a, c3418a.f117581a) && L.f(this.f117582b, c3418a.f117582b) && this.f117583c == c3418a.f117583c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f117583c) + androidx.compose.foundation.H.d(this.f117581a.hashCode() * 31, 31, this.f117582b);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("EducationList(title=");
                    sb2.append(this.f117581a);
                    sb2.append(", subtitle=");
                    sb2.append(this.f117582b);
                    sb2.append(", hasError=");
                    return androidx.appcompat.app.r.x(sb2, this.f117583c, ')');
                }

                public C3418a(@Y61.k String str, @Y61.k String str2, boolean z12) {
                    super(false, 1, null);
                    this.f117581a = str;
                    this.f117582b = str2;
                    this.f117583c = z12;
                }
            }

            /* compiled from: ParameterElement.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$w$a$b;", "Lcom/avito/android/category_parameters/ParameterElement$w$a;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class b extends a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final String f117584a;

                /* renamed from: b, reason: collision with root package name */
                @Y61.l
                public final String f117585b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.l
                public final String f117586c;

                /* renamed from: d, reason: collision with root package name */
                public final boolean f117587d;

                public /* synthetic */ b(String str, String str2, String str3, boolean z12, int i12, C42822w c42822w) {
                    this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? false : z12);
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return L.f(this.f117584a, bVar.f117584a) && L.f(this.f117585b, bVar.f117585b) && L.f(this.f117586c, bVar.f117586c) && this.f117587d == bVar.f117587d;
                }

                public final int hashCode() {
                    int iHashCode = this.f117584a.hashCode() * 31;
                    String str = this.f117585b;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.f117586c;
                    return Boolean.hashCode(this.f117587d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Object(title=");
                    sb2.append(this.f117584a);
                    sb2.append(", firstSubtitle=");
                    sb2.append(this.f117585b);
                    sb2.append(", secondSubtitle=");
                    sb2.append(this.f117586c);
                    sb2.append(", hasError=");
                    return androidx.appcompat.app.r.x(sb2, this.f117587d, ')');
                }

                public b(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, boolean z12) {
                    super(false, 1, null);
                    this.f117584a = str;
                    this.f117585b = str2;
                    this.f117586c = str3;
                    this.f117587d = z12;
                }
            }

            /* compiled from: ParameterElement.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$w$a$c;", "Lcom/avito/android/category_parameters/ParameterElement$w$a;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class c extends a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final String f117588a;

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final String f117589b;

                /* renamed from: c, reason: collision with root package name */
                public final boolean f117590c;

                public /* synthetic */ c(String str, String str2, boolean z12, int i12, C42822w c42822w) {
                    this(str, str2, (i12 & 4) != 0 ? false : z12);
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return L.f(this.f117588a, cVar.f117588a) && L.f(this.f117589b, cVar.f117589b) && this.f117590c == cVar.f117590c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f117590c) + androidx.compose.foundation.H.d(this.f117588a.hashCode() * 31, 31, this.f117589b);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("PriceList(title=");
                    sb2.append(this.f117588a);
                    sb2.append(", price=");
                    sb2.append(this.f117589b);
                    sb2.append(", hasError=");
                    return androidx.appcompat.app.r.x(sb2, this.f117590c, ')');
                }

                public c(@Y61.k String str, @Y61.k String str2, boolean z12) {
                    super(false, 1, null);
                    this.f117588a = str;
                    this.f117589b = str2;
                    this.f117590c = z12;
                }
            }

            public /* synthetic */ a(boolean z12, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? false : z12, null);
            }

            public a(boolean z12, C42822w c42822w) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ w(String str, String str2, AttributedText attributedText, boolean z12, String str3, String str4, String str5, List list, boolean z13, boolean z14, ItemWithState.State state, AttributedText attributedText2, String str6, boolean z15, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : attributedText, z12, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : str5, list, (i12 & 256) != 0 ? false : z13, z14, (i12 & 1024) != 0 ? new ItemWithState.State.Normal(null, 1, 0 == true ? 1 : 0) : state, (i12 & 2048) != 0 ? null : attributedText2, (i12 & 4096) != 0 ? null : str6, (i12 & 8192) != 0 ? false : z15);
        }

        @Override // JO.k
        /* renamed from: M, reason: from getter */
        public final boolean getF117609n() {
            return this.f117580p;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117577m = state;
        }

        @Override // com.avito.android.items.e
        @Y61.l
        /* renamed from: getError, reason: from getter */
        public final String getF238672c() {
            return this.f117579o;
        }

        @Override // com.avito.android.category_parameters.l
        /* renamed from: getHideTitle */
        public final boolean getF117494s() {
            throw null;
        }

        @Override // JO.i
        @Y61.l
        /* renamed from: getMotivation, reason: from getter */
        public final AttributedText getF173922g() {
            return this.f117578n;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117577m;
        }

        @Override // com.avito.android.items.e
        public final void o() {
            this.f117579o = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public w(@Y61.k String str, @Y61.k String str2, @Y61.l AttributedText attributedText, boolean z12, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.k List<? extends a> list, boolean z13, boolean z14, @Y61.k ItemWithState.State state, @Y61.l AttributedText attributedText2, @Y61.l String str6, boolean z15) {
            super(str, null);
            this.f117568d = str2;
            this.f117569e = attributedText;
            this.f117570f = z12;
            this.f117571g = str3;
            this.f117572h = str4;
            this.f117573i = str5;
            this.f117574j = list;
            this.f117575k = z13;
            this.f117576l = z14;
            this.f117577m = state;
            this.f117578n = attributedText2;
            this.f117579o = str6;
            this.f117580p = z15;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$F;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/items/ItemWithState;", "LJO/h;", "a", "b", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class F extends ParameterElement implements ItemWithState, JO.h {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ArrayList f117289d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final a f117290e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117291f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final String f117292g;

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$F$a;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f117293a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f117294b;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f117293a, aVar.f117293a) && L.f(this.f117294b, aVar.f117294b);
            }

            public final int hashCode() {
                String str = this.f117293a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f117294b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Config(title=");
                sb2.append(this.f117293a);
                sb2.append(", placeholder=");
                return C22026a.c(sb2, this.f117294b, ')');
            }

            public a(@Y61.l String str, @Y61.l String str2) {
                this.f117293a = str;
                this.f117294b = str2;
            }

            public /* synthetic */ a(String str, String str2, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
            }
        }

        public F(@Y61.k ArrayList arrayList, @Y61.k a aVar, @Y61.k ItemWithState.State state, @Y61.k String str) {
            super(str, null);
            this.f117289d = arrayList;
            this.f117290e = aVar;
            this.f117291f = state;
            this.f117292g = str;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117291f = state;
        }

        @Override // JO.h
        public final boolean b(@Y61.k JO.h hVar) {
            if (hVar instanceof F) {
                F f12 = (F) hVar;
                if (L.f(this.f117289d, f12.f117289d) && L.f(this.f117291f, f12.f117291f)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof F)) {
                return false;
            }
            F f12 = (F) obj;
            return L.f(this.f117289d, f12.f117289d) && L.f(this.f117290e, f12.f117290e) && L.f(this.f117291f, f12.f117291f) && L.f(this.f117292g, f12.f117292g);
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117291f;
        }

        public final int hashCode() {
            return this.f117292g.hashCode() + ((this.f117291f.hashCode() + ((this.f117290e.hashCode() + (this.f117289d.hashCode() * 31)) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectorCardGroupBottomSheet(options=");
            sb2.append(this.f117289d);
            sb2.append(", config=");
            sb2.append(this.f117290e);
            sb2.append(", state=");
            sb2.append(this.f117291f);
            sb2.append(", itemId=");
            return C22026a.c(sb2, this.f117292g, ')');
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$F$b;", "Lcom/avito/android/lib/design/selector_card/r;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements com.avito.android.lib.design.selector_card.r {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f117295b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f117296c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final String f117297d;

            public b(@Y61.k String str, boolean z12, @Y61.l String str2) {
                this.f117295b = str;
                this.f117296c = z12;
                this.f117297d = str2;
            }

            @Override // com.avito.android.lib.design.selector_card.r
            public final boolean a(@Y61.k com.avito.android.lib.design.selector_card.r rVar) {
                return (rVar instanceof b) && equals(rVar);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f117295b, bVar.f117295b) && this.f117296c == bVar.f117296c && L.f(this.f117297d, bVar.f117297d);
            }

            public final int hashCode() {
                int i12 = androidx.appcompat.app.r.i(this.f117295b.hashCode() * 31, 31, this.f117296c);
                String str = this.f117297d;
                return i12 + (str == null ? 0 : str.hashCode());
            }

            @Override // com.avito.android.lib.design.selector_card.r
            /* renamed from: isEnabled */
            public final boolean getF309669f() {
                return true;
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Option(id=");
                sb2.append(this.f117295b);
                sb2.append(", isSelected=");
                sb2.append(this.f117296c);
                sb2.append(", title=");
                return C22026a.c(sb2, this.f117297d, ')');
            }

            public /* synthetic */ b(String str, boolean z12, String str2, int i12, C42822w c42822w) {
                this(str, z12, (i12 & 4) != 0 ? null : str2);
            }
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$I;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/items/a;", "Lcom/avito/android/items/ItemWithState;", "Lcom/avito/android/items/e;", "Lcom/avito/android/items/ItemWithAdditionalButton;", "a", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class I extends ParameterElement implements com.avito.android.items.a, ItemWithState, com.avito.android.items.e, ItemWithAdditionalButton {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117323d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f117324e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f117325f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public String f117326g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public a f117327h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final ItemWithAdditionalButton.AdditionalButton f117328i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public String f117329j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117330k;

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$I$a;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/category_parameters/ParameterElement$I$a$a;", "Lcom/avito/android/category_parameters/ParameterElement$I$a$b;", "Lcom/avito/android/category_parameters/ParameterElement$I$a$c;", "Lcom/avito/android/category_parameters/ParameterElement$I$a$d;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class a {

            /* compiled from: ParameterElement.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$I$a$a;", "Lcom/avito/android/category_parameters/ParameterElement$I$a;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.category_parameters.ParameterElement$I$a$a, reason: collision with other inner class name */
            public static final /* data */ class C3416a extends a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final String f117331a;

                /* renamed from: b, reason: collision with root package name */
                @Y61.l
                public final Image f117332b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final Uri f117333c;

                public C3416a(@Y61.k String str, @Y61.l Image image, @Y61.k Uri uri) {
                    super(null);
                    this.f117331a = str;
                    this.f117332b = image;
                    this.f117333c = uri;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3416a)) {
                        return false;
                    }
                    C3416a c3416a = (C3416a) obj;
                    return L.f(this.f117331a, c3416a.f117331a) && L.f(this.f117332b, c3416a.f117332b) && L.f(this.f117333c, c3416a.f117333c);
                }

                public final int hashCode() {
                    int iHashCode = this.f117331a.hashCode() * 31;
                    Image image = this.f117332b;
                    return this.f117333c.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Content(title=");
                    sb2.append(this.f117331a);
                    sb2.append(", image=");
                    sb2.append(this.f117332b);
                    sb2.append(", uri=");
                    return com.avito.android.actions_sheet.a.t(sb2, this.f117333c, ')');
                }
            }

            /* compiled from: ParameterElement.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$I$a$b;", "Lcom/avito/android/category_parameters/ParameterElement$I$a;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class b extends a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final b f117334a = new b();

                public b() {
                    super(null);
                }
            }

            /* compiled from: ParameterElement.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$I$a$c;", "Lcom/avito/android/category_parameters/ParameterElement$I$a;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class c extends a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final String f117335a;

                public c(@Y61.k String str) {
                    super(null);
                    this.f117335a = str;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && L.f(this.f117335a, ((c) obj).f117335a);
                }

                public final int hashCode() {
                    return this.f117335a.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return C22026a.c(new StringBuilder("Error(message="), this.f117335a, ')');
                }
            }

            /* compiled from: ParameterElement.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$I$a$d;", "Lcom/avito/android/category_parameters/ParameterElement$I$a;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class d extends a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final d f117336a = new d();

                public d() {
                    super(null);
                }
            }

            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ I(String str, String str2, String str3, String str4, a aVar, ItemWithAdditionalButton.AdditionalButton additionalButton, String str5, ItemWithState.State state, int i12, C42822w c42822w) {
            this(str, str2, str3, str4, (i12 & 16) != 0 ? a.b.f117334a : aVar, additionalButton, str5, (i12 & 128) != 0 ? new ItemWithState.State.Normal(null, 1, 0 == true ? 1 : 0) : state);
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117330k = state;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof I)) {
                return false;
            }
            I i12 = (I) obj;
            return L.f(this.f117323d, i12.f117323d) && L.f(this.f117324e, i12.f117324e) && L.f(this.f117325f, i12.f117325f) && L.f(this.f117326g, i12.f117326g) && L.f(this.f117327h, i12.f117327h) && L.f(this.f117328i, i12.f117328i) && L.f(this.f117329j, i12.f117329j) && L.f(this.f117330k, i12.f117330k);
        }

        @Override // com.avito.android.items.e
        @Y61.l
        /* renamed from: getError, reason: from getter */
        public final String getF238672c() {
            return this.f117326g;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117330k;
        }

        @Override // com.avito.android.items.a
        @Y61.l
        /* renamed from: getValue, reason: from getter */
        public final String getF117481f() {
            return this.f117329j;
        }

        public final int hashCode() {
            int iD2 = androidx.compose.foundation.H.d(this.f117323d.hashCode() * 31, 31, this.f117324e);
            String str = this.f117325f;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f117326g;
            int iHashCode2 = (this.f117327h.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            ItemWithAdditionalButton.AdditionalButton additionalButton = this.f117328i;
            int iHashCode3 = (iHashCode2 + (additionalButton == null ? 0 : additionalButton.hashCode())) * 31;
            String str3 = this.f117329j;
            return this.f117330k.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @Override // com.avito.android.items.ItemWithAdditionalButton
        @Y61.l
        /* renamed from: l, reason: from getter */
        public final ItemWithAdditionalButton.AdditionalButton getF117488m() {
            return this.f117328i;
        }

        @Override // com.avito.android.items.a
        public final void m(@Y61.l String str) {
            this.f117329j = str;
        }

        @Override // com.avito.android.items.e
        public final void o() {
            this.f117326g = null;
        }

        @Y61.k
        public final String toString() {
            return "Video(itemId=" + this.f117323d + ", title=" + this.f117324e + ", placeholder=" + this.f117325f + ", error=" + this.f117326g + ", previewState=" + this.f117327h + ", additionalButton=" + this.f117328i + ", value=" + this.f117329j + ", state=" + this.f117330k + ')';
        }

        public I(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k a aVar, @Y61.l ItemWithAdditionalButton.AdditionalButton additionalButton, @Y61.l String str5, @Y61.k ItemWithState.State state) {
            super(str, null);
            this.f117323d = str;
            this.f117324e = str2;
            this.f117325f = str3;
            this.f117326g = str4;
            this.f117327h = aVar;
            this.f117328i = additionalButton;
            this.f117329j = str5;
            this.f117330k = state;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$p;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/items/d;", "Lcom/avito/android/category_parameters/ParameterElement$o;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p extends ParameterElement implements com.avito.android.items.d, o {

        /* renamed from: A, reason: collision with root package name */
        @Y61.l
        public final Integer f117473A;

        /* renamed from: B, reason: collision with root package name */
        public final boolean f117474B;

        /* renamed from: C, reason: collision with root package name */
        public final boolean f117475C;

        /* renamed from: D, reason: collision with root package name */
        public final boolean f117476D;

        /* renamed from: E, reason: collision with root package name */
        @Y61.l
        public final String f117477E;

        /* renamed from: F, reason: collision with root package name */
        @Y61.l
        public final PriceParameter.AbnormalPriceData f117478F;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f117479d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f117480e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public String f117481f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public String f117482g;

        /* renamed from: h, reason: collision with root package name */
        public final int f117483h;

        /* renamed from: i, reason: collision with root package name */
        public final int f117484i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final String f117485j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final String f117486k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final m f117487l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final ItemWithAdditionalButton.AdditionalButton f117488m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final DisplayingOptions f117489n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public final String f117490o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.l
        public final AttributedText f117491p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117492q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.k
        public final FormatterType f117493r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f117494s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.l
        public hJ.m f117495t;

        /* renamed from: u, reason: collision with root package name */
        @Y61.l
        public final String f117496u;

        /* renamed from: v, reason: collision with root package name */
        @Y61.l
        public final Theme f117497v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f117498w;

        /* renamed from: x, reason: collision with root package name */
        @Y61.l
        public final Boolean f117499x;

        /* renamed from: y, reason: collision with root package name */
        @Y61.l
        public final CharParameter.AutoDescription f117500y;

        /* renamed from: z, reason: collision with root package name */
        @Y61.l
        public final CharParameter.AutoBeautification f117501z;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public p(String str, String str2, String str3, String str4, int i12, int i13, String str5, String str6, m mVar, ItemWithAdditionalButton.AdditionalButton additionalButton, DisplayingOptions displayingOptions, String str7, AttributedText attributedText, ItemWithState.State state, FormatterType formatterType, boolean z12, hJ.m mVar2, String str8, Theme theme, boolean z13, Boolean bool, CharParameter.AutoDescription autoDescription, CharParameter.AutoBeautification autoBeautification, Integer num, boolean z14, boolean z15, boolean z16, String str9, PriceParameter.AbnormalPriceData abnormalPriceData, int i14, C42822w c42822w) {
            FormatterType formatterType2;
            CharSequence charSequence = null;
            Object[] objArr = 0;
            String str10 = (i14 & 4) != 0 ? null : str3;
            String str11 = (i14 & 8) != 0 ? null : str4;
            String str12 = (i14 & 64) != 0 ? null : str5;
            String str13 = (i14 & 128) != 0 ? null : str6;
            m mVar3 = (i14 & 256) != 0 ? null : mVar;
            ItemWithAdditionalButton.AdditionalButton additionalButton2 = (i14 & 512) != 0 ? null : additionalButton;
            DisplayingOptions displayingOptions2 = (i14 & 1024) != 0 ? null : displayingOptions;
            String str14 = (i14 & 2048) != 0 ? null : str7;
            AttributedText attributedText2 = (i14 & 4096) != 0 ? null : attributedText;
            ItemWithState.State normal = (i14 & 8192) != 0 ? new ItemWithState.State.Normal(charSequence, 1, objArr == true ? 1 : 0) : state;
            if ((i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                FormatterType.f179288e.getClass();
                formatterType2 = FormatterType.f179289f;
            } else {
                formatterType2 = formatterType;
            }
            this(str, str2, str10, str11, i12, i13, str12, str13, mVar3, additionalButton2, displayingOptions2, str14, attributedText2, normal, formatterType2, (32768 & i14) != 0 ? false : z12, (65536 & i14) != 0 ? null : mVar2, (131072 & i14) != 0 ? null : str8, (262144 & i14) != 0 ? null : theme, (524288 & i14) != 0 ? false : z13, (1048576 & i14) != 0 ? null : bool, (2097152 & i14) != 0 ? null : autoDescription, (4194304 & i14) != 0 ? null : autoBeautification, (8388608 & i14) != 0 ? null : num, (16777216 & i14) != 0 ? false : z14, (33554432 & i14) != 0 ? false : z15, (67108864 & i14) != 0 ? true : z16, (134217728 & i14) != 0 ? null : str9, (i14 & 268435456) != 0 ? null : abnormalPriceData);
        }

        public static p f(p pVar, String str, String str2, ItemWithState.State state, String str3, int i12) {
            AttributedText attributedText;
            String str4;
            Integer numValueOf = Integer.valueOf(R.attr.textAreaWhiteBackgroundM);
            String str5 = (i12 & 1) != 0 ? pVar.f117479d : str;
            String str6 = (i12 & 2) != 0 ? pVar.f117480e : str2;
            String str7 = pVar.f117481f;
            String str8 = pVar.f117482g;
            int i13 = pVar.f117483h;
            int i14 = pVar.f117484i;
            String str9 = pVar.f117485j;
            String str10 = pVar.f117486k;
            m mVar = pVar.f117487l;
            ItemWithAdditionalButton.AdditionalButton additionalButton = pVar.f117488m;
            DisplayingOptions displayingOptions = pVar.f117489n;
            String str11 = pVar.f117490o;
            AttributedText attributedText2 = pVar.f117491p;
            ItemWithState.State state2 = (i12 & 8192) != 0 ? pVar.f117492q : state;
            FormatterType formatterType = pVar.f117493r;
            boolean z12 = pVar.f117494s;
            hJ.m mVar2 = pVar.f117495t;
            if ((i12 & 131072) != 0) {
                attributedText = attributedText2;
                str4 = pVar.f117496u;
            } else {
                attributedText = attributedText2;
                str4 = str3;
            }
            Theme theme = pVar.f117497v;
            boolean z13 = pVar.f117498w;
            Boolean bool = pVar.f117499x;
            CharParameter.AutoDescription autoDescription = pVar.f117500y;
            CharParameter.AutoBeautification autoBeautification = pVar.f117501z;
            Integer num = (i12 & 8388608) != 0 ? pVar.f117473A : numValueOf;
            boolean z14 = pVar.f117474B;
            boolean z15 = pVar.f117475C;
            boolean z16 = pVar.f117476D;
            String str12 = pVar.f117477E;
            PriceParameter.AbnormalPriceData abnormalPriceData = pVar.f117478F;
            pVar.getClass();
            return new p(str5, str6, str7, str8, i13, i14, str9, str10, mVar, additionalButton, displayingOptions, str11, attributedText, state2, formatterType, z12, mVar2, str4, theme, z13, bool, autoDescription, autoBeautification, num, z14, z15, z16, str12, abnormalPriceData);
        }

        @Override // com.avito.android.items.d
        @Y61.l
        /* renamed from: C1, reason: from getter */
        public final CharParameter.AutoDescription getF117500y() {
            return this.f117500y;
        }

        @Override // com.avito.android.items.d
        @Y61.l
        /* renamed from: J, reason: from getter */
        public final Integer getF117473A() {
            return this.f117473A;
        }

        @Override // com.avito.android.items.d
        /* renamed from: J1, reason: from getter */
        public final boolean getF117476D() {
            return this.f117476D;
        }

        @Override // com.avito.android.items.d
        /* renamed from: L0, reason: from getter */
        public final int getF117484i() {
            return this.f117484i;
        }

        @Override // JO.k
        /* renamed from: M, reason: from getter */
        public final boolean getF117609n() {
            return this.f117474B;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117492q = state;
        }

        @Override // com.avito.android.items.d
        @Y61.l
        /* renamed from: P0, reason: from getter */
        public final CharParameter.AutoBeautification getF117501z() {
            return this.f117501z;
        }

        @Override // JO.j
        /* renamed from: a, reason: from getter */
        public final boolean getF117475C() {
            return this.f117475C;
        }

        @Override // com.avito.android.items.d
        @Y61.l
        /* renamed from: b1, reason: from getter */
        public final String getF117485j() {
            return this.f117485j;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return L.f(this.f117479d, pVar.f117479d) && L.f(this.f117480e, pVar.f117480e) && L.f(this.f117481f, pVar.f117481f) && L.f(this.f117482g, pVar.f117482g) && this.f117483h == pVar.f117483h && this.f117484i == pVar.f117484i && L.f(this.f117485j, pVar.f117485j) && L.f(this.f117486k, pVar.f117486k) && L.f(this.f117487l, pVar.f117487l) && L.f(this.f117488m, pVar.f117488m) && L.f(this.f117489n, pVar.f117489n) && L.f(this.f117490o, pVar.f117490o) && L.f(this.f117491p, pVar.f117491p) && L.f(this.f117492q, pVar.f117492q) && L.f(this.f117493r, pVar.f117493r) && this.f117494s == pVar.f117494s && L.f(this.f117495t, pVar.f117495t) && L.f(this.f117496u, pVar.f117496u) && this.f117497v == pVar.f117497v && this.f117498w == pVar.f117498w && L.f(this.f117499x, pVar.f117499x) && L.f(this.f117500y, pVar.f117500y) && L.f(this.f117501z, pVar.f117501z) && L.f(this.f117473A, pVar.f117473A) && this.f117474B == pVar.f117474B && this.f117475C == pVar.f117475C && this.f117476D == pVar.f117476D && L.f(this.f117477E, pVar.f117477E) && L.f(this.f117478F, pVar.f117478F);
        }

        @Override // com.avito.android.items.d
        @Y61.l
        /* renamed from: getDescription, reason: from getter */
        public final String getF117477E() {
            return this.f117477E;
        }

        @Override // com.avito.android.items.d
        @Y61.l
        /* renamed from: getDisplayingOptions, reason: from getter */
        public final DisplayingOptions getF117489n() {
            return this.f117489n;
        }

        @Override // com.avito.android.items.e
        @Y61.l
        /* renamed from: getError, reason: from getter */
        public final String getF238672c() {
            return this.f117482g;
        }

        @Override // com.avito.android.category_parameters.ParameterElement.o
        @Y61.l
        /* renamed from: getGroupId, reason: from getter */
        public final String getF173926k() {
            return this.f117496u;
        }

        @Override // com.avito.android.category_parameters.l
        /* renamed from: getHideTitle, reason: from getter */
        public final boolean getF117494s() {
            return this.f117494s;
        }

        @Override // com.avito.android.items.d
        @Y61.k
        /* renamed from: getInputType, reason: from getter */
        public final FormatterType getF117493r() {
            return this.f117493r;
        }

        @Override // JO.i
        @Y61.l
        /* renamed from: getMotivation, reason: from getter */
        public final AttributedText getF173922g() {
            return this.f117491p;
        }

        @Override // com.avito.android.items.d
        @Y61.l
        /* renamed from: getPlaceholder, reason: from getter */
        public final String getF117490o() {
            return this.f117490o;
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117492q;
        }

        @Override // com.avito.android.category_parameters.g
        @Y61.l
        /* renamed from: getTheme, reason: from getter */
        public final Theme getF117608m() {
            return this.f117497v;
        }

        @Override // com.avito.android.items.d
        @Y61.k
        /* renamed from: getTitle, reason: from getter */
        public final String getF117480e() {
            return this.f117480e;
        }

        @Override // com.avito.android.items.d, com.avito.android.items.a
        @Y61.l
        /* renamed from: getValue, reason: from getter */
        public final String getF117481f() {
            return this.f117481f;
        }

        @Override // com.avito.android.items.d
        /* renamed from: h0, reason: from getter */
        public final boolean getF117498w() {
            return this.f117498w;
        }

        public final int hashCode() {
            int iD2 = androidx.compose.foundation.H.d(this.f117479d.hashCode() * 31, 31, this.f117480e);
            String str = this.f117481f;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f117482g;
            int iE2 = androidx.appcompat.app.r.e(this.f117484i, androidx.appcompat.app.r.e(this.f117483h, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
            String str3 = this.f117485j;
            int iHashCode2 = (iE2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f117486k;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            m mVar = this.f117487l;
            int iHashCode4 = (iHashCode3 + (mVar == null ? 0 : mVar.hashCode())) * 31;
            ItemWithAdditionalButton.AdditionalButton additionalButton = this.f117488m;
            int iHashCode5 = (iHashCode4 + (additionalButton == null ? 0 : additionalButton.hashCode())) * 31;
            DisplayingOptions displayingOptions = this.f117489n;
            int iHashCode6 = (iHashCode5 + (displayingOptions == null ? 0 : displayingOptions.hashCode())) * 31;
            String str5 = this.f117490o;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            AttributedText attributedText = this.f117491p;
            int i12 = androidx.appcompat.app.r.i((this.f117493r.hashCode() + ((this.f117492q.hashCode() + ((iHashCode7 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31)) * 31, 31, this.f117494s);
            hJ.m mVar2 = this.f117495t;
            int iHashCode8 = (i12 + (mVar2 == null ? 0 : mVar2.hashCode())) * 31;
            String str6 = this.f117496u;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Theme theme = this.f117497v;
            int i13 = androidx.appcompat.app.r.i((iHashCode9 + (theme == null ? 0 : theme.hashCode())) * 31, 31, this.f117498w);
            Boolean bool = this.f117499x;
            int iHashCode10 = (i13 + (bool == null ? 0 : bool.hashCode())) * 31;
            CharParameter.AutoDescription autoDescription = this.f117500y;
            int iHashCode11 = (iHashCode10 + (autoDescription == null ? 0 : autoDescription.hashCode())) * 31;
            CharParameter.AutoBeautification autoBeautification = this.f117501z;
            int iHashCode12 = (iHashCode11 + (autoBeautification == null ? 0 : autoBeautification.hashCode())) * 31;
            Integer num = this.f117473A;
            int i14 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode12 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f117474B), 31, this.f117475C), 31, this.f117476D);
            String str7 = this.f117477E;
            int iHashCode13 = (i14 + (str7 == null ? 0 : str7.hashCode())) * 31;
            PriceParameter.AbnormalPriceData abnormalPriceData = this.f117478F;
            return iHashCode13 + (abnormalPriceData != null ? abnormalPriceData.hashCode() : 0);
        }

        @Override // com.avito.android.items.d
        @Y61.l
        /* renamed from: j1, reason: from getter */
        public final PriceParameter.AbnormalPriceData getF117478F() {
            return this.f117478F;
        }

        @Override // com.avito.android.items.d, com.avito.android.items.ItemWithAdditionalButton
        @Y61.l
        /* renamed from: l, reason: from getter */
        public final ItemWithAdditionalButton.AdditionalButton getF117488m() {
            return this.f117488m;
        }

        @Override // com.avito.android.items.d, com.avito.android.items.a
        public final void m(@Y61.l String str) {
            this.f117481f = str;
        }

        @Override // com.avito.android.items.f
        @Y61.l
        /* renamed from: n, reason: from getter */
        public final hJ.m getF117495t() {
            return this.f117495t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.avito.android.items.d, com.avito.android.items.e
        public final void o() {
            this.f117482g = null;
            this.f117492q = new ItemWithState.State.Normal(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.items.d
        @Y61.l
        /* renamed from: q0, reason: from getter */
        public final String getF117486k() {
            return this.f117486k;
        }

        @Override // com.avito.android.items.d
        @Y61.l
        /* renamed from: t, reason: from getter */
        public final Boolean getF117499x() {
            return this.f117499x;
        }

        @Y61.k
        public final String toString() {
            return "Input(itemId=" + this.f117479d + ", title=" + this.f117480e + ", value=" + this.f117481f + ", error=" + this.f117482g + ", androidSdkInputType=" + this.f117483h + ", lines=" + this.f117484i + ", prefix=" + this.f117485j + ", postfix=" + this.f117486k + ", format=" + this.f117487l + ", additionalButton=" + this.f117488m + ", displayingOptions=" + this.f117489n + ", placeholder=" + this.f117490o + ", motivation=" + this.f117491p + ", state=" + this.f117492q + ", inputType=" + this.f117493r + ", hideTitle=" + this.f117494s + ", htmlRootNode=" + this.f117495t + ", groupId=" + this.f117496u + ", theme=" + this.f117497v + ", shouldHideValueForAnalytics=" + this.f117498w + ", withClearButton=" + this.f117499x + ", autoDescription=" + this.f117500y + ", autoBeautification=" + this.f117501z + ", inputStyleAttr=" + this.f117473A + ", toFillIn=" + this.f117474B + ", showRequiredFieldSign=" + this.f117475C + ", needFormatting=" + this.f117476D + ", description=" + this.f117477E + ", abnormalPriceData=" + this.f117478F + ')';
        }

        @Override // com.avito.android.items.f
        public final void z1(@Y61.l hJ.m mVar) {
            this.f117495t = mVar;
        }

        public p(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, int i12, int i13, @Y61.l String str5, @Y61.l String str6, @Y61.l m mVar, @Y61.l ItemWithAdditionalButton.AdditionalButton additionalButton, @Y61.l DisplayingOptions displayingOptions, @Y61.l String str7, @Y61.l AttributedText attributedText, @Y61.k ItemWithState.State state, @Y61.k FormatterType formatterType, boolean z12, @Y61.l hJ.m mVar2, @Y61.l String str8, @Y61.l Theme theme, boolean z13, @Y61.l Boolean bool, @Y61.l CharParameter.AutoDescription autoDescription, @Y61.l CharParameter.AutoBeautification autoBeautification, @Y61.l Integer num, boolean z14, boolean z15, boolean z16, @Y61.l String str9, @Y61.l PriceParameter.AbnormalPriceData abnormalPriceData) {
            super(str, null);
            this.f117479d = str;
            this.f117480e = str2;
            this.f117481f = str3;
            this.f117482g = str4;
            this.f117483h = i12;
            this.f117484i = i13;
            this.f117485j = str5;
            this.f117486k = str6;
            this.f117487l = mVar;
            this.f117488m = additionalButton;
            this.f117489n = displayingOptions;
            this.f117490o = str7;
            this.f117491p = attributedText;
            this.f117492q = state;
            this.f117493r = formatterType;
            this.f117494s = z12;
            this.f117495t = mVar2;
            this.f117496u = str8;
            this.f117497v = theme;
            this.f117498w = z13;
            this.f117499x = bool;
            this.f117500y = autoDescription;
            this.f117501z = autoBeautification;
            this.f117473A = num;
            this.f117474B = z14;
            this.f117475C = z15;
            this.f117476D = z16;
            this.f117477E = str9;
            this.f117478F = abnormalPriceData;
        }
    }

    /* compiled from: ParameterElement.kt */
    @P
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$E;", "Lcom/avito/android/category_parameters/ParameterElement;", "Lcom/avito/android/items/ItemWithState;", "LJO/h;", "a", "b", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class E extends ParameterElement implements ItemWithState, JO.h {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ArrayList f117277d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final a f117278e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public ItemWithState.State f117279f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final String f117280g;

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$E$a;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final Integer f117281a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Integer f117282b;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f117281a, aVar.f117281a) && L.f(this.f117282b, aVar.f117282b);
            }

            public final int hashCode() {
                Integer num = this.f117281a;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.f117282b;
                return iHashCode + (num2 != null ? num2.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Config(itemSpacing=");
                sb2.append(this.f117281a);
                sb2.append(", cardHeight=");
                return com.akita.compose.component.accordion.s.j(sb2, this.f117282b, ')');
            }

            public a(@Y61.l Integer num, @Y61.l Integer num2) {
                this.f117281a = num;
                this.f117282b = num2;
            }

            public /* synthetic */ a(Integer num, Integer num2, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : num2);
            }
        }

        public E(@Y61.k ArrayList arrayList, @Y61.k a aVar, @Y61.k ItemWithState.State state, @Y61.k String str) {
            super(str, null);
            this.f117277d = arrayList;
            this.f117278e = aVar;
            this.f117279f = state;
            this.f117280g = str;
        }

        @Override // com.avito.android.items.ItemWithState
        public final void O0(@Y61.k ItemWithState.State state) {
            this.f117279f = state;
        }

        @Override // JO.h
        public final boolean b(@Y61.k JO.h hVar) {
            if (hVar instanceof E) {
                E e12 = (E) hVar;
                if (L.f(this.f117277d, e12.f117277d) && L.f(this.f117279f, e12.f117279f)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof E)) {
                return false;
            }
            E e12 = (E) obj;
            return L.f(this.f117277d, e12.f117277d) && L.f(this.f117278e, e12.f117278e) && L.f(this.f117279f, e12.f117279f) && L.f(this.f117280g, e12.f117280g);
        }

        @Override // com.avito.android.items.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF236853c() {
            return this.f117279f;
        }

        public final int hashCode() {
            return this.f117280g.hashCode() + ((this.f117279f.hashCode() + ((this.f117278e.hashCode() + (this.f117277d.hashCode() * 31)) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectorCardGroup(options=");
            sb2.append(this.f117277d);
            sb2.append(", config=");
            sb2.append(this.f117278e);
            sb2.append(", state=");
            sb2.append(this.f117279f);
            sb2.append(", itemId=");
            return C22026a.c(sb2, this.f117280g, ')');
        }

        /* compiled from: ParameterElement.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$E$b;", "Lcom/avito/android/lib/design/selector_card/r;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements com.avito.android.lib.design.selector_card.r {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f117283b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f117284c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f117285d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final String f117286e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.l
            public final UniversalImage f117287f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.l
            public final List<BeduinModel> f117288g;

            /* JADX WARN: Multi-variable type inference failed */
            public b(@Y61.k String str, boolean z12, boolean z13, @Y61.l String str2, @Y61.l UniversalImage universalImage, @Y61.l List<? extends BeduinModel> list) {
                this.f117283b = str;
                this.f117284c = z12;
                this.f117285d = z13;
                this.f117286e = str2;
                this.f117287f = universalImage;
                this.f117288g = list;
            }

            @Override // com.avito.android.lib.design.selector_card.r
            public final boolean a(@Y61.k com.avito.android.lib.design.selector_card.r rVar) {
                return (rVar instanceof b) && equals(rVar);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f117283b, bVar.f117283b) && this.f117284c == bVar.f117284c && this.f117285d == bVar.f117285d && L.f(this.f117286e, bVar.f117286e) && L.f(this.f117287f, bVar.f117287f) && L.f(this.f117288g, bVar.f117288g);
            }

            public final int hashCode() {
                int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(this.f117283b.hashCode() * 31, 31, this.f117284c), 31, this.f117285d);
                String str = this.f117286e;
                int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
                UniversalImage universalImage = this.f117287f;
                int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
                List<BeduinModel> list = this.f117288g;
                return iHashCode2 + (list != null ? list.hashCode() : 0);
            }

            @Override // com.avito.android.lib.design.selector_card.r
            /* renamed from: isEnabled */
            public final boolean getF309669f() {
                return true;
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Option(id=");
                sb2.append(this.f117283b);
                sb2.append(", isSelected=");
                sb2.append(this.f117284c);
                sb2.append(", isSingleValue=");
                sb2.append(this.f117285d);
                sb2.append(", title=");
                sb2.append(this.f117286e);
                sb2.append(", image=");
                sb2.append(this.f117287f);
                sb2.append(", beduinForm=");
                return androidx.compose.foundation.H.p(sb2, this.f117288g, ')');
            }

            public /* synthetic */ b(String str, boolean z12, boolean z13, String str2, UniversalImage universalImage, List list, int i12, C42822w c42822w) {
                this(str, z12, z13, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : universalImage, (i12 & 32) != 0 ? null : list);
            }
        }
    }
}
