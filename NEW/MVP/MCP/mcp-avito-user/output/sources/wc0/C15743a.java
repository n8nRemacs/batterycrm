package Wc0;

import Jc0.C14186a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VkLinkingGroupManagementState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LWc0/a;", "", "a", "b", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Wc0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C15743a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C1276a f17979e = new C1276a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C15743a f17980f = new C15743a(false, null, null, null, 15, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17981a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f17982b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final b f17983c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final VkPopup f17984d;

    /* compiled from: VkLinkingGroupManagementState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWc0/a$a;", "", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wc0.a$a, reason: collision with other inner class name */
    public static final class C1276a {
        public /* synthetic */ C1276a(C42822w c42822w) {
            this();
        }

        public C1276a() {
        }
    }

    /* compiled from: VkLinkingGroupManagementState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWc0/a$b;", "", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wc0.a$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final VkPopup f17985a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C14186a f17986b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final List<com.avito.android.profile_vk_linking.group_management.adapter.group.a> f17987c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final VkPopup.CommonButton.ActionButton.ActionType f17988d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f17989e;

        public b(@k VkPopup vkPopup, @l C14186a c14186a, @l List<com.avito.android.profile_vk_linking.group_management.adapter.group.a> list, @l VkPopup.CommonButton.ActionButton.ActionType actionType, boolean z12) {
            this.f17985a = vkPopup;
            this.f17986b = c14186a;
            this.f17987c = list;
            this.f17988d = actionType;
            this.f17989e = z12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static b a(b bVar, ArrayList arrayList, VkPopup.CommonButton.ActionButton.ActionType actionType, boolean z12, int i12) {
            VkPopup vkPopup = bVar.f17985a;
            C14186a c14186a = bVar.f17986b;
            List list = arrayList;
            if ((i12 & 4) != 0) {
                list = bVar.f17987c;
            }
            List list2 = list;
            if ((i12 & 8) != 0) {
                actionType = bVar.f17988d;
            }
            VkPopup.CommonButton.ActionButton.ActionType actionType2 = actionType;
            if ((i12 & 16) != 0) {
                z12 = bVar.f17989e;
            }
            bVar.getClass();
            return new b(vkPopup, c14186a, list2, actionType2, z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f17985a, bVar.f17985a) && L.f(this.f17986b, bVar.f17986b) && L.f(this.f17987c, bVar.f17987c) && this.f17988d == bVar.f17988d && this.f17989e == bVar.f17989e;
        }

        public final int hashCode() {
            int iHashCode = this.f17985a.hashCode() * 31;
            C14186a c14186a = this.f17986b;
            int iHashCode2 = (iHashCode + (c14186a == null ? 0 : c14186a.hashCode())) * 31;
            List<com.avito.android.profile_vk_linking.group_management.adapter.group.a> list = this.f17987c;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            VkPopup.CommonButton.ActionButton.ActionType actionType = this.f17988d;
            return Boolean.hashCode(this.f17989e) + ((iHashCode3 + (actionType != null ? actionType.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VisibleData(popup=");
            sb2.append(this.f17985a);
            sb2.append(", group=");
            sb2.append(this.f17986b);
            sb2.append(", groupItems=");
            sb2.append(this.f17987c);
            sb2.append(", buttonLoading=");
            sb2.append(this.f17988d);
            sb2.append(", areTokensSending=");
            return r.x(sb2, this.f17989e, ')');
        }
    }

    public C15743a() {
        this(false, null, null, null, 15, null);
    }

    public static C15743a a(C15743a c15743a, boolean z12, String str, b bVar, int i12) {
        if ((i12 & 1) != 0) {
            z12 = c15743a.f17981a;
        }
        if ((i12 & 2) != 0) {
            str = c15743a.f17982b;
        }
        if ((i12 & 4) != 0) {
            bVar = c15743a.f17983c;
        }
        VkPopup vkPopup = c15743a.f17984d;
        c15743a.getClass();
        return new C15743a(z12, str, bVar, vkPopup);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15743a)) {
            return false;
        }
        C15743a c15743a = (C15743a) obj;
        return this.f17981a == c15743a.f17981a && L.f(this.f17982b, c15743a.f17982b) && L.f(this.f17983c, c15743a.f17983c) && L.f(this.f17984d, c15743a.f17984d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f17981a) * 31;
        String str = this.f17982b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.f17983c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        VkPopup vkPopup = this.f17984d;
        return iHashCode3 + (vkPopup != null ? vkPopup.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "VkLinkingGroupManagementState(isLoading=" + this.f17981a + ", errorMessage=" + this.f17982b + ", visibleData=" + this.f17983c + ", dialog=" + this.f17984d + ')';
    }

    public C15743a(boolean z12, @l String str, @l b bVar, @l VkPopup vkPopup) {
        this.f17981a = z12;
        this.f17982b = str;
        this.f17983c = bVar;
        this.f17984d = vkPopup;
    }

    public /* synthetic */ C15743a(boolean z12, String str, b bVar, VkPopup vkPopup, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : bVar, (i12 & 8) != 0 ? null : vkPopup);
    }
}
