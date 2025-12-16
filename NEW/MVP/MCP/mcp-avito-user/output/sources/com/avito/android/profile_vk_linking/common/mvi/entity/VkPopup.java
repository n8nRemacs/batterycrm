package com.avito.android.profile_vk_linking.common.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: VkPopup.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/mvi/entity/VkPopup;", "", "CommonButton", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VkPopup {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f231003a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f231004b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f231005c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final VkPopupBanner f231006d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ArrayList f231007e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f231008f;

    /* compiled from: VkPopup.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/mvi/entity/VkPopup$CommonButton;", "", "ActionButton", "a", "Type", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CommonButton {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final a f231009a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ActionButton f231010b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Boolean f231011c;

        /* compiled from: VkPopup.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/mvi/entity/VkPopup$CommonButton$ActionButton;", "", "ActionType", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ActionButton {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f231012a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ActionType f231013b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Type f231014c;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: VkPopup.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/mvi/entity/VkPopup$CommonButton$ActionButton$ActionType;", "", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ActionType {

                /* renamed from: b, reason: collision with root package name */
                public static final ActionType f231015b;

                /* renamed from: c, reason: collision with root package name */
                public static final ActionType f231016c;

                /* renamed from: d, reason: collision with root package name */
                public static final ActionType f231017d;

                /* renamed from: e, reason: collision with root package name */
                public static final ActionType f231018e;

                /* renamed from: f, reason: collision with root package name */
                public static final ActionType f231019f;

                /* renamed from: g, reason: collision with root package name */
                public static final /* synthetic */ ActionType[] f231020g;

                /* renamed from: h, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f231021h;

                static {
                    ActionType actionType = new ActionType("FINISH", 0);
                    f231015b = actionType;
                    ActionType actionType2 = new ActionType("RELOAD", 1);
                    f231016c = actionType2;
                    ActionType actionType3 = new ActionType("LINK", 2);
                    f231017d = actionType3;
                    ActionType actionType4 = new ActionType("UNLINK", 3);
                    f231018e = actionType4;
                    ActionType actionType5 = new ActionType("NEXT", 4);
                    f231019f = actionType5;
                    ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4, actionType5};
                    f231020g = actionTypeArr;
                    f231021h = c.a(actionTypeArr);
                }

                public ActionType() {
                    throw null;
                }

                public static ActionType valueOf(String str) {
                    return (ActionType) Enum.valueOf(ActionType.class, str);
                }

                public static ActionType[] values() {
                    return (ActionType[]) f231020g.clone();
                }
            }

            public ActionButton(@k String str, @k ActionType actionType, @k Type type) {
                this.f231012a = str;
                this.f231013b = actionType;
                this.f231014c = type;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionButton)) {
                    return false;
                }
                ActionButton actionButton = (ActionButton) obj;
                return L.f(this.f231012a, actionButton.f231012a) && this.f231013b == actionButton.f231013b && this.f231014c == actionButton.f231014c;
            }

            public final int hashCode() {
                return this.f231014c.hashCode() + ((this.f231013b.hashCode() + (this.f231012a.hashCode() * 31)) * 31);
            }

            @k
            public final String toString() {
                return "ActionButton(title=" + this.f231012a + ", actionType=" + this.f231013b + ", type=" + this.f231014c + ')';
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VkPopup.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/mvi/entity/VkPopup$CommonButton$Type;", "", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            /* renamed from: b, reason: collision with root package name */
            public static final Type f231022b;

            /* renamed from: c, reason: collision with root package name */
            public static final Type f231023c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Type[] f231024d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f231025e;

            static {
                Type type = new Type("PRIMARY", 0);
                f231022b = type;
                Type type2 = new Type("SECONDARY", 1);
                f231023c = type2;
                Type[] typeArr = {type, type2};
                f231024d = typeArr;
                f231025e = c.a(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f231024d.clone();
            }
        }

        /* compiled from: VkPopup.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/mvi/entity/VkPopup$CommonButton$a;", "", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f231026a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f231027b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Type f231028c;

            public a(@k String str, @k DeepLink deepLink, @k Type type) {
                this.f231026a = str;
                this.f231027b = deepLink;
                this.f231028c = type;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f231026a, aVar.f231026a) && L.f(this.f231027b, aVar.f231027b) && this.f231028c == aVar.f231028c;
            }

            public final int hashCode() {
                return this.f231028c.hashCode() + com.avito.android.actions_sheet.a.e(this.f231027b, this.f231026a.hashCode() * 31, 31);
            }

            @k
            public final String toString() {
                return "DeeplinkButton(title=" + this.f231026a + ", deeplink=" + this.f231027b + ", type=" + this.f231028c + ')';
            }
        }

        public CommonButton(@l a aVar, @l ActionButton actionButton, @l Boolean bool) {
            this.f231009a = aVar;
            this.f231010b = actionButton;
            this.f231011c = bool;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommonButton)) {
                return false;
            }
            CommonButton commonButton = (CommonButton) obj;
            return L.f(this.f231009a, commonButton.f231009a) && L.f(this.f231010b, commonButton.f231010b) && L.f(this.f231011c, commonButton.f231011c);
        }

        public final int hashCode() {
            a aVar = this.f231009a;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            ActionButton actionButton = this.f231010b;
            int iHashCode2 = (iHashCode + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
            Boolean bool = this.f231011c;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CommonButton(deeplinkButton=");
            sb2.append(this.f231009a);
            sb2.append(", actionButton=");
            sb2.append(this.f231010b);
            sb2.append(", isMore=");
            return C0.g(sb2, this.f231011c, ')');
        }
    }

    public VkPopup(@l String str, @k String str2, @l AttributedText attributedText, @l VkPopupBanner vkPopupBanner, @l ArrayList arrayList, @l AttributedText attributedText2) {
        this.f231003a = str;
        this.f231004b = str2;
        this.f231005c = attributedText;
        this.f231006d = vkPopupBanner;
        this.f231007e = arrayList;
        this.f231008f = attributedText2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkPopup)) {
            return false;
        }
        VkPopup vkPopup = (VkPopup) obj;
        return L.f(this.f231003a, vkPopup.f231003a) && L.f(this.f231004b, vkPopup.f231004b) && L.f(this.f231005c, vkPopup.f231005c) && L.f(this.f231006d, vkPopup.f231006d) && this.f231007e.equals(vkPopup.f231007e) && L.f(this.f231008f, vkPopup.f231008f);
    }

    public final int hashCode() {
        String str = this.f231003a;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f231004b);
        AttributedText attributedText = this.f231005c;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        VkPopupBanner vkPopupBanner = this.f231006d;
        int iG2 = e.g(this.f231007e, (iHashCode + (vkPopupBanner == null ? 0 : vkPopupBanner.hashCode())) * 31, 31);
        AttributedText attributedText2 = this.f231008f;
        return iG2 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VkPopup(navigation=");
        sb2.append(this.f231003a);
        sb2.append(", title=");
        sb2.append(this.f231004b);
        sb2.append(", text=");
        sb2.append(this.f231005c);
        sb2.append(", banner=");
        sb2.append(this.f231006d);
        sb2.append(", buttons=");
        sb2.append(this.f231007e);
        sb2.append(", bottomText=");
        return a.w(sb2, this.f231008f, ')');
    }
}
