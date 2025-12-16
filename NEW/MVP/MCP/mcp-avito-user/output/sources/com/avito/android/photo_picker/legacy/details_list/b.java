package com.avito.android.photo_picker.legacy.details_list;

import com.avito.android.photo_picker.legacy.details_list.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DetailsBluePrintProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/details_list/b;", "Lcom/avito/android/photo_picker/legacy/details_list/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f219644a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f219645b;

    public b(@Y61.k i iVar, @Y61.k c cVar) {
        this.f219644a = iVar;
        this.f219645b = cVar.getF219646a();
    }

    @Override // com.avito.android.photo_picker.legacy.details_list.a
    @Y61.k
    public final TV0.b<n, com.avito.android.photo_picker.legacy.thumbnail_list.a> a() {
        f fVar = this.f219645b;
        boolean z12 = fVar instanceof f.a;
        i iVar = this.f219644a;
        if (z12) {
            return new g(iVar);
        }
        if (fVar instanceof f.b) {
            return new h(iVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
