package com.avito.android.photo_picker.legacy.details_list;

import com.avito.android.R;
import com.avito.android.photo_picker.legacy.details_list.f;
import com.avito.android.util.L0;
import kotlin.Metadata;

/* compiled from: DisplayAnalyzer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/details_list/d;", "Lcom/avito/android/photo_picker/legacy/details_list/c;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f219646a;

    public d(@Y61.k L0 l02) {
        this.f219646a = ((int) (((float) l02.d()) - (((float) l02.c()) / 0.75f))) > R.dimen.thumbnail_list_with_controls_height ? new f.b(null) : new f.a();
    }

    @Override // com.avito.android.photo_picker.legacy.details_list.c
    @Y61.k
    /* renamed from: getDisplayType, reason: from getter */
    public final f getF219646a() {
        return this.f219646a;
    }
}
