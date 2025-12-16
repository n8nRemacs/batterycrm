package com.avito.android.interior_photos_block;

import Y41.q;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import iO.InterfaceC41322a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InteriorPhotoBlockViewImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lcom/avito/android/remote/model/Image;", "images", "", "index", "", ContextActionHandler.Link.URL, "Lkotlin/G0;", "invoke", "(Ljava/util/List;ILjava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c extends N implements q<List<? extends Image>, Integer, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f173009l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar) {
        super(3);
        this.f173009l = kVar;
    }

    @Override // Y41.q
    public final G0 invoke(List<? extends Image> list, Integer num, String str) {
        ((com.avito.android.interior_photos_block.mvi.k) this.f173009l.f173055d.getValue()).accept(new InterfaceC41322a.b(num.intValue(), str, list));
        return G0.f406611a;
    }
}
