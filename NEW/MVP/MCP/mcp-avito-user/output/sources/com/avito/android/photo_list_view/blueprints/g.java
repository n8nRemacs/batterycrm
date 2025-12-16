package com.avito.android.photo_list_view.blueprints;

import com.avito.android.image.enhancement.C30979j;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: MultiStatePhotoItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/image/enhancement/j$b;", "onboarding", "Lkotlin/G0;", "accept", "(Lcom/avito/android/image/enhancement/j$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f218134b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f218135c;

    public g(k kVar, l lVar) {
        this.f218134b = kVar;
        this.f218135c = lVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C30979j.b bVar = (C30979j.b) obj;
        l lVar = this.f218135c;
        this.f218134b.getClass();
        if (bVar instanceof C30979j.b.C5010b) {
            try {
                lVar.RU(((C30979j.b.C5010b) bVar).f169401c, ((C30979j.b.C5010b) bVar).f169399a, ((C30979j.b.C5010b) bVar).f169400b);
            } catch (Exception e12) {
                V2.f318762a.f(e12);
            }
        }
    }
}
