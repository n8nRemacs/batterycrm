package com.avito.android.photo_picker.legacy.thumbnail_list;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BasePhotoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/thumbnail_list/a;", "Lcom/avito/conveyor_item/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f219881b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f219882c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f219883d;

    public a(@Y61.k String str, boolean z12, boolean z13) {
        this.f219881b = str;
        this.f219882c = z12;
        this.f219883d = z13;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF219881b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF219881b() {
        return this.f219881b;
    }

    public /* synthetic */ a(String str, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13);
    }
}
