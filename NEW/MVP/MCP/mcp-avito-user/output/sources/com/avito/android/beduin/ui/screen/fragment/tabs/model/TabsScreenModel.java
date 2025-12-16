package com.avito.android.beduin.ui.screen.fragment.tabs.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.akita.compose.component.accordion.s;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.navigation_bar.NavigationBarItem;
import com.avito.android.beduin.common.shared.tabs.BeduinTabCounter;
import com.avito.android.beduin.network.model.BeduinTitleAlignment;
import com.avito.android.beduin.ui.screen.fragment.i;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.UniversalColor;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import qi.InterfaceC47401b;
import ri.C47659b;

/* compiled from: TabsScreenModel.kt */
@s0
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0005)*'$#B\u0087\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b#\u0010\"R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b$\u0010\"R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b%\u0010\"R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel;", "Lqi/b;", "Lcom/avito/android/beduin/ui/screen/fragment/i;", "", "id", "screenName", "title", "Lcom/avito/android/beduin/network/model/BeduinTitleAlignment;", "_titleAlignment", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$d;", "tabsSettings", "_selectedTabId", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onOpenActions", BeduinPromoBlockModel.SERIALIZED_NAME_ON_CLOSE_ACTIONS, "onBackButtonActions", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$b;", "tabs", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$NavigationBarSettings;", "navigationBarSettings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/network/model/BeduinTitleAlignment;Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$d;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$NavigationBarSettings;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getScreenName", "k", "Lcom/avito/android/beduin/network/model/BeduinTitleAlignment;", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$d;", "j", "()Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$d;", "Ljava/util/List;", "e", "()Ljava/util/List;", "d", "c", "i", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$NavigationBarSettings;", "b", "()Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$NavigationBarSettings;", "a", "NavigationBarSettings", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TabsScreenModel implements InterfaceC47401b, i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f104350a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C47659b f104351b = new C47659b(TabsScreenModel.class, Collections.singletonList("tabs"));

    @com.google.gson.annotations.c("selectedTabId")
    @l
    private final String _selectedTabId;

    @com.google.gson.annotations.c("titleAlignment")
    @l
    private final BeduinTitleAlignment _titleAlignment;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("navigationBarSettings")
    @l
    private final NavigationBarSettings navigationBarSettings;

    @com.google.gson.annotations.c("onBackButtonActions")
    @l
    private final List<BeduinAction> onBackButtonActions;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_ON_CLOSE_ACTIONS)
    @l
    private final List<BeduinAction> onCloseActions;

    @com.google.gson.annotations.c("onOpenActions")
    @l
    private final List<BeduinAction> onOpenActions;

    @com.google.gson.annotations.c("name")
    @l
    private final String screenName;

    @com.google.gson.annotations.c("tabs")
    @k
    private final List<b> tabs;

    @com.google.gson.annotations.c("tabsSettings")
    @k
    private final d tabsSettings;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    /* compiled from: TabsScreenModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$NavigationBarSettings;", "", "Lcom/avito/android/remote/model/UniversalColor;", "barTintColor", "tintColor", "titleColor", "", "_statusBarContentAppearance", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/Integer;)V", "Lcom/avito/android/remote/model/UniversalColor;", "a", "()Lcom/avito/android/remote/model/UniversalColor;", "c", "d", "Ljava/lang/Integer;", "StatusBarContentAppearance", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigationBarSettings {

        @com.google.gson.annotations.c("statusBarContentAppearance")
        @l
        private final Integer _statusBarContentAppearance;

        @com.google.gson.annotations.c("barTintColor")
        @l
        private final UniversalColor barTintColor;

        @com.google.gson.annotations.c("tintColor")
        @l
        private final UniversalColor tintColor;

        @com.google.gson.annotations.c("titleColor")
        @l
        private final UniversalColor titleColor;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: TabsScreenModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$NavigationBarSettings$StatusBarContentAppearance;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class StatusBarContentAppearance {

            /* renamed from: b, reason: collision with root package name */
            public static final StatusBarContentAppearance f104353b;

            /* renamed from: c, reason: collision with root package name */
            public static final StatusBarContentAppearance f104354c;

            /* renamed from: d, reason: collision with root package name */
            public static final StatusBarContentAppearance f104355d;

            /* renamed from: e, reason: collision with root package name */
            public static final StatusBarContentAppearance f104356e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ StatusBarContentAppearance[] f104357f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f104358g;

            static {
                StatusBarContentAppearance statusBarContentAppearance = new StatusBarContentAppearance("Dark", 0);
                f104353b = statusBarContentAppearance;
                StatusBarContentAppearance statusBarContentAppearance2 = new StatusBarContentAppearance("Light", 1);
                f104354c = statusBarContentAppearance2;
                StatusBarContentAppearance statusBarContentAppearance3 = new StatusBarContentAppearance("AlwaysDark", 2);
                f104355d = statusBarContentAppearance3;
                StatusBarContentAppearance statusBarContentAppearance4 = new StatusBarContentAppearance("AlwaysLight", 3);
                f104356e = statusBarContentAppearance4;
                StatusBarContentAppearance[] statusBarContentAppearanceArr = {statusBarContentAppearance, statusBarContentAppearance2, statusBarContentAppearance3, statusBarContentAppearance4};
                f104357f = statusBarContentAppearanceArr;
                f104358g = kotlin.enums.c.a(statusBarContentAppearanceArr);
            }

            public StatusBarContentAppearance() {
                throw null;
            }

            public static StatusBarContentAppearance valueOf(String str) {
                return (StatusBarContentAppearance) Enum.valueOf(StatusBarContentAppearance.class, str);
            }

            public static StatusBarContentAppearance[] values() {
                return (StatusBarContentAppearance[]) f104357f.clone();
            }
        }

        public NavigationBarSettings(@l UniversalColor universalColor, @l UniversalColor universalColor2, @l UniversalColor universalColor3, @l Integer num) {
            this.barTintColor = universalColor;
            this.tintColor = universalColor2;
            this.titleColor = universalColor3;
            this._statusBarContentAppearance = num;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final UniversalColor getBarTintColor() {
            return this.barTintColor;
        }

        @k
        public final StatusBarContentAppearance b() {
            Integer num = this._statusBarContentAppearance;
            return (num != null && num.intValue() == 0) ? StatusBarContentAppearance.f104353b : (num != null && num.intValue() == 1) ? StatusBarContentAppearance.f104354c : (num != null && num.intValue() == 2) ? StatusBarContentAppearance.f104355d : (num != null && num.intValue() == 3) ? StatusBarContentAppearance.f104356e : StatusBarContentAppearance.f104353b;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final UniversalColor getTintColor() {
            return this.tintColor;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final UniversalColor getTitleColor() {
            return this.titleColor;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigationBarSettings)) {
                return false;
            }
            NavigationBarSettings navigationBarSettings = (NavigationBarSettings) obj;
            return L.f(this.barTintColor, navigationBarSettings.barTintColor) && L.f(this.tintColor, navigationBarSettings.tintColor) && L.f(this.titleColor, navigationBarSettings.titleColor) && L.f(this._statusBarContentAppearance, navigationBarSettings._statusBarContentAppearance);
        }

        public final int hashCode() {
            UniversalColor universalColor = this.barTintColor;
            int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
            UniversalColor universalColor2 = this.tintColor;
            int iHashCode2 = (iHashCode + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
            UniversalColor universalColor3 = this.titleColor;
            int iHashCode3 = (iHashCode2 + (universalColor3 == null ? 0 : universalColor3.hashCode())) * 31;
            Integer num = this._statusBarContentAppearance;
            return iHashCode3 + (num != null ? num.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigationBarSettings(barTintColor=");
            sb2.append(this.barTintColor);
            sb2.append(", tintColor=");
            sb2.append(this.tintColor);
            sb2.append(", titleColor=");
            sb2.append(this.titleColor);
            sb2.append(", _statusBarContentAppearance=");
            return s.j(sb2, this._statusBarContentAppearance, ')');
        }
    }

    /* compiled from: TabsScreenModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$a;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TabsScreenModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$b;", "", "", "id", "title", "Lcom/avito/android/beduin/common/shared/tabs/BeduinTabCounter;", "counter", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onManualSelectActions", "", "_isEnabled", "Lcom/avito/android/beduin/common/navigation_bar/NavigationBarItem;", "navBarRightItems", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$c;", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/shared/tabs/BeduinTabCounter;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$c;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "f", "Lcom/avito/android/beduin/common/shared/tabs/BeduinTabCounter;", "b", "()Lcom/avito/android/beduin/common/shared/tabs/BeduinTabCounter;", "Ljava/util/List;", "e", "()Ljava/util/List;", "Ljava/lang/Boolean;", "d", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$c;", "a", "()Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        @com.google.gson.annotations.c("isEnabled")
        @l
        private final Boolean _isEnabled;

        @com.google.gson.annotations.c("content")
        @k
        private final c content;

        @com.google.gson.annotations.c("counter")
        @l
        private final BeduinTabCounter counter;

        @com.google.gson.annotations.c("id")
        @k
        private final String id;

        @com.google.gson.annotations.c("navBarRightItems")
        @l
        private final List<NavigationBarItem> navBarRightItems;

        @com.google.gson.annotations.c("onManualSelectActions")
        @l
        private final List<BeduinAction> onManualSelectActions;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k String str, @k String str2, @l BeduinTabCounter beduinTabCounter, @l List<? extends BeduinAction> list, @l Boolean bool, @l List<? extends NavigationBarItem> list2, @k c cVar) {
            this.id = str;
            this.title = str2;
            this.counter = beduinTabCounter;
            this.onManualSelectActions = list;
            this._isEnabled = bool;
            this.navBarRightItems = list2;
            this.content = cVar;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final c getContent() {
            return this.content;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final BeduinTabCounter getCounter() {
            return this.counter;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        public final List<NavigationBarItem> d() {
            return this.navBarRightItems;
        }

        @l
        public final List<BeduinAction> e() {
            return this.onManualSelectActions;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.id, bVar.id) && L.f(this.title, bVar.title) && L.f(this.counter, bVar.counter) && L.f(this.onManualSelectActions, bVar.onManualSelectActions) && L.f(this._isEnabled, bVar._isEnabled) && L.f(this.navBarRightItems, bVar.navBarRightItems) && L.f(this.content, bVar.content);
        }

        @k
        /* renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean g() {
            Boolean bool = this._isEnabled;
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }

        public final int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
            BeduinTabCounter beduinTabCounter = this.counter;
            int iHashCode = (iD2 + (beduinTabCounter == null ? 0 : beduinTabCounter.hashCode())) * 31;
            List<BeduinAction> list = this.onManualSelectActions;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this._isEnabled;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            List<NavigationBarItem> list2 = this.navBarRightItems;
            return this.content.hashCode() + ((iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            return "Tab(id=" + this.id + ", title=" + this.title + ", counter=" + this.counter + ", onManualSelectActions=" + this.onManualSelectActions + ", _isEnabled=" + this._isEnabled + ", navBarRightItems=" + this.navBarRightItems + ", content=" + this.content + ')';
        }
    }

    /* compiled from: TabsScreenModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$c;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
    }

    /* compiled from: TabsScreenModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$d;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabsScreenModel(@k String str, @l String str2, @l String str3, @l BeduinTitleAlignment beduinTitleAlignment, @k d dVar, @l String str4, @l List<? extends BeduinAction> list, @l List<? extends BeduinAction> list2, @l List<? extends BeduinAction> list3, @k List<b> list4, @l NavigationBarSettings navigationBarSettings) {
        this.id = str;
        this.screenName = str2;
        this.title = str3;
        this._titleAlignment = beduinTitleAlignment;
        this.tabsSettings = dVar;
        this._selectedTabId = str4;
        this.onOpenActions = list;
        this.onCloseActions = list2;
        this.onBackButtonActions = list3;
        this.tabs = list4;
        this.navigationBarSettings = navigationBarSettings;
    }

    public static TabsScreenModel a(TabsScreenModel tabsScreenModel, String str) {
        return new TabsScreenModel(tabsScreenModel.id, tabsScreenModel.screenName, tabsScreenModel.title, tabsScreenModel._titleAlignment, tabsScreenModel.tabsSettings, str, tabsScreenModel.onOpenActions, tabsScreenModel.onCloseActions, tabsScreenModel.onBackButtonActions, tabsScreenModel.tabs, tabsScreenModel.navigationBarSettings);
    }

    @l
    /* renamed from: b, reason: from getter */
    public final NavigationBarSettings getNavigationBarSettings() {
        return this.navigationBarSettings;
    }

    @l
    public final List<BeduinAction> c() {
        return this.onBackButtonActions;
    }

    @l
    public final List<BeduinAction> d() {
        return this.onCloseActions;
    }

    @l
    public final List<BeduinAction> e() {
        return this.onOpenActions;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabsScreenModel)) {
            return false;
        }
        TabsScreenModel tabsScreenModel = (TabsScreenModel) obj;
        return L.f(this.id, tabsScreenModel.id) && L.f(this.screenName, tabsScreenModel.screenName) && L.f(this.title, tabsScreenModel.title) && this._titleAlignment == tabsScreenModel._titleAlignment && L.f(this.tabsSettings, tabsScreenModel.tabsSettings) && L.f(this._selectedTabId, tabsScreenModel._selectedTabId) && L.f(this.onOpenActions, tabsScreenModel.onOpenActions) && L.f(this.onCloseActions, tabsScreenModel.onCloseActions) && L.f(this.onBackButtonActions, tabsScreenModel.onBackButtonActions) && L.f(this.tabs, tabsScreenModel.tabs) && L.f(this.navigationBarSettings, tabsScreenModel.navigationBarSettings);
    }

    @l
    public final b f() {
        Object next;
        Iterator<T> it = this.tabs.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((b) next).getId(), g())) {
                break;
            }
        }
        return (b) next;
    }

    @k
    public final String g() {
        String str = this._selectedTabId;
        return str == null ? ((b) C42745f0.E(this.tabs)).getId() : str;
    }

    @Override // qi.InterfaceC47401b
    @k
    public final String getId() {
        return this.id;
    }

    @Override // qi.InterfaceC47401b
    @l
    public final String getScreenName() {
        return this.screenName;
    }

    @Override // qi.InterfaceC47401b
    @k
    public final String getType() {
        return "tabs";
    }

    public final boolean h() {
        return this.tabs.size() >= 2;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.screenName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BeduinTitleAlignment beduinTitleAlignment = this._titleAlignment;
        int iHashCode4 = (this.tabsSettings.hashCode() + ((iHashCode3 + (beduinTitleAlignment == null ? 0 : beduinTitleAlignment.hashCode())) * 31)) * 31;
        String str3 = this._selectedTabId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<BeduinAction> list = this.onOpenActions;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.onCloseActions;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BeduinAction> list3 = this.onBackButtonActions;
        int iE2 = H.e((iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.tabs);
        NavigationBarSettings navigationBarSettings = this.navigationBarSettings;
        return iE2 + (navigationBarSettings != null ? navigationBarSettings.hashCode() : 0);
    }

    @k
    public final List<b> i() {
        return this.tabs;
    }

    @k
    /* renamed from: j, reason: from getter */
    public final d getTabsSettings() {
        return this.tabsSettings;
    }

    @l
    /* renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    public final BeduinTitleAlignment l() {
        BeduinTitleAlignment beduinTitleAlignment = this._titleAlignment;
        if (beduinTitleAlignment != null) {
            return beduinTitleAlignment;
        }
        BeduinTitleAlignment.f104010b.getClass();
        return BeduinTitleAlignment.f104011c;
    }

    @k
    public final String toString() {
        return "TabsScreenModel(id=" + this.id + ", screenName=" + this.screenName + ", title=" + this.title + ", _titleAlignment=" + this._titleAlignment + ", tabsSettings=" + this.tabsSettings + ", _selectedTabId=" + this._selectedTabId + ", onOpenActions=" + this.onOpenActions + ", onCloseActions=" + this.onCloseActions + ", onBackButtonActions=" + this.onBackButtonActions + ", tabs=" + this.tabs + ", navigationBarSettings=" + this.navigationBarSettings + ')';
    }
}
