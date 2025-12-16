package com.avito.android.photo_picker.legacy;

import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoPickerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_photo-picker_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_picker.legacy.x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33261x {
    public static final com.avito.android.photo_picker.legacy.thumbnail_list.l a(String str, ArrayList arrayList) {
        Object next;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(((com.avito.android.photo_picker.legacy.thumbnail_list.l) next).f219881b, str)) {
                break;
            }
        }
        return (com.avito.android.photo_picker.legacy.thumbnail_list.l) next;
    }

    public static final boolean b(@Y61.k PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode) {
        if (photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd) {
            return true;
        }
        if (!(photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeAvatar)) {
            if ((photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit) || (photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeView)) {
                return true;
            }
            if (!(photoPickerMode instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeCrop)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }
}
