package com.avito.android.photo_picker.legacy;

import com.avito.android.photo_picker.PhotoPickerActivity;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PhotoPickerPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_picker.legacy.m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33251m extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33245g f219830l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33251m(C33245g c33245g) {
        super(1);
        this.f219830l = c33245g;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        PhotoPickerActivity photoPickerActivity = this.f219830l.f219810r;
        if (photoPickerActivity != null) {
            photoPickerActivity.b2();
        }
        return G0.f406611a;
    }
}
