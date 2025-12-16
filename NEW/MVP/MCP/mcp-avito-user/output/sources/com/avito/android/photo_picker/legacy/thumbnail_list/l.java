package com.avito.android.photo_picker.legacy.thumbnail_list;

import android.net.Uri;
import com.avito.android.photo_cache.EnhanceState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: UriPhotoItem.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/thumbnail_list/l;", "Lcom/avito/android/photo_picker/legacy/thumbnail_list/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l extends a {

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Uri f219905e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Uri f219906f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f219907g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final EnhanceState f219908h;

    public /* synthetic */ l(String str, Uri uri, Uri uri2, boolean z12, boolean z13, String str2, EnhanceState enhanceState, int i12, C42822w c42822w) {
        this(str, uri, uri2, z12, z13, str2, (i12 & 64) != 0 ? EnhanceState.f216287c : enhanceState);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UriPhotoItem(id=");
        sb2.append(this.f219881b);
        sb2.append(", imageUri=");
        sb2.append(this.f219905e);
        sb2.append(", sourceUri=");
        return com.avito.android.actions_sheet.a.t(sb2, this.f219906f, ')');
    }

    public l(@Y61.k String str, @Y61.l Uri uri, @Y61.k Uri uri2, boolean z12, boolean z13, @Y61.l String str2, @Y61.k EnhanceState enhanceState) {
        super(str, z12, z13);
        this.f219905e = uri;
        this.f219906f = uri2;
        this.f219907g = str2;
        this.f219908h = enhanceState;
    }
}
