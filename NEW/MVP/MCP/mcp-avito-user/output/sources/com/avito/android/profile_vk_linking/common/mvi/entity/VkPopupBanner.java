package com.avito.android.profile_vk_linking.common.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: VkPopupBanner.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/mvi/entity/VkPopupBanner;", "", "a", "Type", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VkPopupBanner {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f231029a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f231030b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f231031c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Type f231032d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ArrayList f231033e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkPopupBanner.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/mvi/entity/VkPopupBanner$Type;", "", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f231034b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f231035c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f231036d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Type[] f231037e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f231038f;

        static {
            Type type = new Type("ERROR", 0);
            f231034b = type;
            Type type2 = new Type("WARNING", 1);
            f231035c = type2;
            Type type3 = new Type("INFO", 2);
            f231036d = type3;
            Type[] typeArr = {type, type2, type3};
            f231037e = typeArr;
            f231038f = c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f231037e.clone();
        }
    }

    /* compiled from: VkPopupBanner.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/mvi/entity/VkPopupBanner$a;", "", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f231039a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeeplinkAction f231040b;

        public a(@k String str, @k DeeplinkAction deeplinkAction) {
            this.f231039a = str;
            this.f231040b = deeplinkAction;
        }
    }

    public VkPopupBanner(@k String str, @l String str2, @l AttributedText attributedText, @l Type type, @l ArrayList arrayList) {
        this.f231029a = str;
        this.f231030b = str2;
        this.f231031c = attributedText;
        this.f231032d = type;
        this.f231033e = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkPopupBanner)) {
            return false;
        }
        VkPopupBanner vkPopupBanner = (VkPopupBanner) obj;
        return L.f(this.f231029a, vkPopupBanner.f231029a) && L.f(this.f231030b, vkPopupBanner.f231030b) && L.f(this.f231031c, vkPopupBanner.f231031c) && this.f231032d == vkPopupBanner.f231032d && L.f(this.f231033e, vkPopupBanner.f231033e);
    }

    public final int hashCode() {
        int iHashCode = this.f231029a.hashCode() * 31;
        String str = this.f231030b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f231031c;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Type type = this.f231032d;
        int iHashCode4 = (iHashCode3 + (type == null ? 0 : type.hashCode())) * 31;
        ArrayList arrayList = this.f231033e;
        return iHashCode4 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VkPopupBanner(title=");
        sb2.append(this.f231029a);
        sb2.append(", description=");
        sb2.append(this.f231030b);
        sb2.append(", attributedDescription=");
        sb2.append(this.f231031c);
        sb2.append(", type=");
        sb2.append(this.f231032d);
        sb2.append(", buttons=");
        return e.p(sb2, this.f231033e, ')');
    }
}
