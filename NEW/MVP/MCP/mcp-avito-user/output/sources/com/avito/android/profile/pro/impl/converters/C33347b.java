package com.avito.android.profile.pro.impl.converters;

import com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget;
import com.avito.android.profile.pro.impl.screen.item.avatar.ProfileProAvatarItem;
import com.avito.android.remote.model.Image;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import jz.InterfaceC42451b;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProAvatarConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/converters/b;", "Lcom/avito/android/profile/pro/impl/converters/a;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile.pro.impl.converters.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33347b implements InterfaceC33346a {
    @Inject
    public C33347b() {
    }

    @Override // com.avito.android.profile.pro.impl.converters.InterfaceC33346a
    @Y61.k
    public final List<com.avito.conveyor_item.a> a(@Y61.k ProfileTabWidget.a aVar, @Y61.k com.avito.android.profile.pro.impl.interactor.a aVar2) {
        Image image = aVar.f222767c;
        if (image != null) {
            return Collections.singletonList(new ProfileProAvatarItem("avatar", image, aVar.f222768d, L.f(aVar2.f222682a, InterfaceC42451b.C11596b.f405967a) ? ProfileProAvatarItem.Type.f222986c : ProfileProAvatarItem.Type.f222985b));
        }
        return C42784z0.f406748b;
    }
}
