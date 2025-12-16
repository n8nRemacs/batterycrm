package com.avito.android.search.filter.converter;

import Cp0.InterfaceC13339c;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinUniversalPageContent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.Badge;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;
import com.avito.android.remote.model.category_parameters.ClearanceValue;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.GroupMarkerParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.NavigationNode;
import com.avito.android.remote.model.category_parameters.OnboardingConfig;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.remote.model.category_parameters.TipIconParameters;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.search.filter.converter.common.ItemWithAdditionalButton;
import com.avito.android.search.filter.converter.common.ItemWithState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
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

/* compiled from: ParameterElement.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u001d\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u0082\u0001\u001b\u001f !\"#$%&'()*+,-./0123456789¨\u0006:"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement;", "Lcom/avito/conveyor_item/a;", "a", "b", "c", "d", "e", "f", "DisplayType", "g", "h", "i", "j", "k", "l", "m", "n", "Header", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "Lcom/avito/android/search/filter/converter/ParameterElement$a;", "Lcom/avito/android/search/filter/converter/ParameterElement$b;", "Lcom/avito/android/search/filter/converter/ParameterElement$c;", "Lcom/avito/android/search/filter/converter/ParameterElement$d;", "Lcom/avito/android/search/filter/converter/ParameterElement$e;", "Lcom/avito/android/search/filter/converter/ParameterElement$f;", "Lcom/avito/android/search/filter/converter/ParameterElement$g;", "Lcom/avito/android/search/filter/converter/ParameterElement$h;", "Lcom/avito/android/search/filter/converter/ParameterElement$i;", "Lcom/avito/android/search/filter/converter/ParameterElement$k;", "Lcom/avito/android/search/filter/converter/ParameterElement$l;", "Lcom/avito/android/search/filter/converter/ParameterElement$n;", "Lcom/avito/android/search/filter/converter/ParameterElement$Header;", "Lcom/avito/android/search/filter/converter/ParameterElement$o;", "Lcom/avito/android/search/filter/converter/ParameterElement$p;", "Lcom/avito/android/search/filter/converter/ParameterElement$q;", "Lcom/avito/android/search/filter/converter/ParameterElement$r;", "Lcom/avito/android/search/filter/converter/ParameterElement$s;", "Lcom/avito/android/search/filter/converter/ParameterElement$t;", "Lcom/avito/android/search/filter/converter/ParameterElement$u;", "Lcom/avito/android/search/filter/converter/ParameterElement$v;", "Lcom/avito/android/search/filter/converter/ParameterElement$v$a;", "Lcom/avito/android/search/filter/converter/ParameterElement$w;", "Lcom/avito/android/search/filter/converter/ParameterElement$x;", "Lcom/avito/android/search/filter/converter/ParameterElement$y;", "Lcom/avito/android/search/filter/converter/ParameterElement$z;", "Lcom/avito/android/search/filter/converter/ParameterElement$A;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ParameterElement implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f262689b;

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$A;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class A extends ParameterElement {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262690c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f262691d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f262692e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f262693f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Image f262694g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f262695h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final Long f262696i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final Boolean f262697j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final OnboardingConfig f262698k;

        public A(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Image image, @Y61.l String str5, @Y61.l Long l12, @Y61.l Boolean bool, @Y61.l OnboardingConfig onboardingConfig) {
            super(str, null);
            this.f262690c = str;
            this.f262691d = str2;
            this.f262692e = str3;
            this.f262693f = str4;
            this.f262694g = image;
            this.f262695h = str5;
            this.f262696i = l12;
            this.f262697j = bool;
            this.f262698k = onboardingConfig;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof A)) {
                return false;
            }
            A a12 = (A) obj;
            return L.f(this.f262690c, a12.f262690c) && L.f(this.f262691d, a12.f262691d) && L.f(this.f262692e, a12.f262692e) && L.f(this.f262693f, a12.f262693f) && L.f(this.f262694g, a12.f262694g) && L.f(this.f262695h, a12.f262695h) && L.f(this.f262696i, a12.f262696i) && L.f(this.f262697j, a12.f262697j) && L.f(this.f262698k, a12.f262698k);
        }

        public final int hashCode() {
            int iHashCode = this.f262690c.hashCode() * 31;
            String str = this.f262691d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f262692e;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f262693f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Image image = this.f262694g;
            int iHashCode5 = (iHashCode4 + (image == null ? 0 : image.hashCode())) * 31;
            String str4 = this.f262695h;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Long l12 = this.f262696i;
            int iHashCode7 = (iHashCode6 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Boolean bool = this.f262697j;
            int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
            OnboardingConfig onboardingConfig = this.f262698k;
            return iHashCode8 + (onboardingConfig != null ? onboardingConfig.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "VideoUpload(itemId=" + this.f262690c + ", title=" + this.f262691d + ", description=" + this.f262692e + ", videoId=" + this.f262693f + ", thumbnail=" + this.f262694g + ", error=" + this.f262695h + ", maxFileSize=" + this.f262696i + ", isNew=" + this.f262697j + ", onboarding=" + this.f262698k + ')';
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType;", "", "<init>", "()V", "a", "b", "c", "d", "Chips", "e", "f", "g", "h", "i", "j", "k", "l", "m", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$a;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$b;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$c;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$d;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$Chips;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$e;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$f;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$g;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$h;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$i;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$j;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$k;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$l;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$m;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class DisplayType {

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$Chips;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType;", "Style", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Chips extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final Style f262699a;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ParameterElement.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$Chips$Style;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Style {

                /* renamed from: b, reason: collision with root package name */
                public static final Style f262700b;

                /* renamed from: c, reason: collision with root package name */
                public static final Style f262701c;

                /* renamed from: d, reason: collision with root package name */
                public static final Style f262702d;

                /* renamed from: e, reason: collision with root package name */
                public static final Style f262703e;

                /* renamed from: f, reason: collision with root package name */
                public static final /* synthetic */ Style[] f262704f;

                /* renamed from: g, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f262705g;

                static {
                    Style style = new Style("SINGLE_LINE_FIXED", 0);
                    f262700b = style;
                    Style style2 = new Style("SINGLE_LINE_STRETCH", 1);
                    f262701c = style2;
                    Style style3 = new Style("SINGLE_LINE_SCROLLABLE", 2);
                    f262702d = style3;
                    Style style4 = new Style("MULTIPLE_LINES", 3);
                    f262703e = style4;
                    Style[] styleArr = {style, style2, style3, style4};
                    f262704f = styleArr;
                    f262705g = kotlin.enums.c.a(styleArr);
                }

                public Style() {
                    throw null;
                }

                public static Style valueOf(String str) {
                    return (Style) Enum.valueOf(Style.class, str);
                }

                public static Style[] values() {
                    return (Style[]) f262704f.clone();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Chips() {
                this(false, null, 3, 0 == true ? 1 : 0);
            }

            public Chips(@Y61.l Style style) {
                super(null);
                this.f262699a = style;
            }

            public /* synthetic */ Chips(boolean z12, Style style, int i12, C42822w c42822w) {
                this((i12 & 2) != 0 ? null : style);
            }
        }

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$a;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f262706a = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$b;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f262707a = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$c;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f262708a = new c();

            public c() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$d;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f262709a = new d();

            public d() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$e;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final e f262710a = new e();

            public e() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$f;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class f extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final f f262711a = new f();

            public f() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$g;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class g extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final g f262712a = new g();

            public g() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$h;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class h extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final h f262713a = new h();

            public h() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$i;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class i extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final i f262714a = new i();

            public i() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$j;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class j extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final j f262715a = new j();

            public j() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$k;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class k extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final k f262716a = new k();

            public k() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$l;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class l extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final l f262717a = new l();

            public l() {
                super(null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType$m;", "Lcom/avito/android/search/filter/converter/ParameterElement$DisplayType;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class m extends DisplayType {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final m f262718a = new m();

            public m() {
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$Header;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "Lcom/avito/android/search/filter/converter/ParameterElement$m;", "Type", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Header extends ParameterElement implements m {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262719c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Type f262720d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f262721e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$Header$Type;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            /* renamed from: b, reason: collision with root package name */
            public static final Type f262722b;

            /* renamed from: c, reason: collision with root package name */
            public static final Type f262723c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Type[] f262724d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f262725e;

            static {
                Type type = new Type("H2", 0);
                f262722b = type;
                Type type2 = new Type("H5", 1);
                f262723c = type2;
                Type[] typeArr = {type, type2};
                f262724d = typeArr;
                f262725e = kotlin.enums.c.a(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f262724d.clone();
            }
        }

        public Header(@Y61.k String str, @Y61.k String str2, @Y61.k Type type, @Y61.l String str3) {
            super(str, null);
            this.f262719c = str2;
            this.f262720d = type;
            this.f262721e = str3;
        }

        @Override // com.avito.android.search.filter.converter.ParameterElement.m
        @Y61.l
        /* renamed from: getGroupId, reason: from getter */
        public final String getF262942j() {
            return this.f262721e;
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$a;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.search.filter.converter.ParameterElement$a, reason: case insensitive filesystem */
    public static final class C34553a extends ParameterElement {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262726c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f262727d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f262728e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f262729f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final BeduinUniversalPageContent f262730g;

        public C34553a(String str, String str2, String str3, String str4, boolean z12, boolean z13, BeduinUniversalPageContent beduinUniversalPageContent, int i12, C42822w c42822w) {
            super(str, null);
            this.f262726c = str;
            this.f262727d = str2;
            this.f262728e = str3;
            this.f262729f = str4;
            this.f262730g = beduinUniversalPageContent;
        }

        @Override // com.avito.android.search.filter.converter.ParameterElement, com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF2713d() {
            return this.f262726c;
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$b;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends ParameterElement {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262731c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f262732d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final List<Cp0.e> f262733e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f262734f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f262735g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Boolean f262736h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final BottomSheetGroupParameter.PluralString f262737i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final BottomSheetGroupParameter.PluralString f262738j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final Map<String, Set<String>> f262739k;

        public /* synthetic */ b(String str, String str2, List list, String str3, String str4, Boolean bool, BottomSheetGroupParameter.PluralString pluralString, BottomSheetGroupParameter.PluralString pluralString2, Map map, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : list, str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : bool, pluralString, pluralString2, (i12 & 256) != 0 ? null : map);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f262731c, bVar.f262731c) && L.f(this.f262732d, bVar.f262732d) && L.f(this.f262733e, bVar.f262733e) && L.f(this.f262734f, bVar.f262734f) && L.f(this.f262735g, bVar.f262735g) && L.f(this.f262736h, bVar.f262736h) && L.f(this.f262737i, bVar.f262737i) && L.f(this.f262738j, bVar.f262738j) && L.f(this.f262739k, bVar.f262739k);
        }

        @Override // com.avito.android.search.filter.converter.ParameterElement, com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF2713d() {
            return this.f262731c;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f262731c.hashCode() * 31, 31, this.f262732d);
            List<Cp0.e> list = this.f262733e;
            int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.f262734f;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f262735g;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.f262736h;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            BottomSheetGroupParameter.PluralString pluralString = this.f262737i;
            int iHashCode5 = (iHashCode4 + (pluralString == null ? 0 : pluralString.hashCode())) * 31;
            BottomSheetGroupParameter.PluralString pluralString2 = this.f262738j;
            int iHashCode6 = (iHashCode5 + (pluralString2 == null ? 0 : pluralString2.hashCode())) * 31;
            Map<String, Set<String>> map = this.f262739k;
            return iHashCode6 + (map != null ? map.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomSheetGroup(stringId=");
            sb2.append(this.f262731c);
            sb2.append(", title=");
            sb2.append(this.f262732d);
            sb2.append(", outsideCheckboxesState=");
            sb2.append(this.f262733e);
            sb2.append(", placeholder=");
            sb2.append(this.f262734f);
            sb2.append(", value=");
            sb2.append(this.f262735g);
            sb2.append(", onboardingEnabled=");
            sb2.append(this.f262736h);
            sb2.append(", titlePlurals=");
            sb2.append(this.f262737i);
            sb2.append(", titlePluralsMore=");
            sb2.append(this.f262738j);
            sb2.append(", selectedValues=");
            return androidx.appcompat.app.r.w(sb2, this.f262739k, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k String str, @Y61.k String str2, @Y61.l List<Cp0.e> list, @Y61.l String str3, @Y61.l String str4, @Y61.l Boolean bool, @Y61.l BottomSheetGroupParameter.PluralString pluralString, @Y61.l BottomSheetGroupParameter.PluralString pluralString2, @Y61.l Map<String, ? extends Set<String>> map) {
            super(str, null);
            this.f262731c = str;
            this.f262732d = str2;
            this.f262733e = list;
            this.f262734f = str3;
            this.f262735g = str4;
            this.f262736h = bool;
            this.f262737i = pluralString;
            this.f262738j = pluralString2;
            this.f262739k = map;
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$c;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "Lcom/avito/android/search/filter/converter/common/e;", "Lcom/avito/android/search/filter/converter/common/ItemWithState;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends ParameterElement implements com.avito.android.search.filter.converter.common.e, ItemWithState {
        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, String str2, String str3, ItemWithState.State state, int i12, C42822w c42822w) {
            CharSequence charSequence = null;
            Object[] objArr = 0;
            if ((i12 & 8) != 0) {
                new ItemWithState.State.Normal(charSequence, 1, objArr == true ? 1 : 0);
            }
            super(str, null);
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$d;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends ParameterElement {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262740c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f262741d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final AttributedText f262742e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final List<ParameterElement> f262743f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final List<NavigationNode> f262744g;

        public d() {
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, AttributedText attributedText, List list, List list2, int i12, C42822w c42822w) {
            super(str, null);
            attributedText = (i12 & 4) != 0 ? null : attributedText;
            list2 = (i12 & 16) != 0 ? null : list2;
            this.f262740c = str;
            this.f262741d = str2;
            this.f262742e = attributedText;
            this.f262743f = list;
            this.f262744g = list2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f262740c, dVar.f262740c) && L.f(this.f262741d, dVar.f262741d) && L.f(this.f262742e, dVar.f262742e) && L.f(this.f262743f, dVar.f262743f) && L.f(this.f262744g, dVar.f262744g);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f262740c.hashCode() * 31, 31, this.f262741d);
            AttributedText attributedText = this.f262742e;
            int iE2 = H.e((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f262743f);
            List<NavigationNode> list = this.f262744g;
            return iE2 + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CategoryGroup(itemId=");
            sb2.append(this.f262740c);
            sb2.append(", title=");
            sb2.append(this.f262741d);
            sb2.append(", subtitle=");
            sb2.append(this.f262742e);
            sb2.append(", elements=");
            sb2.append(this.f262743f);
            sb2.append(", backNavigation=");
            return H.p(sb2, this.f262744g, ')');
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$e;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "Lcom/avito/android/search/filter/converter/l;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends ParameterElement implements com.avito.android.search.filter.converter.l {

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final f f262745c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final f f262746d;

        public e(@Y61.k String str, @Y61.l f fVar, @Y61.l f fVar2) {
            super(str, null);
            this.f262745c = fVar;
            this.f262746d = fVar2;
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$g;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "Lcom/avito/android/search/filter/converter/ParameterElement$m;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g extends ParameterElement implements m {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262751c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f262752d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final o f262753e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final o f262754f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f262755g;

        public /* synthetic */ g(String str, String str2, o oVar, o oVar2, String str3, int i12, C42822w c42822w) {
            this(str, str2, oVar, oVar2, (i12 & 16) != 0 ? null : str3);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f262751c, gVar.f262751c) && L.f(this.f262752d, gVar.f262752d) && L.f(this.f262753e, gVar.f262753e) && L.f(this.f262754f, gVar.f262754f) && L.f(this.f262755g, gVar.f262755g);
        }

        @Override // com.avito.android.search.filter.converter.ParameterElement.m
        @Y61.l
        /* renamed from: getGroupId, reason: from getter */
        public final String getF262942j() {
            return this.f262755g;
        }

        public final int hashCode() {
            int iHashCode = this.f262751c.hashCode() * 31;
            String str = this.f262752d;
            int iHashCode2 = (this.f262754f.hashCode() + ((this.f262753e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
            String str2 = this.f262755g;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DoubleInput(itemId=");
            sb2.append(this.f262751c);
            sb2.append(", title=");
            sb2.append(this.f262752d);
            sb2.append(", inputFirst=");
            sb2.append(this.f262753e);
            sb2.append(", inputSecond=");
            sb2.append(this.f262754f);
            sb2.append(", groupId=");
            return C22026a.c(sb2, this.f262755g, ')');
        }

        public g(@Y61.k String str, @Y61.l String str2, @Y61.k o oVar, @Y61.k o oVar2, @Y61.l String str3) {
            super(str, null);
            this.f262751c = str;
            this.f262752d = str2;
            this.f262753e = oVar;
            this.f262754f = oVar2;
            this.f262755g = str3;
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$h;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "Lcom/avito/android/search/filter/converter/common/e;", "Lcom/avito/android/search/filter/converter/common/ItemWithState;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h extends ParameterElement implements com.avito.android.search.filter.converter.common.e, ItemWithState {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262756c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f262757d;

        /* JADX WARN: Multi-variable type inference failed */
        public h(String str, String str2, String str3, String str4, ItemWithState.State state, boolean z12, int i12, C42822w c42822w) {
            CharSequence charSequence = null;
            Object[] objArr = 0;
            if ((i12 & 16) != 0) {
                new ItemWithState.State.Normal(charSequence, 1, objArr == true ? 1 : 0);
            }
            super(str, null);
            this.f262756c = str2;
            this.f262757d = str3;
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$i;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i extends ParameterElement {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262758c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f262759d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f262760e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f262761f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final DeepLink f262762g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final List<UniversalColor> f262763h;

        public i(@Y61.k String str, @Y61.k String str2, @Y61.k DeepLink deepLink, @Y61.l String str3, @Y61.k String str4, @Y61.l List list) {
            super(str, null);
            this.f262758c = str;
            this.f262759d = str2;
            this.f262760e = str3;
            this.f262761f = str4;
            this.f262762g = deepLink;
            this.f262763h = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f262758c, iVar.f262758c) && L.f(this.f262759d, iVar.f262759d) && L.f(this.f262760e, iVar.f262760e) && L.f(this.f262761f, iVar.f262761f) && L.f(this.f262762g, iVar.f262762g) && L.f(this.f262763h, iVar.f262763h);
        }

        @Override // com.avito.android.search.filter.converter.ParameterElement, com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF2713d() {
            return this.f262758c;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f262758c.hashCode() * 31, 31, this.f262759d);
            String str = this.f262760e;
            int iE2 = com.avito.android.actions_sheet.a.e(this.f262762g, H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f262761f), 31);
            List<UniversalColor> list = this.f262763h;
            return iE2 + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("EntryPoint(stringId=");
            sb2.append(this.f262758c);
            sb2.append(", title=");
            sb2.append(this.f262759d);
            sb2.append(", subtitle=");
            sb2.append(this.f262760e);
            sb2.append(", valueTitle=");
            sb2.append(this.f262761f);
            sb2.append(", valueDeepLink=");
            sb2.append(this.f262762g);
            sb2.append(", valueGradientColors=");
            return H.p(sb2, this.f262763h, ')');
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$j;", "", "<init>", "()V", "a", "Lcom/avito/android/search/filter/converter/ParameterElement$j$a;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class j {

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$j$a;", "Lcom/avito/android/search/filter/converter/ParameterElement$j;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends j {
            public a() {
                super(null);
            }
        }

        public /* synthetic */ j(C42822w c42822w) {
            this();
        }

        public j() {
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$k;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k extends ParameterElement {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262764c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f262765d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f262766e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f262767f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f262768g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final List<IntParameter> f262769h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final List<ClearanceValue> f262770i;

        public /* synthetic */ k(String str, String str2, String str3, boolean z12, boolean z13, List list, List list2, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? true : z12, (i12 & 16) != 0 ? false : z13, list, list2);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f262764c, kVar.f262764c) && L.f(this.f262765d, kVar.f262765d) && L.f(this.f262766e, kVar.f262766e) && this.f262767f == kVar.f262767f && this.f262768g == kVar.f262768g && L.f(this.f262769h, kVar.f262769h) && L.f(this.f262770i, kVar.f262770i);
        }

        @Override // com.avito.android.search.filter.converter.ParameterElement, com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF2713d() {
            return this.f262764c;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f262764c.hashCode() * 31, 31, this.f262765d);
            String str = this.f262766e;
            return this.f262770i.hashCode() + H.e(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f262767f), 31, this.f262768g), 31, this.f262769h);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GroupClearance(stringId=");
            sb2.append(this.f262764c);
            sb2.append(", title=");
            sb2.append(this.f262765d);
            sb2.append(", placeholder=");
            sb2.append(this.f262766e);
            sb2.append(", isEnabled=");
            sb2.append(this.f262767f);
            sb2.append(", isRequired=");
            sb2.append(this.f262768g);
            sb2.append(", parameters=");
            sb2.append(this.f262769h);
            sb2.append(", clearanceValues=");
            return H.p(sb2, this.f262770i, ')');
        }

        public k(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, boolean z12, boolean z13, @Y61.k List<IntParameter> list, @Y61.k List<ClearanceValue> list2) {
            super(str, null);
            this.f262764c = str;
            this.f262765d = str2;
            this.f262766e = str3;
            this.f262767f = z12;
            this.f262768g = z13;
            this.f262769h = list;
            this.f262770i = list2;
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$l;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "a", "b", "Lcom/avito/android/search/filter/converter/ParameterElement$l$a;", "Lcom/avito/android/search/filter/converter/ParameterElement$l$b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class l extends ParameterElement {

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$l$a;", "Lcom/avito/android/search/filter/converter/ParameterElement$l;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends l {
        }

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$l$b;", "Lcom/avito/android/search/filter/converter/ParameterElement$l;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends l {
        }

        public l(String str, C42822w c42822w) {
            super(str, null);
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$m;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface m {
        @Y61.l
        /* renamed from: getGroupId */
        String getF262942j();
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$n;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "a", "b", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n extends ParameterElement {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262771c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f262772d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final PrintableText f262773e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final b f262774f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f262775g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Integer f262776h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final Integer f262777i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final Integer f262778j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final Integer f262779k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final ArrayList f262780l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final String f262781m;

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$n$a;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f262782a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f262783b;

            public a(@Y61.k String str, @Y61.k String str2) {
                this.f262782a = str;
                this.f262783b = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f262782a, aVar.f262782a) && L.f(this.f262783b, aVar.f262783b);
            }

            public final int hashCode() {
                return this.f262783b.hashCode() + (this.f262782a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("GuestsSelectAvailableAge(id=");
                sb2.append(this.f262782a);
                sb2.append(", value=");
                return C22026a.c(sb2, this.f262783b, ')');
            }
        }

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$n$b;", "", "", "version", "totalCount", "adultsCount", "", "", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "Ljava/lang/Integer;", "getVersion", "()Ljava/lang/Integer;", "getTotalCount", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b {

            @com.google.gson.annotations.c("adultsCount")
            @Y61.l
            private final Integer adultsCount;

            @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
            @Y61.l
            private final List<String> children;

            @com.google.gson.annotations.c("totalCount")
            @Y61.l
            private final Integer totalCount;

            @com.google.gson.annotations.c("version")
            @Y61.l
            private final Integer version;

            public b(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l List<String> list) {
                this.version = num;
                this.totalCount = num2;
                this.adultsCount = num3;
                this.children = list;
            }

            @Y61.l
            /* renamed from: a, reason: from getter */
            public final Integer getAdultsCount() {
                return this.adultsCount;
            }

            @Y61.l
            public final List<String> b() {
                return this.children;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.version, bVar.version) && L.f(this.totalCount, bVar.totalCount) && L.f(this.adultsCount, bVar.adultsCount) && L.f(this.children, bVar.children);
            }

            public final int hashCode() {
                Integer num = this.version;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.totalCount;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.adultsCount;
                int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                List<String> list = this.children;
                return iHashCode3 + (list != null ? list.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("GuestsSelectValue(version=");
                sb2.append(this.version);
                sb2.append(", totalCount=");
                sb2.append(this.totalCount);
                sb2.append(", adultsCount=");
                sb2.append(this.adultsCount);
                sb2.append(", children=");
                return H.p(sb2, this.children, ')');
            }
        }

        public n(@Y61.k String str, @Y61.k String str2, @Y61.l PrintableText printableText, @Y61.l b bVar, @Y61.l String str3, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4, @Y61.l ArrayList arrayList, @Y61.l String str4) {
            super(str, null);
            this.f262771c = str;
            this.f262772d = str2;
            this.f262773e = printableText;
            this.f262774f = bVar;
            this.f262775g = str3;
            this.f262776h = num;
            this.f262777i = num2;
            this.f262778j = num3;
            this.f262779k = num4;
            this.f262780l = arrayList;
            this.f262781m = str4;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return L.f(this.f262771c, nVar.f262771c) && L.f(this.f262772d, nVar.f262772d) && L.f(this.f262773e, nVar.f262773e) && L.f(this.f262774f, nVar.f262774f) && L.f(this.f262775g, nVar.f262775g) && L.f(this.f262776h, nVar.f262776h) && L.f(this.f262777i, nVar.f262777i) && L.f(this.f262778j, nVar.f262778j) && L.f(this.f262779k, nVar.f262779k) && L.f(this.f262780l, nVar.f262780l) && L.f(this.f262781m, nVar.f262781m);
        }

        @Override // com.avito.android.search.filter.converter.ParameterElement, com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF2713d() {
            return this.f262771c;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f262771c.hashCode() * 31, 31, this.f262772d);
            PrintableText printableText = this.f262773e;
            int iHashCode = (iD2 + (printableText == null ? 0 : printableText.hashCode())) * 31;
            b bVar = this.f262774f;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str = this.f262775g;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f262776h;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f262777i;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f262778j;
            int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f262779k;
            int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
            ArrayList arrayList = this.f262780l;
            int iHashCode8 = (iHashCode7 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            String str2 = this.f262781m;
            return iHashCode8 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GuestsSelect(stringId=");
            sb2.append(this.f262771c);
            sb2.append(", title=");
            sb2.append(this.f262772d);
            sb2.append(", inputTitle=");
            sb2.append(this.f262773e);
            sb2.append(", value=");
            sb2.append(this.f262774f);
            sb2.append(", placeholder=");
            sb2.append(this.f262775g);
            sb2.append(", minGuests=");
            sb2.append(this.f262776h);
            sb2.append(", maxGuests=");
            sb2.append(this.f262777i);
            sb2.append(", maxChildrenCount=");
            sb2.append(this.f262778j);
            sb2.append(", maxAdultsCount=");
            sb2.append(this.f262779k);
            sb2.append(", availableAges=");
            sb2.append(this.f262780l);
            sb2.append(", buttonTitle=");
            return C22026a.c(sb2, this.f262781m, ')');
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$p;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p extends ParameterElement {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262802c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f262803d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public List<String> f262804e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f262805f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Integer f262806g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Integer f262807h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f262808i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final Badge f262809j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final DeepLink f262810k;

        public /* synthetic */ p(String str, String str2, List list, String str3, Integer num, Integer num2, String str4, Badge badge, DeepLink deepLink, int i12, C42822w c42822w) {
            this(str, str2, list, str3, (i12 & 16) != 0 ? null : num, (i12 & 32) != 0 ? null : num2, (i12 & 64) != 0 ? null : str4, (i12 & 128) != 0 ? null : badge, (i12 & 256) != 0 ? null : deepLink);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return L.f(this.f262802c, pVar.f262802c) && L.f(this.f262803d, pVar.f262803d) && L.f(this.f262804e, pVar.f262804e) && L.f(this.f262805f, pVar.f262805f) && L.f(this.f262806g, pVar.f262806g) && L.f(this.f262807h, pVar.f262807h) && L.f(this.f262808i, pVar.f262808i) && L.f(this.f262809j, pVar.f262809j) && L.f(this.f262810k, pVar.f262810k);
        }

        @Override // com.avito.android.search.filter.converter.ParameterElement, com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF2713d() {
            return this.f262802c;
        }

        public final int hashCode() {
            int iE2 = H.e(H.d(this.f262802c.hashCode() * 31, 31, this.f262803d), 31, this.f262804e);
            String str = this.f262805f;
            int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f262806g;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f262807h;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.f262808i;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Badge badge = this.f262809j;
            int iHashCode5 = (iHashCode4 + (badge == null ? 0 : badge.hashCode())) * 31;
            DeepLink deepLink = this.f262810k;
            return iHashCode5 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Keywords(stringId=");
            sb2.append(this.f262802c);
            sb2.append(", title=");
            sb2.append(this.f262803d);
            sb2.append(", values=");
            sb2.append(this.f262804e);
            sb2.append(", placeholder=");
            sb2.append(this.f262805f);
            sb2.append(", maxCharCount=");
            sb2.append(this.f262806g);
            sb2.append(", maxOptionsCount=");
            sb2.append(this.f262807h);
            sb2.append(", text=");
            sb2.append(this.f262808i);
            sb2.append(", badge=");
            sb2.append(this.f262809j);
            sb2.append(", titleTipAction=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f262810k, ')');
        }

        public p(@Y61.k String str, @Y61.k String str2, @Y61.k List<String> list, @Y61.l String str3, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l String str4, @Y61.l Badge badge, @Y61.l DeepLink deepLink) {
            super(str, null);
            this.f262802c = str;
            this.f262803d = str2;
            this.f262804e = list;
            this.f262805f = str3;
            this.f262806g = num;
            this.f262807h = num2;
            this.f262808i = str4;
            this.f262809j = badge;
            this.f262810k = deepLink;
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$q;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q extends ParameterElement {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262811c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f262812d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final AttributedText f262813e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final List<ParameterSlot> f262814f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final GroupMarkerParameter.Payload f262815g;

        public /* synthetic */ q(String str, String str2, AttributedText attributedText, List list, GroupMarkerParameter.Payload payload, int i12, C42822w c42822w) {
            this(str, str2, attributedText, list, (i12 & 16) != 0 ? null : payload);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return L.f(this.f262811c, qVar.f262811c) && L.f(this.f262812d, qVar.f262812d) && L.f(this.f262813e, qVar.f262813e) && L.f(this.f262814f, qVar.f262814f) && L.f(this.f262815g, qVar.f262815g);
        }

        @Override // com.avito.android.search.filter.converter.ParameterElement, com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF2713d() {
            return this.f262811c;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f262811c.hashCode() * 31, 31, this.f262812d);
            AttributedText attributedText = this.f262813e;
            int iE2 = H.e((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f262814f);
            GroupMarkerParameter.Payload payload = this.f262815g;
            return iE2 + (payload != null ? payload.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "LocationGroup(itemId=" + this.f262811c + ", title=" + this.f262812d + ", richTitle=" + this.f262813e + ", parameters=" + this.f262814f + ", payload=" + this.f262815g + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public q(@Y61.k String str, @Y61.k String str2, @Y61.l AttributedText attributedText, @Y61.k List<? extends ParameterSlot> list, @Y61.l GroupMarkerParameter.Payload payload) {
            super(str, null);
            this.f262811c = str;
            this.f262812d = str2;
            this.f262813e = attributedText;
            this.f262814f = list;
            this.f262815g = payload;
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$r;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class r extends ParameterElement {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final r f262816c = new r();

        public r() {
            super("more_items_id", null);
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$s;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "Lcom/avito/android/search/filter/converter/n;", "LCp0/c;", "Lcom/avito/android/search/filter/converter/common/e;", "Lcom/avito/android/search/filter/converter/common/ItemWithState;", "Lcom/avito/android/search/filter/converter/ParameterElement$m;", "a", "b", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class s extends ParameterElement implements com.avito.android.search.filter.converter.n, InterfaceC13339c, com.avito.android.search.filter.converter.common.e, ItemWithState, m {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262817c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f262818d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final List<Cp0.e> f262819e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final DisplayType f262820f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final List<b> f262821g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final a f262822h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f262823i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final String f262824j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final ItemWithState.State f262825k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f262826l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final DeepLink f262827m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final MultiselectParameter.FilterHint f262828n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public final String f262829o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.l
        public final Badge f262830p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.l
        public final Integer f262831q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.l
        public final String f262832r;

        /* renamed from: s, reason: collision with root package name */
        @Y61.l
        public final String f262833s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.l
        public final Boolean f262834t;

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$s$a;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final Integer f262835a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Integer f262836b;

            public a(@Y61.l Integer num, @Y61.l Integer num2) {
                this.f262835a = num;
                this.f262836b = num2;
            }
        }

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$s$b;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b {
            public b(@Y61.k ArrayList arrayList) {
            }
        }

        public s() {
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public s(String str, String str2, String str3, List list, AttributedText attributedText, DisplayType displayType, List list2, a aVar, Boolean bool, String str4, boolean z12, boolean z13, String str5, ItemWithState.State state, boolean z14, AttributedText attributedText2, Integer num, TipIconParameters tipIconParameters, DeepLink deepLink, MultiselectParameter.FilterHint filterHint, String str6, Badge badge, Integer num2, String str7, String str8, Boolean bool2, int i12, C42822w c42822w) {
            String str9;
            Boolean bool3;
            CharSequence charSequence = null;
            Object[] objArr = 0;
            DisplayType displayType2 = (i12 & 32) != 0 ? null : displayType;
            List list3 = (i12 & 64) != 0 ? null : list2;
            a aVar2 = (i12 & 128) != 0 ? null : aVar;
            int i13 = 1;
            boolean z15 = (i12 & 1024) != 0 ? true : z12;
            String str10 = (i12 & 4096) != 0 ? null : str5;
            ItemWithState.State normal = (i12 & 8192) != 0 ? new ItemWithState.State.Normal(charSequence, i13, objArr == true ? 1 : 0) : state;
            boolean z16 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z14;
            DeepLink deepLink2 = (262144 & i12) != 0 ? null : deepLink;
            MultiselectParameter.FilterHint filterHint2 = (524288 & i12) != 0 ? null : filterHint;
            String str11 = (1048576 & i12) != 0 ? null : str6;
            Badge badge2 = (2097152 & i12) != 0 ? null : badge;
            Integer num3 = (4194304 & i12) != 0 ? null : num2;
            String str12 = (8388608 & i12) != 0 ? null : str7;
            String str13 = (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str8;
            if ((i12 & 33554432) != 0) {
                str9 = str;
                bool3 = null;
            } else {
                str9 = str;
                bool3 = bool2;
            }
            super(str9, null);
            this.f262817c = str2;
            this.f262818d = str3;
            this.f262819e = list;
            this.f262820f = displayType2;
            this.f262821g = list3;
            this.f262822h = aVar2;
            this.f262823i = z15;
            this.f262824j = str10;
            this.f262825k = normal;
            this.f262826l = z16;
            this.f262827m = deepLink2;
            this.f262828n = filterHint2;
            this.f262829o = str11;
            this.f262830p = badge2;
            this.f262831q = num3;
            this.f262832r = str12;
            this.f262833s = str13;
            this.f262834t = bool3;
        }

        @Override // com.avito.android.search.filter.converter.ParameterElement.m
        @Y61.l
        /* renamed from: getGroupId, reason: from getter */
        public final String getF262942j() {
            return this.f262829o;
        }

        @Override // com.avito.android.search.filter.converter.common.ItemWithState
        @Y61.k
        /* renamed from: getState */
        public final ItemWithState.State getF262797p() {
            throw null;
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$u;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "Lcom/avito/android/search/filter/converter/common/e;", "Lcom/avito/android/search/filter/converter/common/ItemWithState;", "LCp0/c;", "Lcom/avito/android/search/filter/converter/n;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class u extends ParameterElement implements com.avito.android.search.filter.converter.common.e, ItemWithState, InterfaceC13339c, com.avito.android.search.filter.converter.n {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ItemWithState.State f262839c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(String str, String str2, String str3, String str4, int i12, ItemWithState.State state, AttributedText attributedText, boolean z12, int i13, C42822w c42822w) {
            super(str, null);
            state = (i13 & 32) != 0 ? new ItemWithState.State.Normal(null, 1, 0 == true ? 1 : 0) : state;
            this.f262839c = state;
        }

        @Override // com.avito.android.search.filter.converter.common.ItemWithState
        @Y61.k
        /* renamed from: getState */
        public final ItemWithState.State getF262797p() {
            throw null;
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0003\u0007\b\t\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$v;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "Lcom/avito/android/search/filter/converter/n;", "Lcom/avito/android/search/filter/converter/common/e;", "Lcom/avito/android/search/filter/converter/common/ItemWithState;", "LCp0/c;", "Lcom/avito/android/search/filter/converter/ParameterElement$m;", "a", "b", "c", "Lcom/avito/android/search/filter/converter/ParameterElement$v$b;", "Lcom/avito/android/search/filter/converter/ParameterElement$v$c;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class v extends ParameterElement implements com.avito.android.search.filter.converter.n, com.avito.android.search.filter.converter.common.e, ItemWithState, InterfaceC13339c, m {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262840c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final AttributedText f262841d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f262842e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final AttributedText f262843f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public Cp0.e f262844g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final DisplayType f262845h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f262846i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f262847j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f262848k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f262849l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final String f262850m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final ItemWithState.State f262851n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f262852o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f262853p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.l
        public final TipIconParameters f262854q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.l
        public final SelectParameter.Displaying f262855r;

        /* renamed from: s, reason: collision with root package name */
        @Y61.l
        public final String f262856s;

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$v$a;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "Lcom/avito/android/search/filter/converter/ParameterElement$m;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends ParameterElement implements m {

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f262857c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final b f262858d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final b f262859e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f262860f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.l
            public final String f262861g;

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
                return L.f(this.f262857c, aVar.f262857c) && L.f(this.f262858d, aVar.f262858d) && L.f(this.f262859e, aVar.f262859e) && this.f262860f == aVar.f262860f && L.f(this.f262861g, aVar.f262861g);
            }

            @Override // com.avito.android.search.filter.converter.ParameterElement.m
            @Y61.l
            /* renamed from: getGroupId, reason: from getter */
            public final String getF262942j() {
                return this.f262861g;
            }

            public final int hashCode() {
                int i12 = androidx.appcompat.app.r.i((this.f262859e.hashCode() + ((this.f262858d.hashCode() + (this.f262857c.hashCode() * 31)) * 31)) * 31, 31, this.f262860f);
                String str = this.f262861g;
                return i12 + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("DoubleSelect(itemId=");
                sb2.append(this.f262857c);
                sb2.append(", firstSelect=");
                sb2.append(this.f262858d);
                sb2.append(", secondSelect=");
                sb2.append(this.f262859e);
                sb2.append(", nonCleared=");
                sb2.append(this.f262860f);
                sb2.append(", groupId=");
                return C22026a.c(sb2, this.f262861g, ')');
            }

            public a(@Y61.k String str, @Y61.k b bVar, @Y61.k b bVar2, boolean z12, @Y61.l String str2) {
                super(str, null);
                this.f262857c = str;
                this.f262858d = bVar;
                this.f262859e = bVar2;
                this.f262860f = z12;
                this.f262861g = str2;
            }
        }

        /* compiled from: ParameterElement.kt */
        @s0
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$v$b;", "Lcom/avito/android/search/filter/converter/ParameterElement$v;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends v {

            /* renamed from: t, reason: collision with root package name */
            @Y61.k
            public final List<Cp0.e> f262862t;

            /* renamed from: u, reason: collision with root package name */
            public final boolean f262863u;

            public b() {
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /* JADX WARN: Multi-variable type inference failed */
            public b(String str, String str2, AttributedText attributedText, String str3, AttributedText attributedText2, SelectParameter.Displaying displaying, Cp0.e eVar, List list, DisplayType displayType, String str4, boolean z12, boolean z13, boolean z14, String str5, ItemWithState.State state, boolean z15, boolean z16, TipIconParameters tipIconParameters, String str6, boolean z17, int i12, C42822w c42822w) {
                CharSequence charSequence = null;
                Object[] objArr = 0;
                AttributedText attributedText3 = (i12 & 4) != 0 ? null : attributedText;
                String str7 = (i12 & 8) != 0 ? null : str3;
                AttributedText attributedText4 = (i12 & 16) != 0 ? null : attributedText2;
                SelectParameter.Displaying displaying2 = (i12 & 32) != 0 ? null : displaying;
                Cp0.e eVar2 = (i12 & 64) != 0 ? null : eVar;
                List list2 = (i12 & 128) != 0 ? C42784z0.f406748b : list;
                DisplayType displayType2 = (i12 & 256) != 0 ? null : displayType;
                String str8 = (i12 & 512) != 0 ? null : str4;
                boolean z18 = (i12 & 1024) != 0 ? false : z12;
                char c12 = 1;
                boolean z19 = (i12 & 2048) != 0 ? true : z13;
                String str9 = (i12 & 8192) != 0 ? null : str5;
                ItemWithState.State normal = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? new ItemWithState.State.Normal(charSequence, c12 == true ? 1 : 0, objArr == true ? 1 : 0) : state;
                boolean z22 = (32768 & i12) != 0 ? false : z15;
                boolean z23 = (65536 & i12) != 0 ? false : z16;
                TipIconParameters tipIconParameters2 = (131072 & i12) != 0 ? null : tipIconParameters;
                String str10 = (262144 & i12) != 0 ? null : str6;
                boolean z24 = (i12 & 524288) == 0 ? z17 : true;
                super(str, str2, attributedText3, str7, attributedText4, eVar2, displayType2, str8, z18, z19, z14, str9, normal, z22, z23, tipIconParameters2, displaying2, str10, null);
                this.f262862t = list2;
                this.f262863u = z24;
            }

            @Override // com.avito.android.search.filter.converter.ParameterElement.v
            @Y61.k
            public final List<Cp0.e> a() {
                return this.f262862t;
            }

            @Y61.k
            public final b b(@Y61.l Cp0.e eVar) {
                List<Cp0.e> list = this.f262862t;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (Cp0.e eVar2 : list) {
                    arrayList.add(Cp0.e.a(eVar2, null, L.f(eVar, eVar2), 16375));
                }
                return new b(this.f262689b, this.f262840c, this.f262841d, eVar != null ? eVar.f2697b : null, this.f262843f, this.f262855r, eVar, arrayList, this.f262845h, this.f262846i, this.f262847j, this.f262848k, this.f262849l, this.f262850m, null, false, this.f262853p, this.f262854q, this.f262856s, false, 573440, null);
            }
        }

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$v$c;", "Lcom/avito/android/search/filter/converter/ParameterElement$v;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends v {

            /* renamed from: t, reason: collision with root package name */
            @Y61.k
            public final List<Cp0.f> f262864t;

            /* compiled from: ParameterElement.kt */
            @s0
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LCp0/f;", "it", "", "Lcom/avito/conveyor_item/a;", "invoke", "(LCp0/f;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class a extends N implements Y41.l<Cp0.f, List<? extends com.avito.conveyor_item.a>> {

                /* renamed from: l, reason: collision with root package name */
                public static final a f262865l = new a();

                public a() {
                    super(1);
                }

                @Override // Y41.l
                public final List<? extends com.avito.conveyor_item.a> invoke(Cp0.f fVar) {
                    Cp0.f fVar2 = fVar;
                    ArrayList arrayList = fVar2.f2712c;
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    String str = fVar2.f2711b;
                    if (str == null || str.length() == 0) {
                        return arrayList;
                    }
                    t0 t0Var = new t0(2);
                    t0Var.a(new com.avito.android.select.title.a(str));
                    t0Var.b(arrayList.toArray(new Cp0.e[0]));
                    ArrayList<Object> arrayList2 = t0Var.f406850a;
                    return C42745f0.U(arrayList2.toArray(new com.avito.conveyor_item.a[arrayList2.size()]));
                }
            }

            public c() {
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /* JADX WARN: Multi-variable type inference failed */
            public c(String str, String str2, String str3, AttributedText attributedText, Cp0.e eVar, List list, String str4, boolean z12, boolean z13, String str5, ItemWithState.State state, boolean z14, String str6, int i12, C42822w c42822w) {
                CharSequence charSequence = null;
                Object[] objArr = 0;
                String str7 = (i12 & 4) != 0 ? null : str3;
                AttributedText attributedText2 = (i12 & 8) != 0 ? null : attributedText;
                Cp0.e eVar2 = (i12 & 16) != 0 ? null : eVar;
                List list2 = (i12 & 32) != 0 ? C42784z0.f406748b : list;
                super(str, str2, null, str7, attributedText2, eVar2, null, (i12 & 64) != 0 ? null : str4, (i12 & 128) != 0 ? false : z12, (i12 & 2048) != 0 ? true : z14, z13, (i12 & 512) != 0 ? null : str5, (i12 & 1024) != 0 ? new ItemWithState.State.Normal(charSequence, 1, objArr == true ? 1 : 0) : state, false, false, null, null, (i12 & 4096) != 0 ? null : str6, 122884, null);
                this.f262864t = list2;
            }

            @Override // com.avito.android.search.filter.converter.ParameterElement.v
            @Y61.k
            public final List<com.avito.conveyor_item.a> a() {
                return C43033p.D(C43033p.r(C43033p.y(new C42770s0(this.f262864t), a.f262865l)));
            }
        }

        public /* synthetic */ v(String str, String str2, AttributedText attributedText, String str3, AttributedText attributedText2, Cp0.e eVar, DisplayType displayType, String str4, boolean z12, boolean z13, boolean z14, String str5, ItemWithState.State state, boolean z15, boolean z16, TipIconParameters tipIconParameters, SelectParameter.Displaying displaying, String str6, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : attributedText, str3, attributedText2, eVar, displayType, str4, z12, (i12 & 512) != 0 ? true : z13, z14, str5, state, (i12 & 8192) != 0 ? false : z15, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z16, (32768 & i12) != 0 ? null : tipIconParameters, (65536 & i12) != 0 ? null : displaying, (i12 & 131072) != 0 ? null : str6, null);
        }

        @Y61.k
        public abstract List<com.avito.conveyor_item.a> a();

        @Override // com.avito.android.search.filter.converter.ParameterElement.m
        @Y61.l
        /* renamed from: getGroupId, reason: from getter */
        public final String getF262942j() {
            return this.f262856s;
        }

        public v(String str, String str2, AttributedText attributedText, String str3, AttributedText attributedText2, Cp0.e eVar, DisplayType displayType, String str4, boolean z12, boolean z13, boolean z14, String str5, ItemWithState.State state, boolean z15, boolean z16, TipIconParameters tipIconParameters, SelectParameter.Displaying displaying, String str6, C42822w c42822w) {
            super(str, null);
            this.f262840c = str2;
            this.f262841d = attributedText;
            this.f262842e = str3;
            this.f262843f = attributedText2;
            this.f262844g = eVar;
            this.f262845h = displayType;
            this.f262846i = str4;
            this.f262847j = z12;
            this.f262848k = z13;
            this.f262849l = z14;
            this.f262850m = str5;
            this.f262851n = state;
            this.f262852o = z15;
            this.f262853p = z16;
            this.f262854q = tipIconParameters;
            this.f262855r = displaying;
            this.f262856s = str6;
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$w;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "Lcom/avito/android/search/filter/converter/common/e;", "LCp0/c;", "Lcom/avito/android/search/filter/converter/common/ItemWithState;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class w extends ParameterElement implements com.avito.android.search.filter.converter.common.e, InterfaceC13339c, ItemWithState {
        /* JADX WARN: Multi-variable type inference failed */
        public w(String str, String str2, String str3, AttributedText attributedText, String str4, boolean z12, boolean z13, String str5, ItemWithState.State state, DeepLink deepLink, int i12, C42822w c42822w) {
            CharSequence charSequence = null;
            Object[] objArr = 0;
            if ((i12 & 256) != 0) {
                new ItemWithState.State.Normal(charSequence, 1, objArr == true ? 1 : 0);
            }
            super(str, null);
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$x;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class x extends ParameterElement {
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$y;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "Lcom/avito/android/search/filter/converter/common/e;", "Lcom/avito/android/search/filter/converter/common/ItemWithState;", "Lcom/avito/android/search/filter/converter/common/a;", "Lcom/avito/android/search/filter/converter/n;", "LCp0/c;", "Lcom/avito/android/search/filter/converter/common/f;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class y extends ParameterElement implements com.avito.android.search.filter.converter.common.e, ItemWithState, com.avito.android.search.filter.converter.common.a, com.avito.android.search.filter.converter.n, InterfaceC13339c, com.avito.android.search.filter.converter.common.f {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262866c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f262867d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f262868e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f262869f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f262870g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final FormatterType f262871h;

        /* renamed from: i, reason: collision with root package name */
        public final int f262872i;

        /* renamed from: j, reason: collision with root package name */
        public final int f262873j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final String f262874k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final String f262875l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public final ItemWithState.State f262876m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f262877n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public final AttributedText f262878o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.l
        public final hJ.m f262879p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public y(String str, String str2, String str3, String str4, boolean z12, FormatterType formatterType, int i12, int i13, String str5, String str6, ItemWithState.State state, boolean z13, AttributedText attributedText, hJ.m mVar, int i14, C42822w c42822w) {
            super(str, null);
            CharSequence charSequence = null;
            Object[] objArr = 0;
            String str7 = (i14 & 4) != 0 ? null : str3;
            String str8 = (i14 & 8) != 0 ? null : str4;
            boolean z14 = (i14 & 16) != 0 ? false : z12;
            ItemWithState.State normal = (i14 & 1024) != 0 ? new ItemWithState.State.Normal(charSequence, 1, objArr == true ? 1 : 0) : state;
            boolean z15 = (i14 & 2048) == 0 ? z13 : false;
            AttributedText attributedText2 = (i14 & 4096) != 0 ? null : attributedText;
            hJ.m mVar2 = (i14 & 8192) != 0 ? null : mVar;
            this.f262866c = str;
            this.f262867d = str2;
            this.f262868e = str7;
            this.f262869f = str8;
            this.f262870g = z14;
            this.f262871h = formatterType;
            this.f262872i = i12;
            this.f262873j = i13;
            this.f262874k = str5;
            this.f262875l = str6;
            this.f262876m = normal;
            this.f262877n = z15;
            this.f262878o = attributedText2;
            this.f262879p = mVar2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return L.f(this.f262866c, yVar.f262866c) && L.f(this.f262867d, yVar.f262867d) && L.f(this.f262868e, yVar.f262868e) && L.f(this.f262869f, yVar.f262869f) && this.f262870g == yVar.f262870g && L.f(this.f262871h, yVar.f262871h) && this.f262872i == yVar.f262872i && this.f262873j == yVar.f262873j && L.f(this.f262874k, yVar.f262874k) && L.f(this.f262875l, yVar.f262875l) && L.f(this.f262876m, yVar.f262876m) && this.f262877n == yVar.f262877n && L.f(this.f262878o, yVar.f262878o) && L.f(this.f262879p, yVar.f262879p);
        }

        @Override // com.avito.android.search.filter.converter.common.ItemWithState
        @Y61.k
        /* renamed from: getState */
        public final ItemWithState.State getF262797p() {
            throw null;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f262866c.hashCode() * 31, 31, this.f262867d);
            String str = this.f262868e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f262869f;
            int iE2 = androidx.appcompat.app.r.e(this.f262873j, androidx.appcompat.app.r.e(this.f262872i, (this.f262871h.hashCode() + androidx.appcompat.app.r.i((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f262870g)) * 31, 31), 31);
            String str3 = this.f262874k;
            int iHashCode2 = (iE2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f262875l;
            int i12 = androidx.appcompat.app.r.i((this.f262876m.hashCode() + ((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, 31, this.f262877n);
            AttributedText attributedText = this.f262878o;
            int iHashCode3 = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            hJ.m mVar = this.f262879p;
            return iHashCode3 + (mVar != null ? mVar.hashCode() : 0);
        }

        @Override // com.avito.android.search.filter.converter.common.f
        @Y61.l
        /* renamed from: n */
        public final hJ.m getF262800s() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "TaggedInput(itemId=" + this.f262866c + ", title=" + this.f262867d + ", value=" + this.f262868e + ", error=" + this.f262869f + ", dynamicTags=" + this.f262870g + ", inputType=" + this.f262871h + ", androidSdkInputType=" + this.f262872i + ", lines=" + this.f262873j + ", placeholder=" + this.f262874k + ", subTitle=" + this.f262875l + ", state=" + this.f262876m + ", hideTitle=" + this.f262877n + ", motivation=" + this.f262878o + ", htmlRootNode=" + this.f262879p + ')';
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$z;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "Lcom/avito/android/search/filter/converter/common/a;", "Lcom/avito/android/search/filter/converter/common/ItemWithState;", "Lcom/avito/android/search/filter/converter/common/e;", "Lcom/avito/android/search/filter/converter/common/ItemWithAdditionalButton;", "a", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class z extends ParameterElement implements com.avito.android.search.filter.converter.common.a, ItemWithState, com.avito.android.search.filter.converter.common.e, ItemWithAdditionalButton {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262880c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f262881d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f262882e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f262883f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final a f262884g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final ItemWithAdditionalButton.AdditionalButton f262885h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f262886i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final ItemWithState.State f262887j;

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$z$a;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/search/filter/converter/ParameterElement$z$a$a;", "Lcom/avito/android/search/filter/converter/ParameterElement$z$a$b;", "Lcom/avito/android/search/filter/converter/ParameterElement$z$a$c;", "Lcom/avito/android/search/filter/converter/ParameterElement$z$a$d;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class a {

            /* compiled from: ParameterElement.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$z$a$a;", "Lcom/avito/android/search/filter/converter/ParameterElement$z$a;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.search.filter.converter.ParameterElement$z$a$a, reason: collision with other inner class name */
            public static final /* data */ class C7858a extends a {
                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C7858a)) {
                        return false;
                    }
                    ((C7858a) obj).getClass();
                    return L.f(null, null) && L.f(null, null) && L.f(null, null);
                }

                public final int hashCode() {
                    throw null;
                }

                @Y61.k
                public final String toString() {
                    return "Content(title=null, image=null, uri=null)";
                }
            }

            /* compiled from: ParameterElement.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$z$a$b;", "Lcom/avito/android/search/filter/converter/ParameterElement$z$a;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class b extends a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final b f262888a = new b();

                public b() {
                    super(null);
                }
            }

            /* compiled from: ParameterElement.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$z$a$c;", "Lcom/avito/android/search/filter/converter/ParameterElement$z$a;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class c extends a {
                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    ((c) obj).getClass();
                    return L.f(null, null);
                }

                public final int hashCode() {
                    throw null;
                }

                @Y61.k
                public final String toString() {
                    return "Error(message=null)";
                }
            }

            /* compiled from: ParameterElement.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$z$a$d;", "Lcom/avito/android/search/filter/converter/ParameterElement$z$a;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class d extends a {
                static {
                    new d();
                }

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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public z(String str, String str2, String str3, String str4, a aVar, ItemWithAdditionalButton.AdditionalButton additionalButton, String str5, ItemWithState.State state, int i12, C42822w c42822w) {
            super(str, null);
            aVar = (i12 & 16) != 0 ? a.b.f262888a : aVar;
            state = (i12 & 128) != 0 ? new ItemWithState.State.Normal(null, 1, 0 == true ? 1 : 0) : state;
            this.f262880c = str;
            this.f262881d = str2;
            this.f262882e = str3;
            this.f262883f = str4;
            this.f262884g = aVar;
            this.f262885h = additionalButton;
            this.f262886i = str5;
            this.f262887j = state;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return L.f(this.f262880c, zVar.f262880c) && L.f(this.f262881d, zVar.f262881d) && L.f(this.f262882e, zVar.f262882e) && L.f(this.f262883f, zVar.f262883f) && L.f(this.f262884g, zVar.f262884g) && L.f(this.f262885h, zVar.f262885h) && L.f(this.f262886i, zVar.f262886i) && L.f(this.f262887j, zVar.f262887j);
        }

        @Override // com.avito.android.search.filter.converter.common.ItemWithState
        @Y61.k
        /* renamed from: getState */
        public final ItemWithState.State getF262797p() {
            throw null;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f262880c.hashCode() * 31, 31, this.f262881d);
            String str = this.f262882e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f262883f;
            int iHashCode2 = (this.f262884g.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            ItemWithAdditionalButton.AdditionalButton additionalButton = this.f262885h;
            int iHashCode3 = (iHashCode2 + (additionalButton == null ? 0 : additionalButton.hashCode())) * 31;
            String str3 = this.f262886i;
            return this.f262887j.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "Video(itemId=" + this.f262880c + ", title=" + this.f262881d + ", placeholder=" + this.f262882e + ", error=" + this.f262883f + ", previewState=" + this.f262884g + ", additionalButton=" + this.f262885h + ", value=" + this.f262886i + ", state=" + this.f262887j + ')';
        }
    }

    public ParameterElement(String str, C42822w c42822w) {
        this.f262689b = str;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123950b() {
        return getF289483b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public String getF289483b() {
        return this.f262689b;
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$f;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "Lcom/avito/android/search/filter/converter/common/e;", "Lcom/avito/android/search/filter/converter/common/ItemWithState;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends ParameterElement implements com.avito.android.search.filter.converter.common.e, ItemWithState {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262747c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Long f262748d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f262749e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final ItemWithState.State f262750f;

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ f(String str, String str2, Long l12, long j12, long j13, boolean z12, String str3, boolean z13, SelectionType selectionType, String str4, String str5, ItemWithState.State state, int i12, C42822w c42822w) {
            ItemWithState.State normal;
            if ((i12 & 2048) != 0) {
                normal = new ItemWithState.State.Normal(null, 1, 0 == true ? 1 : 0);
            } else {
                normal = state;
            }
            this(str, l12, z13, normal);
        }

        @Override // com.avito.android.search.filter.converter.common.ItemWithState
        @Y61.k
        /* renamed from: getState */
        public final ItemWithState.State getF262797p() {
            throw null;
        }

        @Override // com.avito.android.search.filter.converter.ParameterElement, com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF289483b() {
            return this.f262747c;
        }

        public f(@Y61.k String str, @Y61.l Long l12, boolean z12, @Y61.k ItemWithState.State state) {
            super(str, null);
            this.f262747c = str;
            this.f262748d = l12;
            this.f262749e = z12;
            this.f262750f = state;
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$t;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "Lcom/avito/android/search/filter/converter/n;", "Lcom/avito/android/search/filter/converter/common/ItemWithState;", "LCp0/c;", "Lcom/avito/android/search/filter/converter/common/e;", "a", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class t extends ParameterElement implements com.avito.android.search.filter.converter.n, ItemWithState, InterfaceC13339c, com.avito.android.search.filter.converter.common.e {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final List<a> f262837c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ItemWithState.State f262838d;

        /* compiled from: ParameterElement.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$t$a;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public a(String str, String str2, String str3, boolean z12, int i12, C42822w c42822w) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ t(String str, String str2, AttributedText attributedText, boolean z12, String str3, List list, boolean z13, ItemWithState.State state, AttributedText attributedText2, String str4, int i12, C42822w c42822w) {
            if ((i12 & 128) != 0) {
                state = new ItemWithState.State.Normal(null, 1, 0 == true ? 1 : 0);
            }
            this(str, list, state);
        }

        @Override // com.avito.android.search.filter.converter.common.ItemWithState
        @Y61.k
        /* renamed from: getState */
        public final ItemWithState.State getF262797p() {
            throw null;
        }

        public t(@Y61.k String str, @Y61.k List list, @Y61.k ItemWithState.State state) {
            super(str, null);
            this.f262837c = list;
            this.f262838d = state;
        }
    }

    /* compiled from: ParameterElement.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$o;", "Lcom/avito/android/search/filter/converter/ParameterElement;", "Lcom/avito/android/search/filter/converter/common/d;", "Lcom/avito/android/search/filter/converter/ParameterElement$m;", "Lcom/avito/android/search/filter/converter/n;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o extends ParameterElement implements com.avito.android.search.filter.converter.common.d, m, com.avito.android.search.filter.converter.n {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f262784c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f262785d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public String f262786e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f262787f;

        /* renamed from: g, reason: collision with root package name */
        public final int f262788g;

        /* renamed from: h, reason: collision with root package name */
        public final int f262789h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f262790i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final String f262791j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final j f262792k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final ItemWithAdditionalButton.AdditionalButton f262793l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final DisplayingOptions f262794m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final String f262795n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public final AttributedText f262796o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.k
        public final ItemWithState.State f262797p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.k
        public final FormatterType f262798q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f262799r;

        /* renamed from: s, reason: collision with root package name */
        @Y61.l
        public final hJ.m f262800s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.l
        public final String f262801t;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public o(String str, String str2, String str3, String str4, int i12, int i13, String str5, String str6, j jVar, ItemWithAdditionalButton.AdditionalButton additionalButton, DisplayingOptions displayingOptions, String str7, AttributedText attributedText, ItemWithState.State state, FormatterType formatterType, boolean z12, hJ.m mVar, String str8, int i14, C42822w c42822w) {
            FormatterType formatterType2;
            CharSequence charSequence = null;
            Object[] objArr = 0;
            String str9 = (i14 & 4) != 0 ? null : str3;
            String str10 = (i14 & 8) != 0 ? null : str4;
            String str11 = (i14 & 64) != 0 ? null : str5;
            String str12 = (i14 & 128) != 0 ? null : str6;
            j jVar2 = (i14 & 256) != 0 ? null : jVar;
            ItemWithAdditionalButton.AdditionalButton additionalButton2 = (i14 & 512) != 0 ? null : additionalButton;
            DisplayingOptions displayingOptions2 = (i14 & 1024) != 0 ? null : displayingOptions;
            String str13 = (i14 & 2048) != 0 ? null : str7;
            AttributedText attributedText2 = (i14 & 4096) != 0 ? null : attributedText;
            ItemWithState.State normal = (i14 & 8192) != 0 ? new ItemWithState.State.Normal(charSequence, 1, objArr == true ? 1 : 0) : state;
            if ((i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                FormatterType.f179288e.getClass();
                formatterType2 = FormatterType.f179289f;
            } else {
                formatterType2 = formatterType;
            }
            this(str, str2, str9, str10, i12, i13, str11, str12, jVar2, additionalButton2, displayingOptions2, str13, attributedText2, normal, formatterType2, (32768 & i14) != 0 ? false : z12, (65536 & i14) != 0 ? null : mVar, (i14 & 131072) != 0 ? null : str8);
        }

        public static o a(o oVar, String str, String str2, int i12) {
            String str3 = oVar.f262784c;
            String str4 = (i12 & 4) != 0 ? oVar.f262786e : str2;
            String str5 = oVar.f262787f;
            int i13 = oVar.f262788g;
            int i14 = oVar.f262789h;
            String str6 = oVar.f262790i;
            String str7 = oVar.f262791j;
            j jVar = oVar.f262792k;
            ItemWithAdditionalButton.AdditionalButton additionalButton = oVar.f262793l;
            DisplayingOptions displayingOptions = oVar.f262794m;
            String str8 = oVar.f262795n;
            AttributedText attributedText = oVar.f262796o;
            ItemWithState.State state = oVar.f262797p;
            FormatterType formatterType = oVar.f262798q;
            boolean z12 = oVar.f262799r;
            hJ.m mVar = oVar.f262800s;
            String str9 = oVar.f262801t;
            oVar.getClass();
            return new o(str3, str, str4, str5, i13, i14, str6, str7, jVar, additionalButton, displayingOptions, str8, attributedText, state, formatterType, z12, mVar, str9);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return L.f(this.f262784c, oVar.f262784c) && L.f(this.f262785d, oVar.f262785d) && L.f(this.f262786e, oVar.f262786e) && L.f(this.f262787f, oVar.f262787f) && this.f262788g == oVar.f262788g && this.f262789h == oVar.f262789h && L.f(this.f262790i, oVar.f262790i) && L.f(this.f262791j, oVar.f262791j) && L.f(this.f262792k, oVar.f262792k) && L.f(this.f262793l, oVar.f262793l) && L.f(this.f262794m, oVar.f262794m) && L.f(this.f262795n, oVar.f262795n) && L.f(this.f262796o, oVar.f262796o) && L.f(this.f262797p, oVar.f262797p) && L.f(this.f262798q, oVar.f262798q) && this.f262799r == oVar.f262799r && L.f(this.f262800s, oVar.f262800s) && L.f(this.f262801t, oVar.f262801t);
        }

        @Override // com.avito.android.search.filter.converter.common.d
        @Y61.l
        /* renamed from: getDisplayingOptions, reason: from getter */
        public final DisplayingOptions getF262794m() {
            return this.f262794m;
        }

        @Override // com.avito.android.search.filter.converter.ParameterElement.m
        @Y61.l
        /* renamed from: getGroupId, reason: from getter */
        public final String getF262942j() {
            return this.f262801t;
        }

        @Override // Cp0.InterfaceC13339c
        @Y61.l
        /* renamed from: getMotivation, reason: from getter */
        public final AttributedText getF262796o() {
            return this.f262796o;
        }

        @Override // com.avito.android.search.filter.converter.common.ItemWithState
        @Y61.k
        /* renamed from: getState, reason: from getter */
        public final ItemWithState.State getF262797p() {
            return this.f262797p;
        }

        @Override // com.avito.android.search.filter.converter.common.d
        @Y61.l
        /* renamed from: getValue, reason: from getter */
        public final String getF262786e() {
            return this.f262786e;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f262784c.hashCode() * 31, 31, this.f262785d);
            String str = this.f262786e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f262787f;
            int iE2 = androidx.appcompat.app.r.e(this.f262789h, androidx.appcompat.app.r.e(this.f262788g, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
            String str3 = this.f262790i;
            int iHashCode2 = (iE2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f262791j;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            j jVar = this.f262792k;
            int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
            ItemWithAdditionalButton.AdditionalButton additionalButton = this.f262793l;
            int iHashCode5 = (iHashCode4 + (additionalButton == null ? 0 : additionalButton.hashCode())) * 31;
            DisplayingOptions displayingOptions = this.f262794m;
            int iHashCode6 = (iHashCode5 + (displayingOptions == null ? 0 : displayingOptions.hashCode())) * 31;
            String str5 = this.f262795n;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            AttributedText attributedText = this.f262796o;
            int i12 = androidx.appcompat.app.r.i((this.f262798q.hashCode() + ((this.f262797p.hashCode() + ((iHashCode7 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31)) * 31, 31, this.f262799r);
            hJ.m mVar = this.f262800s;
            int iHashCode8 = (i12 + (mVar == null ? 0 : mVar.hashCode())) * 31;
            String str6 = this.f262801t;
            return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
        }

        @Override // com.avito.android.search.filter.converter.common.f
        @Y61.l
        /* renamed from: n, reason: from getter */
        public final hJ.m getF262800s() {
            return this.f262800s;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Input(itemId=");
            sb2.append(this.f262784c);
            sb2.append(", title=");
            sb2.append(this.f262785d);
            sb2.append(", value=");
            sb2.append(this.f262786e);
            sb2.append(", error=");
            sb2.append(this.f262787f);
            sb2.append(", androidSdkInputType=");
            sb2.append(this.f262788g);
            sb2.append(", lines=");
            sb2.append(this.f262789h);
            sb2.append(", prefix=");
            sb2.append(this.f262790i);
            sb2.append(", postfix=");
            sb2.append(this.f262791j);
            sb2.append(", format=");
            sb2.append(this.f262792k);
            sb2.append(", additionalButton=");
            sb2.append(this.f262793l);
            sb2.append(", displayingOptions=");
            sb2.append(this.f262794m);
            sb2.append(", placeholder=");
            sb2.append(this.f262795n);
            sb2.append(", motivation=");
            sb2.append(this.f262796o);
            sb2.append(", state=");
            sb2.append(this.f262797p);
            sb2.append(", inputType=");
            sb2.append(this.f262798q);
            sb2.append(", hideTitle=");
            sb2.append(this.f262799r);
            sb2.append(", htmlRootNode=");
            sb2.append(this.f262800s);
            sb2.append(", groupId=");
            return C22026a.c(sb2, this.f262801t, ')');
        }

        public o(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, int i12, int i13, @Y61.l String str5, @Y61.l String str6, @Y61.l j jVar, @Y61.l ItemWithAdditionalButton.AdditionalButton additionalButton, @Y61.l DisplayingOptions displayingOptions, @Y61.l String str7, @Y61.l AttributedText attributedText, @Y61.k ItemWithState.State state, @Y61.k FormatterType formatterType, boolean z12, @Y61.l hJ.m mVar, @Y61.l String str8) {
            super(str, null);
            this.f262784c = str;
            this.f262785d = str2;
            this.f262786e = str3;
            this.f262787f = str4;
            this.f262788g = i12;
            this.f262789h = i13;
            this.f262790i = str5;
            this.f262791j = str6;
            this.f262792k = jVar;
            this.f262793l = additionalButton;
            this.f262794m = displayingOptions;
            this.f262795n = str7;
            this.f262796o = attributedText;
            this.f262797p = state;
            this.f262798q = formatterType;
            this.f262799r = z12;
            this.f262800s = mVar;
            this.f262801t = str8;
        }
    }
}
