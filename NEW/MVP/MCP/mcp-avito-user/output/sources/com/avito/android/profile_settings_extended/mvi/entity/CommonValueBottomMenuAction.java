package com.avito.android.profile_settings_extended.mvi.entity;

import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.entity.CommonValueId;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import yc0.k;

/* compiled from: ExtendedProfileSettingsAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/CommonValueBottomMenuAction;", "Lyc0/k;", "DeleteCommonValue", "a", "Lcom/avito/android/profile_settings_extended/mvi/entity/CommonValueBottomMenuAction$DeleteCommonValue;", "Lcom/avito/android/profile_settings_extended/mvi/entity/CommonValueBottomMenuAction$a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface CommonValueBottomMenuAction extends k {

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/CommonValueBottomMenuAction$a;", "Lcom/avito/android/profile_settings_extended/mvi/entity/CommonValueBottomMenuAction;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements CommonValueBottomMenuAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f230546a = new a();
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/CommonValueBottomMenuAction$DeleteCommonValue;", "Lcom/avito/android/profile_settings_extended/mvi/entity/CommonValueBottomMenuAction;", "WidgetType", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeleteCommonValue implements CommonValueBottomMenuAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CommonValueId f230538a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final WidgetType f230539b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Object f230540c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ExtendedProfileSettingsAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/entity/CommonValueBottomMenuAction$DeleteCommonValue$WidgetType;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class WidgetType {

            /* renamed from: b, reason: collision with root package name */
            public static final WidgetType f230541b;

            /* renamed from: c, reason: collision with root package name */
            public static final WidgetType f230542c;

            /* renamed from: d, reason: collision with root package name */
            public static final WidgetType f230543d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ WidgetType[] f230544e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f230545f;

            static {
                WidgetType widgetType = new WidgetType("CAROUSEL", 0);
                f230541b = widgetType;
                WidgetType widgetType2 = new WidgetType("PHONE", 1);
                f230542c = widgetType2;
                WidgetType widgetType3 = new WidgetType("GEO", 2);
                f230543d = widgetType3;
                WidgetType[] widgetTypeArr = {widgetType, widgetType2, widgetType3};
                f230544e = widgetTypeArr;
                f230545f = c.a(widgetTypeArr);
            }

            public WidgetType() {
                throw null;
            }

            public static WidgetType valueOf(String str) {
                return (WidgetType) Enum.valueOf(WidgetType.class, str);
            }

            public static WidgetType[] values() {
                return (WidgetType[]) f230544e.clone();
            }
        }

        public DeleteCommonValue(@Y61.k CommonValueId commonValueId, @Y61.k WidgetType widgetType, @l Object obj) {
            this.f230538a = commonValueId;
            this.f230539b = widgetType;
            this.f230540c = obj;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeleteCommonValue)) {
                return false;
            }
            DeleteCommonValue deleteCommonValue = (DeleteCommonValue) obj;
            return L.f(this.f230538a, deleteCommonValue.f230538a) && this.f230539b == deleteCommonValue.f230539b && L.f(this.f230540c, deleteCommonValue.f230540c);
        }

        public final int hashCode() {
            int iHashCode = (this.f230539b.hashCode() + (this.f230538a.hashCode() * 31)) * 31;
            Object obj = this.f230540c;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeleteCommonValue(id=");
            sb2.append(this.f230538a);
            sb2.append(", widgetType=");
            sb2.append(this.f230539b);
            sb2.append(", payload=");
            return H.n(sb2, this.f230540c, ')');
        }

        public /* synthetic */ DeleteCommonValue(CommonValueId commonValueId, WidgetType widgetType, Object obj, int i12, C42822w c42822w) {
            this(commonValueId, widgetType, (i12 & 4) != 0 ? null : obj);
        }
    }
}
