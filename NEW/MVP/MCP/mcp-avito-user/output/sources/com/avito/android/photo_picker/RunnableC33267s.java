package com.avito.android.photo_picker;

import android.os.Parcelable;
import com.avito.android.photo_cache.PhotoSource;
import com.avito.android.photo_picker.legacy.InterfaceC33244f;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.photo_picker.s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class RunnableC33267s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f219936b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PhotoPickerActivity f219937c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f219938d;

    public /* synthetic */ RunnableC33267s(PhotoPickerActivity photoPickerActivity, ArrayList arrayList, int i12) {
        this.f219936b = i12;
        this.f219937c = photoPickerActivity;
        this.f219938d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f219938d;
        PhotoPickerActivity photoPickerActivity = this.f219937c;
        switch (this.f219936b) {
            case 0:
                InterfaceC33244f interfaceC33244f = photoPickerActivity.f218782n;
                (interfaceC33244f != null ? interfaceC33244f : null).j(arrayList);
                break;
            default:
                InterfaceC33244f interfaceC33244f2 = photoPickerActivity.f218782n;
                InterfaceC33244f interfaceC33244f3 = interfaceC33244f2 != null ? interfaceC33244f2 : null;
                Parcelable.Creator<PhotoSource> creator = PhotoSource.CREATOR;
                interfaceC33244f3.i(arrayList);
                break;
        }
    }
}
