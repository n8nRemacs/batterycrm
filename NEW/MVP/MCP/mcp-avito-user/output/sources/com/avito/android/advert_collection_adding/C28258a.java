package com.avito.android.advert_collection_adding;

import androidx.fragment.app.DialogFragment;
import com.avito.android.deep_linking.links.AddToCollectionLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AddToCollectionHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert_collection_adding.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28258a extends N implements Y41.a<DialogFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28260c f81750l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AddToCollectionLink f81751m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28258a(C28260c c28260c, AddToCollectionLink addToCollectionLink) {
        super(0);
        this.f81750l = c28260c;
        this.f81751m = addToCollectionLink;
    }

    @Override // Y41.a
    public final DialogFragment invoke() {
        C28260c c28260c = this.f81750l;
        AddToCollectionLink addToCollectionLink = this.f81751m;
        List<String> list = addToCollectionLink.f132938b;
        return c28260c.f81783g.a(addToCollectionLink.f132939c, list);
    }
}
