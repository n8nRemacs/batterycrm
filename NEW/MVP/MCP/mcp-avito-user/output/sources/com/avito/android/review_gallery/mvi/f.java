package com.avito.android.review_gallery.mvi;

import com.avito.android.W1;
import com.avito.android.arch.mvi.a;
import com.avito.android.review_gallery.mvi.entity.ReviewGalleryInternalAction;
import dn0.InterfaceC39764a;
import gn0.C40714c;
import gn0.InterfaceC40712a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ReviewGalleryActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/review_gallery/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "Lgn0/a;", "Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction;", "Lgn0/c;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements com.avito.android.arch.mvi.a<InterfaceC40712a, ReviewGalleryInternalAction, C40714c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final W1 f255539a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39764a f255540b;

    @Inject
    public f(@Y61.k W1 w12, @Y61.k InterfaceC39764a interfaceC39764a) {
        this.f255539a = w12;
        this.f255540b = interfaceC39764a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ReviewGalleryInternalAction> b(InterfaceC40712a interfaceC40712a, C40714c c40714c) {
        InterfaceC40712a interfaceC40712a2 = interfaceC40712a;
        if (interfaceC40712a2.equals(InterfaceC40712a.C11229a.f396844a)) {
            return C43175k.G(new a(this, null));
        }
        if (interfaceC40712a2 instanceof InterfaceC40712a.b) {
            return C43175k.G(new b(interfaceC40712a2, null));
        }
        if (interfaceC40712a2 instanceof InterfaceC40712a.c) {
            return C43175k.G(new c(this, interfaceC40712a2, null));
        }
        if (interfaceC40712a2 instanceof InterfaceC40712a.e) {
            return C43175k.G(new d(this, interfaceC40712a2, null));
        }
        if (interfaceC40712a2 instanceof InterfaceC40712a.d) {
            return C43175k.G(new e(this, interfaceC40712a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
