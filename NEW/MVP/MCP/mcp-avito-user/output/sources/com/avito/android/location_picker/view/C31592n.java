package com.avito.android.location_picker.view;

import com.avito.android.location_picker.entities.LocationPickerErrors;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import vW.C49273c;

/* compiled from: LocationPickerViewChanger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "LvW/j;", "invoke", "(Lcom/avito/android/location_picker/entities/LocationPickerState;)LvW/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.view.n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31592n extends kotlin.jvm.internal.N implements Y41.l<LocationPickerState, vW.j> {

    /* renamed from: l, reason: collision with root package name */
    public static final C31592n f182657l = new C31592n();

    public C31592n() {
        super(1);
    }

    @Override // Y41.l
    public final vW.j invoke(LocationPickerState locationPickerState) {
        LocationPickerState locationPickerState2 = locationPickerState;
        LocationPickerErrors locationPickerErrors = locationPickerState2.f182369n;
        if (locationPickerErrors.f182346c) {
            return vW.m.f440809a;
        }
        if (locationPickerErrors.f182349f) {
            return vW.q.f440813a;
        }
        if (locationPickerErrors.f182350g) {
            return vW.i.f440806a;
        }
        if (locationPickerErrors.f182351h) {
            return vW.r.f440814a;
        }
        if (locationPickerErrors.f182352i) {
            return vW.o.f440811a;
        }
        if (locationPickerErrors.f182353j) {
            return vW.h.f440805a;
        }
        if (locationPickerErrors.f182345b) {
            return vW.l.f440808a;
        }
        String str = locationPickerErrors.f182347d;
        if (str != null && !locationPickerState2.f182366k) {
            return new vW.k(str);
        }
        String str2 = locationPickerErrors.f182348e;
        return str2 != null ? new vW.k(str2) : locationPickerErrors.f182354k ? C49273c.f440798a : locationPickerErrors.f182355l ? vW.d.f440799a : locationPickerErrors.f182356m ? vW.n.f440810a : vW.p.f440812a;
    }
}
