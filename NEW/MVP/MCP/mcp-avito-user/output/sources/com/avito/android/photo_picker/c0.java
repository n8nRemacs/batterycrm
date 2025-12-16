package com.avito.android.photo_picker;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UploadingInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/c0;", "Lcom/avito/android/photo_picker/b0;", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f218896a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f218897b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PhotoPickerIntentFactory f218898c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f218899d;

    public c0(@Y61.k Context context, @Y61.k String str, @Y61.k PhotoPickerIntentFactory photoPickerIntentFactory, boolean z12) {
        this.f218896a = context;
        this.f218897b = str;
        this.f218898c = photoPickerIntentFactory;
        this.f218899d = z12;
    }

    @Override // com.avito.android.photo_picker.b0
    public final void a(@Y61.l String str) {
        PhotoPickerIntentFactory photoPickerIntentFactory = this.f218898c;
        Context context = this.f218896a;
        androidx.core.content.d.startForegroundService(context, photoPickerIntentFactory.b(context, this.f218897b, str, this.f218899d));
    }

    public /* synthetic */ c0(Context context, String str, PhotoPickerIntentFactory photoPickerIntentFactory, boolean z12, int i12, C42822w c42822w) {
        this(context, str, photoPickerIntentFactory, (i12 & 8) != 0 ? false : z12);
    }
}
