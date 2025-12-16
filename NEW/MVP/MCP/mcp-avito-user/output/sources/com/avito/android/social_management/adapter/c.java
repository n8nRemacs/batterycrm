package com.avito.android.social_management.adapter;

import Y61.l;
import com.avito.android.recycler.data_aware.f;
import com.avito.android.social_management.adapter.SocialItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SocialEqualityComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/social_management/adapter/c;", "Lcom/avito/android/recycler/data_aware/f;", "<init>", "()V", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements f {
    @Inject
    public c() {
    }

    @Override // com.avito.android.recycler.data_aware.f
    public final boolean a(@l TV0.a aVar, @l TV0.a aVar2) {
        boolean z12 = aVar instanceof SocialItem.Available;
        if (z12 && (aVar2 instanceof SocialItem.Available)) {
            return ((SocialItem.Available) aVar).f284476c.getClass() == ((SocialItem.Available) aVar2).f284476c.getClass();
        }
        boolean z13 = aVar instanceof SocialItem.Connected;
        if (z13 && (aVar2 instanceof SocialItem.Connected)) {
            return ((SocialItem.Connected) aVar).f284478c.getClass() == ((SocialItem.Connected) aVar2).f284478c.getClass();
        }
        if (z13 && (aVar2 instanceof SocialItem.Available)) {
            return ((SocialItem.Connected) aVar).f284478c.getClass() == ((SocialItem.Available) aVar2).f284476c.getClass();
        }
        if (z12 && (aVar2 instanceof SocialItem.Connected)) {
            return ((SocialItem.Available) aVar).f284476c.getClass() == ((SocialItem.Connected) aVar2).f284478c.getClass();
        }
        if ((aVar instanceof SocialItem.Header) && (aVar2 instanceof SocialItem.Header)) {
            return L.f(((SocialItem.Header) aVar).f284480c, ((SocialItem.Header) aVar2).f284480c);
        }
        if ((aVar instanceof SocialItem.Notification) && (aVar2 instanceof SocialItem.Notification)) {
            return L.f(((SocialItem.Notification) aVar).f284482c, ((SocialItem.Notification) aVar2).f284482c);
        }
        if ((aVar instanceof SocialItem.VkGroupItem) && (aVar2 instanceof SocialItem.VkGroupItem)) {
            return L.f(((SocialItem.VkGroupItem) aVar).f284486c, ((SocialItem.VkGroupItem) aVar2).f284486c);
        }
        return false;
    }
}
