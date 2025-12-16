package com.avito.android.extended_profile_ui_components;

import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ActionsBottomMenu.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/ActionsBottomMenuData;", "", "Action", "a", "b", "SubtitleType", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ActionsBottomMenuData<Action> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f153262a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AttributedText f153263b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<a<Action>> f153264c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final b<Action> f153265d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final b<Action> f153266e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActionsBottomMenu.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/ActionsBottomMenuData$SubtitleType;", "", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SubtitleType {

        /* renamed from: b, reason: collision with root package name */
        public static final SubtitleType f153267b;

        /* renamed from: c, reason: collision with root package name */
        public static final SubtitleType f153268c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ SubtitleType[] f153269d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f153270e;

        static {
            SubtitleType subtitleType = new SubtitleType("DEFAULT", 0);
            f153267b = subtitleType;
            SubtitleType subtitleType2 = new SubtitleType("FAIL", 1);
            f153268c = subtitleType2;
            SubtitleType[] subtitleTypeArr = {subtitleType, subtitleType2};
            f153269d = subtitleTypeArr;
            f153270e = kotlin.enums.c.a(subtitleTypeArr);
        }

        public SubtitleType() {
            throw null;
        }

        public static SubtitleType valueOf(String str) {
            return (SubtitleType) Enum.valueOf(SubtitleType.class, str);
        }

        public static SubtitleType[] values() {
            return (SubtitleType[]) f153269d.clone();
        }
    }

    /* compiled from: ActionsBottomMenu.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/ActionsBottomMenuData$a;", "", "Action", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a<Action> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f153271a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final AttributedText f153272b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final SubtitleType f153273c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Action f153274d;

        /* renamed from: e, reason: collision with root package name */
        public final int f153275e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f153276f;

        public a() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, AttributedText attributedText, SubtitleType subtitleType, Object obj, int i12, boolean z12, int i13, C42822w c42822w) {
            attributedText = (i13 & 2) != 0 ? null : attributedText;
            subtitleType = (i13 & 4) != 0 ? SubtitleType.f153267b : subtitleType;
            z12 = (i13 & 32) != 0 ? false : z12;
            this.f153271a = str;
            this.f153272b = attributedText;
            this.f153273c = subtitleType;
            this.f153274d = obj;
            this.f153275e = i12;
            this.f153276f = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f153271a, aVar.f153271a) && L.f(this.f153272b, aVar.f153272b) && this.f153273c == aVar.f153273c && L.f(this.f153274d, aVar.f153274d) && this.f153275e == aVar.f153275e && this.f153276f == aVar.f153276f;
        }

        public final int hashCode() {
            int iHashCode = this.f153271a.hashCode() * 31;
            AttributedText attributedText = this.f153272b;
            return Boolean.hashCode(this.f153276f) + androidx.appcompat.app.r.e(this.f153275e, C23088b.a((this.f153273c.hashCode() + ((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31, 31, this.f153274d), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionInfo(title=");
            sb2.append(this.f153271a);
            sb2.append(", subtitle=");
            sb2.append(this.f153272b);
            sb2.append(", subtitleType=");
            sb2.append(this.f153273c);
            sb2.append(", action=");
            sb2.append(this.f153274d);
            sb2.append(", icon=");
            sb2.append(this.f153275e);
            sb2.append(", checked=");
            return androidx.appcompat.app.r.x(sb2, this.f153276f, ')');
        }
    }

    /* compiled from: ActionsBottomMenu.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/ActionsBottomMenuData$b;", "", "Action", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b<Action> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f153277a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Action f153278b;

        public b(@Y61.k String str, @Y61.k Action action) {
            this.f153277a = str;
            this.f153278b = action;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f153277a, bVar.f153277a) && L.f(this.f153278b, bVar.f153278b);
        }

        public final int hashCode() {
            return this.f153278b.hashCode() + (this.f153277a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomAction(text=");
            sb2.append(this.f153277a);
            sb2.append(", action=");
            return H.n(sb2, this.f153278b, ')');
        }
    }

    public ActionsBottomMenuData(@Y61.l String str, @Y61.l AttributedText attributedText, @Y61.k List<a<Action>> list, @Y61.l b<Action> bVar, @Y61.l b<Action> bVar2) {
        this.f153262a = str;
        this.f153263b = attributedText;
        this.f153264c = list;
        this.f153265d = bVar;
        this.f153266e = bVar2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionsBottomMenuData)) {
            return false;
        }
        ActionsBottomMenuData actionsBottomMenuData = (ActionsBottomMenuData) obj;
        return L.f(this.f153262a, actionsBottomMenuData.f153262a) && L.f(this.f153263b, actionsBottomMenuData.f153263b) && L.f(this.f153264c, actionsBottomMenuData.f153264c) && L.f(this.f153265d, actionsBottomMenuData.f153265d) && L.f(this.f153266e, actionsBottomMenuData.f153266e);
    }

    public final int hashCode() {
        String str = this.f153262a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.f153263b;
        int iE2 = H.e((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f153264c);
        b<Action> bVar = this.f153265d;
        int iHashCode2 = (iE2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b<Action> bVar2 = this.f153266e;
        return iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ActionsBottomMenuData(title=" + this.f153262a + ", subtitle=" + this.f153263b + ", actions=" + this.f153264c + ", bottomPrimaryAction=" + this.f153265d + ", bottomSecondaryAction=" + this.f153266e + ')';
    }

    public /* synthetic */ ActionsBottomMenuData(String str, AttributedText attributedText, List list, b bVar, b bVar2, int i12, C42822w c42822w) {
        this(str, attributedText, list, (i12 & 8) != 0 ? null : bVar, (i12 & 16) != 0 ? null : bVar2);
    }
}
