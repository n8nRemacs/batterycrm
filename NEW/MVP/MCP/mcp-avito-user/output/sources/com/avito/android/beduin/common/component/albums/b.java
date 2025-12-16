package com.avito.android.beduin.common.component.albums;

import Ui.InterfaceC15523b;
import Y41.l;
import com.avito.android.beduin.common.action.BeduinOpenGalleryAction;
import com.avito.android.beduin_models.BeduinAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinAlbumComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f100629l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(1);
        this.f100629l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        a aVar = this.f100629l;
        boolean zF2 = L.f(aVar.f100624f.getOpenGalleryOnTap(), Boolean.FALSE);
        BeduinAlbumComponentModel beduinAlbumComponentModel = aVar.f100624f;
        InterfaceC15523b<BeduinAction> interfaceC15523b = aVar.f100623e;
        if (!zF2) {
            List<AlbumElement> elements = beduinAlbumComponentModel.getElements();
            ArrayList arrayList = new ArrayList(C42745f0.q(elements, 10));
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                arrayList.add(((AlbumElement) it.next()).getImage());
            }
            interfaceC15523b.o(new BeduinOpenGalleryAction(arrayList, Integer.valueOf(iIntValue), null, 4, null));
        }
        List<BeduinAction> actions = beduinAlbumComponentModel.getElements().get(iIntValue).getActions();
        if (actions != null) {
            Iterator<T> it2 = actions.iterator();
            while (it2.hasNext()) {
                interfaceC15523b.o((BeduinAction) it2.next());
            }
        }
        return G0.f406611a;
    }
}
