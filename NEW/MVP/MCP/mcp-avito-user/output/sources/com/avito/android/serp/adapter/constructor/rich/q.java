package com.avito.android.serp.adapter.constructor.rich;

import com.avito.android.analytics.event.ContactSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.MessengerItemModel;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ConstructorAdvertItemRichPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "fromGalleryAction", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class q extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SerpConstructorAdvertItem f269692l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f269693m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(SerpConstructorAdvertItem serpConstructorAdvertItem, z zVar) {
        super(1);
        this.f269692l = serpConstructorAdvertItem;
        this.f269693m = zVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        ConstructorAdvertGalleryItemModel constructorAdvertGalleryItemModel;
        Object next;
        boolean zBooleanValue = bool.booleanValue();
        SerpConstructorAdvertItem serpConstructorAdvertItem = this.f269692l;
        List<ConstructorAdvertGalleryItemModel> galleryItemsList = serpConstructorAdvertItem.getGalleryItemsList();
        if (galleryItemsList != null) {
            Iterator<T> it = galleryItemsList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ConstructorAdvertGalleryItemModel) next) instanceof MessengerItemModel) {
                    break;
                }
            }
            constructorAdvertGalleryItemModel = (ConstructorAdvertGalleryItemModel) next;
        } else {
            constructorAdvertGalleryItemModel = null;
        }
        MessengerItemModel messengerItemModel = constructorAdvertGalleryItemModel instanceof MessengerItemModel ? (MessengerItemModel) constructorAdvertGalleryItemModel : null;
        DeepLink uri = messengerItemModel != null ? messengerItemModel.getUri() : null;
        if (uri != null) {
            this.f269693m.f269713b.get().W(serpConstructorAdvertItem.getF221056b(), uri, zBooleanValue ? ContactSource.f89920e : ContactSource.f89919d, null, null);
        }
        return G0.f406611a;
    }
}
