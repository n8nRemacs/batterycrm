package com.avito.android.profile_settings_extended.adapter.basic_info_v2;

import Rb0.InterfaceC15026b;
import Y41.l;
import Y61.k;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BasicInfoV2ItemView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/basic_info_v2/BasicInfoV2ItemView;", "LTV0/e;", "LRb0/b;", "ClickType", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface BasicInfoV2ItemView extends TV0.e, InterfaceC15026b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BasicInfoV2ItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/basic_info_v2/BasicInfoV2ItemView$ClickType;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ClickType {

        /* renamed from: b, reason: collision with root package name */
        public static final ClickType f229243b;

        /* renamed from: c, reason: collision with root package name */
        public static final ClickType f229244c;

        /* renamed from: d, reason: collision with root package name */
        public static final ClickType f229245d;

        /* renamed from: e, reason: collision with root package name */
        public static final ClickType f229246e;

        /* renamed from: f, reason: collision with root package name */
        public static final ClickType f229247f;

        /* renamed from: g, reason: collision with root package name */
        public static final ClickType f229248g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ ClickType[] f229249h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f229250i;

        static {
            ClickType clickType = new ClickType("AVATAR", 0);
            f229243b = clickType;
            ClickType clickType2 = new ClickType("USER_NAME", 1);
            f229244c = clickType2;
            ClickType clickType3 = new ClickType("USER_ID", 2);
            f229245d = clickType3;
            ClickType clickType4 = new ClickType("VERIFICATION_BUTTON", 3);
            f229246e = clickType4;
            ClickType clickType5 = new ClickType("MORE_BUTTON", 4);
            f229247f = clickType5;
            ClickType clickType6 = new ClickType("CONTENT_CONTAINER", 5);
            f229248g = clickType6;
            ClickType[] clickTypeArr = {clickType, clickType2, clickType3, clickType4, clickType5, clickType6};
            f229249h = clickTypeArr;
            f229250i = kotlin.enums.c.a(clickTypeArr);
        }

        public ClickType() {
            throw null;
        }

        public static ClickType valueOf(String str) {
            return (ClickType) Enum.valueOf(ClickType.class, str);
        }

        public static ClickType[] values() {
            return (ClickType[]) f229249h.clone();
        }
    }

    /* compiled from: BasicInfoV2ItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void N60(@k BasicInfoV2Item basicInfoV2Item, @k l<? super Integer, G0> lVar, @k l<? super ClickType, G0> lVar2);
}
