package Yc0;

import Jc0.C14186a;
import Y61.k;
import Y61.l;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VkLinkedGroupResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYc0/a;", "", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yc0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C18253a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final VkPopup f19590a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C14186a f19591b;

    public C18253a(@k VkPopup vkPopup, @k C14186a c14186a) {
        this.f19590a = vkPopup;
        this.f19591b = c14186a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18253a)) {
            return false;
        }
        C18253a c18253a = (C18253a) obj;
        return L.f(this.f19590a, c18253a.f19590a) && L.f(this.f19591b, c18253a.f19591b);
    }

    public final int hashCode() {
        return this.f19591b.hashCode() + (this.f19590a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "VkLinkedGroupResult(popup=" + this.f19590a + ", group=" + this.f19591b + ')';
    }
}
