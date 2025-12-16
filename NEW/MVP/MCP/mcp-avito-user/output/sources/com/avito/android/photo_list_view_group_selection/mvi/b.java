package com.avito.android.photo_list_view_group_selection.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.photo_list_view_group_selection.PhotoItemGroupSelectionParams;
import com.avito.android.photo_list_view_group_selection.mvi.entity.PhotoItemGroupSelectionInternalAction;
import e80.C39966c;
import e80.InterfaceC39964a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PhotoItemGroupSelectionActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Le80/a;", "Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction;", "Le80/c;", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC39964a, PhotoItemGroupSelectionInternalAction, C39966c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PhotoItemGroupSelectionParams f218442a;

    @Inject
    public b(@Y61.k PhotoItemGroupSelectionParams photoItemGroupSelectionParams) {
        this.f218442a = photoItemGroupSelectionParams;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PhotoItemGroupSelectionInternalAction> b(InterfaceC39964a interfaceC39964a, C39966c c39966c) {
        InterfaceC39964a interfaceC39964a2 = interfaceC39964a;
        C39966c c39966c2 = c39966c;
        if (interfaceC39964a2 instanceof InterfaceC39964a.C11054a) {
            return new C43210w(new PhotoItemGroupSelectionInternalAction.ChangeImageGroup(((InterfaceC39964a.C11054a) interfaceC39964a2).f394974a));
        }
        if (interfaceC39964a2 instanceof InterfaceC39964a.b) {
            return C43175k.G(new a(c39966c2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
