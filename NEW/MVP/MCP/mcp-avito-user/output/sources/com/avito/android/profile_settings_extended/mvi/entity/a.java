package com.avito.android.profile_settings_extended.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.extended_profile_ui_components.ActionsBottomMenuData;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.SelectionItem;
import com.avito.android.profile_settings_extended.entity.CommonValueId;
import com.avito.android.profile_settings_extended.entity.u;
import com.avito.android.profile_settings_extended.mvi.entity.CommonValueBottomMenuAction;
import com.avito.android.remote.model.text.AttributedText;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import yc0.r;

/* compiled from: ExtendedProfileSettingsState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/a;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a extends q {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final b f230659m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final a f230660n = new a(null, null, false, null, null, null, null, null, null, null, null, 2047, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final u f230661b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Throwable f230662c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f230663d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<String> f230664e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UploadImage f230665f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final r f230666g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final c f230667h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Set<String> f230668i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final C7018a f230669j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final d f230670k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final ActionsBottomMenuData<yc0.k> f230671l;

    /* compiled from: ExtendedProfileSettingsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/a$a;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_extended.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C7018a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CommonValueId f230672a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f230673b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final yc0.k f230674c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final CommonValueBottomMenuAction.DeleteCommonValue f230675d;

        public C7018a(@k CommonValueId commonValueId, boolean z12, @k yc0.k kVar, @k CommonValueBottomMenuAction.DeleteCommonValue deleteCommonValue) {
            this.f230672a = commonValueId;
            this.f230673b = z12;
            this.f230674c = kVar;
            this.f230675d = deleteCommonValue;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7018a)) {
                return false;
            }
            C7018a c7018a = (C7018a) obj;
            return L.f(this.f230672a, c7018a.f230672a) && this.f230673b == c7018a.f230673b && L.f(this.f230674c, c7018a.f230674c) && L.f(this.f230675d, c7018a.f230675d);
        }

        public final int hashCode() {
            return this.f230675d.hashCode() + ((this.f230674c.hashCode() + androidx.appcompat.app.r.i(this.f230672a.hashCode() * 31, 31, this.f230673b)) * 31);
        }

        @k
        public final String toString() {
            return "CommonValueBottomMenuData(id=" + this.f230672a + ", isDeletionInProgress=" + this.f230673b + ", editValueAction=" + this.f230674c + ", removeValueAction=" + this.f230675d + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/a$b;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: ExtendedProfileSettingsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/a$c;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f230676a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f230677b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedText f230678c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f230679d;

        public c() {
            this(false, null, null, false, 15, null);
        }

        public static c a(c cVar, boolean z12) {
            String str = cVar.f230677b;
            AttributedText attributedText = cVar.f230678c;
            boolean z13 = cVar.f230679d;
            cVar.getClass();
            return new c(str, z12, z13, attributedText);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f230676a == cVar.f230676a && L.f(this.f230677b, cVar.f230677b) && L.f(this.f230678c, cVar.f230678c) && this.f230679d == cVar.f230679d;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f230676a) * 31;
            String str = this.f230677b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AttributedText attributedText = this.f230678c;
            return Boolean.hashCode(this.f230679d) + ((iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageBottomMenuData(isDeletionInProgress=");
            sb2.append(this.f230676a);
            sb2.append(", title=");
            sb2.append(this.f230677b);
            sb2.append(", description=");
            sb2.append(this.f230678c);
            sb2.append(", useHardcodedTexts=");
            return androidx.appcompat.app.r.x(sb2, this.f230679d, ')');
        }

        public c(@l String str, boolean z12, boolean z13, @l AttributedText attributedText) {
            this.f230676a = z12;
            this.f230677b = str;
            this.f230678c = attributedText;
            this.f230679d = z13;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ c(boolean z12, String str, AttributedText attributedText, boolean z13, int i12, C42822w c42822w) {
            z12 = (i12 & 1) != 0 ? false : z12;
            this((i12 & 2) != 0 ? null : str, z12, (i12 & 8) != 0 ? false : z13, (i12 & 4) != 0 ? null : attributedText);
        }
    }

    /* compiled from: ExtendedProfileSettingsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/a$d;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SelectionItem f230680a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f230681b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f230682c;

        public d(@k SelectionItem selectionItem, boolean z12, boolean z13) {
            this.f230680a = selectionItem;
            this.f230681b = z12;
            this.f230682c = z13;
        }

        public static d a(d dVar, SelectionItem selectionItem, boolean z12, boolean z13, int i12) {
            if ((i12 & 1) != 0) {
                selectionItem = dVar.f230680a;
            }
            if ((i12 & 2) != 0) {
                z12 = dVar.f230681b;
            }
            if ((i12 & 4) != 0) {
                z13 = dVar.f230682c;
            }
            dVar.getClass();
            return new d(selectionItem, z12, z13);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f230680a, dVar.f230680a) && this.f230681b == dVar.f230681b && this.f230682c == dVar.f230682c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f230682c) + androidx.appcompat.app.r.i(this.f230680a.hashCode() * 31, 31, this.f230681b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectionBottomMenuData(selection=");
            sb2.append(this.f230680a);
            sb2.append(", isDeletionInProgress=");
            sb2.append(this.f230681b);
            sb2.append(", isSetPublicInProgress=");
            return androidx.appcompat.app.r.x(sb2, this.f230682c, ')');
        }
    }

    public a() {
        this(null, null, false, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static a a(a aVar, u uVar, Throwable th2, boolean z12, List list, UploadImage uploadImage, r rVar, c cVar, LinkedHashSet linkedHashSet, C7018a c7018a, d dVar, ActionsBottomMenuData actionsBottomMenuData, int i12) {
        u uVar2 = (i12 & 1) != 0 ? aVar.f230661b : uVar;
        Throwable th3 = (i12 & 2) != 0 ? aVar.f230662c : th2;
        boolean z13 = (i12 & 4) != 0 ? aVar.f230663d : z12;
        List list2 = (i12 & 8) != 0 ? aVar.f230664e : list;
        UploadImage uploadImage2 = (i12 & 16) != 0 ? aVar.f230665f : uploadImage;
        r rVar2 = (i12 & 32) != 0 ? aVar.f230666g : rVar;
        c cVar2 = (i12 & 64) != 0 ? aVar.f230667h : cVar;
        Set<String> set = (i12 & 128) != 0 ? aVar.f230668i : linkedHashSet;
        C7018a c7018a2 = (i12 & 256) != 0 ? aVar.f230669j : c7018a;
        d dVar2 = (i12 & 512) != 0 ? aVar.f230670k : dVar;
        ActionsBottomMenuData actionsBottomMenuData2 = (i12 & 1024) != 0 ? aVar.f230671l : actionsBottomMenuData;
        aVar.getClass();
        return new a(uVar2, th3, z13, list2, uploadImage2, rVar2, cVar2, set, c7018a2, dVar2, actionsBottomMenuData2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f230661b, aVar.f230661b) && L.f(this.f230662c, aVar.f230662c) && this.f230663d == aVar.f230663d && L.f(this.f230664e, aVar.f230664e) && L.f(this.f230665f, aVar.f230665f) && L.f(this.f230666g, aVar.f230666g) && L.f(this.f230667h, aVar.f230667h) && L.f(this.f230668i, aVar.f230668i) && L.f(this.f230669j, aVar.f230669j) && L.f(this.f230670k, aVar.f230670k) && L.f(this.f230671l, aVar.f230671l);
    }

    public final int hashCode() {
        u uVar = this.f230661b;
        int iHashCode = (uVar == null ? 0 : uVar.hashCode()) * 31;
        Throwable th2 = this.f230662c;
        int iE2 = H.e(androidx.appcompat.app.r.i((iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31, 31, this.f230663d), 31, this.f230664e);
        UploadImage uploadImage = this.f230665f;
        int iHashCode2 = (iE2 + (uploadImage == null ? 0 : uploadImage.hashCode())) * 31;
        r rVar = this.f230666g;
        int iHashCode3 = (iHashCode2 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        c cVar = this.f230667h;
        int iG2 = m.g(this.f230668i, (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31);
        C7018a c7018a = this.f230669j;
        int iHashCode4 = (iG2 + (c7018a == null ? 0 : c7018a.hashCode())) * 31;
        d dVar = this.f230670k;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        ActionsBottomMenuData<yc0.k> actionsBottomMenuData = this.f230671l;
        return iHashCode5 + (actionsBottomMenuData != null ? actionsBottomMenuData.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ExtendedProfileSettingsState(data=" + this.f230661b + ", loadingThrowable=" + this.f230662c + ", isLoading=" + this.f230663d + ", widgetsToScroll=" + this.f230664e + ", selectedImage=" + this.f230665f + ", imagePickerMode=" + this.f230666g + ", imageBottomMenu=" + this.f230667h + ", imagesInDeletionProcess=" + this.f230668i + ", commonValueBottomMenu=" + this.f230669j + ", selectionBottomMenu=" + this.f230670k + ", actionsBottomMenu=" + this.f230671l + ')';
    }

    public a(@l u uVar, @l Throwable th2, boolean z12, @k List<String> list, @l UploadImage uploadImage, @l r rVar, @l c cVar, @k Set<String> set, @l C7018a c7018a, @l d dVar, @l ActionsBottomMenuData<yc0.k> actionsBottomMenuData) {
        this.f230661b = uVar;
        this.f230662c = th2;
        this.f230663d = z12;
        this.f230664e = list;
        this.f230665f = uploadImage;
        this.f230666g = rVar;
        this.f230667h = cVar;
        this.f230668i = set;
        this.f230669j = c7018a;
        this.f230670k = dVar;
        this.f230671l = actionsBottomMenuData;
    }

    public a(u uVar, Throwable th2, boolean z12, List list, UploadImage uploadImage, r rVar, c cVar, Set set, C7018a c7018a, d dVar, ActionsBottomMenuData actionsBottomMenuData, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : uVar, (i12 & 2) != 0 ? null : th2, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? C42784z0.f406748b : list, (i12 & 16) != 0 ? null : uploadImage, (i12 & 32) != 0 ? null : rVar, (i12 & 64) != 0 ? null : cVar, (i12 & 128) != 0 ? B0.f406639b : set, (i12 & 256) != 0 ? null : c7018a, (i12 & 512) != 0 ? null : dVar, (i12 & 1024) == 0 ? actionsBottomMenuData : null);
    }
}
