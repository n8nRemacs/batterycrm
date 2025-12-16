package com.avito.android.user_stats.extended_user_stats;

import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.view.C23038g0;
import androidx.view.C23060r0;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NameIdEntity;
import com.avito.android.remote.model.category_parameters.DateTimeParameterKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.select.SelectResult;
import com.avito.android.user_stats.extended_user_stats.I;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import j.T;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;

/* compiled from: ExtendedUserStatsViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsViewModel;", "Landroidx/lifecycle/M0;", "a", "b", "ConfigProgressState", "c", "ConfigType", "d", "e", "f", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExtendedUserStatsViewModel extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final C23060r0 f317044E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f317045J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final Resources f317046K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final m f317047L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f317048M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_stats.b f317049N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final lE.g f317050O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f317051P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f317052Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f317053R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final C23038g0<f> f317054S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C23038g0<c> f317055T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<I> f317056U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public fW0.h f317057V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f317058W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f317059X;

    /* renamed from: Y, reason: collision with root package name */
    public final Calendar f317060Y;

    /* renamed from: Z, reason: collision with root package name */
    public final Calendar f317061Z;

    /* renamed from: a0, reason: collision with root package name */
    public final Calendar f317062a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Calendar f317063b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f317064c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f317065d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f317066e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f317067f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f317068g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f317069h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f317070i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f317071j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final C35731c f317072k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.l
    public StatsConfig f317073l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public e f317074m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public String f317075n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public String f317076o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.l
    public List<String> f317077p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D f317078q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f317079r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f317080s0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExtendedUserStatsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsViewModel$ConfigProgressState;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConfigProgressState {

        /* renamed from: b, reason: collision with root package name */
        public static final ConfigProgressState f317081b;

        /* renamed from: c, reason: collision with root package name */
        public static final ConfigProgressState f317082c;

        /* renamed from: d, reason: collision with root package name */
        public static final ConfigProgressState f317083d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ConfigProgressState[] f317084e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f317085f;

        static {
            ConfigProgressState configProgressState = new ConfigProgressState("DATA", 0);
            f317081b = configProgressState;
            ConfigProgressState configProgressState2 = new ConfigProgressState("ERROR", 1);
            f317082c = configProgressState2;
            ConfigProgressState configProgressState3 = new ConfigProgressState("LOADING", 2);
            f317083d = configProgressState3;
            ConfigProgressState[] configProgressStateArr = {configProgressState, configProgressState2, configProgressState3};
            f317084e = configProgressStateArr;
            f317085f = kotlin.enums.c.a(configProgressStateArr);
        }

        public ConfigProgressState() {
            throw null;
        }

        public static ConfigProgressState valueOf(String str) {
            return (ConfigProgressState) Enum.valueOf(ConfigProgressState.class, str);
        }

        public static ConfigProgressState[] values() {
            return (ConfigProgressState[]) f317084e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExtendedUserStatsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsViewModel$ConfigType;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConfigType {

        /* renamed from: c, reason: collision with root package name */
        public static final ConfigType f317086c;

        /* renamed from: d, reason: collision with root package name */
        public static final ConfigType f317087d;

        /* renamed from: e, reason: collision with root package name */
        public static final ConfigType f317088e;

        /* renamed from: f, reason: collision with root package name */
        public static final ConfigType f317089f;

        /* renamed from: g, reason: collision with root package name */
        public static final ConfigType f317090g;

        /* renamed from: h, reason: collision with root package name */
        public static final ConfigType f317091h;

        /* renamed from: i, reason: collision with root package name */
        public static final ConfigType f317092i;

        /* renamed from: j, reason: collision with root package name */
        public static final ConfigType f317093j;

        /* renamed from: k, reason: collision with root package name */
        public static final ConfigType f317094k;

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ ConfigType[] f317095l;

        /* renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f317096m;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f317097b;

        static {
            ConfigType configType = new ConfigType("CALENDAR", 0, "CALENDAR");
            f317086c = configType;
            ConfigType configType2 = new ConfigType("LOCATIONS", 1, "LOCATIONS");
            f317087d = configType2;
            ConfigType configType3 = new ConfigType("EMPLOYEES", 2, "EMPLOYEES");
            f317088e = configType3;
            ConfigType configType4 = new ConfigType("CATEGORY", 3, "CATEGORY");
            f317089f = configType4;
            ConfigType configType5 = new ConfigType("SPENDINGS", 4, "SPENDINGS");
            f317090g = configType5;
            ConfigType configType6 = new ConfigType("SPACES", 5, "SPACES");
            f317091h = configType6;
            ConfigType configType7 = new ConfigType("METRICS", 6, "METRICS");
            f317092i = configType7;
            ConfigType configType8 = new ConfigType("SETTINGS", 7, "SETTINGS");
            f317093j = configType8;
            ConfigType configType9 = new ConfigType("ITEM_ADVERT", 8, "ITEM");
            f317094k = configType9;
            ConfigType[] configTypeArr = {configType, configType2, configType3, configType4, configType5, configType6, configType7, configType8, configType9};
            f317095l = configTypeArr;
            f317096m = kotlin.enums.c.a(configTypeArr);
        }

        public ConfigType(String str, int i12, String str2) {
            this.f317097b = str2;
        }

        public static ConfigType valueOf(String str) {
            return (ConfigType) Enum.valueOf(ConfigType.class, str);
        }

        public static ConfigType[] values() {
            return (ConfigType[]) f317095l.clone();
        }
    }

    /* compiled from: ExtendedUserStatsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsViewModel$a;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Calendar f317098a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Calendar f317099b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Calendar f317100c;

        public a(@Y61.k Calendar calendar, @Y61.k Calendar calendar2, @Y61.k Calendar calendar3) {
            this.f317098a = calendar;
            this.f317099b = calendar2;
            this.f317100c = calendar3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f317098a, aVar.f317098a) && L.f(this.f317099b, aVar.f317099b) && L.f(this.f317100c, aVar.f317100c);
        }

        public final int hashCode() {
            return this.f317100c.hashCode() + ((this.f317099b.hashCode() + (this.f317098a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "CalendarState(dateFrom=" + this.f317098a + ", dateTo=" + this.f317099b + ", startCalendar=" + this.f317100c + ')';
        }
    }

    /* compiled from: ExtendedUserStatsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsViewModel$b;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f317101a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f317102b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ConfigType f317103c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f317104d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final List<d> f317105e;

        public b() {
            this(null, false, null, null, null, 31, null);
        }

        public static b a(b bVar, String str, boolean z12, String str2, int i12) {
            if ((i12 & 1) != 0) {
                str = bVar.f317101a;
            }
            String str3 = str;
            if ((i12 & 8) != 0) {
                str2 = bVar.f317104d;
            }
            return new b(str3, z12, bVar.f317103c, str2, bVar.f317105e);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f317101a, bVar.f317101a) && this.f317102b == bVar.f317102b && this.f317103c == bVar.f317103c && L.f(this.f317104d, bVar.f317104d) && L.f(this.f317105e, bVar.f317105e);
        }

        public final int hashCode() {
            String str = this.f317101a;
            int iHashCode = (this.f317103c.hashCode() + androidx.appcompat.app.r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f317102b)) * 31;
            String str2 = this.f317104d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<d> list = this.f317105e;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ConfigItemState(name=");
            sb2.append(this.f317101a);
            sb2.append(", isDefault=");
            sb2.append(this.f317102b);
            sb2.append(", type=");
            sb2.append(this.f317103c);
            sb2.append(", calendarFromGraph=");
            sb2.append(this.f317104d);
            sb2.append(", items=");
            return androidx.compose.foundation.H.p(sb2, this.f317105e, ')');
        }

        public b(@Y61.l String str, boolean z12, @Y61.k ConfigType configType, @Y61.l String str2, @Y61.l List<d> list) {
            this.f317101a = str;
            this.f317102b = z12;
            this.f317103c = configType;
            this.f317104d = str2;
            this.f317105e = list;
        }

        public /* synthetic */ b(String str, boolean z12, ConfigType configType, String str2, List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? ConfigType.f317086c : configType, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : list);
        }
    }

    /* compiled from: ExtendedUserStatsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsViewModel$d;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Image f317108a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f317109b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final AttributedText f317110c;

        public d(@Y61.l Image image, @Y61.l String str, @Y61.l AttributedText attributedText) {
            this.f317108a = image;
            this.f317109b = str;
            this.f317110c = attributedText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f317108a, dVar.f317108a) && L.f(this.f317109b, dVar.f317109b) && L.f(this.f317110c, dVar.f317110c);
        }

        public final int hashCode() {
            Image image = this.f317108a;
            int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
            String str = this.f317109b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AttributedText attributedText = this.f317110c;
            return iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ItemValue(icon=");
            sb2.append(this.f317108a);
            sb2.append(", id=");
            sb2.append(this.f317109b);
            sb2.append(", title=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f317110c, ')');
        }
    }

    /* compiled from: ExtendedUserStatsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsViewModel$e;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f317111a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f317112b;

        /* JADX WARN: Illegal instructions before constructor call */
        public e() {
            boolean z12 = false;
            this(z12, z12, 3, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f317111a == eVar.f317111a && this.f317112b == eVar.f317112b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f317112b) + (Boolean.hashCode(this.f317111a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TabFeatures(platformSpendings=");
            sb2.append(this.f317111a);
            sb2.append(", platformDynamics=");
            return androidx.appcompat.app.r.x(sb2, this.f317112b, ')');
        }

        public e(boolean z12, boolean z13) {
            this.f317111a = z12;
            this.f317112b = z13;
        }

        public /* synthetic */ e(boolean z12, boolean z13, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13);
        }
    }

    /* compiled from: ExtendedUserStatsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsViewModel$f;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<String> f317113a;

        /* renamed from: b, reason: collision with root package name */
        public final int f317114b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final e f317115c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final List<Action> f317116d;

        public f(@Y61.k List<String> list, int i12, @Y61.l e eVar, @Y61.l List<Action> list2) {
            this.f317113a = list;
            this.f317114b = i12;
            this.f317115c = eVar;
            this.f317116d = list2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f317113a, fVar.f317113a) && this.f317114b == fVar.f317114b && L.f(this.f317115c, fVar.f317115c) && L.f(this.f317116d, fVar.f317116d);
        }

        public final int hashCode() {
            int iE2 = androidx.appcompat.app.r.e(this.f317114b, this.f317113a.hashCode() * 31, 31);
            e eVar = this.f317115c;
            int iHashCode = (iE2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            List<Action> list = this.f317116d;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TabState(tabNames=");
            sb2.append(this.f317113a);
            sb2.append(", selectedTabPosition=");
            sb2.append(this.f317114b);
            sb2.append(", tabFeatures=");
            sb2.append(this.f317115c);
            sb2.append(", actions=");
            return androidx.compose.foundation.H.p(sb2, this.f317116d, ')');
        }
    }

    /* compiled from: ExtendedUserStatsViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g {
        static {
            int[] iArr = new int[ConfigType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ConfigType configType = ConfigType.f317086c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ConfigType configType2 = ConfigType.f317086c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ConfigType configType3 = ConfigType.f317086c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ConfigType configType4 = ConfigType.f317086c;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ConfigType configType5 = ConfigType.f317086c;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ConfigType configType6 = ConfigType.f317086c;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ConfigType configType7 = ConfigType.f317086c;
                iArr[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ConfigType configType8 = ConfigType.f317086c;
                iArr[7] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ExtendedUserStatsViewModel(@Y61.k C23060r0 c23060r0, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Resources resources, @Y61.k m mVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.user_stats.b bVar, @Y61.k lE.g gVar, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k com.avito.android.deep_linking.x xVar) {
        this.f317044E = c23060r0;
        this.f317045J = interfaceC28373a;
        this.f317046K = resources;
        this.f317047L = mVar;
        this.f317048M = interfaceC35745a5;
        this.f317049N = bVar;
        this.f317050O = gVar;
        this.f317051P = interfaceC35863o4;
        this.f317052Q = xVar;
        C23038g0<f> c23038g0 = new C23038g0<>();
        this.f317054S = c23038g0;
        C23038g0<c> c23038g02 = new C23038g0<>();
        this.f317055T = c23038g02;
        com.avito.android.util.architecture_components.D<I> d12 = new com.avito.android.util.architecture_components.D<>();
        this.f317056U = d12;
        this.f317059X = new io.reactivex.rxjava3.disposables.c();
        this.f317060Y = Calendar.getInstance();
        this.f317061Z = Calendar.getInstance();
        this.f317062a0 = Calendar.getInstance();
        this.f317063b0 = Calendar.getInstance();
        this.f317064c0 = new SimpleDateFormat("d MMM", Locale.getDefault());
        this.f317065d0 = new SimpleDateFormat("d.MM.yy", Locale.getDefault());
        this.f317066e0 = new LinkedHashSet();
        this.f317067f0 = new LinkedHashSet();
        this.f317068g0 = new LinkedHashSet();
        this.f317069h0 = new LinkedHashSet();
        this.f317070i0 = new LinkedHashSet();
        this.f317071j0 = new LinkedHashSet();
        this.f317072k0 = new C35731c(interfaceC35863o4);
        boolean z12 = false;
        this.f317074m0 = new e(z12, z12, 3, null);
        this.f317075n0 = "";
        this.f317076o0 = "";
        this.f317077p0 = C42784z0.f406748b;
        this.f317078q0 = d12;
        this.f317079r0 = c23038g0;
        this.f317080s0 = c23038g02;
        if (mVar.a(3, "IS_SHOWN_METRICS_TOOLTIP")) {
            d12.postValue(I.c.f317137a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel.c ke(com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel r17, java.lang.String r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel.ke(com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel, java.lang.String):com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel$c");
    }

    public static /* synthetic */ c ne(ExtendedUserStatsViewModel extendedUserStatsViewModel, String str, ConfigProgressState configProgressState) {
        return extendedUserStatsViewModel.me(str, null, null, null, null, null, null, null, configProgressState);
    }

    public static ArrayList re(String str, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            NameIdEntity nameIdEntity = (NameIdEntity) it.next();
            if (!L.f(nameIdEntity.getId(), DateTimeParameterKt.DATE_TIME_PARAMETER_PRESENT_TIME) && (str == null || !L.f(nameIdEntity.getId(), "ALL"))) {
                arrayList.add(nameIdEntity.getId());
            }
        }
        return arrayList;
    }

    public static String se(int i12) {
        return i12 != 0 ? i12 != 1 ? "ois_expenses" : "ois_trends" : "ois_main_results";
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void we(com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel r27, int r28, com.avito.android.select.SelectResult r29, java.util.Date r30, java.util.Date r31, java.lang.String r32, int r33) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel.we(com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel, int, com.avito.android.select.SelectResult, java.util.Date, java.util.Date, java.lang.String, int):void");
    }

    public final void O() {
        ArrayList arrayList;
        if (this.f317057V != null || this.f317058W) {
            return;
        }
        lE.g gVar = this.f317050O;
        gVar.getClass();
        kotlin.reflect.n<Object> nVar = lE.g.f413657e[0];
        if (((Boolean) gVar.f413658b.a().invoke()).booleanValue()) {
            List<String> list = this.f317077p0;
            if (list != null) {
                List<String> list2 = list;
                arrayList = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(Long.parseLong((String) it.next())));
                }
            } else {
                arrayList = null;
            }
            C43259k.d(N0.a(this), null, null, new E(this, arrayList, null), 3);
            return;
        }
        this.f317058W = true;
        C23038g0<c> c23038g0 = this.f317055T;
        SimpleDateFormat simpleDateFormat = this.f317065d0;
        SimpleDateFormat simpleDateFormat2 = this.f317064c0;
        Calendar calendar = this.f317060Y;
        Calendar calendar2 = this.f317063b0;
        c23038g0.postValue(ne(this, C35729a.b(calendar, calendar2, simpleDateFormat, simpleDateFormat2), ConfigProgressState.f317083d));
        this.f317059X.b(this.f317049N.a(this.f317077p0).r(C.f317002b).F().j0(this.f317048M.e()).t0(new D(this, C35729a.b(calendar, calendar2, simpleDateFormat, simpleDateFormat2))));
    }

    public final void le(boolean z12) {
        b bVar;
        Object next;
        c value = this.f317055T.getValue();
        List<b> list = value != null ? value.f317106a : null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((b) next).f317103c == ConfigType.f317086c) {
                        break;
                    }
                }
            }
            bVar = (b) next;
        } else {
            bVar = null;
        }
        if (z12) {
            return;
        }
        if ((bVar != null ? bVar.f317104d : null) != null) {
            this.f317056U.postValue(I.b.f317136a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel.c me(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.List<com.avito.user_stats.model.extended_user_stats.ItemValueStats> r28, com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel.ConfigProgressState r29) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel.me(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel$ConfigProgressState):com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel$c");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void oe(java.util.ArrayList r16, com.avito.android.select.SelectResult r17, com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel.ConfigType r18, java.util.Set r19, int r20, int r21, java.lang.String r22, int r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel.oe(java.util.ArrayList, com.avito.android.select.SelectResult, com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel$ConfigType, java.util.Set, int, int, java.lang.String, int, java.lang.String):void");
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f317059X.dispose();
    }

    public final String pe(@T int i12, String str, List list) {
        if (list.isEmpty()) {
            return str;
        }
        if (list.size() == 1) {
            return ((NameIdEntity) list.get(0)).getF119974b();
        }
        return this.f317046K.getQuantityString(i12, list.size(), Integer.valueOf(list.size()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    public final NameIdEntity qe() {
        T next;
        T next2;
        fW0.h hVar = this.f317057V;
        ArrayList arrayListA = H.a(hVar != null ? hVar.j() : null);
        if (arrayListA == null) {
            return null;
        }
        l0.h hVar2 = new l0.h();
        if (this.f317075n0.length() > 0) {
            Iterator it = arrayListA.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = 0;
                    break;
                }
                next2 = it.next();
                if (L.f(((fW0.x) next2).getSlug(), this.f317075n0)) {
                    break;
                }
            }
            hVar2.f406842b = next2;
        }
        if (hVar2.f406842b == 0) {
            Iterator it2 = arrayListA.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = 0;
                    break;
                }
                next = it2.next();
                if (L.f(((fW0.x) next).getIsSelected(), Boolean.TRUE)) {
                    break;
                }
            }
            hVar2.f406842b = next;
        }
        if (((fW0.x) hVar2.f406842b) != null) {
            return new NameIdEntity(((fW0.x) hVar2.f406842b).getSlug(), ((fW0.x) hVar2.f406842b).getName());
        }
        return null;
    }

    public final int te() {
        Integer num = (Integer) this.f317044E.b("state.selected_tab.index");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void ue(@Y61.k ConfigType configType, boolean z12) {
        Date date;
        Date date2;
        switch (configType.ordinal()) {
            case 0:
                le(z12);
                if (z12) {
                    date = null;
                    date2 = null;
                } else {
                    date = new Date(this.f317061Z.getTimeInMillis());
                    date2 = new Date(this.f317062a0.getTimeInMillis());
                }
                we(this, 5, null, date, date2, null, 18);
                break;
            case 1:
                we(this, 6, null, null, null, null, 30);
                break;
            case 2:
                we(this, 8, null, null, null, null, 30);
                break;
            case 3:
                we(this, 7, null, null, null, null, 30);
                break;
            case 4:
                we(this, 9, null, null, null, null, 30);
                break;
            case 5:
                we(this, 11, null, null, null, null, 30);
                break;
            case 6:
                NameIdEntity nameIdEntityQe = qe();
                if (nameIdEntityQe != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(nameIdEntityQe);
                    we(this, 10, new SelectResult("10", arrayList, null, 4, null), null, null, null, 28);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ve(java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel.ve(java.lang.String):void");
    }

    public final void xe(@Y61.k com.avito.android.user_stats.extended_user_stats.metrics.f fVar, int i12) {
        String strValueOf = String.valueOf(i12);
        com.avito.android.lib.design.bottom_sheet.k kVar = fVar.f317285a;
        String str = kVar.f178541a;
        CharSequence charSequence = kVar.f178542b;
        we(this, i12, new SelectResult(strValueOf, Collections.singletonList(new NameIdEntity(str, charSequence != null ? charSequence.toString() : null)), null, 4, null), null, null, fVar.f317286b, 12);
    }

    public final void ye(Integer num) throws Resources.NotFoundException {
        AK0.l lVar = this.f317047L.f317272a;
        String string = lVar.getString("extended_user_statstab_name_1");
        if (string == null) {
            string = "";
        }
        String string2 = lVar.getString("extended_user_statstab_name_2");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = lVar.getString("extended_user_statstab_name_3");
        String string4 = string3 != null ? string3 : "";
        int length = string.length();
        Resources resources = this.f317046K;
        if (length == 0) {
            string = resources.getString(R.string.user_stats_basic_indicators);
        }
        if (string2.length() == 0) {
            string2 = resources.getString(R.string.user_stats_dinamics);
        }
        if (string4.length() == 0) {
            string4 = resources.getString(R.string.user_stats_costs);
        }
        ze(C42745f0.U(string, string2, string4), num);
    }

    public final void ze(List<String> list, Integer num) {
        if (num != null && !this.f317053R) {
            this.f317044E.e(num, "state.selected_tab.index");
            this.f317053R = true;
        }
        if (list != null) {
            C23038g0<f> c23038g0 = this.f317054S;
            int iTe = te();
            e eVar = this.f317074m0;
            fW0.h hVar = this.f317057V;
            c23038g0.postValue(new f(list, iTe, eVar, hVar != null ? hVar.a() : null));
            int size = list.size();
            m mVar = this.f317047L;
            if (size == 1) {
                String str = list.get(0);
                int i12 = m.f317271b;
                SharedPreferences.Editor editorEdit = mVar.f317272a.getF316a().edit();
                editorEdit.putString("extended_user_statstab_name_1", str).putString("extended_user_statstab_name_2", null).putString("extended_user_statstab_name_3", null);
                editorEdit.apply();
                return;
            }
            String str2 = list.get(0);
            String str3 = list.get(1);
            String str4 = list.get(2);
            SharedPreferences.Editor editorEdit2 = mVar.f317272a.getF316a().edit();
            editorEdit2.putString("extended_user_statstab_name_1", str2).putString("extended_user_statstab_name_2", str3).putString("extended_user_statstab_name_3", str4);
            editorEdit2.apply();
        }
    }

    /* compiled from: ExtendedUserStatsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsViewModel$c;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final List<b> f317106a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ConfigProgressState f317107b;

        public c(@Y61.l List<b> list, @Y61.k ConfigProgressState configProgressState) {
            this.f317106a = list;
            this.f317107b = configProgressState;
        }

        public static c a(c cVar, ArrayList arrayList) {
            ConfigProgressState configProgressState = cVar.f317107b;
            cVar.getClass();
            return new c(arrayList, configProgressState);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f317106a, cVar.f317106a) && this.f317107b == cVar.f317107b;
        }

        public final int hashCode() {
            List<b> list = this.f317106a;
            return this.f317107b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            return "ConfigState(items=" + this.f317106a + ", state=" + this.f317107b + ')';
        }

        public /* synthetic */ c(List list, ConfigProgressState configProgressState, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : list, configProgressState);
        }
    }
}
